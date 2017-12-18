package com.tr.dhsloader.ingester;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:ftpconfig.properties")
public class FTPIngester extends Thread {

	private static final Logger LOGGER = LoggerFactory.getLogger(FTPIngester.class);

	@Autowired
	private Environment env;

	private static final int BUFFER_SIZE = 4096;

	@Override
	public void run() {

		try {

			String ftpUrl = env.getProperty("ftp.url");
			String host = env.getProperty("ftp.host");
			String username = env.getProperty("ftp.username");
			String password = env.getProperty("ftp.password");
			String sourcepath = env.getProperty("ftp.sourcepath");
			String targetpath = env.getProperty("ftp.targetpath");

			ftpUrl = String.format(ftpUrl, username, password, host, sourcepath);

			URL url = new URL(ftpUrl);
			URLConnection conn = url.openConnection();
			LOGGER.info("Connection is Successful");
			InputStream inputStream = conn.getInputStream();

			FileOutputStream outputStream = new FileOutputStream(targetpath);

			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead = -1;
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, bytesRead);
			}

			outputStream.close();
			inputStream.close();
			LOGGER.info("File Downloaded");
			System.out.println("File downloaded");
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
