package com.app.dhsloader.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.dhsloader.constants.IDHSLoaderConstants;
import com.app.dhsloader.model.Dhsidmap;
import com.app.dhsloader.model.XrefDsp;
import com.app.dhsloader.model.XrefXxDsp;

/**
 * @author Ram
 * 
 */
@Repository
public class DHSLoaderDAO extends BaseHibernateDao {

	/**
	 * 
	 * @param xrefXxDsps
	 * @throws Exception
	 */
	@Transactional(value = IDHSLoaderConstants.TRANSACTION_MANAGER, readOnly = false)
	public void saveXrefXxDspDetails(List<XrefXxDsp> xrefXxDsps) throws Exception {
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

	/**
	 * 
	 * @param xrefDsps
	 * @throws Exception
	 */
	@Transactional(value = IDHSLoaderConstants.TRANSACTION_MANAGER, readOnly = false)
	public void saveXrefDspDetails(List<XrefDsp> xrefDsps) throws Exception {
		Session session = getCurrentSession();
		int count = 0;
		for (XrefDsp xrefDsp : xrefDsps) {
			session.save(xrefDsp);
			// batch for 250 rows
			if (count % 250 == 0) {
				session.flush();
				session.clear();
			}
			count++;
		}
	}

	/**
	 * 
	 * @param dhsidmaps
	 * @throws Exception
	 */
	@Transactional(value = IDHSLoaderConstants.TRANSACTION_MANAGER, readOnly = false)
	public void saveDhsidDetails(List<Dhsidmap> dhsidmaps) throws Exception {
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
		Query query = getHQLQuery("select dhsid from XrefDsp where quoteid=:quoteid and ric=:ric");
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
		Query query = getHQLQuery("select max(dhsid) from XrefDsp");
		dhsid = (Long) query.uniqueResult();
		return dhsid;
	}

}
