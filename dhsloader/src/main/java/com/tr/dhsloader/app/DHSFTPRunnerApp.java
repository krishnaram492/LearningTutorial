package com.tr.dhsloader.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

import com.tr.dhsloader.ingester.FTPIngester;

/**
 * @author Thomson Reuters
 * 
 */
//@SpringBootApplication
//@ComponentScan({ "com.tr.dhsloader" })
public class DHSFTPRunnerApp implements CommandLineRunner {

	@Autowired
	private FTPIngester ingester;

	private static final Logger LOGGER = LoggerFactory.getLogger(DHSFTPRunnerApp.class);

	public static void main(String[] args) throws Exception {
		SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder();
		applicationBuilder.sources(DHSFTPRunnerApp.class);
		applicationBuilder.web(false);
		applicationBuilder.run(args);

	}

	@Override
	public void run(String... arg0) throws Exception {
		LOGGER.info("FTP File Processing started..");
		ingester.run();
		LOGGER.info("FTP File Processing completed..");
	}
}
