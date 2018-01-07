package com.tr.dhsloader.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Thomson Reuters
 * 
 */
@Embeddable
public class XrefXxDspId implements java.io.Serializable {

	private static final long serialVersionUID = 388890347469463820L;
	private String action;
	private String levelcode;
	private String ipc;
	private byte[] quoteid;
	private String ric;
	private String sedol;
	private String issuepermid;
	private byte[] assetid;
	private String pilc;
	private String cusip;
	private String orgpermid;
	private String assetstatus;
	private String basketundisinlist;
	private String basketwrrindicator;
	private String cficode;
	private String cincode;
	private String complegaldomicile;
	private String compshortname;
	private String dealstartdate;
	private String eeavenueelflg;
	private String fininsshname;
	private String fininsshnameesma;
	private String inesmafirds;
	private String insclassesma;
	private String insfullnameesma;
	private String isin;
	private String issuedate;
	private String issuerlei;
	private String issortrvenueleiesma;
	private String mrkattsrcpermid;
	private String marketmic;
	private String maturitydate;
	private String mifidasclofun;
	private String mifidadnapinsesma;
	private String mifidadnoftpinsesma;
	private String mifidavdatuesma;
	private String mifidavdatucurcode;
	private String mifidavvaoftresma;
	private String mifidavvaoftrcurcode;
	private String mifidbaseprod;
	private String mifidbaseprodesma;
	private String mifidbondseni;
	private String mifidbondtype;
	private String mifidclobflag;
	private String mifidcofialiinfornewbo;
	private String mifidcodein;
	private String mifidcodeinesma;
	private String mifidcoinflesma;
	private String mifidcoinre;
	private String mifidcotype;
	private String mifiddeltypeesma;
	private String mifidemalsubtype;
	private String mifidexerstyle;
	private String mifidexerstyleesma;
	private String mifidexpdateesma;
	private String mifidfiprtype;
	private String mifidfiprtypeesma;
	private String mifidfrtradedate;
	private String mifidfrtradedateesma;
	private String mifidflag;
	private String mifidfrfloatesma;
	private String mifidfrfloatcurcode;
	private String mifidfusubpr;
	private String mifidfusubpresma;
	private String mifidissdateesma;
	private String mifidisssizeesma;
	private String mifidmatdate;
	private String mifidmatdateesma;
	private String mifidmostremaesma;
	private String mifidoptype;
	private String mifidoptypeesma;
	private String mifidptuw12esma;
	private String mifidptuwptv12mesma;
	private String mifidpotrlisthfl;
	private String mifidpotrlisthvl;
	private String mifidpotrlistrper;
	private String mifidpotrlisvoper;
	private String mifidpotrsstithfl;
	private String mifidpotrsstithvl;
	private String mifidpotrsstitrper;
	private String mifidpotrsstivoper;
	private String mifidpretrlisthfl;
	private String mifidpretrlisthvl;
	private String mifidpretrlistrper;
	private String mifidpretrsstithfl;
	private String mifidpretrsstithvl;
	private String mifidpretrsstitrper;
	private String mifidregulatedesma;
	private String mifidstmasizeesma;
	private String mifidstmasizecurcode;
	private String mifidsubprod;
	private String mifidsubprodesma;
	private String mifidtermdate;
	private String mifidtermdateesma;
	private String mifidtrobflag;
	private String mifidtradapdate;
	private String mifidtradapdateesma;
	private String mifidtradreqdate;
	private String mifidtradreqdateesma;
	private String mifidtrtype;
	private String mifidtrtypeesma;
	private String mifidundindname;
	private String mifidundindnameesma;
	private String mifidundindtermesma;
	private String mifidundtype;
	private String mifiridentifier;
	private String mindenomination;
	private String ncaavdailyturnover;
	private String ncaavdailyturncurcode;
	private String ncafreefl;
	private String ncafreeflcurcode;
	private String notionalcuresma;
	private String optionroot;
	private String placeholder;
	private String pricemultiplieresma;
	private String prtrmaquote;
	private String quotepermid;
	private String reqfattbyissuer;
	private String reqfattbyissueresma;
	private String securitydescription;
	private String strikepriceesma;
	private String strikepricecuresma;
	private String suscategoryesma;
	private String susendedonesma;
	private String susongoingesma;
	private String susratesma;
	private String susstonesma;
	private String ttlamissued;
	private String ttleutu12moesma;
	private String ttleuvl12moesma;
	private String undeeaelig;
	private String undisin;
	private String undisinesma;

	public XrefXxDspId() {
	}

	@Column(name = "action", length = 50)
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Column(name = "levelCode", length = 50)
	public String getLevelcode() {
		return levelcode;
	}

	public void setLevelcode(String levelcode) {
		this.levelcode = levelcode;
	}

	@Column(name = "ipc", length = 50)
	public String getIpc() {
		return ipc;
	}

	public void setIpc(String ipc) {
		this.ipc = ipc;
	}

	@Column(name = "quoteID", length = 50)
	public byte[] getQuoteid() {
		return quoteid;
	}

	public void setQuoteid(byte[] bs) {
		this.quoteid = bs;
	}

	@Column(name = "RIC", length = 50)
	public String getRic() {
		return ric;
	}

	public void setRic(String ric) {
		this.ric = ric;
	}

	@Column(name = "sedol", length = 50)
	public String getSedol() {
		return sedol;
	}

	public void setSedol(String sedol) {
		this.sedol = sedol;
	}

	@Column(name = "issuePermID", length = 50)
	public String getIssuepermid() {
		return issuepermid;
	}

	public void setIssuepermid(String issuepermid) {
		this.issuepermid = issuepermid;
	}

	@Column(name = "assetID", length = 50)
	public byte[] getAssetid() {
		return assetid;
	}

	public void setAssetid(byte[] assetid) {
		this.assetid = assetid;
	}

	@Column(name = "pilc", length = 50)
	public String getPilc() {
		return pilc;
	}

	public void setPilc(String pilc) {
		this.pilc = pilc;
	}

	@Column(name = "cusip", length = 50)
	public String getCusip() {
		return cusip;
	}

	public void setCusip(String cusip) {
		this.cusip = cusip;
	}

	@Column(name = "orgPermID", length = 50)
	public String getOrgpermid() {
		return orgpermid;
	}

	public void setOrgpermid(String orgpermid) {
		this.orgpermid = orgpermid;
	}

	@Column(name = "assetStatus", length = 50)
	public String getAssetstatus() {
		return assetstatus;
	}

	public void setAssetstatus(String assetstatus) {
		this.assetstatus = assetstatus;
	}

	@Column(name = "basketUndIsinList", length = 50)
	public String getBasketundisinlist() {
		return basketundisinlist;
	}

	public void setBasketundisinlist(String basketundisinlist) {
		this.basketundisinlist = basketundisinlist;
	}

	@Column(name = "basketWrrIndicator", length = 50)
	public String getBasketwrrindicator() {
		return basketwrrindicator;
	}

	public void setBasketwrrindicator(String basketwrrindicator) {
		this.basketwrrindicator = basketwrrindicator;
	}

	@Column(name = "cfiCode", length = 50)
	public String getCficode() {
		return cficode;
	}

	public void setCficode(String cficode) {
		this.cficode = cficode;
	}

	@Column(name = "cinCode", length = 50)
	public String getCincode() {
		return cincode;
	}

	public void setCincode(String cincode) {
		this.cincode = cincode;
	}

	@Column(name = "compLegalDomicile", length = 50)
	public String getComplegaldomicile() {
		return complegaldomicile;
	}

	public void setComplegaldomicile(String complegaldomicile) {
		this.complegaldomicile = complegaldomicile;
	}

	@Column(name = "compShortName", length = 50)
	public String getCompshortname() {
		return compshortname;
	}

	public void setCompshortname(String compshortname) {
		this.compshortname = compshortname;
	}

	@Column(name = "dealStartDate", length = 50)
	public String getDealstartdate() {
		return dealstartdate;
	}

	public void setDealstartdate(String dealstartdate) {
		this.dealstartdate = dealstartdate;
	}

	@Column(name = "eeaVenueElFlg", length = 50)
	public String getEeavenueelflg() {
		return eeavenueelflg;
	}

	public void setEeavenueelflg(String eeavenueelflg) {
		this.eeavenueelflg = eeavenueelflg;
	}

	@Column(name = "finInsShName", length = 50)
	public String getFininsshname() {
		return fininsshname;
	}

	public void setFininsshname(String fininsshname) {
		this.fininsshname = fininsshname;
	}

	@Column(name = "finInsShNameESMA", length = 50)
	public String getFininsshnameesma() {
		return fininsshnameesma;
	}

	public void setFininsshnameesma(String fininsshnameesma) {
		this.fininsshnameesma = fininsshnameesma;
	}

	@Column(name = "inEsmaFirds", length = 50)
	public String getInesmafirds() {
		return inesmafirds;
	}

	public void setInesmafirds(String inesmafirds) {
		this.inesmafirds = inesmafirds;
	}

	@Column(name = "insClassESMA", length = 50)
	public String getInsclassesma() {
		return insclassesma;
	}

	public void setInsclassesma(String insclassesma) {
		this.insclassesma = insclassesma;
	}

	@Column(name = "insFullNameESMA", length = 50)
	public String getInsfullnameesma() {
		return insfullnameesma;
	}

	public void setInsfullnameesma(String insfullnameesma) {
		this.insfullnameesma = insfullnameesma;
	}

	@Column(name = "isin", length = 50)
	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	@Column(name = "issueDate", length = 50)
	public String getIssuedate() {
		return issuedate;
	}

	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}

	@Column(name = "issuerLEI", length = 50)
	public String getIssuerlei() {
		return issuerlei;
	}

	public void setIssuerlei(String issuerlei) {
		this.issuerlei = issuerlei;
	}

	@Column(name = "issOrTrVenueLeiESMA", length = 50)
	public String getIssortrvenueleiesma() {
		return issortrvenueleiesma;
	}

	public void setIssortrvenueleiesma(String issortrvenueleiesma) {
		this.issortrvenueleiesma = issortrvenueleiesma;
	}

	@Column(name = "mrkAttSrcPermID", length = 50)
	public String getMrkattsrcpermid() {
		return mrkattsrcpermid;
	}

	public void setMrkattsrcpermid(String mrkattsrcpermid) {
		this.mrkattsrcpermid = mrkattsrcpermid;
	}

	@Column(name = "marketMIC", length = 50)
	public String getMarketmic() {
		return marketmic;
	}

	public void setMarketmic(String marketmic) {
		this.marketmic = marketmic;
	}

	@Column(name = "maturityDate", length = 50)
	public String getMaturitydate() {
		return maturitydate;
	}

	public void setMaturitydate(String maturitydate) {
		this.maturitydate = maturitydate;
	}

	@Column(name = "mifidAsClofUn", length = 50)
	public String getMifidasclofun() {
		return mifidasclofun;
	}

	public void setMifidasclofun(String mifidasclofun) {
		this.mifidasclofun = mifidasclofun;
	}

	@Column(name = "mifidADNAPInsESMA", length = 50)
	public String getMifidadnapinsesma() {
		return mifidadnapinsesma;
	}

	public void setMifidadnapinsesma(String mifidadnapinsesma) {
		this.mifidadnapinsesma = mifidadnapinsesma;
	}

	@Column(name = "mifidADNOfTPInsESMA", length = 50)
	public String getMifidadnoftpinsesma() {
		return mifidadnoftpinsesma;
	}

	public void setMifidadnoftpinsesma(String mifidadnoftpinsesma) {
		this.mifidadnoftpinsesma = mifidadnoftpinsesma;
	}

	@Column(name = "mifidAvDaTuESMA", length = 50)
	public String getMifidavdatuesma() {
		return mifidavdatuesma;
	}

	public void setMifidavdatuesma(String mifidavdatuesma) {
		this.mifidavdatuesma = mifidavdatuesma;
	}

	@Column(name = "mifidAvDaTuCurCode", length = 50)
	public String getMifidavdatucurcode() {
		return mifidavdatucurcode;
	}

	public void setMifidavdatucurcode(String mifidavdatucurcode) {
		this.mifidavdatucurcode = mifidavdatucurcode;
	}

	@Column(name = "mifidAvVaOfTrESMA", length = 50)
	public String getMifidavvaoftresma() {
		return mifidavvaoftresma;
	}

	public void setMifidavvaoftresma(String mifidavvaoftresma) {
		this.mifidavvaoftresma = mifidavvaoftresma;
	}

	@Column(name = "mifidAvVaOfTrCurCode", length = 50)
	public String getMifidavvaoftrcurcode() {
		return mifidavvaoftrcurcode;
	}

	public void setMifidavvaoftrcurcode(String mifidavvaoftrcurcode) {
		this.mifidavvaoftrcurcode = mifidavvaoftrcurcode;
	}

	@Column(name = "mifidBaseProd", length = 50)
	public String getMifidbaseprod() {
		return mifidbaseprod;
	}

	public void setMifidbaseprod(String mifidbaseprod) {
		this.mifidbaseprod = mifidbaseprod;
	}

	@Column(name = "mifidBaseProdESMA", length = 50)
	public String getMifidbaseprodesma() {
		return mifidbaseprodesma;
	}

	public void setMifidbaseprodesma(String mifidbaseprodesma) {
		this.mifidbaseprodesma = mifidbaseprodesma;
	}

	@Column(name = "mifidBondSeni", length = 50)
	public String getMifidbondseni() {
		return mifidbondseni;
	}

	public void setMifidbondseni(String mifidbondseni) {
		this.mifidbondseni = mifidbondseni;
	}

	@Column(name = "mifidBondType", length = 50)
	public String getMifidbondtype() {
		return mifidbondtype;
	}

	public void setMifidbondtype(String mifidbondtype) {
		this.mifidbondtype = mifidbondtype;
	}

	@Column(name = "mifidClObFlag", length = 50)
	public String getMifidclobflag() {
		return mifidclobflag;
	}

	public void setMifidclobflag(String mifidclobflag) {
		this.mifidclobflag = mifidclobflag;
	}

	@Column(name = "mifidCofiaLiInForNewBo", length = 50)
	public String getMifidcofialiinfornewbo() {
		return mifidcofialiinfornewbo;
	}

	public void setMifidcofialiinfornewbo(String mifidcofialiinfornewbo) {
		this.mifidcofialiinfornewbo = mifidcofialiinfornewbo;
	}

	@Column(name = "mifidCoDeIn", length = 50)
	public String getMifidcodein() {
		return mifidcodein;
	}

	public void setMifidcodein(String mifidcodein) {
		this.mifidcodein = mifidcodein;
	}

	@Column(name = "mifidCoDeInESMA", length = 50)
	public String getMifidcodeinesma() {
		return mifidcodeinesma;
	}

	public void setMifidcodeinesma(String mifidcodeinesma) {
		this.mifidcodeinesma = mifidcodeinesma;
	}

	@Column(name = "mifidCoInFlESMA", length = 50)
	public String getMifidcoinflesma() {
		return mifidcoinflesma;
	}

	public void setMifidcoinflesma(String mifidcoinflesma) {
		this.mifidcoinflesma = mifidcoinflesma;
	}

	@Column(name = "mifidCoInRe", length = 50)
	public String getMifidcoinre() {
		return mifidcoinre;
	}

	public void setMifidcoinre(String mifidcoinre) {
		this.mifidcoinre = mifidcoinre;
	}

	@Column(name = "mifidCoType", length = 50)
	public String getMifidcotype() {
		return mifidcotype;
	}

	public void setMifidcotype(String mifidcotype) {
		this.mifidcotype = mifidcotype;
	}

	@Column(name = "mifidDelTypeESMA", length = 50)
	public String getMifiddeltypeesma() {
		return mifiddeltypeesma;
	}

	public void setMifiddeltypeesma(String mifiddeltypeesma) {
		this.mifiddeltypeesma = mifiddeltypeesma;
	}

	@Column(name = "mifidEmAlSubType", length = 50)
	public String getMifidemalsubtype() {
		return mifidemalsubtype;
	}

	public void setMifidemalsubtype(String mifidemalsubtype) {
		this.mifidemalsubtype = mifidemalsubtype;
	}

	@Column(name = "mifidExerStyle", length = 50)
	public String getMifidexerstyle() {
		return mifidexerstyle;
	}

	public void setMifidexerstyle(String mifidexerstyle) {
		this.mifidexerstyle = mifidexerstyle;
	}

	@Column(name = "mifidExerStyleESMA", length = 50)
	public String getMifidexerstyleesma() {
		return mifidexerstyleesma;
	}

	public void setMifidexerstyleesma(String mifidexerstyleesma) {
		this.mifidexerstyleesma = mifidexerstyleesma;
	}

	@Column(name = "mifidExpDateESMA", length = 50)
	public String getMifidexpdateesma() {
		return mifidexpdateesma;
	}

	public void setMifidexpdateesma(String mifidexpdateesma) {
		this.mifidexpdateesma = mifidexpdateesma;
	}

	@Column(name = "mifidFiPrType", length = 50)
	public String getMifidfiprtype() {
		return mifidfiprtype;
	}

	public void setMifidfiprtype(String mifidfiprtype) {
		this.mifidfiprtype = mifidfiprtype;
	}

	@Column(name = "mifidFiPrTypeESMA", length = 50)
	public String getMifidfiprtypeesma() {
		return mifidfiprtypeesma;
	}

	public void setMifidfiprtypeesma(String mifidfiprtypeesma) {
		this.mifidfiprtypeesma = mifidfiprtypeesma;
	}

	@Column(name = "mifidFrTradeDate", length = 50)
	public String getMifidfrtradedate() {
		return mifidfrtradedate;
	}

	public void setMifidfrtradedate(String mifidfrtradedate) {
		this.mifidfrtradedate = mifidfrtradedate;
	}

	@Column(name = "mifidFrTradeDateESMA", length = 50)
	public String getMifidfrtradedateesma() {
		return mifidfrtradedateesma;
	}

	public void setMifidfrtradedateesma(String mifidfrtradedateesma) {
		this.mifidfrtradedateesma = mifidfrtradedateesma;
	}

	@Column(name = "mifidFlag", length = 50)
	public String getMifidflag() {
		return mifidflag;
	}

	public void setMifidflag(String mifidflag) {
		this.mifidflag = mifidflag;
	}

	@Column(name = "mifidFrFloatESMA", length = 50)
	public String getMifidfrfloatesma() {
		return mifidfrfloatesma;
	}

	public void setMifidfrfloatesma(String mifidfrfloatesma) {
		this.mifidfrfloatesma = mifidfrfloatesma;
	}

	@Column(name = "mifidFrFloatCurCode", length = 50)
	public String getMifidfrfloatcurcode() {
		return mifidfrfloatcurcode;
	}

	public void setMifidfrfloatcurcode(String mifidfrfloatcurcode) {
		this.mifidfrfloatcurcode = mifidfrfloatcurcode;
	}

	@Column(name = "mifidFuSubPr", length = 50)
	public String getMifidfusubpr() {
		return mifidfusubpr;
	}

	public void setMifidfusubpr(String mifidfusubpr) {
		this.mifidfusubpr = mifidfusubpr;
	}

	@Column(name = "mifidFuSubPrESMA", length = 50)
	public String getMifidfusubpresma() {
		return mifidfusubpresma;
	}

	public void setMifidfusubpresma(String mifidfusubpresma) {
		this.mifidfusubpresma = mifidfusubpresma;
	}

	@Column(name = "mifidIssDateESMA", length = 50)
	public String getMifidissdateesma() {
		return mifidissdateesma;
	}

	public void setMifidissdateesma(String mifidissdateesma) {
		this.mifidissdateesma = mifidissdateesma;
	}

	@Column(name = "mifidIssSizeESMA", length = 50)
	public String getMifidisssizeesma() {
		return mifidisssizeesma;
	}

	public void setMifidisssizeesma(String mifidisssizeesma) {
		this.mifidisssizeesma = mifidisssizeesma;
	}

	@Column(name = "mifidMatDate", length = 50)
	public String getMifidmatdate() {
		return mifidmatdate;
	}

	public void setMifidmatdate(String mifidmatdate) {
		this.mifidmatdate = mifidmatdate;
	}

	@Column(name = "mifidMatDateESMA", length = 50)
	public String getMifidmatdateesma() {
		return mifidmatdateesma;
	}

	public void setMifidmatdateesma(String mifidmatdateesma) {
		this.mifidmatdateesma = mifidmatdateesma;
	}

	@Column(name = "mifidMostReMaESMA", length = 50)
	public String getMifidmostremaesma() {
		return mifidmostremaesma;
	}

	public void setMifidmostremaesma(String mifidmostremaesma) {
		this.mifidmostremaesma = mifidmostremaesma;
	}

	@Column(name = "mifidOpType", length = 50)
	public String getMifidoptype() {
		return mifidoptype;
	}

	public void setMifidoptype(String mifidoptype) {
		this.mifidoptype = mifidoptype;
	}

	@Column(name = "mifidOpTypeESMA", length = 50)
	public String getMifidoptypeesma() {
		return mifidoptypeesma;
	}

	public void setMifidoptypeesma(String mifidoptypeesma) {
		this.mifidoptypeesma = mifidoptypeesma;
	}

	@Column(name = "mifidPTUW12ESMA", length = 50)
	public String getMifidptuw12esma() {
		return mifidptuw12esma;
	}

	public void setMifidptuw12esma(String mifidptuw12esma) {
		this.mifidptuw12esma = mifidptuw12esma;
	}

	@Column(name = "mifidPTUWPTV12MESMA", length = 50)
	public String getMifidptuwptv12mesma() {
		return mifidptuwptv12mesma;
	}

	public void setMifidptuwptv12mesma(String mifidptuwptv12mesma) {
		this.mifidptuwptv12mesma = mifidptuwptv12mesma;
	}

	@Column(name = "mifidPoTrLISThFl", length = 50)
	public String getMifidpotrlisthfl() {
		return mifidpotrlisthfl;
	}

	public void setMifidpotrlisthfl(String mifidpotrlisthfl) {
		this.mifidpotrlisthfl = mifidpotrlisthfl;
	}

	@Column(name = "mifidPoTrLISThVl", length = 50)
	public String getMifidpotrlisthvl() {
		return mifidpotrlisthvl;
	}

	public void setMifidpotrlisthvl(String mifidpotrlisthvl) {
		this.mifidpotrlisthvl = mifidpotrlisthvl;
	}

	@Column(name = "mifidPoTrLISTrPer", length = 50)
	public String getMifidpotrlistrper() {
		return mifidpotrlistrper;
	}

	public void setMifidpotrlistrper(String mifidpotrlistrper) {
		this.mifidpotrlistrper = mifidpotrlistrper;
	}

	@Column(name = "mifidPoTrLISVoPer", length = 50)
	public String getMifidpotrlisvoper() {
		return mifidpotrlisvoper;
	}

	public void setMifidpotrlisvoper(String mifidpotrlisvoper) {
		this.mifidpotrlisvoper = mifidpotrlisvoper;
	}

	@Column(name = "mifidPoTrSSTIThFl", length = 50)
	public String getMifidpotrsstithfl() {
		return mifidpotrsstithfl;
	}

	public void setMifidpotrsstithfl(String mifidpotrsstithfl) {
		this.mifidpotrsstithfl = mifidpotrsstithfl;
	}

	@Column(name = "mifidPoTrSSTIThVl", length = 50)
	public String getMifidpotrsstithvl() {
		return mifidpotrsstithvl;
	}

	public void setMifidpotrsstithvl(String mifidpotrsstithvl) {
		this.mifidpotrsstithvl = mifidpotrsstithvl;
	}

	@Column(name = "mifidPoTrSSTITrPer", length = 50)
	public String getMifidpotrsstitrper() {
		return mifidpotrsstitrper;
	}

	public void setMifidpotrsstitrper(String mifidpotrsstitrper) {
		this.mifidpotrsstitrper = mifidpotrsstitrper;
	}

	@Column(name = "mifidPoTrSSTIVoPer", length = 50)
	public String getMifidpotrsstivoper() {
		return mifidpotrsstivoper;
	}

	public void setMifidpotrsstivoper(String mifidpotrsstivoper) {
		this.mifidpotrsstivoper = mifidpotrsstivoper;
	}

	@Column(name = "mifidPreTrLISThFl", length = 50)
	public String getMifidpretrlisthfl() {
		return mifidpretrlisthfl;
	}

	public void setMifidpretrlisthfl(String mifidpretrlisthfl) {
		this.mifidpretrlisthfl = mifidpretrlisthfl;
	}

	@Column(name = "mifidPreTrLISThVl", length = 50)
	public String getMifidpretrlisthvl() {
		return mifidpretrlisthvl;
	}

	public void setMifidpretrlisthvl(String mifidpretrlisthvl) {
		this.mifidpretrlisthvl = mifidpretrlisthvl;
	}

	@Column(name = "mifidPreTrLISTrPer", length = 50)
	public String getMifidpretrlistrper() {
		return mifidpretrlistrper;
	}

	public void setMifidpretrlistrper(String mifidpretrlistrper) {
		this.mifidpretrlistrper = mifidpretrlistrper;
	}

	@Column(name = "mifidPreTrSSTIThFl", length = 50)
	public String getMifidpretrsstithfl() {
		return mifidpretrsstithfl;
	}

	public void setMifidpretrsstithfl(String mifidpretrsstithfl) {
		this.mifidpretrsstithfl = mifidpretrsstithfl;
	}

	@Column(name = "mifidPreTrSSTIThVl", length = 50)
	public String getMifidpretrsstithvl() {
		return mifidpretrsstithvl;
	}

	public void setMifidpretrsstithvl(String mifidpretrsstithvl) {
		this.mifidpretrsstithvl = mifidpretrsstithvl;
	}

	@Column(name = "mifidPreTrSSTITrPer", length = 50)
	public String getMifidpretrsstitrper() {
		return mifidpretrsstitrper;
	}

	public void setMifidpretrsstitrper(String mifidpretrsstitrper) {
		this.mifidpretrsstitrper = mifidpretrsstitrper;
	}

	@Column(name = "mifidRegulatedESMA", length = 50)
	public String getMifidregulatedesma() {
		return mifidregulatedesma;
	}

	public void setMifidregulatedesma(String mifidregulatedesma) {
		this.mifidregulatedesma = mifidregulatedesma;
	}

	@Column(name = "mifidStMaSizeESMA", length = 50)
	public String getMifidstmasizeesma() {
		return mifidstmasizeesma;
	}

	public void setMifidstmasizeesma(String mifidstmasizeesma) {
		this.mifidstmasizeesma = mifidstmasizeesma;
	}

	@Column(name = "mifidStMaSizeCurCode", length = 50)
	public String getMifidstmasizecurcode() {
		return mifidstmasizecurcode;
	}

	public void setMifidstmasizecurcode(String mifidstmasizecurcode) {
		this.mifidstmasizecurcode = mifidstmasizecurcode;
	}

	@Column(name = "mifidSubProd", length = 50)
	public String getMifidsubprod() {
		return mifidsubprod;
	}

	public void setMifidsubprod(String mifidsubprod) {
		this.mifidsubprod = mifidsubprod;
	}

	@Column(name = "mifidSubProdESMA", length = 50)
	public String getMifidsubprodesma() {
		return mifidsubprodesma;
	}

	public void setMifidsubprodesma(String mifidsubprodesma) {
		this.mifidsubprodesma = mifidsubprodesma;
	}

	@Column(name = "mifidTermDate", length = 50)
	public String getMifidtermdate() {
		return mifidtermdate;
	}

	public void setMifidtermdate(String mifidtermdate) {
		this.mifidtermdate = mifidtermdate;
	}

	@Column(name = "mifidTermDateESMA", length = 50)
	public String getMifidtermdateesma() {
		return mifidtermdateesma;
	}

	public void setMifidtermdateesma(String mifidtermdateesma) {
		this.mifidtermdateesma = mifidtermdateesma;
	}

	@Column(name = "mifidTrObFlag", length = 50)
	public String getMifidtrobflag() {
		return mifidtrobflag;
	}

	public void setMifidtrobflag(String mifidtrobflag) {
		this.mifidtrobflag = mifidtrobflag;
	}

	@Column(name = "mifidTrAdApDate", length = 50)
	public String getMifidtradapdate() {
		return mifidtradapdate;
	}

	public void setMifidtradapdate(String mifidtradapdate) {
		this.mifidtradapdate = mifidtradapdate;
	}

	@Column(name = "mifidTrAdApDateESMA", length = 50)
	public String getMifidtradapdateesma() {
		return mifidtradapdateesma;
	}

	public void setMifidtradapdateesma(String mifidtradapdateesma) {
		this.mifidtradapdateesma = mifidtradapdateesma;
	}

	@Column(name = "mifidTrAdReqDate", length = 50)
	public String getMifidtradreqdate() {
		return mifidtradreqdate;
	}

	public void setMifidtradreqdate(String mifidtradreqdate) {
		this.mifidtradreqdate = mifidtradreqdate;
	}

	@Column(name = "mifidTrAdReqDateESMA", length = 50)
	public String getMifidtradreqdateesma() {
		return mifidtradreqdateesma;
	}

	public void setMifidtradreqdateesma(String mifidtradreqdateesma) {
		this.mifidtradreqdateesma = mifidtradreqdateesma;
	}

	@Column(name = "mifidTrType", length = 50)
	public String getMifidtrtype() {
		return mifidtrtype;
	}

	public void setMifidtrtype(String mifidtrtype) {
		this.mifidtrtype = mifidtrtype;
	}

	@Column(name = "mifidTrTypeESMA", length = 50)
	public String getMifidtrtypeesma() {
		return mifidtrtypeesma;
	}

	public void setMifidtrtypeesma(String mifidtrtypeesma) {
		this.mifidtrtypeesma = mifidtrtypeesma;
	}

	@Column(name = "mifidUndIndName", length = 50)
	public String getMifidundindname() {
		return mifidundindname;
	}

	public void setMifidundindname(String mifidundindname) {
		this.mifidundindname = mifidundindname;
	}

	@Column(name = "mifidUndIndNameESMA", length = 50)
	public String getMifidundindnameesma() {
		return mifidundindnameesma;
	}

	public void setMifidundindnameesma(String mifidundindnameesma) {
		this.mifidundindnameesma = mifidundindnameesma;
	}

	@Column(name = "mifidUndIndTermESMA", length = 50)
	public String getMifidundindtermesma() {
		return mifidundindtermesma;
	}

	public void setMifidundindtermesma(String mifidundindtermesma) {
		this.mifidundindtermesma = mifidundindtermesma;
	}

	@Column(name = "mifidUndType", length = 50)
	public String getMifidundtype() {
		return mifidundtype;
	}

	public void setMifidundtype(String mifidundtype) {
		this.mifidundtype = mifidundtype;
	}

	@Column(name = "mifirIdentifier", length = 50)
	public String getMifiridentifier() {
		return mifiridentifier;
	}

	public void setMifiridentifier(String mifiridentifier) {
		this.mifiridentifier = mifiridentifier;
	}

	@Column(name = "minDenomination", length = 50)
	public String getMindenomination() {
		return mindenomination;
	}

	public void setMindenomination(String mindenomination) {
		this.mindenomination = mindenomination;
	}

	@Column(name = "ncaAvDailyTurnover", length = 50)
	public String getNcaavdailyturnover() {
		return ncaavdailyturnover;
	}

	public void setNcaavdailyturnover(String ncaavdailyturnover) {
		this.ncaavdailyturnover = ncaavdailyturnover;
	}

	@Column(name = "ncaAvDailyTurnCurCode", length = 50)
	public String getNcaavdailyturncurcode() {
		return ncaavdailyturncurcode;
	}

	public void setNcaavdailyturncurcode(String ncaavdailyturncurcode) {
		this.ncaavdailyturncurcode = ncaavdailyturncurcode;
	}

	@Column(name = "ncaFreeFl", length = 50)
	public String getNcafreefl() {
		return ncafreefl;
	}

	public void setNcafreefl(String ncafreefl) {
		this.ncafreefl = ncafreefl;
	}

	@Column(name = "ncaFreeFlCurCode", length = 50)
	public String getNcafreeflcurcode() {
		return ncafreeflcurcode;
	}

	public void setNcafreeflcurcode(String ncafreeflcurcode) {
		this.ncafreeflcurcode = ncafreeflcurcode;
	}

	@Column(name = "notionalCurESMA", length = 50)
	public String getNotionalcuresma() {
		return notionalcuresma;
	}

	public void setNotionalcuresma(String notionalcuresma) {
		this.notionalcuresma = notionalcuresma;
	}

	@Column(name = "optionRoot", length = 50)
	public String getOptionroot() {
		return optionroot;
	}

	public void setOptionroot(String optionroot) {
		this.optionroot = optionroot;
	}

	@Column(name = "placeholder", length = 50)
	public String getPlaceholder() {
		return placeholder;
	}

	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}

	@Column(name = "priceMultiplierESMA", length = 50)
	public String getPricemultiplieresma() {
		return pricemultiplieresma;
	}

	public void setPricemultiplieresma(String pricemultiplieresma) {
		this.pricemultiplieresma = pricemultiplieresma;
	}

	@Column(name = "prTrMaQuote", length = 50)
	public String getPrtrmaquote() {
		return prtrmaquote;
	}

	public void setPrtrmaquote(String prtrmaquote) {
		this.prtrmaquote = prtrmaquote;
	}

	@Column(name = "quotePermID", length = 50)
	public String getQuotepermid() {
		return quotepermid;
	}

	public void setQuotepermid(String quotepermid) {
		this.quotepermid = quotepermid;
	}

	@Column(name = "reqFATTByIssuer", length = 50)
	public String getReqfattbyissuer() {
		return reqfattbyissuer;
	}

	public void setReqfattbyissuer(String reqfattbyissuer) {
		this.reqfattbyissuer = reqfattbyissuer;
	}

	@Column(name = "reqFATTByIssuerESMA", length = 50)
	public String getReqfattbyissueresma() {
		return reqfattbyissueresma;
	}

	public void setReqfattbyissueresma(String reqfattbyissueresma) {
		this.reqfattbyissueresma = reqfattbyissueresma;
	}

	@Column(name = "securityDescription", length = 50)
	public String getSecuritydescription() {
		return securitydescription;
	}

	public void setSecuritydescription(String securitydescription) {
		this.securitydescription = securitydescription;
	}

	@Column(name = "strikePriceESMA", length = 50)
	public String getStrikepriceesma() {
		return strikepriceesma;
	}

	public void setStrikepriceesma(String strikepriceesma) {
		this.strikepriceesma = strikepriceesma;
	}

	@Column(name = "strikePriceCurESMA", length = 50)
	public String getStrikepricecuresma() {
		return strikepricecuresma;
	}

	public void setStrikepricecuresma(String strikepricecuresma) {
		this.strikepricecuresma = strikepricecuresma;
	}

	@Column(name = "susCategoryESMA", length = 50)
	public String getSuscategoryesma() {
		return suscategoryesma;
	}

	public void setSuscategoryesma(String suscategoryesma) {
		this.suscategoryesma = suscategoryesma;
	}

	@Column(name = "susEndedOnESMA", length = 50)
	public String getSusendedonesma() {
		return susendedonesma;
	}

	public void setSusendedonesma(String susendedonesma) {
		this.susendedonesma = susendedonesma;
	}

	@Column(name = "susOnGoingESMA", length = 50)
	public String getSusongoingesma() {
		return susongoingesma;
	}

	public void setSusongoingesma(String susongoingesma) {
		this.susongoingesma = susongoingesma;
	}

	@Column(name = "susRatESMA", length = 50)
	public String getSusratesma() {
		return susratesma;
	}

	public void setSusratesma(String susratesma) {
		this.susratesma = susratesma;
	}

	@Column(name = "susStOnESMA", length = 50)
	public String getSusstonesma() {
		return susstonesma;
	}

	public void setSusstonesma(String susstonesma) {
		this.susstonesma = susstonesma;
	}

	@Column(name = "ttlAmIssued", length = 50)
	public String getTtlamissued() {
		return ttlamissued;
	}

	public void setTtlamissued(String ttlamissued) {
		this.ttlamissued = ttlamissued;
	}

	@Column(name = "ttlEUTu12MoESMA", length = 50)
	public String getTtleutu12moesma() {
		return ttleutu12moesma;
	}

	public void setTtleutu12moesma(String ttleutu12moesma) {
		this.ttleutu12moesma = ttleutu12moesma;
	}

	@Column(name = "ttlEUVl12MoESMA", length = 50)
	public String getTtleuvl12moesma() {
		return ttleuvl12moesma;
	}

	public void setTtleuvl12moesma(String ttleuvl12moesma) {
		this.ttleuvl12moesma = ttleuvl12moesma;
	}

	@Column(name = "undEeaElig", length = 50)
	public String getUndeeaelig() {
		return undeeaelig;
	}

	public void setUndeeaelig(String undeeaelig) {
		this.undeeaelig = undeeaelig;
	}

	@Column(name = "undIsin", length = 50)
	public String getUndisin() {
		return undisin;
	}

	public void setUndisin(String undisin) {
		this.undisin = undisin;
	}

	@Column(name = "undIsinESMA", length = 50)
	public String getUndisinesma() {
		return undisinesma;
	}

	public void setUndisinesma(String undisinesma) {
		this.undisinesma = undisinesma;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("XrefXxDspId [action=");
		builder.append(action);
		builder.append(", levelcode=");
		builder.append(levelcode);
		builder.append(", ipc=");
		builder.append(ipc);
		builder.append(", quoteid=");
		builder.append(Arrays.toString(quoteid));
		builder.append(", ric=");
		builder.append(ric);
		builder.append(", sedol=");
		builder.append(sedol);
		builder.append(", issuepermid=");
		builder.append(issuepermid);
		builder.append(", assetid=");
		builder.append(Arrays.toString(assetid));
		builder.append(", pilc=");
		builder.append(pilc);
		builder.append(", cusip=");
		builder.append(cusip);
		builder.append(", orgpermid=");
		builder.append(orgpermid);
		builder.append(", assetstatus=");
		builder.append(assetstatus);
		builder.append(", basketundisinlist=");
		builder.append(basketundisinlist);
		builder.append(", basketwrrindicator=");
		builder.append(basketwrrindicator);
		builder.append(", cficode=");
		builder.append(cficode);
		builder.append(", cincode=");
		builder.append(cincode);
		builder.append(", complegaldomicile=");
		builder.append(complegaldomicile);
		builder.append(", compshortname=");
		builder.append(compshortname);
		builder.append(", dealstartdate=");
		builder.append(dealstartdate);
		builder.append(", eeavenueelflg=");
		builder.append(eeavenueelflg);
		builder.append(", fininsshname=");
		builder.append(fininsshname);
		builder.append(", fininsshnameesma=");
		builder.append(fininsshnameesma);
		builder.append(", inesmafirds=");
		builder.append(inesmafirds);
		builder.append(", insclassesma=");
		builder.append(insclassesma);
		builder.append(", insfullnameesma=");
		builder.append(insfullnameesma);
		builder.append(", isin=");
		builder.append(isin);
		builder.append(", issuedate=");
		builder.append(issuedate);
		builder.append(", issuerlei=");
		builder.append(issuerlei);
		builder.append(", issortrvenueleiesma=");
		builder.append(issortrvenueleiesma);
		builder.append(", mrkattsrcpermid=");
		builder.append(mrkattsrcpermid);
		builder.append(", marketmic=");
		builder.append(marketmic);
		builder.append(", maturitydate=");
		builder.append(maturitydate);
		builder.append(", mifidasclofun=");
		builder.append(mifidasclofun);
		builder.append(", mifidadnapinsesma=");
		builder.append(mifidadnapinsesma);
		builder.append(", mifidadnoftpinsesma=");
		builder.append(mifidadnoftpinsesma);
		builder.append(", mifidavdatuesma=");
		builder.append(mifidavdatuesma);
		builder.append(", mifidavdatucurcode=");
		builder.append(mifidavdatucurcode);
		builder.append(", mifidavvaoftresma=");
		builder.append(mifidavvaoftresma);
		builder.append(", mifidavvaoftrcurcode=");
		builder.append(mifidavvaoftrcurcode);
		builder.append(", mifidbaseprod=");
		builder.append(mifidbaseprod);
		builder.append(", mifidbaseprodesma=");
		builder.append(mifidbaseprodesma);
		builder.append(", mifidbondseni=");
		builder.append(mifidbondseni);
		builder.append(", mifidbondtype=");
		builder.append(mifidbondtype);
		builder.append(", mifidclobflag=");
		builder.append(mifidclobflag);
		builder.append(", mifidcofialiinfornewbo=");
		builder.append(mifidcofialiinfornewbo);
		builder.append(", mifidcodein=");
		builder.append(mifidcodein);
		builder.append(", mifidcodeinesma=");
		builder.append(mifidcodeinesma);
		builder.append(", mifidcoinflesma=");
		builder.append(mifidcoinflesma);
		builder.append(", mifidcoinre=");
		builder.append(mifidcoinre);
		builder.append(", mifidcotype=");
		builder.append(mifidcotype);
		builder.append(", mifiddeltypeesma=");
		builder.append(mifiddeltypeesma);
		builder.append(", mifidemalsubtype=");
		builder.append(mifidemalsubtype);
		builder.append(", mifidexerstyle=");
		builder.append(mifidexerstyle);
		builder.append(", mifidexerstyleesma=");
		builder.append(mifidexerstyleesma);
		builder.append(", mifidexpdateesma=");
		builder.append(mifidexpdateesma);
		builder.append(", mifidfiprtype=");
		builder.append(mifidfiprtype);
		builder.append(", mifidfiprtypeesma=");
		builder.append(mifidfiprtypeesma);
		builder.append(", mifidfrtradedate=");
		builder.append(mifidfrtradedate);
		builder.append(", mifidfrtradedateesma=");
		builder.append(mifidfrtradedateesma);
		builder.append(", mifidflag=");
		builder.append(mifidflag);
		builder.append(", mifidfrfloatesma=");
		builder.append(mifidfrfloatesma);
		builder.append(", mifidfrfloatcurcode=");
		builder.append(mifidfrfloatcurcode);
		builder.append(", mifidfusubpr=");
		builder.append(mifidfusubpr);
		builder.append(", mifidfusubpresma=");
		builder.append(mifidfusubpresma);
		builder.append(", mifidissdateesma=");
		builder.append(mifidissdateesma);
		builder.append(", mifidisssizeesma=");
		builder.append(mifidisssizeesma);
		builder.append(", mifidmatdate=");
		builder.append(mifidmatdate);
		builder.append(", mifidmatdateesma=");
		builder.append(mifidmatdateesma);
		builder.append(", mifidmostremaesma=");
		builder.append(mifidmostremaesma);
		builder.append(", mifidoptype=");
		builder.append(mifidoptype);
		builder.append(", mifidoptypeesma=");
		builder.append(mifidoptypeesma);
		builder.append(", mifidptuw12esma=");
		builder.append(mifidptuw12esma);
		builder.append(", mifidptuwptv12mesma=");
		builder.append(mifidptuwptv12mesma);
		builder.append(", mifidpotrlisthfl=");
		builder.append(mifidpotrlisthfl);
		builder.append(", mifidpotrlisthvl=");
		builder.append(mifidpotrlisthvl);
		builder.append(", mifidpotrlistrper=");
		builder.append(mifidpotrlistrper);
		builder.append(", mifidpotrlisvoper=");
		builder.append(mifidpotrlisvoper);
		builder.append(", mifidpotrsstithfl=");
		builder.append(mifidpotrsstithfl);
		builder.append(", mifidpotrsstithvl=");
		builder.append(mifidpotrsstithvl);
		builder.append(", mifidpotrsstitrper=");
		builder.append(mifidpotrsstitrper);
		builder.append(", mifidpotrsstivoper=");
		builder.append(mifidpotrsstivoper);
		builder.append(", mifidpretrlisthfl=");
		builder.append(mifidpretrlisthfl);
		builder.append(", mifidpretrlisthvl=");
		builder.append(mifidpretrlisthvl);
		builder.append(", mifidpretrlistrper=");
		builder.append(mifidpretrlistrper);
		builder.append(", mifidpretrsstithfl=");
		builder.append(mifidpretrsstithfl);
		builder.append(", mifidpretrsstithvl=");
		builder.append(mifidpretrsstithvl);
		builder.append(", mifidpretrsstitrper=");
		builder.append(mifidpretrsstitrper);
		builder.append(", mifidregulatedesma=");
		builder.append(mifidregulatedesma);
		builder.append(", mifidstmasizeesma=");
		builder.append(mifidstmasizeesma);
		builder.append(", mifidstmasizecurcode=");
		builder.append(mifidstmasizecurcode);
		builder.append(", mifidsubprod=");
		builder.append(mifidsubprod);
		builder.append(", mifidsubprodesma=");
		builder.append(mifidsubprodesma);
		builder.append(", mifidtermdate=");
		builder.append(mifidtermdate);
		builder.append(", mifidtermdateesma=");
		builder.append(mifidtermdateesma);
		builder.append(", mifidtrobflag=");
		builder.append(mifidtrobflag);
		builder.append(", mifidtradapdate=");
		builder.append(mifidtradapdate);
		builder.append(", mifidtradapdateesma=");
		builder.append(mifidtradapdateesma);
		builder.append(", mifidtradreqdate=");
		builder.append(mifidtradreqdate);
		builder.append(", mifidtradreqdateesma=");
		builder.append(mifidtradreqdateesma);
		builder.append(", mifidtrtype=");
		builder.append(mifidtrtype);
		builder.append(", mifidtrtypeesma=");
		builder.append(mifidtrtypeesma);
		builder.append(", mifidundindname=");
		builder.append(mifidundindname);
		builder.append(", mifidundindnameesma=");
		builder.append(mifidundindnameesma);
		builder.append(", mifidundindtermesma=");
		builder.append(mifidundindtermesma);
		builder.append(", mifidundtype=");
		builder.append(mifidundtype);
		builder.append(", mifiridentifier=");
		builder.append(mifiridentifier);
		builder.append(", mindenomination=");
		builder.append(mindenomination);
		builder.append(", ncaavdailyturnover=");
		builder.append(ncaavdailyturnover);
		builder.append(", ncaavdailyturncurcode=");
		builder.append(ncaavdailyturncurcode);
		builder.append(", ncafreefl=");
		builder.append(ncafreefl);
		builder.append(", ncafreeflcurcode=");
		builder.append(ncafreeflcurcode);
		builder.append(", notionalcuresma=");
		builder.append(notionalcuresma);
		builder.append(", optionroot=");
		builder.append(optionroot);
		builder.append(", placeholder=");
		builder.append(placeholder);
		builder.append(", pricemultiplieresma=");
		builder.append(pricemultiplieresma);
		builder.append(", prtrmaquote=");
		builder.append(prtrmaquote);
		builder.append(", quotepermid=");
		builder.append(quotepermid);
		builder.append(", reqfattbyissuer=");
		builder.append(reqfattbyissuer);
		builder.append(", reqfattbyissueresma=");
		builder.append(reqfattbyissueresma);
		builder.append(", securitydescription=");
		builder.append(securitydescription);
		builder.append(", strikepriceesma=");
		builder.append(strikepriceesma);
		builder.append(", strikepricecuresma=");
		builder.append(strikepricecuresma);
		builder.append(", suscategoryesma=");
		builder.append(suscategoryesma);
		builder.append(", susendedonesma=");
		builder.append(susendedonesma);
		builder.append(", susongoingesma=");
		builder.append(susongoingesma);
		builder.append(", susratesma=");
		builder.append(susratesma);
		builder.append(", susstonesma=");
		builder.append(susstonesma);
		builder.append(", ttlamissued=");
		builder.append(ttlamissued);
		builder.append(", ttleutu12moesma=");
		builder.append(ttleutu12moesma);
		builder.append(", ttleuvl12moesma=");
		builder.append(ttleuvl12moesma);
		builder.append(", undeeaelig=");
		builder.append(undeeaelig);
		builder.append(", undisin=");
		builder.append(undisin);
		builder.append(", undisinesma=");
		builder.append(undisinesma);
		builder.append("]");
		return builder.toString();
	}

}
