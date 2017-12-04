package com.app.dhsloader.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dhsloader.dao.DHSLoaderDAO;
import com.app.dhsloader.dto.DHSComp;
import com.app.dhsloader.model.Dhsidmap;
import com.app.dhsloader.model.XrefDsp;
import com.app.dhsloader.model.XrefXxDsp;
import com.app.dhsloader.service.IDHSLoaderService;
import com.app.dhsloader.util.DHSLoaderUtil;
import com.csvreader.CsvReader;

/**
 * @author Ram
 * 
 */
@Service
public class DHSLoaderServiceImpl implements IDHSLoaderService {

	@Autowired
	private DHSLoaderUtil util;

	@Autowired
	private DHSLoaderDAO dao;

	public boolean saveXrefXxDspData(String filePath) throws Exception {

		boolean status = false;

		CsvReader rows = util.parseInputData(filePath);

		String fileName = FilenameUtils.getBaseName(filePath);

		rows.readHeaders();

		List<XrefXxDsp> xrefXxDsps = util.buildXrefXxDspData(rows);

		System.out.println("size is " + xrefXxDsps.size());

		Map<DHSComp, Long> dhsIdMap = new HashMap<DHSComp, Long>();

		List<Dhsidmap> dhsids = new ArrayList<Dhsidmap>();

		util.buildDhsIdMap(xrefXxDsps, dhsIdMap, dhsids, fileName);

		List<XrefDsp> xrefDsps = util.buildXrefDsp(xrefXxDsps, dhsIdMap);

		dao.saveXrefXxDspDetails(xrefXxDsps);
		System.out.println("Saving list of xrefXxDsps..");

		dao.saveDhsidDetails(dhsids);
		System.out.println("Saving list of dhsids..");

		dao.saveXrefDspDetails(xrefDsps);
		System.out.println("Saving list of xrefDsps..");

		rows.close();

		return status;
	}

}
