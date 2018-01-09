package com.tr.dhsloader.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.tr.dhsloader.constants.IDHSLoaderConstants;

/**
 * @author Thomson Reuters
 * 
 */
@Configuration
@EnableTransactionManagement
@PropertySource(IDHSLoaderConstants.CLASSPATH_DB_PROPERTIES)
public class DBConfiguration {

	
	@Autowired
	private Environment env;

	/**
	 * It builds sybase data source
	 * 
	 * @return
	 */
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty(IDHSLoaderConstants.DB_DRIVER));
		dataSource.setUrl(env.getProperty(IDHSLoaderConstants.DB_URL));
		dataSource.setUsername(env.getProperty(IDHSLoaderConstants.DB_USERNAME));
		dataSource.setPassword(env.getProperty(IDHSLoaderConstants.DB_PASSWORD));
		return dataSource;
	}

	/**
	 * It builds sysbase sessionFactory based on data source
	 * 
	 * @return
	 */
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();

		sessionFactory.setDataSource(dataSource());

		sessionFactory.setPackagesToScan(env
				.getProperty(IDHSLoaderConstants.DB_HIBERNATE_PACKAGES_TO_SCAN));

		Properties hibernateProperties = new Properties();
		hibernateProperties.put(IDHSLoaderConstants.HIBERNATE_DIALECT,
				env.getProperty(IDHSLoaderConstants.DB_HIBERNATE_DIALECT));
		hibernateProperties.put(IDHSLoaderConstants.HIBERNATE_SHOW_SQL,
				env.getProperty(IDHSLoaderConstants.DB_HIBERNATE_SHOW_SQL));
		sessionFactory.setHibernateProperties(hibernateProperties);

		return sessionFactory;
	}

	/**
	 * It creates transaction manager
	 * 
	 * @return
	 */
	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;
	}

}
