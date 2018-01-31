package com.tr.dhsloader.app;

import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

import com.tr.dhsloader.constants.IDHSLoaderConstants;
import com.tr.dhsloader.ingester.FTPIngester;
import com.tr.dhsloader.logging.DHSLogging;
import com.tr.dhsloader.service.IDHSLoaderService;
import com.tr.dhsloader.util.FTPUtil;
import com.tr.dhsloader.util.FileStatusUtil;

@SpringBootApplication
@ComponentScan({ "com.tr.dhsloader" })
public class DHSRunner extends DHSLogging implements CommandLineRunner {

	@Autowired
	private FTPIngester ingester;

	@Autowired
	private IDHSLoaderService service;

	@Autowired
	private FTPUtil ftpUtil;

	@Autowired
	private FileStatusUtil fileutil;

	final static Logger LOGGER = (Logger) LogManager.getLogger();

	public static void main(String[] args) throws Exception {
		SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder();
		applicationBuilder.sources(DHSRunner.class);
		applicationBuilder.web(false);

		Properties properties = new Properties();
		properties.put(IDHSLoaderConstants.HOST_NAME, InetAddress.getLocalHost().getHostName());
		properties.put(IDHSLoaderConstants.PROCESS_ID, ManagementFactory.getRuntimeMXBean().getName().split("@")[0]);
		applicationBuilder.properties(properties);

		applicationBuilder.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.log(INFORMATIONAL, "Main APP Started");

		DHSLoaderApp loaderApp = new DHSLoaderApp(service, ftpUtil, fileutil);
		DHSFTPRunnerApp ftpApp = new DHSFTPRunnerApp(ingester);

		Thread thread1 = new Thread(ftpApp);
		Thread thread2 = new Thread(loaderApp);

		thread1.start();
		thread2.start();
		
		LOGGER.log(INFORMATIONAL, "Main APP Ended");
	}
}
