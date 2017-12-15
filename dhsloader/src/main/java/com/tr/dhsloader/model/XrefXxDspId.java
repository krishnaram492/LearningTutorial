package com.tr.dhsloader.model;

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
	private String quoteid;
	private String ric;
	private String sedol;
	private String issuepermid;
	private String assetid;
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
	public String getQuoteid() {
		return quoteid;
	}

	public void setQuoteid(String quoteid) {
		this.quoteid = quoteid;
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
	public String getAssetid() {
		return assetid;
	}

	public void setAssetid(String assetid) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((action == null) ? 0 : action.hashCode());
		result = prime * result + ((assetid == null) ? 0 : assetid.hashCode());
		result = prime * result + ((assetstatus == null) ? 0 : assetstatus.hashCode());
		result = prime * result + ((basketundisinlist == null) ? 0 : basketundisinlist.hashCode());
		result = prime * result + ((basketwrrindicator == null) ? 0 : basketwrrindicator.hashCode());
		result = prime * result + ((cficode == null) ? 0 : cficode.hashCode());
		result = prime * result + ((cincode == null) ? 0 : cincode.hashCode());
		result = prime * result + ((complegaldomicile == null) ? 0 : complegaldomicile.hashCode());
		result = prime * result + ((compshortname == null) ? 0 : compshortname.hashCode());
		result = prime * result + ((cusip == null) ? 0 : cusip.hashCode());
		result = prime * result + ((dealstartdate == null) ? 0 : dealstartdate.hashCode());
		result = prime * result + ((eeavenueelflg == null) ? 0 : eeavenueelflg.hashCode());
		result = prime * result + ((fininsshname == null) ? 0 : fininsshname.hashCode());
		result = prime * result + ((fininsshnameesma == null) ? 0 : fininsshnameesma.hashCode());
		result = prime * result + ((inesmafirds == null) ? 0 : inesmafirds.hashCode());
		result = prime * result + ((insclassesma == null) ? 0 : insclassesma.hashCode());
		result = prime * result + ((insfullnameesma == null) ? 0 : insfullnameesma.hashCode());
		result = prime * result + ((ipc == null) ? 0 : ipc.hashCode());
		result = prime * result + ((isin == null) ? 0 : isin.hashCode());
		result = prime * result + ((issortrvenueleiesma == null) ? 0 : issortrvenueleiesma.hashCode());
		result = prime * result + ((issuedate == null) ? 0 : issuedate.hashCode());
		result = prime * result + ((issuepermid == null) ? 0 : issuepermid.hashCode());
		result = prime * result + ((issuerlei == null) ? 0 : issuerlei.hashCode());
		result = prime * result + ((levelcode == null) ? 0 : levelcode.hashCode());
		result = prime * result + ((marketmic == null) ? 0 : marketmic.hashCode());
		result = prime * result + ((maturitydate == null) ? 0 : maturitydate.hashCode());
		result = prime * result + ((mifidadnapinsesma == null) ? 0 : mifidadnapinsesma.hashCode());
		result = prime * result + ((mifidadnoftpinsesma == null) ? 0 : mifidadnoftpinsesma.hashCode());
		result = prime * result + ((mifidasclofun == null) ? 0 : mifidasclofun.hashCode());
		result = prime * result + ((mifidavdatucurcode == null) ? 0 : mifidavdatucurcode.hashCode());
		result = prime * result + ((mifidavdatuesma == null) ? 0 : mifidavdatuesma.hashCode());
		result = prime * result + ((mifidavvaoftrcurcode == null) ? 0 : mifidavvaoftrcurcode.hashCode());
		result = prime * result + ((mifidavvaoftresma == null) ? 0 : mifidavvaoftresma.hashCode());
		result = prime * result + ((mifidbaseprod == null) ? 0 : mifidbaseprod.hashCode());
		result = prime * result + ((mifidbaseprodesma == null) ? 0 : mifidbaseprodesma.hashCode());
		result = prime * result + ((mifidbondseni == null) ? 0 : mifidbondseni.hashCode());
		result = prime * result + ((mifidbondtype == null) ? 0 : mifidbondtype.hashCode());
		result = prime * result + ((mifidclobflag == null) ? 0 : mifidclobflag.hashCode());
		result = prime * result + ((mifidcodein == null) ? 0 : mifidcodein.hashCode());
		result = prime * result + ((mifidcodeinesma == null) ? 0 : mifidcodeinesma.hashCode());
		result = prime * result + ((mifidcofialiinfornewbo == null) ? 0 : mifidcofialiinfornewbo.hashCode());
		result = prime * result + ((mifidcoinflesma == null) ? 0 : mifidcoinflesma.hashCode());
		result = prime * result + ((mifidcoinre == null) ? 0 : mifidcoinre.hashCode());
		result = prime * result + ((mifidcotype == null) ? 0 : mifidcotype.hashCode());
		result = prime * result + ((mifiddeltypeesma == null) ? 0 : mifiddeltypeesma.hashCode());
		result = prime * result + ((mifidemalsubtype == null) ? 0 : mifidemalsubtype.hashCode());
		result = prime * result + ((mifidexerstyle == null) ? 0 : mifidexerstyle.hashCode());
		result = prime * result + ((mifidexerstyleesma == null) ? 0 : mifidexerstyleesma.hashCode());
		result = prime * result + ((mifidexpdateesma == null) ? 0 : mifidexpdateesma.hashCode());
		result = prime * result + ((mifidfiprtype == null) ? 0 : mifidfiprtype.hashCode());
		result = prime * result + ((mifidfiprtypeesma == null) ? 0 : mifidfiprtypeesma.hashCode());
		result = prime * result + ((mifidflag == null) ? 0 : mifidflag.hashCode());
		result = prime * result + ((mifidfrfloatcurcode == null) ? 0 : mifidfrfloatcurcode.hashCode());
		result = prime * result + ((mifidfrfloatesma == null) ? 0 : mifidfrfloatesma.hashCode());
		result = prime * result + ((mifidfrtradedate == null) ? 0 : mifidfrtradedate.hashCode());
		result = prime * result + ((mifidfrtradedateesma == null) ? 0 : mifidfrtradedateesma.hashCode());
		result = prime * result + ((mifidfusubpr == null) ? 0 : mifidfusubpr.hashCode());
		result = prime * result + ((mifidfusubpresma == null) ? 0 : mifidfusubpresma.hashCode());
		result = prime * result + ((mifidissdateesma == null) ? 0 : mifidissdateesma.hashCode());
		result = prime * result + ((mifidisssizeesma == null) ? 0 : mifidisssizeesma.hashCode());
		result = prime * result + ((mifidmatdate == null) ? 0 : mifidmatdate.hashCode());
		result = prime * result + ((mifidmatdateesma == null) ? 0 : mifidmatdateesma.hashCode());
		result = prime * result + ((mifidmostremaesma == null) ? 0 : mifidmostremaesma.hashCode());
		result = prime * result + ((mifidoptype == null) ? 0 : mifidoptype.hashCode());
		result = prime * result + ((mifidoptypeesma == null) ? 0 : mifidoptypeesma.hashCode());
		result = prime * result + ((mifidpotrlisthfl == null) ? 0 : mifidpotrlisthfl.hashCode());
		result = prime * result + ((mifidpotrlisthvl == null) ? 0 : mifidpotrlisthvl.hashCode());
		result = prime * result + ((mifidpotrlistrper == null) ? 0 : mifidpotrlistrper.hashCode());
		result = prime * result + ((mifidpotrlisvoper == null) ? 0 : mifidpotrlisvoper.hashCode());
		result = prime * result + ((mifidpotrsstithfl == null) ? 0 : mifidpotrsstithfl.hashCode());
		result = prime * result + ((mifidpotrsstithvl == null) ? 0 : mifidpotrsstithvl.hashCode());
		result = prime * result + ((mifidpotrsstitrper == null) ? 0 : mifidpotrsstitrper.hashCode());
		result = prime * result + ((mifidpotrsstivoper == null) ? 0 : mifidpotrsstivoper.hashCode());
		result = prime * result + ((mifidpretrlisthfl == null) ? 0 : mifidpretrlisthfl.hashCode());
		result = prime * result + ((mifidpretrlisthvl == null) ? 0 : mifidpretrlisthvl.hashCode());
		result = prime * result + ((mifidpretrlistrper == null) ? 0 : mifidpretrlistrper.hashCode());
		result = prime * result + ((mifidpretrsstithfl == null) ? 0 : mifidpretrsstithfl.hashCode());
		result = prime * result + ((mifidpretrsstithvl == null) ? 0 : mifidpretrsstithvl.hashCode());
		result = prime * result + ((mifidpretrsstitrper == null) ? 0 : mifidpretrsstitrper.hashCode());
		result = prime * result + ((mifidptuw12esma == null) ? 0 : mifidptuw12esma.hashCode());
		result = prime * result + ((mifidptuwptv12mesma == null) ? 0 : mifidptuwptv12mesma.hashCode());
		result = prime * result + ((mifidregulatedesma == null) ? 0 : mifidregulatedesma.hashCode());
		result = prime * result + ((mifidstmasizecurcode == null) ? 0 : mifidstmasizecurcode.hashCode());
		result = prime * result + ((mifidstmasizeesma == null) ? 0 : mifidstmasizeesma.hashCode());
		result = prime * result + ((mifidsubprod == null) ? 0 : mifidsubprod.hashCode());
		result = prime * result + ((mifidsubprodesma == null) ? 0 : mifidsubprodesma.hashCode());
		result = prime * result + ((mifidtermdate == null) ? 0 : mifidtermdate.hashCode());
		result = prime * result + ((mifidtermdateesma == null) ? 0 : mifidtermdateesma.hashCode());
		result = prime * result + ((mifidtradapdate == null) ? 0 : mifidtradapdate.hashCode());
		result = prime * result + ((mifidtradapdateesma == null) ? 0 : mifidtradapdateesma.hashCode());
		result = prime * result + ((mifidtradreqdate == null) ? 0 : mifidtradreqdate.hashCode());
		result = prime * result + ((mifidtradreqdateesma == null) ? 0 : mifidtradreqdateesma.hashCode());
		result = prime * result + ((mifidtrobflag == null) ? 0 : mifidtrobflag.hashCode());
		result = prime * result + ((mifidtrtype == null) ? 0 : mifidtrtype.hashCode());
		result = prime * result + ((mifidtrtypeesma == null) ? 0 : mifidtrtypeesma.hashCode());
		result = prime * result + ((mifidundindname == null) ? 0 : mifidundindname.hashCode());
		result = prime * result + ((mifidundindnameesma == null) ? 0 : mifidundindnameesma.hashCode());
		result = prime * result + ((mifidundindtermesma == null) ? 0 : mifidundindtermesma.hashCode());
		result = prime * result + ((mifidundtype == null) ? 0 : mifidundtype.hashCode());
		result = prime * result + ((mifiridentifier == null) ? 0 : mifiridentifier.hashCode());
		result = prime * result + ((mindenomination == null) ? 0 : mindenomination.hashCode());
		result = prime * result + ((mrkattsrcpermid == null) ? 0 : mrkattsrcpermid.hashCode());
		result = prime * result + ((ncaavdailyturncurcode == null) ? 0 : ncaavdailyturncurcode.hashCode());
		result = prime * result + ((ncaavdailyturnover == null) ? 0 : ncaavdailyturnover.hashCode());
		result = prime * result + ((ncafreefl == null) ? 0 : ncafreefl.hashCode());
		result = prime * result + ((ncafreeflcurcode == null) ? 0 : ncafreeflcurcode.hashCode());
		result = prime * result + ((notionalcuresma == null) ? 0 : notionalcuresma.hashCode());
		result = prime * result + ((optionroot == null) ? 0 : optionroot.hashCode());
		result = prime * result + ((orgpermid == null) ? 0 : orgpermid.hashCode());
		result = prime * result + ((pilc == null) ? 0 : pilc.hashCode());
		result = prime * result + ((placeholder == null) ? 0 : placeholder.hashCode());
		result = prime * result + ((pricemultiplieresma == null) ? 0 : pricemultiplieresma.hashCode());
		result = prime * result + ((prtrmaquote == null) ? 0 : prtrmaquote.hashCode());
		result = prime * result + ((quoteid == null) ? 0 : quoteid.hashCode());
		result = prime * result + ((quotepermid == null) ? 0 : quotepermid.hashCode());
		result = prime * result + ((reqfattbyissuer == null) ? 0 : reqfattbyissuer.hashCode());
		result = prime * result + ((reqfattbyissueresma == null) ? 0 : reqfattbyissueresma.hashCode());
		result = prime * result + ((ric == null) ? 0 : ric.hashCode());
		result = prime * result + ((securitydescription == null) ? 0 : securitydescription.hashCode());
		result = prime * result + ((sedol == null) ? 0 : sedol.hashCode());
		result = prime * result + ((strikepricecuresma == null) ? 0 : strikepricecuresma.hashCode());
		result = prime * result + ((strikepriceesma == null) ? 0 : strikepriceesma.hashCode());
		result = prime * result + ((suscategoryesma == null) ? 0 : suscategoryesma.hashCode());
		result = prime * result + ((susendedonesma == null) ? 0 : susendedonesma.hashCode());
		result = prime * result + ((susongoingesma == null) ? 0 : susongoingesma.hashCode());
		result = prime * result + ((susratesma == null) ? 0 : susratesma.hashCode());
		result = prime * result + ((susstonesma == null) ? 0 : susstonesma.hashCode());
		result = prime * result + ((ttlamissued == null) ? 0 : ttlamissued.hashCode());
		result = prime * result + ((ttleutu12moesma == null) ? 0 : ttleutu12moesma.hashCode());
		result = prime * result + ((ttleuvl12moesma == null) ? 0 : ttleuvl12moesma.hashCode());
		result = prime * result + ((undeeaelig == null) ? 0 : undeeaelig.hashCode());
		result = prime * result + ((undisin == null) ? 0 : undisin.hashCode());
		result = prime * result + ((undisinesma == null) ? 0 : undisinesma.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		XrefXxDspId other = (XrefXxDspId) obj;
		if (action == null) {
			if (other.action != null)
				return false;
		} else if (!action.equals(other.action))
			return false;
		if (assetid == null) {
			if (other.assetid != null)
				return false;
		} else if (!assetid.equals(other.assetid))
			return false;
		if (assetstatus == null) {
			if (other.assetstatus != null)
				return false;
		} else if (!assetstatus.equals(other.assetstatus))
			return false;
		if (basketundisinlist == null) {
			if (other.basketundisinlist != null)
				return false;
		} else if (!basketundisinlist.equals(other.basketundisinlist))
			return false;
		if (basketwrrindicator == null) {
			if (other.basketwrrindicator != null)
				return false;
		} else if (!basketwrrindicator.equals(other.basketwrrindicator))
			return false;
		if (cficode == null) {
			if (other.cficode != null)
				return false;
		} else if (!cficode.equals(other.cficode))
			return false;
		if (cincode == null) {
			if (other.cincode != null)
				return false;
		} else if (!cincode.equals(other.cincode))
			return false;
		if (complegaldomicile == null) {
			if (other.complegaldomicile != null)
				return false;
		} else if (!complegaldomicile.equals(other.complegaldomicile))
			return false;
		if (compshortname == null) {
			if (other.compshortname != null)
				return false;
		} else if (!compshortname.equals(other.compshortname))
			return false;
		if (cusip == null) {
			if (other.cusip != null)
				return false;
		} else if (!cusip.equals(other.cusip))
			return false;
		if (dealstartdate == null) {
			if (other.dealstartdate != null)
				return false;
		} else if (!dealstartdate.equals(other.dealstartdate))
			return false;
		if (eeavenueelflg == null) {
			if (other.eeavenueelflg != null)
				return false;
		} else if (!eeavenueelflg.equals(other.eeavenueelflg))
			return false;
		if (fininsshname == null) {
			if (other.fininsshname != null)
				return false;
		} else if (!fininsshname.equals(other.fininsshname))
			return false;
		if (fininsshnameesma == null) {
			if (other.fininsshnameesma != null)
				return false;
		} else if (!fininsshnameesma.equals(other.fininsshnameesma))
			return false;
		if (inesmafirds == null) {
			if (other.inesmafirds != null)
				return false;
		} else if (!inesmafirds.equals(other.inesmafirds))
			return false;
		if (insclassesma == null) {
			if (other.insclassesma != null)
				return false;
		} else if (!insclassesma.equals(other.insclassesma))
			return false;
		if (insfullnameesma == null) {
			if (other.insfullnameesma != null)
				return false;
		} else if (!insfullnameesma.equals(other.insfullnameesma))
			return false;
		if (ipc == null) {
			if (other.ipc != null)
				return false;
		} else if (!ipc.equals(other.ipc))
			return false;
		if (isin == null) {
			if (other.isin != null)
				return false;
		} else if (!isin.equals(other.isin))
			return false;
		if (issortrvenueleiesma == null) {
			if (other.issortrvenueleiesma != null)
				return false;
		} else if (!issortrvenueleiesma.equals(other.issortrvenueleiesma))
			return false;
		if (issuedate == null) {
			if (other.issuedate != null)
				return false;
		} else if (!issuedate.equals(other.issuedate))
			return false;
		if (issuepermid == null) {
			if (other.issuepermid != null)
				return false;
		} else if (!issuepermid.equals(other.issuepermid))
			return false;
		if (issuerlei == null) {
			if (other.issuerlei != null)
				return false;
		} else if (!issuerlei.equals(other.issuerlei))
			return false;
		if (levelcode == null) {
			if (other.levelcode != null)
				return false;
		} else if (!levelcode.equals(other.levelcode))
			return false;
		if (marketmic == null) {
			if (other.marketmic != null)
				return false;
		} else if (!marketmic.equals(other.marketmic))
			return false;
		if (maturitydate == null) {
			if (other.maturitydate != null)
				return false;
		} else if (!maturitydate.equals(other.maturitydate))
			return false;
		if (mifidadnapinsesma == null) {
			if (other.mifidadnapinsesma != null)
				return false;
		} else if (!mifidadnapinsesma.equals(other.mifidadnapinsesma))
			return false;
		if (mifidadnoftpinsesma == null) {
			if (other.mifidadnoftpinsesma != null)
				return false;
		} else if (!mifidadnoftpinsesma.equals(other.mifidadnoftpinsesma))
			return false;
		if (mifidasclofun == null) {
			if (other.mifidasclofun != null)
				return false;
		} else if (!mifidasclofun.equals(other.mifidasclofun))
			return false;
		if (mifidavdatucurcode == null) {
			if (other.mifidavdatucurcode != null)
				return false;
		} else if (!mifidavdatucurcode.equals(other.mifidavdatucurcode))
			return false;
		if (mifidavdatuesma == null) {
			if (other.mifidavdatuesma != null)
				return false;
		} else if (!mifidavdatuesma.equals(other.mifidavdatuesma))
			return false;
		if (mifidavvaoftrcurcode == null) {
			if (other.mifidavvaoftrcurcode != null)
				return false;
		} else if (!mifidavvaoftrcurcode.equals(other.mifidavvaoftrcurcode))
			return false;
		if (mifidavvaoftresma == null) {
			if (other.mifidavvaoftresma != null)
				return false;
		} else if (!mifidavvaoftresma.equals(other.mifidavvaoftresma))
			return false;
		if (mifidbaseprod == null) {
			if (other.mifidbaseprod != null)
				return false;
		} else if (!mifidbaseprod.equals(other.mifidbaseprod))
			return false;
		if (mifidbaseprodesma == null) {
			if (other.mifidbaseprodesma != null)
				return false;
		} else if (!mifidbaseprodesma.equals(other.mifidbaseprodesma))
			return false;
		if (mifidbondseni == null) {
			if (other.mifidbondseni != null)
				return false;
		} else if (!mifidbondseni.equals(other.mifidbondseni))
			return false;
		if (mifidbondtype == null) {
			if (other.mifidbondtype != null)
				return false;
		} else if (!mifidbondtype.equals(other.mifidbondtype))
			return false;
		if (mifidclobflag == null) {
			if (other.mifidclobflag != null)
				return false;
		} else if (!mifidclobflag.equals(other.mifidclobflag))
			return false;
		if (mifidcodein == null) {
			if (other.mifidcodein != null)
				return false;
		} else if (!mifidcodein.equals(other.mifidcodein))
			return false;
		if (mifidcodeinesma == null) {
			if (other.mifidcodeinesma != null)
				return false;
		} else if (!mifidcodeinesma.equals(other.mifidcodeinesma))
			return false;
		if (mifidcofialiinfornewbo == null) {
			if (other.mifidcofialiinfornewbo != null)
				return false;
		} else if (!mifidcofialiinfornewbo.equals(other.mifidcofialiinfornewbo))
			return false;
		if (mifidcoinflesma == null) {
			if (other.mifidcoinflesma != null)
				return false;
		} else if (!mifidcoinflesma.equals(other.mifidcoinflesma))
			return false;
		if (mifidcoinre == null) {
			if (other.mifidcoinre != null)
				return false;
		} else if (!mifidcoinre.equals(other.mifidcoinre))
			return false;
		if (mifidcotype == null) {
			if (other.mifidcotype != null)
				return false;
		} else if (!mifidcotype.equals(other.mifidcotype))
			return false;
		if (mifiddeltypeesma == null) {
			if (other.mifiddeltypeesma != null)
				return false;
		} else if (!mifiddeltypeesma.equals(other.mifiddeltypeesma))
			return false;
		if (mifidemalsubtype == null) {
			if (other.mifidemalsubtype != null)
				return false;
		} else if (!mifidemalsubtype.equals(other.mifidemalsubtype))
			return false;
		if (mifidexerstyle == null) {
			if (other.mifidexerstyle != null)
				return false;
		} else if (!mifidexerstyle.equals(other.mifidexerstyle))
			return false;
		if (mifidexerstyleesma == null) {
			if (other.mifidexerstyleesma != null)
				return false;
		} else if (!mifidexerstyleesma.equals(other.mifidexerstyleesma))
			return false;
		if (mifidexpdateesma == null) {
			if (other.mifidexpdateesma != null)
				return false;
		} else if (!mifidexpdateesma.equals(other.mifidexpdateesma))
			return false;
		if (mifidfiprtype == null) {
			if (other.mifidfiprtype != null)
				return false;
		} else if (!mifidfiprtype.equals(other.mifidfiprtype))
			return false;
		if (mifidfiprtypeesma == null) {
			if (other.mifidfiprtypeesma != null)
				return false;
		} else if (!mifidfiprtypeesma.equals(other.mifidfiprtypeesma))
			return false;
		if (mifidflag == null) {
			if (other.mifidflag != null)
				return false;
		} else if (!mifidflag.equals(other.mifidflag))
			return false;
		if (mifidfrfloatcurcode == null) {
			if (other.mifidfrfloatcurcode != null)
				return false;
		} else if (!mifidfrfloatcurcode.equals(other.mifidfrfloatcurcode))
			return false;
		if (mifidfrfloatesma == null) {
			if (other.mifidfrfloatesma != null)
				return false;
		} else if (!mifidfrfloatesma.equals(other.mifidfrfloatesma))
			return false;
		if (mifidfrtradedate == null) {
			if (other.mifidfrtradedate != null)
				return false;
		} else if (!mifidfrtradedate.equals(other.mifidfrtradedate))
			return false;
		if (mifidfrtradedateesma == null) {
			if (other.mifidfrtradedateesma != null)
				return false;
		} else if (!mifidfrtradedateesma.equals(other.mifidfrtradedateesma))
			return false;
		if (mifidfusubpr == null) {
			if (other.mifidfusubpr != null)
				return false;
		} else if (!mifidfusubpr.equals(other.mifidfusubpr))
			return false;
		if (mifidfusubpresma == null) {
			if (other.mifidfusubpresma != null)
				return false;
		} else if (!mifidfusubpresma.equals(other.mifidfusubpresma))
			return false;
		if (mifidissdateesma == null) {
			if (other.mifidissdateesma != null)
				return false;
		} else if (!mifidissdateesma.equals(other.mifidissdateesma))
			return false;
		if (mifidisssizeesma == null) {
			if (other.mifidisssizeesma != null)
				return false;
		} else if (!mifidisssizeesma.equals(other.mifidisssizeesma))
			return false;
		if (mifidmatdate == null) {
			if (other.mifidmatdate != null)
				return false;
		} else if (!mifidmatdate.equals(other.mifidmatdate))
			return false;
		if (mifidmatdateesma == null) {
			if (other.mifidmatdateesma != null)
				return false;
		} else if (!mifidmatdateesma.equals(other.mifidmatdateesma))
			return false;
		if (mifidmostremaesma == null) {
			if (other.mifidmostremaesma != null)
				return false;
		} else if (!mifidmostremaesma.equals(other.mifidmostremaesma))
			return false;
		if (mifidoptype == null) {
			if (other.mifidoptype != null)
				return false;
		} else if (!mifidoptype.equals(other.mifidoptype))
			return false;
		if (mifidoptypeesma == null) {
			if (other.mifidoptypeesma != null)
				return false;
		} else if (!mifidoptypeesma.equals(other.mifidoptypeesma))
			return false;
		if (mifidpotrlisthfl == null) {
			if (other.mifidpotrlisthfl != null)
				return false;
		} else if (!mifidpotrlisthfl.equals(other.mifidpotrlisthfl))
			return false;
		if (mifidpotrlisthvl == null) {
			if (other.mifidpotrlisthvl != null)
				return false;
		} else if (!mifidpotrlisthvl.equals(other.mifidpotrlisthvl))
			return false;
		if (mifidpotrlistrper == null) {
			if (other.mifidpotrlistrper != null)
				return false;
		} else if (!mifidpotrlistrper.equals(other.mifidpotrlistrper))
			return false;
		if (mifidpotrlisvoper == null) {
			if (other.mifidpotrlisvoper != null)
				return false;
		} else if (!mifidpotrlisvoper.equals(other.mifidpotrlisvoper))
			return false;
		if (mifidpotrsstithfl == null) {
			if (other.mifidpotrsstithfl != null)
				return false;
		} else if (!mifidpotrsstithfl.equals(other.mifidpotrsstithfl))
			return false;
		if (mifidpotrsstithvl == null) {
			if (other.mifidpotrsstithvl != null)
				return false;
		} else if (!mifidpotrsstithvl.equals(other.mifidpotrsstithvl))
			return false;
		if (mifidpotrsstitrper == null) {
			if (other.mifidpotrsstitrper != null)
				return false;
		} else if (!mifidpotrsstitrper.equals(other.mifidpotrsstitrper))
			return false;
		if (mifidpotrsstivoper == null) {
			if (other.mifidpotrsstivoper != null)
				return false;
		} else if (!mifidpotrsstivoper.equals(other.mifidpotrsstivoper))
			return false;
		if (mifidpretrlisthfl == null) {
			if (other.mifidpretrlisthfl != null)
				return false;
		} else if (!mifidpretrlisthfl.equals(other.mifidpretrlisthfl))
			return false;
		if (mifidpretrlisthvl == null) {
			if (other.mifidpretrlisthvl != null)
				return false;
		} else if (!mifidpretrlisthvl.equals(other.mifidpretrlisthvl))
			return false;
		if (mifidpretrlistrper == null) {
			if (other.mifidpretrlistrper != null)
				return false;
		} else if (!mifidpretrlistrper.equals(other.mifidpretrlistrper))
			return false;
		if (mifidpretrsstithfl == null) {
			if (other.mifidpretrsstithfl != null)
				return false;
		} else if (!mifidpretrsstithfl.equals(other.mifidpretrsstithfl))
			return false;
		if (mifidpretrsstithvl == null) {
			if (other.mifidpretrsstithvl != null)
				return false;
		} else if (!mifidpretrsstithvl.equals(other.mifidpretrsstithvl))
			return false;
		if (mifidpretrsstitrper == null) {
			if (other.mifidpretrsstitrper != null)
				return false;
		} else if (!mifidpretrsstitrper.equals(other.mifidpretrsstitrper))
			return false;
		if (mifidptuw12esma == null) {
			if (other.mifidptuw12esma != null)
				return false;
		} else if (!mifidptuw12esma.equals(other.mifidptuw12esma))
			return false;
		if (mifidptuwptv12mesma == null) {
			if (other.mifidptuwptv12mesma != null)
				return false;
		} else if (!mifidptuwptv12mesma.equals(other.mifidptuwptv12mesma))
			return false;
		if (mifidregulatedesma == null) {
			if (other.mifidregulatedesma != null)
				return false;
		} else if (!mifidregulatedesma.equals(other.mifidregulatedesma))
			return false;
		if (mifidstmasizecurcode == null) {
			if (other.mifidstmasizecurcode != null)
				return false;
		} else if (!mifidstmasizecurcode.equals(other.mifidstmasizecurcode))
			return false;
		if (mifidstmasizeesma == null) {
			if (other.mifidstmasizeesma != null)
				return false;
		} else if (!mifidstmasizeesma.equals(other.mifidstmasizeesma))
			return false;
		if (mifidsubprod == null) {
			if (other.mifidsubprod != null)
				return false;
		} else if (!mifidsubprod.equals(other.mifidsubprod))
			return false;
		if (mifidsubprodesma == null) {
			if (other.mifidsubprodesma != null)
				return false;
		} else if (!mifidsubprodesma.equals(other.mifidsubprodesma))
			return false;
		if (mifidtermdate == null) {
			if (other.mifidtermdate != null)
				return false;
		} else if (!mifidtermdate.equals(other.mifidtermdate))
			return false;
		if (mifidtermdateesma == null) {
			if (other.mifidtermdateesma != null)
				return false;
		} else if (!mifidtermdateesma.equals(other.mifidtermdateesma))
			return false;
		if (mifidtradapdate == null) {
			if (other.mifidtradapdate != null)
				return false;
		} else if (!mifidtradapdate.equals(other.mifidtradapdate))
			return false;
		if (mifidtradapdateesma == null) {
			if (other.mifidtradapdateesma != null)
				return false;
		} else if (!mifidtradapdateesma.equals(other.mifidtradapdateesma))
			return false;
		if (mifidtradreqdate == null) {
			if (other.mifidtradreqdate != null)
				return false;
		} else if (!mifidtradreqdate.equals(other.mifidtradreqdate))
			return false;
		if (mifidtradreqdateesma == null) {
			if (other.mifidtradreqdateesma != null)
				return false;
		} else if (!mifidtradreqdateesma.equals(other.mifidtradreqdateesma))
			return false;
		if (mifidtrobflag == null) {
			if (other.mifidtrobflag != null)
				return false;
		} else if (!mifidtrobflag.equals(other.mifidtrobflag))
			return false;
		if (mifidtrtype == null) {
			if (other.mifidtrtype != null)
				return false;
		} else if (!mifidtrtype.equals(other.mifidtrtype))
			return false;
		if (mifidtrtypeesma == null) {
			if (other.mifidtrtypeesma != null)
				return false;
		} else if (!mifidtrtypeesma.equals(other.mifidtrtypeesma))
			return false;
		if (mifidundindname == null) {
			if (other.mifidundindname != null)
				return false;
		} else if (!mifidundindname.equals(other.mifidundindname))
			return false;
		if (mifidundindnameesma == null) {
			if (other.mifidundindnameesma != null)
				return false;
		} else if (!mifidundindnameesma.equals(other.mifidundindnameesma))
			return false;
		if (mifidundindtermesma == null) {
			if (other.mifidundindtermesma != null)
				return false;
		} else if (!mifidundindtermesma.equals(other.mifidundindtermesma))
			return false;
		if (mifidundtype == null) {
			if (other.mifidundtype != null)
				return false;
		} else if (!mifidundtype.equals(other.mifidundtype))
			return false;
		if (mifiridentifier == null) {
			if (other.mifiridentifier != null)
				return false;
		} else if (!mifiridentifier.equals(other.mifiridentifier))
			return false;
		if (mindenomination == null) {
			if (other.mindenomination != null)
				return false;
		} else if (!mindenomination.equals(other.mindenomination))
			return false;
		if (mrkattsrcpermid == null) {
			if (other.mrkattsrcpermid != null)
				return false;
		} else if (!mrkattsrcpermid.equals(other.mrkattsrcpermid))
			return false;
		if (ncaavdailyturncurcode == null) {
			if (other.ncaavdailyturncurcode != null)
				return false;
		} else if (!ncaavdailyturncurcode.equals(other.ncaavdailyturncurcode))
			return false;
		if (ncaavdailyturnover == null) {
			if (other.ncaavdailyturnover != null)
				return false;
		} else if (!ncaavdailyturnover.equals(other.ncaavdailyturnover))
			return false;
		if (ncafreefl == null) {
			if (other.ncafreefl != null)
				return false;
		} else if (!ncafreefl.equals(other.ncafreefl))
			return false;
		if (ncafreeflcurcode == null) {
			if (other.ncafreeflcurcode != null)
				return false;
		} else if (!ncafreeflcurcode.equals(other.ncafreeflcurcode))
			return false;
		if (notionalcuresma == null) {
			if (other.notionalcuresma != null)
				return false;
		} else if (!notionalcuresma.equals(other.notionalcuresma))
			return false;
		if (optionroot == null) {
			if (other.optionroot != null)
				return false;
		} else if (!optionroot.equals(other.optionroot))
			return false;
		if (orgpermid == null) {
			if (other.orgpermid != null)
				return false;
		} else if (!orgpermid.equals(other.orgpermid))
			return false;
		if (pilc == null) {
			if (other.pilc != null)
				return false;
		} else if (!pilc.equals(other.pilc))
			return false;
		if (placeholder == null) {
			if (other.placeholder != null)
				return false;
		} else if (!placeholder.equals(other.placeholder))
			return false;
		if (pricemultiplieresma == null) {
			if (other.pricemultiplieresma != null)
				return false;
		} else if (!pricemultiplieresma.equals(other.pricemultiplieresma))
			return false;
		if (prtrmaquote == null) {
			if (other.prtrmaquote != null)
				return false;
		} else if (!prtrmaquote.equals(other.prtrmaquote))
			return false;
		if (quoteid == null) {
			if (other.quoteid != null)
				return false;
		} else if (!quoteid.equals(other.quoteid))
			return false;
		if (quotepermid == null) {
			if (other.quotepermid != null)
				return false;
		} else if (!quotepermid.equals(other.quotepermid))
			return false;
		if (reqfattbyissuer == null) {
			if (other.reqfattbyissuer != null)
				return false;
		} else if (!reqfattbyissuer.equals(other.reqfattbyissuer))
			return false;
		if (reqfattbyissueresma == null) {
			if (other.reqfattbyissueresma != null)
				return false;
		} else if (!reqfattbyissueresma.equals(other.reqfattbyissueresma))
			return false;
		if (ric == null) {
			if (other.ric != null)
				return false;
		} else if (!ric.equals(other.ric))
			return false;
		if (securitydescription == null) {
			if (other.securitydescription != null)
				return false;
		} else if (!securitydescription.equals(other.securitydescription))
			return false;
		if (sedol == null) {
			if (other.sedol != null)
				return false;
		} else if (!sedol.equals(other.sedol))
			return false;
		if (strikepricecuresma == null) {
			if (other.strikepricecuresma != null)
				return false;
		} else if (!strikepricecuresma.equals(other.strikepricecuresma))
			return false;
		if (strikepriceesma == null) {
			if (other.strikepriceesma != null)
				return false;
		} else if (!strikepriceesma.equals(other.strikepriceesma))
			return false;
		if (suscategoryesma == null) {
			if (other.suscategoryesma != null)
				return false;
		} else if (!suscategoryesma.equals(other.suscategoryesma))
			return false;
		if (susendedonesma == null) {
			if (other.susendedonesma != null)
				return false;
		} else if (!susendedonesma.equals(other.susendedonesma))
			return false;
		if (susongoingesma == null) {
			if (other.susongoingesma != null)
				return false;
		} else if (!susongoingesma.equals(other.susongoingesma))
			return false;
		if (susratesma == null) {
			if (other.susratesma != null)
				return false;
		} else if (!susratesma.equals(other.susratesma))
			return false;
		if (susstonesma == null) {
			if (other.susstonesma != null)
				return false;
		} else if (!susstonesma.equals(other.susstonesma))
			return false;
		if (ttlamissued == null) {
			if (other.ttlamissued != null)
				return false;
		} else if (!ttlamissued.equals(other.ttlamissued))
			return false;
		if (ttleutu12moesma == null) {
			if (other.ttleutu12moesma != null)
				return false;
		} else if (!ttleutu12moesma.equals(other.ttleutu12moesma))
			return false;
		if (ttleuvl12moesma == null) {
			if (other.ttleuvl12moesma != null)
				return false;
		} else if (!ttleuvl12moesma.equals(other.ttleuvl12moesma))
			return false;
		if (undeeaelig == null) {
			if (other.undeeaelig != null)
				return false;
		} else if (!undeeaelig.equals(other.undeeaelig))
			return false;
		if (undisin == null) {
			if (other.undisin != null)
				return false;
		} else if (!undisin.equals(other.undisin))
			return false;
		if (undisinesma == null) {
			if (other.undisinesma != null)
				return false;
		} else if (!undisinesma.equals(other.undisinesma))
			return false;
		return true;
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
		builder.append(quoteid);
		builder.append(", ric=");
		builder.append(ric);
		builder.append(", sedol=");
		builder.append(sedol);
		builder.append(", issuepermid=");
		builder.append(issuepermid);
		builder.append(", assetid=");
		builder.append(assetid);
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
