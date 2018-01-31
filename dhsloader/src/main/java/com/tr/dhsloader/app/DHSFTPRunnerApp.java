package com.tr.dhsloader.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.tr.dhsloader.ingester.FTPIngester;
import com.tr.dhsloader.logging.DHSLogging;

/**
 * @author Thomson Reuters
 * 
 */

public class DHSFTPRunnerApp extends DHSLogging implements Runnable {

	final static Logger LOGGER = (Logger) LogManager.getLogger();
	private FTPIngester ingester;

	public DHSFTPRunnerApp(FTPIngester in) {
		this.ingester = in;
	}

	@Override
	public void run() {
		while (true) {
			LOGGER.log(INFORMATIONAL, "DHSFTPRunnerApp Process started..");
			try {
				ingester.runner();
			} catch (Exception e) {
				LOGGER.log(CRITICAL, "Exception Occured {}", e);
			}
			LOGGER.log(INFORMATIONAL, "DHSFTPRunnerApp Process completed..");
			try {
				LOGGER.log(INFORMATIONAL, "Wait for 10 mins to download next segment file..");
				Thread.sleep(1000 * 60 * 10);
			} catch (InterruptedException e) {
				LOGGER.log(CRITICAL, "Exception Occured {}", e.getMessage());
			}
		}
	}
}
