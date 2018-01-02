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

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileStatusUtil {

	@Autowired
	private FTPUtil ftputil;

	public String buildCurrentDate() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date today = Calendar.getInstance().getTime();
		String reportDate = df.format(today);
		return reportDate;
	}

	public String readStatus(String statusFileName) throws Exception {
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
			System.out.println(lastline);

			if (StringUtils.isNotBlank(lastline)) {
				int len = lastline.length();
				String val = lastline.substring(len - 11, len - 1);
				String[] strs = val.split("\\|");
				String fullDate = strs[0];
				int segment = Integer.valueOf(strs[1]);
				String fileName = "";
				if (segment == 96) {
					fullDate = ftputil.getDate();
					fileName = "/MIFID.REF.296E." + fullDate + "." + 1 + ".1.1.txt.zip";
				} else {
					fileName = "/MIFID.REF.296E." + fullDate + "." + (segment + 1) + ".1.1.txt.zip";
				}
				return fileName;
			} else {
				return ftputil.getTargetFilePath();
			}
		}
		return null;

	}

	public void writeStatus(String firstLine) {
		try {
			String date = buildCurrentDate();
			FileWriter fw = new FileWriter("C:\\temp\\myfile.txt", true);
			fw.write(date + "=" + firstLine + "\n");
			fw.close();
		} catch (IOException e) {
		}
	}
}
