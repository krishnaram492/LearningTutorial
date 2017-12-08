package com.app.dhsloader.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.dhsloader.dao.DHSLoaderDAO;
import com.app.dhsloader.dto.DHSComp;
import com.app.dhsloader.model.Dhsidmap;
import com.app.dhsloader.model.XrefDsp;
import com.app.dhsloader.model.XrefXxDsp;
import com.app.dhsloader.model.XrefXxDspId;
import com.csvreader.CsvReader;

/**
 * @author Ram
 * 
 */
@Component
public class DHSLoaderUtil {

	@Autowired
	private DHSLoaderDAO dao;

	/**
	 * 
	 * @param filePath
	 * @return
	 */
	@SuppressWarnings({ "resource", "rawtypes" })
	public CsvReader parseInputData(String filePath) throws Exception {

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
						csvReader = new CsvReader(bufferedReader, '|');
					}
				}
			}
			return csvReader;
		}
		return null;
	}

	/**
	 * 
	 * @param csvReader
	 * @return
	 * @throws Exception
	 */
	public synchronized List<XrefXxDsp> buildXrefXxDspData(CsvReader csvReader) throws Exception {

		List<XrefXxDsp> xrefDsps = new ArrayList<XrefXxDsp>();

		if (null != csvReader) {
			while (csvReader.readRecord()) {
				XrefXxDsp xrefXxDsp = new XrefXxDsp();

				XrefXxDspId obj = new XrefXxDspId();

				obj.setAction(csvReader.get("Action"));
				obj.setLevelcode(csvReader.get("Level"));
				obj.setIpc(csvReader.get("File_Code"));
				obj.setQuoteid(csvReader.get("Quote_ID"));
				obj.setRic(csvReader.get("RIC"));
				obj.setSedol(csvReader.get("SEDOL"));
				obj.setIssuepermid(csvReader.get("Issue_Perm_ID"));
				obj.setAssetid(csvReader.get("Asset_ID"));
				obj.setPilc(csvReader.get("PILC"));
				obj.setCusip(csvReader.get("CUSIP"));
				obj.setOrgpermid(csvReader.get("Organization_Perm_ID"));
				obj.setAssetstatus(csvReader.get("Asset_Status"));
				obj.setAssetstatuscf(csvReader.get("Asset_Status_-_Change_Flag"));
				obj.setAssetstatusp(csvReader.get("Asset_Status_-_Previous"));
				obj.setBasketundisinlist(csvReader.get("Basket_Underlying_ISIN_List"));
				obj.setBasketundisinlistcf(csvReader.get("Basket_Underlying_ISIN_List_-_Change_Flag"));
				obj.setBasketundisinlistp(csvReader.get("Basket_Underlying_ISIN_List_-_Previous"));
				obj.setBasketwrrindicator(csvReader.get("Basket_Warrant_Indicator"));
				obj.setBasketwrrindicatorcf(csvReader.get("Basket_Warrant_Indicator_-_Change_Flag"));
				obj.setBasketwrrindicatorp(csvReader.get("Basket_Warrant_Indicator_-_Previous"));
				obj.setCficode(csvReader.get("CFI_Code"));
				obj.setCficodecf(csvReader.get("CFI_Code_-_Change_Flag"));
				obj.setCficodep(csvReader.get("CFI_Code_-_Previous"));
				obj.setCincode(csvReader.get("CIN_Code"));
				obj.setCincodecf(csvReader.get("CIN_Code_-_Change_Flag"));
				obj.setCincodep(csvReader.get("CIN_Code_-_Previous"));
				obj.setComplegaldomicile(csvReader.get("Company_Legal_Domicile"));
				obj.setComplegaldomicilecf(csvReader.get("Company_Legal_Domicile_-_Change_Flag"));
				obj.setComplegaldomicilep(csvReader.get("Company_Legal_Domicile_-_Previous"));
				obj.setCompshortname(csvReader.get("Company_Short_Name"));
				obj.setCompshortnamecf(csvReader.get("Company_Short_Name_-_Change_Flag"));
				obj.setCompshortnamep(csvReader.get("Company_Short_Name_-_Previous"));
				obj.setDealstartdate(csvReader.get("Deal_Start_Date"));
				obj.setDealstartdatecf(csvReader.get("Deal_Start_Date_-_Change_Flag"));
				obj.setDealstartdatep(csvReader.get("Deal_Start_Date_-_Previous"));
				obj.setEeavenueelflg(csvReader.get("EEA_Venue_Eligible_Flag"));
				obj.setEeavenueelflgcf(csvReader.get("EEA_Venue_Eligible_Flag_-_Change_Flag"));
				obj.setEeavenueelflgp(csvReader.get("EEA_Venue_Eligible_Flag_-_Previous"));
				obj.setFininsshname(csvReader.get("Financial_Instrument_Short_Name"));
				obj.setFininsshnamecf(csvReader.get("Financial_Instrument_Short_Name_-_Change_Flag"));
				obj.setFininsshnamep(csvReader.get("Financial_Instrument_Short_Name_-_Previous"));
				obj.setFininsshnameesma(csvReader.get("Financial_Instrument_Short_Name_-_ESMA"));
				obj.setFininsshnameesmacf(csvReader.get("Financial_Instrument_Short_Name_-_ESMA_-_Change_Flag"));
				obj.setFininsshnameesmap(csvReader.get("Financial_Instrument_Short_Name_-_ESMA_-_Previous"));
				obj.setInesmafirds(csvReader.get("In_ESMA_FIRDS"));
				obj.setInesmafirdscf(csvReader.get("In_ESMA_FIRDS_-_Change_Flag"));
				obj.setInesmafirdsp(csvReader.get("In_ESMA_FIRDS_-_Previous"));
				obj.setInsclassesma(csvReader.get("Instrument_Classification_-_ESMA"));
				obj.setInsclassesmacf(csvReader.get("Instrument_Classification_-_ESMA_-_Change_Flag"));
				obj.setInsclassesmap(csvReader.get("Instrument_Classification_-_ESMA_-_Previous"));
				obj.setInsfullnameesma(csvReader.get("Instrument_Full_Name_-_ESMA"));
				obj.setInsfullnameesmacf(csvReader.get("Instrument_Full_Name_-_ESMA_-_Change_Flag"));
				obj.setInsfullnameesmap(csvReader.get("Instrument_Full_Name_-_ESMA_-_Previous"));
				obj.setIsin(csvReader.get("ISIN"));
				obj.setIsincf(csvReader.get("ISIN_-_Change_Flag"));
				obj.setIsinp(csvReader.get("ISIN_-_Previous"));
				obj.setIssuedate(csvReader.get("Issue_Date"));
				obj.setIssuedatecf(csvReader.get("Issue_Date_-_Change_Flag"));
				obj.setIssuedatep(csvReader.get("Issue_Date_-_Previous"));
				obj.setIssuerlei(csvReader.get("Issuer_LEI"));
				obj.setIssuerleicf(csvReader.get("Issuer_LEI_-_Change_Flag"));
				obj.setIssuerleip(csvReader.get("Issuer_LEI_-_Previous"));
				obj.setIssortrvenueleiesma(csvReader.get("Issuer_or_Trading_Venue_LEI_-_ESMA"));
				obj.setIssortrvenueleiesmacf(csvReader.get("Issuer_or_Trading_Venue_LEI_-_ESMA_-_Change_Flag"));
				obj.setIssortrvenueleiesmap(csvReader.get("Issuer_or_Trading_Venue_LEI_-_ESMA_-_Previous"));
				obj.setMrkattsrcpermid(csvReader.get("Market_Attributable_Source_Perm_ID"));
				obj.setMrkattsrcpermidcf(csvReader.get("Market_Attributable_Source_Perm_ID_-_Change_Flag"));
				obj.setMrkattsrcpermidp(csvReader.get("Market_Attributable_Source_Perm_ID_-_Previous"));
				obj.setMarketmic(csvReader.get("Market_MIC"));
				obj.setMarketmiccf(csvReader.get("Market_MIC_-_Change_Flag"));
				obj.setMarketmicp(csvReader.get("Market_MIC_-_Previous"));
				obj.setMaturitydate(csvReader.get("Maturity_Date"));
				obj.setMaturitydatecf(csvReader.get("Maturity_Date_-_Change_Flag"));
				obj.setMaturitydatep(csvReader.get("Maturity_Date_-_Previous"));
				obj.setMifidasclofun(csvReader.get("MiFID_Asset_Class_of_Underlying"));
				obj.setMifidasclofuncf(csvReader.get("MiFID_Asset_Class_of_Underlying_-_Change_Flag"));
				obj.setMifidasclofunp(csvReader.get("MiFID_Asset_Class_of_Underlying_-_Previous"));
				obj.setMifidadnapinsesma(csvReader.get("MiFID_Average_Daily_Notional_Amount_per_instrument_-_ESMA"));
				obj.setMifidadnapinsesmacf(csvReader.get("MiFID_Average_Daily_Notional_Amount_per_instrument_-_ESMA_-_Change_Flag"));
				obj.setMifidadnapinsesmap(csvReader.get("MiFID_Average_Daily_Notional_Amount_per_instrument_-_ESMA_-_Previous"));
				obj.setMifidadnoftpinsesma(csvReader.get("MiFID_Average_Daily_number_of_Trades_per_instrument_-_ESMA"));
				obj.setMifidadnoftpinsesmacf(csvReader.get("MiFID_Average_Daily_number_of_Trades_per_instrument_-_ESMA_-_Change_Flag"));
				obj.setMifidadnoftpinsesmap(csvReader.get("MiFID_Average_Daily_number_of_Trades_per_instrument_-_ESMA_-_Previous"));
				obj.setMifidavdatuesma(csvReader.get("MiFID_Average_Daily_Turnover_-_ESMA"));
				obj.setMifidavdatuesmacf(csvReader.get("MiFID_Average_Daily_Turnover_-_ESMA_-_Change_Flag"));
				obj.setMifidavdatuesmap(csvReader.get("MiFID_Average_Daily_Turnover_-_ESMA_-_Previous"));
				obj.setMifidavdatucurcode(csvReader.get("MiFID_Average_Daily_Turnover_Currency_Code"));
				obj.setMifidavdatucurcodecf(csvReader.get("MiFID_Average_Daily_Turnover_Currency_Code_-_Change_Flag"));
				obj.setMifidavdatucurcodep(csvReader.get("MiFID_Average_Daily_Turnover_Currency_Code_-_Previous"));
				obj.setMifidavvaoftresma(csvReader.get("MiFID_Average_Value_Of_Transactions_-_ESMA"));
				obj.setMifidavvaoftresmacf(csvReader.get("MiFID_Average_Value_Of_Transactions_-_ESMA_-_Change_Flag"));
				obj.setMifidavvaoftresmap(csvReader.get("MiFID_Average_Value_Of_Transactions_-_ESMA_-_Previous"));
				obj.setMifidavvaoftrcurcode(csvReader.get("MiFID_Average_Value_Of_Transactions_Currency_Code"));
				obj.setMifidavvaoftrcurcodecf(csvReader.get("MiFID_Average_Value_Of_Transactions_Currency_Code_-_Change_Flag"));
				obj.setMifidavvaoftrcurcodep(csvReader.get("MiFID_Average_Value_Of_Transactions_Currency_Code_-_Previous"));
				obj.setMifidbaseprod(csvReader.get("MiFID_Base_Product"));
				obj.setMifidbaseprodcf(csvReader.get("MiFID_Base_Product_-_Change_Flag"));
				obj.setMifidbaseprodp(csvReader.get("MiFID_Base_Product_-_Previous"));
				obj.setMifidbaseprodesma(csvReader.get("MiFID_Base_Product_-_ESMA"));
				obj.setMifidbaseprodesmacf(csvReader.get("MiFID_Base_Product_-_ESMA_-_Change_Flag"));
				obj.setMifidbaseprodesmap(csvReader.get("MiFID_Base_Product_-_ESMA_-_Previous"));
				obj.setMifidbondseni(csvReader.get("MiFID_Bond_Seniority"));
				obj.setMifidbondsenicf(csvReader.get("MiFID_Bond_Seniority_-_Change_Flag"));
				obj.setMifidbondsenip(csvReader.get("MiFID_Bond_Seniority_-_Previous"));
				obj.setMifidbondtype(csvReader.get("MiFID_Bond_Type"));
				obj.setMifidbondtypecf(csvReader.get("MiFID_Bond_Type_-_Change_Flag"));
				obj.setMifidbondtypep(csvReader.get("MiFID_Bond_Type_-_Previous"));
				obj.setMifidclobflag(csvReader.get("MiFID_Clearing_Obligation_Flag"));
				obj.setMifidclobflagcf(csvReader.get("MiFID_Clearing_Obligation_Flag_-_Change_Flag"));
				obj.setMifidclobflagp(csvReader.get("MiFID_Clearing_Obligation_Flag_-_Previous"));
				obj.setMifidcofialiinfornewbo(csvReader.get("MiFID_COFIA_Liquidity_Flag"));
				obj.setMifidcofialiinfornewbocf(csvReader.get("MiFID_COFIA_Liquidity_Flag_-_Change_Flag"));
				obj.setMifidcofialiinfornewbop(csvReader.get("MiFID_COFIA_Liquidity_Flag_-_Previous"));
				obj.setMifidcodein(csvReader.get("MiFID_Commodities_Derivative_Indicator"));
				obj.setMifidcodeincf(csvReader.get("MiFID_Commodities_Derivative_Indicator_-_Change_Flag"));
				obj.setMifidcodeinp(csvReader.get("MiFID_Commodities_Derivative_Indicator_-_Previous"));
				obj.setMifidcodeinesma(csvReader.get("MiFID_Commodities_Derivative_Indicator_-_ESMA"));
				obj.setMifidcodeinesmacf(csvReader.get("MiFID_Commodities_Derivative_Indicator_-_ESMA_-_Change_Flag"));
				obj.setMifidcodeinesmap(csvReader.get("MiFID_Commodities_Derivative_Indicator_-_ESMA_-_Previous"));
				obj.setMifidcoinflesma(csvReader.get("MiFID_Complex_Instrument_Flag_-_ESMA"));
				obj.setMifidcoinflesmacf(csvReader.get("MiFID_Complex_Instrument_Flag_-_ESMA_-_Change_Flag"));
				obj.setMifidcoinflesmap(csvReader.get("MiFID_Complex_Instrument_Flag_-_ESMA_-_Previous"));
				obj.setMifidcoinre(csvReader.get("MiFID_Complex_Instrument_Reason"));
				obj.setMifidcoinrecf(csvReader.get("MiFID_Complex_Instrument_Reason_-_Change_Flag"));
				obj.setMifidcoinrep(csvReader.get("MiFID_Complex_Instrument_Reason_-_Previous"));
				obj.setMifidcotype(csvReader.get("MiFID_Contract_Type"));
				obj.setMifidcotypecf(csvReader.get("MiFID_Contract_Type_-_Change_Flag"));
				obj.setMifidcotypep(csvReader.get("MiFID_Contract_Type_-_Previous"));
				obj.setMifiddeltypeesma(csvReader.get("MiFID_Delivery_Type_-_ESMA"));
				obj.setMifiddeltypeesmacf(csvReader.get("MiFID_Delivery_Type_-_ESMA_-_Change_Flag"));
				obj.setMifiddeltypeesmap(csvReader.get("MiFID_Delivery_Type_-_ESMA_-_Previous"));
				obj.setMifidemalsubtype(csvReader.get("MiFID_Emissions_Allowances_Sub_Type"));
				obj.setMifidemalsubtypecf(csvReader.get("MiFID_Emissions_Allowances_Sub_Type_-_Change_Flag"));
				obj.setMifidemalsubtypep(csvReader.get("MiFID_Emissions_Allowances_Sub_Type_-_Previous"));
				obj.setMifidexerstyle(csvReader.get("MiFID_Exercise_Style"));
				obj.setMifidexerstylecf(csvReader.get("MiFID_Exercise_Style_-_Change_Flag"));
				obj.setMifidexerstylep(csvReader.get("MiFID_Exercise_Style_-_Previous"));
				obj.setMifidexerstyleesma(csvReader.get("MiFID_Exercise_Style_-_ESMA"));
				obj.setMifidexerstyleesmacf(csvReader.get("MiFID_Exercise_Style_-_ESMA_-_Change_Flag"));
				obj.setMifidexerstyleesmap(csvReader.get("MiFID_Exercise_Style_-_ESMA_-_Previous"));
				obj.setMifidexpdateesma(csvReader.get("MiFID_Expiration_Date_-_ESMA"));
				obj.setMifidexpdateesmacf(csvReader.get("MiFID_Expiration_Date_-_ESMA_-_Change_Flag"));
				obj.setMifidexpdateesmap(csvReader.get("MiFID_Expiration_Date_-_ESMA_-_Previous"));
				obj.setMifidfiprtype(csvReader.get("MiFID_Final_Price_Type"));
				obj.setMifidfiprtypecf(csvReader.get("MiFID_Final_Price_Type_-_Change_Flag"));
				obj.setMifidfiprtypep(csvReader.get("MiFID_Final_Price_Type_-_Previous"));
				obj.setMifidfiprtypeesma(csvReader.get("MiFID_Final_Price_Type_-_ESMA"));
				obj.setMifidfiprtypeesmacf(csvReader.get("MiFID_Final_Price_Type_-_ESMA_-_Change_Flag"));
				obj.setMifidfiprtypeesmap(csvReader.get("MiFID_Final_Price_Type_-_ESMA_-_Previous"));
				obj.setMifidfrtradedate(csvReader.get("MiFID_First_Trade_Date"));
				obj.setMifidfrtradedatecf(csvReader.get("MiFID_First_Trade_Date_-_Change_Flag"));
				obj.setMifidfrtradedatep(csvReader.get("MiFID_First_Trade_Date_-_Previous"));
				obj.setMifidfrtradedateesma(csvReader.get("MiFID_First_Trade_Date_-_ESMA"));
				obj.setMifidfrtradedateesmacf(csvReader.get("MiFID_First_Trade_Date_-_ESMA_-_Change_Flag"));
				obj.setMifidfrtradedateesmap(csvReader.get("MiFID_First_Trade_Date_-_ESMA_-_Previous"));
				obj.setMifidflag(csvReader.get("MiFID_Flag"));
				obj.setMifidflagcf(csvReader.get("MiFID_Flag_-_Change_Flag"));
				obj.setMifidflagp(csvReader.get("MiFID_Flag_-_Previous"));
				obj.setMifidfrfloatesma(csvReader.get("MiFID_Free_Float_-_ESMA"));
				obj.setMifidfrfloatesmacf(csvReader.get("MiFID_Free_Float_-_ESMA_-_Change_Flag"));
				obj.setMifidfrfloatesmap(csvReader.get("MiFID_Free_Float_-_ESMA_-_Previous"));
				obj.setMifidfrfloatcurcode(csvReader.get("MiFID_Free_Float_Currency_Code"));
				obj.setMifidfrfloatcurcodecf(csvReader.get("MiFID_Free_Float_Currency_Code_-_Change_Flag"));
				obj.setMifidfrfloatcurcodep(csvReader.get("MiFID_Free_Float_Currency_Code_-_Previous"));
				obj.setMifidfusubpr(csvReader.get("MiFID_Further_Sub_Product"));
				obj.setMifidfusubprcf(csvReader.get("MiFID_Further_Sub_Product_-_Change_Flag"));
				obj.setMifidfusubprp(csvReader.get("MiFID_Further_Sub_Product_-_Previous"));
				obj.setMifidfusubpresma(csvReader.get("MiFID_Further_Sub_Product_-_ESMA"));
				obj.setMifidfusubpresmacf(csvReader.get("MiFID_Further_Sub_Product_-_ESMA_-_Change_Flag"));
				obj.setMifidfusubpresmap(csvReader.get("MiFID_Further_Sub_Product_-_ESMA_-_Previous"));
				obj.setMifidissdateesma(csvReader.get("MiFID_Issuance_Date_-_ESMA"));
				obj.setMifidissdateesmacf(csvReader.get("MiFID_Issuance_Date_-_ESMA_-_Change_Flag"));
				obj.setMifidissdateesmap(csvReader.get("MiFID_Issuance_Date_-_ESMA_-_Previous"));
				obj.setMifidisssizeesma(csvReader.get("MiFID_Issuance_Size_-_ESMA"));
				obj.setMifidisssizeesmacf(csvReader.get("MiFID_Issuance_Size_-_ESMA_-_Change_Flag"));
				obj.setMifidisssizeesmap(csvReader.get("MiFID_Issuance_Size_-_ESMA_-_Previous"));
				obj.setMifidmatdate(csvReader.get("MiFID_Maturity_Date"));
				obj.setMifidmatdatecf(csvReader.get("MiFID_Maturity_Date_-_Change_Flag"));
				obj.setMifidmatdatep(csvReader.get("MiFID_Maturity_Date_-_Previous"));
				obj.setMifidmatdateesma(csvReader.get("MiFID_Maturity_Date_-_ESMA"));
				obj.setMifidmatdateesmacf(csvReader.get("MiFID_Maturity_Date_-_ESMA_-_Change_Flag"));
				obj.setMifidmatdateesmap(csvReader.get("MiFID_Maturity_Date_-_ESMA_-_Previous"));
				obj.setMifidmostremaesma(csvReader.get("MiFID_Most_Relevant_Market_-_ESMA"));
				obj.setMifidmostremaesmacf(csvReader.get("MiFID_Most_Relevant_Market_-_ESMA_-_Change_Flag"));
				obj.setMifidmostremaesmap(csvReader.get("MiFID_Most_Relevant_Market_-_ESMA_-_Previous"));
				obj.setMifidoptype(csvReader.get("MiFID_Option_Type"));
				obj.setMifidoptypecf(csvReader.get("MiFID_Option_Type_-_Change_Flag"));
				obj.setMifidoptypep(csvReader.get("MiFID_Option_Type_-_Previous"));
				obj.setMifidoptypeesma(csvReader.get("MiFID_Option_Type_-_ESMA"));
				obj.setMifidoptypeesmacf(csvReader.get("MiFID_Option_Type_-_ESMA_-_Change_Flag"));
				obj.setMifidoptypeesmap(csvReader.get("MiFID_Option_Type_-_ESMA_-_Previous"));
				obj.setMifidptuw12esma(csvReader.get("MiFID_Percent_Trading_Under_Waivers_12_Month_-_ESMA"));
				obj.setMifidptuw12esmacf(csvReader.get("MiFID_Percent_Trading_Under_Waivers_12_Month_-_ESMA_-_Change_Flag"));
				obj.setMifidptuw12esmap(csvReader.get("MiFID_Percent_Trading_Under_Waivers_12_Month_-_ESMA_-_Previous"));
				obj.setMifidptuwptv12mesma(csvReader.get("MiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month_-_ESMA"));
				obj.setMifidptuwptv12mesmacf(csvReader.get("MiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month_-_ESMA_-_Change_Flag"));
				obj.setMifidptuwptv12mesmap(csvReader.get("MiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month_-_ESMA_-_Previous"));
				obj.setMifidpotrlisthfl(csvReader.get("MiFID_Post_Trade_LIS_Threshold_Floor"));
				obj.setMifidpotrlisthflcf(csvReader.get("MiFID_Post_Trade_LIS_Threshold_Floor_-_Change_Flag"));
				obj.setMifidpotrlisthflp(csvReader.get("MiFID_Post_Trade_LIS_Threshold_Floor_-_Previous"));
				obj.setMifidpotrlisthvl(csvReader.get("MiFID_Post_Trade_LIS_Threshold_Value"));
				obj.setMifidpotrlisthvlcf(csvReader.get("MiFID_Post_Trade_LIS_Threshold_Value_-_Change_Flag"));
				obj.setMifidpotrlisthvlp(csvReader.get("MiFID_Post_Trade_LIS_Threshold_Value_-_Previous"));
				obj.setMifidpotrlistrper(csvReader.get("MiFID_Post_Trade_LIS_Trade_Percentile"));
				obj.setMifidpotrlistrpercf(csvReader.get("MiFID_Post_Trade_LIS_Trade_Percentile_-_Change_Flag"));
				obj.setMifidpotrlistrperp(csvReader.get("MiFID_Post_Trade_LIS_Trade_Percentile_-_Previous"));
				obj.setMifidpotrlisvoper(csvReader.get("MiFID_Post_Trade_LIS_Volume_Percentile"));
				obj.setMifidpotrlisvopercf(csvReader.get("MiFID_Post_Trade_LIS_Volume_Percentile_-_Change_Flag"));
				obj.setMifidpotrlisvoperp(csvReader.get("MiFID_Post_Trade_LIS_Volume_Percentile_-_Previous"));
				obj.setMifidpotrsstithfl(csvReader.get("MiFID_Post_Trade_SSTI_Threshold_Floor"));
				obj.setMifidpotrsstithflcf(csvReader.get("MiFID_Post_Trade_SSTI_Threshold_Floor_-_Change_Flag"));
				obj.setMifidpotrsstithflp(csvReader.get("MiFID_Post_Trade_SSTI_Threshold_Floor_-_Previous"));
				obj.setMifidpotrsstithvl(csvReader.get("MiFID_Post_Trade_SSTI_Threshold_Value"));
				obj.setMifidpotrsstithvlcf(csvReader.get("MiFID_Post_Trade_SSTI_Threshold_Value_-_Change_Flag"));
				obj.setMifidpotrsstithvlp(csvReader.get("MiFID_Post_Trade_SSTI_Threshold_Value_-_Previous"));
				obj.setMifidpotrsstitrper(csvReader.get("MiFID_Post_Trade_SSTI_Trade_Percentile"));
				obj.setMifidpotrsstitrpercf(csvReader.get("MiFID_Post_Trade_SSTI_Trade_Percentile_-_Change_Flag"));
				obj.setMifidpotrsstitrperp(csvReader.get("MiFID_Post_Trade_SSTI_Trade_Percentile_-_Previous"));
				obj.setMifidpotrsstivoper(csvReader.get("MiFID_Post_Trade_SSTI_Volume_Percentile"));
				obj.setMifidpotrsstivopercf(csvReader.get("MiFID_Post_Trade_SSTI_Volume_Percentile_-_Change_Flag"));
				obj.setMifidpotrsstivoperp(csvReader.get("MiFID_Post_Trade_SSTI_Volume_Percentile_-_Previous"));
				obj.setMifidpretrlisthfl(csvReader.get("MiFID_Pre_Trade_LIS_Threshold_Floor"));
				obj.setMifidpretrlisthflcf(csvReader.get("MiFID_Pre_Trade_LIS_Threshold_Floor_-_Change_Flag"));
				obj.setMifidpretrlisthflp(csvReader.get("MiFID_Pre_Trade_LIS_Threshold_Floor_-_Previous"));
				obj.setMifidpretrlisthvl(csvReader.get("MiFID_Pre_Trade_LIS_Threshold_Value"));
				obj.setMifidpretrlisthvlcf(csvReader.get("MiFID_Pre_Trade_LIS_Threshold_Value_-_Change_Flag"));
				obj.setMifidpretrlisthvlp(csvReader.get("MiFID_Pre_Trade_LIS_Threshold_Value_-_Previous"));
				obj.setMifidpretrlistrper(csvReader.get("MiFID_Pre_Trade_LIS_Trade_Percentile"));
				obj.setMifidpretrlistrpercf(csvReader.get("MiFID_Pre_Trade_LIS_Trade_Percentile_-_Change_Flag"));
				obj.setMifidpretrlistrperp(csvReader.get("MiFID_Pre_Trade_LIS_Trade_Percentile_-_Previous"));
				obj.setMifidpretrsstithfl(csvReader.get("MiFID_Pre_Trade_SSTI_Threshold_Floor"));
				obj.setMifidpretrsstithflcf(csvReader.get("MiFID_Pre_Trade_SSTI_Threshold_Floor_-_Change_Flag"));
				obj.setMifidpretrsstithflp(csvReader.get("MiFID_Pre_Trade_SSTI_Threshold_Floor_-_Previous"));
				obj.setMifidpretrsstithvl(csvReader.get("MiFID_Pre_Trade_SSTI_Threshold_Value"));
				obj.setMifidpretrsstithvlcf(csvReader.get("MiFID_Pre_Trade_SSTI_Threshold_Value_-_Change_Flag"));
				obj.setMifidpretrsstithvlp(csvReader.get("MiFID_Pre_Trade_SSTI_Threshold_Value_-_Previous"));
				obj.setMifidpretrsstitrper(csvReader.get("MiFID_Pre_Trade_SSTI_Trade_Percentile"));
				obj.setMifidpretrsstitrpercf(csvReader.get("MiFID_Pre_Trade_SSTI_Trade_Percentile_-_Change_Flag"));
				obj.setMifidpretrsstitrperp(csvReader.get("MiFID_Pre_Trade_SSTI_Trade_Percentile_-_Previous"));
				obj.setMifidregulatedesma(csvReader.get("MiFID_Regulated_-_ESMA"));
				obj.setMifidregulatedesmacf(csvReader.get("MiFID_Regulated_-_ESMA_-_Change_Flag"));
				obj.setMifidregulatedesmap(csvReader.get("MiFID_Regulated_-_ESMA_-_Previous"));
				obj.setMifidstmasizeesma(csvReader.get("MiFID_Standard_Market_Size_-_ESMA"));
				obj.setMifidstmasizeesmacf(csvReader.get("MiFID_Standard_Market_Size_-_ESMA_-_Change_Flag"));
				obj.setMifidstmasizeesmap(csvReader.get("MiFID_Standard_Market_Size_-_ESMA_-_Previous"));
				obj.setMifidstmasizecurcode(csvReader.get("MiFID_Standard_Market_Size_Currency_Code"));
				obj.setMifidstmasizecurcodecf(csvReader.get("MiFID_Standard_Market_Size_Currency_Code_-_Change_Flag"));
				obj.setMifidstmasizecurcodep(csvReader.get("MiFID_Standard_Market_Size_Currency_Code_-_Previous"));
				obj.setMifidsubprod(csvReader.get("MiFID_Sub_Product"));
				obj.setMifidsubprodcf(csvReader.get("MiFID_Sub_Product_-_Change_Flag"));
				obj.setMifidsubprodp(csvReader.get("MiFID_Sub_Product_-_Previous"));
				obj.setMifidsubprodesma(csvReader.get("MiFID_Sub_Product_-_ESMA"));
				obj.setMifidsubprodesmacf(csvReader.get("MiFID_Sub_Product_-_ESMA_-_Change_Flag"));
				obj.setMifidsubprodesmap(csvReader.get("MiFID_Sub_Product_-_ESMA_-_Previous"));
				obj.setMifidtermdate(csvReader.get("MiFID_Termination_Date"));
				obj.setMifidtermdatecf(csvReader.get("MiFID_Termination_Date_-_Change_Flag"));
				obj.setMifidtermdatep(csvReader.get("MiFID_Termination_Date_-_Previous"));
				obj.setMifidtermdateesma(csvReader.get("MiFID_Termination_Date_-_ESMA"));
				obj.setMifidtermdateesmacf(csvReader.get("MiFID_Termination_Date_-_ESMA_-_Change_Flag"));
				obj.setMifidtermdateesmap(csvReader.get("MiFID_Termination_Date_-_ESMA_-_Previous"));
				obj.setMifidtrobflag(csvReader.get("MiFID_Trade_Obligation_Flag"));
				obj.setMifidtrobflagcf(csvReader.get("MiFID_Trade_Obligation_Flag_-_Change_Flag"));
				obj.setMifidtrobflagp(csvReader.get("MiFID_Trade_Obligation_Flag_-_Previous"));
				obj.setMifidtradapdate(csvReader.get("MiFID_Trading_Admission_Approval_Date"));
				obj.setMifidtradapdatecf(csvReader.get("MiFID_Trading_Admission_Approval_Date_-_Change_Flag"));
				obj.setMifidtradapdatep(csvReader.get("MiFID_Trading_Admission_Approval_Date_-_Previous"));
				obj.setMifidtradapdateesma(csvReader.get("MiFID_Trading_Admission_Approval_Date_-_ESMA"));
				obj.setMifidtradapdateesmacf(csvReader.get("MiFID_Trading_Admission_Approval_Date_-_ESMA_-_Change_Flag"));
				obj.setMifidtradapdateesmap(csvReader.get("MiFID_Trading_Admission_Approval_Date_-_ESMA_-_Previous"));
				obj.setMifidtradreqdate(csvReader.get("MiFID_Trading_Admission_Request_Date"));
				obj.setMifidtradreqdatecf(csvReader.get("MiFID_Trading_Admission_Request_Date_-_Change_Flag"));
				obj.setMifidtradreqdatep(csvReader.get("MiFID_Trading_Admission_Request_Date_-_Previous"));
				obj.setMifidtradreqdateesma(csvReader.get("MiFID_Trading_Admission_Request_Date_-_ESMA"));
				obj.setMifidtradreqdateesmacf(csvReader.get("MiFID_Trading_Admission_Request_Date_-_ESMA_-_Change_Flag"));
				obj.setMifidtradreqdateesmap(csvReader.get("MiFID_Trading_Admission_Request_Date_-_ESMA_-_Previous"));
				obj.setMifidtrtype(csvReader.get("MiFID_Transaction_Type"));
				obj.setMifidtrtypecf(csvReader.get("MiFID_Transaction_Type_-_Change_Flag"));
				obj.setMifidtrtypep(csvReader.get("MiFID_Transaction_Type_-_Previous"));
				obj.setMifidtrtypeesma(csvReader.get("MiFID_Transaction_Type_-_ESMA"));
				obj.setMifidtrtypeesmacf(csvReader.get("MiFID_Transaction_Type_-_ESMA_-_Change_Flag"));
				obj.setMifidtrtypeesmap(csvReader.get("MiFID_Transaction_Type_-_ESMA_-_Previous"));
				obj.setMifidundindname(csvReader.get("MiFID_Underlying_Index_Name"));
				obj.setMifidundindnamecf(csvReader.get("MiFID_Underlying_Index_Name_-_Change_Flag"));
				obj.setMifidundindnamep(csvReader.get("MiFID_Underlying_Index_Name_-_Previous"));
				obj.setMifidundindnameesma(csvReader.get("MiFID_Underlying_Index_Name_-_ESMA"));
				obj.setMifidundindnameesmacf(csvReader.get("MiFID_Underlying_Index_Name_-_ESMA_-_Change_Flag"));
				obj.setMifidundindnameesmap(csvReader.get("MiFID_Underlying_Index_Name_-_ESMA_-_Previous"));
				obj.setMifidundindtermesma(csvReader.get("MiFID_Underlying_Index_Term_-_ESMA"));
				obj.setMifidundindtermesmacf(csvReader.get("MiFID_Underlying_Index_Term_-_ESMA_-_Change_Flag"));
				obj.setMifidundindtermesmap(csvReader.get("MiFID_Underlying_Index_Term_-_ESMA_-_Previous"));
				obj.setMifidundtype(csvReader.get("MiFID_Underlying_Type"));
				obj.setMifidundtypecf(csvReader.get("MiFID_Underlying_Type_-_Change_Flag"));
				obj.setMifidundtypep(csvReader.get("MiFID_Underlying_Type_-_Previous"));
				obj.setMifiridentifier(csvReader.get("MIFIR_Identifier"));
				obj.setMifiridentifiercf(csvReader.get("MIFIR_Identifier_-_Change_Flag"));
				obj.setMifiridentifierp(csvReader.get("MIFIR_Identifier_-_Previous"));
				obj.setMindenomination(csvReader.get("Minimum_Denomination"));
				obj.setMindenominationcf(csvReader.get("Minimum_Denomination_-_Change_Flag"));
				obj.setMindenominationp(csvReader.get("Minimum_Denomination_-_Previous"));
				obj.setNcaavdailyturnover(csvReader.get("NCA_Average_Daily_Turnover"));
				obj.setNcaavdailyturnovercf(csvReader.get("NCA_Average_Daily_Turnover_-_Change_Flag"));
				obj.setNcaavdailyturnoverp(csvReader.get("NCA_Average_Daily_Turnover_-_Previous"));
				obj.setNcaavdailyturncurcode(csvReader.get("NCA_Average_Daily_Turnover_Currency_Code"));
				obj.setNcaavdailyturncurcodecf(csvReader.get("NCA_Average_Daily_Turnover_Currency_Code_-_Change_Flag"));
				obj.setNcaavdailyturncurcodep(csvReader.get("NCA_Average_Daily_Turnover_Currency_Code_-_Previous"));
				obj.setNcafreefl(csvReader.get("NCA_Free_Float"));
				obj.setNcafreeflcf(csvReader.get("NCA_Free_Float_-_Change_Flag"));
				obj.setNcafreeflp(csvReader.get("NCA_Free_Float_-_Previous"));
				obj.setNcafreeflcurcode(csvReader.get("NCA_Free_Float_Currency_Code"));
				obj.setNcafreeflcurcodecf(csvReader.get("NCA_Free_Float_Currency_Code_-_Change_Flag"));
				obj.setNcafreeflcurcodep(csvReader.get("NCA_Free_Float_Currency_Code_-_Previous"));
				obj.setNotionalcuresma(csvReader.get("Notional_Currency_-_ESMA"));
				obj.setNotionalcuresmacf(csvReader.get("Notional_Currency_-_ESMA_-_Change_Flag"));
				obj.setNotionalcuresmap(csvReader.get("Notional_Currency_-_ESMA_-_Previous"));
				obj.setOptionroot(csvReader.get("Option_root"));
				obj.setOptionrootcf(csvReader.get("Option_root_-_Change_Flag"));
				obj.setOptionrootp(csvReader.get("Option_root_-_Previous"));
				obj.setPlaceholder(csvReader.get("Placeholder"));
				obj.setPricemultiplieresma(csvReader.get("Price_Multiplier_-_ESMA"));
				obj.setPricemultiplieresmacf(csvReader.get("Price_Multiplier_-_ESMA_-_Change_Flag"));
				obj.setPricemultiplieresmap(csvReader.get("Price_Multiplier_-_ESMA_-_Previous"));
				obj.setPrtrmaquote(csvReader.get("Primary_Tradable_Market_Quote"));
				obj.setPrtrmaquotecf(csvReader.get("Primary_Tradable_Market_Quote_-_Change_Flag"));
				obj.setPrtrmaquotep(csvReader.get("Primary_Tradable_Market_Quote_-_Previous"));
				obj.setQuotepermid(csvReader.get("Quote_Perm_ID"));
				obj.setQuotepermidcf(csvReader.get("Quote_Perm_ID_-_Change_Flag"));
				obj.setQuotepermidp(csvReader.get("Quote_Perm_ID_-_Previous"));
				obj.setReqfattbyissuer(csvReader.get("Request_for_Admission_to_Trading_by_Issuer"));
				obj.setReqfattbyissuercf(csvReader.get("Request_for_Admission_to_Trading_by_Issuer_-_Change_Flag"));
				obj.setReqfattbyissuerp(csvReader.get("Request_for_Admission_to_Trading_by_Issuer_-_Previous"));
				obj.setReqfattbyissueresma(csvReader.get("Request_for_Admission_to_Trading_by_Issuer_-_ESMA"));
				obj.setReqfattbyissueresmacf(csvReader.get("Request_for_Admission_to_Trading_by_Issuer_-_ESMA_-_Change_Flag"));
				obj.setReqfattbyissueresmap(csvReader.get("Request_for_Admission_to_Trading_by_Issuer_-_ESMA_-_Previous"));
				obj.setSecuritydescription(csvReader.get("Security_Description"));
				obj.setSecuritydescriptioncf(csvReader.get("Security_Description_-_Change_Flag"));
				obj.setSecuritydescriptionp(csvReader.get("Security_Description_-_Previous"));
				obj.setStrikepriceesma(csvReader.get("Strike_Price_-_ESMA"));
				obj.setStrikepriceesmacf(csvReader.get("Strike_Price_-_ESMA_-_Change_Flag"));
				obj.setStrikepriceesmap(csvReader.get("Strike_Price_-_ESMA_-_Previous"));
				obj.setStrikepricecuresma(csvReader.get("Strike_Price_Currency_-_ESMA"));
				obj.setStrikepricecuresmacf(csvReader.get("Strike_Price_Currency_-_ESMA_-_Change_Flag"));
				obj.setStrikepricecuresmap(csvReader.get("Strike_Price_Currency_-_ESMA_-_Previous"));
				obj.setSuscategoryesma(csvReader.get("Suspension_Category_-_ESMA"));
				obj.setSuscategoryesmacf(csvReader.get("Suspension_Category_-_ESMA_-_Change_Flag"));
				obj.setSuscategoryesmap(csvReader.get("Suspension_Category_-_ESMA_-_Previous"));
				obj.setSusendedonesma(csvReader.get("Suspension_Ended_On_-_ESMA"));
				obj.setSusendedonesmacf(csvReader.get("Suspension_Ended_On_-_ESMA_-_Change_Flag"));
				obj.setSusendedonesmap(csvReader.get("Suspension_Ended_On_-_ESMA_-_Previous"));
				obj.setSusongoingesma(csvReader.get("Suspension_On_Going_-_ESMA"));
				obj.setSusongoingesmacf(csvReader.get("Suspension_On_Going_-_ESMA_-_Change_Flag"));
				obj.setSusongoingesmap(csvReader.get("Suspension_On_Going_-_ESMA_-_Previous"));
				obj.setSusratesma(csvReader.get("Suspension_Rationale_-_ESMA"));
				obj.setSusratesmacf(csvReader.get("Suspension_Rationale_-_ESMA_-_Change_Flag"));
				obj.setSusratesmap(csvReader.get("Suspension_Rationale_-_ESMA_-_Previous"));
				obj.setSusstonesma(csvReader.get("Suspension_Started_On_-_ESMA"));
				obj.setSusstonesmacf(csvReader.get("Suspension_Started_On_-_ESMA_-_Change_Flag"));
				obj.setSusstonesmap(csvReader.get("Suspension_Started_On_-_ESMA_-_Previous"));
				obj.setTtlamissued(csvReader.get("Total_Amount_Issued"));
				obj.setTtlamissuedcf(csvReader.get("Total_Amount_Issued_-_Change_Flag"));
				obj.setTtlamissuedp(csvReader.get("Total_Amount_Issued_-_Previous"));
				obj.setTtleutu12moesma(csvReader.get("Total_EU_Turnover_12_Month_-_ESMA"));
				obj.setTtleutu12moesmacf(csvReader.get("Total_EU_Turnover_12_Month_-_ESMA_-_Change_Flag"));
				obj.setTtleutu12moesmap(csvReader.get("Total_EU_Turnover_12_Month_-_ESMA_-_Previous"));
				obj.setTtleuvl12moesma(csvReader.get("Total_EU_Volume_12_Month_-_ESMA"));
				obj.setTtleuvl12moesmacf(csvReader.get("Total_EU_Volume_12_Month_-_ESMA_-_Change_Flag"));
				obj.setTtleuvl12moesmap(csvReader.get("Total_EU_Volume_12_Month_-_ESMA_-_Previous"));
				obj.setUndeeaelig(csvReader.get("Underlying_EEA_Venue_Eligible"));
				obj.setUndeeaeligcf(csvReader.get("Underlying_EEA_Venue_Eligible_-_Change_Flag"));
				obj.setUndeeaeligp(csvReader.get("Underlying_EEA_Venue_Eligible_-_Previous"));
				obj.setUndisin(csvReader.get("Underlying_ISIN"));
				obj.setUndisincf(csvReader.get("Underlying_ISIN_-_Change_Flag"));
				obj.setUndisinp(csvReader.get("Underlying_ISIN_-_Previous"));
				obj.setUndisinesma(csvReader.get("Underlying_ISIN_-_ESMA"));
				obj.setUndisinesmacf(csvReader.get("Underlying_ISIN_-_ESMA_-_Change_Flag"));
				obj.setUndisinesmap(csvReader.get("Underlying_ISIN_-_ESMA_-_Previous"));

				xrefXxDsp.setId(obj);

				xrefDsps.add(xrefXxDsp);
			}// end while
		}// end if

		return xrefDsps;
	}

	/**
	 * 
	 * @param xrefXxDsps
	 * @return
	 * @throws Exception
	 */
	public synchronized void buildDhsIdMap(List<XrefXxDsp> xrefXxDsps, Map<DHSComp, Long> dhsIdMap, List<Dhsidmap> dhsids, String fileName) throws Exception {

		Long maxDhsId = dao.getMaxDhsid();

		int i = 1;
		for (XrefXxDsp obj : xrefXxDsps) {

			if (StringUtils.isNotBlank(obj.getId().getRic()) && StringUtils.isNotBlank(obj.getId().getQuoteid())) {

				Long dhsId = null;// dao.getDhsidByRicNQuoteId(obj.getId().getQuoteid(),
									// obj.getId().getRic());

				if (dhsId != null) {
					dhsIdMap.put(new DHSComp(obj.getId().getQuoteid(), obj.getId().getRic()), dhsId);
				} else {
					dhsIdMap.put(new DHSComp(obj.getId().getQuoteid(), obj.getId().getRic()), (maxDhsId + i));
					Dhsidmap dhsObj = new Dhsidmap();
					dhsObj.setDhsid((maxDhsId + i));
					dhsObj.setRic(obj.getId().getRic());
					dhsObj.setRic30(obj.getId().getRic());
					dhsObj.setCreatedate(Calendar.getInstance());
					dhsObj.setUpdatedate(Calendar.getInstance());
					dhsObj.setQuoteid(obj.getId().getQuoteid());
					dhsObj.setUpdatesrc(fileName);
					dhsids.add(dhsObj);
				}
				i++;
			}
		}
	}

	public synchronized List<XrefDsp> buildXrefDsp(List<XrefXxDsp> xrefXxDsps, Map<DHSComp, Long> dhsIdMap) {
		List<XrefDsp> xrefDsps = new ArrayList<XrefDsp>();

		for (XrefXxDsp staging : xrefXxDsps) {

			if (StringUtils.isNotBlank(staging.getId().getRic()) && StringUtils.isNotBlank(staging.getId().getQuoteid())) {

				XrefXxDspId obj = staging.getId();
				XrefDsp dto = new XrefDsp();

				if (dhsIdMap.containsKey(new DHSComp(obj.getQuoteid(), obj.getRic()))) {
					dto.setDhsid(dhsIdMap.get(new DHSComp(obj.getQuoteid(), obj.getRic())));
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
					dto.setDealstartdate(Integer.valueOf(convertDate(obj.getDealstartdate())));
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
					dto.setIssuedate(Integer.valueOf(convertDate(obj.getIssuedate())));
				if (StringUtils.isNotBlank(obj.getIssortrvenueleiesma()))
					dto.setIssortrvenueleiesma(obj.getIssortrvenueleiesma());
				if (StringUtils.isNotBlank(obj.getMrkattsrcpermid()))
					dto.setMrkattsrcpermid(new BigDecimal(obj.getMrkattsrcpermid()));
				if (StringUtils.isNotBlank(obj.getMaturitydate()))
					dto.setMaturitydate(Integer.valueOf(convertDate(obj.getMaturitydate())));
				if (StringUtils.isNotBlank(obj.getMifidasclofun()))
					dto.setMifidasclofun(obj.getMifidasclofun());
				if (StringUtils.isNotBlank(obj.getMifidadnapinsesma()))
					dto.setMifidadnapinsesma(new BigDecimal(obj.getMifidadnapinsesma()));
				if (StringUtils.isNotBlank(obj.getMifidadnoftpinsesma()))
					dto.setMifidadnoftpinsesma(new BigDecimal(obj.getMifidadnoftpinsesma()));
				if (StringUtils.isNotBlank(obj.getMifidavdatuesma()))
					dto.setMifidavdatuesma(new BigDecimal(obj.getMifidavdatuesma()));
				if (StringUtils.isNotBlank(obj.getMifidavdatucurcode()))
					dto.setMifidavdatucurcode(obj.getMifidavdatucurcode());
				if (StringUtils.isNotBlank(obj.getMifidavvaoftresma()))
					dto.setMifidavvaoftresma(new BigDecimal(obj.getMifidavvaoftresma()));
				if (StringUtils.isNotBlank(obj.getMifidavvaoftrcurcode()))
					dto.setMifidavvaoftrcurcode(new BigDecimal(obj.getMifidavvaoftrcurcode()));
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
					dto.setMifidexpdateesma(Integer.valueOf(obj.getMifidexpdateesma()));
				if (StringUtils.isNotBlank(obj.getMifidfiprtype()))
					dto.setMifidfiprtype(obj.getMifidfiprtype());
				if (StringUtils.isNotBlank(obj.getMifidfiprtypeesma()))
					dto.setMifidfiprtypeesma(obj.getMifidfiprtypeesma());
				if (StringUtils.isNotBlank(obj.getMifidfrtradedate()))
					dto.setMifidfrtradedate(Integer.valueOf(convertDate(obj.getMifidfrtradedate())));
				if (StringUtils.isNotBlank(obj.getMifidfrtradedateesma()))
					dto.setMifidfrtradedateesma(Integer.valueOf(obj.getMifidfrtradedateesma()));
				if (StringUtils.isNotBlank(obj.getMifidflag()))
					dto.setMifidflag(obj.getMifidflag());
				if (StringUtils.isNotBlank(obj.getMifidfrfloatesma()))
					dto.setMifidfrfloatesma(new BigDecimal(obj.getMifidfrfloatesma()));
				if (StringUtils.isNotBlank(obj.getMifidfrfloatcurcode()))
					dto.setMifidfrfloatcurcode(obj.getMifidfrfloatcurcode());
				if (StringUtils.isNotBlank(obj.getMifidfusubpr()))
					dto.setMifidfusubpr(obj.getMifidfusubpr());
				if (StringUtils.isNotBlank(obj.getMifidfusubpresma()))
					dto.setMifidfusubpresma(obj.getMifidfusubpresma());
				if (StringUtils.isNotBlank(obj.getMifidissdateesma()))
					dto.setMifidissdateesma(Long.valueOf(obj.getMifidissdateesma()));
				if (StringUtils.isNotBlank(obj.getMifidisssizeesma()))
					dto.setMifidisssizeesma(new BigDecimal(obj.getMifidisssizeesma()));
				if (StringUtils.isNotBlank(obj.getMifidmatdate()))
					dto.setMifidmatdate(Integer.valueOf(convertDate(obj.getMifidmatdate())));
				if (StringUtils.isNotBlank(obj.getMifidmatdateesma()))
					dto.setMifidmatdateesma(Integer.valueOf(obj.getMifidmatdateesma()));
				if (StringUtils.isNotBlank(obj.getMifidmostremaesma()))
					dto.setMifidmostremaesma(obj.getMifidmostremaesma());
				if (StringUtils.isNotBlank(obj.getMifidoptype()))
					dto.setMifidoptype(obj.getMifidoptype());
				if (StringUtils.isNotBlank(obj.getMifidoptypeesma()))
					dto.setMifidoptypeesma(obj.getMifidoptypeesma());
				if (StringUtils.isNotBlank(obj.getMifidptuw12esma()))
					dto.setMifidptuw12esma(new BigDecimal(obj.getMifidptuw12esma()));
				if (StringUtils.isNotBlank(obj.getMifidptuwptv12mesma()))
					dto.setMifidptuwptv12mesma(new BigDecimal(obj.getMifidptuwptv12mesma()));
				if (StringUtils.isNotBlank(obj.getMifidpotrlisthfl()))
					dto.setMifidpotrlisthfl(Long.valueOf(obj.getMifidpotrlisthfl()));
				if (StringUtils.isNotBlank(obj.getMifidpotrlisthvl()))
					dto.setMifidpotrlisthvl(Long.valueOf(obj.getMifidpotrlisthvl()));
				if (StringUtils.isNotBlank(obj.getMifidpotrlistrper()))
					dto.setMifidpotrlistrper(new BigDecimal(obj.getMifidpotrlistrper()));
				if (StringUtils.isNotBlank(obj.getMifidpotrlisvoper()))
					dto.setMifidpotrlisvoper(new BigDecimal(obj.getMifidpotrlisvoper()));
				if (StringUtils.isNotBlank(obj.getMifidpotrsstithfl()))
					dto.setMifidpotrsstithfl(Long.valueOf(obj.getMifidpotrsstithfl()));
				if (StringUtils.isNotBlank(obj.getMifidpotrsstithvl()))
					dto.setMifidpotrsstithvl(Long.valueOf(obj.getMifidpotrsstithvl()));
				if (StringUtils.isNotBlank(obj.getMifidpotrsstitrper()))
					dto.setMifidpotrsstitrper(new BigDecimal(obj.getMifidpotrsstitrper()));
				if (StringUtils.isNotBlank(obj.getMifidpotrsstivoper()))
					dto.setMifidpotrsstivoper(new BigDecimal(obj.getMifidpotrsstivoper()));
				if (StringUtils.isNotBlank(obj.getMifidpretrlisthfl()))
					dto.setMifidpretrlisthfl(Long.valueOf(obj.getMifidpretrlisthfl()));
				if (StringUtils.isNotBlank(obj.getMifidpretrlisthvl()))
					dto.setMifidpretrlisthvl(Long.valueOf(obj.getMifidpretrlisthvl()));
				if (StringUtils.isNotBlank(obj.getMifidpretrlistrper()))
					dto.setMifidpretrlistrper(new BigDecimal(obj.getMifidpretrlistrper()));
				if (StringUtils.isNotBlank(obj.getMifidpretrsstithfl()))
					dto.setMifidpretrsstithfl(Long.valueOf(obj.getMifidpretrsstithfl()));
				if (StringUtils.isNotBlank(obj.getMifidpretrsstithvl()))
					dto.setMifidpretrsstithvl(Long.valueOf(obj.getMifidpretrsstithvl()));
				if (StringUtils.isNotBlank(obj.getMifidpretrsstitrper()))
					dto.setMifidpretrsstitrper(new BigDecimal(obj.getMifidpretrsstitrper()));
				if (StringUtils.isNotBlank(obj.getMifidregulatedesma()))
					dto.setMifidregulatedesma(obj.getMifidregulatedesma());
				if (StringUtils.isNotBlank(obj.getMifidstmasizeesma()))
					dto.setMifidstmasizeesma(Long.valueOf(obj.getMifidstmasizeesma()));
				if (StringUtils.isNotBlank(obj.getMifidstmasizecurcode()))
					dto.setMifidstmasizecurcode(obj.getMifidstmasizecurcode());
				if (StringUtils.isNotBlank(obj.getMifidsubprod()))
					dto.setMifidsubprod(obj.getMifidsubprod());
				if (StringUtils.isNotBlank(obj.getMifidsubprodesma()))
					dto.setMifidsubprodesma(obj.getMifidsubprodesma());
				if (StringUtils.isNotBlank(obj.getMifidtermdate()))
					dto.setMifidtermdate(Integer.valueOf(convertDate(obj.getMifidtermdate())));
				if (StringUtils.isNotBlank(obj.getMifidtermdateesma()))
					dto.setMifidtermdateesma(Integer.valueOf(obj.getMifidtermdateesma()));
				if (StringUtils.isNotBlank(obj.getMifidtrobflag()))
					dto.setMifidtrobflag(obj.getMifidtrobflag());

				xrefDsps.add(dto);
			}
		}
		return xrefDsps;
	}

	/**
	 * 
	 * @param date
	 * @return
	 */
	private String convertDate(String date) {
		return date.replace("-", "");
	}

	/**
	 * 
	 * @param xrefXxDsps
	 * @return
	 */
	public List<DHSComp> buildDHSComp(List<XrefXxDsp> xrefXxDsps) {
		List<DHSComp> comps = new ArrayList<DHSComp>();
		for (XrefXxDsp xrefXxDsp : xrefXxDsps) {
			if (StringUtils.isNotBlank(xrefXxDsp.getId().getRic()) && StringUtils.isNotBlank(xrefXxDsp.getId().getQuoteid())) {
				comps.add(new DHSComp(xrefXxDsp.getId().getQuoteid(), xrefXxDsp.getId().getRic()));
			}
		}
		return comps;
	}
}
