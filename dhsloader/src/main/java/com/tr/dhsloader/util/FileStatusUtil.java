package com.tr.dhsloader.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tr.dhsloader.constants.IDHSLoaderConstants;

@Component
public class FileStatusUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(FileStatusUtil.class);

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
		String reportDate = df.format(today);
		return reportDate;
	}

	/**
	 * This API read status file
	 * 
	 * @param statusFileName
	 * @return
	 * @throws Exception
	 */
	public String readStatus(String statusFileName) throws Exception {
		LOGGER.info("Status file check started..");
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
			LOGGER.info("Previous file processed is {}", lastline);
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
		LOGGER.info("Status file check Completed..");
		return null;

	}

	/**
	 * This API file writes status
	 * 
	 * @param firstLine
	 */
	public void writeStatus(String firstLine) {
		try {
			String date = buildCurrentDate();
			FileWriter fw = new FileWriter("C:\\temp\\myfile.txt", true);
			fw.write(date + "=" + firstLine + "\n");
			fw.close();
		} catch (IOException e) {
		}
		LOGGER.info("File processed and wrote into status file..");
	}

	/**
	 * This API move File To ProcessedFolder
	 * 
	 * @param sourcePath
	 * @throws Exception
	 */
	public void moveFileToProcessedFolder(String sourcePath) throws Exception {
		String fileName = "";

		if (StringUtils.isNotBlank(sourcePath)) {
			fileName = FilenameUtils.getName(sourcePath);
		}

		String targetPath = ftputil.getProcessedPath() + "/" + fileName;

		if (StringUtils.isNotBlank(sourcePath) && StringUtils.isNotBlank(targetPath)) {

			Path movefrom = FileSystems.getDefault().getPath(sourcePath);
			Path target = FileSystems.getDefault().getPath(targetPath);

			// File moved from one location to another location
			Files.move(movefrom, target, StandardCopyOption.REPLACE_EXISTING);
		}

		LOGGER.info("File succesfully processed and moved to Processed Folder..");

	}

}
