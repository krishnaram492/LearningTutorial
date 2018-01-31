package com.tr.dhsloader.service;

/**
 * @author Thomson Reuters
 * 
 */
public interface IDHSLoaderService {

	boolean processReport(String filePath, int waitCount) throws Exception;

}
