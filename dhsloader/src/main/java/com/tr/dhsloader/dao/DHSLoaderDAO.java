package com.tr.dhsloader.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tr.dhsloader.constants.IDHSLoaderConstants;
import com.tr.dhsloader.model.Dhsidmap;
import com.tr.dhsloader.model.XrefDsp;
import com.tr.dhsloader.model.XrefXxDsp;

/**
 * @author Thomson Reuters
 * 
 */

@Repository
public class DHSLoaderDAO extends BaseHibernateDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(DHSLoaderDAO.class);

	/**
	 * 
	 * @param xrefXxDsps
	 * @throws Exception
	 */
	public void saveXrefXxDspDetails(List<XrefXxDsp> xrefXxDsps) throws Exception {
		LOGGER.info("start :: saveXrefXxDspDetails...");
		if (null != xrefXxDsps && xrefXxDsps.size() > 0) {

			Session session = getCurrentSession();
			int count = 0;
			for (XrefXxDsp xrefXxDsp : xrefXxDsps) {
				session.save(xrefXxDsp);
				// batch for 250 rows
				if (count % 250 == 0) {
					session.flush();
					session.clear();
				}
				count++;
			}
		}
		LOGGER.info("end :: saveXrefXxDspDetails...");
	}

	/**
	 * 
	 * @param xrefDsps
	 * @throws Exception
	 */
	public void saveXrefDspDetails(List<XrefDsp> xrefDsps) throws Exception {
		LOGGER.info("start :: saveXrefDspDetails...");
		if (null != xrefDsps && xrefDsps.size() > 0) {

			Session session = getCurrentSession();
			int count = 0;
			for (XrefDsp xrefDsp : xrefDsps) {
				session.saveOrUpdate(xrefDsp);
				// batch for 250 rows
				if (count % 250 == 0) {
					session.flush();
					session.clear();
				}
				count++;
			}
		}
		LOGGER.info("end :: saveXrefDspDetails...");
	}

	/**
	 * 
	 * @param dhsidmaps
	 * @throws Exception
	 */
	public void saveDhsidDetails(List<Dhsidmap> dhsidmaps) throws Exception {
		LOGGER.info("start :: saveDhsidDetails...");
		if (null != dhsidmaps && dhsidmaps.size() > 0) {

			Session session = getCurrentSession();
			int count = 0;
			for (Dhsidmap dhsidmap : dhsidmaps) {
				session.saveOrUpdate(dhsidmap);
				// batch for 250 rows
				if (count % 250 == 0) {
					session.flush();
					session.clear();
				}
				count++;
			}
		}
		LOGGER.info("end :: saveDhsidDetails...");
	}

	@Transactional(value = IDHSLoaderConstants.TRANSACTION_MANAGER, readOnly = true, propagation = Propagation.REQUIRES_NEW)
	public Long getMaxDhsid() throws Exception {
		Long dhsid = null;
		Query query = getHQLQuery("select max(dhsid) from Dhsidmap");
		dhsid = (Long) query.uniqueResult();
		return dhsid;
	}

	@SuppressWarnings("unchecked")
	@Transactional(value = IDHSLoaderConstants.TRANSACTION_MANAGER, readOnly = true, propagation = Propagation.REQUIRES_NEW)
	public Map<String, Long> getDhsidList(List<byte[]> pairList) throws Exception {
		Map<String, Long> dhsIdMap = new HashMap<String, Long>();
		List<Object[]> dhsids = new ArrayList<Object[]>();
		int i = 0;
		if (null != pairList && pairList.size() > 0) {
			while (pairList.size() > i) {
				int x = i + 300;
				Query query = getSQLQuery("select dhsID, quoteID FROM DhsIdMap1 WHERE quoteID in (:values)");
				if (pairList.size() > x) {
					query.setParameterList("values", pairList.subList(i, x));
				} else {
					int count = pairList.size();
					query.setParameterList("values", pairList.subList(i, count));
				}
				List<Object[]> objs = query.list();
				i = x;
				dhsids.addAll(objs);
			}
		}

		if (null != dhsids && dhsids.size() > 0) {

			for (Object[] objs : dhsids) {
				long dhsid = 0;
				byte[] quoteid = null;

				if (null != objs[0]) {
					dhsid = ((BigDecimal) objs[0]).longValue();
				}
				if (null != objs[1]) {
					quoteid = (byte[]) objs[1];
				}

				if (quoteid != null) {
					dhsIdMap.put(Hex.encodeHexString(quoteid), dhsid);
				}
			}
		}

		return dhsIdMap;
	}

	@Transactional(value = IDHSLoaderConstants.TRANSACTION_MANAGER, readOnly = true, propagation = Propagation.REQUIRES_NEW)
	public Map<String, Integer> getColIdMap() throws Exception {
		Map<String, Integer> colIdMap = new HashMap<String, Integer>();
		Query query = getSQLQuery("select name, colid FROM dspCplumns");
		List<Object[]> objs = query.list();
		String name = "";
		Integer colid = 0;
		for (Object[] objects : objs) {
			if (objects[0] != null) {
				name = (String) objects[0];
			}
			if (objects[1] != null) {
				colid = Integer.valueOf((String) objects[1]);
			}
			if (StringUtils.isNotBlank(name)) {
				colIdMap.put(name, colid);
			}
		}
		return colIdMap;
	}
}
