package com.tr.dhsloader.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.tr.dhsloader.logging.DHSLogging;

/**
 * @author Ram
 * 
 */
public class BaseHibernateDao extends DHSLogging {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * This method gets current session
	 * 
	 * @return
	 */
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * This method preparing hql query
	 * 
	 * @param hqlQuery
	 * @return
	 */
	public Query getHQLQuery(String hqlQuery) {
		return getCurrentSession().createQuery(hqlQuery);
	}

	/**
	 * This method preparing sql query
	 * 
	 * @param sqlQuery
	 * @return
	 */
	public Query getSQLQuery(String sqlQuery) {
		return getCurrentSession().createSQLQuery(sqlQuery);
	}

	/**
	 * This method prepares named query
	 * 
	 * @param namedQuery
	 * @return
	 */
	public Query getHBMNamedQuery(String namedQuery) {
		return getCurrentSession().getNamedQuery(namedQuery);
	}
	
}
