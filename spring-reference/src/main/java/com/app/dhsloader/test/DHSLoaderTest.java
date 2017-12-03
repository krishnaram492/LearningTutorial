package com.app.dhsloader.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.app.dhsloader.service.IDHSLoaderService;

@Component
public class DHSLoaderTest {

	@Autowired
	private IDHSLoaderService service;

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"config/applicationContext-Spring.xml");

		DHSLoaderTest test = context.getBean(DHSLoaderTest.class);
		String filePath = "D:\\MIFID.REF.296E.20171129.82.1.1.zip";
		test.invoke(filePath);
	}

	private void invoke(String filePath) throws Exception {
		// -Xmx1024m -XX:MaxPermSize=512m -Xms512m
		service.saveXrefXxDspData(filePath);
	}
}
