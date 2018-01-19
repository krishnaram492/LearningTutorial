package com.tr.dhsloader.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tr.dhsloader.dao.DHSLoaderDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class DAOTestCases {

	@Autowired
	private DHSLoaderDAO dao;

	@Test
	public void getDhsidList() throws Exception {
		List<byte[]> pairList = new ArrayList<byte[]>();

		Map<String, Long> dhsIdMap = dao.getDhsidList(pairList);
		if (dhsIdMap != null && dhsIdMap.size() > 0) {
			Assert.assertNotNull(dhsIdMap);
			Assert.assertTrue(dhsIdMap != null);
		} else {
			Assert.assertNull(dhsIdMap);
			Assert.assertFalse(dhsIdMap != null);
		}
	}

	@Test
	public void getMaxDhsID() throws Exception {
		Long maxDhsId = dao.getMaxDhsid();
		if (maxDhsId != null && maxDhsId > 0) {
			Assert.assertNotNull(maxDhsId);
			Assert.assertTrue(maxDhsId != null);
		} else {
			Assert.assertNull(maxDhsId);
			Assert.assertFalse(maxDhsId != null);
		}
	}

	@Test
	public void getColIdMap() throws Exception {
		Map<String, Integer> colIdMap = dao.getColIdMap();
		if (colIdMap != null && colIdMap.size() > 0) {
			Assert.assertNotNull(colIdMap);
			Assert.assertTrue(colIdMap != null);
		} else {
			Assert.assertNull(colIdMap);
			Assert.assertFalse(colIdMap != null);
		}
	}
}
