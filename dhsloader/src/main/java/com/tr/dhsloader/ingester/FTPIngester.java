package com.tr.dhsloader.ingester;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tr.dhsloader.logging.DHSLogging;
import com.tr.dhsloader.util.FTPUtil;

/**
 * @author Thomson Reuters
 * 
 */

@Component
public class FTPIngester extends DHSLogging {

	final static Logger LOGGER = (Logger) LogManager.getLogger();

	@Autowired
	private FTPUtil ftpUtil;

	private static final int BUFFER_SIZE = 4096;

	/**
	 * Download the file from ftp path based on GMT time
	 */
	public void runner() {

		try {
			LOGGER.log(INFORMATIONAL, "FTP App Started..");
			String ftpUrl = ftpUtil.buildFtpUrl();
			String targetPath = ftpUtil.getTargetPath();

			URL url = new URL(ftpUrl);
			URLConnection conn = url.openConnection();
			LOGGER.log(INFORMATIONAL, "Connection is Successful");
			InputStream inputStream = conn.getInputStream();
			FileOutputStream outputStream = new FileOutputStream(targetPath);

			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead = -1;
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, bytesRead);
			}

			outputStream.close();
			inputStream.close();
			LOGGER.log(INFORMATIONAL, "File Downloaded");
		} catch (IOException ex) {
			LOGGER.log(CRITICAL, "FTP file is not found...please try again after some time {}", ex.getMessage());
		}
		LOGGER.log(INFORMATIONAL, "FTP App End..");
	}

}
