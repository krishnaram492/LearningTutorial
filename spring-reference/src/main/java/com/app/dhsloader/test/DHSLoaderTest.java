package com.app.dhsloader.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.app.dhsloader.service.IDHSLoaderService;

/**
 * @author Ram
 * 
 */
@Component
public class DHSLoaderTest {

	@Autowired
	private IDHSLoaderService service;

	private static final Logger LOGGER = LoggerFactory.getLogger(DHSLoaderTest.class);

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		LOGGER.info("Application loading..........");
		ApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext-Spring.xml");

		DHSLoaderTest test = context.getBean(DHSLoaderTest.class);
		String filePath = "D:\\MIFID.REF.296E.20171211.82.1.1.zip";

		LOGGER.info("File path is {} ", filePath);

		test.invoke(filePath);
	}

	private void invoke(String filePath) throws Exception {
		service.processReport(filePath);
	}

}
