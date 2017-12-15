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
import org.springframework.util.StopWatch;

import com.csvreader.CsvReader;
import com.tr.dhsloader.dao.DHSLoaderDAO;
import com.tr.dhsloader.dto.DHSComp;
import com.tr.dhsloader.model.Dhsidmap;
import com.tr.dhsloader.model.XrefDsp;
import com.tr.dhsloader.model.XrefXxDsp;
import com.tr.dhsloader.service.IDHSLoaderService;
import com.tr.dhsloader.util.DHSLoaderUtil;

/**
 * @author Ram
 * 
 */
@Service
public class DHSLoaderServiceImpl implements IDHSLoaderService {

	private static final Logger LOGGER = LoggerFactory.getLogger(DHSLoaderServiceImpl.class);

	@Autowired
	private DHSLoaderUtil util;

	@Autowired
	private DHSLoaderDAO dao;

	public boolean processReport(String filePath) throws Exception {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		boolean status = false;
		String fileName = "";

		CsvReader rows = util.parseInputData(filePath);

		if (StringUtils.isNotBlank(filePath)) {
			fileName = FilenameUtils.getBaseName(filePath);
			fileName = fileName.replace(".1.1", "-DP");
		}

		rows.readHeaders();

		List<XrefXxDsp> xrefXxDsps = util.buildXrefXxDspData(rows);

		List<String> pairList = util.buildDHSComp(xrefXxDsps);

		Map<DHSComp, Long> dhsIdMap = dao.getDhsidList(pairList);

		List<Dhsidmap> dhsids = new ArrayList<Dhsidmap>();

		util.buildDhsIdMap(xrefXxDsps, dhsIdMap, dhsids, fileName);

		List<XrefDsp> xrefDsps = util.buildXrefDsp(xrefXxDsps, dhsIdMap);

		System.out.println("xrefXxDsps size is " + xrefXxDsps.size());

		System.out.println("xrefDsps size is " + xrefDsps.size());

		System.out.println("Dhsidmap list size is " + dhsids.size());

		dao.saveXrefXxDspDetails(xrefXxDsps);
		System.out.println("Saving list of xrefXxDsps..");

		dao.saveDhsidDetails(dhsids);
		System.out.println("Saving list of dhsids..");

		dao.saveXrefDspDetails(xrefDsps);
		System.out.println("Saving list of xrefDsps..");

		rows.close();

		stopWatch.stop();

		LOGGER.info("Total time taken for processReport api is {} ", stopWatch.getTotalTimeSeconds() + " secs.");

		return status;
	}

}
