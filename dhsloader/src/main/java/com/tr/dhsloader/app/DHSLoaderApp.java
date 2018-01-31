package com.tr.dhsloader.app;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.tr.dhsloader.logging.DHSLogging;
import com.tr.dhsloader.service.IDHSLoaderService;
import com.tr.dhsloader.util.FTPUtil;
import com.tr.dhsloader.util.FileStatusUtil;

/**
 * @author Thomson Reuters
 * 
 */
public class DHSLoaderApp extends DHSLogging implements Runnable {

	private IDHSLoaderService service;

	private FTPUtil ftpUtil;

	private FileStatusUtil fileutil;

	public DHSLoaderApp(IDHSLoaderService s, FTPUtil ftpu, FileStatusUtil fileu) {
		this.service = s;
		this.ftpUtil = ftpu;
		this.fileutil = fileu;
	}

	final static Logger LOGGER = (Logger) LogManager.getLogger();
	private static int waitCount = 0;

	/**
	 * Based on status file read zip file from archive folder and process the file
	 * and store it to in DB
	 */
	@Override
	public void run() {

		while (true) {
			LOGGER.log(INFORMATIONAL, "Loader Application Started..");
			waitCount = 0;
			try {
				String fileName = fileutil.readStatus(ftpUtil.getStatusPath());
				String filePath = "";
				if (StringUtils.isNotBlank(fileName)) {
					filePath = ftpUtil.getArchivePath(fileName);
				} else {
					LOGGER.log(WARNING, "Status File Not Found");
					filePath = ftpUtil.getTargetPath();
				}
				LOGGER.log(INFORMATIONAL, "File path is {} ", filePath);
				service.processReport(filePath, waitCount);
			} catch (Exception e) {
				LOGGER.error("Exception Occured {}", e);
			}
			LOGGER.log(INFORMATIONAL, " Loader Application ended..");
			waitCount++;

			LOGGER.log(INFORMATIONAL, "Wait for 5 mins to continue next segment...");
//			try {
//				Thread.sleep(5 * 60 * 1000);
//			} catch (InterruptedException e) {
//				LOGGER.log(CRITICAL, "Exception Occured {}", e.getMessage());
//			}
		}
	}

}
