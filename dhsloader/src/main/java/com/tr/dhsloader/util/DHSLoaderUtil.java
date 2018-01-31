package com.tr.dhsloader.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csvreader.CsvReader;
import com.tr.dhsloader.constants.IDHSLoaderConstants;
import com.tr.dhsloader.dao.DHSLoaderDAO;
import com.tr.dhsloader.logging.DHSLogging;
import com.tr.dhsloader.model.Dhsidmap;
import com.tr.dhsloader.model.XrefDsp;
import com.tr.dhsloader.model.XrefHistory;
import com.tr.dhsloader.model.XrefHistoryId;
import com.tr.dhsloader.model.XrefXxDsp;
import com.tr.dhsloader.model.XrefXxDspId;

/**
 * @author Thomson Reuters
 * 
 */
@Component
public class DHSLoaderUtil extends DHSLogging {

	final static Logger LOGGER = (Logger) LogManager.getLogger();
	@Autowired
	private DHSLoaderDAO dao;

	@Autowired
	private FTPUtil ftpUtil;

	/**
	 * This API reads file and creates into CsvReader object
	 * 
	 * @param filePath
	 * @return
	 */
	@SuppressWarnings({ "resource", "rawtypes" })
	public CsvReader parseInputData(String filePath) throws Exception {

		LOGGER.log(INFORMATIONAL, "Parsing input File...");
		if (StringUtils.isNotBlank(filePath)) {
			ZipFile zip = new ZipFile(filePath);
			Enumeration e = zip.entries();
			CsvReader csvReader = null;
			while (e.hasMoreElements()) {
				ZipEntry entry = (ZipEntry) e.nextElement();
				if (!entry.isDirectory()) {
					if (FilenameUtils.getExtension(entry.getName()).equals("txt")) {
						InputStream inputStream = zip.getInputStream(entry);
						Reader reader = new InputStreamReader(inputStream);
						BufferedReader bufferedReader = new BufferedReader(reader);

						String line = "";
						File tempFile = new File("temp.txt");
						FileWriter fw = new FileWriter(tempFile);
						int i = 0;
						while ((line = bufferedReader.readLine()) != null) {
							if (i > 0) {
								fw.write(line + "\n");
							}
							i++;
						}
						bufferedReader.close();
						fw.close();

						BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(tempFile)));

						csvReader = new CsvReader(br, '|');

						if (tempFile.exists() && !tempFile.isDirectory()) {
							LOGGER.log(INFORMATIONAL, "File is available");
							LOGGER.log(INFORMATIONAL, "File is getting deleted? or not?", tempFile.delete());
							LOGGER.log(INFORMATIONAL, "temp file deleted...");
						}

					}
				}
			}
			return csvReader;
		}
		return null;
	}

	/**
	 * This API build XrefXx Dsp Data
	 * 
	 * @param csvReader
	 * @return
	 * @throws Exception
	 */
	public synchronized Set<XrefXxDsp> buildXrefXxDspData(CsvReader csvReader) throws Exception {

		Set<XrefXxDsp> xrefDsps = new HashSet<XrefXxDsp>();
		LOGGER.log(INFORMATIONAL, "Building Staging Data List Started...");
		if (null != csvReader) {
			while (csvReader.readRecord()) {

				if (StringUtils.isNotBlank(csvReader.get("Quote_ID"))) {

					XrefXxDsp xrefXxDsp = new XrefXxDsp();
					String quoteid = csvReader.get("Quote_ID").replace("0x", "");
					String assetid = csvReader.get("Asset_ID").replace("0x", "");

					XrefXxDspId obj = new XrefXxDspId();

					obj.setAction(csvReader.get("Action"));
					obj.setLevelcode(csvReader.get("Level"));
					obj.setIpc(csvReader.get("File_Code"));
					obj.setQuoteid(Hex.decodeHex(quoteid.toCharArray()));
					obj.setRic(csvReader.get("RIC"));
					obj.setSedol(csvReader.get("SEDOL"));
					obj.setIssuepermid(csvReader.get("Issue_Perm_ID"));
					obj.setAssetid(Hex.decodeHex(assetid.toCharArray()));
					obj.setPilc(csvReader.get("PILC"));
					obj.setCusip(csvReader.get("CUSIP"));
					obj.setOrgpermid(csvReader.get("Organization_Perm_ID"));
					obj.setAssetstatus(csvReader.get("Asset_Status"));
					obj.setBasketundisinlist(csvReader.get("Basket_Underlying_ISIN_List"));
					obj.setBasketwrrindicator(csvReader.get("Basket_Warrant_Indicator"));
					obj.setCficode(csvReader.get("CFI_Code"));
					obj.setCincode(csvReader.get("CIN_Code"));
					obj.setComplegaldomicile(csvReader.get("Company_Legal_Domicile"));
					obj.setCompshortname(csvReader.get("Company_Short_Name"));
					obj.setDealstartdate(csvReader.get("Deal_Start_Date"));
					obj.setEeavenueelflg(csvReader.get("EEA_Venue_Eligible_Flag"));
					obj.setFininsshname(csvReader.get("Financial_Instrument_Short_Name"));
					obj.setFininsshnameesma(csvReader.get("Financial_Instrument_Short_Name_-_ESMA"));
					obj.setInesmafirds(csvReader.get("In_ESMA_FIRDS"));
					obj.setInsclassesma(csvReader.get("Instrument_Classification_-_ESMA"));
					obj.setInsfullnameesma(csvReader.get("Instrument_Full_Name_-_ESMA"));
					obj.setIsin(csvReader.get("ISIN"));
					obj.setIssuedate(csvReader.get("Issue_Date"));
					obj.setIssuerlei(csvReader.get("Issuer_LEI"));
					obj.setIssortrvenueleiesma(csvReader.get("Issuer_or_Trading_Venue_LEI_-_ESMA"));
					obj.setMrkattsrcpermid(csvReader.get("Market_Attributable_Source_Perm_ID"));
					obj.setMarketmic(csvReader.get("Market_MIC"));
					obj.setMaturitydate(csvReader.get("Maturity_Date"));
					obj.setMifidasclofun(csvReader.get("MiFID_Asset_Class_of_Underlying"));
					obj.setMifidadnapinsesma(
							csvReader.get("MiFID_Average_Daily_Notional_Amount_per_instrument_-_ESMA"));
					obj.setMifidadnoftpinsesma(
							csvReader.get("MiFID_Average_Daily_number_of_Trades_per_instrument_-_ESMA"));
					obj.setMifidavdatuesma(csvReader.get("MiFID_Average_Daily_Turnover_-_ESMA"));
					obj.setMifidavdatucurcode(csvReader.get("MiFID_Average_Daily_Turnover_Currency_Code"));
					obj.setMifidavvaoftresma(csvReader.get("MiFID_Average_Value_Of_Transactions_-_ESMA"));
					obj.setMifidavvaoftrcurcode(csvReader.get("MiFID_Average_Value_Of_Transactions_Currency_Code"));
					obj.setMifidbaseprod(csvReader.get("MiFID_Base_Product"));
					obj.setMifidbaseprodesma(csvReader.get("MiFID_Base_Product_-_ESMA"));
					obj.setMifidbondseni(csvReader.get("MiFID_Bond_Seniority"));
					obj.setMifidbondtype(csvReader.get("MiFID_Bond_Type"));
					obj.setMifidclobflag(csvReader.get("MiFID_Clearing_Obligation_Flag"));
					obj.setMifidcofialiinfornewbo(csvReader.get("MiFID_COFIA_Liquidity_Flag"));
					obj.setMifidcodein(csvReader.get("MiFID_Commodities_Derivative_Indicator"));
					obj.setMifidcodeinesma(csvReader.get("MiFID_Commodities_Derivative_Indicator_-_ESMA"));
					obj.setMifidcoinflesma(csvReader.get("MiFID_Complex_Instrument_Flag_-_ESMA"));
					obj.setMifidcoinre(csvReader.get("MiFID_Complex_Instrument_Reason"));
					obj.setMifidcotype(csvReader.get("MiFID_Contract_Type"));
					obj.setMifiddeltypeesma(csvReader.get("MiFID_Delivery_Type_-_ESMA"));
					obj.setMifidemalsubtype(csvReader.get("MiFID_Emissions_Allowances_Sub_Type"));
					obj.setMifidexerstyle(csvReader.get("MiFID_Exercise_Style"));
					obj.setMifidexerstyleesma(csvReader.get("MiFID_Exercise_Style_-_ESMA"));
					obj.setMifidexpdateesma(csvReader.get("MiFID_Expiration_Date_-_ESMA"));
					obj.setMifidfiprtype(csvReader.get("MiFID_Final_Price_Type"));
					obj.setMifidfiprtypeesma(csvReader.get("MiFID_Final_Price_Type_-_ESMA"));
					obj.setMifidfrtradedate(csvReader.get("MiFID_First_Trade_Date"));
					obj.setMifidfrtradedateesma(csvReader.get("MiFID_First_Trade_Date_-_ESMA"));
					obj.setMifidflag(csvReader.get("MiFID_Flag"));
					obj.setMifidfrfloatesma(csvReader.get("MiFID_Free_Float_-_ESMA"));
					obj.setMifidfrfloatcurcode(csvReader.get("MiFID_Free_Float_Currency_Code"));
					obj.setMifidfusubpr(csvReader.get("MiFID_Further_Sub_Product"));
					obj.setMifidfusubpresma(csvReader.get("MiFID_Further_Sub_Product_-_ESMA"));
					obj.setMifidissdateesma(csvReader.get("MiFID_Issuance_Date_-_ESMA"));
					obj.setMifidisssizeesma(csvReader.get("MiFID_Issuance_Size_-_ESMA"));
					obj.setMifidmatdate(csvReader.get("MiFID_Maturity_Date"));
					obj.setMifidmatdateesma(csvReader.get("MiFID_Maturity_Date_-_ESMA"));
					obj.setMifidmostremaesma(csvReader.get("MiFID_Most_Relevant_Market_-_ESMA"));
					obj.setMifidoptype(csvReader.get("MiFID_Option_Type"));
					obj.setMifidoptypeesma(csvReader.get("MiFID_Option_Type_-_ESMA"));
					obj.setMifidptuw12esma(csvReader.get("MiFID_Percent_Trading_Under_Waivers_12_Month_-_ESMA"));
					obj.setMifidptuwptv12mesma(
							csvReader.get("MiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month_-_ESMA"));
					obj.setMifidpotrlisthfl(csvReader.get("MiFID_Post_Trade_LIS_Threshold_Floor"));
					obj.setMifidpotrlisthvl(csvReader.get("MiFID_Post_Trade_LIS_Threshold_Value"));
					obj.setMifidpotrlistrper(csvReader.get("MiFID_Post_Trade_LIS_Trade_Percentile"));
					obj.setMifidpotrlisvoper(csvReader.get("MiFID_Post_Trade_LIS_Volume_Percentile"));
					obj.setMifidpotrsstithfl(csvReader.get("MiFID_Post_Trade_SSTI_Threshold_Floor"));
					obj.setMifidpotrsstithvl(csvReader.get("MiFID_Post_Trade_SSTI_Threshold_Value"));
					obj.setMifidpotrsstitrper(csvReader.get("MiFID_Post_Trade_SSTI_Trade_Percentile"));
					obj.setMifidpotrsstivoper(csvReader.get("MiFID_Post_Trade_SSTI_Volume_Percentile"));
					obj.setMifidpretrlisthfl(csvReader.get("MiFID_Pre_Trade_LIS_Threshold_Floor"));
					obj.setMifidpretrlisthvl(csvReader.get("MiFID_Pre_Trade_LIS_Threshold_Value"));
					obj.setMifidpretrlistrper(csvReader.get("MiFID_Pre_Trade_LIS_Trade_Percentile"));
					obj.setMifidpretrsstithfl(csvReader.get("MiFID_Pre_Trade_SSTI_Threshold_Floor"));
					obj.setMifidpretrsstithvl(csvReader.get("MiFID_Pre_Trade_SSTI_Threshold_Value"));
					obj.setMifidpretrsstitrper(csvReader.get("MiFID_Pre_Trade_SSTI_Trade_Percentile"));
					obj.setMifidregulatedesma(csvReader.get("MiFID_Regulated_-_ESMA"));
					obj.setMifidstmasizeesma(csvReader.get("MiFID_Standard_Market_Size_-_ESMA"));
					obj.setMifidstmasizecurcode(csvReader.get("MiFID_Standard_Market_Size_Currency_Code"));
					obj.setMifidsubprod(csvReader.get("MiFID_Sub_Product"));
					obj.setMifidsubprodesma(csvReader.get("MiFID_Sub_Product_-_ESMA"));
					obj.setMifidtermdate(csvReader.get("MiFID_Termination_Date"));
					obj.setMifidtermdateesma(csvReader.get("MiFID_Termination_Date_-_ESMA"));
					obj.setMifidtrobflag(csvReader.get("MiFID_Trade_Obligation_Flag"));
					obj.setMifidtradapdate(csvReader.get("MiFID_Trading_Admission_Approval_Date"));
					obj.setMifidtradapdateesma(csvReader.get("MiFID_Trading_Admission_Approval_Date_-_ESMA"));
					obj.setMifidtradreqdate(csvReader.get("MiFID_Trading_Admission_Request_Date"));
					obj.setMifidtradreqdateesma(csvReader.get("MiFID_Trading_Admission_Request_Date_-_ESMA"));
					obj.setMifidtrtype(csvReader.get("MiFID_Transaction_Type"));
					obj.setMifidtrtypeesma(csvReader.get("MiFID_Transaction_Type_-_ESMA"));
					obj.setMifidundindname(csvReader.get("MiFID_Underlying_Index_Name"));
					obj.setMifidundindnameesma(csvReader.get("MiFID_Underlying_Index_Name_-_ESMA"));
					obj.setMifidundindtermesma(csvReader.get("MiFID_Underlying_Index_Term_-_ESMA"));
					obj.setMifidundtype(csvReader.get("MiFID_Underlying_Type"));
					obj.setMifiridentifier(csvReader.get("MIFIR_Identifier"));
					obj.setMindenomination(csvReader.get("Minimum_Denomination"));
					obj.setNcaavdailyturnover(csvReader.get("NCA_Average_Daily_Turnover"));
					obj.setNcaavdailyturncurcode(csvReader.get("NCA_Average_Daily_Turnover_Currency_Code"));
					obj.setNcafreefl(csvReader.get("NCA_Free_Float"));
					obj.setNcafreeflcurcode(csvReader.get("NCA_Free_Float_Currency_Code"));
					obj.setNotionalcuresma(csvReader.get("Notional_Currency_-_ESMA"));
					obj.setOptionroot(csvReader.get("Option_root"));
					obj.setPlaceholder(csvReader.get("Placeholder"));
					obj.setPricemultiplieresma(csvReader.get("Price_Multiplier_-_ESMA"));
					obj.setPrtrmaquote(csvReader.get("Primary_Tradable_Market_Quote"));
					obj.setQuotepermid(csvReader.get("Quote_Perm_ID"));
					obj.setReqfattbyissuer(csvReader.get("Request_for_Admission_to_Trading_by_Issuer"));
					obj.setReqfattbyissueresma(csvReader.get("Request_for_Admission_to_Trading_by_Issuer_-_ESMA"));
					obj.setSecuritydescription(csvReader.get("Security_Description"));
					obj.setStrikepriceesma(csvReader.get("Strike_Price_-_ESMA"));
					obj.setStrikepricecuresma(csvReader.get("Strike_Price_Currency_-_ESMA"));
					obj.setSuscategoryesma(csvReader.get("Suspension_Category_-_ESMA"));
					obj.setSusendedonesma(csvReader.get("Suspension_Ended_On_-_ESMA"));
					obj.setSusongoingesma(csvReader.get("Suspension_On_Going_-_ESMA"));
					obj.setSusratesma(csvReader.get("Suspension_Rationale_-_ESMA"));
					obj.setSusstonesma(csvReader.get("Suspension_Started_On_-_ESMA"));
					obj.setTtlamissued(csvReader.get("Total_Amount_Issued"));
					obj.setTtleutu12moesma(csvReader.get("Total_EU_Turnover_12_Month_-_ESMA"));
					obj.setTtleuvl12moesma(csvReader.get("Total_EU_Volume_12_Month_-_ESMA"));
					obj.setUndeeaelig(csvReader.get("Underlying_EEA_Venue_Eligible"));
					obj.setUndisin(csvReader.get("Underlying_ISIN"));
					obj.setUndisinesma(csvReader.get("Underlying_ISIN_-_ESMA"));
					xrefXxDsp.setId(obj);
					xrefDsps.add(xrefXxDsp);
				} // end if
			} // end while
		} // end if
		LOGGER.log(INFORMATIONAL, "Building Staging Data List Ended...");
		return xrefDsps;
	}

	/**
	 * This API builds list of quote id
	 * 
	 * @param xrefXxDsps
	 * @return
	 * @throws Exception
	 */
	public List<String> buildQuote(Set<XrefXxDsp> xrefXxDsps) throws Exception {
		List<String> quotes = new ArrayList<String>();

		for (XrefXxDsp obj : xrefXxDsps) {
			if (obj.getId().getQuoteid() != null) {

				String quoteid = Hex.encodeHexString(obj.getId().getQuoteid());
				quotes.add(quoteid);

			}
		}
		return quotes;

	}

	/**
	 * This API buildDhsIdMap
	 * 
	 * @param xrefXxDsps
	 * @return
	 * @throws Exception
	 */
	public synchronized void buildDhsIdMap(Set<XrefXxDsp> xrefXxDsps, Map<String, Long> dhsIdMap, List<Dhsidmap> dhsids,
			String fileName) throws Exception {

		Long maxDhsId = dao.getMaxDhsid();
		LOGGER.log(INFORMATIONAL, "Max DHSID is {} ", maxDhsId);
		LOGGER.log(INFORMATIONAL, "Building Dhsid List Started...");
		if (null != maxDhsId) {
			int i = 1;
			for (XrefXxDsp obj : xrefXxDsps) {
				byte[] quoteid = (obj.getId().getQuoteid());
				if (quoteid != null) {

					if (dhsIdMap != null && !dhsIdMap.containsKey(Hex.encodeHexString(quoteid))) {

						Dhsidmap dhsObj = new Dhsidmap();

						dhsObj.setDhsid((maxDhsId + i));
						dhsObj.setRic(obj.getId().getRic());
						dhsObj.setRic30(obj.getId().getRic());
						dhsObj.setCreatedate(Calendar.getInstance());
						dhsObj.setUpdatedate(Calendar.getInstance());
						dhsObj.setQuoteid(obj.getId().getQuoteid());
						dhsObj.setUpdatesrc(fileName);

						dhsids.add(dhsObj);

						dhsIdMap.put(Hex.encodeHexString(obj.getId().getQuoteid()), (maxDhsId + i));
					}

					i++;
				}
			}
		}
		LOGGER.log(INFORMATIONAL, "Building Dhsid List Ended...");
	}

	/**
	 * This API builds buildXrefDsp
	 * 
	 * @param xrefXxDsps
	 * @param dhsIdMap
	 * @return
	 */
	public Set<XrefDsp> buildXrefDsp(Set<XrefXxDsp> xrefXxDsps, Map<String, Long> dhsIdMap) {
		LOGGER.log(INFORMATIONAL, "Building XrefDSP List Started...");
		Set<XrefDsp> xrefDsps = new HashSet<XrefDsp>();

		for (XrefXxDsp staging : xrefXxDsps) {

			if (null != staging.getId().getQuoteid()) {
				// String quoteid = String.valueOf(staging.getId().getQuoteid());

				XrefXxDspId obj = staging.getId();
				XrefDsp dto = new XrefDsp();

				if (dhsIdMap.containsKey(Hex.encodeHexString(obj.getQuoteid()))) {
					dto.setDhsid(dhsIdMap.get(Hex.encodeHexString(obj.getQuoteid())));
				}

				if (StringUtils.isNotBlank(obj.getIpc()))
					dto.setIpc(obj.getIpc());
				if (StringUtils.isNotBlank(obj.getAssetstatus()))
					dto.setAssetstatus(obj.getAssetstatus());
				if (StringUtils.isNotBlank(obj.getBasketundisinlist()))
					dto.setBasketundisinlist(obj.getBasketundisinlist());
				if (StringUtils.isNotBlank(obj.getBasketwrrindicator()))
					dto.setBasketwrrindicator(obj.getBasketwrrindicator());
				if (StringUtils.isNotBlank(obj.getCincode()))
					dto.setCincode(obj.getCincode());
				if (StringUtils.isNotBlank(obj.getComplegaldomicile()))
					dto.setComplegaldomicile(obj.getComplegaldomicile());
				if (StringUtils.isNotBlank(obj.getCompshortname()))
					dto.setCompshortname(obj.getCompshortname());
				if (StringUtils.isNotBlank(obj.getDealstartdate()))
					dto.setDealstartdate((convertDate(obj.getDealstartdate())));
				if (StringUtils.isNotBlank(obj.getEeavenueelflg()))
					dto.setEeavenueelflg(obj.getEeavenueelflg());
				if (StringUtils.isNotBlank(obj.getFininsshnameesma()))
					dto.setFininsshnameesma(obj.getFininsshnameesma());
				if (StringUtils.isNotBlank(obj.getInesmafirds()))
					dto.setInesmafirds(obj.getInesmafirds());
				if (StringUtils.isNotBlank(obj.getInsclassesma()))
					dto.setInsclassesma(obj.getInsclassesma());
				if (StringUtils.isNotBlank(obj.getInsfullnameesma()))
					dto.setInsfullnameesma(obj.getInsfullnameesma());
				if (StringUtils.isNotBlank(obj.getIssuedate()))
					dto.setIssuedate((convertDate(obj.getIssuedate())));
				if (StringUtils.isNotBlank(obj.getIssortrvenueleiesma()))
					dto.setIssortrvenueleiesma(obj.getIssortrvenueleiesma());
				if (StringUtils.isNotBlank(obj.getMrkattsrcpermid()))
					dto.setMrkattsrcpermid((obj.getMrkattsrcpermid()));
				if (StringUtils.isNotBlank(obj.getMaturitydate()))
					dto.setMaturitydate((convertDate(obj.getMaturitydate())));
				if (StringUtils.isNotBlank(obj.getMifidasclofun()))
					dto.setMifidasclofun(obj.getMifidasclofun());
				if (StringUtils.isNotBlank(obj.getMifidadnapinsesma()))
					dto.setMifidadnapinsesma((obj.getMifidadnapinsesma()));
				if (StringUtils.isNotBlank(obj.getMifidadnoftpinsesma()))
					dto.setMifidadnoftpinsesma((obj.getMifidadnoftpinsesma()));
				if (StringUtils.isNotBlank(obj.getMifidavdatuesma()))
					dto.setMifidavdatuesma((obj.getMifidavdatuesma()));
				if (StringUtils.isNotBlank(obj.getMifidavdatucurcode()))
					dto.setMifidavdatucurcode(obj.getMifidavdatucurcode());
				if (StringUtils.isNotBlank(obj.getMifidavvaoftresma()))
					dto.setMifidavvaoftresma((obj.getMifidavvaoftresma()));
				if (StringUtils.isNotBlank(obj.getMifidavvaoftrcurcode()))
					dto.setMifidavvaoftrcurcode((obj.getMifidavvaoftrcurcode()));
				if (StringUtils.isNotBlank(obj.getMifidbaseprod()))
					dto.setMifidbaseprod(obj.getMifidbaseprod());
				if (StringUtils.isNotBlank(obj.getMifidbaseprodesma()))
					dto.setMifidbaseprodesma(obj.getMifidbaseprodesma());
				if (StringUtils.isNotBlank(obj.getMifidbondseni()))
					dto.setMifidbondseni(obj.getMifidbondseni());
				if (StringUtils.isNotBlank(obj.getMifidbondtype()))
					dto.setMifidbondtype(obj.getMifidbondtype());
				if (StringUtils.isNotBlank(obj.getMifidclobflag()))
					dto.setMifidclobflag(obj.getMifidclobflag());
				if (StringUtils.isNotBlank(obj.getMifidcofialiinfornewbo()))
					dto.setMifidcofialiinfornewbo(obj.getMifidcofialiinfornewbo());
				if (StringUtils.isNotBlank(obj.getMifidcodein()))
					dto.setMifidcodein(obj.getMifidcodein());
				if (StringUtils.isNotBlank(obj.getMifidcodeinesma()))
					dto.setMifidcodeinesma(obj.getMifidcodeinesma());
				if (StringUtils.isNotBlank(obj.getMifidcoinflesma()))
					dto.setMifidcoinflesma(obj.getMifidcoinflesma());
				if (StringUtils.isNotBlank(obj.getMifidcoinre()))
					dto.setMifidcoinre(obj.getMifidcoinre());
				if (StringUtils.isNotBlank(obj.getMifidcotype()))
					dto.setMifidcotype(obj.getMifidcotype());
				if (StringUtils.isNotBlank(obj.getMifiddeltypeesma()))
					dto.setMifiddeltypeesma(obj.getMifiddeltypeesma());
				if (StringUtils.isNotBlank(obj.getMifidemalsubtype()))
					dto.setMifidemalsubtype(obj.getMifidemalsubtype());
				if (StringUtils.isNotBlank(obj.getMifidexerstyle()))
					dto.setMifidexerstyle(obj.getMifidexerstyle());
				if (StringUtils.isNotBlank(obj.getMifidexerstyleesma()))
					dto.setMifidexerstyleesma(obj.getMifidexerstyleesma());
				if (StringUtils.isNotBlank(obj.getMifidexpdateesma()))
					dto.setMifidexpdateesma((obj.getMifidexpdateesma()));
				if (StringUtils.isNotBlank(obj.getMifidfiprtype()))
					dto.setMifidfiprtype(obj.getMifidfiprtype());
				if (StringUtils.isNotBlank(obj.getMifidfiprtypeesma()))
					dto.setMifidfiprtypeesma(obj.getMifidfiprtypeesma());
				if (StringUtils.isNotBlank(obj.getMifidfrtradedate()))
					dto.setMifidfrtradedate((convertDate(obj.getMifidfrtradedate())));
				if (StringUtils.isNotBlank(obj.getMifidfrtradedateesma()))
					dto.setMifidfrtradedateesma((obj.getMifidfrtradedateesma()));
				if (StringUtils.isNotBlank(obj.getMifidflag()))
					dto.setMifidflag(obj.getMifidflag());
				if (StringUtils.isNotBlank(obj.getMifidfrfloatesma()))
					dto.setMifidfrfloatesma((obj.getMifidfrfloatesma()));
				if (StringUtils.isNotBlank(obj.getMifidfrfloatcurcode()))
					dto.setMifidfrfloatcurcode(obj.getMifidfrfloatcurcode());
				if (StringUtils.isNotBlank(obj.getMifidfusubpr()))
					dto.setMifidfusubpr(obj.getMifidfusubpr());
				if (StringUtils.isNotBlank(obj.getMifidfusubpresma()))
					dto.setMifidfusubpresma(obj.getMifidfusubpresma());
				if (StringUtils.isNotBlank(obj.getMifidissdateesma()))
					dto.setMifidissdateesma((obj.getMifidissdateesma()));
				if (StringUtils.isNotBlank(obj.getMifidisssizeesma()))
					dto.setMifidisssizeesma((obj.getMifidisssizeesma()));
				if (StringUtils.isNotBlank(obj.getMifidmatdate()))
					dto.setMifidmatdate((convertDate(obj.getMifidmatdate())));
				if (StringUtils.isNotBlank(obj.getMifidmatdateesma()))
					dto.setMifidmatdateesma((obj.getMifidmatdateesma()));
				if (StringUtils.isNotBlank(obj.getMifidmostremaesma()))
					dto.setMifidmostremaesma(obj.getMifidmostremaesma());
				if (StringUtils.isNotBlank(obj.getMifidoptype()))
					dto.setMifidoptype(obj.getMifidoptype());
				if (StringUtils.isNotBlank(obj.getMifidoptypeesma()))
					dto.setMifidoptypeesma(obj.getMifidoptypeesma());
				if (StringUtils.isNotBlank(obj.getMifidptuw12esma()))
					dto.setMifidptuw12esma((obj.getMifidptuw12esma()));
				if (StringUtils.isNotBlank(obj.getMifidptuwptv12mesma()))
					dto.setMifidptuwptv12mesma((obj.getMifidptuwptv12mesma()));
				if (StringUtils.isNotBlank(obj.getMifidpotrlisthfl()))
					dto.setMifidpotrlisthfl((obj.getMifidpotrlisthfl()));
				if (StringUtils.isNotBlank(obj.getMifidpotrlisthvl()))
					dto.setMifidpotrlisthvl((obj.getMifidpotrlisthvl()));
				if (StringUtils.isNotBlank(obj.getMifidpotrlistrper()))
					dto.setMifidpotrlistrper((obj.getMifidpotrlistrper()));
				if (StringUtils.isNotBlank(obj.getMifidpotrlisvoper()))
					dto.setMifidpotrlisvoper((obj.getMifidpotrlisvoper()));
				if (StringUtils.isNotBlank(obj.getMifidpotrsstithfl()))
					dto.setMifidpotrsstithfl((obj.getMifidpotrsstithfl()));
				if (StringUtils.isNotBlank(obj.getMifidpotrsstithvl()))
					dto.setMifidpotrsstithvl((obj.getMifidpotrsstithvl()));
				if (StringUtils.isNotBlank(obj.getMifidpotrsstitrper()))
					dto.setMifidpotrsstitrper((obj.getMifidpotrsstitrper()));
				if (StringUtils.isNotBlank(obj.getMifidpotrsstivoper()))
					dto.setMifidpotrsstivoper((obj.getMifidpotrsstivoper()));
				if (StringUtils.isNotBlank(obj.getMifidpretrlisthfl()))
					dto.setMifidpretrlisthfl((obj.getMifidpretrlisthfl()));
				if (StringUtils.isNotBlank(obj.getMifidpretrlisthvl()))
					dto.setMifidpretrlisthvl((obj.getMifidpretrlisthvl()));
				if (StringUtils.isNotBlank(obj.getMifidpretrlistrper()))
					dto.setMifidpretrlistrper((obj.getMifidpretrlistrper()));
				if (StringUtils.isNotBlank(obj.getMifidpretrsstithfl()))
					dto.setMifidpretrsstithfl((obj.getMifidpretrsstithfl()));
				if (StringUtils.isNotBlank(obj.getMifidpretrsstithvl()))
					dto.setMifidpretrsstithvl((obj.getMifidpretrsstithvl()));
				if (StringUtils.isNotBlank(obj.getMifidpretrsstitrper()))
					dto.setMifidpretrsstitrper((obj.getMifidpretrsstitrper()));
				if (StringUtils.isNotBlank(obj.getMifidregulatedesma()))
					dto.setMifidregulatedesma(obj.getMifidregulatedesma());
				if (StringUtils.isNotBlank(obj.getMifidstmasizeesma()))
					dto.setMifidstmasizeesma((obj.getMifidstmasizeesma()));
				if (StringUtils.isNotBlank(obj.getMifidstmasizecurcode()))
					dto.setMifidstmasizecurcode(obj.getMifidstmasizecurcode());
				if (StringUtils.isNotBlank(obj.getMifidsubprod()))
					dto.setMifidsubprod(obj.getMifidsubprod());
				if (StringUtils.isNotBlank(obj.getMifidsubprodesma()))
					dto.setMifidsubprodesma(obj.getMifidsubprodesma());
				if (StringUtils.isNotBlank(obj.getMifidtermdate()))
					dto.setMifidtermdate((convertDate(obj.getMifidtermdate())));
				if (StringUtils.isNotBlank(obj.getMifidtermdateesma()))
					dto.setMifidtermdateesma((obj.getMifidtermdateesma()));
				if (StringUtils.isNotBlank(obj.getMifidtrobflag()))
					dto.setMifidtrobflag(obj.getMifidtrobflag());

				xrefDsps.add(dto);
			}
		}
		LOGGER.log(INFORMATIONAL, "Building XrefDSP List Ended...");
		return xrefDsps;
	}

	private String convertDate(String date) {
		return date.replace("-", "");
	}

	/**
	 * This API builds DHSComp based on list of quotes
	 * 
	 * @param quotes
	 * @return
	 * @throws Exception
	 */
	public List<byte[]> buildDHSComp(List<String> quotes) throws Exception {
		List<byte[]> comps = new ArrayList<byte[]>();
		for (String quote : quotes) {
			if (StringUtils.isNotBlank(quote)) {
				comps.add(Hex.decodeHex(quote.toCharArray()));

			}
		}
		return comps;
	}

	/**
	 * This API builds xref history table
	 * 
	 * @param rows
	 * @param dhsIdMap
	 * @param fileName
	 * @return
	 * @throws Exception
	 */
	public Set<XrefHistory> buildXrefHistory(CsvReader rows, Map<String, Long> dhsIdMap, String fileName)
			throws Exception {
		Set<XrefHistory> xrefhists = new HashSet<XrefHistory>();
		Map<String, Integer> colIdMap = dao.getColIdMap();
		rows.readHeaders();
		rows.getSkipEmptyRecords();
		List<String> fields = new ArrayList<String>();
		for (String _field : rows.getHeaders()) {
			fields.add(_field);
		}
		if (null != rows) {
			while (rows.readRecord()) {
				if (StringUtils.isNotBlank(rows.get("Quote_ID"))) {
					for (String _fieldName : fields) {
						if (!_fieldName.equalsIgnoreCase("CFI_Code")
								&& !_fieldName.equalsIgnoreCase("Financial_Instrument_Short_Name")
								&& !_fieldName.equalsIgnoreCase("ISIN") && !_fieldName.equalsIgnoreCase("Issuer_LEI")
								&& !_fieldName.equalsIgnoreCase("Market_MIC")
								&& !_fieldName.equalsIgnoreCase("Quote_Perm_ID")) {
							String column = _fieldName + IDHSLoaderConstants.CHANGE_FLAG;
							String _changeFlagValue = rows.get(column);

							if (_changeFlagValue != null && _changeFlagValue.equalsIgnoreCase("Y")) {
								String _fieldValue = rows.get(_fieldName);
								String _prevValue = rows.get(_fieldName + IDHSLoaderConstants.PREV_VALUE);
								if (StringUtils.isNotBlank(_fieldValue) || StringUtils.isNotBlank(_prevValue)) {
									XrefHistory Xhist = new XrefHistory();
									XrefHistoryId obj = new XrefHistoryId();

									String quoteid = rows.get("Quote_ID").replace("0x", "");
									byte[] quote = Hex.decodeHex(quoteid.toCharArray());

									if (dhsIdMap.containsKey(Hex.encodeHexString(quote))) {
										obj.setDhsid(dhsIdMap.get(Hex.encodeHexString(quote)));
									}
//									String date = ftpUtil.getDate();
//									int beginDate = Integer.valueOf(date);
									long fileDate = ftpUtil.getFileDate(fileName);
									obj.setColid(colIdMap.get(_fieldName));
									obj.setFilename(fileName);
									obj.setPrevvalue(_prevValue);
									obj.setValue(_fieldValue);
									obj.setRecordtype("DSP");
									obj.setTime(Calendar.getInstance());
									obj.setBegindate(fileDate);
									Xhist.setId(obj);
									xrefhists.add(Xhist);
								}
							}

						}
					}
				}
			}

		}
		return xrefhists;
	}

	/**
	 * This API reads First line of the flat file
	 * 
	 * @param filePath
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({ "resource", "rawtypes" })
	public String getFirstLine(String filePath) throws Exception {
		LOGGER.log(INFORMATIONAL, "File loading..");
		String tempdata = StringUtils.EMPTY;
		if (StringUtils.isNotBlank(filePath)) {
			ZipFile zip = new ZipFile(filePath);
			Enumeration e = zip.entries();
			while (e.hasMoreElements()) {
				ZipEntry entry = (ZipEntry) e.nextElement();
				if (!entry.isDirectory()) {
					if (FilenameUtils.getExtension(entry.getName()).equals("txt")) {
						InputStream inputStream = zip.getInputStream(entry);
						Reader reader = new InputStreamReader(inputStream);
						BufferedReader bufferedReader = new BufferedReader(reader);
						String line = "";
						int i = 0;
						while ((line = bufferedReader.readLine()) != null) {
							if (i == 0) {
								tempdata = line;
							}
							i++;
						}
						bufferedReader.close();

						LOGGER.log(INFORMATIONAL, "First line is {}", tempdata);
					}
				}
			}
		}
		return tempdata;
	}

	/**
	 * 
	 * @param dhsids
	 * @return
	 */
	public Map<String, Long> buildDHSIdMapByList(List<Object[]> dhsids) {
		Map<String, Long> dhsIdMap = new HashMap<String, Long>();
		if (null != dhsids && dhsids.size() > 0) {

			for (Object[] objs : dhsids) {
				long dhsid = 0;
				byte[] quoteid = null;

				if (null != objs[0]) {
					dhsid = ((BigDecimal) objs[0]).longValue();
				}
				if (null != objs[1]) {
					quoteid = (byte[]) objs[1];
				}

				if (quoteid != null) {
					dhsIdMap.put(Hex.encodeHexString(quoteid), dhsid);
				}
			}
		}
		return dhsIdMap;
	}

}
