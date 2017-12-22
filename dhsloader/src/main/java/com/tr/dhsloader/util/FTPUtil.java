package com.tr.dhsloader.util;

import java.util.Calendar;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:ftpconfig.properties")
public class FTPUtil {

	@Autowired
	private Environment env;

	public String buildFtpUrl() {

		String ftpUrl = env.getProperty("ftp.url");
		String host = env.getProperty("ftp.host");
		String username = env.getProperty("ftp.username");
		String password = env.getProperty("ftp.password");
		String sourcepath = getSourcePath();
		ftpUrl = String.format(ftpUrl, username, password, host, sourcepath);

		return ftpUrl;
	}

	public int getSegment() {
		int x = 0;
		TimeZone timeZone = TimeZone.getTimeZone("GMT");
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

		TimeZone timeZone = TimeZone.getTimeZone("GMT");
		Calendar cal = Calendar.getInstance(timeZone);

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DAY_OF_MONTH);

		String fullDate = year + "" + month + "" + date;
		return fullDate;
	}

	public String getFileName() {

		String fullDate = getDate();
		int segment = getSegment();
		String fileName = "/MIFID.REF.296E." + fullDate + "." + segment + ".1.1.txt.zip";

		return fileName;

	}

	public String getSourcePath() {

		String fullDate = getDate();
		int segment = getSegment();
		String fileName = getFileName();
		String sourcepath = "Bulk_Reports/" + fullDate + "/" + segment + fileName;
		return sourcepath;
	}

	public String getTargetPath() {

		String fileName = getFileName();
		String targetpath = env.getProperty("ftp.targetpath") + fileName;
		return targetpath;
	}
}
