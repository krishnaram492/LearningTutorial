package com.app.dhsloader.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dhsloader.dao.DHSLoaderDAO;
import com.app.dhsloader.dto.DHSComp;
import com.app.dhsloader.model.XrefDsp;
import com.app.dhsloader.model.XrefXxDsp;
import com.app.dhsloader.service.IDHSLoaderService;
import com.app.dhsloader.util.DHSLoaderUtil;
import com.csvreader.CsvReader;

@Service
public class DHSLoaderServiceImpl implements IDHSLoaderService {

	@Autowired
	private DHSLoaderUtil util;

	@Autowired
	private DHSLoaderDAO dao;

	public boolean saveXrefXxDspData(String filePath) throws Exception {

		boolean status = false;

		CsvReader rows = util.parseInputData(filePath);

		rows.readHeaders();

		List<XrefXxDsp> xrefXxDsps = util.buildXrefXxDspData(rows);

		System.out.println("size is " + xrefXxDsps.size());

		HashMap<DHSComp, Long> dhsIdMap = util.buildDhsIdMap(xrefXxDsps);

		List<XrefDsp> xrefDsps = util.buildXrefDsp(xrefXxDsps, dhsIdMap);

		// dao.saveXrefXxDspDetails(xrefXxDsps);

		rows.close();

		return status;
	}

	@Override
	public void getMifidReference() {

	}

}
