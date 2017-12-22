package com.tr.dhsloader.app;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

import com.tr.dhsloader.ingester.FTPIngester;
import com.tr.dhsloader.service.IDHSLoaderService;
import com.tr.dhsloader.util.FTPUtil;

/**
 * @author Thomson Reuters
 * 
 */
@SpringBootApplication
@ComponentScan({ "com.tr.dhsloader" })
public class DHSLoaderApp implements CommandLineRunner {

	@Autowired
	private IDHSLoaderService service;

	@Autowired
	private FTPIngester ingester;
	
	@Autowired
	private FTPUtil ftpUtil;

	private static final Logger LOGGER = LoggerFactory.getLogger(DHSLoaderApp.class);

	public static void main(String[] args) throws Exception {
		SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder();
		applicationBuilder.sources(DHSLoaderApp.class);
		applicationBuilder.web(false);
		applicationBuilder.run(args);

	}


	@Override
	public void run(String... arg0) throws Exception {

//		ingester.start();
//		Thread.sleep(1000);
		//String filePath = ftpUtil.getTargetPath();
		String filePath = "C:\\Users\\uc236297\\Desktop\\DHS loader\\Extract\\MIFID.REF.296E.20171218.15.1.1.txt.zip";
		File f = new File(filePath);
		if (f.exists() && !f.isDirectory()) {
			LOGGER.info("File path is {} ", filePath);
			service.processReport(filePath);
			LOGGER.info("File processing completed");
		}
		LOGGER.info("Process end..");
	}
}
