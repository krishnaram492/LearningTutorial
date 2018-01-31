package com.tr.dhsloader.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tr.dhsloader.constants.IDHSLoaderConstants;
import com.tr.dhsloader.model.Dhsidmap;
import com.tr.dhsloader.model.XrefDsp;
import com.tr.dhsloader.model.XrefHistory;
import com.tr.dhsloader.model.XrefXxDsp;
import com.tr.dhsloader.util.DHSLoaderUtil;

/**
 * @author Thomson Reuters
 * 
 */

@Repository
public class DHSLoaderDAO extends BaseHibernateDao {

	final static Logger LOGGER = (Logger) LogManager.getLogger();
	@Autowired
	private DHSLoaderUtil util;

	/**
	 * This API saves list of XrefXxDsp models in sybase
	 * 
	 * @param xrefXxDsps
	 * @throws Exception
	 */
	public void saveXrefXxDspDetails(Set<XrefXxDsp> xrefXxDsps, int batchSize) throws Exception {
		LOGGER.log(INFORMATIONAL, "start :: saveXrefXxDspDetails...");

		LOGGER.log(INFORMATIONAL, "Batch size is {} ", batchSize);
		if (null != xrefXxDsps && xrefXxDsps.size() > 0) {

			Session session = getCurrentSession();
			int count = 0;
			for (XrefXxDsp xrefXxDsp : xrefXxDsps) {
				session.save(xrefXxDsp);
				if (count % batchSize == 0) {
					session.flush();
					session.clear();
				}
				count++;
			}
		}
		LOGGER.log(INFORMATIONAL, "end :: saveXrefXxDspDetails...");
	}

	/**
	 * This API saves list of XrefDsp models in sybase
	 * 
	 * @param xrefDsps
	 * @throws Exception
	 */
	public void saveXrefDspDetails(Set<XrefDsp> xrefDsps, int batchSize) throws Exception {
		LOGGER.log(INFORMATIONAL, "start :: saveXrefDspDetails...");
		LOGGER.log(INFORMATIONAL, "Batch size is {} ", batchSize);
		if (null != xrefDsps && xrefDsps.size() > 0) {

			Session session = getCurrentSession();
			int count = 0;
			for (XrefDsp xrefDsp : xrefDsps) {
				session.saveOrUpdate(xrefDsp);
				if (count % batchSize == 0) {
					session.flush();
					session.clear();
				}
				count++;
			}
		}
		LOGGER.log(INFORMATIONAL, "end :: saveXrefDspDetails...");
	}

	/**
	 * This API saves list of Dhsidmap models in sybase
	 * 
	 * @param dhsidmaps
	 * @throws Exception
	 */
	public void saveDhsidDetails(List<Dhsidmap> dhsidmaps, int batchSize) throws Exception {
		LOGGER.log(INFORMATIONAL, "start :: saveDhsidDetails...");
		LOGGER.log(INFORMATIONAL, "Batch size is {} ", batchSize);
		if (null != dhsidmaps && dhsidmaps.size() > 0) {

			Session session = getCurrentSession();
			int count = 0;
			for (Dhsidmap dhsidmap : dhsidmaps) {
				session.save(dhsidmap);
				if (count % batchSize == 0) {
					session.flush();
					session.clear();
				}
				count++;
			}
		}
		LOGGER.log(INFORMATIONAL, "end :: saveDhsidDetails...");
	}

	/**
	 * This API get max dhsid from dhsidmap table in sybase
	 * 
	 * @return
	 * @throws Exception
	 */
	@Transactional(value = IDHSLoaderConstants.TRANSACTION_MANAGER, readOnly = true, propagation = Propagation.REQUIRES_NEW)
	public Long getMaxDhsid() throws Exception {
		Long dhsid = null;
		Query query = getHQLQuery("select max(dhsid) from Dhsidmap");
		dhsid = (Long) query.uniqueResult();
		return dhsid;
	}

	/**
	 * This API get map data based on list of quotesid
	 * 
	 * @param pairList
	 * @return
	 * @throws Exception
	 */
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

		dhsIdMap = util.buildDHSIdMapByList(dhsids);

		return dhsIdMap;
	}

	/**
	 * This API get map of (col name and colid) dspCplumns table
	 * 
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	@Transactional(value = IDHSLoaderConstants.TRANSACTION_MANAGER, readOnly = true, propagation = Propagation.REQUIRES_NEW)
	public Map<String, Integer> getColIdMap() throws Exception {
		Map<String, Integer> colIdMap = new HashMap<String, Integer>();
		Query query = getSQLQuery(
				"select t1.ReportColumn, t2.colid from dbo.ColumnMapping t1, dbo.dspCplumns t2 where t1.ShortColumn = t2.name and bcpTable = 'XRef_XX_DSP'  order by t1.ReportColumn");
		List<Object[]> objs = query.list();
		if (null != objs) {
			String name = "";
			Integer colid = 0;
			for (Object[] objects : objs) {
				if (objects[0] != null) {
					name = (String) objects[0];
				}
				if (objects[1] != null) {
					colid = Integer.valueOf((short) objects[1]);
				}
				if (StringUtils.isNotBlank(name)) {
					colIdMap.put(name, colid);
				}
			}
		}
		return colIdMap;
	}

	/**
	 * This API saves list of XrefHistory models in sybase
	 * 
	 * @param xrefhist
	 * @throws Exception
	 */
	public void saveXrefHist(Set<XrefHistory> xrefhists, int batchSize) throws Exception {
		LOGGER.log(INFORMATIONAL, "start :: saveXrefHistDetails...");
		LOGGER.log(INFORMATIONAL, "Batch size is {} ", batchSize);
		if (null != xrefhists && xrefhists.size() > 0) {

			Session session = getCurrentSession();
			int count = 0;
			for (XrefHistory xrefhist : xrefhists) {
				session.save(xrefhist);
				// batch for 250 rows
				if (count % batchSize == 0) {
					session.flush();
					session.clear();
				}
				count++;
			}
		}
		LOGGER.log(INFORMATIONAL, "end :: saveXrefHistDetails...");
	}
}
