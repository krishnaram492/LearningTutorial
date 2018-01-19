package com.tr.dhsloader.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.tr.dhsloader.dao.DHSLoaderDAO;
import com.tr.dhsloader.model.Dhsidmap;
import com.tr.dhsloader.model.XrefDsp;
import com.tr.dhsloader.model.XrefXxDsp;

@RunWith(MockitoJUnitRunner.class)
public class MockDAOTestCases {

	@Mock
	private SessionFactory sessionFactory;

	@InjectMocks
	private DHSLoaderDAO dao;

	@Test
	public void saveXrefXxDspDetails() throws Exception {
		List<XrefXxDsp> xrefXxDsps = new ArrayList<XrefXxDsp>();

		dao.saveXrefXxDspDetails(xrefXxDsps);

		Mockito.verify(dao.getSessionFactory(), Mockito.atLeast(1))
				.getCurrentSession().save(Mockito.anyObject());
	}

	@Test
	public void saveXrefDspDetails() throws Exception {
		List<XrefDsp> xrefDsps = new ArrayList<XrefDsp>();

		dao.saveXrefDspDetails(xrefDsps);

		Mockito.verify(dao.getSessionFactory(), Mockito.atLeast(1))
				.getCurrentSession().save(Mockito.anyObject());
	}

	@Test
	public void saveDhsidDetails() throws Exception {
		List<Dhsidmap> dhsidmaps = new ArrayList<Dhsidmap>();

		dao.saveDhsidDetails(dhsidmaps);

		Mockito.verify(dao.getSessionFactory(), Mockito.atLeast(1))
				.getCurrentSession().save(Mockito.anyObject());
	}

}
