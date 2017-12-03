package com.app.dhsloader.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dhsloader.dao.DHSLoaderDAO;
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

		List<XrefXxDsp> xrefXxDsps = util.getXrefXxDspData(rows);

		System.out.println("size is " + xrefXxDsps.size());

		int i = 1;
		for (XrefXxDsp xrefXxDsp : xrefXxDsps) {
			System.out.println(i + "" + xrefXxDsp.getId());
			i++;
		}

		dao.saveXrefXxDspDetails(xrefXxDsps);

		// System.out.println("Records inserted..");

		rows.close();

		return status;
	}

	@Override
	public void getMifidReference() {

	}

}
