package com.tr.dhsloader.ingester;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tr.dhsloader.util.FTPUtil;

/**
 * @author Thomson Reuters
 * 
 */

@Component
public class FTPIngester {

	private static final Logger LOGGER = LoggerFactory.getLogger(FTPIngester.class);

	@Autowired
	private FTPUtil ftpUtil;

	private static final int BUFFER_SIZE = 4096;

	public void run() {

		try {
			LOGGER.info("FTP App Started..");
			String ftpUrl = ftpUtil.buildFtpUrl();
			String targetPath = ftpUtil.getTargetPath();

			URL url = new URL(ftpUrl);
			URLConnection conn = url.openConnection();
			LOGGER.info("Connection is Successful");
			InputStream inputStream = conn.getInputStream();
			FileOutputStream outputStream = new FileOutputStream(targetPath);

			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead = -1;
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, bytesRead);
			}

			outputStream.close();
			inputStream.close();
			LOGGER.info("File Downloaded");
		} catch (IOException ex) {
			LOGGER.error("FTP file is not found...please try again after some time {}", ex.getMessage());
		}
		LOGGER.info("FTP App End..");
	}

}
