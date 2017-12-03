package com.app.dhsloader.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.dhsloader.model.XrefXxDsp;

@Repository
public class DHSLoaderDAO extends BaseHibernateDao {

	@Transactional(value = "transactionManagerForOracle")
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
}
