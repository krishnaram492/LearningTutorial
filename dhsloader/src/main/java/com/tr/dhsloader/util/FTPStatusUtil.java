package com.tr.dhsloader.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.tr.dhsloader.constants.IDHSLoaderConstants;
import com.tr.dhsloader.logging.DHSLogging;

public class FTPStatusUtil extends DHSLogging {

	final static Logger LOGGER = (Logger) LogManager.getLogger();

	@Autowired
	private FTPUtil ftputil;

	/**
	 * This API build CurrentDate
	 * 
	 * @return
	 */
	public String buildCurrentDate() {
		SimpleDateFormat df = new SimpleDateFormat(IDHSLoaderConstants.DATE_FORMAT);
		Date today = Calendar.getInstance().getTime();
		df.setTimeZone(TimeZone.getTimeZone("GMT"));
		String reportDate = df.format(today);
		return reportDate;
	}

	/**
	 * This API read FTP status file for last downloaded file
	 * 
	 * @param statusFileName
	 * @return
	 * @throws Exception
	 */
	public String readFTPStatus(String statusFileName) throws Exception {
		LOGGER.log(INFORMATIONAL, "FTP Status file check started..");
		File f = new File(statusFileName);
		if (f.exists() && !f.isDirectory()) {
			FileInputStream fis = new FileInputStream(statusFileName);// "C:\\temp\\myfile.txt"
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			String line = "";
			String lastline = "";
			while ((line = br.readLine()) != null) {
				if (line != null && line != "")
					lastline = line;
			}
			LOGGER.log(INFORMATIONAL, "Previous file downloaded is {}", lastline);
			if (StringUtils.isNotBlank(lastline)) {
				int len = lastline.length();
				String val = lastline.substring(len - 12, len - 1);
				String[] strs = val.split("\\|");
				String fullDate = strs[0];
				int segment = Integer.valueOf(strs[1]);
				String fileName = "";
				if (segment == 96) {
					fullDate = ftputil.getDate();
					fileName = IDHSLoaderConstants.MIFID_REF_296E + fullDate + "." + 1 + IDHSLoaderConstants._1_1_TXT_ZIP;
				} else {
					fileName = IDHSLoaderConstants.MIFID_REF_296E + fullDate + "." + (segment + 1) + IDHSLoaderConstants._1_1_TXT_ZIP;
				}
				return fileName;
			} else {
				return ftputil.getTargetFilePath();
			}
		}
		LOGGER.log(INFORMATIONAL, "FTP Status file check Completed..");
		return null;

	}

	/**
	 * This API file writes downloade file to FTP status file
	 * 
	 * @param fileName
	 */
	public void writeStatus(String fileName) {
		try {
			String date = buildCurrentDate();
			FileWriter fw = new FileWriter("C:\\temp\\myfile.txt", true);
			fw.write(date + "=" + fileName + "\n");
			fw.close();
		} catch (IOException e) {
		}
		LOGGER.log(INFORMATIONAL, "File downloaded and wrote into FTP status file..");
	}

}
