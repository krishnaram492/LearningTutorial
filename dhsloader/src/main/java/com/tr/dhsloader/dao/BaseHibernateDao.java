package com.tr.dhsloader.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Ram
 * 
 */
public class BaseHibernateDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public Query getHQLQuery(String hqlQuery) {
		return getCurrentSession().createQuery(hqlQuery);
	}

	public Query getSQLQuery(String sqlQuery) {
		return getCurrentSession().createSQLQuery(sqlQuery);
	}

	public Query getHBMNamedQuery(String namedQuery) {
		return getCurrentSession().getNamedQuery(namedQuery);
	}

}
