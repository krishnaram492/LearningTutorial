package com.tr.dhsloader.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StopWatch;

import com.csvreader.CsvReader;
import com.tr.dhsloader.constants.IDHSLoaderConstants;
import com.tr.dhsloader.dao.DHSLoaderDAO;
import com.tr.dhsloader.model.Dhsidmap;
import com.tr.dhsloader.model.XrefDsp;
import com.tr.dhsloader.model.XrefXxDsp;
import com.tr.dhsloader.service.IDHSLoaderService;
import com.tr.dhsloader.util.DHSLoaderUtil;
import com.tr.dhsloader.util.FileStatusUtil;

/**
 * @author Thomson Reuters
 * 
 */
@Service
public class DHSLoaderServiceImpl extends Thread implements IDHSLoaderService {

	private static final Logger LOGGER = LoggerFactory.getLogger(DHSLoaderServiceImpl.class);

	@Autowired
	private DHSLoaderUtil util;

	@Autowired
	private DHSLoaderDAO dao;

	@Autowired
	private FileStatusUtil fileutil;
	
	/**
	 * This API process file data and saves into DB
	 */
	@Transactional(value = IDHSLoaderConstants.TRANSACTION_MANAGER, readOnly = false, rollbackFor = Exception.class)
	public boolean processReport(String filePath) throws Exception {
		
		LOGGER.info("File Processing Started..");
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		boolean status = false;
		String fileName = "";

		String firstLine = util.getFirstLine(filePath);

		CsvReader rows = util.parseInputData(filePath);

		if (StringUtils.isNotBlank(filePath)) {
			fileName = FilenameUtils.getBaseName(filePath);
			fileName = fileName.replace(".1.1", "-DP");
		}

		rows.readHeaders();

		List<XrefXxDsp> xrefXxDsps = util.buildXrefXxDspData(rows);

		List<String> quotes = util.buildQuote(xrefXxDsps);
		
		LOGGER.info("quotes are {} ", quotes);

		List<byte[]> pairList = util.buildDHSComp(quotes);

		Map<String, Long> dhsIdMap = dao.getDhsidList(pairList);

		List<Dhsidmap> dhsids = new ArrayList<Dhsidmap>();

		util.buildDhsIdMap(xrefXxDsps, dhsIdMap, dhsids, fileName);

		List<XrefDsp> xrefDsps = util.buildXrefDsp(xrefXxDsps, dhsIdMap);

		// List<XrefHistory> xrefhist = util.buildXrefHistory(rows, dhsIdMap, fileName);

		LOGGER.info("xrefXxDsps size is {} ", xrefXxDsps.size());

		LOGGER.info("xrefDsps size is {} ", xrefDsps.size());

		LOGGER.info("Dhsidmap list size is {} ", dhsids.size());

		if (null != xrefXxDsps && xrefXxDsps.size() > 0) {
			dao.saveXrefXxDspDetails(xrefXxDsps);
			LOGGER.info("Saving list of xrefXxDsps..");
		}

		if (null != dhsids && dhsids.size() > 0) {
			dao.saveDhsidDetails(dhsids);
			LOGGER.info("Saving list of dhsids..");
		}

		if (null != xrefDsps && xrefDsps.size() > 0) {
			dao.saveXrefDspDetails(xrefDsps);
			LOGGER.info("Saving list of xrefDsps..");
		}

		rows.close();

		if (StringUtils.isNotBlank(firstLine))
			fileutil.writeStatus(firstLine);

		fileutil.moveFileToProcessedFolder(filePath);

		stopWatch.stop();

		LOGGER.info("Total time taken for processReport api is {} {}", stopWatch.getTotalTimeSeconds(), " secs.");
		
		LOGGER.info("File Processing Ended..");

		return status;
	}

}
