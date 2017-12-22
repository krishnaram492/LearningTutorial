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

/**
 * @author Ram
 * 
 */
@Configuration
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
public class DBConfiguration {

	@Autowired
	private Environment env;

	/**
	 * 
	 * @return
	 */
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("db.driver"));
		dataSource.setUrl(env.getProperty("db.url"));
		dataSource.setUsername(env.getProperty("db.username"));
		dataSource.setPassword(env.getProperty("db.password"));
		return dataSource;
	}

	/**
	 * 
	 * @return
	 */
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();

		sessionFactory.setDataSource(dataSource());

		sessionFactory.setPackagesToScan(env.getProperty("db.hibernate.packagesToScan"));

		Properties hibernateProperties = new Properties();
		hibernateProperties.put("hibernate.dialect", env.getProperty("db.hibernate.dialect"));
		hibernateProperties.put("hibernate.show_sql", env.getProperty("db.hibernate.show_sql"));
		//hibernateProperties.put("hibernate.hbm2ddl.auto", env.getProperty("db.hibernate.hbm2ddl.auto"));
		//hibernateProperties.put("hibernate.c3p0.testWhileIdle", env.getProperty("db.hibernate.testWhileIdle"));
		//hibernateProperties.put("hibernate.c3p0.validationQuery", env.getProperty("db.hibernate.validationQuery"));

		sessionFactory.setHibernateProperties(hibernateProperties);

		return sessionFactory;
	}

	/**
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
