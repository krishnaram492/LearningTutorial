package com.app.dhsloader.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

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
	private String assetstatuscf;
	private String assetstatusp;
	private String basketundisinlist;
	private String basketundisinlistcf;
	private String basketundisinlistp;
	private String basketwrrindicator;
	private String basketwrrindicatorcf;
	private String basketwrrindicatorp;
	private String cficode;
	private String cficodecf;
	private String cficodep;
	private String cincode;
	private String cincodecf;
	private String cincodep;
	private String complegaldomicile;
	private String complegaldomicilecf;
	private String complegaldomicilep;
	private String compshortname;
	private String compshortnamecf;
	private String compshortnamep;
	private String dealstartdate;
	private String dealstartdatecf;
	private String dealstartdatep;
	private String eeavenueelflg;
	private String eeavenueelflgcf;
	private String eeavenueelflgp;
	private String fininsshname;
	private String fininsshnamecf;
	private String fininsshnamep;
	private String fininsshnameesma;
	private String fininsshnameesmacf;
	private String fininsshnameesmap;
	private String inesmafirds;
	private String inesmafirdscf;
	private String inesmafirdsp;
	private String insclassesma;
	private String insclassesmacf;
	private String insclassesmap;
	private String insfullnameesma;
	private String insfullnameesmacf;
	private String insfullnameesmap;
	private String isin;
	private String isincf;
	private String isinp;
	private String issuedate;
	private String issuedatecf;
	private String issuedatep;
	private String issuerlei;
	private String issuerleicf;
	private String issuerleip;
	private String issortrvenueleiesma;
	private String issortrvenueleiesmacf;
	private String issortrvenueleiesmap;
	private String mrkattsrcpermid;
	private String mrkattsrcpermidcf;
	private String mrkattsrcpermidp;
	private String marketmic;
	private String marketmiccf;
	private String marketmicp;
	private String maturitydate;
	private String maturitydatecf;
	private String maturitydatep;
	private String mifidasclofun;
	private String mifidasclofuncf;
	private String mifidasclofunp;
	private String mifidadnapinsesma;
	private String mifidadnapinsesmacf;
	private String mifidadnapinsesmap;
	private String mifidadnoftpinsesma;
	private String mifidadnoftpinsesmacf;
	private String mifidadnoftpinsesmap;
	private String mifidavdatuesma;
	private String mifidavdatuesmacf;
	private String mifidavdatuesmap;
	private String mifidavdatucurcode;
	private String mifidavdatucurcodecf;
	private String mifidavdatucurcodep;
	private String mifidavvaoftresma;
	private String mifidavvaoftresmacf;
	private String mifidavvaoftresmap;
	private String mifidavvaoftrcurcode;
	private String mifidavvaoftrcurcodecf;
	private String mifidavvaoftrcurcodep;
	private String mifidbaseprod;
	private String mifidbaseprodcf;
	private String mifidbaseprodp;
	private String mifidbaseprodesma;
	private String mifidbaseprodesmacf;
	private String mifidbaseprodesmap;
	private String mifidbondseni;
	private String mifidbondsenicf;
	private String mifidbondsenip;
	private String mifidbondtype;
	private String mifidbondtypecf;
	private String mifidbondtypep;
	private String mifidclobflag;
	private String mifidclobflagcf;
	private String mifidclobflagp;
	private String mifidcofialiinfornewbo;
	private String mifidcofialiinfornewbocf;
	private String mifidcofialiinfornewbop;
	private String mifidcodein;
	private String mifidcodeincf;
	private String mifidcodeinp;
	private String mifidcodeinesma;
	private String mifidcodeinesmacf;
	private String mifidcodeinesmap;
	private String mifidcoinflesma;
	private String mifidcoinflesmacf;
	private String mifidcoinflesmap;
	private String mifidcoinre;
	private String mifidcoinrecf;
	private String mifidcoinrep;
	private String mifidcotype;
	private String mifidcotypecf;
	private String mifidcotypep;
	private String mifiddeltypeesma;
	private String mifiddeltypeesmacf;
	private String mifiddeltypeesmap;
	private String mifidemalsubtype;
	private String mifidemalsubtypecf;
	private String mifidemalsubtypep;
	private String mifidexerstyle;
	private String mifidexerstylecf;
	private String mifidexerstylep;
	private String mifidexerstyleesma;
	private String mifidexerstyleesmacf;
	private String mifidexerstyleesmap;
	private String mifidexpdateesma;
	private String mifidexpdateesmacf;
	private String mifidexpdateesmap;
	private String mifidfiprtype;
	private String mifidfiprtypecf;
	private String mifidfiprtypep;
	private String mifidfiprtypeesma;
	private String mifidfiprtypeesmacf;
	private String mifidfiprtypeesmap;
	private String mifidfrtradedate;
	private String mifidfrtradedatecf;
	private String mifidfrtradedatep;
	private String mifidfrtradedateesma;
	private String mifidfrtradedateesmacf;
	private String mifidfrtradedateesmap;
	private String mifidflag;
	private String mifidflagcf;
	private String mifidflagp;
	private String mifidfrfloatesma;
	private String mifidfrfloatesmacf;
	private String mifidfrfloatesmap;
	private String mifidfrfloatcurcode;
	private String mifidfrfloatcurcodecf;
	private String mifidfrfloatcurcodep;
	private String mifidfusubpr;
	private String mifidfusubprcf;
	private String mifidfusubprp;
	private String mifidfusubpresma;
	private String mifidfusubpresmacf;
	private String mifidfusubpresmap;
	private String mifidissdateesma;
	private String mifidissdateesmacf;
	private String mifidissdateesmap;
	private String mifidisssizeesma;
	private String mifidisssizeesmacf;
	private String mifidisssizeesmap;
	private String mifidmatdate;
	private String mifidmatdatecf;
	private String mifidmatdatep;
	private String mifidmatdateesma;
	private String mifidmatdateesmacf;
	private String mifidmatdateesmap;
	private String mifidmostremaesma;
	private String mifidmostremaesmacf;
	private String mifidmostremaesmap;
	private String mifidoptype;
	private String mifidoptypecf;
	private String mifidoptypep;
	private String mifidoptypeesma;
	private String mifidoptypeesmacf;
	private String mifidoptypeesmap;
	private String mifidptuw12esma;
	private String mifidptuw12esmacf;
	private String mifidptuw12esmap;
	private String mifidptuwptv12mesma;
	private String mifidptuwptv12mesmacf;
	private String mifidptuwptv12mesmap;
	private String mifidpotrlisthfl;
	private String mifidpotrlisthflcf;
	private String mifidpotrlisthflp;
	private String mifidpotrlisthvl;
	private String mifidpotrlisthvlcf;
	private String mifidpotrlisthvlp;
	private String mifidpotrlistrper;
	private String mifidpotrlistrpercf;
	private String mifidpotrlistrperp;
	private String mifidpotrlisvoper;
	private String mifidpotrlisvopercf;
	private String mifidpotrlisvoperp;
	private String mifidpotrsstithfl;
	private String mifidpotrsstithflcf;
	private String mifidpotrsstithflp;
	private String mifidpotrsstithvl;
	private String mifidpotrsstithvlcf;
	private String mifidpotrsstithvlp;
	private String mifidpotrsstitrper;
	private String mifidpotrsstitrpercf;
	private String mifidpotrsstitrperp;
	private String mifidpotrsstivoper;
	private String mifidpotrsstivopercf;
	private String mifidpotrsstivoperp;
	private String mifidpretrlisthfl;
	private String mifidpretrlisthflcf;
	private String mifidpretrlisthflp;
	private String mifidpretrlisthvl;
	private String mifidpretrlisthvlcf;
	private String mifidpretrlisthvlp;
	private String mifidpretrlistrper;
	private String mifidpretrlistrpercf;
	private String mifidpretrlistrperp;
	private String mifidpretrsstithfl;
	private String mifidpretrsstithflcf;
	private String mifidpretrsstithflp;
	private String mifidpretrsstithvl;
	private String mifidpretrsstithvlcf;
	private String mifidpretrsstithvlp;
	private String mifidpretrsstitrper;
	private String mifidpretrsstitrpercf;
	private String mifidpretrsstitrperp;
	private String mifidregulatedesma;
	private String mifidregulatedesmacf;
	private String mifidregulatedesmap;
	private String mifidstmasizeesma;
	private String mifidstmasizeesmacf;
	private String mifidstmasizeesmap;
	private String mifidstmasizecurcode;
	private String mifidstmasizecurcodecf;
	private String mifidstmasizecurcodep;
	private String mifidsubprod;
	private String mifidsubprodcf;
	private String mifidsubprodp;
	private String mifidsubprodesma;
	private String mifidsubprodesmacf;
	private String mifidsubprodesmap;
	private String mifidtermdate;
	private String mifidtermdatecf;
	private String mifidtermdatep;
	private String mifidtermdateesma;
	private String mifidtermdateesmacf;
	private String mifidtermdateesmap;
	private String mifidtrobflag;
	private String mifidtrobflagcf;
	private String mifidtrobflagp;
	private String mifidtradapdate;
	private String mifidtradapdatecf;
	private String mifidtradapdatep;
	private String mifidtradapdateesma;
	private String mifidtradapdateesmacf;
	private String mifidtradapdateesmap;
	private String mifidtradreqdate;
	private String mifidtradreqdatecf;
	private String mifidtradreqdatep;
	private String mifidtradreqdateesma;
	private String mifidtradreqdateesmacf;
	private String mifidtradreqdateesmap;
	private String mifidtrtype;
	private String mifidtrtypecf;
	private String mifidtrtypep;
	private String mifidtrtypeesma;
	private String mifidtrtypeesmacf;
	private String mifidtrtypeesmap;
	private String mifidundindname;
	private String mifidundindnamecf;
	private String mifidundindnamep;
	private String mifidundindnameesma;
	private String mifidundindnameesmacf;
	private String mifidundindnameesmap;
	private String mifidundindtermesma;
	private String mifidundindtermesmacf;
	private String mifidundindtermesmap;
	private String mifidundtype;
	private String mifidundtypecf;
	private String mifidundtypep;
	private String mifiridentifier;
	private String mifiridentifiercf;
	private String mifiridentifierp;
	private String mindenomination;
	private String mindenominationcf;
	private String mindenominationp;
	private String ncaavdailyturnover;
	private String ncaavdailyturnovercf;
	private String ncaavdailyturnoverp;
	private String ncaavdailyturncurcode;
	private String ncaavdailyturncurcodecf;
	private String ncaavdailyturncurcodep;
	private String ncafreefl;
	private String ncafreeflcf;
	private String ncafreeflp;
	private String ncafreeflcurcode;
	private String ncafreeflcurcodecf;
	private String ncafreeflcurcodep;
	private String notionalcuresma;
	private String notionalcuresmacf;
	private String notionalcuresmap;
	private String optionroot;
	private String optionrootcf;
	private String optionrootp;
	private String placeholder;
	private String pricemultiplieresma;
	private String pricemultiplieresmacf;
	private String pricemultiplieresmap;
	private String prtrmaquote;
	private String prtrmaquotecf;
	private String prtrmaquotep;
	private String quotepermid;
	private String quotepermidcf;
	private String quotepermidp;
	private String reqfattbyissuer;
	private String reqfattbyissuercf;
	private String reqfattbyissuerp;
	private String reqfattbyissueresma;
	private String reqfattbyissueresmacf;
	private String reqfattbyissueresmap;
	private String securitydescription;
	private String securitydescriptioncf;
	private String securitydescriptionp;
	private String strikepriceesma;
	private String strikepriceesmacf;
	private String strikepriceesmap;
	private String strikepricecuresma;
	private String strikepricecuresmacf;
	private String strikepricecuresmap;
	private String suscategoryesma;
	private String suscategoryesmacf;
	private String suscategoryesmap;
	private String susendedonesma;
	private String susendedonesmacf;
	private String susendedonesmap;
	private String susongoingesma;
	private String susongoingesmacf;
	private String susongoingesmap;
	private String susratesma;
	private String susratesmacf;
	private String susratesmap;
	private String susstonesma;
	private String susstonesmacf;
	private String susstonesmap;
	private String ttlamissued;
	private String ttlamissuedcf;
	private String ttlamissuedp;
	private String ttleutu12moesma;
	private String ttleutu12moesmacf;
	private String ttleutu12moesmap;
	private String ttleuvl12moesma;
	private String ttleuvl12moesmacf;
	private String ttleuvl12moesmap;
	private String undeeaelig;
	private String undeeaeligcf;
	private String undeeaeligp;
	private String undisin;
	private String undisincf;
	private String undisinp;
	private String undisinesma;
	private String undisinesmacf;
	private String undisinesmap;

	public XrefXxDspId() {
	}

	@Column(name = "ACTION", length = 50)
	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Column(name = "LEVELCODE", length = 50)
	public String getLevelcode() {
		return this.levelcode;
	}

	public void setLevelcode(String levelcode) {
		this.levelcode = levelcode;
	}

	@Column(name = "IPC", length = 50)
	public String getIpc() {
		return this.ipc;
	}

	public void setIpc(String ipc) {
		this.ipc = ipc;
	}

	@Column(name = "QUOTEID", length = 50)
	public String getQuoteid() {
		return this.quoteid;
	}

	public void setQuoteid(String quoteid) {
		this.quoteid = quoteid;
	}

	@Column(name = "RIC", length = 50)
	public String getRic() {
		return this.ric;
	}

	public void setRic(String ric) {
		this.ric = ric;
	}

	@Column(name = "SEDOL", length = 50)
	public String getSedol() {
		return this.sedol;
	}

	public void setSedol(String sedol) {
		this.sedol = sedol;
	}

	@Column(name = "ISSUEPERMID", length = 50)
	public String getIssuepermid() {
		return this.issuepermid;
	}

	public void setIssuepermid(String issuepermid) {
		this.issuepermid = issuepermid;
	}

	@Column(name = "ASSETID", length = 50)
	public String getAssetid() {
		return this.assetid;
	}

	public void setAssetid(String assetid) {
		this.assetid = assetid;
	}

	@Column(name = "PILC", length = 50)
	public String getPilc() {
		return this.pilc;
	}

	public void setPilc(String pilc) {
		this.pilc = pilc;
	}

	@Column(name = "CUSIP", length = 50)
	public String getCusip() {
		return this.cusip;
	}

	public void setCusip(String cusip) {
		this.cusip = cusip;
	}

	@Column(name = "ORGPERMID", length = 50)
	public String getOrgpermid() {
		return this.orgpermid;
	}

	public void setOrgpermid(String orgpermid) {
		this.orgpermid = orgpermid;
	}

	@Column(name = "ASSETSTATUS", length = 50)
	public String getAssetstatus() {
		return this.assetstatus;
	}

	public void setAssetstatus(String assetstatus) {
		this.assetstatus = assetstatus;
	}

	@Column(name = "ASSETSTATUSCF", length = 50)
	public String getAssetstatuscf() {
		return this.assetstatuscf;
	}

	public void setAssetstatuscf(String assetstatuscf) {
		this.assetstatuscf = assetstatuscf;
	}

	@Column(name = "ASSETSTATUSP", length = 50)
	public String getAssetstatusp() {
		return this.assetstatusp;
	}

	public void setAssetstatusp(String assetstatusp) {
		this.assetstatusp = assetstatusp;
	}

	@Column(name = "BASKETUNDISINLIST", length = 50)
	public String getBasketundisinlist() {
		return this.basketundisinlist;
	}

	public void setBasketundisinlist(String basketundisinlist) {
		this.basketundisinlist = basketundisinlist;
	}

	@Column(name = "BASKETUNDISINLISTCF", length = 50)
	public String getBasketundisinlistcf() {
		return this.basketundisinlistcf;
	}

	public void setBasketundisinlistcf(String basketundisinlistcf) {
		this.basketundisinlistcf = basketundisinlistcf;
	}

	@Column(name = "BASKETUNDISINLISTP", length = 50)
	public String getBasketundisinlistp() {
		return this.basketundisinlistp;
	}

	public void setBasketundisinlistp(String basketundisinlistp) {
		this.basketundisinlistp = basketundisinlistp;
	}

	@Column(name = "BASKETWRRINDICATOR", length = 50)
	public String getBasketwrrindicator() {
		return this.basketwrrindicator;
	}

	public void setBasketwrrindicator(String basketwrrindicator) {
		this.basketwrrindicator = basketwrrindicator;
	}

	@Column(name = "BASKETWRRINDICATORCF", length = 50)
	public String getBasketwrrindicatorcf() {
		return this.basketwrrindicatorcf;
	}

	public void setBasketwrrindicatorcf(String basketwrrindicatorcf) {
		this.basketwrrindicatorcf = basketwrrindicatorcf;
	}

	@Column(name = "BASKETWRRINDICATORP", length = 50)
	public String getBasketwrrindicatorp() {
		return this.basketwrrindicatorp;
	}

	public void setBasketwrrindicatorp(String basketwrrindicatorp) {
		this.basketwrrindicatorp = basketwrrindicatorp;
	}

	@Column(name = "CFICODE", length = 50)
	public String getCficode() {
		return this.cficode;
	}

	public void setCficode(String cficode) {
		this.cficode = cficode;
	}

	@Column(name = "CFICODECF", length = 50)
	public String getCficodecf() {
		return this.cficodecf;
	}

	public void setCficodecf(String cficodecf) {
		this.cficodecf = cficodecf;
	}

	@Column(name = "CFICODEP", length = 50)
	public String getCficodep() {
		return this.cficodep;
	}

	public void setCficodep(String cficodep) {
		this.cficodep = cficodep;
	}

	@Column(name = "CINCODE", length = 50)
	public String getCincode() {
		return this.cincode;
	}

	public void setCincode(String cincode) {
		this.cincode = cincode;
	}

	@Column(name = "CINCODECF", length = 50)
	public String getCincodecf() {
		return this.cincodecf;
	}

	public void setCincodecf(String cincodecf) {
		this.cincodecf = cincodecf;
	}

	@Column(name = "CINCODEP", length = 50)
	public String getCincodep() {
		return this.cincodep;
	}

	public void setCincodep(String cincodep) {
		this.cincodep = cincodep;
	}

	@Column(name = "COMPLEGALDOMICILE", length = 50)
	public String getComplegaldomicile() {
		return this.complegaldomicile;
	}

	public void setComplegaldomicile(String complegaldomicile) {
		this.complegaldomicile = complegaldomicile;
	}

	@Column(name = "COMPLEGALDOMICILECF", length = 50)
	public String getComplegaldomicilecf() {
		return this.complegaldomicilecf;
	}

	public void setComplegaldomicilecf(String complegaldomicilecf) {
		this.complegaldomicilecf = complegaldomicilecf;
	}

	@Column(name = "COMPLEGALDOMICILEP", length = 50)
	public String getComplegaldomicilep() {
		return this.complegaldomicilep;
	}

	public void setComplegaldomicilep(String complegaldomicilep) {
		this.complegaldomicilep = complegaldomicilep;
	}

	@Column(name = "COMPSHORTNAME", length = 50)
	public String getCompshortname() {
		return this.compshortname;
	}

	public void setCompshortname(String compshortname) {
		this.compshortname = compshortname;
	}

	@Column(name = "COMPSHORTNAMECF", length = 50)
	public String getCompshortnamecf() {
		return this.compshortnamecf;
	}

	public void setCompshortnamecf(String compshortnamecf) {
		this.compshortnamecf = compshortnamecf;
	}

	@Column(name = "COMPSHORTNAMEP", length = 50)
	public String getCompshortnamep() {
		return this.compshortnamep;
	}

	public void setCompshortnamep(String compshortnamep) {
		this.compshortnamep = compshortnamep;
	}

	@Column(name = "DEALSTARTDATE", length = 50)
	public String getDealstartdate() {
		return this.dealstartdate;
	}

	public void setDealstartdate(String dealstartdate) {
		this.dealstartdate = dealstartdate;
	}

	@Column(name = "DEALSTARTDATECF", length = 50)
	public String getDealstartdatecf() {
		return this.dealstartdatecf;
	}

	public void setDealstartdatecf(String dealstartdatecf) {
		this.dealstartdatecf = dealstartdatecf;
	}

	@Column(name = "DEALSTARTDATEP", length = 50)
	public String getDealstartdatep() {
		return this.dealstartdatep;
	}

	public void setDealstartdatep(String dealstartdatep) {
		this.dealstartdatep = dealstartdatep;
	}

	@Column(name = "EEAVENUEELFLG", length = 50)
	public String getEeavenueelflg() {
		return this.eeavenueelflg;
	}

	public void setEeavenueelflg(String eeavenueelflg) {
		this.eeavenueelflg = eeavenueelflg;
	}

	@Column(name = "EEAVENUEELFLGCF", length = 50)
	public String getEeavenueelflgcf() {
		return this.eeavenueelflgcf;
	}

	public void setEeavenueelflgcf(String eeavenueelflgcf) {
		this.eeavenueelflgcf = eeavenueelflgcf;
	}

	@Column(name = "EEAVENUEELFLGP", length = 50)
	public String getEeavenueelflgp() {
		return this.eeavenueelflgp;
	}

	public void setEeavenueelflgp(String eeavenueelflgp) {
		this.eeavenueelflgp = eeavenueelflgp;
	}

	@Column(name = "FININSSHNAME", length = 50)
	public String getFininsshname() {
		return this.fininsshname;
	}

	public void setFininsshname(String fininsshname) {
		this.fininsshname = fininsshname;
	}

	@Column(name = "FININSSHNAMECF", length = 50)
	public String getFininsshnamecf() {
		return this.fininsshnamecf;
	}

	public void setFininsshnamecf(String fininsshnamecf) {
		this.fininsshnamecf = fininsshnamecf;
	}

	@Column(name = "FININSSHNAMEP", length = 50)
	public String getFininsshnamep() {
		return this.fininsshnamep;
	}

	public void setFininsshnamep(String fininsshnamep) {
		this.fininsshnamep = fininsshnamep;
	}

	@Column(name = "FININSSHNAMEESMA", length = 50)
	public String getFininsshnameesma() {
		return this.fininsshnameesma;
	}

	public void setFininsshnameesma(String fininsshnameesma) {
		this.fininsshnameesma = fininsshnameesma;
	}

	@Column(name = "FININSSHNAMEESMACF", length = 50)
	public String getFininsshnameesmacf() {
		return this.fininsshnameesmacf;
	}

	public void setFininsshnameesmacf(String fininsshnameesmacf) {
		this.fininsshnameesmacf = fininsshnameesmacf;
	}

	@Column(name = "FININSSHNAMEESMAP", length = 50)
	public String getFininsshnameesmap() {
		return this.fininsshnameesmap;
	}

	public void setFininsshnameesmap(String fininsshnameesmap) {
		this.fininsshnameesmap = fininsshnameesmap;
	}

	@Column(name = "INESMAFIRDS", length = 50)
	public String getInesmafirds() {
		return this.inesmafirds;
	}

	public void setInesmafirds(String inesmafirds) {
		this.inesmafirds = inesmafirds;
	}

	@Column(name = "INESMAFIRDSCF", length = 50)
	public String getInesmafirdscf() {
		return this.inesmafirdscf;
	}

	public void setInesmafirdscf(String inesmafirdscf) {
		this.inesmafirdscf = inesmafirdscf;
	}

	@Column(name = "INESMAFIRDSP", length = 50)
	public String getInesmafirdsp() {
		return this.inesmafirdsp;
	}

	public void setInesmafirdsp(String inesmafirdsp) {
		this.inesmafirdsp = inesmafirdsp;
	}

	@Column(name = "INSCLASSESMA", length = 50)
	public String getInsclassesma() {
		return this.insclassesma;
	}

	public void setInsclassesma(String insclassesma) {
		this.insclassesma = insclassesma;
	}

	@Column(name = "INSCLASSESMACF", length = 50)
	public String getInsclassesmacf() {
		return this.insclassesmacf;
	}

	public void setInsclassesmacf(String insclassesmacf) {
		this.insclassesmacf = insclassesmacf;
	}

	@Column(name = "INSCLASSESMAP", length = 50)
	public String getInsclassesmap() {
		return this.insclassesmap;
	}

	public void setInsclassesmap(String insclassesmap) {
		this.insclassesmap = insclassesmap;
	}

	@Column(name = "INSFULLNAMEESMA", length = 50)
	public String getInsfullnameesma() {
		return this.insfullnameesma;
	}

	public void setInsfullnameesma(String insfullnameesma) {
		this.insfullnameesma = insfullnameesma;
	}

	@Column(name = "INSFULLNAMEESMACF", length = 50)
	public String getInsfullnameesmacf() {
		return this.insfullnameesmacf;
	}

	public void setInsfullnameesmacf(String insfullnameesmacf) {
		this.insfullnameesmacf = insfullnameesmacf;
	}

	@Column(name = "INSFULLNAMEESMAP", length = 50)
	public String getInsfullnameesmap() {
		return this.insfullnameesmap;
	}

	public void setInsfullnameesmap(String insfullnameesmap) {
		this.insfullnameesmap = insfullnameesmap;
	}

	@Column(name = "ISIN", length = 50)
	public String getIsin() {
		return this.isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	@Column(name = "ISINCF", length = 50)
	public String getIsincf() {
		return this.isincf;
	}

	public void setIsincf(String isincf) {
		this.isincf = isincf;
	}

	@Column(name = "ISINP", length = 50)
	public String getIsinp() {
		return this.isinp;
	}

	public void setIsinp(String isinp) {
		this.isinp = isinp;
	}

	@Column(name = "ISSUEDATE", length = 50)
	public String getIssuedate() {
		return this.issuedate;
	}

	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}

	@Column(name = "ISSUEDATECF", length = 50)
	public String getIssuedatecf() {
		return this.issuedatecf;
	}

	public void setIssuedatecf(String issuedatecf) {
		this.issuedatecf = issuedatecf;
	}

	@Column(name = "ISSUEDATEP", length = 50)
	public String getIssuedatep() {
		return this.issuedatep;
	}

	public void setIssuedatep(String issuedatep) {
		this.issuedatep = issuedatep;
	}

	@Column(name = "ISSUERLEI", length = 50)
	public String getIssuerlei() {
		return this.issuerlei;
	}

	public void setIssuerlei(String issuerlei) {
		this.issuerlei = issuerlei;
	}

	@Column(name = "ISSUERLEICF", length = 50)
	public String getIssuerleicf() {
		return this.issuerleicf;
	}

	public void setIssuerleicf(String issuerleicf) {
		this.issuerleicf = issuerleicf;
	}

	@Column(name = "ISSUERLEIP", length = 50)
	public String getIssuerleip() {
		return this.issuerleip;
	}

	public void setIssuerleip(String issuerleip) {
		this.issuerleip = issuerleip;
	}

	@Column(name = "ISSORTRVENUELEIESMA", length = 50)
	public String getIssortrvenueleiesma() {
		return this.issortrvenueleiesma;
	}

	public void setIssortrvenueleiesma(String issortrvenueleiesma) {
		this.issortrvenueleiesma = issortrvenueleiesma;
	}

	@Column(name = "ISSORTRVENUELEIESMACF", length = 50)
	public String getIssortrvenueleiesmacf() {
		return this.issortrvenueleiesmacf;
	}

	public void setIssortrvenueleiesmacf(String issortrvenueleiesmacf) {
		this.issortrvenueleiesmacf = issortrvenueleiesmacf;
	}

	@Column(name = "ISSORTRVENUELEIESMAP", length = 50)
	public String getIssortrvenueleiesmap() {
		return this.issortrvenueleiesmap;
	}

	public void setIssortrvenueleiesmap(String issortrvenueleiesmap) {
		this.issortrvenueleiesmap = issortrvenueleiesmap;
	}

	@Column(name = "MRKATTSRCPERMID", length = 50)
	public String getMrkattsrcpermid() {
		return this.mrkattsrcpermid;
	}

	public void setMrkattsrcpermid(String mrkattsrcpermid) {
		this.mrkattsrcpermid = mrkattsrcpermid;
	}

	@Column(name = "MRKATTSRCPERMIDCF", length = 50)
	public String getMrkattsrcpermidcf() {
		return this.mrkattsrcpermidcf;
	}

	public void setMrkattsrcpermidcf(String mrkattsrcpermidcf) {
		this.mrkattsrcpermidcf = mrkattsrcpermidcf;
	}

	@Column(name = "MRKATTSRCPERMIDP", length = 50)
	public String getMrkattsrcpermidp() {
		return this.mrkattsrcpermidp;
	}

	public void setMrkattsrcpermidp(String mrkattsrcpermidp) {
		this.mrkattsrcpermidp = mrkattsrcpermidp;
	}

	@Column(name = "MARKETMIC", length = 50)
	public String getMarketmic() {
		return this.marketmic;
	}

	public void setMarketmic(String marketmic) {
		this.marketmic = marketmic;
	}

	@Column(name = "MARKETMICCF", length = 50)
	public String getMarketmiccf() {
		return this.marketmiccf;
	}

	public void setMarketmiccf(String marketmiccf) {
		this.marketmiccf = marketmiccf;
	}

	@Column(name = "MARKETMICP", length = 50)
	public String getMarketmicp() {
		return this.marketmicp;
	}

	public void setMarketmicp(String marketmicp) {
		this.marketmicp = marketmicp;
	}

	@Column(name = "MATURITYDATE", length = 50)
	public String getMaturitydate() {
		return this.maturitydate;
	}

	public void setMaturitydate(String maturitydate) {
		this.maturitydate = maturitydate;
	}

	@Column(name = "MATURITYDATECF", length = 50)
	public String getMaturitydatecf() {
		return this.maturitydatecf;
	}

	public void setMaturitydatecf(String maturitydatecf) {
		this.maturitydatecf = maturitydatecf;
	}

	@Column(name = "MATURITYDATEP", length = 50)
	public String getMaturitydatep() {
		return this.maturitydatep;
	}

	public void setMaturitydatep(String maturitydatep) {
		this.maturitydatep = maturitydatep;
	}

	@Column(name = "MIFIDASCLOFUN", length = 50)
	public String getMifidasclofun() {
		return this.mifidasclofun;
	}

	public void setMifidasclofun(String mifidasclofun) {
		this.mifidasclofun = mifidasclofun;
	}

	@Column(name = "MIFIDASCLOFUNCF", length = 50)
	public String getMifidasclofuncf() {
		return this.mifidasclofuncf;
	}

	public void setMifidasclofuncf(String mifidasclofuncf) {
		this.mifidasclofuncf = mifidasclofuncf;
	}

	@Column(name = "MIFIDASCLOFUNP", length = 50)
	public String getMifidasclofunp() {
		return this.mifidasclofunp;
	}

	public void setMifidasclofunp(String mifidasclofunp) {
		this.mifidasclofunp = mifidasclofunp;
	}

	@Column(name = "MIFIDADNAPINSESMA", length = 50)
	public String getMifidadnapinsesma() {
		return this.mifidadnapinsesma;
	}

	public void setMifidadnapinsesma(String mifidadnapinsesma) {
		this.mifidadnapinsesma = mifidadnapinsesma;
	}

	@Column(name = "MIFIDADNAPINSESMACF", length = 50)
	public String getMifidadnapinsesmacf() {
		return this.mifidadnapinsesmacf;
	}

	public void setMifidadnapinsesmacf(String mifidadnapinsesmacf) {
		this.mifidadnapinsesmacf = mifidadnapinsesmacf;
	}

	@Column(name = "MIFIDADNAPINSESMAP", length = 50)
	public String getMifidadnapinsesmap() {
		return this.mifidadnapinsesmap;
	}

	public void setMifidadnapinsesmap(String mifidadnapinsesmap) {
		this.mifidadnapinsesmap = mifidadnapinsesmap;
	}

	@Column(name = "MIFIDADNOFTPINSESMA", length = 50)
	public String getMifidadnoftpinsesma() {
		return this.mifidadnoftpinsesma;
	}

	public void setMifidadnoftpinsesma(String mifidadnoftpinsesma) {
		this.mifidadnoftpinsesma = mifidadnoftpinsesma;
	}

	@Column(name = "MIFIDADNOFTPINSESMACF", length = 50)
	public String getMifidadnoftpinsesmacf() {
		return this.mifidadnoftpinsesmacf;
	}

	public void setMifidadnoftpinsesmacf(String mifidadnoftpinsesmacf) {
		this.mifidadnoftpinsesmacf = mifidadnoftpinsesmacf;
	}

	@Column(name = "MIFIDADNOFTPINSESMAP", length = 50)
	public String getMifidadnoftpinsesmap() {
		return this.mifidadnoftpinsesmap;
	}

	public void setMifidadnoftpinsesmap(String mifidadnoftpinsesmap) {
		this.mifidadnoftpinsesmap = mifidadnoftpinsesmap;
	}

	@Column(name = "MIFIDAVDATUESMA", length = 50)
	public String getMifidavdatuesma() {
		return this.mifidavdatuesma;
	}

	public void setMifidavdatuesma(String mifidavdatuesma) {
		this.mifidavdatuesma = mifidavdatuesma;
	}

	@Column(name = "MIFIDAVDATUESMACF", length = 50)
	public String getMifidavdatuesmacf() {
		return this.mifidavdatuesmacf;
	}

	public void setMifidavdatuesmacf(String mifidavdatuesmacf) {
		this.mifidavdatuesmacf = mifidavdatuesmacf;
	}

	@Column(name = "MIFIDAVDATUESMAP", length = 50)
	public String getMifidavdatuesmap() {
		return this.mifidavdatuesmap;
	}

	public void setMifidavdatuesmap(String mifidavdatuesmap) {
		this.mifidavdatuesmap = mifidavdatuesmap;
	}

	@Column(name = "MIFIDAVDATUCURCODE", length = 50)
	public String getMifidavdatucurcode() {
		return this.mifidavdatucurcode;
	}

	public void setMifidavdatucurcode(String mifidavdatucurcode) {
		this.mifidavdatucurcode = mifidavdatucurcode;
	}

	@Column(name = "MIFIDAVDATUCURCODECF", length = 50)
	public String getMifidavdatucurcodecf() {
		return this.mifidavdatucurcodecf;
	}

	public void setMifidavdatucurcodecf(String mifidavdatucurcodecf) {
		this.mifidavdatucurcodecf = mifidavdatucurcodecf;
	}

	@Column(name = "MIFIDAVDATUCURCODEP", length = 50)
	public String getMifidavdatucurcodep() {
		return this.mifidavdatucurcodep;
	}

	public void setMifidavdatucurcodep(String mifidavdatucurcodep) {
		this.mifidavdatucurcodep = mifidavdatucurcodep;
	}

	@Column(name = "MIFIDAVVAOFTRESMA", length = 50)
	public String getMifidavvaoftresma() {
		return this.mifidavvaoftresma;
	}

	public void setMifidavvaoftresma(String mifidavvaoftresma) {
		this.mifidavvaoftresma = mifidavvaoftresma;
	}

	@Column(name = "MIFIDAVVAOFTRESMACF", length = 50)
	public String getMifidavvaoftresmacf() {
		return this.mifidavvaoftresmacf;
	}

	public void setMifidavvaoftresmacf(String mifidavvaoftresmacf) {
		this.mifidavvaoftresmacf = mifidavvaoftresmacf;
	}

	@Column(name = "MIFIDAVVAOFTRESMAP", length = 50)
	public String getMifidavvaoftresmap() {
		return this.mifidavvaoftresmap;
	}

	public void setMifidavvaoftresmap(String mifidavvaoftresmap) {
		this.mifidavvaoftresmap = mifidavvaoftresmap;
	}

	@Column(name = "MIFIDAVVAOFTRCURCODE", length = 50)
	public String getMifidavvaoftrcurcode() {
		return this.mifidavvaoftrcurcode;
	}

	public void setMifidavvaoftrcurcode(String mifidavvaoftrcurcode) {
		this.mifidavvaoftrcurcode = mifidavvaoftrcurcode;
	}

	@Column(name = "MIFIDAVVAOFTRCURCODECF", length = 50)
	public String getMifidavvaoftrcurcodecf() {
		return this.mifidavvaoftrcurcodecf;
	}

	public void setMifidavvaoftrcurcodecf(String mifidavvaoftrcurcodecf) {
		this.mifidavvaoftrcurcodecf = mifidavvaoftrcurcodecf;
	}

	@Column(name = "MIFIDAVVAOFTRCURCODEP", length = 50)
	public String getMifidavvaoftrcurcodep() {
		return this.mifidavvaoftrcurcodep;
	}

	public void setMifidavvaoftrcurcodep(String mifidavvaoftrcurcodep) {
		this.mifidavvaoftrcurcodep = mifidavvaoftrcurcodep;
	}

	@Column(name = "MIFIDBASEPROD", length = 50)
	public String getMifidbaseprod() {
		return this.mifidbaseprod;
	}

	public void setMifidbaseprod(String mifidbaseprod) {
		this.mifidbaseprod = mifidbaseprod;
	}

	@Column(name = "MIFIDBASEPRODCF", length = 50)
	public String getMifidbaseprodcf() {
		return this.mifidbaseprodcf;
	}

	public void setMifidbaseprodcf(String mifidbaseprodcf) {
		this.mifidbaseprodcf = mifidbaseprodcf;
	}

	@Column(name = "MIFIDBASEPRODP", length = 50)
	public String getMifidbaseprodp() {
		return this.mifidbaseprodp;
	}

	public void setMifidbaseprodp(String mifidbaseprodp) {
		this.mifidbaseprodp = mifidbaseprodp;
	}

	@Column(name = "MIFIDBASEPRODESMA", length = 50)
	public String getMifidbaseprodesma() {
		return this.mifidbaseprodesma;
	}

	public void setMifidbaseprodesma(String mifidbaseprodesma) {
		this.mifidbaseprodesma = mifidbaseprodesma;
	}

	@Column(name = "MIFIDBASEPRODESMACF", length = 50)
	public String getMifidbaseprodesmacf() {
		return this.mifidbaseprodesmacf;
	}

	public void setMifidbaseprodesmacf(String mifidbaseprodesmacf) {
		this.mifidbaseprodesmacf = mifidbaseprodesmacf;
	}

	@Column(name = "MIFIDBASEPRODESMAP", length = 50)
	public String getMifidbaseprodesmap() {
		return this.mifidbaseprodesmap;
	}

	public void setMifidbaseprodesmap(String mifidbaseprodesmap) {
		this.mifidbaseprodesmap = mifidbaseprodesmap;
	}

	@Column(name = "MIFIDBONDSENI", length = 50)
	public String getMifidbondseni() {
		return this.mifidbondseni;
	}

	public void setMifidbondseni(String mifidbondseni) {
		this.mifidbondseni = mifidbondseni;
	}

	@Column(name = "MIFIDBONDSENICF", length = 50)
	public String getMifidbondsenicf() {
		return this.mifidbondsenicf;
	}

	public void setMifidbondsenicf(String mifidbondsenicf) {
		this.mifidbondsenicf = mifidbondsenicf;
	}

	@Column(name = "MIFIDBONDSENIP", length = 50)
	public String getMifidbondsenip() {
		return this.mifidbondsenip;
	}

	public void setMifidbondsenip(String mifidbondsenip) {
		this.mifidbondsenip = mifidbondsenip;
	}

	@Column(name = "MIFIDBONDTYPE", length = 50)
	public String getMifidbondtype() {
		return this.mifidbondtype;
	}

	public void setMifidbondtype(String mifidbondtype) {
		this.mifidbondtype = mifidbondtype;
	}

	@Column(name = "MIFIDBONDTYPECF", length = 50)
	public String getMifidbondtypecf() {
		return this.mifidbondtypecf;
	}

	public void setMifidbondtypecf(String mifidbondtypecf) {
		this.mifidbondtypecf = mifidbondtypecf;
	}

	@Column(name = "MIFIDBONDTYPEP", length = 50)
	public String getMifidbondtypep() {
		return this.mifidbondtypep;
	}

	public void setMifidbondtypep(String mifidbondtypep) {
		this.mifidbondtypep = mifidbondtypep;
	}

	@Column(name = "MIFIDCLOBFLAG", length = 50)
	public String getMifidclobflag() {
		return this.mifidclobflag;
	}

	public void setMifidclobflag(String mifidclobflag) {
		this.mifidclobflag = mifidclobflag;
	}

	@Column(name = "MIFIDCLOBFLAGCF", length = 50)
	public String getMifidclobflagcf() {
		return this.mifidclobflagcf;
	}

	public void setMifidclobflagcf(String mifidclobflagcf) {
		this.mifidclobflagcf = mifidclobflagcf;
	}

	@Column(name = "MIFIDCLOBFLAGP", length = 50)
	public String getMifidclobflagp() {
		return this.mifidclobflagp;
	}

	public void setMifidclobflagp(String mifidclobflagp) {
		this.mifidclobflagp = mifidclobflagp;
	}

	@Column(name = "MIFIDCOFIALIINFORNEWBO", length = 50)
	public String getMifidcofialiinfornewbo() {
		return this.mifidcofialiinfornewbo;
	}

	public void setMifidcofialiinfornewbo(String mifidcofialiinfornewbo) {
		this.mifidcofialiinfornewbo = mifidcofialiinfornewbo;
	}

	@Column(name = "MIFIDCOFIALIINFORNEWBOCF", length = 50)
	public String getMifidcofialiinfornewbocf() {
		return this.mifidcofialiinfornewbocf;
	}

	public void setMifidcofialiinfornewbocf(String mifidcofialiinfornewbocf) {
		this.mifidcofialiinfornewbocf = mifidcofialiinfornewbocf;
	}

	@Column(name = "MIFIDCOFIALIINFORNEWBOP", length = 50)
	public String getMifidcofialiinfornewbop() {
		return this.mifidcofialiinfornewbop;
	}

	public void setMifidcofialiinfornewbop(String mifidcofialiinfornewbop) {
		this.mifidcofialiinfornewbop = mifidcofialiinfornewbop;
	}

	@Column(name = "MIFIDCODEIN", length = 50)
	public String getMifidcodein() {
		return this.mifidcodein;
	}

	public void setMifidcodein(String mifidcodein) {
		this.mifidcodein = mifidcodein;
	}

	@Column(name = "MIFIDCODEINCF", length = 50)
	public String getMifidcodeincf() {
		return this.mifidcodeincf;
	}

	public void setMifidcodeincf(String mifidcodeincf) {
		this.mifidcodeincf = mifidcodeincf;
	}

	@Column(name = "MIFIDCODEINP", length = 50)
	public String getMifidcodeinp() {
		return this.mifidcodeinp;
	}

	public void setMifidcodeinp(String mifidcodeinp) {
		this.mifidcodeinp = mifidcodeinp;
	}

	@Column(name = "MIFIDCODEINESMA", length = 50)
	public String getMifidcodeinesma() {
		return this.mifidcodeinesma;
	}

	public void setMifidcodeinesma(String mifidcodeinesma) {
		this.mifidcodeinesma = mifidcodeinesma;
	}

	@Column(name = "MIFIDCODEINESMACF", length = 50)
	public String getMifidcodeinesmacf() {
		return this.mifidcodeinesmacf;
	}

	public void setMifidcodeinesmacf(String mifidcodeinesmacf) {
		this.mifidcodeinesmacf = mifidcodeinesmacf;
	}

	@Column(name = "MIFIDCODEINESMAP", length = 50)
	public String getMifidcodeinesmap() {
		return this.mifidcodeinesmap;
	}

	public void setMifidcodeinesmap(String mifidcodeinesmap) {
		this.mifidcodeinesmap = mifidcodeinesmap;
	}

	@Column(name = "MIFIDCOINFLESMA", length = 50)
	public String getMifidcoinflesma() {
		return this.mifidcoinflesma;
	}

	public void setMifidcoinflesma(String mifidcoinflesma) {
		this.mifidcoinflesma = mifidcoinflesma;
	}

	@Column(name = "MIFIDCOINFLESMACF", length = 50)
	public String getMifidcoinflesmacf() {
		return this.mifidcoinflesmacf;
	}

	public void setMifidcoinflesmacf(String mifidcoinflesmacf) {
		this.mifidcoinflesmacf = mifidcoinflesmacf;
	}

	@Column(name = "MIFIDCOINFLESMAP", length = 50)
	public String getMifidcoinflesmap() {
		return this.mifidcoinflesmap;
	}

	public void setMifidcoinflesmap(String mifidcoinflesmap) {
		this.mifidcoinflesmap = mifidcoinflesmap;
	}

	@Column(name = "MIFIDCOINRE", length = 50)
	public String getMifidcoinre() {
		return this.mifidcoinre;
	}

	public void setMifidcoinre(String mifidcoinre) {
		this.mifidcoinre = mifidcoinre;
	}

	@Column(name = "MIFIDCOINRECF", length = 50)
	public String getMifidcoinrecf() {
		return this.mifidcoinrecf;
	}

	public void setMifidcoinrecf(String mifidcoinrecf) {
		this.mifidcoinrecf = mifidcoinrecf;
	}

	@Column(name = "MIFIDCOINREP", length = 50)
	public String getMifidcoinrep() {
		return this.mifidcoinrep;
	}

	public void setMifidcoinrep(String mifidcoinrep) {
		this.mifidcoinrep = mifidcoinrep;
	}

	@Column(name = "MIFIDCOTYPE", length = 50)
	public String getMifidcotype() {
		return this.mifidcotype;
	}

	public void setMifidcotype(String mifidcotype) {
		this.mifidcotype = mifidcotype;
	}

	@Column(name = "MIFIDCOTYPECF", length = 50)
	public String getMifidcotypecf() {
		return this.mifidcotypecf;
	}

	public void setMifidcotypecf(String mifidcotypecf) {
		this.mifidcotypecf = mifidcotypecf;
	}

	@Column(name = "MIFIDCOTYPEP", length = 50)
	public String getMifidcotypep() {
		return this.mifidcotypep;
	}

	public void setMifidcotypep(String mifidcotypep) {
		this.mifidcotypep = mifidcotypep;
	}

	@Column(name = "MIFIDDELTYPEESMA", length = 50)
	public String getMifiddeltypeesma() {
		return this.mifiddeltypeesma;
	}

	public void setMifiddeltypeesma(String mifiddeltypeesma) {
		this.mifiddeltypeesma = mifiddeltypeesma;
	}

	@Column(name = "MIFIDDELTYPEESMACF", length = 50)
	public String getMifiddeltypeesmacf() {
		return this.mifiddeltypeesmacf;
	}

	public void setMifiddeltypeesmacf(String mifiddeltypeesmacf) {
		this.mifiddeltypeesmacf = mifiddeltypeesmacf;
	}

	@Column(name = "MIFIDDELTYPEESMAP", length = 50)
	public String getMifiddeltypeesmap() {
		return this.mifiddeltypeesmap;
	}

	public void setMifiddeltypeesmap(String mifiddeltypeesmap) {
		this.mifiddeltypeesmap = mifiddeltypeesmap;
	}

	@Column(name = "MIFIDEMALSUBTYPE", length = 50)
	public String getMifidemalsubtype() {
		return this.mifidemalsubtype;
	}

	public void setMifidemalsubtype(String mifidemalsubtype) {
		this.mifidemalsubtype = mifidemalsubtype;
	}

	@Column(name = "MIFIDEMALSUBTYPECF", length = 50)
	public String getMifidemalsubtypecf() {
		return this.mifidemalsubtypecf;
	}

	public void setMifidemalsubtypecf(String mifidemalsubtypecf) {
		this.mifidemalsubtypecf = mifidemalsubtypecf;
	}

	@Column(name = "MIFIDEMALSUBTYPEP", length = 50)
	public String getMifidemalsubtypep() {
		return this.mifidemalsubtypep;
	}

	public void setMifidemalsubtypep(String mifidemalsubtypep) {
		this.mifidemalsubtypep = mifidemalsubtypep;
	}

	@Column(name = "MIFIDEXERSTYLE", length = 50)
	public String getMifidexerstyle() {
		return this.mifidexerstyle;
	}

	public void setMifidexerstyle(String mifidexerstyle) {
		this.mifidexerstyle = mifidexerstyle;
	}

	@Column(name = "MIFIDEXERSTYLECF", length = 50)
	public String getMifidexerstylecf() {
		return this.mifidexerstylecf;
	}

	public void setMifidexerstylecf(String mifidexerstylecf) {
		this.mifidexerstylecf = mifidexerstylecf;
	}

	@Column(name = "MIFIDEXERSTYLEP", length = 50)
	public String getMifidexerstylep() {
		return this.mifidexerstylep;
	}

	public void setMifidexerstylep(String mifidexerstylep) {
		this.mifidexerstylep = mifidexerstylep;
	}

	@Column(name = "MIFIDEXERSTYLEESMA", length = 50)
	public String getMifidexerstyleesma() {
		return this.mifidexerstyleesma;
	}

	public void setMifidexerstyleesma(String mifidexerstyleesma) {
		this.mifidexerstyleesma = mifidexerstyleesma;
	}

	@Column(name = "MIFIDEXERSTYLEESMACF", length = 50)
	public String getMifidexerstyleesmacf() {
		return this.mifidexerstyleesmacf;
	}

	public void setMifidexerstyleesmacf(String mifidexerstyleesmacf) {
		this.mifidexerstyleesmacf = mifidexerstyleesmacf;
	}

	@Column(name = "MIFIDEXERSTYLEESMAP", length = 50)
	public String getMifidexerstyleesmap() {
		return this.mifidexerstyleesmap;
	}

	public void setMifidexerstyleesmap(String mifidexerstyleesmap) {
		this.mifidexerstyleesmap = mifidexerstyleesmap;
	}

	@Column(name = "MIFIDEXPDATEESMA", length = 50)
	public String getMifidexpdateesma() {
		return this.mifidexpdateesma;
	}

	public void setMifidexpdateesma(String mifidexpdateesma) {
		this.mifidexpdateesma = mifidexpdateesma;
	}

	@Column(name = "MIFIDEXPDATEESMACF", length = 50)
	public String getMifidexpdateesmacf() {
		return this.mifidexpdateesmacf;
	}

	public void setMifidexpdateesmacf(String mifidexpdateesmacf) {
		this.mifidexpdateesmacf = mifidexpdateesmacf;
	}

	@Column(name = "MIFIDEXPDATEESMAP", length = 50)
	public String getMifidexpdateesmap() {
		return this.mifidexpdateesmap;
	}

	public void setMifidexpdateesmap(String mifidexpdateesmap) {
		this.mifidexpdateesmap = mifidexpdateesmap;
	}

	@Column(name = "MIFIDFIPRTYPE", length = 50)
	public String getMifidfiprtype() {
		return this.mifidfiprtype;
	}

	public void setMifidfiprtype(String mifidfiprtype) {
		this.mifidfiprtype = mifidfiprtype;
	}

	@Column(name = "MIFIDFIPRTYPECF", length = 50)
	public String getMifidfiprtypecf() {
		return this.mifidfiprtypecf;
	}

	public void setMifidfiprtypecf(String mifidfiprtypecf) {
		this.mifidfiprtypecf = mifidfiprtypecf;
	}

	@Column(name = "MIFIDFIPRTYPEP", length = 50)
	public String getMifidfiprtypep() {
		return this.mifidfiprtypep;
	}

	public void setMifidfiprtypep(String mifidfiprtypep) {
		this.mifidfiprtypep = mifidfiprtypep;
	}

	@Column(name = "MIFIDFIPRTYPEESMA", length = 50)
	public String getMifidfiprtypeesma() {
		return this.mifidfiprtypeesma;
	}

	public void setMifidfiprtypeesma(String mifidfiprtypeesma) {
		this.mifidfiprtypeesma = mifidfiprtypeesma;
	}

	@Column(name = "MIFIDFIPRTYPEESMACF", length = 50)
	public String getMifidfiprtypeesmacf() {
		return this.mifidfiprtypeesmacf;
	}

	public void setMifidfiprtypeesmacf(String mifidfiprtypeesmacf) {
		this.mifidfiprtypeesmacf = mifidfiprtypeesmacf;
	}

	@Column(name = "MIFIDFIPRTYPEESMAP", length = 50)
	public String getMifidfiprtypeesmap() {
		return this.mifidfiprtypeesmap;
	}

	public void setMifidfiprtypeesmap(String mifidfiprtypeesmap) {
		this.mifidfiprtypeesmap = mifidfiprtypeesmap;
	}

	@Column(name = "MIFIDFRTRADEDATE", length = 50)
	public String getMifidfrtradedate() {
		return this.mifidfrtradedate;
	}

	public void setMifidfrtradedate(String mifidfrtradedate) {
		this.mifidfrtradedate = mifidfrtradedate;
	}

	@Column(name = "MIFIDFRTRADEDATECF", length = 50)
	public String getMifidfrtradedatecf() {
		return this.mifidfrtradedatecf;
	}

	public void setMifidfrtradedatecf(String mifidfrtradedatecf) {
		this.mifidfrtradedatecf = mifidfrtradedatecf;
	}

	@Column(name = "MIFIDFRTRADEDATEP", length = 50)
	public String getMifidfrtradedatep() {
		return this.mifidfrtradedatep;
	}

	public void setMifidfrtradedatep(String mifidfrtradedatep) {
		this.mifidfrtradedatep = mifidfrtradedatep;
	}

	@Column(name = "MIFIDFRTRADEDATEESMA", length = 50)
	public String getMifidfrtradedateesma() {
		return this.mifidfrtradedateesma;
	}

	public void setMifidfrtradedateesma(String mifidfrtradedateesma) {
		this.mifidfrtradedateesma = mifidfrtradedateesma;
	}

	@Column(name = "MIFIDFRTRADEDATEESMACF", length = 50)
	public String getMifidfrtradedateesmacf() {
		return this.mifidfrtradedateesmacf;
	}

	public void setMifidfrtradedateesmacf(String mifidfrtradedateesmacf) {
		this.mifidfrtradedateesmacf = mifidfrtradedateesmacf;
	}

	@Column(name = "MIFIDFRTRADEDATEESMAP", length = 50)
	public String getMifidfrtradedateesmap() {
		return this.mifidfrtradedateesmap;
	}

	public void setMifidfrtradedateesmap(String mifidfrtradedateesmap) {
		this.mifidfrtradedateesmap = mifidfrtradedateesmap;
	}

	@Column(name = "MIFIDFLAG", length = 50)
	public String getMifidflag() {
		return this.mifidflag;
	}

	public void setMifidflag(String mifidflag) {
		this.mifidflag = mifidflag;
	}

	@Column(name = "MIFIDFLAGCF", length = 50)
	public String getMifidflagcf() {
		return this.mifidflagcf;
	}

	public void setMifidflagcf(String mifidflagcf) {
		this.mifidflagcf = mifidflagcf;
	}

	@Column(name = "MIFIDFLAGP", length = 50)
	public String getMifidflagp() {
		return this.mifidflagp;
	}

	public void setMifidflagp(String mifidflagp) {
		this.mifidflagp = mifidflagp;
	}

	@Column(name = "MIFIDFRFLOATESMA", length = 50)
	public String getMifidfrfloatesma() {
		return this.mifidfrfloatesma;
	}

	public void setMifidfrfloatesma(String mifidfrfloatesma) {
		this.mifidfrfloatesma = mifidfrfloatesma;
	}

	@Column(name = "MIFIDFRFLOATESMACF", length = 50)
	public String getMifidfrfloatesmacf() {
		return this.mifidfrfloatesmacf;
	}

	public void setMifidfrfloatesmacf(String mifidfrfloatesmacf) {
		this.mifidfrfloatesmacf = mifidfrfloatesmacf;
	}

	@Column(name = "MIFIDFRFLOATESMAP", length = 50)
	public String getMifidfrfloatesmap() {
		return this.mifidfrfloatesmap;
	}

	public void setMifidfrfloatesmap(String mifidfrfloatesmap) {
		this.mifidfrfloatesmap = mifidfrfloatesmap;
	}

	@Column(name = "MIFIDFRFLOATCURCODE", length = 50)
	public String getMifidfrfloatcurcode() {
		return this.mifidfrfloatcurcode;
	}

	public void setMifidfrfloatcurcode(String mifidfrfloatcurcode) {
		this.mifidfrfloatcurcode = mifidfrfloatcurcode;
	}

	@Column(name = "MIFIDFRFLOATCURCODECF", length = 50)
	public String getMifidfrfloatcurcodecf() {
		return this.mifidfrfloatcurcodecf;
	}

	public void setMifidfrfloatcurcodecf(String mifidfrfloatcurcodecf) {
		this.mifidfrfloatcurcodecf = mifidfrfloatcurcodecf;
	}

	@Column(name = "MIFIDFRFLOATCURCODEP", length = 50)
	public String getMifidfrfloatcurcodep() {
		return this.mifidfrfloatcurcodep;
	}

	public void setMifidfrfloatcurcodep(String mifidfrfloatcurcodep) {
		this.mifidfrfloatcurcodep = mifidfrfloatcurcodep;
	}

	@Column(name = "MIFIDFUSUBPR", length = 50)
	public String getMifidfusubpr() {
		return this.mifidfusubpr;
	}

	public void setMifidfusubpr(String mifidfusubpr) {
		this.mifidfusubpr = mifidfusubpr;
	}

	@Column(name = "MIFIDFUSUBPRCF", length = 50)
	public String getMifidfusubprcf() {
		return this.mifidfusubprcf;
	}

	public void setMifidfusubprcf(String mifidfusubprcf) {
		this.mifidfusubprcf = mifidfusubprcf;
	}

	@Column(name = "MIFIDFUSUBPRP", length = 50)
	public String getMifidfusubprp() {
		return this.mifidfusubprp;
	}

	public void setMifidfusubprp(String mifidfusubprp) {
		this.mifidfusubprp = mifidfusubprp;
	}

	@Column(name = "MIFIDFUSUBPRESMA", length = 50)
	public String getMifidfusubpresma() {
		return this.mifidfusubpresma;
	}

	public void setMifidfusubpresma(String mifidfusubpresma) {
		this.mifidfusubpresma = mifidfusubpresma;
	}

	@Column(name = "MIFIDFUSUBPRESMACF", length = 50)
	public String getMifidfusubpresmacf() {
		return this.mifidfusubpresmacf;
	}

	public void setMifidfusubpresmacf(String mifidfusubpresmacf) {
		this.mifidfusubpresmacf = mifidfusubpresmacf;
	}

	@Column(name = "MIFIDFUSUBPRESMAP", length = 50)
	public String getMifidfusubpresmap() {
		return this.mifidfusubpresmap;
	}

	public void setMifidfusubpresmap(String mifidfusubpresmap) {
		this.mifidfusubpresmap = mifidfusubpresmap;
	}

	@Column(name = "MIFIDISSDATEESMA", length = 50)
	public String getMifidissdateesma() {
		return this.mifidissdateesma;
	}

	public void setMifidissdateesma(String mifidissdateesma) {
		this.mifidissdateesma = mifidissdateesma;
	}

	@Column(name = "MIFIDISSDATEESMACF", length = 50)
	public String getMifidissdateesmacf() {
		return this.mifidissdateesmacf;
	}

	public void setMifidissdateesmacf(String mifidissdateesmacf) {
		this.mifidissdateesmacf = mifidissdateesmacf;
	}

	@Column(name = "MIFIDISSDATEESMAP", length = 50)
	public String getMifidissdateesmap() {
		return this.mifidissdateesmap;
	}

	public void setMifidissdateesmap(String mifidissdateesmap) {
		this.mifidissdateesmap = mifidissdateesmap;
	}

	@Column(name = "MIFIDISSSIZEESMA", length = 50)
	public String getMifidisssizeesma() {
		return this.mifidisssizeesma;
	}

	public void setMifidisssizeesma(String mifidisssizeesma) {
		this.mifidisssizeesma = mifidisssizeesma;
	}

	@Column(name = "MIFIDISSSIZEESMACF", length = 50)
	public String getMifidisssizeesmacf() {
		return this.mifidisssizeesmacf;
	}

	public void setMifidisssizeesmacf(String mifidisssizeesmacf) {
		this.mifidisssizeesmacf = mifidisssizeesmacf;
	}

	@Column(name = "MIFIDISSSIZEESMAP", length = 50)
	public String getMifidisssizeesmap() {
		return this.mifidisssizeesmap;
	}

	public void setMifidisssizeesmap(String mifidisssizeesmap) {
		this.mifidisssizeesmap = mifidisssizeesmap;
	}

	@Column(name = "MIFIDMATDATE", length = 50)
	public String getMifidmatdate() {
		return this.mifidmatdate;
	}

	public void setMifidmatdate(String mifidmatdate) {
		this.mifidmatdate = mifidmatdate;
	}

	@Column(name = "MIFIDMATDATECF", length = 50)
	public String getMifidmatdatecf() {
		return this.mifidmatdatecf;
	}

	public void setMifidmatdatecf(String mifidmatdatecf) {
		this.mifidmatdatecf = mifidmatdatecf;
	}

	@Column(name = "MIFIDMATDATEP", length = 50)
	public String getMifidmatdatep() {
		return this.mifidmatdatep;
	}

	public void setMifidmatdatep(String mifidmatdatep) {
		this.mifidmatdatep = mifidmatdatep;
	}

	@Column(name = "MIFIDMATDATEESMA", length = 50)
	public String getMifidmatdateesma() {
		return this.mifidmatdateesma;
	}

	public void setMifidmatdateesma(String mifidmatdateesma) {
		this.mifidmatdateesma = mifidmatdateesma;
	}

	@Column(name = "MIFIDMATDATEESMACF", length = 50)
	public String getMifidmatdateesmacf() {
		return this.mifidmatdateesmacf;
	}

	public void setMifidmatdateesmacf(String mifidmatdateesmacf) {
		this.mifidmatdateesmacf = mifidmatdateesmacf;
	}

	@Column(name = "MIFIDMATDATEESMAP", length = 50)
	public String getMifidmatdateesmap() {
		return this.mifidmatdateesmap;
	}

	public void setMifidmatdateesmap(String mifidmatdateesmap) {
		this.mifidmatdateesmap = mifidmatdateesmap;
	}

	@Column(name = "MIFIDMOSTREMAESMA", length = 50)
	public String getMifidmostremaesma() {
		return this.mifidmostremaesma;
	}

	public void setMifidmostremaesma(String mifidmostremaesma) {
		this.mifidmostremaesma = mifidmostremaesma;
	}

	@Column(name = "MIFIDMOSTREMAESMACF", length = 50)
	public String getMifidmostremaesmacf() {
		return this.mifidmostremaesmacf;
	}

	public void setMifidmostremaesmacf(String mifidmostremaesmacf) {
		this.mifidmostremaesmacf = mifidmostremaesmacf;
	}

	@Column(name = "MIFIDMOSTREMAESMAP", length = 50)
	public String getMifidmostremaesmap() {
		return this.mifidmostremaesmap;
	}

	public void setMifidmostremaesmap(String mifidmostremaesmap) {
		this.mifidmostremaesmap = mifidmostremaesmap;
	}

	@Column(name = "MIFIDOPTYPE", length = 50)
	public String getMifidoptype() {
		return this.mifidoptype;
	}

	public void setMifidoptype(String mifidoptype) {
		this.mifidoptype = mifidoptype;
	}

	@Column(name = "MIFIDOPTYPECF", length = 50)
	public String getMifidoptypecf() {
		return this.mifidoptypecf;
	}

	public void setMifidoptypecf(String mifidoptypecf) {
		this.mifidoptypecf = mifidoptypecf;
	}

	@Column(name = "MIFIDOPTYPEP", length = 50)
	public String getMifidoptypep() {
		return this.mifidoptypep;
	}

	public void setMifidoptypep(String mifidoptypep) {
		this.mifidoptypep = mifidoptypep;
	}

	@Column(name = "MIFIDOPTYPEESMA", length = 50)
	public String getMifidoptypeesma() {
		return this.mifidoptypeesma;
	}

	public void setMifidoptypeesma(String mifidoptypeesma) {
		this.mifidoptypeesma = mifidoptypeesma;
	}

	@Column(name = "MIFIDOPTYPEESMACF", length = 50)
	public String getMifidoptypeesmacf() {
		return this.mifidoptypeesmacf;
	}

	public void setMifidoptypeesmacf(String mifidoptypeesmacf) {
		this.mifidoptypeesmacf = mifidoptypeesmacf;
	}

	@Column(name = "MIFIDOPTYPEESMAP", length = 50)
	public String getMifidoptypeesmap() {
		return this.mifidoptypeesmap;
	}

	public void setMifidoptypeesmap(String mifidoptypeesmap) {
		this.mifidoptypeesmap = mifidoptypeesmap;
	}

	@Column(name = "MIFIDPTUW12ESMA", length = 50)
	public String getMifidptuw12esma() {
		return this.mifidptuw12esma;
	}

	public void setMifidptuw12esma(String mifidptuw12esma) {
		this.mifidptuw12esma = mifidptuw12esma;
	}

	@Column(name = "MIFIDPTUW12ESMACF", length = 50)
	public String getMifidptuw12esmacf() {
		return this.mifidptuw12esmacf;
	}

	public void setMifidptuw12esmacf(String mifidptuw12esmacf) {
		this.mifidptuw12esmacf = mifidptuw12esmacf;
	}

	@Column(name = "MIFIDPTUW12ESMAP", length = 50)
	public String getMifidptuw12esmap() {
		return this.mifidptuw12esmap;
	}

	public void setMifidptuw12esmap(String mifidptuw12esmap) {
		this.mifidptuw12esmap = mifidptuw12esmap;
	}

	@Column(name = "MIFIDPTUWPTV12MESMA", length = 50)
	public String getMifidptuwptv12mesma() {
		return this.mifidptuwptv12mesma;
	}

	public void setMifidptuwptv12mesma(String mifidptuwptv12mesma) {
		this.mifidptuwptv12mesma = mifidptuwptv12mesma;
	}

	@Column(name = "MIFIDPTUWPTV12MESMACF", length = 50)
	public String getMifidptuwptv12mesmacf() {
		return this.mifidptuwptv12mesmacf;
	}

	public void setMifidptuwptv12mesmacf(String mifidptuwptv12mesmacf) {
		this.mifidptuwptv12mesmacf = mifidptuwptv12mesmacf;
	}

	@Column(name = "MIFIDPTUWPTV12MESMAP", length = 50)
	public String getMifidptuwptv12mesmap() {
		return this.mifidptuwptv12mesmap;
	}

	public void setMifidptuwptv12mesmap(String mifidptuwptv12mesmap) {
		this.mifidptuwptv12mesmap = mifidptuwptv12mesmap;
	}

	@Column(name = "MIFIDPOTRLISTHFL", length = 50)
	public String getMifidpotrlisthfl() {
		return this.mifidpotrlisthfl;
	}

	public void setMifidpotrlisthfl(String mifidpotrlisthfl) {
		this.mifidpotrlisthfl = mifidpotrlisthfl;
	}

	@Column(name = "MIFIDPOTRLISTHFLCF", length = 50)
	public String getMifidpotrlisthflcf() {
		return this.mifidpotrlisthflcf;
	}

	public void setMifidpotrlisthflcf(String mifidpotrlisthflcf) {
		this.mifidpotrlisthflcf = mifidpotrlisthflcf;
	}

	@Column(name = "MIFIDPOTRLISTHFLP", length = 50)
	public String getMifidpotrlisthflp() {
		return this.mifidpotrlisthflp;
	}

	public void setMifidpotrlisthflp(String mifidpotrlisthflp) {
		this.mifidpotrlisthflp = mifidpotrlisthflp;
	}

	@Column(name = "MIFIDPOTRLISTHVL", length = 50)
	public String getMifidpotrlisthvl() {
		return this.mifidpotrlisthvl;
	}

	public void setMifidpotrlisthvl(String mifidpotrlisthvl) {
		this.mifidpotrlisthvl = mifidpotrlisthvl;
	}

	@Column(name = "MIFIDPOTRLISTHVLCF", length = 50)
	public String getMifidpotrlisthvlcf() {
		return this.mifidpotrlisthvlcf;
	}

	public void setMifidpotrlisthvlcf(String mifidpotrlisthvlcf) {
		this.mifidpotrlisthvlcf = mifidpotrlisthvlcf;
	}

	@Column(name = "MIFIDPOTRLISTHVLP", length = 50)
	public String getMifidpotrlisthvlp() {
		return this.mifidpotrlisthvlp;
	}

	public void setMifidpotrlisthvlp(String mifidpotrlisthvlp) {
		this.mifidpotrlisthvlp = mifidpotrlisthvlp;
	}

	@Column(name = "MIFIDPOTRLISTRPER", length = 50)
	public String getMifidpotrlistrper() {
		return this.mifidpotrlistrper;
	}

	public void setMifidpotrlistrper(String mifidpotrlistrper) {
		this.mifidpotrlistrper = mifidpotrlistrper;
	}

	@Column(name = "MIFIDPOTRLISTRPERCF", length = 50)
	public String getMifidpotrlistrpercf() {
		return this.mifidpotrlistrpercf;
	}

	public void setMifidpotrlistrpercf(String mifidpotrlistrpercf) {
		this.mifidpotrlistrpercf = mifidpotrlistrpercf;
	}

	@Column(name = "MIFIDPOTRLISTRPERP", length = 50)
	public String getMifidpotrlistrperp() {
		return this.mifidpotrlistrperp;
	}

	public void setMifidpotrlistrperp(String mifidpotrlistrperp) {
		this.mifidpotrlistrperp = mifidpotrlistrperp;
	}

	@Column(name = "MIFIDPOTRLISVOPER", length = 50)
	public String getMifidpotrlisvoper() {
		return this.mifidpotrlisvoper;
	}

	public void setMifidpotrlisvoper(String mifidpotrlisvoper) {
		this.mifidpotrlisvoper = mifidpotrlisvoper;
	}

	@Column(name = "MIFIDPOTRLISVOPERCF", length = 50)
	public String getMifidpotrlisvopercf() {
		return this.mifidpotrlisvopercf;
	}

	public void setMifidpotrlisvopercf(String mifidpotrlisvopercf) {
		this.mifidpotrlisvopercf = mifidpotrlisvopercf;
	}

	@Column(name = "MIFIDPOTRLISVOPERP", length = 50)
	public String getMifidpotrlisvoperp() {
		return this.mifidpotrlisvoperp;
	}

	public void setMifidpotrlisvoperp(String mifidpotrlisvoperp) {
		this.mifidpotrlisvoperp = mifidpotrlisvoperp;
	}

	@Column(name = "MIFIDPOTRSSTITHFL", length = 50)
	public String getMifidpotrsstithfl() {
		return this.mifidpotrsstithfl;
	}

	public void setMifidpotrsstithfl(String mifidpotrsstithfl) {
		this.mifidpotrsstithfl = mifidpotrsstithfl;
	}

	@Column(name = "MIFIDPOTRSSTITHFLCF", length = 50)
	public String getMifidpotrsstithflcf() {
		return this.mifidpotrsstithflcf;
	}

	public void setMifidpotrsstithflcf(String mifidpotrsstithflcf) {
		this.mifidpotrsstithflcf = mifidpotrsstithflcf;
	}

	@Column(name = "MIFIDPOTRSSTITHFLP", length = 50)
	public String getMifidpotrsstithflp() {
		return this.mifidpotrsstithflp;
	}

	public void setMifidpotrsstithflp(String mifidpotrsstithflp) {
		this.mifidpotrsstithflp = mifidpotrsstithflp;
	}

	@Column(name = "MIFIDPOTRSSTITHVL", length = 50)
	public String getMifidpotrsstithvl() {
		return this.mifidpotrsstithvl;
	}

	public void setMifidpotrsstithvl(String mifidpotrsstithvl) {
		this.mifidpotrsstithvl = mifidpotrsstithvl;
	}

	@Column(name = "MIFIDPOTRSSTITHVLCF", length = 50)
	public String getMifidpotrsstithvlcf() {
		return this.mifidpotrsstithvlcf;
	}

	public void setMifidpotrsstithvlcf(String mifidpotrsstithvlcf) {
		this.mifidpotrsstithvlcf = mifidpotrsstithvlcf;
	}

	@Column(name = "MIFIDPOTRSSTITHVLP", length = 50)
	public String getMifidpotrsstithvlp() {
		return this.mifidpotrsstithvlp;
	}

	public void setMifidpotrsstithvlp(String mifidpotrsstithvlp) {
		this.mifidpotrsstithvlp = mifidpotrsstithvlp;
	}

	@Column(name = "MIFIDPOTRSSTITRPER", length = 50)
	public String getMifidpotrsstitrper() {
		return this.mifidpotrsstitrper;
	}

	public void setMifidpotrsstitrper(String mifidpotrsstitrper) {
		this.mifidpotrsstitrper = mifidpotrsstitrper;
	}

	@Column(name = "MIFIDPOTRSSTITRPERCF", length = 50)
	public String getMifidpotrsstitrpercf() {
		return this.mifidpotrsstitrpercf;
	}

	public void setMifidpotrsstitrpercf(String mifidpotrsstitrpercf) {
		this.mifidpotrsstitrpercf = mifidpotrsstitrpercf;
	}

	@Column(name = "MIFIDPOTRSSTITRPERP", length = 50)
	public String getMifidpotrsstitrperp() {
		return this.mifidpotrsstitrperp;
	}

	public void setMifidpotrsstitrperp(String mifidpotrsstitrperp) {
		this.mifidpotrsstitrperp = mifidpotrsstitrperp;
	}

	@Column(name = "MIFIDPOTRSSTIVOPER", length = 50)
	public String getMifidpotrsstivoper() {
		return this.mifidpotrsstivoper;
	}

	public void setMifidpotrsstivoper(String mifidpotrsstivoper) {
		this.mifidpotrsstivoper = mifidpotrsstivoper;
	}

	@Column(name = "MIFIDPOTRSSTIVOPERCF", length = 50)
	public String getMifidpotrsstivopercf() {
		return this.mifidpotrsstivopercf;
	}

	public void setMifidpotrsstivopercf(String mifidpotrsstivopercf) {
		this.mifidpotrsstivopercf = mifidpotrsstivopercf;
	}

	@Column(name = "MIFIDPOTRSSTIVOPERP", length = 50)
	public String getMifidpotrsstivoperp() {
		return this.mifidpotrsstivoperp;
	}

	public void setMifidpotrsstivoperp(String mifidpotrsstivoperp) {
		this.mifidpotrsstivoperp = mifidpotrsstivoperp;
	}

	@Column(name = "MIFIDPRETRLISTHFL", length = 50)
	public String getMifidpretrlisthfl() {
		return this.mifidpretrlisthfl;
	}

	public void setMifidpretrlisthfl(String mifidpretrlisthfl) {
		this.mifidpretrlisthfl = mifidpretrlisthfl;
	}

	@Column(name = "MIFIDPRETRLISTHFLCF", length = 50)
	public String getMifidpretrlisthflcf() {
		return this.mifidpretrlisthflcf;
	}

	public void setMifidpretrlisthflcf(String mifidpretrlisthflcf) {
		this.mifidpretrlisthflcf = mifidpretrlisthflcf;
	}

	@Column(name = "MIFIDPRETRLISTHFLP", length = 50)
	public String getMifidpretrlisthflp() {
		return this.mifidpretrlisthflp;
	}

	public void setMifidpretrlisthflp(String mifidpretrlisthflp) {
		this.mifidpretrlisthflp = mifidpretrlisthflp;
	}

	@Column(name = "MIFIDPRETRLISTHVL", length = 50)
	public String getMifidpretrlisthvl() {
		return this.mifidpretrlisthvl;
	}

	public void setMifidpretrlisthvl(String mifidpretrlisthvl) {
		this.mifidpretrlisthvl = mifidpretrlisthvl;
	}

	@Column(name = "MIFIDPRETRLISTHVLCF", length = 50)
	public String getMifidpretrlisthvlcf() {
		return this.mifidpretrlisthvlcf;
	}

	public void setMifidpretrlisthvlcf(String mifidpretrlisthvlcf) {
		this.mifidpretrlisthvlcf = mifidpretrlisthvlcf;
	}

	@Column(name = "MIFIDPRETRLISTHVLP", length = 50)
	public String getMifidpretrlisthvlp() {
		return this.mifidpretrlisthvlp;
	}

	public void setMifidpretrlisthvlp(String mifidpretrlisthvlp) {
		this.mifidpretrlisthvlp = mifidpretrlisthvlp;
	}

	@Column(name = "MIFIDPRETRLISTRPER", length = 50)
	public String getMifidpretrlistrper() {
		return this.mifidpretrlistrper;
	}

	public void setMifidpretrlistrper(String mifidpretrlistrper) {
		this.mifidpretrlistrper = mifidpretrlistrper;
	}

	@Column(name = "MIFIDPRETRLISTRPERCF", length = 50)
	public String getMifidpretrlistrpercf() {
		return this.mifidpretrlistrpercf;
	}

	public void setMifidpretrlistrpercf(String mifidpretrlistrpercf) {
		this.mifidpretrlistrpercf = mifidpretrlistrpercf;
	}

	@Column(name = "MIFIDPRETRLISTRPERP", length = 50)
	public String getMifidpretrlistrperp() {
		return this.mifidpretrlistrperp;
	}

	public void setMifidpretrlistrperp(String mifidpretrlistrperp) {
		this.mifidpretrlistrperp = mifidpretrlistrperp;
	}

	@Column(name = "MIFIDPRETRSSTITHFL", length = 50)
	public String getMifidpretrsstithfl() {
		return this.mifidpretrsstithfl;
	}

	public void setMifidpretrsstithfl(String mifidpretrsstithfl) {
		this.mifidpretrsstithfl = mifidpretrsstithfl;
	}

	@Column(name = "MIFIDPRETRSSTITHFLCF", length = 50)
	public String getMifidpretrsstithflcf() {
		return this.mifidpretrsstithflcf;
	}

	public void setMifidpretrsstithflcf(String mifidpretrsstithflcf) {
		this.mifidpretrsstithflcf = mifidpretrsstithflcf;
	}

	@Column(name = "MIFIDPRETRSSTITHFLP", length = 50)
	public String getMifidpretrsstithflp() {
		return this.mifidpretrsstithflp;
	}

	public void setMifidpretrsstithflp(String mifidpretrsstithflp) {
		this.mifidpretrsstithflp = mifidpretrsstithflp;
	}

	@Column(name = "MIFIDPRETRSSTITHVL", length = 50)
	public String getMifidpretrsstithvl() {
		return this.mifidpretrsstithvl;
	}

	public void setMifidpretrsstithvl(String mifidpretrsstithvl) {
		this.mifidpretrsstithvl = mifidpretrsstithvl;
	}

	@Column(name = "MIFIDPRETRSSTITHVLCF", length = 50)
	public String getMifidpretrsstithvlcf() {
		return this.mifidpretrsstithvlcf;
	}

	public void setMifidpretrsstithvlcf(String mifidpretrsstithvlcf) {
		this.mifidpretrsstithvlcf = mifidpretrsstithvlcf;
	}

	@Column(name = "MIFIDPRETRSSTITHVLP", length = 50)
	public String getMifidpretrsstithvlp() {
		return this.mifidpretrsstithvlp;
	}

	public void setMifidpretrsstithvlp(String mifidpretrsstithvlp) {
		this.mifidpretrsstithvlp = mifidpretrsstithvlp;
	}

	@Column(name = "MIFIDPRETRSSTITRPER", length = 50)
	public String getMifidpretrsstitrper() {
		return this.mifidpretrsstitrper;
	}

	public void setMifidpretrsstitrper(String mifidpretrsstitrper) {
		this.mifidpretrsstitrper = mifidpretrsstitrper;
	}

	@Column(name = "MIFIDPRETRSSTITRPERCF", length = 50)
	public String getMifidpretrsstitrpercf() {
		return this.mifidpretrsstitrpercf;
	}

	public void setMifidpretrsstitrpercf(String mifidpretrsstitrpercf) {
		this.mifidpretrsstitrpercf = mifidpretrsstitrpercf;
	}

	@Column(name = "MIFIDPRETRSSTITRPERP", length = 50)
	public String getMifidpretrsstitrperp() {
		return this.mifidpretrsstitrperp;
	}

	public void setMifidpretrsstitrperp(String mifidpretrsstitrperp) {
		this.mifidpretrsstitrperp = mifidpretrsstitrperp;
	}

	@Column(name = "MIFIDREGULATEDESMA", length = 50)
	public String getMifidregulatedesma() {
		return this.mifidregulatedesma;
	}

	public void setMifidregulatedesma(String mifidregulatedesma) {
		this.mifidregulatedesma = mifidregulatedesma;
	}

	@Column(name = "MIFIDREGULATEDESMACF", length = 50)
	public String getMifidregulatedesmacf() {
		return this.mifidregulatedesmacf;
	}

	public void setMifidregulatedesmacf(String mifidregulatedesmacf) {
		this.mifidregulatedesmacf = mifidregulatedesmacf;
	}

	@Column(name = "MIFIDREGULATEDESMAP", length = 50)
	public String getMifidregulatedesmap() {
		return this.mifidregulatedesmap;
	}

	public void setMifidregulatedesmap(String mifidregulatedesmap) {
		this.mifidregulatedesmap = mifidregulatedesmap;
	}

	@Column(name = "MIFIDSTMASIZEESMA", length = 50)
	public String getMifidstmasizeesma() {
		return this.mifidstmasizeesma;
	}

	public void setMifidstmasizeesma(String mifidstmasizeesma) {
		this.mifidstmasizeesma = mifidstmasizeesma;
	}

	@Column(name = "MIFIDSTMASIZEESMACF", length = 50)
	public String getMifidstmasizeesmacf() {
		return this.mifidstmasizeesmacf;
	}

	public void setMifidstmasizeesmacf(String mifidstmasizeesmacf) {
		this.mifidstmasizeesmacf = mifidstmasizeesmacf;
	}

	@Column(name = "MIFIDSTMASIZEESMAP", length = 50)
	public String getMifidstmasizeesmap() {
		return this.mifidstmasizeesmap;
	}

	public void setMifidstmasizeesmap(String mifidstmasizeesmap) {
		this.mifidstmasizeesmap = mifidstmasizeesmap;
	}

	@Column(name = "MIFIDSTMASIZECURCODE", length = 50)
	public String getMifidstmasizecurcode() {
		return this.mifidstmasizecurcode;
	}

	public void setMifidstmasizecurcode(String mifidstmasizecurcode) {
		this.mifidstmasizecurcode = mifidstmasizecurcode;
	}

	@Column(name = "MIFIDSTMASIZECURCODECF", length = 50)
	public String getMifidstmasizecurcodecf() {
		return this.mifidstmasizecurcodecf;
	}

	public void setMifidstmasizecurcodecf(String mifidstmasizecurcodecf) {
		this.mifidstmasizecurcodecf = mifidstmasizecurcodecf;
	}

	@Column(name = "MIFIDSTMASIZECURCODEP", length = 50)
	public String getMifidstmasizecurcodep() {
		return this.mifidstmasizecurcodep;
	}

	public void setMifidstmasizecurcodep(String mifidstmasizecurcodep) {
		this.mifidstmasizecurcodep = mifidstmasizecurcodep;
	}

	@Column(name = "MIFIDSUBPROD", length = 50)
	public String getMifidsubprod() {
		return this.mifidsubprod;
	}

	public void setMifidsubprod(String mifidsubprod) {
		this.mifidsubprod = mifidsubprod;
	}

	@Column(name = "MIFIDSUBPRODCF", length = 50)
	public String getMifidsubprodcf() {
		return this.mifidsubprodcf;
	}

	public void setMifidsubprodcf(String mifidsubprodcf) {
		this.mifidsubprodcf = mifidsubprodcf;
	}

	@Column(name = "MIFIDSUBPRODP", length = 50)
	public String getMifidsubprodp() {
		return this.mifidsubprodp;
	}

	public void setMifidsubprodp(String mifidsubprodp) {
		this.mifidsubprodp = mifidsubprodp;
	}

	@Column(name = "MIFIDSUBPRODESMA", length = 50)
	public String getMifidsubprodesma() {
		return this.mifidsubprodesma;
	}

	public void setMifidsubprodesma(String mifidsubprodesma) {
		this.mifidsubprodesma = mifidsubprodesma;
	}

	@Column(name = "MIFIDSUBPRODESMACF", length = 50)
	public String getMifidsubprodesmacf() {
		return this.mifidsubprodesmacf;
	}

	public void setMifidsubprodesmacf(String mifidsubprodesmacf) {
		this.mifidsubprodesmacf = mifidsubprodesmacf;
	}

	@Column(name = "MIFIDSUBPRODESMAP", length = 50)
	public String getMifidsubprodesmap() {
		return this.mifidsubprodesmap;
	}

	public void setMifidsubprodesmap(String mifidsubprodesmap) {
		this.mifidsubprodesmap = mifidsubprodesmap;
	}

	@Column(name = "MIFIDTERMDATE", length = 50)
	public String getMifidtermdate() {
		return this.mifidtermdate;
	}

	public void setMifidtermdate(String mifidtermdate) {
		this.mifidtermdate = mifidtermdate;
	}

	@Column(name = "MIFIDTERMDATECF", length = 50)
	public String getMifidtermdatecf() {
		return this.mifidtermdatecf;
	}

	public void setMifidtermdatecf(String mifidtermdatecf) {
		this.mifidtermdatecf = mifidtermdatecf;
	}

	@Column(name = "MIFIDTERMDATEP", length = 50)
	public String getMifidtermdatep() {
		return this.mifidtermdatep;
	}

	public void setMifidtermdatep(String mifidtermdatep) {
		this.mifidtermdatep = mifidtermdatep;
	}

	@Column(name = "MIFIDTERMDATEESMA", length = 50)
	public String getMifidtermdateesma() {
		return this.mifidtermdateesma;
	}

	public void setMifidtermdateesma(String mifidtermdateesma) {
		this.mifidtermdateesma = mifidtermdateesma;
	}

	@Column(name = "MIFIDTERMDATEESMACF", length = 50)
	public String getMifidtermdateesmacf() {
		return this.mifidtermdateesmacf;
	}

	public void setMifidtermdateesmacf(String mifidtermdateesmacf) {
		this.mifidtermdateesmacf = mifidtermdateesmacf;
	}

	@Column(name = "MIFIDTERMDATEESMAP", length = 50)
	public String getMifidtermdateesmap() {
		return this.mifidtermdateesmap;
	}

	public void setMifidtermdateesmap(String mifidtermdateesmap) {
		this.mifidtermdateesmap = mifidtermdateesmap;
	}

	@Column(name = "MIFIDTROBFLAG", length = 50)
	public String getMifidtrobflag() {
		return this.mifidtrobflag;
	}

	public void setMifidtrobflag(String mifidtrobflag) {
		this.mifidtrobflag = mifidtrobflag;
	}

	@Column(name = "MIFIDTROBFLAGCF", length = 50)
	public String getMifidtrobflagcf() {
		return this.mifidtrobflagcf;
	}

	public void setMifidtrobflagcf(String mifidtrobflagcf) {
		this.mifidtrobflagcf = mifidtrobflagcf;
	}

	@Column(name = "MIFIDTROBFLAGP", length = 50)
	public String getMifidtrobflagp() {
		return this.mifidtrobflagp;
	}

	public void setMifidtrobflagp(String mifidtrobflagp) {
		this.mifidtrobflagp = mifidtrobflagp;
	}

	@Column(name = "MIFIDTRADAPDATE", length = 50)
	public String getMifidtradapdate() {
		return this.mifidtradapdate;
	}

	public void setMifidtradapdate(String mifidtradapdate) {
		this.mifidtradapdate = mifidtradapdate;
	}

	@Column(name = "MIFIDTRADAPDATECF", length = 50)
	public String getMifidtradapdatecf() {
		return this.mifidtradapdatecf;
	}

	public void setMifidtradapdatecf(String mifidtradapdatecf) {
		this.mifidtradapdatecf = mifidtradapdatecf;
	}

	@Column(name = "MIFIDTRADAPDATEP", length = 50)
	public String getMifidtradapdatep() {
		return this.mifidtradapdatep;
	}

	public void setMifidtradapdatep(String mifidtradapdatep) {
		this.mifidtradapdatep = mifidtradapdatep;
	}

	@Column(name = "MIFIDTRADAPDATEESMA", length = 50)
	public String getMifidtradapdateesma() {
		return this.mifidtradapdateesma;
	}

	public void setMifidtradapdateesma(String mifidtradapdateesma) {
		this.mifidtradapdateesma = mifidtradapdateesma;
	}

	@Column(name = "MIFIDTRADAPDATEESMACF", length = 50)
	public String getMifidtradapdateesmacf() {
		return this.mifidtradapdateesmacf;
	}

	public void setMifidtradapdateesmacf(String mifidtradapdateesmacf) {
		this.mifidtradapdateesmacf = mifidtradapdateesmacf;
	}

	@Column(name = "MIFIDTRADAPDATEESMAP", length = 50)
	public String getMifidtradapdateesmap() {
		return this.mifidtradapdateesmap;
	}

	public void setMifidtradapdateesmap(String mifidtradapdateesmap) {
		this.mifidtradapdateesmap = mifidtradapdateesmap;
	}

	@Column(name = "MIFIDTRADREQDATE", length = 50)
	public String getMifidtradreqdate() {
		return this.mifidtradreqdate;
	}

	public void setMifidtradreqdate(String mifidtradreqdate) {
		this.mifidtradreqdate = mifidtradreqdate;
	}

	@Column(name = "MIFIDTRADREQDATECF", length = 50)
	public String getMifidtradreqdatecf() {
		return this.mifidtradreqdatecf;
	}

	public void setMifidtradreqdatecf(String mifidtradreqdatecf) {
		this.mifidtradreqdatecf = mifidtradreqdatecf;
	}

	@Column(name = "MIFIDTRADREQDATEP", length = 50)
	public String getMifidtradreqdatep() {
		return this.mifidtradreqdatep;
	}

	public void setMifidtradreqdatep(String mifidtradreqdatep) {
		this.mifidtradreqdatep = mifidtradreqdatep;
	}

	@Column(name = "MIFIDTRADREQDATEESMA", length = 50)
	public String getMifidtradreqdateesma() {
		return this.mifidtradreqdateesma;
	}

	public void setMifidtradreqdateesma(String mifidtradreqdateesma) {
		this.mifidtradreqdateesma = mifidtradreqdateesma;
	}

	@Column(name = "MIFIDTRADREQDATEESMACF", length = 50)
	public String getMifidtradreqdateesmacf() {
		return this.mifidtradreqdateesmacf;
	}

	public void setMifidtradreqdateesmacf(String mifidtradreqdateesmacf) {
		this.mifidtradreqdateesmacf = mifidtradreqdateesmacf;
	}

	@Column(name = "MIFIDTRADREQDATEESMAP", length = 50)
	public String getMifidtradreqdateesmap() {
		return this.mifidtradreqdateesmap;
	}

	public void setMifidtradreqdateesmap(String mifidtradreqdateesmap) {
		this.mifidtradreqdateesmap = mifidtradreqdateesmap;
	}

	@Column(name = "MIFIDTRTYPE", length = 50)
	public String getMifidtrtype() {
		return this.mifidtrtype;
	}

	public void setMifidtrtype(String mifidtrtype) {
		this.mifidtrtype = mifidtrtype;
	}

	@Column(name = "MIFIDTRTYPECF", length = 50)
	public String getMifidtrtypecf() {
		return this.mifidtrtypecf;
	}

	public void setMifidtrtypecf(String mifidtrtypecf) {
		this.mifidtrtypecf = mifidtrtypecf;
	}

	@Column(name = "MIFIDTRTYPEP", length = 50)
	public String getMifidtrtypep() {
		return this.mifidtrtypep;
	}

	public void setMifidtrtypep(String mifidtrtypep) {
		this.mifidtrtypep = mifidtrtypep;
	}

	@Column(name = "MIFIDTRTYPEESMA", length = 50)
	public String getMifidtrtypeesma() {
		return this.mifidtrtypeesma;
	}

	public void setMifidtrtypeesma(String mifidtrtypeesma) {
		this.mifidtrtypeesma = mifidtrtypeesma;
	}

	@Column(name = "MIFIDTRTYPEESMACF", length = 50)
	public String getMifidtrtypeesmacf() {
		return this.mifidtrtypeesmacf;
	}

	public void setMifidtrtypeesmacf(String mifidtrtypeesmacf) {
		this.mifidtrtypeesmacf = mifidtrtypeesmacf;
	}

	@Column(name = "MIFIDTRTYPEESMAP", length = 50)
	public String getMifidtrtypeesmap() {
		return this.mifidtrtypeesmap;
	}

	public void setMifidtrtypeesmap(String mifidtrtypeesmap) {
		this.mifidtrtypeesmap = mifidtrtypeesmap;
	}

	@Column(name = "MIFIDUNDINDNAME", length = 50)
	public String getMifidundindname() {
		return this.mifidundindname;
	}

	public void setMifidundindname(String mifidundindname) {
		this.mifidundindname = mifidundindname;
	}

	@Column(name = "MIFIDUNDINDNAMECF", length = 50)
	public String getMifidundindnamecf() {
		return this.mifidundindnamecf;
	}

	public void setMifidundindnamecf(String mifidundindnamecf) {
		this.mifidundindnamecf = mifidundindnamecf;
	}

	@Column(name = "MIFIDUNDINDNAMEP", length = 50)
	public String getMifidundindnamep() {
		return this.mifidundindnamep;
	}

	public void setMifidundindnamep(String mifidundindnamep) {
		this.mifidundindnamep = mifidundindnamep;
	}

	@Column(name = "MIFIDUNDINDNAMEESMA", length = 50)
	public String getMifidundindnameesma() {
		return this.mifidundindnameesma;
	}

	public void setMifidundindnameesma(String mifidundindnameesma) {
		this.mifidundindnameesma = mifidundindnameesma;
	}

	@Column(name = "MIFIDUNDINDNAMEESMACF", length = 50)
	public String getMifidundindnameesmacf() {
		return this.mifidundindnameesmacf;
	}

	public void setMifidundindnameesmacf(String mifidundindnameesmacf) {
		this.mifidundindnameesmacf = mifidundindnameesmacf;
	}

	@Column(name = "MIFIDUNDINDNAMEESMAP", length = 50)
	public String getMifidundindnameesmap() {
		return this.mifidundindnameesmap;
	}

	public void setMifidundindnameesmap(String mifidundindnameesmap) {
		this.mifidundindnameesmap = mifidundindnameesmap;
	}

	@Column(name = "MIFIDUNDINDTERMESMA", length = 50)
	public String getMifidundindtermesma() {
		return this.mifidundindtermesma;
	}

	public void setMifidundindtermesma(String mifidundindtermesma) {
		this.mifidundindtermesma = mifidundindtermesma;
	}

	@Column(name = "MIFIDUNDINDTERMESMACF", length = 50)
	public String getMifidundindtermesmacf() {
		return this.mifidundindtermesmacf;
	}

	public void setMifidundindtermesmacf(String mifidundindtermesmacf) {
		this.mifidundindtermesmacf = mifidundindtermesmacf;
	}

	@Column(name = "MIFIDUNDINDTERMESMAP", length = 50)
	public String getMifidundindtermesmap() {
		return this.mifidundindtermesmap;
	}

	public void setMifidundindtermesmap(String mifidundindtermesmap) {
		this.mifidundindtermesmap = mifidundindtermesmap;
	}

	@Column(name = "MIFIDUNDTYPE", length = 50)
	public String getMifidundtype() {
		return this.mifidundtype;
	}

	public void setMifidundtype(String mifidundtype) {
		this.mifidundtype = mifidundtype;
	}

	@Column(name = "MIFIDUNDTYPECF", length = 50)
	public String getMifidundtypecf() {
		return this.mifidundtypecf;
	}

	public void setMifidundtypecf(String mifidundtypecf) {
		this.mifidundtypecf = mifidundtypecf;
	}

	@Column(name = "MIFIDUNDTYPEP", length = 50)
	public String getMifidundtypep() {
		return this.mifidundtypep;
	}

	public void setMifidundtypep(String mifidundtypep) {
		this.mifidundtypep = mifidundtypep;
	}

	@Column(name = "MIFIRIDENTIFIER", length = 50)
	public String getMifiridentifier() {
		return this.mifiridentifier;
	}

	public void setMifiridentifier(String mifiridentifier) {
		this.mifiridentifier = mifiridentifier;
	}

	@Column(name = "MIFIRIDENTIFIERCF", length = 50)
	public String getMifiridentifiercf() {
		return this.mifiridentifiercf;
	}

	public void setMifiridentifiercf(String mifiridentifiercf) {
		this.mifiridentifiercf = mifiridentifiercf;
	}

	@Column(name = "MIFIRIDENTIFIERP", length = 50)
	public String getMifiridentifierp() {
		return this.mifiridentifierp;
	}

	public void setMifiridentifierp(String mifiridentifierp) {
		this.mifiridentifierp = mifiridentifierp;
	}

	@Column(name = "MINDENOMINATION", length = 50)
	public String getMindenomination() {
		return this.mindenomination;
	}

	public void setMindenomination(String mindenomination) {
		this.mindenomination = mindenomination;
	}

	@Column(name = "MINDENOMINATIONCF", length = 50)
	public String getMindenominationcf() {
		return this.mindenominationcf;
	}

	public void setMindenominationcf(String mindenominationcf) {
		this.mindenominationcf = mindenominationcf;
	}

	@Column(name = "MINDENOMINATIONP", length = 50)
	public String getMindenominationp() {
		return this.mindenominationp;
	}

	public void setMindenominationp(String mindenominationp) {
		this.mindenominationp = mindenominationp;
	}

	@Column(name = "NCAAVDAILYTURNOVER", length = 50)
	public String getNcaavdailyturnover() {
		return this.ncaavdailyturnover;
	}

	public void setNcaavdailyturnover(String ncaavdailyturnover) {
		this.ncaavdailyturnover = ncaavdailyturnover;
	}

	@Column(name = "NCAAVDAILYTURNOVERCF", length = 50)
	public String getNcaavdailyturnovercf() {
		return this.ncaavdailyturnovercf;
	}

	public void setNcaavdailyturnovercf(String ncaavdailyturnovercf) {
		this.ncaavdailyturnovercf = ncaavdailyturnovercf;
	}

	@Column(name = "NCAAVDAILYTURNOVERP", length = 50)
	public String getNcaavdailyturnoverp() {
		return this.ncaavdailyturnoverp;
	}

	public void setNcaavdailyturnoverp(String ncaavdailyturnoverp) {
		this.ncaavdailyturnoverp = ncaavdailyturnoverp;
	}

	@Column(name = "NCAAVDAILYTURNCURCODE", length = 50)
	public String getNcaavdailyturncurcode() {
		return this.ncaavdailyturncurcode;
	}

	public void setNcaavdailyturncurcode(String ncaavdailyturncurcode) {
		this.ncaavdailyturncurcode = ncaavdailyturncurcode;
	}

	@Column(name = "NCAAVDAILYTURNCURCODECF", length = 50)
	public String getNcaavdailyturncurcodecf() {
		return this.ncaavdailyturncurcodecf;
	}

	public void setNcaavdailyturncurcodecf(String ncaavdailyturncurcodecf) {
		this.ncaavdailyturncurcodecf = ncaavdailyturncurcodecf;
	}

	@Column(name = "NCAAVDAILYTURNCURCODEP", length = 50)
	public String getNcaavdailyturncurcodep() {
		return this.ncaavdailyturncurcodep;
	}

	public void setNcaavdailyturncurcodep(String ncaavdailyturncurcodep) {
		this.ncaavdailyturncurcodep = ncaavdailyturncurcodep;
	}

	@Column(name = "NCAFREEFL", length = 50)
	public String getNcafreefl() {
		return this.ncafreefl;
	}

	public void setNcafreefl(String ncafreefl) {
		this.ncafreefl = ncafreefl;
	}

	@Column(name = "NCAFREEFLCF", length = 50)
	public String getNcafreeflcf() {
		return this.ncafreeflcf;
	}

	public void setNcafreeflcf(String ncafreeflcf) {
		this.ncafreeflcf = ncafreeflcf;
	}

	@Column(name = "NCAFREEFLP", length = 50)
	public String getNcafreeflp() {
		return this.ncafreeflp;
	}

	public void setNcafreeflp(String ncafreeflp) {
		this.ncafreeflp = ncafreeflp;
	}

	@Column(name = "NCAFREEFLCURCODE", length = 50)
	public String getNcafreeflcurcode() {
		return this.ncafreeflcurcode;
	}

	public void setNcafreeflcurcode(String ncafreeflcurcode) {
		this.ncafreeflcurcode = ncafreeflcurcode;
	}

	@Column(name = "NCAFREEFLCURCODECF", length = 50)
	public String getNcafreeflcurcodecf() {
		return this.ncafreeflcurcodecf;
	}

	public void setNcafreeflcurcodecf(String ncafreeflcurcodecf) {
		this.ncafreeflcurcodecf = ncafreeflcurcodecf;
	}

	@Column(name = "NCAFREEFLCURCODEP", length = 50)
	public String getNcafreeflcurcodep() {
		return this.ncafreeflcurcodep;
	}

	public void setNcafreeflcurcodep(String ncafreeflcurcodep) {
		this.ncafreeflcurcodep = ncafreeflcurcodep;
	}

	@Column(name = "NOTIONALCURESMA", length = 50)
	public String getNotionalcuresma() {
		return this.notionalcuresma;
	}

	public void setNotionalcuresma(String notionalcuresma) {
		this.notionalcuresma = notionalcuresma;
	}

	@Column(name = "NOTIONALCURESMACF", length = 50)
	public String getNotionalcuresmacf() {
		return this.notionalcuresmacf;
	}

	public void setNotionalcuresmacf(String notionalcuresmacf) {
		this.notionalcuresmacf = notionalcuresmacf;
	}

	@Column(name = "NOTIONALCURESMAP", length = 50)
	public String getNotionalcuresmap() {
		return this.notionalcuresmap;
	}

	public void setNotionalcuresmap(String notionalcuresmap) {
		this.notionalcuresmap = notionalcuresmap;
	}

	@Column(name = "OPTIONROOT", length = 50)
	public String getOptionroot() {
		return this.optionroot;
	}

	public void setOptionroot(String optionroot) {
		this.optionroot = optionroot;
	}

	@Column(name = "OPTIONROOTCF", length = 50)
	public String getOptionrootcf() {
		return this.optionrootcf;
	}

	public void setOptionrootcf(String optionrootcf) {
		this.optionrootcf = optionrootcf;
	}

	@Column(name = "OPTIONROOTP", length = 50)
	public String getOptionrootp() {
		return this.optionrootp;
	}

	public void setOptionrootp(String optionrootp) {
		this.optionrootp = optionrootp;
	}

	@Column(name = "PLACEHOLDER", length = 50)
	public String getPlaceholder() {
		return this.placeholder;
	}

	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}

	@Column(name = "PRICEMULTIPLIERESMA", length = 50)
	public String getPricemultiplieresma() {
		return this.pricemultiplieresma;
	}

	public void setPricemultiplieresma(String pricemultiplieresma) {
		this.pricemultiplieresma = pricemultiplieresma;
	}

	@Column(name = "PRICEMULTIPLIERESMACF", length = 50)
	public String getPricemultiplieresmacf() {
		return this.pricemultiplieresmacf;
	}

	public void setPricemultiplieresmacf(String pricemultiplieresmacf) {
		this.pricemultiplieresmacf = pricemultiplieresmacf;
	}

	@Column(name = "PRICEMULTIPLIERESMAP", length = 50)
	public String getPricemultiplieresmap() {
		return this.pricemultiplieresmap;
	}

	public void setPricemultiplieresmap(String pricemultiplieresmap) {
		this.pricemultiplieresmap = pricemultiplieresmap;
	}

	@Column(name = "PRTRMAQUOTE", length = 50)
	public String getPrtrmaquote() {
		return this.prtrmaquote;
	}

	public void setPrtrmaquote(String prtrmaquote) {
		this.prtrmaquote = prtrmaquote;
	}

	@Column(name = "PRTRMAQUOTECF", length = 50)
	public String getPrtrmaquotecf() {
		return this.prtrmaquotecf;
	}

	public void setPrtrmaquotecf(String prtrmaquotecf) {
		this.prtrmaquotecf = prtrmaquotecf;
	}

	@Column(name = "PRTRMAQUOTEP", length = 50)
	public String getPrtrmaquotep() {
		return this.prtrmaquotep;
	}

	public void setPrtrmaquotep(String prtrmaquotep) {
		this.prtrmaquotep = prtrmaquotep;
	}

	@Column(name = "QUOTEPERMID", length = 50)
	public String getQuotepermid() {
		return this.quotepermid;
	}

	public void setQuotepermid(String quotepermid) {
		this.quotepermid = quotepermid;
	}

	@Column(name = "QUOTEPERMIDCF", length = 50)
	public String getQuotepermidcf() {
		return this.quotepermidcf;
	}

	public void setQuotepermidcf(String quotepermidcf) {
		this.quotepermidcf = quotepermidcf;
	}

	@Column(name = "QUOTEPERMIDP", length = 50)
	public String getQuotepermidp() {
		return this.quotepermidp;
	}

	public void setQuotepermidp(String quotepermidp) {
		this.quotepermidp = quotepermidp;
	}

	@Column(name = "REQFATTBYISSUER", length = 50)
	public String getReqfattbyissuer() {
		return this.reqfattbyissuer;
	}

	public void setReqfattbyissuer(String reqfattbyissuer) {
		this.reqfattbyissuer = reqfattbyissuer;
	}

	@Column(name = "REQFATTBYISSUERCF", length = 50)
	public String getReqfattbyissuercf() {
		return this.reqfattbyissuercf;
	}

	public void setReqfattbyissuercf(String reqfattbyissuercf) {
		this.reqfattbyissuercf = reqfattbyissuercf;
	}

	@Column(name = "REQFATTBYISSUERP", length = 50)
	public String getReqfattbyissuerp() {
		return this.reqfattbyissuerp;
	}

	public void setReqfattbyissuerp(String reqfattbyissuerp) {
		this.reqfattbyissuerp = reqfattbyissuerp;
	}

	@Column(name = "REQFATTBYISSUERESMA", length = 50)
	public String getReqfattbyissueresma() {
		return this.reqfattbyissueresma;
	}

	public void setReqfattbyissueresma(String reqfattbyissueresma) {
		this.reqfattbyissueresma = reqfattbyissueresma;
	}

	@Column(name = "REQFATTBYISSUERESMACF", length = 50)
	public String getReqfattbyissueresmacf() {
		return this.reqfattbyissueresmacf;
	}

	public void setReqfattbyissueresmacf(String reqfattbyissueresmacf) {
		this.reqfattbyissueresmacf = reqfattbyissueresmacf;
	}

	@Column(name = "REQFATTBYISSUERESMAP", length = 50)
	public String getReqfattbyissueresmap() {
		return this.reqfattbyissueresmap;
	}

	public void setReqfattbyissueresmap(String reqfattbyissueresmap) {
		this.reqfattbyissueresmap = reqfattbyissueresmap;
	}

	@Column(name = "SECURITYDESCRIPTION", length = 50)
	public String getSecuritydescription() {
		return this.securitydescription;
	}

	public void setSecuritydescription(String securitydescription) {
		this.securitydescription = securitydescription;
	}

	@Column(name = "SECURITYDESCRIPTIONCF", length = 50)
	public String getSecuritydescriptioncf() {
		return this.securitydescriptioncf;
	}

	public void setSecuritydescriptioncf(String securitydescriptioncf) {
		this.securitydescriptioncf = securitydescriptioncf;
	}

	@Column(name = "SECURITYDESCRIPTIONP", length = 50)
	public String getSecuritydescriptionp() {
		return this.securitydescriptionp;
	}

	public void setSecuritydescriptionp(String securitydescriptionp) {
		this.securitydescriptionp = securitydescriptionp;
	}

	@Column(name = "STRIKEPRICEESMA", length = 50)
	public String getStrikepriceesma() {
		return this.strikepriceesma;
	}

	public void setStrikepriceesma(String strikepriceesma) {
		this.strikepriceesma = strikepriceesma;
	}

	@Column(name = "STRIKEPRICEESMACF", length = 50)
	public String getStrikepriceesmacf() {
		return this.strikepriceesmacf;
	}

	public void setStrikepriceesmacf(String strikepriceesmacf) {
		this.strikepriceesmacf = strikepriceesmacf;
	}

	@Column(name = "STRIKEPRICEESMAP", length = 50)
	public String getStrikepriceesmap() {
		return this.strikepriceesmap;
	}

	public void setStrikepriceesmap(String strikepriceesmap) {
		this.strikepriceesmap = strikepriceesmap;
	}

	@Column(name = "STRIKEPRICECURESMA", length = 50)
	public String getStrikepricecuresma() {
		return this.strikepricecuresma;
	}

	public void setStrikepricecuresma(String strikepricecuresma) {
		this.strikepricecuresma = strikepricecuresma;
	}

	@Column(name = "STRIKEPRICECURESMACF", length = 50)
	public String getStrikepricecuresmacf() {
		return this.strikepricecuresmacf;
	}

	public void setStrikepricecuresmacf(String strikepricecuresmacf) {
		this.strikepricecuresmacf = strikepricecuresmacf;
	}

	@Column(name = "STRIKEPRICECURESMAP", length = 50)
	public String getStrikepricecuresmap() {
		return this.strikepricecuresmap;
	}

	public void setStrikepricecuresmap(String strikepricecuresmap) {
		this.strikepricecuresmap = strikepricecuresmap;
	}

	@Column(name = "SUSCATEGORYESMA", length = 50)
	public String getSuscategoryesma() {
		return this.suscategoryesma;
	}

	public void setSuscategoryesma(String suscategoryesma) {
		this.suscategoryesma = suscategoryesma;
	}

	@Column(name = "SUSCATEGORYESMACF", length = 50)
	public String getSuscategoryesmacf() {
		return this.suscategoryesmacf;
	}

	public void setSuscategoryesmacf(String suscategoryesmacf) {
		this.suscategoryesmacf = suscategoryesmacf;
	}

	@Column(name = "SUSCATEGORYESMAP", length = 50)
	public String getSuscategoryesmap() {
		return this.suscategoryesmap;
	}

	public void setSuscategoryesmap(String suscategoryesmap) {
		this.suscategoryesmap = suscategoryesmap;
	}

	@Column(name = "SUSENDEDONESMA", length = 50)
	public String getSusendedonesma() {
		return this.susendedonesma;
	}

	public void setSusendedonesma(String susendedonesma) {
		this.susendedonesma = susendedonesma;
	}

	@Column(name = "SUSENDEDONESMACF", length = 50)
	public String getSusendedonesmacf() {
		return this.susendedonesmacf;
	}

	public void setSusendedonesmacf(String susendedonesmacf) {
		this.susendedonesmacf = susendedonesmacf;
	}

	@Column(name = "SUSENDEDONESMAP", length = 50)
	public String getSusendedonesmap() {
		return this.susendedonesmap;
	}

	public void setSusendedonesmap(String susendedonesmap) {
		this.susendedonesmap = susendedonesmap;
	}

	@Column(name = "SUSONGOINGESMA", length = 50)
	public String getSusongoingesma() {
		return this.susongoingesma;
	}

	public void setSusongoingesma(String susongoingesma) {
		this.susongoingesma = susongoingesma;
	}

	@Column(name = "SUSONGOINGESMACF", length = 50)
	public String getSusongoingesmacf() {
		return this.susongoingesmacf;
	}

	public void setSusongoingesmacf(String susongoingesmacf) {
		this.susongoingesmacf = susongoingesmacf;
	}

	@Column(name = "SUSONGOINGESMAP", length = 50)
	public String getSusongoingesmap() {
		return this.susongoingesmap;
	}

	public void setSusongoingesmap(String susongoingesmap) {
		this.susongoingesmap = susongoingesmap;
	}

	@Column(name = "SUSRATESMA", length = 50)
	public String getSusratesma() {
		return this.susratesma;
	}

	public void setSusratesma(String susratesma) {
		this.susratesma = susratesma;
	}

	@Column(name = "SUSRATESMACF", length = 50)
	public String getSusratesmacf() {
		return this.susratesmacf;
	}

	public void setSusratesmacf(String susratesmacf) {
		this.susratesmacf = susratesmacf;
	}

	@Column(name = "SUSRATESMAP", length = 50)
	public String getSusratesmap() {
		return this.susratesmap;
	}

	public void setSusratesmap(String susratesmap) {
		this.susratesmap = susratesmap;
	}

	@Column(name = "SUSSTONESMA", length = 50)
	public String getSusstonesma() {
		return this.susstonesma;
	}

	public void setSusstonesma(String susstonesma) {
		this.susstonesma = susstonesma;
	}

	@Column(name = "SUSSTONESMACF", length = 50)
	public String getSusstonesmacf() {
		return this.susstonesmacf;
	}

	public void setSusstonesmacf(String susstonesmacf) {
		this.susstonesmacf = susstonesmacf;
	}

	@Column(name = "SUSSTONESMAP", length = 50)
	public String getSusstonesmap() {
		return this.susstonesmap;
	}

	public void setSusstonesmap(String susstonesmap) {
		this.susstonesmap = susstonesmap;
	}

	@Column(name = "TTLAMISSUED", length = 50)
	public String getTtlamissued() {
		return this.ttlamissued;
	}

	public void setTtlamissued(String ttlamissued) {
		this.ttlamissued = ttlamissued;
	}

	@Column(name = "TTLAMISSUEDCF", length = 50)
	public String getTtlamissuedcf() {
		return this.ttlamissuedcf;
	}

	public void setTtlamissuedcf(String ttlamissuedcf) {
		this.ttlamissuedcf = ttlamissuedcf;
	}

	@Column(name = "TTLAMISSUEDP", length = 50)
	public String getTtlamissuedp() {
		return this.ttlamissuedp;
	}

	public void setTtlamissuedp(String ttlamissuedp) {
		this.ttlamissuedp = ttlamissuedp;
	}

	@Column(name = "TTLEUTU12MOESMA", length = 50)
	public String getTtleutu12moesma() {
		return this.ttleutu12moesma;
	}

	public void setTtleutu12moesma(String ttleutu12moesma) {
		this.ttleutu12moesma = ttleutu12moesma;
	}

	@Column(name = "TTLEUTU12MOESMACF", length = 50)
	public String getTtleutu12moesmacf() {
		return this.ttleutu12moesmacf;
	}

	public void setTtleutu12moesmacf(String ttleutu12moesmacf) {
		this.ttleutu12moesmacf = ttleutu12moesmacf;
	}

	@Column(name = "TTLEUTU12MOESMAP", length = 50)
	public String getTtleutu12moesmap() {
		return this.ttleutu12moesmap;
	}

	public void setTtleutu12moesmap(String ttleutu12moesmap) {
		this.ttleutu12moesmap = ttleutu12moesmap;
	}

	@Column(name = "TTLEUVL12MOESMA", length = 50)
	public String getTtleuvl12moesma() {
		return this.ttleuvl12moesma;
	}

	public void setTtleuvl12moesma(String ttleuvl12moesma) {
		this.ttleuvl12moesma = ttleuvl12moesma;
	}

	@Column(name = "TTLEUVL12MOESMACF", length = 50)
	public String getTtleuvl12moesmacf() {
		return this.ttleuvl12moesmacf;
	}

	public void setTtleuvl12moesmacf(String ttleuvl12moesmacf) {
		this.ttleuvl12moesmacf = ttleuvl12moesmacf;
	}

	@Column(name = "TTLEUVL12MOESMAP", length = 50)
	public String getTtleuvl12moesmap() {
		return this.ttleuvl12moesmap;
	}

	public void setTtleuvl12moesmap(String ttleuvl12moesmap) {
		this.ttleuvl12moesmap = ttleuvl12moesmap;
	}

	@Column(name = "UNDEEAELIG", length = 50)
	public String getUndeeaelig() {
		return this.undeeaelig;
	}

	public void setUndeeaelig(String undeeaelig) {
		this.undeeaelig = undeeaelig;
	}

	@Column(name = "UNDEEAELIGCF", length = 50)
	public String getUndeeaeligcf() {
		return this.undeeaeligcf;
	}

	public void setUndeeaeligcf(String undeeaeligcf) {
		this.undeeaeligcf = undeeaeligcf;
	}

	@Column(name = "UNDEEAELIGP", length = 50)
	public String getUndeeaeligp() {
		return this.undeeaeligp;
	}

	public void setUndeeaeligp(String undeeaeligp) {
		this.undeeaeligp = undeeaeligp;
	}

	@Column(name = "UNDISIN", length = 50)
	public String getUndisin() {
		return this.undisin;
	}

	public void setUndisin(String undisin) {
		this.undisin = undisin;
	}

	@Column(name = "UNDISINCF", length = 50)
	public String getUndisincf() {
		return this.undisincf;
	}

	public void setUndisincf(String undisincf) {
		this.undisincf = undisincf;
	}

	@Column(name = "UNDISINP", length = 50)
	public String getUndisinp() {
		return this.undisinp;
	}

	public void setUndisinp(String undisinp) {
		this.undisinp = undisinp;
	}

	@Column(name = "UNDISINESMA", length = 50)
	public String getUndisinesma() {
		return this.undisinesma;
	}

	public void setUndisinesma(String undisinesma) {
		this.undisinesma = undisinesma;
	}

	@Column(name = "UNDISINESMACF", length = 50)
	public String getUndisinesmacf() {
		return this.undisinesmacf;
	}

	public void setUndisinesmacf(String undisinesmacf) {
		this.undisinesmacf = undisinesmacf;
	}

	@Column(name = "UNDISINESMAP", length = 50)
	public String getUndisinesmap() {
		return this.undisinesmap;
	}

	public void setUndisinesmap(String undisinesmap) {
		this.undisinesmap = undisinesmap;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof XrefXxDspId))
			return false;
		XrefXxDspId castOther = (XrefXxDspId) other;

		return ((this.getAction() == castOther.getAction()) || (this.getAction() != null && castOther.getAction() != null && this.getAction().equals(castOther.getAction())))
				&& ((this.getLevelcode() == castOther.getLevelcode()) || (this.getLevelcode() != null && castOther.getLevelcode() != null && this.getLevelcode().equals(
						castOther.getLevelcode())))
				&& ((this.getIpc() == castOther.getIpc()) || (this.getIpc() != null && castOther.getIpc() != null && this.getIpc().equals(castOther.getIpc())))
				&& ((this.getQuoteid() == castOther.getQuoteid()) || (this.getQuoteid() != null && castOther.getQuoteid() != null && this.getQuoteid().equals(
						castOther.getQuoteid())))
				&& ((this.getRic() == castOther.getRic()) || (this.getRic() != null && castOther.getRic() != null && this.getRic().equals(castOther.getRic())))
				&& ((this.getSedol() == castOther.getSedol()) || (this.getSedol() != null && castOther.getSedol() != null && this.getSedol().equals(castOther.getSedol())))
				&& ((this.getIssuepermid() == castOther.getIssuepermid()) || (this.getIssuepermid() != null && castOther.getIssuepermid() != null && this.getIssuepermid().equals(
						castOther.getIssuepermid())))
				&& ((this.getAssetid() == castOther.getAssetid()) || (this.getAssetid() != null && castOther.getAssetid() != null && this.getAssetid().equals(
						castOther.getAssetid())))
				&& ((this.getPilc() == castOther.getPilc()) || (this.getPilc() != null && castOther.getPilc() != null && this.getPilc().equals(castOther.getPilc())))
				&& ((this.getCusip() == castOther.getCusip()) || (this.getCusip() != null && castOther.getCusip() != null && this.getCusip().equals(castOther.getCusip())))
				&& ((this.getOrgpermid() == castOther.getOrgpermid()) || (this.getOrgpermid() != null && castOther.getOrgpermid() != null && this.getOrgpermid().equals(
						castOther.getOrgpermid())))
				&& ((this.getAssetstatus() == castOther.getAssetstatus()) || (this.getAssetstatus() != null && castOther.getAssetstatus() != null && this.getAssetstatus().equals(
						castOther.getAssetstatus())))
				&& ((this.getAssetstatuscf() == castOther.getAssetstatuscf()) || (this.getAssetstatuscf() != null && castOther.getAssetstatuscf() != null && this
						.getAssetstatuscf().equals(castOther.getAssetstatuscf())))
				&& ((this.getAssetstatusp() == castOther.getAssetstatusp()) || (this.getAssetstatusp() != null && castOther.getAssetstatusp() != null && this.getAssetstatusp()
						.equals(castOther.getAssetstatusp())))
				&& ((this.getBasketundisinlist() == castOther.getBasketundisinlist()) || (this.getBasketundisinlist() != null && castOther.getBasketundisinlist() != null && this
						.getBasketundisinlist().equals(castOther.getBasketundisinlist())))
				&& ((this.getBasketundisinlistcf() == castOther.getBasketundisinlistcf()) || (this.getBasketundisinlistcf() != null && castOther.getBasketundisinlistcf() != null && this
						.getBasketundisinlistcf().equals(castOther.getBasketundisinlistcf())))
				&& ((this.getBasketundisinlistp() == castOther.getBasketundisinlistp()) || (this.getBasketundisinlistp() != null && castOther.getBasketundisinlistp() != null && this
						.getBasketundisinlistp().equals(castOther.getBasketundisinlistp())))
				&& ((this.getBasketwrrindicator() == castOther.getBasketwrrindicator()) || (this.getBasketwrrindicator() != null && castOther.getBasketwrrindicator() != null && this
						.getBasketwrrindicator().equals(castOther.getBasketwrrindicator())))
				&& ((this.getBasketwrrindicatorcf() == castOther.getBasketwrrindicatorcf()) || (this.getBasketwrrindicatorcf() != null
						&& castOther.getBasketwrrindicatorcf() != null && this.getBasketwrrindicatorcf().equals(castOther.getBasketwrrindicatorcf())))
				&& ((this.getBasketwrrindicatorp() == castOther.getBasketwrrindicatorp()) || (this.getBasketwrrindicatorp() != null && castOther.getBasketwrrindicatorp() != null && this
						.getBasketwrrindicatorp().equals(castOther.getBasketwrrindicatorp())))
				&& ((this.getCficode() == castOther.getCficode()) || (this.getCficode() != null && castOther.getCficode() != null && this.getCficode().equals(
						castOther.getCficode())))
				&& ((this.getCficodecf() == castOther.getCficodecf()) || (this.getCficodecf() != null && castOther.getCficodecf() != null && this.getCficodecf().equals(
						castOther.getCficodecf())))
				&& ((this.getCficodep() == castOther.getCficodep()) || (this.getCficodep() != null && castOther.getCficodep() != null && this.getCficodep().equals(
						castOther.getCficodep())))
				&& ((this.getCincode() == castOther.getCincode()) || (this.getCincode() != null && castOther.getCincode() != null && this.getCincode().equals(
						castOther.getCincode())))
				&& ((this.getCincodecf() == castOther.getCincodecf()) || (this.getCincodecf() != null && castOther.getCincodecf() != null && this.getCincodecf().equals(
						castOther.getCincodecf())))
				&& ((this.getCincodep() == castOther.getCincodep()) || (this.getCincodep() != null && castOther.getCincodep() != null && this.getCincodep().equals(
						castOther.getCincodep())))
				&& ((this.getComplegaldomicile() == castOther.getComplegaldomicile()) || (this.getComplegaldomicile() != null && castOther.getComplegaldomicile() != null && this
						.getComplegaldomicile().equals(castOther.getComplegaldomicile())))
				&& ((this.getComplegaldomicilecf() == castOther.getComplegaldomicilecf()) || (this.getComplegaldomicilecf() != null && castOther.getComplegaldomicilecf() != null && this
						.getComplegaldomicilecf().equals(castOther.getComplegaldomicilecf())))
				&& ((this.getComplegaldomicilep() == castOther.getComplegaldomicilep()) || (this.getComplegaldomicilep() != null && castOther.getComplegaldomicilep() != null && this
						.getComplegaldomicilep().equals(castOther.getComplegaldomicilep())))
				&& ((this.getCompshortname() == castOther.getCompshortname()) || (this.getCompshortname() != null && castOther.getCompshortname() != null && this
						.getCompshortname().equals(castOther.getCompshortname())))
				&& ((this.getCompshortnamecf() == castOther.getCompshortnamecf()) || (this.getCompshortnamecf() != null && castOther.getCompshortnamecf() != null && this
						.getCompshortnamecf().equals(castOther.getCompshortnamecf())))
				&& ((this.getCompshortnamep() == castOther.getCompshortnamep()) || (this.getCompshortnamep() != null && castOther.getCompshortnamep() != null && this
						.getCompshortnamep().equals(castOther.getCompshortnamep())))
				&& ((this.getDealstartdate() == castOther.getDealstartdate()) || (this.getDealstartdate() != null && castOther.getDealstartdate() != null && this
						.getDealstartdate().equals(castOther.getDealstartdate())))
				&& ((this.getDealstartdatecf() == castOther.getDealstartdatecf()) || (this.getDealstartdatecf() != null && castOther.getDealstartdatecf() != null && this
						.getDealstartdatecf().equals(castOther.getDealstartdatecf())))
				&& ((this.getDealstartdatep() == castOther.getDealstartdatep()) || (this.getDealstartdatep() != null && castOther.getDealstartdatep() != null && this
						.getDealstartdatep().equals(castOther.getDealstartdatep())))
				&& ((this.getEeavenueelflg() == castOther.getEeavenueelflg()) || (this.getEeavenueelflg() != null && castOther.getEeavenueelflg() != null && this
						.getEeavenueelflg().equals(castOther.getEeavenueelflg())))
				&& ((this.getEeavenueelflgcf() == castOther.getEeavenueelflgcf()) || (this.getEeavenueelflgcf() != null && castOther.getEeavenueelflgcf() != null && this
						.getEeavenueelflgcf().equals(castOther.getEeavenueelflgcf())))
				&& ((this.getEeavenueelflgp() == castOther.getEeavenueelflgp()) || (this.getEeavenueelflgp() != null && castOther.getEeavenueelflgp() != null && this
						.getEeavenueelflgp().equals(castOther.getEeavenueelflgp())))
				&& ((this.getFininsshname() == castOther.getFininsshname()) || (this.getFininsshname() != null && castOther.getFininsshname() != null && this.getFininsshname()
						.equals(castOther.getFininsshname())))
				&& ((this.getFininsshnamecf() == castOther.getFininsshnamecf()) || (this.getFininsshnamecf() != null && castOther.getFininsshnamecf() != null && this
						.getFininsshnamecf().equals(castOther.getFininsshnamecf())))
				&& ((this.getFininsshnamep() == castOther.getFininsshnamep()) || (this.getFininsshnamep() != null && castOther.getFininsshnamep() != null && this
						.getFininsshnamep().equals(castOther.getFininsshnamep())))
				&& ((this.getFininsshnameesma() == castOther.getFininsshnameesma()) || (this.getFininsshnameesma() != null && castOther.getFininsshnameesma() != null && this
						.getFininsshnameesma().equals(castOther.getFininsshnameesma())))
				&& ((this.getFininsshnameesmacf() == castOther.getFininsshnameesmacf()) || (this.getFininsshnameesmacf() != null && castOther.getFininsshnameesmacf() != null && this
						.getFininsshnameesmacf().equals(castOther.getFininsshnameesmacf())))
				&& ((this.getFininsshnameesmap() == castOther.getFininsshnameesmap()) || (this.getFininsshnameesmap() != null && castOther.getFininsshnameesmap() != null && this
						.getFininsshnameesmap().equals(castOther.getFininsshnameesmap())))
				&& ((this.getInesmafirds() == castOther.getInesmafirds()) || (this.getInesmafirds() != null && castOther.getInesmafirds() != null && this.getInesmafirds().equals(
						castOther.getInesmafirds())))
				&& ((this.getInesmafirdscf() == castOther.getInesmafirdscf()) || (this.getInesmafirdscf() != null && castOther.getInesmafirdscf() != null && this
						.getInesmafirdscf().equals(castOther.getInesmafirdscf())))
				&& ((this.getInesmafirdsp() == castOther.getInesmafirdsp()) || (this.getInesmafirdsp() != null && castOther.getInesmafirdsp() != null && this.getInesmafirdsp()
						.equals(castOther.getInesmafirdsp())))
				&& ((this.getInsclassesma() == castOther.getInsclassesma()) || (this.getInsclassesma() != null && castOther.getInsclassesma() != null && this.getInsclassesma()
						.equals(castOther.getInsclassesma())))
				&& ((this.getInsclassesmacf() == castOther.getInsclassesmacf()) || (this.getInsclassesmacf() != null && castOther.getInsclassesmacf() != null && this
						.getInsclassesmacf().equals(castOther.getInsclassesmacf())))
				&& ((this.getInsclassesmap() == castOther.getInsclassesmap()) || (this.getInsclassesmap() != null && castOther.getInsclassesmap() != null && this
						.getInsclassesmap().equals(castOther.getInsclassesmap())))
				&& ((this.getInsfullnameesma() == castOther.getInsfullnameesma()) || (this.getInsfullnameesma() != null && castOther.getInsfullnameesma() != null && this
						.getInsfullnameesma().equals(castOther.getInsfullnameesma())))
				&& ((this.getInsfullnameesmacf() == castOther.getInsfullnameesmacf()) || (this.getInsfullnameesmacf() != null && castOther.getInsfullnameesmacf() != null && this
						.getInsfullnameesmacf().equals(castOther.getInsfullnameesmacf())))
				&& ((this.getInsfullnameesmap() == castOther.getInsfullnameesmap()) || (this.getInsfullnameesmap() != null && castOther.getInsfullnameesmap() != null && this
						.getInsfullnameesmap().equals(castOther.getInsfullnameesmap())))
				&& ((this.getIsin() == castOther.getIsin()) || (this.getIsin() != null && castOther.getIsin() != null && this.getIsin().equals(castOther.getIsin())))
				&& ((this.getIsincf() == castOther.getIsincf()) || (this.getIsincf() != null && castOther.getIsincf() != null && this.getIsincf().equals(castOther.getIsincf())))
				&& ((this.getIsinp() == castOther.getIsinp()) || (this.getIsinp() != null && castOther.getIsinp() != null && this.getIsinp().equals(castOther.getIsinp())))
				&& ((this.getIssuedate() == castOther.getIssuedate()) || (this.getIssuedate() != null && castOther.getIssuedate() != null && this.getIssuedate().equals(
						castOther.getIssuedate())))
				&& ((this.getIssuedatecf() == castOther.getIssuedatecf()) || (this.getIssuedatecf() != null && castOther.getIssuedatecf() != null && this.getIssuedatecf().equals(
						castOther.getIssuedatecf())))
				&& ((this.getIssuedatep() == castOther.getIssuedatep()) || (this.getIssuedatep() != null && castOther.getIssuedatep() != null && this.getIssuedatep().equals(
						castOther.getIssuedatep())))
				&& ((this.getIssuerlei() == castOther.getIssuerlei()) || (this.getIssuerlei() != null && castOther.getIssuerlei() != null && this.getIssuerlei().equals(
						castOther.getIssuerlei())))
				&& ((this.getIssuerleicf() == castOther.getIssuerleicf()) || (this.getIssuerleicf() != null && castOther.getIssuerleicf() != null && this.getIssuerleicf().equals(
						castOther.getIssuerleicf())))
				&& ((this.getIssuerleip() == castOther.getIssuerleip()) || (this.getIssuerleip() != null && castOther.getIssuerleip() != null && this.getIssuerleip().equals(
						castOther.getIssuerleip())))
				&& ((this.getIssortrvenueleiesma() == castOther.getIssortrvenueleiesma()) || (this.getIssortrvenueleiesma() != null && castOther.getIssortrvenueleiesma() != null && this
						.getIssortrvenueleiesma().equals(castOther.getIssortrvenueleiesma())))
				&& ((this.getIssortrvenueleiesmacf() == castOther.getIssortrvenueleiesmacf()) || (this.getIssortrvenueleiesmacf() != null
						&& castOther.getIssortrvenueleiesmacf() != null && this.getIssortrvenueleiesmacf().equals(castOther.getIssortrvenueleiesmacf())))
				&& ((this.getIssortrvenueleiesmap() == castOther.getIssortrvenueleiesmap()) || (this.getIssortrvenueleiesmap() != null
						&& castOther.getIssortrvenueleiesmap() != null && this.getIssortrvenueleiesmap().equals(castOther.getIssortrvenueleiesmap())))
				&& ((this.getMrkattsrcpermid() == castOther.getMrkattsrcpermid()) || (this.getMrkattsrcpermid() != null && castOther.getMrkattsrcpermid() != null && this
						.getMrkattsrcpermid().equals(castOther.getMrkattsrcpermid())))
				&& ((this.getMrkattsrcpermidcf() == castOther.getMrkattsrcpermidcf()) || (this.getMrkattsrcpermidcf() != null && castOther.getMrkattsrcpermidcf() != null && this
						.getMrkattsrcpermidcf().equals(castOther.getMrkattsrcpermidcf())))
				&& ((this.getMrkattsrcpermidp() == castOther.getMrkattsrcpermidp()) || (this.getMrkattsrcpermidp() != null && castOther.getMrkattsrcpermidp() != null && this
						.getMrkattsrcpermidp().equals(castOther.getMrkattsrcpermidp())))
				&& ((this.getMarketmic() == castOther.getMarketmic()) || (this.getMarketmic() != null && castOther.getMarketmic() != null && this.getMarketmic().equals(
						castOther.getMarketmic())))
				&& ((this.getMarketmiccf() == castOther.getMarketmiccf()) || (this.getMarketmiccf() != null && castOther.getMarketmiccf() != null && this.getMarketmiccf().equals(
						castOther.getMarketmiccf())))
				&& ((this.getMarketmicp() == castOther.getMarketmicp()) || (this.getMarketmicp() != null && castOther.getMarketmicp() != null && this.getMarketmicp().equals(
						castOther.getMarketmicp())))
				&& ((this.getMaturitydate() == castOther.getMaturitydate()) || (this.getMaturitydate() != null && castOther.getMaturitydate() != null && this.getMaturitydate()
						.equals(castOther.getMaturitydate())))
				&& ((this.getMaturitydatecf() == castOther.getMaturitydatecf()) || (this.getMaturitydatecf() != null && castOther.getMaturitydatecf() != null && this
						.getMaturitydatecf().equals(castOther.getMaturitydatecf())))
				&& ((this.getMaturitydatep() == castOther.getMaturitydatep()) || (this.getMaturitydatep() != null && castOther.getMaturitydatep() != null && this
						.getMaturitydatep().equals(castOther.getMaturitydatep())))
				&& ((this.getMifidasclofun() == castOther.getMifidasclofun()) || (this.getMifidasclofun() != null && castOther.getMifidasclofun() != null && this
						.getMifidasclofun().equals(castOther.getMifidasclofun())))
				&& ((this.getMifidasclofuncf() == castOther.getMifidasclofuncf()) || (this.getMifidasclofuncf() != null && castOther.getMifidasclofuncf() != null && this
						.getMifidasclofuncf().equals(castOther.getMifidasclofuncf())))
				&& ((this.getMifidasclofunp() == castOther.getMifidasclofunp()) || (this.getMifidasclofunp() != null && castOther.getMifidasclofunp() != null && this
						.getMifidasclofunp().equals(castOther.getMifidasclofunp())))
				&& ((this.getMifidadnapinsesma() == castOther.getMifidadnapinsesma()) || (this.getMifidadnapinsesma() != null && castOther.getMifidadnapinsesma() != null && this
						.getMifidadnapinsesma().equals(castOther.getMifidadnapinsesma())))
				&& ((this.getMifidadnapinsesmacf() == castOther.getMifidadnapinsesmacf()) || (this.getMifidadnapinsesmacf() != null && castOther.getMifidadnapinsesmacf() != null && this
						.getMifidadnapinsesmacf().equals(castOther.getMifidadnapinsesmacf())))
				&& ((this.getMifidadnapinsesmap() == castOther.getMifidadnapinsesmap()) || (this.getMifidadnapinsesmap() != null && castOther.getMifidadnapinsesmap() != null && this
						.getMifidadnapinsesmap().equals(castOther.getMifidadnapinsesmap())))
				&& ((this.getMifidadnoftpinsesma() == castOther.getMifidadnoftpinsesma()) || (this.getMifidadnoftpinsesma() != null && castOther.getMifidadnoftpinsesma() != null && this
						.getMifidadnoftpinsesma().equals(castOther.getMifidadnoftpinsesma())))
				&& ((this.getMifidadnoftpinsesmacf() == castOther.getMifidadnoftpinsesmacf()) || (this.getMifidadnoftpinsesmacf() != null
						&& castOther.getMifidadnoftpinsesmacf() != null && this.getMifidadnoftpinsesmacf().equals(castOther.getMifidadnoftpinsesmacf())))
				&& ((this.getMifidadnoftpinsesmap() == castOther.getMifidadnoftpinsesmap()) || (this.getMifidadnoftpinsesmap() != null
						&& castOther.getMifidadnoftpinsesmap() != null && this.getMifidadnoftpinsesmap().equals(castOther.getMifidadnoftpinsesmap())))
				&& ((this.getMifidavdatuesma() == castOther.getMifidavdatuesma()) || (this.getMifidavdatuesma() != null && castOther.getMifidavdatuesma() != null && this
						.getMifidavdatuesma().equals(castOther.getMifidavdatuesma())))
				&& ((this.getMifidavdatuesmacf() == castOther.getMifidavdatuesmacf()) || (this.getMifidavdatuesmacf() != null && castOther.getMifidavdatuesmacf() != null && this
						.getMifidavdatuesmacf().equals(castOther.getMifidavdatuesmacf())))
				&& ((this.getMifidavdatuesmap() == castOther.getMifidavdatuesmap()) || (this.getMifidavdatuesmap() != null && castOther.getMifidavdatuesmap() != null && this
						.getMifidavdatuesmap().equals(castOther.getMifidavdatuesmap())))
				&& ((this.getMifidavdatucurcode() == castOther.getMifidavdatucurcode()) || (this.getMifidavdatucurcode() != null && castOther.getMifidavdatucurcode() != null && this
						.getMifidavdatucurcode().equals(castOther.getMifidavdatucurcode())))
				&& ((this.getMifidavdatucurcodecf() == castOther.getMifidavdatucurcodecf()) || (this.getMifidavdatucurcodecf() != null
						&& castOther.getMifidavdatucurcodecf() != null && this.getMifidavdatucurcodecf().equals(castOther.getMifidavdatucurcodecf())))
				&& ((this.getMifidavdatucurcodep() == castOther.getMifidavdatucurcodep()) || (this.getMifidavdatucurcodep() != null && castOther.getMifidavdatucurcodep() != null && this
						.getMifidavdatucurcodep().equals(castOther.getMifidavdatucurcodep())))
				&& ((this.getMifidavvaoftresma() == castOther.getMifidavvaoftresma()) || (this.getMifidavvaoftresma() != null && castOther.getMifidavvaoftresma() != null && this
						.getMifidavvaoftresma().equals(castOther.getMifidavvaoftresma())))
				&& ((this.getMifidavvaoftresmacf() == castOther.getMifidavvaoftresmacf()) || (this.getMifidavvaoftresmacf() != null && castOther.getMifidavvaoftresmacf() != null && this
						.getMifidavvaoftresmacf().equals(castOther.getMifidavvaoftresmacf())))
				&& ((this.getMifidavvaoftresmap() == castOther.getMifidavvaoftresmap()) || (this.getMifidavvaoftresmap() != null && castOther.getMifidavvaoftresmap() != null && this
						.getMifidavvaoftresmap().equals(castOther.getMifidavvaoftresmap())))
				&& ((this.getMifidavvaoftrcurcode() == castOther.getMifidavvaoftrcurcode()) || (this.getMifidavvaoftrcurcode() != null
						&& castOther.getMifidavvaoftrcurcode() != null && this.getMifidavvaoftrcurcode().equals(castOther.getMifidavvaoftrcurcode())))
				&& ((this.getMifidavvaoftrcurcodecf() == castOther.getMifidavvaoftrcurcodecf()) || (this.getMifidavvaoftrcurcodecf() != null
						&& castOther.getMifidavvaoftrcurcodecf() != null && this.getMifidavvaoftrcurcodecf().equals(castOther.getMifidavvaoftrcurcodecf())))
				&& ((this.getMifidavvaoftrcurcodep() == castOther.getMifidavvaoftrcurcodep()) || (this.getMifidavvaoftrcurcodep() != null
						&& castOther.getMifidavvaoftrcurcodep() != null && this.getMifidavvaoftrcurcodep().equals(castOther.getMifidavvaoftrcurcodep())))
				&& ((this.getMifidbaseprod() == castOther.getMifidbaseprod()) || (this.getMifidbaseprod() != null && castOther.getMifidbaseprod() != null && this
						.getMifidbaseprod().equals(castOther.getMifidbaseprod())))
				&& ((this.getMifidbaseprodcf() == castOther.getMifidbaseprodcf()) || (this.getMifidbaseprodcf() != null && castOther.getMifidbaseprodcf() != null && this
						.getMifidbaseprodcf().equals(castOther.getMifidbaseprodcf())))
				&& ((this.getMifidbaseprodp() == castOther.getMifidbaseprodp()) || (this.getMifidbaseprodp() != null && castOther.getMifidbaseprodp() != null && this
						.getMifidbaseprodp().equals(castOther.getMifidbaseprodp())))
				&& ((this.getMifidbaseprodesma() == castOther.getMifidbaseprodesma()) || (this.getMifidbaseprodesma() != null && castOther.getMifidbaseprodesma() != null && this
						.getMifidbaseprodesma().equals(castOther.getMifidbaseprodesma())))
				&& ((this.getMifidbaseprodesmacf() == castOther.getMifidbaseprodesmacf()) || (this.getMifidbaseprodesmacf() != null && castOther.getMifidbaseprodesmacf() != null && this
						.getMifidbaseprodesmacf().equals(castOther.getMifidbaseprodesmacf())))
				&& ((this.getMifidbaseprodesmap() == castOther.getMifidbaseprodesmap()) || (this.getMifidbaseprodesmap() != null && castOther.getMifidbaseprodesmap() != null && this
						.getMifidbaseprodesmap().equals(castOther.getMifidbaseprodesmap())))
				&& ((this.getMifidbondseni() == castOther.getMifidbondseni()) || (this.getMifidbondseni() != null && castOther.getMifidbondseni() != null && this
						.getMifidbondseni().equals(castOther.getMifidbondseni())))
				&& ((this.getMifidbondsenicf() == castOther.getMifidbondsenicf()) || (this.getMifidbondsenicf() != null && castOther.getMifidbondsenicf() != null && this
						.getMifidbondsenicf().equals(castOther.getMifidbondsenicf())))
				&& ((this.getMifidbondsenip() == castOther.getMifidbondsenip()) || (this.getMifidbondsenip() != null && castOther.getMifidbondsenip() != null && this
						.getMifidbondsenip().equals(castOther.getMifidbondsenip())))
				&& ((this.getMifidbondtype() == castOther.getMifidbondtype()) || (this.getMifidbondtype() != null && castOther.getMifidbondtype() != null && this
						.getMifidbondtype().equals(castOther.getMifidbondtype())))
				&& ((this.getMifidbondtypecf() == castOther.getMifidbondtypecf()) || (this.getMifidbondtypecf() != null && castOther.getMifidbondtypecf() != null && this
						.getMifidbondtypecf().equals(castOther.getMifidbondtypecf())))
				&& ((this.getMifidbondtypep() == castOther.getMifidbondtypep()) || (this.getMifidbondtypep() != null && castOther.getMifidbondtypep() != null && this
						.getMifidbondtypep().equals(castOther.getMifidbondtypep())))
				&& ((this.getMifidclobflag() == castOther.getMifidclobflag()) || (this.getMifidclobflag() != null && castOther.getMifidclobflag() != null && this
						.getMifidclobflag().equals(castOther.getMifidclobflag())))
				&& ((this.getMifidclobflagcf() == castOther.getMifidclobflagcf()) || (this.getMifidclobflagcf() != null && castOther.getMifidclobflagcf() != null && this
						.getMifidclobflagcf().equals(castOther.getMifidclobflagcf())))
				&& ((this.getMifidclobflagp() == castOther.getMifidclobflagp()) || (this.getMifidclobflagp() != null && castOther.getMifidclobflagp() != null && this
						.getMifidclobflagp().equals(castOther.getMifidclobflagp())))
				&& ((this.getMifidcofialiinfornewbo() == castOther.getMifidcofialiinfornewbo()) || (this.getMifidcofialiinfornewbo() != null
						&& castOther.getMifidcofialiinfornewbo() != null && this.getMifidcofialiinfornewbo().equals(castOther.getMifidcofialiinfornewbo())))
				&& ((this.getMifidcofialiinfornewbocf() == castOther.getMifidcofialiinfornewbocf()) || (this.getMifidcofialiinfornewbocf() != null
						&& castOther.getMifidcofialiinfornewbocf() != null && this.getMifidcofialiinfornewbocf().equals(castOther.getMifidcofialiinfornewbocf())))
				&& ((this.getMifidcofialiinfornewbop() == castOther.getMifidcofialiinfornewbop()) || (this.getMifidcofialiinfornewbop() != null
						&& castOther.getMifidcofialiinfornewbop() != null && this.getMifidcofialiinfornewbop().equals(castOther.getMifidcofialiinfornewbop())))
				&& ((this.getMifidcodein() == castOther.getMifidcodein()) || (this.getMifidcodein() != null && castOther.getMifidcodein() != null && this.getMifidcodein().equals(
						castOther.getMifidcodein())))
				&& ((this.getMifidcodeincf() == castOther.getMifidcodeincf()) || (this.getMifidcodeincf() != null && castOther.getMifidcodeincf() != null && this
						.getMifidcodeincf().equals(castOther.getMifidcodeincf())))
				&& ((this.getMifidcodeinp() == castOther.getMifidcodeinp()) || (this.getMifidcodeinp() != null && castOther.getMifidcodeinp() != null && this.getMifidcodeinp()
						.equals(castOther.getMifidcodeinp())))
				&& ((this.getMifidcodeinesma() == castOther.getMifidcodeinesma()) || (this.getMifidcodeinesma() != null && castOther.getMifidcodeinesma() != null && this
						.getMifidcodeinesma().equals(castOther.getMifidcodeinesma())))
				&& ((this.getMifidcodeinesmacf() == castOther.getMifidcodeinesmacf()) || (this.getMifidcodeinesmacf() != null && castOther.getMifidcodeinesmacf() != null && this
						.getMifidcodeinesmacf().equals(castOther.getMifidcodeinesmacf())))
				&& ((this.getMifidcodeinesmap() == castOther.getMifidcodeinesmap()) || (this.getMifidcodeinesmap() != null && castOther.getMifidcodeinesmap() != null && this
						.getMifidcodeinesmap().equals(castOther.getMifidcodeinesmap())))
				&& ((this.getMifidcoinflesma() == castOther.getMifidcoinflesma()) || (this.getMifidcoinflesma() != null && castOther.getMifidcoinflesma() != null && this
						.getMifidcoinflesma().equals(castOther.getMifidcoinflesma())))
				&& ((this.getMifidcoinflesmacf() == castOther.getMifidcoinflesmacf()) || (this.getMifidcoinflesmacf() != null && castOther.getMifidcoinflesmacf() != null && this
						.getMifidcoinflesmacf().equals(castOther.getMifidcoinflesmacf())))
				&& ((this.getMifidcoinflesmap() == castOther.getMifidcoinflesmap()) || (this.getMifidcoinflesmap() != null && castOther.getMifidcoinflesmap() != null && this
						.getMifidcoinflesmap().equals(castOther.getMifidcoinflesmap())))
				&& ((this.getMifidcoinre() == castOther.getMifidcoinre()) || (this.getMifidcoinre() != null && castOther.getMifidcoinre() != null && this.getMifidcoinre().equals(
						castOther.getMifidcoinre())))
				&& ((this.getMifidcoinrecf() == castOther.getMifidcoinrecf()) || (this.getMifidcoinrecf() != null && castOther.getMifidcoinrecf() != null && this
						.getMifidcoinrecf().equals(castOther.getMifidcoinrecf())))
				&& ((this.getMifidcoinrep() == castOther.getMifidcoinrep()) || (this.getMifidcoinrep() != null && castOther.getMifidcoinrep() != null && this.getMifidcoinrep()
						.equals(castOther.getMifidcoinrep())))
				&& ((this.getMifidcotype() == castOther.getMifidcotype()) || (this.getMifidcotype() != null && castOther.getMifidcotype() != null && this.getMifidcotype().equals(
						castOther.getMifidcotype())))
				&& ((this.getMifidcotypecf() == castOther.getMifidcotypecf()) || (this.getMifidcotypecf() != null && castOther.getMifidcotypecf() != null && this
						.getMifidcotypecf().equals(castOther.getMifidcotypecf())))
				&& ((this.getMifidcotypep() == castOther.getMifidcotypep()) || (this.getMifidcotypep() != null && castOther.getMifidcotypep() != null && this.getMifidcotypep()
						.equals(castOther.getMifidcotypep())))
				&& ((this.getMifiddeltypeesma() == castOther.getMifiddeltypeesma()) || (this.getMifiddeltypeesma() != null && castOther.getMifiddeltypeesma() != null && this
						.getMifiddeltypeesma().equals(castOther.getMifiddeltypeesma())))
				&& ((this.getMifiddeltypeesmacf() == castOther.getMifiddeltypeesmacf()) || (this.getMifiddeltypeesmacf() != null && castOther.getMifiddeltypeesmacf() != null && this
						.getMifiddeltypeesmacf().equals(castOther.getMifiddeltypeesmacf())))
				&& ((this.getMifiddeltypeesmap() == castOther.getMifiddeltypeesmap()) || (this.getMifiddeltypeesmap() != null && castOther.getMifiddeltypeesmap() != null && this
						.getMifiddeltypeesmap().equals(castOther.getMifiddeltypeesmap())))
				&& ((this.getMifidemalsubtype() == castOther.getMifidemalsubtype()) || (this.getMifidemalsubtype() != null && castOther.getMifidemalsubtype() != null && this
						.getMifidemalsubtype().equals(castOther.getMifidemalsubtype())))
				&& ((this.getMifidemalsubtypecf() == castOther.getMifidemalsubtypecf()) || (this.getMifidemalsubtypecf() != null && castOther.getMifidemalsubtypecf() != null && this
						.getMifidemalsubtypecf().equals(castOther.getMifidemalsubtypecf())))
				&& ((this.getMifidemalsubtypep() == castOther.getMifidemalsubtypep()) || (this.getMifidemalsubtypep() != null && castOther.getMifidemalsubtypep() != null && this
						.getMifidemalsubtypep().equals(castOther.getMifidemalsubtypep())))
				&& ((this.getMifidexerstyle() == castOther.getMifidexerstyle()) || (this.getMifidexerstyle() != null && castOther.getMifidexerstyle() != null && this
						.getMifidexerstyle().equals(castOther.getMifidexerstyle())))
				&& ((this.getMifidexerstylecf() == castOther.getMifidexerstylecf()) || (this.getMifidexerstylecf() != null && castOther.getMifidexerstylecf() != null && this
						.getMifidexerstylecf().equals(castOther.getMifidexerstylecf())))
				&& ((this.getMifidexerstylep() == castOther.getMifidexerstylep()) || (this.getMifidexerstylep() != null && castOther.getMifidexerstylep() != null && this
						.getMifidexerstylep().equals(castOther.getMifidexerstylep())))
				&& ((this.getMifidexerstyleesma() == castOther.getMifidexerstyleesma()) || (this.getMifidexerstyleesma() != null && castOther.getMifidexerstyleesma() != null && this
						.getMifidexerstyleesma().equals(castOther.getMifidexerstyleesma())))
				&& ((this.getMifidexerstyleesmacf() == castOther.getMifidexerstyleesmacf()) || (this.getMifidexerstyleesmacf() != null
						&& castOther.getMifidexerstyleesmacf() != null && this.getMifidexerstyleesmacf().equals(castOther.getMifidexerstyleesmacf())))
				&& ((this.getMifidexerstyleesmap() == castOther.getMifidexerstyleesmap()) || (this.getMifidexerstyleesmap() != null && castOther.getMifidexerstyleesmap() != null && this
						.getMifidexerstyleesmap().equals(castOther.getMifidexerstyleesmap())))
				&& ((this.getMifidexpdateesma() == castOther.getMifidexpdateesma()) || (this.getMifidexpdateesma() != null && castOther.getMifidexpdateesma() != null && this
						.getMifidexpdateesma().equals(castOther.getMifidexpdateesma())))
				&& ((this.getMifidexpdateesmacf() == castOther.getMifidexpdateesmacf()) || (this.getMifidexpdateesmacf() != null && castOther.getMifidexpdateesmacf() != null && this
						.getMifidexpdateesmacf().equals(castOther.getMifidexpdateesmacf())))
				&& ((this.getMifidexpdateesmap() == castOther.getMifidexpdateesmap()) || (this.getMifidexpdateesmap() != null && castOther.getMifidexpdateesmap() != null && this
						.getMifidexpdateesmap().equals(castOther.getMifidexpdateesmap())))
				&& ((this.getMifidfiprtype() == castOther.getMifidfiprtype()) || (this.getMifidfiprtype() != null && castOther.getMifidfiprtype() != null && this
						.getMifidfiprtype().equals(castOther.getMifidfiprtype())))
				&& ((this.getMifidfiprtypecf() == castOther.getMifidfiprtypecf()) || (this.getMifidfiprtypecf() != null && castOther.getMifidfiprtypecf() != null && this
						.getMifidfiprtypecf().equals(castOther.getMifidfiprtypecf())))
				&& ((this.getMifidfiprtypep() == castOther.getMifidfiprtypep()) || (this.getMifidfiprtypep() != null && castOther.getMifidfiprtypep() != null && this
						.getMifidfiprtypep().equals(castOther.getMifidfiprtypep())))
				&& ((this.getMifidfiprtypeesma() == castOther.getMifidfiprtypeesma()) || (this.getMifidfiprtypeesma() != null && castOther.getMifidfiprtypeesma() != null && this
						.getMifidfiprtypeesma().equals(castOther.getMifidfiprtypeesma())))
				&& ((this.getMifidfiprtypeesmacf() == castOther.getMifidfiprtypeesmacf()) || (this.getMifidfiprtypeesmacf() != null && castOther.getMifidfiprtypeesmacf() != null && this
						.getMifidfiprtypeesmacf().equals(castOther.getMifidfiprtypeesmacf())))
				&& ((this.getMifidfiprtypeesmap() == castOther.getMifidfiprtypeesmap()) || (this.getMifidfiprtypeesmap() != null && castOther.getMifidfiprtypeesmap() != null && this
						.getMifidfiprtypeesmap().equals(castOther.getMifidfiprtypeesmap())))
				&& ((this.getMifidfrtradedate() == castOther.getMifidfrtradedate()) || (this.getMifidfrtradedate() != null && castOther.getMifidfrtradedate() != null && this
						.getMifidfrtradedate().equals(castOther.getMifidfrtradedate())))
				&& ((this.getMifidfrtradedatecf() == castOther.getMifidfrtradedatecf()) || (this.getMifidfrtradedatecf() != null && castOther.getMifidfrtradedatecf() != null && this
						.getMifidfrtradedatecf().equals(castOther.getMifidfrtradedatecf())))
				&& ((this.getMifidfrtradedatep() == castOther.getMifidfrtradedatep()) || (this.getMifidfrtradedatep() != null && castOther.getMifidfrtradedatep() != null && this
						.getMifidfrtradedatep().equals(castOther.getMifidfrtradedatep())))
				&& ((this.getMifidfrtradedateesma() == castOther.getMifidfrtradedateesma()) || (this.getMifidfrtradedateesma() != null
						&& castOther.getMifidfrtradedateesma() != null && this.getMifidfrtradedateesma().equals(castOther.getMifidfrtradedateesma())))
				&& ((this.getMifidfrtradedateesmacf() == castOther.getMifidfrtradedateesmacf()) || (this.getMifidfrtradedateesmacf() != null
						&& castOther.getMifidfrtradedateesmacf() != null && this.getMifidfrtradedateesmacf().equals(castOther.getMifidfrtradedateesmacf())))
				&& ((this.getMifidfrtradedateesmap() == castOther.getMifidfrtradedateesmap()) || (this.getMifidfrtradedateesmap() != null
						&& castOther.getMifidfrtradedateesmap() != null && this.getMifidfrtradedateesmap().equals(castOther.getMifidfrtradedateesmap())))
				&& ((this.getMifidflag() == castOther.getMifidflag()) || (this.getMifidflag() != null && castOther.getMifidflag() != null && this.getMifidflag().equals(
						castOther.getMifidflag())))
				&& ((this.getMifidflagcf() == castOther.getMifidflagcf()) || (this.getMifidflagcf() != null && castOther.getMifidflagcf() != null && this.getMifidflagcf().equals(
						castOther.getMifidflagcf())))
				&& ((this.getMifidflagp() == castOther.getMifidflagp()) || (this.getMifidflagp() != null && castOther.getMifidflagp() != null && this.getMifidflagp().equals(
						castOther.getMifidflagp())))
				&& ((this.getMifidfrfloatesma() == castOther.getMifidfrfloatesma()) || (this.getMifidfrfloatesma() != null && castOther.getMifidfrfloatesma() != null && this
						.getMifidfrfloatesma().equals(castOther.getMifidfrfloatesma())))
				&& ((this.getMifidfrfloatesmacf() == castOther.getMifidfrfloatesmacf()) || (this.getMifidfrfloatesmacf() != null && castOther.getMifidfrfloatesmacf() != null && this
						.getMifidfrfloatesmacf().equals(castOther.getMifidfrfloatesmacf())))
				&& ((this.getMifidfrfloatesmap() == castOther.getMifidfrfloatesmap()) || (this.getMifidfrfloatesmap() != null && castOther.getMifidfrfloatesmap() != null && this
						.getMifidfrfloatesmap().equals(castOther.getMifidfrfloatesmap())))
				&& ((this.getMifidfrfloatcurcode() == castOther.getMifidfrfloatcurcode()) || (this.getMifidfrfloatcurcode() != null && castOther.getMifidfrfloatcurcode() != null && this
						.getMifidfrfloatcurcode().equals(castOther.getMifidfrfloatcurcode())))
				&& ((this.getMifidfrfloatcurcodecf() == castOther.getMifidfrfloatcurcodecf()) || (this.getMifidfrfloatcurcodecf() != null
						&& castOther.getMifidfrfloatcurcodecf() != null && this.getMifidfrfloatcurcodecf().equals(castOther.getMifidfrfloatcurcodecf())))
				&& ((this.getMifidfrfloatcurcodep() == castOther.getMifidfrfloatcurcodep()) || (this.getMifidfrfloatcurcodep() != null
						&& castOther.getMifidfrfloatcurcodep() != null && this.getMifidfrfloatcurcodep().equals(castOther.getMifidfrfloatcurcodep())))
				&& ((this.getMifidfusubpr() == castOther.getMifidfusubpr()) || (this.getMifidfusubpr() != null && castOther.getMifidfusubpr() != null && this.getMifidfusubpr()
						.equals(castOther.getMifidfusubpr())))
				&& ((this.getMifidfusubprcf() == castOther.getMifidfusubprcf()) || (this.getMifidfusubprcf() != null && castOther.getMifidfusubprcf() != null && this
						.getMifidfusubprcf().equals(castOther.getMifidfusubprcf())))
				&& ((this.getMifidfusubprp() == castOther.getMifidfusubprp()) || (this.getMifidfusubprp() != null && castOther.getMifidfusubprp() != null && this
						.getMifidfusubprp().equals(castOther.getMifidfusubprp())))
				&& ((this.getMifidfusubpresma() == castOther.getMifidfusubpresma()) || (this.getMifidfusubpresma() != null && castOther.getMifidfusubpresma() != null && this
						.getMifidfusubpresma().equals(castOther.getMifidfusubpresma())))
				&& ((this.getMifidfusubpresmacf() == castOther.getMifidfusubpresmacf()) || (this.getMifidfusubpresmacf() != null && castOther.getMifidfusubpresmacf() != null && this
						.getMifidfusubpresmacf().equals(castOther.getMifidfusubpresmacf())))
				&& ((this.getMifidfusubpresmap() == castOther.getMifidfusubpresmap()) || (this.getMifidfusubpresmap() != null && castOther.getMifidfusubpresmap() != null && this
						.getMifidfusubpresmap().equals(castOther.getMifidfusubpresmap())))
				&& ((this.getMifidissdateesma() == castOther.getMifidissdateesma()) || (this.getMifidissdateesma() != null && castOther.getMifidissdateesma() != null && this
						.getMifidissdateesma().equals(castOther.getMifidissdateesma())))
				&& ((this.getMifidissdateesmacf() == castOther.getMifidissdateesmacf()) || (this.getMifidissdateesmacf() != null && castOther.getMifidissdateesmacf() != null && this
						.getMifidissdateesmacf().equals(castOther.getMifidissdateesmacf())))
				&& ((this.getMifidissdateesmap() == castOther.getMifidissdateesmap()) || (this.getMifidissdateesmap() != null && castOther.getMifidissdateesmap() != null && this
						.getMifidissdateesmap().equals(castOther.getMifidissdateesmap())))
				&& ((this.getMifidisssizeesma() == castOther.getMifidisssizeesma()) || (this.getMifidisssizeesma() != null && castOther.getMifidisssizeesma() != null && this
						.getMifidisssizeesma().equals(castOther.getMifidisssizeesma())))
				&& ((this.getMifidisssizeesmacf() == castOther.getMifidisssizeesmacf()) || (this.getMifidisssizeesmacf() != null && castOther.getMifidisssizeesmacf() != null && this
						.getMifidisssizeesmacf().equals(castOther.getMifidisssizeesmacf())))
				&& ((this.getMifidisssizeesmap() == castOther.getMifidisssizeesmap()) || (this.getMifidisssizeesmap() != null && castOther.getMifidisssizeesmap() != null && this
						.getMifidisssizeesmap().equals(castOther.getMifidisssizeesmap())))
				&& ((this.getMifidmatdate() == castOther.getMifidmatdate()) || (this.getMifidmatdate() != null && castOther.getMifidmatdate() != null && this.getMifidmatdate()
						.equals(castOther.getMifidmatdate())))
				&& ((this.getMifidmatdatecf() == castOther.getMifidmatdatecf()) || (this.getMifidmatdatecf() != null && castOther.getMifidmatdatecf() != null && this
						.getMifidmatdatecf().equals(castOther.getMifidmatdatecf())))
				&& ((this.getMifidmatdatep() == castOther.getMifidmatdatep()) || (this.getMifidmatdatep() != null && castOther.getMifidmatdatep() != null && this
						.getMifidmatdatep().equals(castOther.getMifidmatdatep())))
				&& ((this.getMifidmatdateesma() == castOther.getMifidmatdateesma()) || (this.getMifidmatdateesma() != null && castOther.getMifidmatdateesma() != null && this
						.getMifidmatdateesma().equals(castOther.getMifidmatdateesma())))
				&& ((this.getMifidmatdateesmacf() == castOther.getMifidmatdateesmacf()) || (this.getMifidmatdateesmacf() != null && castOther.getMifidmatdateesmacf() != null && this
						.getMifidmatdateesmacf().equals(castOther.getMifidmatdateesmacf())))
				&& ((this.getMifidmatdateesmap() == castOther.getMifidmatdateesmap()) || (this.getMifidmatdateesmap() != null && castOther.getMifidmatdateesmap() != null && this
						.getMifidmatdateesmap().equals(castOther.getMifidmatdateesmap())))
				&& ((this.getMifidmostremaesma() == castOther.getMifidmostremaesma()) || (this.getMifidmostremaesma() != null && castOther.getMifidmostremaesma() != null && this
						.getMifidmostremaesma().equals(castOther.getMifidmostremaesma())))
				&& ((this.getMifidmostremaesmacf() == castOther.getMifidmostremaesmacf()) || (this.getMifidmostremaesmacf() != null && castOther.getMifidmostremaesmacf() != null && this
						.getMifidmostremaesmacf().equals(castOther.getMifidmostremaesmacf())))
				&& ((this.getMifidmostremaesmap() == castOther.getMifidmostremaesmap()) || (this.getMifidmostremaesmap() != null && castOther.getMifidmostremaesmap() != null && this
						.getMifidmostremaesmap().equals(castOther.getMifidmostremaesmap())))
				&& ((this.getMifidoptype() == castOther.getMifidoptype()) || (this.getMifidoptype() != null && castOther.getMifidoptype() != null && this.getMifidoptype().equals(
						castOther.getMifidoptype())))
				&& ((this.getMifidoptypecf() == castOther.getMifidoptypecf()) || (this.getMifidoptypecf() != null && castOther.getMifidoptypecf() != null && this
						.getMifidoptypecf().equals(castOther.getMifidoptypecf())))
				&& ((this.getMifidoptypep() == castOther.getMifidoptypep()) || (this.getMifidoptypep() != null && castOther.getMifidoptypep() != null && this.getMifidoptypep()
						.equals(castOther.getMifidoptypep())))
				&& ((this.getMifidoptypeesma() == castOther.getMifidoptypeesma()) || (this.getMifidoptypeesma() != null && castOther.getMifidoptypeesma() != null && this
						.getMifidoptypeesma().equals(castOther.getMifidoptypeesma())))
				&& ((this.getMifidoptypeesmacf() == castOther.getMifidoptypeesmacf()) || (this.getMifidoptypeesmacf() != null && castOther.getMifidoptypeesmacf() != null && this
						.getMifidoptypeesmacf().equals(castOther.getMifidoptypeesmacf())))
				&& ((this.getMifidoptypeesmap() == castOther.getMifidoptypeesmap()) || (this.getMifidoptypeesmap() != null && castOther.getMifidoptypeesmap() != null && this
						.getMifidoptypeesmap().equals(castOther.getMifidoptypeesmap())))
				&& ((this.getMifidptuw12esma() == castOther.getMifidptuw12esma()) || (this.getMifidptuw12esma() != null && castOther.getMifidptuw12esma() != null && this
						.getMifidptuw12esma().equals(castOther.getMifidptuw12esma())))
				&& ((this.getMifidptuw12esmacf() == castOther.getMifidptuw12esmacf()) || (this.getMifidptuw12esmacf() != null && castOther.getMifidptuw12esmacf() != null && this
						.getMifidptuw12esmacf().equals(castOther.getMifidptuw12esmacf())))
				&& ((this.getMifidptuw12esmap() == castOther.getMifidptuw12esmap()) || (this.getMifidptuw12esmap() != null && castOther.getMifidptuw12esmap() != null && this
						.getMifidptuw12esmap().equals(castOther.getMifidptuw12esmap())))
				&& ((this.getMifidptuwptv12mesma() == castOther.getMifidptuwptv12mesma()) || (this.getMifidptuwptv12mesma() != null && castOther.getMifidptuwptv12mesma() != null && this
						.getMifidptuwptv12mesma().equals(castOther.getMifidptuwptv12mesma())))
				&& ((this.getMifidptuwptv12mesmacf() == castOther.getMifidptuwptv12mesmacf()) || (this.getMifidptuwptv12mesmacf() != null
						&& castOther.getMifidptuwptv12mesmacf() != null && this.getMifidptuwptv12mesmacf().equals(castOther.getMifidptuwptv12mesmacf())))
				&& ((this.getMifidptuwptv12mesmap() == castOther.getMifidptuwptv12mesmap()) || (this.getMifidptuwptv12mesmap() != null
						&& castOther.getMifidptuwptv12mesmap() != null && this.getMifidptuwptv12mesmap().equals(castOther.getMifidptuwptv12mesmap())))
				&& ((this.getMifidpotrlisthfl() == castOther.getMifidpotrlisthfl()) || (this.getMifidpotrlisthfl() != null && castOther.getMifidpotrlisthfl() != null && this
						.getMifidpotrlisthfl().equals(castOther.getMifidpotrlisthfl())))
				&& ((this.getMifidpotrlisthflcf() == castOther.getMifidpotrlisthflcf()) || (this.getMifidpotrlisthflcf() != null && castOther.getMifidpotrlisthflcf() != null && this
						.getMifidpotrlisthflcf().equals(castOther.getMifidpotrlisthflcf())))
				&& ((this.getMifidpotrlisthflp() == castOther.getMifidpotrlisthflp()) || (this.getMifidpotrlisthflp() != null && castOther.getMifidpotrlisthflp() != null && this
						.getMifidpotrlisthflp().equals(castOther.getMifidpotrlisthflp())))
				&& ((this.getMifidpotrlisthvl() == castOther.getMifidpotrlisthvl()) || (this.getMifidpotrlisthvl() != null && castOther.getMifidpotrlisthvl() != null && this
						.getMifidpotrlisthvl().equals(castOther.getMifidpotrlisthvl())))
				&& ((this.getMifidpotrlisthvlcf() == castOther.getMifidpotrlisthvlcf()) || (this.getMifidpotrlisthvlcf() != null && castOther.getMifidpotrlisthvlcf() != null && this
						.getMifidpotrlisthvlcf().equals(castOther.getMifidpotrlisthvlcf())))
				&& ((this.getMifidpotrlisthvlp() == castOther.getMifidpotrlisthvlp()) || (this.getMifidpotrlisthvlp() != null && castOther.getMifidpotrlisthvlp() != null && this
						.getMifidpotrlisthvlp().equals(castOther.getMifidpotrlisthvlp())))
				&& ((this.getMifidpotrlistrper() == castOther.getMifidpotrlistrper()) || (this.getMifidpotrlistrper() != null && castOther.getMifidpotrlistrper() != null && this
						.getMifidpotrlistrper().equals(castOther.getMifidpotrlistrper())))
				&& ((this.getMifidpotrlistrpercf() == castOther.getMifidpotrlistrpercf()) || (this.getMifidpotrlistrpercf() != null && castOther.getMifidpotrlistrpercf() != null && this
						.getMifidpotrlistrpercf().equals(castOther.getMifidpotrlistrpercf())))
				&& ((this.getMifidpotrlistrperp() == castOther.getMifidpotrlistrperp()) || (this.getMifidpotrlistrperp() != null && castOther.getMifidpotrlistrperp() != null && this
						.getMifidpotrlistrperp().equals(castOther.getMifidpotrlistrperp())))
				&& ((this.getMifidpotrlisvoper() == castOther.getMifidpotrlisvoper()) || (this.getMifidpotrlisvoper() != null && castOther.getMifidpotrlisvoper() != null && this
						.getMifidpotrlisvoper().equals(castOther.getMifidpotrlisvoper())))
				&& ((this.getMifidpotrlisvopercf() == castOther.getMifidpotrlisvopercf()) || (this.getMifidpotrlisvopercf() != null && castOther.getMifidpotrlisvopercf() != null && this
						.getMifidpotrlisvopercf().equals(castOther.getMifidpotrlisvopercf())))
				&& ((this.getMifidpotrlisvoperp() == castOther.getMifidpotrlisvoperp()) || (this.getMifidpotrlisvoperp() != null && castOther.getMifidpotrlisvoperp() != null && this
						.getMifidpotrlisvoperp().equals(castOther.getMifidpotrlisvoperp())))
				&& ((this.getMifidpotrsstithfl() == castOther.getMifidpotrsstithfl()) || (this.getMifidpotrsstithfl() != null && castOther.getMifidpotrsstithfl() != null && this
						.getMifidpotrsstithfl().equals(castOther.getMifidpotrsstithfl())))
				&& ((this.getMifidpotrsstithflcf() == castOther.getMifidpotrsstithflcf()) || (this.getMifidpotrsstithflcf() != null && castOther.getMifidpotrsstithflcf() != null && this
						.getMifidpotrsstithflcf().equals(castOther.getMifidpotrsstithflcf())))
				&& ((this.getMifidpotrsstithflp() == castOther.getMifidpotrsstithflp()) || (this.getMifidpotrsstithflp() != null && castOther.getMifidpotrsstithflp() != null && this
						.getMifidpotrsstithflp().equals(castOther.getMifidpotrsstithflp())))
				&& ((this.getMifidpotrsstithvl() == castOther.getMifidpotrsstithvl()) || (this.getMifidpotrsstithvl() != null && castOther.getMifidpotrsstithvl() != null && this
						.getMifidpotrsstithvl().equals(castOther.getMifidpotrsstithvl())))
				&& ((this.getMifidpotrsstithvlcf() == castOther.getMifidpotrsstithvlcf()) || (this.getMifidpotrsstithvlcf() != null && castOther.getMifidpotrsstithvlcf() != null && this
						.getMifidpotrsstithvlcf().equals(castOther.getMifidpotrsstithvlcf())))
				&& ((this.getMifidpotrsstithvlp() == castOther.getMifidpotrsstithvlp()) || (this.getMifidpotrsstithvlp() != null && castOther.getMifidpotrsstithvlp() != null && this
						.getMifidpotrsstithvlp().equals(castOther.getMifidpotrsstithvlp())))
				&& ((this.getMifidpotrsstitrper() == castOther.getMifidpotrsstitrper()) || (this.getMifidpotrsstitrper() != null && castOther.getMifidpotrsstitrper() != null && this
						.getMifidpotrsstitrper().equals(castOther.getMifidpotrsstitrper())))
				&& ((this.getMifidpotrsstitrpercf() == castOther.getMifidpotrsstitrpercf()) || (this.getMifidpotrsstitrpercf() != null
						&& castOther.getMifidpotrsstitrpercf() != null && this.getMifidpotrsstitrpercf().equals(castOther.getMifidpotrsstitrpercf())))
				&& ((this.getMifidpotrsstitrperp() == castOther.getMifidpotrsstitrperp()) || (this.getMifidpotrsstitrperp() != null && castOther.getMifidpotrsstitrperp() != null && this
						.getMifidpotrsstitrperp().equals(castOther.getMifidpotrsstitrperp())))
				&& ((this.getMifidpotrsstivoper() == castOther.getMifidpotrsstivoper()) || (this.getMifidpotrsstivoper() != null && castOther.getMifidpotrsstivoper() != null && this
						.getMifidpotrsstivoper().equals(castOther.getMifidpotrsstivoper())))
				&& ((this.getMifidpotrsstivopercf() == castOther.getMifidpotrsstivopercf()) || (this.getMifidpotrsstivopercf() != null
						&& castOther.getMifidpotrsstivopercf() != null && this.getMifidpotrsstivopercf().equals(castOther.getMifidpotrsstivopercf())))
				&& ((this.getMifidpotrsstivoperp() == castOther.getMifidpotrsstivoperp()) || (this.getMifidpotrsstivoperp() != null && castOther.getMifidpotrsstivoperp() != null && this
						.getMifidpotrsstivoperp().equals(castOther.getMifidpotrsstivoperp())))
				&& ((this.getMifidpretrlisthfl() == castOther.getMifidpretrlisthfl()) || (this.getMifidpretrlisthfl() != null && castOther.getMifidpretrlisthfl() != null && this
						.getMifidpretrlisthfl().equals(castOther.getMifidpretrlisthfl())))
				&& ((this.getMifidpretrlisthflcf() == castOther.getMifidpretrlisthflcf()) || (this.getMifidpretrlisthflcf() != null && castOther.getMifidpretrlisthflcf() != null && this
						.getMifidpretrlisthflcf().equals(castOther.getMifidpretrlisthflcf())))
				&& ((this.getMifidpretrlisthflp() == castOther.getMifidpretrlisthflp()) || (this.getMifidpretrlisthflp() != null && castOther.getMifidpretrlisthflp() != null && this
						.getMifidpretrlisthflp().equals(castOther.getMifidpretrlisthflp())))
				&& ((this.getMifidpretrlisthvl() == castOther.getMifidpretrlisthvl()) || (this.getMifidpretrlisthvl() != null && castOther.getMifidpretrlisthvl() != null && this
						.getMifidpretrlisthvl().equals(castOther.getMifidpretrlisthvl())))
				&& ((this.getMifidpretrlisthvlcf() == castOther.getMifidpretrlisthvlcf()) || (this.getMifidpretrlisthvlcf() != null && castOther.getMifidpretrlisthvlcf() != null && this
						.getMifidpretrlisthvlcf().equals(castOther.getMifidpretrlisthvlcf())))
				&& ((this.getMifidpretrlisthvlp() == castOther.getMifidpretrlisthvlp()) || (this.getMifidpretrlisthvlp() != null && castOther.getMifidpretrlisthvlp() != null && this
						.getMifidpretrlisthvlp().equals(castOther.getMifidpretrlisthvlp())))
				&& ((this.getMifidpretrlistrper() == castOther.getMifidpretrlistrper()) || (this.getMifidpretrlistrper() != null && castOther.getMifidpretrlistrper() != null && this
						.getMifidpretrlistrper().equals(castOther.getMifidpretrlistrper())))
				&& ((this.getMifidpretrlistrpercf() == castOther.getMifidpretrlistrpercf()) || (this.getMifidpretrlistrpercf() != null
						&& castOther.getMifidpretrlistrpercf() != null && this.getMifidpretrlistrpercf().equals(castOther.getMifidpretrlistrpercf())))
				&& ((this.getMifidpretrlistrperp() == castOther.getMifidpretrlistrperp()) || (this.getMifidpretrlistrperp() != null && castOther.getMifidpretrlistrperp() != null && this
						.getMifidpretrlistrperp().equals(castOther.getMifidpretrlistrperp())))
				&& ((this.getMifidpretrsstithfl() == castOther.getMifidpretrsstithfl()) || (this.getMifidpretrsstithfl() != null && castOther.getMifidpretrsstithfl() != null && this
						.getMifidpretrsstithfl().equals(castOther.getMifidpretrsstithfl())))
				&& ((this.getMifidpretrsstithflcf() == castOther.getMifidpretrsstithflcf()) || (this.getMifidpretrsstithflcf() != null
						&& castOther.getMifidpretrsstithflcf() != null && this.getMifidpretrsstithflcf().equals(castOther.getMifidpretrsstithflcf())))
				&& ((this.getMifidpretrsstithflp() == castOther.getMifidpretrsstithflp()) || (this.getMifidpretrsstithflp() != null && castOther.getMifidpretrsstithflp() != null && this
						.getMifidpretrsstithflp().equals(castOther.getMifidpretrsstithflp())))
				&& ((this.getMifidpretrsstithvl() == castOther.getMifidpretrsstithvl()) || (this.getMifidpretrsstithvl() != null && castOther.getMifidpretrsstithvl() != null && this
						.getMifidpretrsstithvl().equals(castOther.getMifidpretrsstithvl())))
				&& ((this.getMifidpretrsstithvlcf() == castOther.getMifidpretrsstithvlcf()) || (this.getMifidpretrsstithvlcf() != null
						&& castOther.getMifidpretrsstithvlcf() != null && this.getMifidpretrsstithvlcf().equals(castOther.getMifidpretrsstithvlcf())))
				&& ((this.getMifidpretrsstithvlp() == castOther.getMifidpretrsstithvlp()) || (this.getMifidpretrsstithvlp() != null && castOther.getMifidpretrsstithvlp() != null && this
						.getMifidpretrsstithvlp().equals(castOther.getMifidpretrsstithvlp())))
				&& ((this.getMifidpretrsstitrper() == castOther.getMifidpretrsstitrper()) || (this.getMifidpretrsstitrper() != null && castOther.getMifidpretrsstitrper() != null && this
						.getMifidpretrsstitrper().equals(castOther.getMifidpretrsstitrper())))
				&& ((this.getMifidpretrsstitrpercf() == castOther.getMifidpretrsstitrpercf()) || (this.getMifidpretrsstitrpercf() != null
						&& castOther.getMifidpretrsstitrpercf() != null && this.getMifidpretrsstitrpercf().equals(castOther.getMifidpretrsstitrpercf())))
				&& ((this.getMifidpretrsstitrperp() == castOther.getMifidpretrsstitrperp()) || (this.getMifidpretrsstitrperp() != null
						&& castOther.getMifidpretrsstitrperp() != null && this.getMifidpretrsstitrperp().equals(castOther.getMifidpretrsstitrperp())))
				&& ((this.getMifidregulatedesma() == castOther.getMifidregulatedesma()) || (this.getMifidregulatedesma() != null && castOther.getMifidregulatedesma() != null && this
						.getMifidregulatedesma().equals(castOther.getMifidregulatedesma())))
				&& ((this.getMifidregulatedesmacf() == castOther.getMifidregulatedesmacf()) || (this.getMifidregulatedesmacf() != null
						&& castOther.getMifidregulatedesmacf() != null && this.getMifidregulatedesmacf().equals(castOther.getMifidregulatedesmacf())))
				&& ((this.getMifidregulatedesmap() == castOther.getMifidregulatedesmap()) || (this.getMifidregulatedesmap() != null && castOther.getMifidregulatedesmap() != null && this
						.getMifidregulatedesmap().equals(castOther.getMifidregulatedesmap())))
				&& ((this.getMifidstmasizeesma() == castOther.getMifidstmasizeesma()) || (this.getMifidstmasizeesma() != null && castOther.getMifidstmasizeesma() != null && this
						.getMifidstmasizeesma().equals(castOther.getMifidstmasizeesma())))
				&& ((this.getMifidstmasizeesmacf() == castOther.getMifidstmasizeesmacf()) || (this.getMifidstmasizeesmacf() != null && castOther.getMifidstmasizeesmacf() != null && this
						.getMifidstmasizeesmacf().equals(castOther.getMifidstmasizeesmacf())))
				&& ((this.getMifidstmasizeesmap() == castOther.getMifidstmasizeesmap()) || (this.getMifidstmasizeesmap() != null && castOther.getMifidstmasizeesmap() != null && this
						.getMifidstmasizeesmap().equals(castOther.getMifidstmasizeesmap())))
				&& ((this.getMifidstmasizecurcode() == castOther.getMifidstmasizecurcode()) || (this.getMifidstmasizecurcode() != null
						&& castOther.getMifidstmasizecurcode() != null && this.getMifidstmasizecurcode().equals(castOther.getMifidstmasizecurcode())))
				&& ((this.getMifidstmasizecurcodecf() == castOther.getMifidstmasizecurcodecf()) || (this.getMifidstmasizecurcodecf() != null
						&& castOther.getMifidstmasizecurcodecf() != null && this.getMifidstmasizecurcodecf().equals(castOther.getMifidstmasizecurcodecf())))
				&& ((this.getMifidstmasizecurcodep() == castOther.getMifidstmasizecurcodep()) || (this.getMifidstmasizecurcodep() != null
						&& castOther.getMifidstmasizecurcodep() != null && this.getMifidstmasizecurcodep().equals(castOther.getMifidstmasizecurcodep())))
				&& ((this.getMifidsubprod() == castOther.getMifidsubprod()) || (this.getMifidsubprod() != null && castOther.getMifidsubprod() != null && this.getMifidsubprod()
						.equals(castOther.getMifidsubprod())))
				&& ((this.getMifidsubprodcf() == castOther.getMifidsubprodcf()) || (this.getMifidsubprodcf() != null && castOther.getMifidsubprodcf() != null && this
						.getMifidsubprodcf().equals(castOther.getMifidsubprodcf())))
				&& ((this.getMifidsubprodp() == castOther.getMifidsubprodp()) || (this.getMifidsubprodp() != null && castOther.getMifidsubprodp() != null && this
						.getMifidsubprodp().equals(castOther.getMifidsubprodp())))
				&& ((this.getMifidsubprodesma() == castOther.getMifidsubprodesma()) || (this.getMifidsubprodesma() != null && castOther.getMifidsubprodesma() != null && this
						.getMifidsubprodesma().equals(castOther.getMifidsubprodesma())))
				&& ((this.getMifidsubprodesmacf() == castOther.getMifidsubprodesmacf()) || (this.getMifidsubprodesmacf() != null && castOther.getMifidsubprodesmacf() != null && this
						.getMifidsubprodesmacf().equals(castOther.getMifidsubprodesmacf())))
				&& ((this.getMifidsubprodesmap() == castOther.getMifidsubprodesmap()) || (this.getMifidsubprodesmap() != null && castOther.getMifidsubprodesmap() != null && this
						.getMifidsubprodesmap().equals(castOther.getMifidsubprodesmap())))
				&& ((this.getMifidtermdate() == castOther.getMifidtermdate()) || (this.getMifidtermdate() != null && castOther.getMifidtermdate() != null && this
						.getMifidtermdate().equals(castOther.getMifidtermdate())))
				&& ((this.getMifidtermdatecf() == castOther.getMifidtermdatecf()) || (this.getMifidtermdatecf() != null && castOther.getMifidtermdatecf() != null && this
						.getMifidtermdatecf().equals(castOther.getMifidtermdatecf())))
				&& ((this.getMifidtermdatep() == castOther.getMifidtermdatep()) || (this.getMifidtermdatep() != null && castOther.getMifidtermdatep() != null && this
						.getMifidtermdatep().equals(castOther.getMifidtermdatep())))
				&& ((this.getMifidtermdateesma() == castOther.getMifidtermdateesma()) || (this.getMifidtermdateesma() != null && castOther.getMifidtermdateesma() != null && this
						.getMifidtermdateesma().equals(castOther.getMifidtermdateesma())))
				&& ((this.getMifidtermdateesmacf() == castOther.getMifidtermdateesmacf()) || (this.getMifidtermdateesmacf() != null && castOther.getMifidtermdateesmacf() != null && this
						.getMifidtermdateesmacf().equals(castOther.getMifidtermdateesmacf())))
				&& ((this.getMifidtermdateesmap() == castOther.getMifidtermdateesmap()) || (this.getMifidtermdateesmap() != null && castOther.getMifidtermdateesmap() != null && this
						.getMifidtermdateesmap().equals(castOther.getMifidtermdateesmap())))
				&& ((this.getMifidtrobflag() == castOther.getMifidtrobflag()) || (this.getMifidtrobflag() != null && castOther.getMifidtrobflag() != null && this
						.getMifidtrobflag().equals(castOther.getMifidtrobflag())))
				&& ((this.getMifidtrobflagcf() == castOther.getMifidtrobflagcf()) || (this.getMifidtrobflagcf() != null && castOther.getMifidtrobflagcf() != null && this
						.getMifidtrobflagcf().equals(castOther.getMifidtrobflagcf())))
				&& ((this.getMifidtrobflagp() == castOther.getMifidtrobflagp()) || (this.getMifidtrobflagp() != null && castOther.getMifidtrobflagp() != null && this
						.getMifidtrobflagp().equals(castOther.getMifidtrobflagp())))
				&& ((this.getMifidtradapdate() == castOther.getMifidtradapdate()) || (this.getMifidtradapdate() != null && castOther.getMifidtradapdate() != null && this
						.getMifidtradapdate().equals(castOther.getMifidtradapdate())))
				&& ((this.getMifidtradapdatecf() == castOther.getMifidtradapdatecf()) || (this.getMifidtradapdatecf() != null && castOther.getMifidtradapdatecf() != null && this
						.getMifidtradapdatecf().equals(castOther.getMifidtradapdatecf())))
				&& ((this.getMifidtradapdatep() == castOther.getMifidtradapdatep()) || (this.getMifidtradapdatep() != null && castOther.getMifidtradapdatep() != null && this
						.getMifidtradapdatep().equals(castOther.getMifidtradapdatep())))
				&& ((this.getMifidtradapdateesma() == castOther.getMifidtradapdateesma()) || (this.getMifidtradapdateesma() != null && castOther.getMifidtradapdateesma() != null && this
						.getMifidtradapdateesma().equals(castOther.getMifidtradapdateesma())))
				&& ((this.getMifidtradapdateesmacf() == castOther.getMifidtradapdateesmacf()) || (this.getMifidtradapdateesmacf() != null
						&& castOther.getMifidtradapdateesmacf() != null && this.getMifidtradapdateesmacf().equals(castOther.getMifidtradapdateesmacf())))
				&& ((this.getMifidtradapdateesmap() == castOther.getMifidtradapdateesmap()) || (this.getMifidtradapdateesmap() != null
						&& castOther.getMifidtradapdateesmap() != null && this.getMifidtradapdateesmap().equals(castOther.getMifidtradapdateesmap())))
				&& ((this.getMifidtradreqdate() == castOther.getMifidtradreqdate()) || (this.getMifidtradreqdate() != null && castOther.getMifidtradreqdate() != null && this
						.getMifidtradreqdate().equals(castOther.getMifidtradreqdate())))
				&& ((this.getMifidtradreqdatecf() == castOther.getMifidtradreqdatecf()) || (this.getMifidtradreqdatecf() != null && castOther.getMifidtradreqdatecf() != null && this
						.getMifidtradreqdatecf().equals(castOther.getMifidtradreqdatecf())))
				&& ((this.getMifidtradreqdatep() == castOther.getMifidtradreqdatep()) || (this.getMifidtradreqdatep() != null && castOther.getMifidtradreqdatep() != null && this
						.getMifidtradreqdatep().equals(castOther.getMifidtradreqdatep())))
				&& ((this.getMifidtradreqdateesma() == castOther.getMifidtradreqdateesma()) || (this.getMifidtradreqdateesma() != null
						&& castOther.getMifidtradreqdateesma() != null && this.getMifidtradreqdateesma().equals(castOther.getMifidtradreqdateesma())))
				&& ((this.getMifidtradreqdateesmacf() == castOther.getMifidtradreqdateesmacf()) || (this.getMifidtradreqdateesmacf() != null
						&& castOther.getMifidtradreqdateesmacf() != null && this.getMifidtradreqdateesmacf().equals(castOther.getMifidtradreqdateesmacf())))
				&& ((this.getMifidtradreqdateesmap() == castOther.getMifidtradreqdateesmap()) || (this.getMifidtradreqdateesmap() != null
						&& castOther.getMifidtradreqdateesmap() != null && this.getMifidtradreqdateesmap().equals(castOther.getMifidtradreqdateesmap())))
				&& ((this.getMifidtrtype() == castOther.getMifidtrtype()) || (this.getMifidtrtype() != null && castOther.getMifidtrtype() != null && this.getMifidtrtype().equals(
						castOther.getMifidtrtype())))
				&& ((this.getMifidtrtypecf() == castOther.getMifidtrtypecf()) || (this.getMifidtrtypecf() != null && castOther.getMifidtrtypecf() != null && this
						.getMifidtrtypecf().equals(castOther.getMifidtrtypecf())))
				&& ((this.getMifidtrtypep() == castOther.getMifidtrtypep()) || (this.getMifidtrtypep() != null && castOther.getMifidtrtypep() != null && this.getMifidtrtypep()
						.equals(castOther.getMifidtrtypep())))
				&& ((this.getMifidtrtypeesma() == castOther.getMifidtrtypeesma()) || (this.getMifidtrtypeesma() != null && castOther.getMifidtrtypeesma() != null && this
						.getMifidtrtypeesma().equals(castOther.getMifidtrtypeesma())))
				&& ((this.getMifidtrtypeesmacf() == castOther.getMifidtrtypeesmacf()) || (this.getMifidtrtypeesmacf() != null && castOther.getMifidtrtypeesmacf() != null && this
						.getMifidtrtypeesmacf().equals(castOther.getMifidtrtypeesmacf())))
				&& ((this.getMifidtrtypeesmap() == castOther.getMifidtrtypeesmap()) || (this.getMifidtrtypeesmap() != null && castOther.getMifidtrtypeesmap() != null && this
						.getMifidtrtypeesmap().equals(castOther.getMifidtrtypeesmap())))
				&& ((this.getMifidundindname() == castOther.getMifidundindname()) || (this.getMifidundindname() != null && castOther.getMifidundindname() != null && this
						.getMifidundindname().equals(castOther.getMifidundindname())))
				&& ((this.getMifidundindnamecf() == castOther.getMifidundindnamecf()) || (this.getMifidundindnamecf() != null && castOther.getMifidundindnamecf() != null && this
						.getMifidundindnamecf().equals(castOther.getMifidundindnamecf())))
				&& ((this.getMifidundindnamep() == castOther.getMifidundindnamep()) || (this.getMifidundindnamep() != null && castOther.getMifidundindnamep() != null && this
						.getMifidundindnamep().equals(castOther.getMifidundindnamep())))
				&& ((this.getMifidundindnameesma() == castOther.getMifidundindnameesma()) || (this.getMifidundindnameesma() != null && castOther.getMifidundindnameesma() != null && this
						.getMifidundindnameesma().equals(castOther.getMifidundindnameesma())))
				&& ((this.getMifidundindnameesmacf() == castOther.getMifidundindnameesmacf()) || (this.getMifidundindnameesmacf() != null
						&& castOther.getMifidundindnameesmacf() != null && this.getMifidundindnameesmacf().equals(castOther.getMifidundindnameesmacf())))
				&& ((this.getMifidundindnameesmap() == castOther.getMifidundindnameesmap()) || (this.getMifidundindnameesmap() != null
						&& castOther.getMifidundindnameesmap() != null && this.getMifidundindnameesmap().equals(castOther.getMifidundindnameesmap())))
				&& ((this.getMifidundindtermesma() == castOther.getMifidundindtermesma()) || (this.getMifidundindtermesma() != null && castOther.getMifidundindtermesma() != null && this
						.getMifidundindtermesma().equals(castOther.getMifidundindtermesma())))
				&& ((this.getMifidundindtermesmacf() == castOther.getMifidundindtermesmacf()) || (this.getMifidundindtermesmacf() != null
						&& castOther.getMifidundindtermesmacf() != null && this.getMifidundindtermesmacf().equals(castOther.getMifidundindtermesmacf())))
				&& ((this.getMifidundindtermesmap() == castOther.getMifidundindtermesmap()) || (this.getMifidundindtermesmap() != null
						&& castOther.getMifidundindtermesmap() != null && this.getMifidundindtermesmap().equals(castOther.getMifidundindtermesmap())))
				&& ((this.getMifidundtype() == castOther.getMifidundtype()) || (this.getMifidundtype() != null && castOther.getMifidundtype() != null && this.getMifidundtype()
						.equals(castOther.getMifidundtype())))
				&& ((this.getMifidundtypecf() == castOther.getMifidundtypecf()) || (this.getMifidundtypecf() != null && castOther.getMifidundtypecf() != null && this
						.getMifidundtypecf().equals(castOther.getMifidundtypecf())))
				&& ((this.getMifidundtypep() == castOther.getMifidundtypep()) || (this.getMifidundtypep() != null && castOther.getMifidundtypep() != null && this
						.getMifidundtypep().equals(castOther.getMifidundtypep())))
				&& ((this.getMifiridentifier() == castOther.getMifiridentifier()) || (this.getMifiridentifier() != null && castOther.getMifiridentifier() != null && this
						.getMifiridentifier().equals(castOther.getMifiridentifier())))
				&& ((this.getMifiridentifiercf() == castOther.getMifiridentifiercf()) || (this.getMifiridentifiercf() != null && castOther.getMifiridentifiercf() != null && this
						.getMifiridentifiercf().equals(castOther.getMifiridentifiercf())))
				&& ((this.getMifiridentifierp() == castOther.getMifiridentifierp()) || (this.getMifiridentifierp() != null && castOther.getMifiridentifierp() != null && this
						.getMifiridentifierp().equals(castOther.getMifiridentifierp())))
				&& ((this.getMindenomination() == castOther.getMindenomination()) || (this.getMindenomination() != null && castOther.getMindenomination() != null && this
						.getMindenomination().equals(castOther.getMindenomination())))
				&& ((this.getMindenominationcf() == castOther.getMindenominationcf()) || (this.getMindenominationcf() != null && castOther.getMindenominationcf() != null && this
						.getMindenominationcf().equals(castOther.getMindenominationcf())))
				&& ((this.getMindenominationp() == castOther.getMindenominationp()) || (this.getMindenominationp() != null && castOther.getMindenominationp() != null && this
						.getMindenominationp().equals(castOther.getMindenominationp())))
				&& ((this.getNcaavdailyturnover() == castOther.getNcaavdailyturnover()) || (this.getNcaavdailyturnover() != null && castOther.getNcaavdailyturnover() != null && this
						.getNcaavdailyturnover().equals(castOther.getNcaavdailyturnover())))
				&& ((this.getNcaavdailyturnovercf() == castOther.getNcaavdailyturnovercf()) || (this.getNcaavdailyturnovercf() != null
						&& castOther.getNcaavdailyturnovercf() != null && this.getNcaavdailyturnovercf().equals(castOther.getNcaavdailyturnovercf())))
				&& ((this.getNcaavdailyturnoverp() == castOther.getNcaavdailyturnoverp()) || (this.getNcaavdailyturnoverp() != null && castOther.getNcaavdailyturnoverp() != null && this
						.getNcaavdailyturnoverp().equals(castOther.getNcaavdailyturnoverp())))
				&& ((this.getNcaavdailyturncurcode() == castOther.getNcaavdailyturncurcode()) || (this.getNcaavdailyturncurcode() != null
						&& castOther.getNcaavdailyturncurcode() != null && this.getNcaavdailyturncurcode().equals(castOther.getNcaavdailyturncurcode())))
				&& ((this.getNcaavdailyturncurcodecf() == castOther.getNcaavdailyturncurcodecf()) || (this.getNcaavdailyturncurcodecf() != null
						&& castOther.getNcaavdailyturncurcodecf() != null && this.getNcaavdailyturncurcodecf().equals(castOther.getNcaavdailyturncurcodecf())))
				&& ((this.getNcaavdailyturncurcodep() == castOther.getNcaavdailyturncurcodep()) || (this.getNcaavdailyturncurcodep() != null
						&& castOther.getNcaavdailyturncurcodep() != null && this.getNcaavdailyturncurcodep().equals(castOther.getNcaavdailyturncurcodep())))
				&& ((this.getNcafreefl() == castOther.getNcafreefl()) || (this.getNcafreefl() != null && castOther.getNcafreefl() != null && this.getNcafreefl().equals(
						castOther.getNcafreefl())))
				&& ((this.getNcafreeflcf() == castOther.getNcafreeflcf()) || (this.getNcafreeflcf() != null && castOther.getNcafreeflcf() != null && this.getNcafreeflcf().equals(
						castOther.getNcafreeflcf())))
				&& ((this.getNcafreeflp() == castOther.getNcafreeflp()) || (this.getNcafreeflp() != null && castOther.getNcafreeflp() != null && this.getNcafreeflp().equals(
						castOther.getNcafreeflp())))
				&& ((this.getNcafreeflcurcode() == castOther.getNcafreeflcurcode()) || (this.getNcafreeflcurcode() != null && castOther.getNcafreeflcurcode() != null && this
						.getNcafreeflcurcode().equals(castOther.getNcafreeflcurcode())))
				&& ((this.getNcafreeflcurcodecf() == castOther.getNcafreeflcurcodecf()) || (this.getNcafreeflcurcodecf() != null && castOther.getNcafreeflcurcodecf() != null && this
						.getNcafreeflcurcodecf().equals(castOther.getNcafreeflcurcodecf())))
				&& ((this.getNcafreeflcurcodep() == castOther.getNcafreeflcurcodep()) || (this.getNcafreeflcurcodep() != null && castOther.getNcafreeflcurcodep() != null && this
						.getNcafreeflcurcodep().equals(castOther.getNcafreeflcurcodep())))
				&& ((this.getNotionalcuresma() == castOther.getNotionalcuresma()) || (this.getNotionalcuresma() != null && castOther.getNotionalcuresma() != null && this
						.getNotionalcuresma().equals(castOther.getNotionalcuresma())))
				&& ((this.getNotionalcuresmacf() == castOther.getNotionalcuresmacf()) || (this.getNotionalcuresmacf() != null && castOther.getNotionalcuresmacf() != null && this
						.getNotionalcuresmacf().equals(castOther.getNotionalcuresmacf())))
				&& ((this.getNotionalcuresmap() == castOther.getNotionalcuresmap()) || (this.getNotionalcuresmap() != null && castOther.getNotionalcuresmap() != null && this
						.getNotionalcuresmap().equals(castOther.getNotionalcuresmap())))
				&& ((this.getOptionroot() == castOther.getOptionroot()) || (this.getOptionroot() != null && castOther.getOptionroot() != null && this.getOptionroot().equals(
						castOther.getOptionroot())))
				&& ((this.getOptionrootcf() == castOther.getOptionrootcf()) || (this.getOptionrootcf() != null && castOther.getOptionrootcf() != null && this.getOptionrootcf()
						.equals(castOther.getOptionrootcf())))
				&& ((this.getOptionrootp() == castOther.getOptionrootp()) || (this.getOptionrootp() != null && castOther.getOptionrootp() != null && this.getOptionrootp().equals(
						castOther.getOptionrootp())))
				&& ((this.getPlaceholder() == castOther.getPlaceholder()) || (this.getPlaceholder() != null && castOther.getPlaceholder() != null && this.getPlaceholder().equals(
						castOther.getPlaceholder())))
				&& ((this.getPricemultiplieresma() == castOther.getPricemultiplieresma()) || (this.getPricemultiplieresma() != null && castOther.getPricemultiplieresma() != null && this
						.getPricemultiplieresma().equals(castOther.getPricemultiplieresma())))
				&& ((this.getPricemultiplieresmacf() == castOther.getPricemultiplieresmacf()) || (this.getPricemultiplieresmacf() != null
						&& castOther.getPricemultiplieresmacf() != null && this.getPricemultiplieresmacf().equals(castOther.getPricemultiplieresmacf())))
				&& ((this.getPricemultiplieresmap() == castOther.getPricemultiplieresmap()) || (this.getPricemultiplieresmap() != null
						&& castOther.getPricemultiplieresmap() != null && this.getPricemultiplieresmap().equals(castOther.getPricemultiplieresmap())))
				&& ((this.getPrtrmaquote() == castOther.getPrtrmaquote()) || (this.getPrtrmaquote() != null && castOther.getPrtrmaquote() != null && this.getPrtrmaquote().equals(
						castOther.getPrtrmaquote())))
				&& ((this.getPrtrmaquotecf() == castOther.getPrtrmaquotecf()) || (this.getPrtrmaquotecf() != null && castOther.getPrtrmaquotecf() != null && this
						.getPrtrmaquotecf().equals(castOther.getPrtrmaquotecf())))
				&& ((this.getPrtrmaquotep() == castOther.getPrtrmaquotep()) || (this.getPrtrmaquotep() != null && castOther.getPrtrmaquotep() != null && this.getPrtrmaquotep()
						.equals(castOther.getPrtrmaquotep())))
				&& ((this.getQuotepermid() == castOther.getQuotepermid()) || (this.getQuotepermid() != null && castOther.getQuotepermid() != null && this.getQuotepermid().equals(
						castOther.getQuotepermid())))
				&& ((this.getQuotepermidcf() == castOther.getQuotepermidcf()) || (this.getQuotepermidcf() != null && castOther.getQuotepermidcf() != null && this
						.getQuotepermidcf().equals(castOther.getQuotepermidcf())))
				&& ((this.getQuotepermidp() == castOther.getQuotepermidp()) || (this.getQuotepermidp() != null && castOther.getQuotepermidp() != null && this.getQuotepermidp()
						.equals(castOther.getQuotepermidp())))
				&& ((this.getReqfattbyissuer() == castOther.getReqfattbyissuer()) || (this.getReqfattbyissuer() != null && castOther.getReqfattbyissuer() != null && this
						.getReqfattbyissuer().equals(castOther.getReqfattbyissuer())))
				&& ((this.getReqfattbyissuercf() == castOther.getReqfattbyissuercf()) || (this.getReqfattbyissuercf() != null && castOther.getReqfattbyissuercf() != null && this
						.getReqfattbyissuercf().equals(castOther.getReqfattbyissuercf())))
				&& ((this.getReqfattbyissuerp() == castOther.getReqfattbyissuerp()) || (this.getReqfattbyissuerp() != null && castOther.getReqfattbyissuerp() != null && this
						.getReqfattbyissuerp().equals(castOther.getReqfattbyissuerp())))
				&& ((this.getReqfattbyissueresma() == castOther.getReqfattbyissueresma()) || (this.getReqfattbyissueresma() != null && castOther.getReqfattbyissueresma() != null && this
						.getReqfattbyissueresma().equals(castOther.getReqfattbyissueresma())))
				&& ((this.getReqfattbyissueresmacf() == castOther.getReqfattbyissueresmacf()) || (this.getReqfattbyissueresmacf() != null
						&& castOther.getReqfattbyissueresmacf() != null && this.getReqfattbyissueresmacf().equals(castOther.getReqfattbyissueresmacf())))
				&& ((this.getReqfattbyissueresmap() == castOther.getReqfattbyissueresmap()) || (this.getReqfattbyissueresmap() != null
						&& castOther.getReqfattbyissueresmap() != null && this.getReqfattbyissueresmap().equals(castOther.getReqfattbyissueresmap())))
				&& ((this.getSecuritydescription() == castOther.getSecuritydescription()) || (this.getSecuritydescription() != null && castOther.getSecuritydescription() != null && this
						.getSecuritydescription().equals(castOther.getSecuritydescription())))
				&& ((this.getSecuritydescriptioncf() == castOther.getSecuritydescriptioncf()) || (this.getSecuritydescriptioncf() != null
						&& castOther.getSecuritydescriptioncf() != null && this.getSecuritydescriptioncf().equals(castOther.getSecuritydescriptioncf())))
				&& ((this.getSecuritydescriptionp() == castOther.getSecuritydescriptionp()) || (this.getSecuritydescriptionp() != null
						&& castOther.getSecuritydescriptionp() != null && this.getSecuritydescriptionp().equals(castOther.getSecuritydescriptionp())))
				&& ((this.getStrikepriceesma() == castOther.getStrikepriceesma()) || (this.getStrikepriceesma() != null && castOther.getStrikepriceesma() != null && this
						.getStrikepriceesma().equals(castOther.getStrikepriceesma())))
				&& ((this.getStrikepriceesmacf() == castOther.getStrikepriceesmacf()) || (this.getStrikepriceesmacf() != null && castOther.getStrikepriceesmacf() != null && this
						.getStrikepriceesmacf().equals(castOther.getStrikepriceesmacf())))
				&& ((this.getStrikepriceesmap() == castOther.getStrikepriceesmap()) || (this.getStrikepriceesmap() != null && castOther.getStrikepriceesmap() != null && this
						.getStrikepriceesmap().equals(castOther.getStrikepriceesmap())))
				&& ((this.getStrikepricecuresma() == castOther.getStrikepricecuresma()) || (this.getStrikepricecuresma() != null && castOther.getStrikepricecuresma() != null && this
						.getStrikepricecuresma().equals(castOther.getStrikepricecuresma())))
				&& ((this.getStrikepricecuresmacf() == castOther.getStrikepricecuresmacf()) || (this.getStrikepricecuresmacf() != null
						&& castOther.getStrikepricecuresmacf() != null && this.getStrikepricecuresmacf().equals(castOther.getStrikepricecuresmacf())))
				&& ((this.getStrikepricecuresmap() == castOther.getStrikepricecuresmap()) || (this.getStrikepricecuresmap() != null && castOther.getStrikepricecuresmap() != null && this
						.getStrikepricecuresmap().equals(castOther.getStrikepricecuresmap())))
				&& ((this.getSuscategoryesma() == castOther.getSuscategoryesma()) || (this.getSuscategoryesma() != null && castOther.getSuscategoryesma() != null && this
						.getSuscategoryesma().equals(castOther.getSuscategoryesma())))
				&& ((this.getSuscategoryesmacf() == castOther.getSuscategoryesmacf()) || (this.getSuscategoryesmacf() != null && castOther.getSuscategoryesmacf() != null && this
						.getSuscategoryesmacf().equals(castOther.getSuscategoryesmacf())))
				&& ((this.getSuscategoryesmap() == castOther.getSuscategoryesmap()) || (this.getSuscategoryesmap() != null && castOther.getSuscategoryesmap() != null && this
						.getSuscategoryesmap().equals(castOther.getSuscategoryesmap())))
				&& ((this.getSusendedonesma() == castOther.getSusendedonesma()) || (this.getSusendedonesma() != null && castOther.getSusendedonesma() != null && this
						.getSusendedonesma().equals(castOther.getSusendedonesma())))
				&& ((this.getSusendedonesmacf() == castOther.getSusendedonesmacf()) || (this.getSusendedonesmacf() != null && castOther.getSusendedonesmacf() != null && this
						.getSusendedonesmacf().equals(castOther.getSusendedonesmacf())))
				&& ((this.getSusendedonesmap() == castOther.getSusendedonesmap()) || (this.getSusendedonesmap() != null && castOther.getSusendedonesmap() != null && this
						.getSusendedonesmap().equals(castOther.getSusendedonesmap())))
				&& ((this.getSusongoingesma() == castOther.getSusongoingesma()) || (this.getSusongoingesma() != null && castOther.getSusongoingesma() != null && this
						.getSusongoingesma().equals(castOther.getSusongoingesma())))
				&& ((this.getSusongoingesmacf() == castOther.getSusongoingesmacf()) || (this.getSusongoingesmacf() != null && castOther.getSusongoingesmacf() != null && this
						.getSusongoingesmacf().equals(castOther.getSusongoingesmacf())))
				&& ((this.getSusongoingesmap() == castOther.getSusongoingesmap()) || (this.getSusongoingesmap() != null && castOther.getSusongoingesmap() != null && this
						.getSusongoingesmap().equals(castOther.getSusongoingesmap())))
				&& ((this.getSusratesma() == castOther.getSusratesma()) || (this.getSusratesma() != null && castOther.getSusratesma() != null && this.getSusratesma().equals(
						castOther.getSusratesma())))
				&& ((this.getSusratesmacf() == castOther.getSusratesmacf()) || (this.getSusratesmacf() != null && castOther.getSusratesmacf() != null && this.getSusratesmacf()
						.equals(castOther.getSusratesmacf())))
				&& ((this.getSusratesmap() == castOther.getSusratesmap()) || (this.getSusratesmap() != null && castOther.getSusratesmap() != null && this.getSusratesmap().equals(
						castOther.getSusratesmap())))
				&& ((this.getSusstonesma() == castOther.getSusstonesma()) || (this.getSusstonesma() != null && castOther.getSusstonesma() != null && this.getSusstonesma().equals(
						castOther.getSusstonesma())))
				&& ((this.getSusstonesmacf() == castOther.getSusstonesmacf()) || (this.getSusstonesmacf() != null && castOther.getSusstonesmacf() != null && this
						.getSusstonesmacf().equals(castOther.getSusstonesmacf())))
				&& ((this.getSusstonesmap() == castOther.getSusstonesmap()) || (this.getSusstonesmap() != null && castOther.getSusstonesmap() != null && this.getSusstonesmap()
						.equals(castOther.getSusstonesmap())))
				&& ((this.getTtlamissued() == castOther.getTtlamissued()) || (this.getTtlamissued() != null && castOther.getTtlamissued() != null && this.getTtlamissued().equals(
						castOther.getTtlamissued())))
				&& ((this.getTtlamissuedcf() == castOther.getTtlamissuedcf()) || (this.getTtlamissuedcf() != null && castOther.getTtlamissuedcf() != null && this
						.getTtlamissuedcf().equals(castOther.getTtlamissuedcf())))
				&& ((this.getTtlamissuedp() == castOther.getTtlamissuedp()) || (this.getTtlamissuedp() != null && castOther.getTtlamissuedp() != null && this.getTtlamissuedp()
						.equals(castOther.getTtlamissuedp())))
				&& ((this.getTtleutu12moesma() == castOther.getTtleutu12moesma()) || (this.getTtleutu12moesma() != null && castOther.getTtleutu12moesma() != null && this
						.getTtleutu12moesma().equals(castOther.getTtleutu12moesma())))
				&& ((this.getTtleutu12moesmacf() == castOther.getTtleutu12moesmacf()) || (this.getTtleutu12moesmacf() != null && castOther.getTtleutu12moesmacf() != null && this
						.getTtleutu12moesmacf().equals(castOther.getTtleutu12moesmacf())))
				&& ((this.getTtleutu12moesmap() == castOther.getTtleutu12moesmap()) || (this.getTtleutu12moesmap() != null && castOther.getTtleutu12moesmap() != null && this
						.getTtleutu12moesmap().equals(castOther.getTtleutu12moesmap())))
				&& ((this.getTtleuvl12moesma() == castOther.getTtleuvl12moesma()) || (this.getTtleuvl12moesma() != null && castOther.getTtleuvl12moesma() != null && this
						.getTtleuvl12moesma().equals(castOther.getTtleuvl12moesma())))
				&& ((this.getTtleuvl12moesmacf() == castOther.getTtleuvl12moesmacf()) || (this.getTtleuvl12moesmacf() != null && castOther.getTtleuvl12moesmacf() != null && this
						.getTtleuvl12moesmacf().equals(castOther.getTtleuvl12moesmacf())))
				&& ((this.getTtleuvl12moesmap() == castOther.getTtleuvl12moesmap()) || (this.getTtleuvl12moesmap() != null && castOther.getTtleuvl12moesmap() != null && this
						.getTtleuvl12moesmap().equals(castOther.getTtleuvl12moesmap())))
				&& ((this.getUndeeaelig() == castOther.getUndeeaelig()) || (this.getUndeeaelig() != null && castOther.getUndeeaelig() != null && this.getUndeeaelig().equals(
						castOther.getUndeeaelig())))
				&& ((this.getUndeeaeligcf() == castOther.getUndeeaeligcf()) || (this.getUndeeaeligcf() != null && castOther.getUndeeaeligcf() != null && this.getUndeeaeligcf()
						.equals(castOther.getUndeeaeligcf())))
				&& ((this.getUndeeaeligp() == castOther.getUndeeaeligp()) || (this.getUndeeaeligp() != null && castOther.getUndeeaeligp() != null && this.getUndeeaeligp().equals(
						castOther.getUndeeaeligp())))
				&& ((this.getUndisin() == castOther.getUndisin()) || (this.getUndisin() != null && castOther.getUndisin() != null && this.getUndisin().equals(
						castOther.getUndisin())))
				&& ((this.getUndisincf() == castOther.getUndisincf()) || (this.getUndisincf() != null && castOther.getUndisincf() != null && this.getUndisincf().equals(
						castOther.getUndisincf())))
				&& ((this.getUndisinp() == castOther.getUndisinp()) || (this.getUndisinp() != null && castOther.getUndisinp() != null && this.getUndisinp().equals(
						castOther.getUndisinp())))
				&& ((this.getUndisinesma() == castOther.getUndisinesma()) || (this.getUndisinesma() != null && castOther.getUndisinesma() != null && this.getUndisinesma().equals(
						castOther.getUndisinesma())))
				&& ((this.getUndisinesmacf() == castOther.getUndisinesmacf()) || (this.getUndisinesmacf() != null && castOther.getUndisinesmacf() != null && this
						.getUndisinesmacf().equals(castOther.getUndisinesmacf())))
				&& ((this.getUndisinesmap() == castOther.getUndisinesmap()) || (this.getUndisinesmap() != null && castOther.getUndisinesmap() != null && this.getUndisinesmap()
						.equals(castOther.getUndisinesmap())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAction() == null ? 0 : this.getAction().hashCode());
		result = 37 * result + (getLevelcode() == null ? 0 : this.getLevelcode().hashCode());
		result = 37 * result + (getIpc() == null ? 0 : this.getIpc().hashCode());
		result = 37 * result + (getQuoteid() == null ? 0 : this.getQuoteid().hashCode());
		result = 37 * result + (getRic() == null ? 0 : this.getRic().hashCode());
		result = 37 * result + (getSedol() == null ? 0 : this.getSedol().hashCode());
		result = 37 * result + (getIssuepermid() == null ? 0 : this.getIssuepermid().hashCode());
		result = 37 * result + (getAssetid() == null ? 0 : this.getAssetid().hashCode());
		result = 37 * result + (getPilc() == null ? 0 : this.getPilc().hashCode());
		result = 37 * result + (getCusip() == null ? 0 : this.getCusip().hashCode());
		result = 37 * result + (getOrgpermid() == null ? 0 : this.getOrgpermid().hashCode());
		result = 37 * result + (getAssetstatus() == null ? 0 : this.getAssetstatus().hashCode());
		result = 37 * result + (getAssetstatuscf() == null ? 0 : this.getAssetstatuscf().hashCode());
		result = 37 * result + (getAssetstatusp() == null ? 0 : this.getAssetstatusp().hashCode());
		result = 37 * result + (getBasketundisinlist() == null ? 0 : this.getBasketundisinlist().hashCode());
		result = 37 * result + (getBasketundisinlistcf() == null ? 0 : this.getBasketundisinlistcf().hashCode());
		result = 37 * result + (getBasketundisinlistp() == null ? 0 : this.getBasketundisinlistp().hashCode());
		result = 37 * result + (getBasketwrrindicator() == null ? 0 : this.getBasketwrrindicator().hashCode());
		result = 37 * result + (getBasketwrrindicatorcf() == null ? 0 : this.getBasketwrrindicatorcf().hashCode());
		result = 37 * result + (getBasketwrrindicatorp() == null ? 0 : this.getBasketwrrindicatorp().hashCode());
		result = 37 * result + (getCficode() == null ? 0 : this.getCficode().hashCode());
		result = 37 * result + (getCficodecf() == null ? 0 : this.getCficodecf().hashCode());
		result = 37 * result + (getCficodep() == null ? 0 : this.getCficodep().hashCode());
		result = 37 * result + (getCincode() == null ? 0 : this.getCincode().hashCode());
		result = 37 * result + (getCincodecf() == null ? 0 : this.getCincodecf().hashCode());
		result = 37 * result + (getCincodep() == null ? 0 : this.getCincodep().hashCode());
		result = 37 * result + (getComplegaldomicile() == null ? 0 : this.getComplegaldomicile().hashCode());
		result = 37 * result + (getComplegaldomicilecf() == null ? 0 : this.getComplegaldomicilecf().hashCode());
		result = 37 * result + (getComplegaldomicilep() == null ? 0 : this.getComplegaldomicilep().hashCode());
		result = 37 * result + (getCompshortname() == null ? 0 : this.getCompshortname().hashCode());
		result = 37 * result + (getCompshortnamecf() == null ? 0 : this.getCompshortnamecf().hashCode());
		result = 37 * result + (getCompshortnamep() == null ? 0 : this.getCompshortnamep().hashCode());
		result = 37 * result + (getDealstartdate() == null ? 0 : this.getDealstartdate().hashCode());
		result = 37 * result + (getDealstartdatecf() == null ? 0 : this.getDealstartdatecf().hashCode());
		result = 37 * result + (getDealstartdatep() == null ? 0 : this.getDealstartdatep().hashCode());
		result = 37 * result + (getEeavenueelflg() == null ? 0 : this.getEeavenueelflg().hashCode());
		result = 37 * result + (getEeavenueelflgcf() == null ? 0 : this.getEeavenueelflgcf().hashCode());
		result = 37 * result + (getEeavenueelflgp() == null ? 0 : this.getEeavenueelflgp().hashCode());
		result = 37 * result + (getFininsshname() == null ? 0 : this.getFininsshname().hashCode());
		result = 37 * result + (getFininsshnamecf() == null ? 0 : this.getFininsshnamecf().hashCode());
		result = 37 * result + (getFininsshnamep() == null ? 0 : this.getFininsshnamep().hashCode());
		result = 37 * result + (getFininsshnameesma() == null ? 0 : this.getFininsshnameesma().hashCode());
		result = 37 * result + (getFininsshnameesmacf() == null ? 0 : this.getFininsshnameesmacf().hashCode());
		result = 37 * result + (getFininsshnameesmap() == null ? 0 : this.getFininsshnameesmap().hashCode());
		result = 37 * result + (getInesmafirds() == null ? 0 : this.getInesmafirds().hashCode());
		result = 37 * result + (getInesmafirdscf() == null ? 0 : this.getInesmafirdscf().hashCode());
		result = 37 * result + (getInesmafirdsp() == null ? 0 : this.getInesmafirdsp().hashCode());
		result = 37 * result + (getInsclassesma() == null ? 0 : this.getInsclassesma().hashCode());
		result = 37 * result + (getInsclassesmacf() == null ? 0 : this.getInsclassesmacf().hashCode());
		result = 37 * result + (getInsclassesmap() == null ? 0 : this.getInsclassesmap().hashCode());
		result = 37 * result + (getInsfullnameesma() == null ? 0 : this.getInsfullnameesma().hashCode());
		result = 37 * result + (getInsfullnameesmacf() == null ? 0 : this.getInsfullnameesmacf().hashCode());
		result = 37 * result + (getInsfullnameesmap() == null ? 0 : this.getInsfullnameesmap().hashCode());
		result = 37 * result + (getIsin() == null ? 0 : this.getIsin().hashCode());
		result = 37 * result + (getIsincf() == null ? 0 : this.getIsincf().hashCode());
		result = 37 * result + (getIsinp() == null ? 0 : this.getIsinp().hashCode());
		result = 37 * result + (getIssuedate() == null ? 0 : this.getIssuedate().hashCode());
		result = 37 * result + (getIssuedatecf() == null ? 0 : this.getIssuedatecf().hashCode());
		result = 37 * result + (getIssuedatep() == null ? 0 : this.getIssuedatep().hashCode());
		result = 37 * result + (getIssuerlei() == null ? 0 : this.getIssuerlei().hashCode());
		result = 37 * result + (getIssuerleicf() == null ? 0 : this.getIssuerleicf().hashCode());
		result = 37 * result + (getIssuerleip() == null ? 0 : this.getIssuerleip().hashCode());
		result = 37 * result + (getIssortrvenueleiesma() == null ? 0 : this.getIssortrvenueleiesma().hashCode());
		result = 37 * result + (getIssortrvenueleiesmacf() == null ? 0 : this.getIssortrvenueleiesmacf().hashCode());
		result = 37 * result + (getIssortrvenueleiesmap() == null ? 0 : this.getIssortrvenueleiesmap().hashCode());
		result = 37 * result + (getMrkattsrcpermid() == null ? 0 : this.getMrkattsrcpermid().hashCode());
		result = 37 * result + (getMrkattsrcpermidcf() == null ? 0 : this.getMrkattsrcpermidcf().hashCode());
		result = 37 * result + (getMrkattsrcpermidp() == null ? 0 : this.getMrkattsrcpermidp().hashCode());
		result = 37 * result + (getMarketmic() == null ? 0 : this.getMarketmic().hashCode());
		result = 37 * result + (getMarketmiccf() == null ? 0 : this.getMarketmiccf().hashCode());
		result = 37 * result + (getMarketmicp() == null ? 0 : this.getMarketmicp().hashCode());
		result = 37 * result + (getMaturitydate() == null ? 0 : this.getMaturitydate().hashCode());
		result = 37 * result + (getMaturitydatecf() == null ? 0 : this.getMaturitydatecf().hashCode());
		result = 37 * result + (getMaturitydatep() == null ? 0 : this.getMaturitydatep().hashCode());
		result = 37 * result + (getMifidasclofun() == null ? 0 : this.getMifidasclofun().hashCode());
		result = 37 * result + (getMifidasclofuncf() == null ? 0 : this.getMifidasclofuncf().hashCode());
		result = 37 * result + (getMifidasclofunp() == null ? 0 : this.getMifidasclofunp().hashCode());
		result = 37 * result + (getMifidadnapinsesma() == null ? 0 : this.getMifidadnapinsesma().hashCode());
		result = 37 * result + (getMifidadnapinsesmacf() == null ? 0 : this.getMifidadnapinsesmacf().hashCode());
		result = 37 * result + (getMifidadnapinsesmap() == null ? 0 : this.getMifidadnapinsesmap().hashCode());
		result = 37 * result + (getMifidadnoftpinsesma() == null ? 0 : this.getMifidadnoftpinsesma().hashCode());
		result = 37 * result + (getMifidadnoftpinsesmacf() == null ? 0 : this.getMifidadnoftpinsesmacf().hashCode());
		result = 37 * result + (getMifidadnoftpinsesmap() == null ? 0 : this.getMifidadnoftpinsesmap().hashCode());
		result = 37 * result + (getMifidavdatuesma() == null ? 0 : this.getMifidavdatuesma().hashCode());
		result = 37 * result + (getMifidavdatuesmacf() == null ? 0 : this.getMifidavdatuesmacf().hashCode());
		result = 37 * result + (getMifidavdatuesmap() == null ? 0 : this.getMifidavdatuesmap().hashCode());
		result = 37 * result + (getMifidavdatucurcode() == null ? 0 : this.getMifidavdatucurcode().hashCode());
		result = 37 * result + (getMifidavdatucurcodecf() == null ? 0 : this.getMifidavdatucurcodecf().hashCode());
		result = 37 * result + (getMifidavdatucurcodep() == null ? 0 : this.getMifidavdatucurcodep().hashCode());
		result = 37 * result + (getMifidavvaoftresma() == null ? 0 : this.getMifidavvaoftresma().hashCode());
		result = 37 * result + (getMifidavvaoftresmacf() == null ? 0 : this.getMifidavvaoftresmacf().hashCode());
		result = 37 * result + (getMifidavvaoftresmap() == null ? 0 : this.getMifidavvaoftresmap().hashCode());
		result = 37 * result + (getMifidavvaoftrcurcode() == null ? 0 : this.getMifidavvaoftrcurcode().hashCode());
		result = 37 * result + (getMifidavvaoftrcurcodecf() == null ? 0 : this.getMifidavvaoftrcurcodecf().hashCode());
		result = 37 * result + (getMifidavvaoftrcurcodep() == null ? 0 : this.getMifidavvaoftrcurcodep().hashCode());
		result = 37 * result + (getMifidbaseprod() == null ? 0 : this.getMifidbaseprod().hashCode());
		result = 37 * result + (getMifidbaseprodcf() == null ? 0 : this.getMifidbaseprodcf().hashCode());
		result = 37 * result + (getMifidbaseprodp() == null ? 0 : this.getMifidbaseprodp().hashCode());
		result = 37 * result + (getMifidbaseprodesma() == null ? 0 : this.getMifidbaseprodesma().hashCode());
		result = 37 * result + (getMifidbaseprodesmacf() == null ? 0 : this.getMifidbaseprodesmacf().hashCode());
		result = 37 * result + (getMifidbaseprodesmap() == null ? 0 : this.getMifidbaseprodesmap().hashCode());
		result = 37 * result + (getMifidbondseni() == null ? 0 : this.getMifidbondseni().hashCode());
		result = 37 * result + (getMifidbondsenicf() == null ? 0 : this.getMifidbondsenicf().hashCode());
		result = 37 * result + (getMifidbondsenip() == null ? 0 : this.getMifidbondsenip().hashCode());
		result = 37 * result + (getMifidbondtype() == null ? 0 : this.getMifidbondtype().hashCode());
		result = 37 * result + (getMifidbondtypecf() == null ? 0 : this.getMifidbondtypecf().hashCode());
		result = 37 * result + (getMifidbondtypep() == null ? 0 : this.getMifidbondtypep().hashCode());
		result = 37 * result + (getMifidclobflag() == null ? 0 : this.getMifidclobflag().hashCode());
		result = 37 * result + (getMifidclobflagcf() == null ? 0 : this.getMifidclobflagcf().hashCode());
		result = 37 * result + (getMifidclobflagp() == null ? 0 : this.getMifidclobflagp().hashCode());
		result = 37 * result + (getMifidcofialiinfornewbo() == null ? 0 : this.getMifidcofialiinfornewbo().hashCode());
		result = 37 * result + (getMifidcofialiinfornewbocf() == null ? 0 : this.getMifidcofialiinfornewbocf().hashCode());
		result = 37 * result + (getMifidcofialiinfornewbop() == null ? 0 : this.getMifidcofialiinfornewbop().hashCode());
		result = 37 * result + (getMifidcodein() == null ? 0 : this.getMifidcodein().hashCode());
		result = 37 * result + (getMifidcodeincf() == null ? 0 : this.getMifidcodeincf().hashCode());
		result = 37 * result + (getMifidcodeinp() == null ? 0 : this.getMifidcodeinp().hashCode());
		result = 37 * result + (getMifidcodeinesma() == null ? 0 : this.getMifidcodeinesma().hashCode());
		result = 37 * result + (getMifidcodeinesmacf() == null ? 0 : this.getMifidcodeinesmacf().hashCode());
		result = 37 * result + (getMifidcodeinesmap() == null ? 0 : this.getMifidcodeinesmap().hashCode());
		result = 37 * result + (getMifidcoinflesma() == null ? 0 : this.getMifidcoinflesma().hashCode());
		result = 37 * result + (getMifidcoinflesmacf() == null ? 0 : this.getMifidcoinflesmacf().hashCode());
		result = 37 * result + (getMifidcoinflesmap() == null ? 0 : this.getMifidcoinflesmap().hashCode());
		result = 37 * result + (getMifidcoinre() == null ? 0 : this.getMifidcoinre().hashCode());
		result = 37 * result + (getMifidcoinrecf() == null ? 0 : this.getMifidcoinrecf().hashCode());
		result = 37 * result + (getMifidcoinrep() == null ? 0 : this.getMifidcoinrep().hashCode());
		result = 37 * result + (getMifidcotype() == null ? 0 : this.getMifidcotype().hashCode());
		result = 37 * result + (getMifidcotypecf() == null ? 0 : this.getMifidcotypecf().hashCode());
		result = 37 * result + (getMifidcotypep() == null ? 0 : this.getMifidcotypep().hashCode());
		result = 37 * result + (getMifiddeltypeesma() == null ? 0 : this.getMifiddeltypeesma().hashCode());
		result = 37 * result + (getMifiddeltypeesmacf() == null ? 0 : this.getMifiddeltypeesmacf().hashCode());
		result = 37 * result + (getMifiddeltypeesmap() == null ? 0 : this.getMifiddeltypeesmap().hashCode());
		result = 37 * result + (getMifidemalsubtype() == null ? 0 : this.getMifidemalsubtype().hashCode());
		result = 37 * result + (getMifidemalsubtypecf() == null ? 0 : this.getMifidemalsubtypecf().hashCode());
		result = 37 * result + (getMifidemalsubtypep() == null ? 0 : this.getMifidemalsubtypep().hashCode());
		result = 37 * result + (getMifidexerstyle() == null ? 0 : this.getMifidexerstyle().hashCode());
		result = 37 * result + (getMifidexerstylecf() == null ? 0 : this.getMifidexerstylecf().hashCode());
		result = 37 * result + (getMifidexerstylep() == null ? 0 : this.getMifidexerstylep().hashCode());
		result = 37 * result + (getMifidexerstyleesma() == null ? 0 : this.getMifidexerstyleesma().hashCode());
		result = 37 * result + (getMifidexerstyleesmacf() == null ? 0 : this.getMifidexerstyleesmacf().hashCode());
		result = 37 * result + (getMifidexerstyleesmap() == null ? 0 : this.getMifidexerstyleesmap().hashCode());
		result = 37 * result + (getMifidexpdateesma() == null ? 0 : this.getMifidexpdateesma().hashCode());
		result = 37 * result + (getMifidexpdateesmacf() == null ? 0 : this.getMifidexpdateesmacf().hashCode());
		result = 37 * result + (getMifidexpdateesmap() == null ? 0 : this.getMifidexpdateesmap().hashCode());
		result = 37 * result + (getMifidfiprtype() == null ? 0 : this.getMifidfiprtype().hashCode());
		result = 37 * result + (getMifidfiprtypecf() == null ? 0 : this.getMifidfiprtypecf().hashCode());
		result = 37 * result + (getMifidfiprtypep() == null ? 0 : this.getMifidfiprtypep().hashCode());
		result = 37 * result + (getMifidfiprtypeesma() == null ? 0 : this.getMifidfiprtypeesma().hashCode());
		result = 37 * result + (getMifidfiprtypeesmacf() == null ? 0 : this.getMifidfiprtypeesmacf().hashCode());
		result = 37 * result + (getMifidfiprtypeesmap() == null ? 0 : this.getMifidfiprtypeesmap().hashCode());
		result = 37 * result + (getMifidfrtradedate() == null ? 0 : this.getMifidfrtradedate().hashCode());
		result = 37 * result + (getMifidfrtradedatecf() == null ? 0 : this.getMifidfrtradedatecf().hashCode());
		result = 37 * result + (getMifidfrtradedatep() == null ? 0 : this.getMifidfrtradedatep().hashCode());
		result = 37 * result + (getMifidfrtradedateesma() == null ? 0 : this.getMifidfrtradedateesma().hashCode());
		result = 37 * result + (getMifidfrtradedateesmacf() == null ? 0 : this.getMifidfrtradedateesmacf().hashCode());
		result = 37 * result + (getMifidfrtradedateesmap() == null ? 0 : this.getMifidfrtradedateesmap().hashCode());
		result = 37 * result + (getMifidflag() == null ? 0 : this.getMifidflag().hashCode());
		result = 37 * result + (getMifidflagcf() == null ? 0 : this.getMifidflagcf().hashCode());
		result = 37 * result + (getMifidflagp() == null ? 0 : this.getMifidflagp().hashCode());
		result = 37 * result + (getMifidfrfloatesma() == null ? 0 : this.getMifidfrfloatesma().hashCode());
		result = 37 * result + (getMifidfrfloatesmacf() == null ? 0 : this.getMifidfrfloatesmacf().hashCode());
		result = 37 * result + (getMifidfrfloatesmap() == null ? 0 : this.getMifidfrfloatesmap().hashCode());
		result = 37 * result + (getMifidfrfloatcurcode() == null ? 0 : this.getMifidfrfloatcurcode().hashCode());
		result = 37 * result + (getMifidfrfloatcurcodecf() == null ? 0 : this.getMifidfrfloatcurcodecf().hashCode());
		result = 37 * result + (getMifidfrfloatcurcodep() == null ? 0 : this.getMifidfrfloatcurcodep().hashCode());
		result = 37 * result + (getMifidfusubpr() == null ? 0 : this.getMifidfusubpr().hashCode());
		result = 37 * result + (getMifidfusubprcf() == null ? 0 : this.getMifidfusubprcf().hashCode());
		result = 37 * result + (getMifidfusubprp() == null ? 0 : this.getMifidfusubprp().hashCode());
		result = 37 * result + (getMifidfusubpresma() == null ? 0 : this.getMifidfusubpresma().hashCode());
		result = 37 * result + (getMifidfusubpresmacf() == null ? 0 : this.getMifidfusubpresmacf().hashCode());
		result = 37 * result + (getMifidfusubpresmap() == null ? 0 : this.getMifidfusubpresmap().hashCode());
		result = 37 * result + (getMifidissdateesma() == null ? 0 : this.getMifidissdateesma().hashCode());
		result = 37 * result + (getMifidissdateesmacf() == null ? 0 : this.getMifidissdateesmacf().hashCode());
		result = 37 * result + (getMifidissdateesmap() == null ? 0 : this.getMifidissdateesmap().hashCode());
		result = 37 * result + (getMifidisssizeesma() == null ? 0 : this.getMifidisssizeesma().hashCode());
		result = 37 * result + (getMifidisssizeesmacf() == null ? 0 : this.getMifidisssizeesmacf().hashCode());
		result = 37 * result + (getMifidisssizeesmap() == null ? 0 : this.getMifidisssizeesmap().hashCode());
		result = 37 * result + (getMifidmatdate() == null ? 0 : this.getMifidmatdate().hashCode());
		result = 37 * result + (getMifidmatdatecf() == null ? 0 : this.getMifidmatdatecf().hashCode());
		result = 37 * result + (getMifidmatdatep() == null ? 0 : this.getMifidmatdatep().hashCode());
		result = 37 * result + (getMifidmatdateesma() == null ? 0 : this.getMifidmatdateesma().hashCode());
		result = 37 * result + (getMifidmatdateesmacf() == null ? 0 : this.getMifidmatdateesmacf().hashCode());
		result = 37 * result + (getMifidmatdateesmap() == null ? 0 : this.getMifidmatdateesmap().hashCode());
		result = 37 * result + (getMifidmostremaesma() == null ? 0 : this.getMifidmostremaesma().hashCode());
		result = 37 * result + (getMifidmostremaesmacf() == null ? 0 : this.getMifidmostremaesmacf().hashCode());
		result = 37 * result + (getMifidmostremaesmap() == null ? 0 : this.getMifidmostremaesmap().hashCode());
		result = 37 * result + (getMifidoptype() == null ? 0 : this.getMifidoptype().hashCode());
		result = 37 * result + (getMifidoptypecf() == null ? 0 : this.getMifidoptypecf().hashCode());
		result = 37 * result + (getMifidoptypep() == null ? 0 : this.getMifidoptypep().hashCode());
		result = 37 * result + (getMifidoptypeesma() == null ? 0 : this.getMifidoptypeesma().hashCode());
		result = 37 * result + (getMifidoptypeesmacf() == null ? 0 : this.getMifidoptypeesmacf().hashCode());
		result = 37 * result + (getMifidoptypeesmap() == null ? 0 : this.getMifidoptypeesmap().hashCode());
		result = 37 * result + (getMifidptuw12esma() == null ? 0 : this.getMifidptuw12esma().hashCode());
		result = 37 * result + (getMifidptuw12esmacf() == null ? 0 : this.getMifidptuw12esmacf().hashCode());
		result = 37 * result + (getMifidptuw12esmap() == null ? 0 : this.getMifidptuw12esmap().hashCode());
		result = 37 * result + (getMifidptuwptv12mesma() == null ? 0 : this.getMifidptuwptv12mesma().hashCode());
		result = 37 * result + (getMifidptuwptv12mesmacf() == null ? 0 : this.getMifidptuwptv12mesmacf().hashCode());
		result = 37 * result + (getMifidptuwptv12mesmap() == null ? 0 : this.getMifidptuwptv12mesmap().hashCode());
		result = 37 * result + (getMifidpotrlisthfl() == null ? 0 : this.getMifidpotrlisthfl().hashCode());
		result = 37 * result + (getMifidpotrlisthflcf() == null ? 0 : this.getMifidpotrlisthflcf().hashCode());
		result = 37 * result + (getMifidpotrlisthflp() == null ? 0 : this.getMifidpotrlisthflp().hashCode());
		result = 37 * result + (getMifidpotrlisthvl() == null ? 0 : this.getMifidpotrlisthvl().hashCode());
		result = 37 * result + (getMifidpotrlisthvlcf() == null ? 0 : this.getMifidpotrlisthvlcf().hashCode());
		result = 37 * result + (getMifidpotrlisthvlp() == null ? 0 : this.getMifidpotrlisthvlp().hashCode());
		result = 37 * result + (getMifidpotrlistrper() == null ? 0 : this.getMifidpotrlistrper().hashCode());
		result = 37 * result + (getMifidpotrlistrpercf() == null ? 0 : this.getMifidpotrlistrpercf().hashCode());
		result = 37 * result + (getMifidpotrlistrperp() == null ? 0 : this.getMifidpotrlistrperp().hashCode());
		result = 37 * result + (getMifidpotrlisvoper() == null ? 0 : this.getMifidpotrlisvoper().hashCode());
		result = 37 * result + (getMifidpotrlisvopercf() == null ? 0 : this.getMifidpotrlisvopercf().hashCode());
		result = 37 * result + (getMifidpotrlisvoperp() == null ? 0 : this.getMifidpotrlisvoperp().hashCode());
		result = 37 * result + (getMifidpotrsstithfl() == null ? 0 : this.getMifidpotrsstithfl().hashCode());
		result = 37 * result + (getMifidpotrsstithflcf() == null ? 0 : this.getMifidpotrsstithflcf().hashCode());
		result = 37 * result + (getMifidpotrsstithflp() == null ? 0 : this.getMifidpotrsstithflp().hashCode());
		result = 37 * result + (getMifidpotrsstithvl() == null ? 0 : this.getMifidpotrsstithvl().hashCode());
		result = 37 * result + (getMifidpotrsstithvlcf() == null ? 0 : this.getMifidpotrsstithvlcf().hashCode());
		result = 37 * result + (getMifidpotrsstithvlp() == null ? 0 : this.getMifidpotrsstithvlp().hashCode());
		result = 37 * result + (getMifidpotrsstitrper() == null ? 0 : this.getMifidpotrsstitrper().hashCode());
		result = 37 * result + (getMifidpotrsstitrpercf() == null ? 0 : this.getMifidpotrsstitrpercf().hashCode());
		result = 37 * result + (getMifidpotrsstitrperp() == null ? 0 : this.getMifidpotrsstitrperp().hashCode());
		result = 37 * result + (getMifidpotrsstivoper() == null ? 0 : this.getMifidpotrsstivoper().hashCode());
		result = 37 * result + (getMifidpotrsstivopercf() == null ? 0 : this.getMifidpotrsstivopercf().hashCode());
		result = 37 * result + (getMifidpotrsstivoperp() == null ? 0 : this.getMifidpotrsstivoperp().hashCode());
		result = 37 * result + (getMifidpretrlisthfl() == null ? 0 : this.getMifidpretrlisthfl().hashCode());
		result = 37 * result + (getMifidpretrlisthflcf() == null ? 0 : this.getMifidpretrlisthflcf().hashCode());
		result = 37 * result + (getMifidpretrlisthflp() == null ? 0 : this.getMifidpretrlisthflp().hashCode());
		result = 37 * result + (getMifidpretrlisthvl() == null ? 0 : this.getMifidpretrlisthvl().hashCode());
		result = 37 * result + (getMifidpretrlisthvlcf() == null ? 0 : this.getMifidpretrlisthvlcf().hashCode());
		result = 37 * result + (getMifidpretrlisthvlp() == null ? 0 : this.getMifidpretrlisthvlp().hashCode());
		result = 37 * result + (getMifidpretrlistrper() == null ? 0 : this.getMifidpretrlistrper().hashCode());
		result = 37 * result + (getMifidpretrlistrpercf() == null ? 0 : this.getMifidpretrlistrpercf().hashCode());
		result = 37 * result + (getMifidpretrlistrperp() == null ? 0 : this.getMifidpretrlistrperp().hashCode());
		result = 37 * result + (getMifidpretrsstithfl() == null ? 0 : this.getMifidpretrsstithfl().hashCode());
		result = 37 * result + (getMifidpretrsstithflcf() == null ? 0 : this.getMifidpretrsstithflcf().hashCode());
		result = 37 * result + (getMifidpretrsstithflp() == null ? 0 : this.getMifidpretrsstithflp().hashCode());
		result = 37 * result + (getMifidpretrsstithvl() == null ? 0 : this.getMifidpretrsstithvl().hashCode());
		result = 37 * result + (getMifidpretrsstithvlcf() == null ? 0 : this.getMifidpretrsstithvlcf().hashCode());
		result = 37 * result + (getMifidpretrsstithvlp() == null ? 0 : this.getMifidpretrsstithvlp().hashCode());
		result = 37 * result + (getMifidpretrsstitrper() == null ? 0 : this.getMifidpretrsstitrper().hashCode());
		result = 37 * result + (getMifidpretrsstitrpercf() == null ? 0 : this.getMifidpretrsstitrpercf().hashCode());
		result = 37 * result + (getMifidpretrsstitrperp() == null ? 0 : this.getMifidpretrsstitrperp().hashCode());
		result = 37 * result + (getMifidregulatedesma() == null ? 0 : this.getMifidregulatedesma().hashCode());
		result = 37 * result + (getMifidregulatedesmacf() == null ? 0 : this.getMifidregulatedesmacf().hashCode());
		result = 37 * result + (getMifidregulatedesmap() == null ? 0 : this.getMifidregulatedesmap().hashCode());
		result = 37 * result + (getMifidstmasizeesma() == null ? 0 : this.getMifidstmasizeesma().hashCode());
		result = 37 * result + (getMifidstmasizeesmacf() == null ? 0 : this.getMifidstmasizeesmacf().hashCode());
		result = 37 * result + (getMifidstmasizeesmap() == null ? 0 : this.getMifidstmasizeesmap().hashCode());
		result = 37 * result + (getMifidstmasizecurcode() == null ? 0 : this.getMifidstmasizecurcode().hashCode());
		result = 37 * result + (getMifidstmasizecurcodecf() == null ? 0 : this.getMifidstmasizecurcodecf().hashCode());
		result = 37 * result + (getMifidstmasizecurcodep() == null ? 0 : this.getMifidstmasizecurcodep().hashCode());
		result = 37 * result + (getMifidsubprod() == null ? 0 : this.getMifidsubprod().hashCode());
		result = 37 * result + (getMifidsubprodcf() == null ? 0 : this.getMifidsubprodcf().hashCode());
		result = 37 * result + (getMifidsubprodp() == null ? 0 : this.getMifidsubprodp().hashCode());
		result = 37 * result + (getMifidsubprodesma() == null ? 0 : this.getMifidsubprodesma().hashCode());
		result = 37 * result + (getMifidsubprodesmacf() == null ? 0 : this.getMifidsubprodesmacf().hashCode());
		result = 37 * result + (getMifidsubprodesmap() == null ? 0 : this.getMifidsubprodesmap().hashCode());
		result = 37 * result + (getMifidtermdate() == null ? 0 : this.getMifidtermdate().hashCode());
		result = 37 * result + (getMifidtermdatecf() == null ? 0 : this.getMifidtermdatecf().hashCode());
		result = 37 * result + (getMifidtermdatep() == null ? 0 : this.getMifidtermdatep().hashCode());
		result = 37 * result + (getMifidtermdateesma() == null ? 0 : this.getMifidtermdateesma().hashCode());
		result = 37 * result + (getMifidtermdateesmacf() == null ? 0 : this.getMifidtermdateesmacf().hashCode());
		result = 37 * result + (getMifidtermdateesmap() == null ? 0 : this.getMifidtermdateesmap().hashCode());
		result = 37 * result + (getMifidtrobflag() == null ? 0 : this.getMifidtrobflag().hashCode());
		result = 37 * result + (getMifidtrobflagcf() == null ? 0 : this.getMifidtrobflagcf().hashCode());
		result = 37 * result + (getMifidtrobflagp() == null ? 0 : this.getMifidtrobflagp().hashCode());
		result = 37 * result + (getMifidtradapdate() == null ? 0 : this.getMifidtradapdate().hashCode());
		result = 37 * result + (getMifidtradapdatecf() == null ? 0 : this.getMifidtradapdatecf().hashCode());
		result = 37 * result + (getMifidtradapdatep() == null ? 0 : this.getMifidtradapdatep().hashCode());
		result = 37 * result + (getMifidtradapdateesma() == null ? 0 : this.getMifidtradapdateesma().hashCode());
		result = 37 * result + (getMifidtradapdateesmacf() == null ? 0 : this.getMifidtradapdateesmacf().hashCode());
		result = 37 * result + (getMifidtradapdateesmap() == null ? 0 : this.getMifidtradapdateesmap().hashCode());
		result = 37 * result + (getMifidtradreqdate() == null ? 0 : this.getMifidtradreqdate().hashCode());
		result = 37 * result + (getMifidtradreqdatecf() == null ? 0 : this.getMifidtradreqdatecf().hashCode());
		result = 37 * result + (getMifidtradreqdatep() == null ? 0 : this.getMifidtradreqdatep().hashCode());
		result = 37 * result + (getMifidtradreqdateesma() == null ? 0 : this.getMifidtradreqdateesma().hashCode());
		result = 37 * result + (getMifidtradreqdateesmacf() == null ? 0 : this.getMifidtradreqdateesmacf().hashCode());
		result = 37 * result + (getMifidtradreqdateesmap() == null ? 0 : this.getMifidtradreqdateesmap().hashCode());
		result = 37 * result + (getMifidtrtype() == null ? 0 : this.getMifidtrtype().hashCode());
		result = 37 * result + (getMifidtrtypecf() == null ? 0 : this.getMifidtrtypecf().hashCode());
		result = 37 * result + (getMifidtrtypep() == null ? 0 : this.getMifidtrtypep().hashCode());
		result = 37 * result + (getMifidtrtypeesma() == null ? 0 : this.getMifidtrtypeesma().hashCode());
		result = 37 * result + (getMifidtrtypeesmacf() == null ? 0 : this.getMifidtrtypeesmacf().hashCode());
		result = 37 * result + (getMifidtrtypeesmap() == null ? 0 : this.getMifidtrtypeesmap().hashCode());
		result = 37 * result + (getMifidundindname() == null ? 0 : this.getMifidundindname().hashCode());
		result = 37 * result + (getMifidundindnamecf() == null ? 0 : this.getMifidundindnamecf().hashCode());
		result = 37 * result + (getMifidundindnamep() == null ? 0 : this.getMifidundindnamep().hashCode());
		result = 37 * result + (getMifidundindnameesma() == null ? 0 : this.getMifidundindnameesma().hashCode());
		result = 37 * result + (getMifidundindnameesmacf() == null ? 0 : this.getMifidundindnameesmacf().hashCode());
		result = 37 * result + (getMifidundindnameesmap() == null ? 0 : this.getMifidundindnameesmap().hashCode());
		result = 37 * result + (getMifidundindtermesma() == null ? 0 : this.getMifidundindtermesma().hashCode());
		result = 37 * result + (getMifidundindtermesmacf() == null ? 0 : this.getMifidundindtermesmacf().hashCode());
		result = 37 * result + (getMifidundindtermesmap() == null ? 0 : this.getMifidundindtermesmap().hashCode());
		result = 37 * result + (getMifidundtype() == null ? 0 : this.getMifidundtype().hashCode());
		result = 37 * result + (getMifidundtypecf() == null ? 0 : this.getMifidundtypecf().hashCode());
		result = 37 * result + (getMifidundtypep() == null ? 0 : this.getMifidundtypep().hashCode());
		result = 37 * result + (getMifiridentifier() == null ? 0 : this.getMifiridentifier().hashCode());
		result = 37 * result + (getMifiridentifiercf() == null ? 0 : this.getMifiridentifiercf().hashCode());
		result = 37 * result + (getMifiridentifierp() == null ? 0 : this.getMifiridentifierp().hashCode());
		result = 37 * result + (getMindenomination() == null ? 0 : this.getMindenomination().hashCode());
		result = 37 * result + (getMindenominationcf() == null ? 0 : this.getMindenominationcf().hashCode());
		result = 37 * result + (getMindenominationp() == null ? 0 : this.getMindenominationp().hashCode());
		result = 37 * result + (getNcaavdailyturnover() == null ? 0 : this.getNcaavdailyturnover().hashCode());
		result = 37 * result + (getNcaavdailyturnovercf() == null ? 0 : this.getNcaavdailyturnovercf().hashCode());
		result = 37 * result + (getNcaavdailyturnoverp() == null ? 0 : this.getNcaavdailyturnoverp().hashCode());
		result = 37 * result + (getNcaavdailyturncurcode() == null ? 0 : this.getNcaavdailyturncurcode().hashCode());
		result = 37 * result + (getNcaavdailyturncurcodecf() == null ? 0 : this.getNcaavdailyturncurcodecf().hashCode());
		result = 37 * result + (getNcaavdailyturncurcodep() == null ? 0 : this.getNcaavdailyturncurcodep().hashCode());
		result = 37 * result + (getNcafreefl() == null ? 0 : this.getNcafreefl().hashCode());
		result = 37 * result + (getNcafreeflcf() == null ? 0 : this.getNcafreeflcf().hashCode());
		result = 37 * result + (getNcafreeflp() == null ? 0 : this.getNcafreeflp().hashCode());
		result = 37 * result + (getNcafreeflcurcode() == null ? 0 : this.getNcafreeflcurcode().hashCode());
		result = 37 * result + (getNcafreeflcurcodecf() == null ? 0 : this.getNcafreeflcurcodecf().hashCode());
		result = 37 * result + (getNcafreeflcurcodep() == null ? 0 : this.getNcafreeflcurcodep().hashCode());
		result = 37 * result + (getNotionalcuresma() == null ? 0 : this.getNotionalcuresma().hashCode());
		result = 37 * result + (getNotionalcuresmacf() == null ? 0 : this.getNotionalcuresmacf().hashCode());
		result = 37 * result + (getNotionalcuresmap() == null ? 0 : this.getNotionalcuresmap().hashCode());
		result = 37 * result + (getOptionroot() == null ? 0 : this.getOptionroot().hashCode());
		result = 37 * result + (getOptionrootcf() == null ? 0 : this.getOptionrootcf().hashCode());
		result = 37 * result + (getOptionrootp() == null ? 0 : this.getOptionrootp().hashCode());
		result = 37 * result + (getPlaceholder() == null ? 0 : this.getPlaceholder().hashCode());
		result = 37 * result + (getPricemultiplieresma() == null ? 0 : this.getPricemultiplieresma().hashCode());
		result = 37 * result + (getPricemultiplieresmacf() == null ? 0 : this.getPricemultiplieresmacf().hashCode());
		result = 37 * result + (getPricemultiplieresmap() == null ? 0 : this.getPricemultiplieresmap().hashCode());
		result = 37 * result + (getPrtrmaquote() == null ? 0 : this.getPrtrmaquote().hashCode());
		result = 37 * result + (getPrtrmaquotecf() == null ? 0 : this.getPrtrmaquotecf().hashCode());
		result = 37 * result + (getPrtrmaquotep() == null ? 0 : this.getPrtrmaquotep().hashCode());
		result = 37 * result + (getQuotepermid() == null ? 0 : this.getQuotepermid().hashCode());
		result = 37 * result + (getQuotepermidcf() == null ? 0 : this.getQuotepermidcf().hashCode());
		result = 37 * result + (getQuotepermidp() == null ? 0 : this.getQuotepermidp().hashCode());
		result = 37 * result + (getReqfattbyissuer() == null ? 0 : this.getReqfattbyissuer().hashCode());
		result = 37 * result + (getReqfattbyissuercf() == null ? 0 : this.getReqfattbyissuercf().hashCode());
		result = 37 * result + (getReqfattbyissuerp() == null ? 0 : this.getReqfattbyissuerp().hashCode());
		result = 37 * result + (getReqfattbyissueresma() == null ? 0 : this.getReqfattbyissueresma().hashCode());
		result = 37 * result + (getReqfattbyissueresmacf() == null ? 0 : this.getReqfattbyissueresmacf().hashCode());
		result = 37 * result + (getReqfattbyissueresmap() == null ? 0 : this.getReqfattbyissueresmap().hashCode());
		result = 37 * result + (getSecuritydescription() == null ? 0 : this.getSecuritydescription().hashCode());
		result = 37 * result + (getSecuritydescriptioncf() == null ? 0 : this.getSecuritydescriptioncf().hashCode());
		result = 37 * result + (getSecuritydescriptionp() == null ? 0 : this.getSecuritydescriptionp().hashCode());
		result = 37 * result + (getStrikepriceesma() == null ? 0 : this.getStrikepriceesma().hashCode());
		result = 37 * result + (getStrikepriceesmacf() == null ? 0 : this.getStrikepriceesmacf().hashCode());
		result = 37 * result + (getStrikepriceesmap() == null ? 0 : this.getStrikepriceesmap().hashCode());
		result = 37 * result + (getStrikepricecuresma() == null ? 0 : this.getStrikepricecuresma().hashCode());
		result = 37 * result + (getStrikepricecuresmacf() == null ? 0 : this.getStrikepricecuresmacf().hashCode());
		result = 37 * result + (getStrikepricecuresmap() == null ? 0 : this.getStrikepricecuresmap().hashCode());
		result = 37 * result + (getSuscategoryesma() == null ? 0 : this.getSuscategoryesma().hashCode());
		result = 37 * result + (getSuscategoryesmacf() == null ? 0 : this.getSuscategoryesmacf().hashCode());
		result = 37 * result + (getSuscategoryesmap() == null ? 0 : this.getSuscategoryesmap().hashCode());
		result = 37 * result + (getSusendedonesma() == null ? 0 : this.getSusendedonesma().hashCode());
		result = 37 * result + (getSusendedonesmacf() == null ? 0 : this.getSusendedonesmacf().hashCode());
		result = 37 * result + (getSusendedonesmap() == null ? 0 : this.getSusendedonesmap().hashCode());
		result = 37 * result + (getSusongoingesma() == null ? 0 : this.getSusongoingesma().hashCode());
		result = 37 * result + (getSusongoingesmacf() == null ? 0 : this.getSusongoingesmacf().hashCode());
		result = 37 * result + (getSusongoingesmap() == null ? 0 : this.getSusongoingesmap().hashCode());
		result = 37 * result + (getSusratesma() == null ? 0 : this.getSusratesma().hashCode());
		result = 37 * result + (getSusratesmacf() == null ? 0 : this.getSusratesmacf().hashCode());
		result = 37 * result + (getSusratesmap() == null ? 0 : this.getSusratesmap().hashCode());
		result = 37 * result + (getSusstonesma() == null ? 0 : this.getSusstonesma().hashCode());
		result = 37 * result + (getSusstonesmacf() == null ? 0 : this.getSusstonesmacf().hashCode());
		result = 37 * result + (getSusstonesmap() == null ? 0 : this.getSusstonesmap().hashCode());
		result = 37 * result + (getTtlamissued() == null ? 0 : this.getTtlamissued().hashCode());
		result = 37 * result + (getTtlamissuedcf() == null ? 0 : this.getTtlamissuedcf().hashCode());
		result = 37 * result + (getTtlamissuedp() == null ? 0 : this.getTtlamissuedp().hashCode());
		result = 37 * result + (getTtleutu12moesma() == null ? 0 : this.getTtleutu12moesma().hashCode());
		result = 37 * result + (getTtleutu12moesmacf() == null ? 0 : this.getTtleutu12moesmacf().hashCode());
		result = 37 * result + (getTtleutu12moesmap() == null ? 0 : this.getTtleutu12moesmap().hashCode());
		result = 37 * result + (getTtleuvl12moesma() == null ? 0 : this.getTtleuvl12moesma().hashCode());
		result = 37 * result + (getTtleuvl12moesmacf() == null ? 0 : this.getTtleuvl12moesmacf().hashCode());
		result = 37 * result + (getTtleuvl12moesmap() == null ? 0 : this.getTtleuvl12moesmap().hashCode());
		result = 37 * result + (getUndeeaelig() == null ? 0 : this.getUndeeaelig().hashCode());
		result = 37 * result + (getUndeeaeligcf() == null ? 0 : this.getUndeeaeligcf().hashCode());
		result = 37 * result + (getUndeeaeligp() == null ? 0 : this.getUndeeaeligp().hashCode());
		result = 37 * result + (getUndisin() == null ? 0 : this.getUndisin().hashCode());
		result = 37 * result + (getUndisincf() == null ? 0 : this.getUndisincf().hashCode());
		result = 37 * result + (getUndisinp() == null ? 0 : this.getUndisinp().hashCode());
		result = 37 * result + (getUndisinesma() == null ? 0 : this.getUndisinesma().hashCode());
		result = 37 * result + (getUndisinesmacf() == null ? 0 : this.getUndisinesmacf().hashCode());
		result = 37 * result + (getUndisinesmap() == null ? 0 : this.getUndisinesmap().hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[action=");
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
		builder.append(", assetstatuscf=");
		builder.append(assetstatuscf);
		builder.append(", assetstatusp=");
		builder.append(assetstatusp);
		builder.append(", basketundisinlist=");
		builder.append(basketundisinlist);
		builder.append(", basketundisinlistcf=");
		builder.append(basketundisinlistcf);
		builder.append(", basketundisinlistp=");
		builder.append(basketundisinlistp);
		builder.append(", basketwrrindicator=");
		builder.append(basketwrrindicator);
		builder.append(", basketwrrindicatorcf=");
		builder.append(basketwrrindicatorcf);
		builder.append(", basketwrrindicatorp=");
		builder.append(basketwrrindicatorp);
		builder.append(", cficode=");
		builder.append(cficode);
		builder.append(", cficodecf=");
		builder.append(cficodecf);
		builder.append(", cficodep=");
		builder.append(cficodep);
		builder.append(", cincode=");
		builder.append(cincode);
		builder.append(", cincodecf=");
		builder.append(cincodecf);
		builder.append(", cincodep=");
		builder.append(cincodep);
		builder.append(", complegaldomicile=");
		builder.append(complegaldomicile);
		builder.append(", complegaldomicilecf=");
		builder.append(complegaldomicilecf);
		builder.append(", complegaldomicilep=");
		builder.append(complegaldomicilep);
		builder.append(", compshortname=");
		builder.append(compshortname);
		builder.append(", compshortnamecf=");
		builder.append(compshortnamecf);
		builder.append(", compshortnamep=");
		builder.append(compshortnamep);
		builder.append(", dealstartdate=");
		builder.append(dealstartdate);
		builder.append(", dealstartdatecf=");
		builder.append(dealstartdatecf);
		builder.append(", dealstartdatep=");
		builder.append(dealstartdatep);
		builder.append(", eeavenueelflg=");
		builder.append(eeavenueelflg);
		builder.append(", eeavenueelflgcf=");
		builder.append(eeavenueelflgcf);
		builder.append(", eeavenueelflgp=");
		builder.append(eeavenueelflgp);
		builder.append(", fininsshname=");
		builder.append(fininsshname);
		builder.append(", fininsshnamecf=");
		builder.append(fininsshnamecf);
		builder.append(", fininsshnamep=");
		builder.append(fininsshnamep);
		builder.append(", fininsshnameesma=");
		builder.append(fininsshnameesma);
		builder.append(", fininsshnameesmacf=");
		builder.append(fininsshnameesmacf);
		builder.append(", fininsshnameesmap=");
		builder.append(fininsshnameesmap);
		builder.append(", inesmafirds=");
		builder.append(inesmafirds);
		builder.append(", inesmafirdscf=");
		builder.append(inesmafirdscf);
		builder.append(", inesmafirdsp=");
		builder.append(inesmafirdsp);
		builder.append(", insclassesma=");
		builder.append(insclassesma);
		builder.append(", insclassesmacf=");
		builder.append(insclassesmacf);
		builder.append(", insclassesmap=");
		builder.append(insclassesmap);
		builder.append(", insfullnameesma=");
		builder.append(insfullnameesma);
		builder.append(", insfullnameesmacf=");
		builder.append(insfullnameesmacf);
		builder.append(", insfullnameesmap=");
		builder.append(insfullnameesmap);
		builder.append(", isin=");
		builder.append(isin);
		builder.append(", isincf=");
		builder.append(isincf);
		builder.append(", isinp=");
		builder.append(isinp);
		builder.append(", issuedate=");
		builder.append(issuedate);
		builder.append(", issuedatecf=");
		builder.append(issuedatecf);
		builder.append(", issuedatep=");
		builder.append(issuedatep);
		builder.append(", issuerlei=");
		builder.append(issuerlei);
		builder.append(", issuerleicf=");
		builder.append(issuerleicf);
		builder.append(", issuerleip=");
		builder.append(issuerleip);
		builder.append(", issortrvenueleiesma=");
		builder.append(issortrvenueleiesma);
		builder.append(", issortrvenueleiesmacf=");
		builder.append(issortrvenueleiesmacf);
		builder.append(", issortrvenueleiesmap=");
		builder.append(issortrvenueleiesmap);
		builder.append(", mrkattsrcpermid=");
		builder.append(mrkattsrcpermid);
		builder.append(", mrkattsrcpermidcf=");
		builder.append(mrkattsrcpermidcf);
		builder.append(", mrkattsrcpermidp=");
		builder.append(mrkattsrcpermidp);
		builder.append(", marketmic=");
		builder.append(marketmic);
		builder.append(", marketmiccf=");
		builder.append(marketmiccf);
		builder.append(", marketmicp=");
		builder.append(marketmicp);
		builder.append(", maturitydate=");
		builder.append(maturitydate);
		builder.append(", maturitydatecf=");
		builder.append(maturitydatecf);
		builder.append(", maturitydatep=");
		builder.append(maturitydatep);
		builder.append(", mifidasclofun=");
		builder.append(mifidasclofun);
		builder.append(", mifidasclofuncf=");
		builder.append(mifidasclofuncf);
		builder.append(", mifidasclofunp=");
		builder.append(mifidasclofunp);
		builder.append(", mifidadnapinsesma=");
		builder.append(mifidadnapinsesma);
		builder.append(", mifidadnapinsesmacf=");
		builder.append(mifidadnapinsesmacf);
		builder.append(", mifidadnapinsesmap=");
		builder.append(mifidadnapinsesmap);
		builder.append(", mifidadnoftpinsesma=");
		builder.append(mifidadnoftpinsesma);
		builder.append(", mifidadnoftpinsesmacf=");
		builder.append(mifidadnoftpinsesmacf);
		builder.append(", mifidadnoftpinsesmap=");
		builder.append(mifidadnoftpinsesmap);
		builder.append(", mifidavdatuesma=");
		builder.append(mifidavdatuesma);
		builder.append(", mifidavdatuesmacf=");
		builder.append(mifidavdatuesmacf);
		builder.append(", mifidavdatuesmap=");
		builder.append(mifidavdatuesmap);
		builder.append(", mifidavdatucurcode=");
		builder.append(mifidavdatucurcode);
		builder.append(", mifidavdatucurcodecf=");
		builder.append(mifidavdatucurcodecf);
		builder.append(", mifidavdatucurcodep=");
		builder.append(mifidavdatucurcodep);
		builder.append(", mifidavvaoftresma=");
		builder.append(mifidavvaoftresma);
		builder.append(", mifidavvaoftresmacf=");
		builder.append(mifidavvaoftresmacf);
		builder.append(", mifidavvaoftresmap=");
		builder.append(mifidavvaoftresmap);
		builder.append(", mifidavvaoftrcurcode=");
		builder.append(mifidavvaoftrcurcode);
		builder.append(", mifidavvaoftrcurcodecf=");
		builder.append(mifidavvaoftrcurcodecf);
		builder.append(", mifidavvaoftrcurcodep=");
		builder.append(mifidavvaoftrcurcodep);
		builder.append(", mifidbaseprod=");
		builder.append(mifidbaseprod);
		builder.append(", mifidbaseprodcf=");
		builder.append(mifidbaseprodcf);
		builder.append(", mifidbaseprodp=");
		builder.append(mifidbaseprodp);
		builder.append(", mifidbaseprodesma=");
		builder.append(mifidbaseprodesma);
		builder.append(", mifidbaseprodesmacf=");
		builder.append(mifidbaseprodesmacf);
		builder.append(", mifidbaseprodesmap=");
		builder.append(mifidbaseprodesmap);
		builder.append(", mifidbondseni=");
		builder.append(mifidbondseni);
		builder.append(", mifidbondsenicf=");
		builder.append(mifidbondsenicf);
		builder.append(", mifidbondsenip=");
		builder.append(mifidbondsenip);
		builder.append(", mifidbondtype=");
		builder.append(mifidbondtype);
		builder.append(", mifidbondtypecf=");
		builder.append(mifidbondtypecf);
		builder.append(", mifidbondtypep=");
		builder.append(mifidbondtypep);
		builder.append(", mifidclobflag=");
		builder.append(mifidclobflag);
		builder.append(", mifidclobflagcf=");
		builder.append(mifidclobflagcf);
		builder.append(", mifidclobflagp=");
		builder.append(mifidclobflagp);
		builder.append(", mifidcofialiinfornewbo=");
		builder.append(mifidcofialiinfornewbo);
		builder.append(", mifidcofialiinfornewbocf=");
		builder.append(mifidcofialiinfornewbocf);
		builder.append(", mifidcofialiinfornewbop=");
		builder.append(mifidcofialiinfornewbop);
		builder.append(", mifidcodein=");
		builder.append(mifidcodein);
		builder.append(", mifidcodeincf=");
		builder.append(mifidcodeincf);
		builder.append(", mifidcodeinp=");
		builder.append(mifidcodeinp);
		builder.append(", mifidcodeinesma=");
		builder.append(mifidcodeinesma);
		builder.append(", mifidcodeinesmacf=");
		builder.append(mifidcodeinesmacf);
		builder.append(", mifidcodeinesmap=");
		builder.append(mifidcodeinesmap);
		builder.append(", mifidcoinflesma=");
		builder.append(mifidcoinflesma);
		builder.append(", mifidcoinflesmacf=");
		builder.append(mifidcoinflesmacf);
		builder.append(", mifidcoinflesmap=");
		builder.append(mifidcoinflesmap);
		builder.append(", mifidcoinre=");
		builder.append(mifidcoinre);
		builder.append(", mifidcoinrecf=");
		builder.append(mifidcoinrecf);
		builder.append(", mifidcoinrep=");
		builder.append(mifidcoinrep);
		builder.append(", mifidcotype=");
		builder.append(mifidcotype);
		builder.append(", mifidcotypecf=");
		builder.append(mifidcotypecf);
		builder.append(", mifidcotypep=");
		builder.append(mifidcotypep);
		builder.append(", mifiddeltypeesma=");
		builder.append(mifiddeltypeesma);
		builder.append(", mifiddeltypeesmacf=");
		builder.append(mifiddeltypeesmacf);
		builder.append(", mifiddeltypeesmap=");
		builder.append(mifiddeltypeesmap);
		builder.append(", mifidemalsubtype=");
		builder.append(mifidemalsubtype);
		builder.append(", mifidemalsubtypecf=");
		builder.append(mifidemalsubtypecf);
		builder.append(", mifidemalsubtypep=");
		builder.append(mifidemalsubtypep);
		builder.append(", mifidexerstyle=");
		builder.append(mifidexerstyle);
		builder.append(", mifidexerstylecf=");
		builder.append(mifidexerstylecf);
		builder.append(", mifidexerstylep=");
		builder.append(mifidexerstylep);
		builder.append(", mifidexerstyleesma=");
		builder.append(mifidexerstyleesma);
		builder.append(", mifidexerstyleesmacf=");
		builder.append(mifidexerstyleesmacf);
		builder.append(", mifidexerstyleesmap=");
		builder.append(mifidexerstyleesmap);
		builder.append(", mifidexpdateesma=");
		builder.append(mifidexpdateesma);
		builder.append(", mifidexpdateesmacf=");
		builder.append(mifidexpdateesmacf);
		builder.append(", mifidexpdateesmap=");
		builder.append(mifidexpdateesmap);
		builder.append(", mifidfiprtype=");
		builder.append(mifidfiprtype);
		builder.append(", mifidfiprtypecf=");
		builder.append(mifidfiprtypecf);
		builder.append(", mifidfiprtypep=");
		builder.append(mifidfiprtypep);
		builder.append(", mifidfiprtypeesma=");
		builder.append(mifidfiprtypeesma);
		builder.append(", mifidfiprtypeesmacf=");
		builder.append(mifidfiprtypeesmacf);
		builder.append(", mifidfiprtypeesmap=");
		builder.append(mifidfiprtypeesmap);
		builder.append(", mifidfrtradedate=");
		builder.append(mifidfrtradedate);
		builder.append(", mifidfrtradedatecf=");
		builder.append(mifidfrtradedatecf);
		builder.append(", mifidfrtradedatep=");
		builder.append(mifidfrtradedatep);
		builder.append(", mifidfrtradedateesma=");
		builder.append(mifidfrtradedateesma);
		builder.append(", mifidfrtradedateesmacf=");
		builder.append(mifidfrtradedateesmacf);
		builder.append(", mifidfrtradedateesmap=");
		builder.append(mifidfrtradedateesmap);
		builder.append(", mifidflag=");
		builder.append(mifidflag);
		builder.append(", mifidflagcf=");
		builder.append(mifidflagcf);
		builder.append(", mifidflagp=");
		builder.append(mifidflagp);
		builder.append(", mifidfrfloatesma=");
		builder.append(mifidfrfloatesma);
		builder.append(", mifidfrfloatesmacf=");
		builder.append(mifidfrfloatesmacf);
		builder.append(", mifidfrfloatesmap=");
		builder.append(mifidfrfloatesmap);
		builder.append(", mifidfrfloatcurcode=");
		builder.append(mifidfrfloatcurcode);
		builder.append(", mifidfrfloatcurcodecf=");
		builder.append(mifidfrfloatcurcodecf);
		builder.append(", mifidfrfloatcurcodep=");
		builder.append(mifidfrfloatcurcodep);
		builder.append(", mifidfusubpr=");
		builder.append(mifidfusubpr);
		builder.append(", mifidfusubprcf=");
		builder.append(mifidfusubprcf);
		builder.append(", mifidfusubprp=");
		builder.append(mifidfusubprp);
		builder.append(", mifidfusubpresma=");
		builder.append(mifidfusubpresma);
		builder.append(", mifidfusubpresmacf=");
		builder.append(mifidfusubpresmacf);
		builder.append(", mifidfusubpresmap=");
		builder.append(mifidfusubpresmap);
		builder.append(", mifidissdateesma=");
		builder.append(mifidissdateesma);
		builder.append(", mifidissdateesmacf=");
		builder.append(mifidissdateesmacf);
		builder.append(", mifidissdateesmap=");
		builder.append(mifidissdateesmap);
		builder.append(", mifidisssizeesma=");
		builder.append(mifidisssizeesma);
		builder.append(", mifidisssizeesmacf=");
		builder.append(mifidisssizeesmacf);
		builder.append(", mifidisssizeesmap=");
		builder.append(mifidisssizeesmap);
		builder.append(", mifidmatdate=");
		builder.append(mifidmatdate);
		builder.append(", mifidmatdatecf=");
		builder.append(mifidmatdatecf);
		builder.append(", mifidmatdatep=");
		builder.append(mifidmatdatep);
		builder.append(", mifidmatdateesma=");
		builder.append(mifidmatdateesma);
		builder.append(", mifidmatdateesmacf=");
		builder.append(mifidmatdateesmacf);
		builder.append(", mifidmatdateesmap=");
		builder.append(mifidmatdateesmap);
		builder.append(", mifidmostremaesma=");
		builder.append(mifidmostremaesma);
		builder.append(", mifidmostremaesmacf=");
		builder.append(mifidmostremaesmacf);
		builder.append(", mifidmostremaesmap=");
		builder.append(mifidmostremaesmap);
		builder.append(", mifidoptype=");
		builder.append(mifidoptype);
		builder.append(", mifidoptypecf=");
		builder.append(mifidoptypecf);
		builder.append(", mifidoptypep=");
		builder.append(mifidoptypep);
		builder.append(", mifidoptypeesma=");
		builder.append(mifidoptypeesma);
		builder.append(", mifidoptypeesmacf=");
		builder.append(mifidoptypeesmacf);
		builder.append(", mifidoptypeesmap=");
		builder.append(mifidoptypeesmap);
		builder.append(", mifidptuw12esma=");
		builder.append(mifidptuw12esma);
		builder.append(", mifidptuw12esmacf=");
		builder.append(mifidptuw12esmacf);
		builder.append(", mifidptuw12esmap=");
		builder.append(mifidptuw12esmap);
		builder.append(", mifidptuwptv12mesma=");
		builder.append(mifidptuwptv12mesma);
		builder.append(", mifidptuwptv12mesmacf=");
		builder.append(mifidptuwptv12mesmacf);
		builder.append(", mifidptuwptv12mesmap=");
		builder.append(mifidptuwptv12mesmap);
		builder.append(", mifidpotrlisthfl=");
		builder.append(mifidpotrlisthfl);
		builder.append(", mifidpotrlisthflcf=");
		builder.append(mifidpotrlisthflcf);
		builder.append(", mifidpotrlisthflp=");
		builder.append(mifidpotrlisthflp);
		builder.append(", mifidpotrlisthvl=");
		builder.append(mifidpotrlisthvl);
		builder.append(", mifidpotrlisthvlcf=");
		builder.append(mifidpotrlisthvlcf);
		builder.append(", mifidpotrlisthvlp=");
		builder.append(mifidpotrlisthvlp);
		builder.append(", mifidpotrlistrper=");
		builder.append(mifidpotrlistrper);
		builder.append(", mifidpotrlistrpercf=");
		builder.append(mifidpotrlistrpercf);
		builder.append(", mifidpotrlistrperp=");
		builder.append(mifidpotrlistrperp);
		builder.append(", mifidpotrlisvoper=");
		builder.append(mifidpotrlisvoper);
		builder.append(", mifidpotrlisvopercf=");
		builder.append(mifidpotrlisvopercf);
		builder.append(", mifidpotrlisvoperp=");
		builder.append(mifidpotrlisvoperp);
		builder.append(", mifidpotrsstithfl=");
		builder.append(mifidpotrsstithfl);
		builder.append(", mifidpotrsstithflcf=");
		builder.append(mifidpotrsstithflcf);
		builder.append(", mifidpotrsstithflp=");
		builder.append(mifidpotrsstithflp);
		builder.append(", mifidpotrsstithvl=");
		builder.append(mifidpotrsstithvl);
		builder.append(", mifidpotrsstithvlcf=");
		builder.append(mifidpotrsstithvlcf);
		builder.append(", mifidpotrsstithvlp=");
		builder.append(mifidpotrsstithvlp);
		builder.append(", mifidpotrsstitrper=");
		builder.append(mifidpotrsstitrper);
		builder.append(", mifidpotrsstitrpercf=");
		builder.append(mifidpotrsstitrpercf);
		builder.append(", mifidpotrsstitrperp=");
		builder.append(mifidpotrsstitrperp);
		builder.append(", mifidpotrsstivoper=");
		builder.append(mifidpotrsstivoper);
		builder.append(", mifidpotrsstivopercf=");
		builder.append(mifidpotrsstivopercf);
		builder.append(", mifidpotrsstivoperp=");
		builder.append(mifidpotrsstivoperp);
		builder.append(", mifidpretrlisthfl=");
		builder.append(mifidpretrlisthfl);
		builder.append(", mifidpretrlisthflcf=");
		builder.append(mifidpretrlisthflcf);
		builder.append(", mifidpretrlisthflp=");
		builder.append(mifidpretrlisthflp);
		builder.append(", mifidpretrlisthvl=");
		builder.append(mifidpretrlisthvl);
		builder.append(", mifidpretrlisthvlcf=");
		builder.append(mifidpretrlisthvlcf);
		builder.append(", mifidpretrlisthvlp=");
		builder.append(mifidpretrlisthvlp);
		builder.append(", mifidpretrlistrper=");
		builder.append(mifidpretrlistrper);
		builder.append(", mifidpretrlistrpercf=");
		builder.append(mifidpretrlistrpercf);
		builder.append(", mifidpretrlistrperp=");
		builder.append(mifidpretrlistrperp);
		builder.append(", mifidpretrsstithfl=");
		builder.append(mifidpretrsstithfl);
		builder.append(", mifidpretrsstithflcf=");
		builder.append(mifidpretrsstithflcf);
		builder.append(", mifidpretrsstithflp=");
		builder.append(mifidpretrsstithflp);
		builder.append(", mifidpretrsstithvl=");
		builder.append(mifidpretrsstithvl);
		builder.append(", mifidpretrsstithvlcf=");
		builder.append(mifidpretrsstithvlcf);
		builder.append(", mifidpretrsstithvlp=");
		builder.append(mifidpretrsstithvlp);
		builder.append(", mifidpretrsstitrper=");
		builder.append(mifidpretrsstitrper);
		builder.append(", mifidpretrsstitrpercf=");
		builder.append(mifidpretrsstitrpercf);
		builder.append(", mifidpretrsstitrperp=");
		builder.append(mifidpretrsstitrperp);
		builder.append(", mifidregulatedesma=");
		builder.append(mifidregulatedesma);
		builder.append(", mifidregulatedesmacf=");
		builder.append(mifidregulatedesmacf);
		builder.append(", mifidregulatedesmap=");
		builder.append(mifidregulatedesmap);
		builder.append(", mifidstmasizeesma=");
		builder.append(mifidstmasizeesma);
		builder.append(", mifidstmasizeesmacf=");
		builder.append(mifidstmasizeesmacf);
		builder.append(", mifidstmasizeesmap=");
		builder.append(mifidstmasizeesmap);
		builder.append(", mifidstmasizecurcode=");
		builder.append(mifidstmasizecurcode);
		builder.append(", mifidstmasizecurcodecf=");
		builder.append(mifidstmasizecurcodecf);
		builder.append(", mifidstmasizecurcodep=");
		builder.append(mifidstmasizecurcodep);
		builder.append(", mifidsubprod=");
		builder.append(mifidsubprod);
		builder.append(", mifidsubprodcf=");
		builder.append(mifidsubprodcf);
		builder.append(", mifidsubprodp=");
		builder.append(mifidsubprodp);
		builder.append(", mifidsubprodesma=");
		builder.append(mifidsubprodesma);
		builder.append(", mifidsubprodesmacf=");
		builder.append(mifidsubprodesmacf);
		builder.append(", mifidsubprodesmap=");
		builder.append(mifidsubprodesmap);
		builder.append(", mifidtermdate=");
		builder.append(mifidtermdate);
		builder.append(", mifidtermdatecf=");
		builder.append(mifidtermdatecf);
		builder.append(", mifidtermdatep=");
		builder.append(mifidtermdatep);
		builder.append(", mifidtermdateesma=");
		builder.append(mifidtermdateesma);
		builder.append(", mifidtermdateesmacf=");
		builder.append(mifidtermdateesmacf);
		builder.append(", mifidtermdateesmap=");
		builder.append(mifidtermdateesmap);
		builder.append(", mifidtrobflag=");
		builder.append(mifidtrobflag);
		builder.append(", mifidtrobflagcf=");
		builder.append(mifidtrobflagcf);
		builder.append(", mifidtrobflagp=");
		builder.append(mifidtrobflagp);
		builder.append(", mifidtradapdate=");
		builder.append(mifidtradapdate);
		builder.append(", mifidtradapdatecf=");
		builder.append(mifidtradapdatecf);
		builder.append(", mifidtradapdatep=");
		builder.append(mifidtradapdatep);
		builder.append(", mifidtradapdateesma=");
		builder.append(mifidtradapdateesma);
		builder.append(", mifidtradapdateesmacf=");
		builder.append(mifidtradapdateesmacf);
		builder.append(", mifidtradapdateesmap=");
		builder.append(mifidtradapdateesmap);
		builder.append(", mifidtradreqdate=");
		builder.append(mifidtradreqdate);
		builder.append(", mifidtradreqdatecf=");
		builder.append(mifidtradreqdatecf);
		builder.append(", mifidtradreqdatep=");
		builder.append(mifidtradreqdatep);
		builder.append(", mifidtradreqdateesma=");
		builder.append(mifidtradreqdateesma);
		builder.append(", mifidtradreqdateesmacf=");
		builder.append(mifidtradreqdateesmacf);
		builder.append(", mifidtradreqdateesmap=");
		builder.append(mifidtradreqdateesmap);
		builder.append(", mifidtrtype=");
		builder.append(mifidtrtype);
		builder.append(", mifidtrtypecf=");
		builder.append(mifidtrtypecf);
		builder.append(", mifidtrtypep=");
		builder.append(mifidtrtypep);
		builder.append(", mifidtrtypeesma=");
		builder.append(mifidtrtypeesma);
		builder.append(", mifidtrtypeesmacf=");
		builder.append(mifidtrtypeesmacf);
		builder.append(", mifidtrtypeesmap=");
		builder.append(mifidtrtypeesmap);
		builder.append(", mifidundindname=");
		builder.append(mifidundindname);
		builder.append(", mifidundindnamecf=");
		builder.append(mifidundindnamecf);
		builder.append(", mifidundindnamep=");
		builder.append(mifidundindnamep);
		builder.append(", mifidundindnameesma=");
		builder.append(mifidundindnameesma);
		builder.append(", mifidundindnameesmacf=");
		builder.append(mifidundindnameesmacf);
		builder.append(", mifidundindnameesmap=");
		builder.append(mifidundindnameesmap);
		builder.append(", mifidundindtermesma=");
		builder.append(mifidundindtermesma);
		builder.append(", mifidundindtermesmacf=");
		builder.append(mifidundindtermesmacf);
		builder.append(", mifidundindtermesmap=");
		builder.append(mifidundindtermesmap);
		builder.append(", mifidundtype=");
		builder.append(mifidundtype);
		builder.append(", mifidundtypecf=");
		builder.append(mifidundtypecf);
		builder.append(", mifidundtypep=");
		builder.append(mifidundtypep);
		builder.append(", mifiridentifier=");
		builder.append(mifiridentifier);
		builder.append(", mifiridentifiercf=");
		builder.append(mifiridentifiercf);
		builder.append(", mifiridentifierp=");
		builder.append(mifiridentifierp);
		builder.append(", mindenomination=");
		builder.append(mindenomination);
		builder.append(", mindenominationcf=");
		builder.append(mindenominationcf);
		builder.append(", mindenominationp=");
		builder.append(mindenominationp);
		builder.append(", ncaavdailyturnover=");
		builder.append(ncaavdailyturnover);
		builder.append(", ncaavdailyturnovercf=");
		builder.append(ncaavdailyturnovercf);
		builder.append(", ncaavdailyturnoverp=");
		builder.append(ncaavdailyturnoverp);
		builder.append(", ncaavdailyturncurcode=");
		builder.append(ncaavdailyturncurcode);
		builder.append(", ncaavdailyturncurcodecf=");
		builder.append(ncaavdailyturncurcodecf);
		builder.append(", ncaavdailyturncurcodep=");
		builder.append(ncaavdailyturncurcodep);
		builder.append(", ncafreefl=");
		builder.append(ncafreefl);
		builder.append(", ncafreeflcf=");
		builder.append(ncafreeflcf);
		builder.append(", ncafreeflp=");
		builder.append(ncafreeflp);
		builder.append(", ncafreeflcurcode=");
		builder.append(ncafreeflcurcode);
		builder.append(", ncafreeflcurcodecf=");
		builder.append(ncafreeflcurcodecf);
		builder.append(", ncafreeflcurcodep=");
		builder.append(ncafreeflcurcodep);
		builder.append(", notionalcuresma=");
		builder.append(notionalcuresma);
		builder.append(", notionalcuresmacf=");
		builder.append(notionalcuresmacf);
		builder.append(", notionalcuresmap=");
		builder.append(notionalcuresmap);
		builder.append(", optionroot=");
		builder.append(optionroot);
		builder.append(", optionrootcf=");
		builder.append(optionrootcf);
		builder.append(", optionrootp=");
		builder.append(optionrootp);
		builder.append(", placeholder=");
		builder.append(placeholder);
		builder.append(", pricemultiplieresma=");
		builder.append(pricemultiplieresma);
		builder.append(", pricemultiplieresmacf=");
		builder.append(pricemultiplieresmacf);
		builder.append(", pricemultiplieresmap=");
		builder.append(pricemultiplieresmap);
		builder.append(", prtrmaquote=");
		builder.append(prtrmaquote);
		builder.append(", prtrmaquotecf=");
		builder.append(prtrmaquotecf);
		builder.append(", prtrmaquotep=");
		builder.append(prtrmaquotep);
		builder.append(", quotepermid=");
		builder.append(quotepermid);
		builder.append(", quotepermidcf=");
		builder.append(quotepermidcf);
		builder.append(", quotepermidp=");
		builder.append(quotepermidp);
		builder.append(", reqfattbyissuer=");
		builder.append(reqfattbyissuer);
		builder.append(", reqfattbyissuercf=");
		builder.append(reqfattbyissuercf);
		builder.append(", reqfattbyissuerp=");
		builder.append(reqfattbyissuerp);
		builder.append(", reqfattbyissueresma=");
		builder.append(reqfattbyissueresma);
		builder.append(", reqfattbyissueresmacf=");
		builder.append(reqfattbyissueresmacf);
		builder.append(", reqfattbyissueresmap=");
		builder.append(reqfattbyissueresmap);
		builder.append(", securitydescription=");
		builder.append(securitydescription);
		builder.append(", securitydescriptioncf=");
		builder.append(securitydescriptioncf);
		builder.append(", securitydescriptionp=");
		builder.append(securitydescriptionp);
		builder.append(", strikepriceesma=");
		builder.append(strikepriceesma);
		builder.append(", strikepriceesmacf=");
		builder.append(strikepriceesmacf);
		builder.append(", strikepriceesmap=");
		builder.append(strikepriceesmap);
		builder.append(", strikepricecuresma=");
		builder.append(strikepricecuresma);
		builder.append(", strikepricecuresmacf=");
		builder.append(strikepricecuresmacf);
		builder.append(", strikepricecuresmap=");
		builder.append(strikepricecuresmap);
		builder.append(", suscategoryesma=");
		builder.append(suscategoryesma);
		builder.append(", suscategoryesmacf=");
		builder.append(suscategoryesmacf);
		builder.append(", suscategoryesmap=");
		builder.append(suscategoryesmap);
		builder.append(", susendedonesma=");
		builder.append(susendedonesma);
		builder.append(", susendedonesmacf=");
		builder.append(susendedonesmacf);
		builder.append(", susendedonesmap=");
		builder.append(susendedonesmap);
		builder.append(", susongoingesma=");
		builder.append(susongoingesma);
		builder.append(", susongoingesmacf=");
		builder.append(susongoingesmacf);
		builder.append(", susongoingesmap=");
		builder.append(susongoingesmap);
		builder.append(", susratesma=");
		builder.append(susratesma);
		builder.append(", susratesmacf=");
		builder.append(susratesmacf);
		builder.append(", susratesmap=");
		builder.append(susratesmap);
		builder.append(", susstonesma=");
		builder.append(susstonesma);
		builder.append(", susstonesmacf=");
		builder.append(susstonesmacf);
		builder.append(", susstonesmap=");
		builder.append(susstonesmap);
		builder.append(", ttlamissued=");
		builder.append(ttlamissued);
		builder.append(", ttlamissuedcf=");
		builder.append(ttlamissuedcf);
		builder.append(", ttlamissuedp=");
		builder.append(ttlamissuedp);
		builder.append(", ttleutu12moesma=");
		builder.append(ttleutu12moesma);
		builder.append(", ttleutu12moesmacf=");
		builder.append(ttleutu12moesmacf);
		builder.append(", ttleutu12moesmap=");
		builder.append(ttleutu12moesmap);
		builder.append(", ttleuvl12moesma=");
		builder.append(ttleuvl12moesma);
		builder.append(", ttleuvl12moesmacf=");
		builder.append(ttleuvl12moesmacf);
		builder.append(", ttleuvl12moesmap=");
		builder.append(ttleuvl12moesmap);
		builder.append(", undeeaelig=");
		builder.append(undeeaelig);
		builder.append(", undeeaeligcf=");
		builder.append(undeeaeligcf);
		builder.append(", undeeaeligp=");
		builder.append(undeeaeligp);
		builder.append(", undisin=");
		builder.append(undisin);
		builder.append(", undisincf=");
		builder.append(undisincf);
		builder.append(", undisinp=");
		builder.append(undisinp);
		builder.append(", undisinesma=");
		builder.append(undisinesma);
		builder.append(", undisinesmacf=");
		builder.append(undisinesmacf);
		builder.append(", undisinesmap=");
		builder.append(undisinesmap);
		builder.append("]");
		return builder.toString();
	}

}
