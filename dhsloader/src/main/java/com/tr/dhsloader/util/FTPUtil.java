package com.tr.dhsloader.util;

import java.io.File;
import java.util.Calendar;
import java.util.TimeZone;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.tr.dhsloader.constants.IDHSLoaderConstants;

@Component
@PropertySource(IDHSLoaderConstants.CLASSPATH_FTPCONFIG_PROPERTIES)
public class FTPUtil {

	@Autowired
	private Environment env;

	/**
	 * 
	 * @return
	 */
	public String buildFtpUrl() {

		String ftpUrl = env.getProperty(IDHSLoaderConstants.FTP_URL);
		String host = env.getProperty(IDHSLoaderConstants.FTP_HOST);
		String username = env.getProperty(IDHSLoaderConstants.FTP_USERNAME);
		String password = env.getProperty(IDHSLoaderConstants.FTP_PASSWORD);
		String sourcepath = getSourcePath();
		ftpUrl = String.format(ftpUrl, username, password, host, sourcepath);

		return ftpUrl;
	}

	public int getSegment() {
		int x = 0;
		TimeZone timeZone = TimeZone.getTimeZone(IDHSLoaderConstants.GMT);
		Calendar cal = Calendar.getInstance(timeZone);

		int hour = cal.get(Calendar.HOUR);
		int minutes = cal.get(Calendar.MINUTE);

		if (cal.get(Calendar.AM_PM) == 1) {
			x = 12;
		}

		int segment = (((hour + x) * 4) + (minutes / 15)) + 1;
		return segment;
	}

	public String getDate() {

		TimeZone timeZone = TimeZone.getTimeZone(IDHSLoaderConstants.GMT);
		Calendar cal = Calendar.getInstance(timeZone);

		int year = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH) + 1;
		int d = cal.get(Calendar.DAY_OF_MONTH);
		String month = String.format("%02d", m);
		String date = String.format("%02d", d);

		String fullDate = year + "" + month + "" + date;
		return fullDate;
	}

	public String getFileName() {

		String fullDate = getDate();
		int segment = getSegment();
		String fileName = IDHSLoaderConstants.MIFID_REF_296E + fullDate + "." + segment
				+ IDHSLoaderConstants._1_1_TXT_ZIP;

		return fileName;

	}

	public String getSourcePath() {

		String fullDate = getDate();
		int segment = getSegment();
		String fileName = getFileName();
		String sourcepath = IDHSLoaderConstants.BULK_REPORTS + fullDate + "/" + segment + fileName;
		return sourcepath;
	}

	public String getArchivePath(String fileName) {

		String archivepath = env.getProperty(IDHSLoaderConstants.FTP_ARCHIVEPATH) + fileName;
		return archivepath;
	}

	public String getTargetPath() {
		String fileName = getFileName();
		String archivepath = env.getProperty(IDHSLoaderConstants.FTP_ARCHIVEPATH) + fileName;
		return archivepath;
	}

	public String getTargetFilePath() {
		String fileName = getFileName();
		return fileName;
	}

	public String getProcessedPath() {
		String processedpath = env.getProperty(IDHSLoaderConstants.FTP_PROCESSEDPATH);

		if (StringUtils.isNotBlank(processedpath)) {
			File directory = new File(processedpath);
			if (!directory.exists()) {
				directory.mkdir();
			}
		}
		return processedpath;
	}
}
