package com.tr.dhsloader.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StopWatch;

import com.csvreader.CsvReader;
import com.tr.dhsloader.constants.IDHSLoaderConstants;
import com.tr.dhsloader.dao.DHSLoaderDAO;
import com.tr.dhsloader.logging.DHSLogging;
import com.tr.dhsloader.model.Dhsidmap;
import com.tr.dhsloader.model.XrefDsp;
import com.tr.dhsloader.model.XrefHistory;
import com.tr.dhsloader.model.XrefXxDsp;
import com.tr.dhsloader.service.IDHSLoaderService;
import com.tr.dhsloader.util.DHSLoaderUtil;
import com.tr.dhsloader.util.FileStatusUtil;

/**
 * @author Thomson Reuters
 * 
 */
@Service
public class DHSLoaderServiceImpl extends DHSLogging implements IDHSLoaderService {

	final static Logger LOGGER = (Logger) LogManager.getLogger();

	@Autowired
	private DHSLoaderUtil util;

	@Autowired
	private DHSLoaderDAO dao;

	@Autowired
	private FileStatusUtil fileutil;

	/**
	 * This API process file data and saves into DB (Data History Service)
	 */
	@Transactional(value = IDHSLoaderConstants.TRANSACTION_MANAGER, readOnly = false, rollbackFor = Exception.class)
	public boolean processReport(String filePath, int waitCount) throws Exception {

		LOGGER.log(INFORMATIONAL, "File Processing Started..");
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		int batchSize = fileutil.getBatchSize();

		boolean status = false;
		String fileName = "";

		if (StringUtils.isNotBlank(filePath)) {

			File fileLocaion = new File(filePath);

			if (null != fileLocaion && fileLocaion.exists()) {

				CsvReader rows = util.parseInputData(filePath);

				String firstLine = util.getFirstLine(filePath);

				if (StringUtils.isNotBlank(filePath)) {
					fileName = FilenameUtils.getBaseName(filePath);
					fileName = fileName.replace(".1.1", "-DP");
				}

				rows.readHeaders();

				Set<XrefXxDsp> xrefXxDsps = util.buildXrefXxDspData(rows);

				List<String> quotes = util.buildQuote(xrefXxDsps);

				List<byte[]> pairList = util.buildDHSComp(quotes);

				LOGGER.log(INFORMATIONAL, "quotes list is {} ", quotes);

				Map<String, Long> dhsIdMap = dao.getDhsidList(pairList);

				List<Dhsidmap> dhsids = new ArrayList<Dhsidmap>();

				util.buildDhsIdMap(xrefXxDsps, dhsIdMap, dhsids, fileName);

				Set<XrefDsp> xrefDsps = util.buildXrefDsp(xrefXxDsps, dhsIdMap);

				LOGGER.log(INFORMATIONAL, "xrefXxDsps size is {} ", xrefXxDsps.size());

				LOGGER.log(INFORMATIONAL, "quotes list size is {} ", quotes.size());

				LOGGER.log(INFORMATIONAL, "Dhsidmap list size is {} ", dhsids.size());

				LOGGER.log(INFORMATIONAL, "xrefDsps size is {} ", xrefDsps.size());

				CsvReader csvReaderData = util.parseInputData(filePath);

				Set<XrefHistory> xrefhist = util.buildXrefHistory(csvReaderData, dhsIdMap, fileName);

				LOGGER.log(INFORMATIONAL, "Xref history list size is {} ", xrefhist.size());

				// saveDhsidDetails
				if (null != dhsids && dhsids.size() > 0) {
					dao.saveDhsidDetails(dhsids, batchSize);
					LOGGER.log(INFORMATIONAL, "Saving list of dhsids..");
				}

				// saveXrefXxDspDetails
				if (null != xrefXxDsps && xrefXxDsps.size() > 0) {
					dao.saveXrefXxDspDetails(xrefXxDsps, batchSize);
					LOGGER.log(INFORMATIONAL, "Saving list of xrefXxDsps..");
				}

				// saveXrefDspDetails
				if (null != xrefDsps && xrefDsps.size() > 0) {
					dao.saveXrefDspDetails(xrefDsps, batchSize);
					LOGGER.log(INFORMATIONAL, "Saving list of xrefDsps..");
				}

				// saveXrefHist
				if (null != xrefhist && xrefhist.size() > 0) {
					dao.saveXrefHist(xrefhist, batchSize);
					LOGGER.log(INFORMATIONAL, "Saving list of xrefHistory..");
				}

				rows.close();

				if (StringUtils.isNotBlank(firstLine))
					fileutil.writeStatus(firstLine);

				fileutil.moveFileToProcessedFolder(filePath);

				stopWatch.stop();

				status = true;

				waitCount = 0; // for to resume wait count

				LOGGER.log(INFORMATIONAL, "Total time taken for processReport api is {} {}",
						stopWatch.getTotalTimeSeconds(), " secs.");
			} else {

				LOGGER.log(INFORMATIONAL, "File is still not loaded. This service will resume in another 10 mins..");

				if (waitCount == 3) {
					LOGGER.log(CRITICAL, "Arrival file not exist.");
					throw new Exception("Arrival file not exist.");
				}
			}
		} else {
			LOGGER.log(CRITICAL, "Error While loading Arival file path.");
			throw new Exception("Error While loading Arival file path.");
		}
		LOGGER.log(INFORMATIONAL, "File Processing Ended..");

		return status;
	}

}
