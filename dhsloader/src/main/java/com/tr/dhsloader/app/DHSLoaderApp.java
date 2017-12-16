package com.tr.dhsloader.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

import com.tr.dhsloader.service.IDHSLoaderService;

/**
 * @author Ram
 * 
 */
@SpringBootApplication
@ComponentScan({ "com.tr.dhsloader" })
public class DHSLoaderApp implements CommandLineRunner {

	@Autowired
	private IDHSLoaderService service;

	private static final Logger LOGGER = LoggerFactory.getLogger(DHSLoaderApp.class);

	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder();
		applicationBuilder.sources(DHSLoaderApp.class);
		applicationBuilder.web(false);
		applicationBuilder.run(args);

	}

	/**
	 * 
	 */
	@Override
	public void run(String... arg0) throws Exception {
		String filePath = "D:\\MIFID.REF.296E.20171129.82.1.1.txt.zip";
		LOGGER.info("File path is {} ", filePath);
		service.processReport(filePath);
		LOGGER.info("Process end..");
	}
}
