package com.tr.dhsloader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.tr.dhsloader.dao.DHSLoaderDAO;
import com.tr.dhsloader.model.Dhsidmap;
import com.tr.dhsloader.model.XrefDsp;
import com.tr.dhsloader.model.XrefXxDsp;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
@RunWith(MockitoJUnitRunner.class)
public class MockDAOTest {

	@Mock
	private SessionFactory sessionFactory;

	@Mock
	private Session session;

	@Mock
	private Query query;

	@InjectMocks
	private DHSLoaderDAO dao;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		dao.setSessionFactory(sessionFactory);
		Mockito.doReturn(session).when(sessionFactory).getCurrentSession();
	}

	public void getMaxDhsID() throws Exception {
		Long value = new Long(0);
		Mockito.doReturn(query).when(session).createQuery("select max(dhsid) from Dhsidmap");
		Mockito.doReturn(value).when(query).uniqueResult();
		Assert.assertEquals(value, dao.getMaxDhsid());
	}

	@SuppressWarnings("unused")
	public void getDhsidList() throws Exception {
		Map<String, Long> dhsIdMap = new HashMap<String, Long>();
		List<Object[]> result = new ArrayList<Object[]>();
		String sqlQuery = "select dhsID, quoteID FROM DhsIdMap1 WHERE quoteID in (:values)";
		Mockito.doReturn(query).when(session).createQuery(sqlQuery);
		Mockito.doReturn(result).when(query).list();
	}

	@SuppressWarnings("unused")
	public void getColIdMap() throws Exception {
		Map<String, Integer> colIdMap = new HashMap<String, Integer>();
		List<Object[]> result = new ArrayList<Object[]>();
		String sqlQuery = "select t1.ReportColumn, t2.colid from dbo.ColumnMapping t1, dbo.dspCplumns t2 where t1.ShortColumn = t2.name and bcpTable = 'XRef_XX_DSP'  order by t1.ReportColumn";
		Mockito.doReturn(query).when(session).createQuery(sqlQuery);
		Mockito.doReturn(result).when(query).list();
	}

	public void saveXrefXxDspDetails() throws Exception {
		Set<XrefXxDsp> xrefXxDsps = new HashSet<XrefXxDsp>();
		dao.saveXrefXxDspDetails(xrefXxDsps, 1000);
		for (XrefXxDsp xrefXxDsp : xrefXxDsps) {
			Mockito.verify(session, Mockito.atLeast(1)).save(xrefXxDsp);
			Assert.assertNotNull(xrefXxDsp);
			Assert.assertTrue(xrefXxDsp.getId().getRic().length() > 0);
		}
	}

	public void saveXrefDspDetails() throws Exception {
		Set<XrefDsp> xrefDsps = new HashSet<XrefDsp>();
		dao.saveXrefDspDetails(xrefDsps, 1000);
		for (XrefDsp xrefDsp : xrefDsps) {
			Mockito.verify(session, Mockito.atLeast(1)).save(xrefDsp);
			Assert.assertNotNull(xrefDsp);
			Assert.assertTrue(xrefDsp.getAssetstatus().length() > 0);
		}
	}

	public void saveDhsidDetails() throws Exception {
		List<Dhsidmap> dhsidmaps = new ArrayList<Dhsidmap>();
		dao.saveDhsidDetails(dhsidmaps, 1000);
		for (Dhsidmap dhsidmap : dhsidmaps) {
			Mockito.verify(session, Mockito.atLeast(1)).save(dhsidmap);
			Assert.assertNotNull(dhsidmap);
			Assert.assertTrue(dhsidmap.getRic().length() > 0);
		}
	}

	@Test
	public void executeAllTestCases() {
		try {
			getMaxDhsID();
			getDhsidList();
			getColIdMap();
			saveXrefXxDspDetails();
			saveXrefDspDetails();
			saveDhsidDetails();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
