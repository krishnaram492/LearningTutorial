package com.tr.dhsloader.app;

import java.io.File;

import org.apache.commons.lang3.StringUtils;
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
import com.tr.dhsloader.util.FileStatusUtil;

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
	private FTPUtil ftpUtil;

	@Autowired
	private FTPIngester ingester;

	@Autowired
	private FileStatusUtil fileutil;

	private static final Logger LOGGER = LoggerFactory.getLogger(DHSLoaderApp.class);

	public static void main(String[] args) throws Exception {
		SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder();
		applicationBuilder.sources(DHSLoaderApp.class);
		applicationBuilder.web(false);
		applicationBuilder.run(args);

	}

	@Override
	public void run(String... arg0) throws Exception {

		ingester.run();

		try {
			String fileName = fileutil.readStatus("C:\\temp\\myfile.txt");
			String filePath = "";
			if (StringUtils.isNotBlank(fileName)) {
				filePath = ftpUtil.getArchivePath(fileName);
			} else {
				LOGGER.warn("Status File Not Found");
				filePath = ftpUtil.getTargetPath();
			}
			File f = new File(filePath);
			if (f.exists() && !f.isDirectory()) {
				LOGGER.info("File path is {} ", filePath);
				service.processReport(filePath);
				LOGGER.info("File processing completed");
			}
		} catch (Exception e) {
			LOGGER.error("Exception Occured {}", e.getMessage());
		}
		LOGGER.info("Process end..");
	}

}
