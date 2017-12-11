package com.app.dhsloader.dao;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.dhsloader.constants.IDHSLoaderConstants;
import com.app.dhsloader.dto.DHSComp;
import com.app.dhsloader.model.Dhsidmap;
import com.app.dhsloader.model.XrefDsp;
import com.app.dhsloader.model.XrefXxDsp;

/**
 * @author Ram
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
	@Transactional(value = IDHSLoaderConstants.TRANSACTION_MANAGER, readOnly = false)
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
	@Transactional(value = IDHSLoaderConstants.TRANSACTION_MANAGER, readOnly = false)
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
	@Transactional(value = IDHSLoaderConstants.TRANSACTION_MANAGER, readOnly = false)
	public void saveDhsidDetails(List<Dhsidmap> dhsidmaps) throws Exception {
		LOGGER.info("start :: saveDhsidDetails...");
		if (null != dhsidmaps && dhsidmaps.size() > 0) {
			
			Session session = getCurrentSession();
			int count = 0;
			for (Dhsidmap dhsidmap : dhsidmaps) {
				session.save(dhsidmap);
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

	/**
	 * 
	 * @param quoteid
	 * @param ric
	 * @return
	 * @throws Exception
	 */
	@Transactional(value = IDHSLoaderConstants.TRANSACTION_MANAGER, readOnly = true)
	public Long getDhsidByRicNQuoteId(String quoteid, String ric) throws Exception {
		Long dhsid = null;
		Query query = getHQLQuery("select dhsid from Dhsidmap where quoteid=:quoteid and ric=:ric");
		query.setParameter("quoteid", quoteid);
		query.setParameter("ric", ric);
		dhsid = (Long) query.uniqueResult();
		return dhsid;
	}

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	@Transactional(value = IDHSLoaderConstants.TRANSACTION_MANAGER, readOnly = true)
	public Long getMaxDhsid() throws Exception {
		Long dhsid = null;
		Query query = getHQLQuery("select max(dhsid) from Dhsidmap");
		dhsid = (Long) query.uniqueResult();
		return dhsid;
	}

	@SuppressWarnings("unchecked")
	@Transactional(value = IDHSLoaderConstants.TRANSACTION_MANAGER, readOnly = true)
	public Map<DHSComp, Long> getDhsidList(List<String> values) throws Exception {
		Map<DHSComp, Long> dhsIdMap = new HashMap<DHSComp, Long>();
		List<Object[]> dhsids = null;
		Query query = getSQLQuery("select DHSID, RIC, QUOTEID FROM DHSIDMAP WHERE CONCAT(QUOTEID, RIC) in (:values)");
		query.setParameterList("values", values);
		dhsids = query.list();

		if (null != dhsids && dhsids.size() > 0) {

			for (Object[] objs : dhsids) {
				long dhsid = 0;
				String ric = "";
				String quoteid = "";

				if (null != objs[0]) {
					dhsid = ((BigDecimal) objs[0]).longValue();
				}
				if (null != objs[1]) {
					ric = (String) objs[1];
				}
				if (null != objs[2]) {
					quoteid = (String) objs[2];
				}

				if (StringUtils.isNotBlank(ric) && StringUtils.isNotBlank(quoteid)) {
					dhsIdMap.put(new DHSComp(quoteid, ric), dhsid);
				}
			}
		}

		return dhsIdMap;
	}
}
