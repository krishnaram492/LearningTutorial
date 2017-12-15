package com.tr.dhsloader.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tr.dhsloader.service.IDHSLoaderService;

/**
 * @author Ram
 * 
 */
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan({ "com.tr.dhsloader" })
@EntityScan("com.tr.dhsloader")
public class DHSLoaderApp {

	@Autowired
	private IDHSLoaderService service;

	private static final Logger LOGGER = LoggerFactory.getLogger(DHSLoaderApp.class);

	public static void main(String[] args) throws Exception {

		ApplicationContext context = SpringApplication.run(DHSLoaderApp.class, args);

		DHSLoaderApp test = context.getBean(DHSLoaderApp.class);
		String filePath = "D:\\MIFID.REF.296E.20171129.82.1.1.txt.zip";

		LOGGER.info("File path is {} ", filePath);

		test.invoke(filePath);
	}

	private void invoke(String filePath) throws Exception {
		service.processReport(filePath);
	}
}
