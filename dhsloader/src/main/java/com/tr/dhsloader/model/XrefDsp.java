package com.tr.dhsloader.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Thomson Reuters
 * 
 */
@Entity
@Table(name = "XRef_DSP1", schema="dbo")
public class XrefDsp implements java.io.Serializable {

	private static final long serialVersionUID = -8069713917374599924L;

	private long dhsid;
	private String ipc;
	private String assetstatus;
	private String basketundisinlist;
	private String basketwrrindicator;
	private String cincode;
	private String complegaldomicile;
	private String compshortname;
	private Integer dealstartdate;
	private String eeavenueelflg;
	private String fininsshnameesma;
	private String inesmafirds;
	private String insclassesma;
	private String insfullnameesma;
	private Integer issuedate;
	private String issortrvenueleiesma;
	private BigDecimal mrkattsrcpermid;
	private Integer maturitydate;
	private String mifidasclofun;
	private BigDecimal mifidadnapinsesma;
	private BigDecimal mifidadnoftpinsesma;
	private BigDecimal mifidavdatuesma;
	private String mifidavdatucurcode;
	private BigDecimal mifidavvaoftresma;
	private BigDecimal mifidavvaoftrcurcode;
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
	private Integer mifidexpdateesma;
	private String mifidfiprtype;
	private String mifidfiprtypeesma;
	private Integer mifidfrtradedate;
	private Integer mifidfrtradedateesma;
	private String mifidflag;
	private BigDecimal mifidfrfloatesma;
	private String mifidfrfloatcurcode;
	private String mifidfusubpr;
	private String mifidfusubpresma;
	private Long mifidissdateesma;
	private BigDecimal mifidisssizeesma;
	private Integer mifidmatdate;
	private Integer mifidmatdateesma;
	private String mifidmostremaesma;
	private String mifidoptype;
	private String mifidoptypeesma;
	private BigDecimal mifidptuw12esma;
	private BigDecimal mifidptuwptv12mesma;
	private Long mifidpotrlisthfl;
	private Long mifidpotrlisthvl;
	private BigDecimal mifidpotrlistrper;
	private BigDecimal mifidpotrlisvoper;
	private Long mifidpotrsstithfl;
	private Long mifidpotrsstithvl;
	private BigDecimal mifidpotrsstitrper;
	private BigDecimal mifidpotrsstivoper;
	private Long mifidpretrlisthfl;
	private Long mifidpretrlisthvl;
	private BigDecimal mifidpretrlistrper;
	private Long mifidpretrsstithfl;
	private Long mifidpretrsstithvl;
	private BigDecimal mifidpretrsstitrper;
	private String mifidregulatedesma;
	private Long mifidstmasizeesma;
	private String mifidstmasizecurcode;
	private String mifidsubprod;
	private String mifidsubprodesma;
	private Integer mifidtermdate;
	private Integer mifidtermdateesma;
	private String mifidtrobflag;
	private Integer mifidtradapdate;
	private Integer mifidtradapdateesma;
	private Integer mifidtradreqdate;
	private Integer mifidtradreqdateesma;
	private String mifidtrtype;
	private String mifidtrtypeesma;
	private String mifidundindname;
	private String mifidundindnameesma;
	private String mifidundindtermesma;
	private String mifidundtype;
	private String mifiridentifier;
	private BigDecimal mindenomination;
	private BigDecimal ncaavdailyturnover;
	private String ncaavdailyturncurcode;
	private BigDecimal ncafreefl;
	private String ncafreeflcurcode;
	private String notionalcuresma;
	private String optionroot;
	private String placeholder;
	private BigDecimal pricemultiplieresma;
	private String prtrmaquote;
	private String reqfattbyissuer;
	private String reqfattbyissueresma;
	private String securitydescription;
	private Long strikepriceesma;
	private String strikepricecuresma;
	private String suscategoryesma;
	private Integer susendedonesma;
	private Integer susongoingesma;
	private String susratesma;
	private Integer susstonesma;
	private BigDecimal ttlamissued;
	private Long ttleutu12moesma;
	private Long ttleuvl12moesma;
	private String undeeaelig;
	private String undisin;
	private String undisinesma;

	public XrefDsp() {
	}

	public XrefDsp(long dhsid) {
		this.dhsid = dhsid;
	}

	public XrefDsp(long dhsid, String ipc, String assetstatus, String basketundisinlist, String basketwrrindicator, String cincode, String complegaldomicile, String compshortname,
			Integer dealstartdate, String eeavenueelflg, String fininsshnameesma, String inesmafirds, String insclassesma, String insfullnameesma, Integer issuedate,
			String issortrvenueleiesma, BigDecimal mrkattsrcpermid, Integer maturitydate, String mifidasclofun, BigDecimal mifidadnapinsesma, BigDecimal mifidadnoftpinsesma,
			BigDecimal mifidavdatuesma, String mifidavdatucurcode, BigDecimal mifidavvaoftresma, BigDecimal mifidavvaoftrcurcode, String mifidbaseprod, String mifidbaseprodesma,
			String mifidbondseni, String mifidbondtype, String mifidclobflag, String mifidcofialiinfornewbo, String mifidcodein, String mifidcodeinesma, String mifidcoinflesma,
			String mifidcoinre, String mifidcotype, String mifiddeltypeesma, String mifidemalsubtype, String mifidexerstyle, String mifidexerstyleesma, Integer mifidexpdateesma,
			String mifidfiprtype, String mifidfiprtypeesma, Integer mifidfrtradedate, Integer mifidfrtradedateesma, String mifidflag, BigDecimal mifidfrfloatesma,
			String mifidfrfloatcurcode, String mifidfusubpr, String mifidfusubpresma, Long mifidissdateesma, BigDecimal mifidisssizeesma, Integer mifidmatdate,
			Integer mifidmatdateesma, String mifidmostremaesma, String mifidoptype, String mifidoptypeesma, BigDecimal mifidptuw12esma, BigDecimal mifidptuwptv12mesma,
			Long mifidpotrlisthfl, Long mifidpotrlisthvl, BigDecimal mifidpotrlistrper, BigDecimal mifidpotrlisvoper, Long mifidpotrsstithfl, Long mifidpotrsstithvl,
			BigDecimal mifidpotrsstitrper, BigDecimal mifidpotrsstivoper, Long mifidpretrlisthfl, Long mifidpretrlisthvl, BigDecimal mifidpretrlistrper, Long mifidpretrsstithfl,
			Long mifidpretrsstithvl, BigDecimal mifidpretrsstitrper, String mifidregulatedesma, Long mifidstmasizeesma, String mifidstmasizecurcode, String mifidsubprod,
			String mifidsubprodesma, Integer mifidtermdate, Integer mifidtermdateesma, String mifidtrobflag, Integer mifidtradapdate, Integer mifidtradapdateesma,
			Integer mifidtradreqdate, Integer mifidtradreqdateesma, String mifidtrtype, String mifidtrtypeesma, String mifidundindname, String mifidundindnameesma,
			String mifidundindtermesma, String mifidundtype, String mifiridentifier, BigDecimal mindenomination, BigDecimal ncaavdailyturnover, String ncaavdailyturncurcode,
			BigDecimal ncafreefl, String ncafreeflcurcode, String notionalcuresma, String optionroot, String placeholder, BigDecimal pricemultiplieresma, String prtrmaquote,
			String reqfattbyissuer, String reqfattbyissueresma, String securitydescription, Long strikepriceesma, String strikepricecuresma, String suscategoryesma,
			Integer susendedonesma, Integer susongoingesma, String susratesma, Integer susstonesma, BigDecimal ttlamissued, Long ttleutu12moesma, Long ttleuvl12moesma,
			String undeeaelig, String undisin, String undisinesma) {
		this.dhsid = dhsid;
		this.ipc = ipc;
		this.assetstatus = assetstatus;
		this.basketundisinlist = basketundisinlist;
		this.basketwrrindicator = basketwrrindicator;
		this.cincode = cincode;
		this.complegaldomicile = complegaldomicile;
		this.compshortname = compshortname;
		this.dealstartdate = dealstartdate;
		this.eeavenueelflg = eeavenueelflg;
		this.fininsshnameesma = fininsshnameesma;
		this.inesmafirds = inesmafirds;
		this.insclassesma = insclassesma;
		this.insfullnameesma = insfullnameesma;
		this.issuedate = issuedate;
		this.issortrvenueleiesma = issortrvenueleiesma;
		this.mrkattsrcpermid = mrkattsrcpermid;
		this.maturitydate = maturitydate;
		this.mifidasclofun = mifidasclofun;
		this.mifidadnapinsesma = mifidadnapinsesma;
		this.mifidadnoftpinsesma = mifidadnoftpinsesma;
		this.mifidavdatuesma = mifidavdatuesma;
		this.mifidavdatucurcode = mifidavdatucurcode;
		this.mifidavvaoftresma = mifidavvaoftresma;
		this.mifidavvaoftrcurcode = mifidavvaoftrcurcode;
		this.mifidbaseprod = mifidbaseprod;
		this.mifidbaseprodesma = mifidbaseprodesma;
		this.mifidbondseni = mifidbondseni;
		this.mifidbondtype = mifidbondtype;
		this.mifidclobflag = mifidclobflag;
		this.mifidcofialiinfornewbo = mifidcofialiinfornewbo;
		this.mifidcodein = mifidcodein;
		this.mifidcodeinesma = mifidcodeinesma;
		this.mifidcoinflesma = mifidcoinflesma;
		this.mifidcoinre = mifidcoinre;
		this.mifidcotype = mifidcotype;
		this.mifiddeltypeesma = mifiddeltypeesma;
		this.mifidemalsubtype = mifidemalsubtype;
		this.mifidexerstyle = mifidexerstyle;
		this.mifidexerstyleesma = mifidexerstyleesma;
		this.mifidexpdateesma = mifidexpdateesma;
		this.mifidfiprtype = mifidfiprtype;
		this.mifidfiprtypeesma = mifidfiprtypeesma;
		this.mifidfrtradedate = mifidfrtradedate;
		this.mifidfrtradedateesma = mifidfrtradedateesma;
		this.mifidflag = mifidflag;
		this.mifidfrfloatesma = mifidfrfloatesma;
		this.mifidfrfloatcurcode = mifidfrfloatcurcode;
		this.mifidfusubpr = mifidfusubpr;
		this.mifidfusubpresma = mifidfusubpresma;
		this.mifidissdateesma = mifidissdateesma;
		this.mifidisssizeesma = mifidisssizeesma;
		this.mifidmatdate = mifidmatdate;
		this.mifidmatdateesma = mifidmatdateesma;
		this.mifidmostremaesma = mifidmostremaesma;
		this.mifidoptype = mifidoptype;
		this.mifidoptypeesma = mifidoptypeesma;
		this.mifidptuw12esma = mifidptuw12esma;
		this.mifidptuwptv12mesma = mifidptuwptv12mesma;
		this.mifidpotrlisthfl = mifidpotrlisthfl;
		this.mifidpotrlisthvl = mifidpotrlisthvl;
		this.mifidpotrlistrper = mifidpotrlistrper;
		this.mifidpotrlisvoper = mifidpotrlisvoper;
		this.mifidpotrsstithfl = mifidpotrsstithfl;
		this.mifidpotrsstithvl = mifidpotrsstithvl;
		this.mifidpotrsstitrper = mifidpotrsstitrper;
		this.mifidpotrsstivoper = mifidpotrsstivoper;
		this.mifidpretrlisthfl = mifidpretrlisthfl;
		this.mifidpretrlisthvl = mifidpretrlisthvl;
		this.mifidpretrlistrper = mifidpretrlistrper;
		this.mifidpretrsstithfl = mifidpretrsstithfl;
		this.mifidpretrsstithvl = mifidpretrsstithvl;
		this.mifidpretrsstitrper = mifidpretrsstitrper;
		this.mifidregulatedesma = mifidregulatedesma;
		this.mifidstmasizeesma = mifidstmasizeesma;
		this.mifidstmasizecurcode = mifidstmasizecurcode;
		this.mifidsubprod = mifidsubprod;
		this.mifidsubprodesma = mifidsubprodesma;
		this.mifidtermdate = mifidtermdate;
		this.mifidtermdateesma = mifidtermdateesma;
		this.mifidtrobflag = mifidtrobflag;
		this.mifidtradapdate = mifidtradapdate;
		this.mifidtradapdateesma = mifidtradapdateesma;
		this.mifidtradreqdate = mifidtradreqdate;
		this.mifidtradreqdateesma = mifidtradreqdateesma;
		this.mifidtrtype = mifidtrtype;
		this.mifidtrtypeesma = mifidtrtypeesma;
		this.mifidundindname = mifidundindname;
		this.mifidundindnameesma = mifidundindnameesma;
		this.mifidundindtermesma = mifidundindtermesma;
		this.mifidundtype = mifidundtype;
		this.mifiridentifier = mifiridentifier;
		this.mindenomination = mindenomination;
		this.ncaavdailyturnover = ncaavdailyturnover;
		this.ncaavdailyturncurcode = ncaavdailyturncurcode;
		this.ncafreefl = ncafreefl;
		this.ncafreeflcurcode = ncafreeflcurcode;
		this.notionalcuresma = notionalcuresma;
		this.optionroot = optionroot;
		this.placeholder = placeholder;
		this.pricemultiplieresma = pricemultiplieresma;
		this.prtrmaquote = prtrmaquote;
		this.reqfattbyissuer = reqfattbyissuer;
		this.reqfattbyissueresma = reqfattbyissueresma;
		this.securitydescription = securitydescription;
		this.strikepriceesma = strikepriceesma;
		this.strikepricecuresma = strikepricecuresma;
		this.suscategoryesma = suscategoryesma;
		this.susendedonesma = susendedonesma;
		this.susongoingesma = susongoingesma;
		this.susratesma = susratesma;
		this.susstonesma = susstonesma;
		this.ttlamissued = ttlamissued;
		this.ttleutu12moesma = ttleutu12moesma;
		this.ttleuvl12moesma = ttleuvl12moesma;
		this.undeeaelig = undeeaelig;
		this.undisin = undisin;
		this.undisinesma = undisinesma;
	}

	@Id
	@Column(name = "dhsID", unique = true, nullable = false, precision = 12, scale = 0)
	public long getDhsid() {
		return this.dhsid;
	}

	public void setDhsid(long dhsid) {
		this.dhsid = dhsid;
	}

	@Column(name = "ipc", length = 8)
	public String getIpc() {
		return this.ipc;
	}

	public void setIpc(String ipc) {
		this.ipc = ipc;
	}

	@Column(name = "assetStatus", length = 3)
	public String getAssetstatus() {
		return this.assetstatus;
	}

	public void setAssetstatus(String assetstatus) {
		this.assetstatus = assetstatus;
	}

	@Column(name = "basketUndIsinList", length = 260)
	public String getBasketundisinlist() {
		return this.basketundisinlist;
	}

	public void setBasketundisinlist(String basketundisinlist) {
		this.basketundisinlist = basketundisinlist;
	}

	@Column(name = "basketWrrIndicator", length = 260)
	public String getBasketwrrindicator() {
		return this.basketwrrindicator;
	}

	public void setBasketwrrindicator(String basketwrrindicator) {
		this.basketwrrindicator = basketwrrindicator;
	}

	@Column(name = "cinCode", length = 9)
	public String getCincode() {
		return this.cincode;
	}

	public void setCincode(String cincode) {
		this.cincode = cincode;
	}

	@Column(name = "compLegalDomicile", length = 3)
	public String getComplegaldomicile() {
		return this.complegaldomicile;
	}

	public void setComplegaldomicile(String complegaldomicile) {
		this.complegaldomicile = complegaldomicile;
	}

	@Column(name = "compShortName", length = 16)
	public String getCompshortname() {
		return this.compshortname;
	}

	public void setCompshortname(String compshortname) {
		this.compshortname = compshortname;
	}

	@Column(name = "dealStartDate", precision = 8, scale = 0)
	public Integer getDealstartdate() {
		return this.dealstartdate;
	}

	public void setDealstartdate(Integer dealstartdate) {
		this.dealstartdate = dealstartdate;
	}

	@Column(name = "eeaVenueElFlg", length = 1)
	public String getEeavenueelflg() {
		return this.eeavenueelflg;
	}

	public void setEeavenueelflg(String eeavenueelflg) {
		this.eeavenueelflg = eeavenueelflg;
	}

	@Column(name = "finInsShNameESMA", length = 35)
	public String getFininsshnameesma() {
		return this.fininsshnameesma;
	}

	public void setFininsshnameesma(String fininsshnameesma) {
		this.fininsshnameesma = fininsshnameesma;
	}

	@Column(name = "inEsmaFirds", length = 1)
	public String getInesmafirds() {
		return this.inesmafirds;
	}

	public void setInesmafirds(String inesmafirds) {
		this.inesmafirds = inesmafirds;
	}

	@Column(name = "insClassESMA", length = 6)
	public String getInsclassesma() {
		return this.insclassesma;
	}

	public void setInsclassesma(String insclassesma) {
		this.insclassesma = insclassesma;
	}

	@Column(name = "insFullNameESMA", length = 350)
	public String getInsfullnameesma() {
		return this.insfullnameesma;
	}

	public void setInsfullnameesma(String insfullnameesma) {
		this.insfullnameesma = insfullnameesma;
	}

	@Column(name = "issueDate", precision = 8, scale = 0)
	public Integer getIssuedate() {
		return this.issuedate;
	}

	public void setIssuedate(Integer issuedate) {
		this.issuedate = issuedate;
	}

	@Column(name = "issOrTrVenueLeiESMA", length = 20)
	public String getIssortrvenueleiesma() {
		return this.issortrvenueleiesma;
	}

	public void setIssortrvenueleiesma(String issortrvenueleiesma) {
		this.issortrvenueleiesma = issortrvenueleiesma;
	}

	@Column(name = "mrkAttSrcPermID", precision = 30, scale = 0)
	public BigDecimal getMrkattsrcpermid() {
		return this.mrkattsrcpermid;
	}

	public void setMrkattsrcpermid(BigDecimal mrkattsrcpermid) {
		this.mrkattsrcpermid = mrkattsrcpermid;
	}

	@Column(name = "maturityDate", precision = 8, scale = 0)
	public Integer getMaturitydate() {
		return this.maturitydate;
	}

	public void setMaturitydate(Integer maturitydate) {
		this.maturitydate = maturitydate;
	}

	@Column(name = "mifidAsClofUn", length = 6)
	public String getMifidasclofun() {
		return this.mifidasclofun;
	}

	public void setMifidasclofun(String mifidasclofun) {
		this.mifidasclofun = mifidasclofun;
	}

	@Column(name = "mifidADNAPInsESMA", precision = 12)
	public BigDecimal getMifidadnapinsesma() {
		return this.mifidadnapinsesma;
	}

	public void setMifidadnapinsesma(BigDecimal mifidadnapinsesma) {
		this.mifidadnapinsesma = mifidadnapinsesma;
	}

	@Column(name = "mifidADNOfTPInsESMA", precision = 12)
	public BigDecimal getMifidadnoftpinsesma() {
		return this.mifidadnoftpinsesma;
	}

	public void setMifidadnoftpinsesma(BigDecimal mifidadnoftpinsesma) {
		this.mifidadnoftpinsesma = mifidadnoftpinsesma;
	}

	@Column(name = "mifidAvDaTuESMA", precision = 20)
	public BigDecimal getMifidavdatuesma() {
		return this.mifidavdatuesma;
	}

	public void setMifidavdatuesma(BigDecimal mifidavdatuesma) {
		this.mifidavdatuesma = mifidavdatuesma;
	}

	@Column(name = "mifidAvDaTuCurCode", length = 3)
	public String getMifidavdatucurcode() {
		return this.mifidavdatucurcode;
	}

	public void setMifidavdatucurcode(String mifidavdatucurcode) {
		this.mifidavdatucurcode = mifidavdatucurcode;
	}

	@Column(name = "mifidAvVaOfTrESMA", precision = 20)
	public BigDecimal getMifidavvaoftresma() {
		return this.mifidavvaoftresma;
	}

	public void setMifidavvaoftresma(BigDecimal mifidavvaoftresma) {
		this.mifidavvaoftresma = mifidavvaoftresma;
	}

	@Column(name = "mifidAvVaOfTrCurCode", precision = 22, scale = 0)
	public BigDecimal getMifidavvaoftrcurcode() {
		return this.mifidavvaoftrcurcode;
	}

	public void setMifidavvaoftrcurcode(BigDecimal mifidavvaoftrcurcode) {
		this.mifidavvaoftrcurcode = mifidavvaoftrcurcode;
	}

	@Column(name = "mifidBaseProd", length = 6)
	public String getMifidbaseprod() {
		return this.mifidbaseprod;
	}

	public void setMifidbaseprod(String mifidbaseprod) {
		this.mifidbaseprod = mifidbaseprod;
	}

	@Column(name = "mifidBaseProdESMA", length = 4)
	public String getMifidbaseprodesma() {
		return this.mifidbaseprodesma;
	}

	public void setMifidbaseprodesma(String mifidbaseprodesma) {
		this.mifidbaseprodesma = mifidbaseprodesma;
	}

	@Column(name = "mifidBondSeni", length = 4)
	public String getMifidbondseni() {
		return this.mifidbondseni;
	}

	public void setMifidbondseni(String mifidbondseni) {
		this.mifidbondseni = mifidbondseni;
	}

	@Column(name = "mifidBondType", length = 4)
	public String getMifidbondtype() {
		return this.mifidbondtype;
	}

	public void setMifidbondtype(String mifidbondtype) {
		this.mifidbondtype = mifidbondtype;
	}

	@Column(name = "mifidClObFlag", length = 1)
	public String getMifidclobflag() {
		return this.mifidclobflag;
	}

	public void setMifidclobflag(String mifidclobflag) {
		this.mifidclobflag = mifidclobflag;
	}

	@Column(name = "mifidCofiaLiInForNewBo", length = 1)
	public String getMifidcofialiinfornewbo() {
		return this.mifidcofialiinfornewbo;
	}

	public void setMifidcofialiinfornewbo(String mifidcofialiinfornewbo) {
		this.mifidcofialiinfornewbo = mifidcofialiinfornewbo;
	}

	@Column(name = "mifidCoDeIn", length = 1)
	public String getMifidcodein() {
		return this.mifidcodein;
	}

	public void setMifidcodein(String mifidcodein) {
		this.mifidcodein = mifidcodein;
	}

	@Column(name = "mifidCoDeInESMA", length = 1)
	public String getMifidcodeinesma() {
		return this.mifidcodeinesma;
	}

	public void setMifidcodeinesma(String mifidcodeinesma) {
		this.mifidcodeinesma = mifidcodeinesma;
	}

	@Column(name = "mifidCoInFlESMA", length = 1)
	public String getMifidcoinflesma() {
		return this.mifidcoinflesma;
	}

	public void setMifidcoinflesma(String mifidcoinflesma) {
		this.mifidcoinflesma = mifidcoinflesma;
	}

	@Column(name = "mifidCoInRe", length = 50)
	public String getMifidcoinre() {
		return this.mifidcoinre;
	}

	public void setMifidcoinre(String mifidcoinre) {
		this.mifidcoinre = mifidcoinre;
	}

	@Column(name = "mifidCoType", length = 4)
	public String getMifidcotype() {
		return this.mifidcotype;
	}

	public void setMifidcotype(String mifidcotype) {
		this.mifidcotype = mifidcotype;
	}

	@Column(name = "mifidDelTypeESMA", length = 4)
	public String getMifiddeltypeesma() {
		return this.mifiddeltypeesma;
	}

	public void setMifiddeltypeesma(String mifiddeltypeesma) {
		this.mifiddeltypeesma = mifiddeltypeesma;
	}

	@Column(name = "mifidEmAlSubType", length = 4)
	public String getMifidemalsubtype() {
		return this.mifidemalsubtype;
	}

	public void setMifidemalsubtype(String mifidemalsubtype) {
		this.mifidemalsubtype = mifidemalsubtype;
	}

	@Column(name = "mifidExerStyle", length = 4)
	public String getMifidexerstyle() {
		return this.mifidexerstyle;
	}

	public void setMifidexerstyle(String mifidexerstyle) {
		this.mifidexerstyle = mifidexerstyle;
	}

	@Column(name = "mifidExerStyleESMA", length = 4)
	public String getMifidexerstyleesma() {
		return this.mifidexerstyleesma;
	}

	public void setMifidexerstyleesma(String mifidexerstyleesma) {
		this.mifidexerstyleesma = mifidexerstyleesma;
	}

	@Column(name = "mifidExpDateESMA", precision = 8, scale = 0)
	public Integer getMifidexpdateesma() {
		return this.mifidexpdateesma;
	}

	public void setMifidexpdateesma(Integer mifidexpdateesma) {
		this.mifidexpdateesma = mifidexpdateesma;
	}

	@Column(name = "mifidFiPrType", length = 6)
	public String getMifidfiprtype() {
		return this.mifidfiprtype;
	}

	public void setMifidfiprtype(String mifidfiprtype) {
		this.mifidfiprtype = mifidfiprtype;
	}

	@Column(name = "mifidFiPrTypeESMA", length = 4)
	public String getMifidfiprtypeesma() {
		return this.mifidfiprtypeesma;
	}

	public void setMifidfiprtypeesma(String mifidfiprtypeesma) {
		this.mifidfiprtypeesma = mifidfiprtypeesma;
	}

	@Column(name = "mifidFrTradeDate", precision = 8, scale = 0)
	public Integer getMifidfrtradedate() {
		return this.mifidfrtradedate;
	}

	public void setMifidfrtradedate(Integer mifidfrtradedate) {
		this.mifidfrtradedate = mifidfrtradedate;
	}

	@Column(name = "mifidFrTradeDateESMA", precision = 8, scale = 0)
	public Integer getMifidfrtradedateesma() {
		return this.mifidfrtradedateesma;
	}

	public void setMifidfrtradedateesma(Integer mifidfrtradedateesma) {
		this.mifidfrtradedateesma = mifidfrtradedateesma;
	}

	@Column(name = "mifidFlag", length = 8)
	public String getMifidflag() {
		return this.mifidflag;
	}

	public void setMifidflag(String mifidflag) {
		this.mifidflag = mifidflag;
	}

	@Column(name = "mifidFrFloatESMA", precision = 20, scale = 0)
	public BigDecimal getMifidfrfloatesma() {
		return this.mifidfrfloatesma;
	}

	public void setMifidfrfloatesma(BigDecimal mifidfrfloatesma) {
		this.mifidfrfloatesma = mifidfrfloatesma;
	}

	@Column(name = "mifidFrFloatCurCode", length = 3)
	public String getMifidfrfloatcurcode() {
		return this.mifidfrfloatcurcode;
	}

	public void setMifidfrfloatcurcode(String mifidfrfloatcurcode) {
		this.mifidfrfloatcurcode = mifidfrfloatcurcode;
	}

	@Column(name = "mifidFuSubPr", length = 6)
	public String getMifidfusubpr() {
		return this.mifidfusubpr;
	}

	public void setMifidfusubpr(String mifidfusubpr) {
		this.mifidfusubpr = mifidfusubpr;
	}

	@Column(name = "mifidFuSubPrESMA", length = 4)
	public String getMifidfusubpresma() {
		return this.mifidfusubpresma;
	}

	public void setMifidfusubpresma(String mifidfusubpresma) {
		this.mifidfusubpresma = mifidfusubpresma;
	}

	@Column(name = "mifidIssDateESMA", precision = 10, scale = 0)
	public Long getMifidissdateesma() {
		return this.mifidissdateesma;
	}

	public void setMifidissdateesma(Long mifidissdateesma) {
		this.mifidissdateesma = mifidissdateesma;
	}

	@Column(name = "mifidIssSizeESMA", precision = 24)
	public BigDecimal getMifidisssizeesma() {
		return this.mifidisssizeesma;
	}

	public void setMifidisssizeesma(BigDecimal mifidisssizeesma) {
		this.mifidisssizeesma = mifidisssizeesma;
	}

	@Column(name = "mifidMatDate", precision = 8, scale = 0)
	public Integer getMifidmatdate() {
		return this.mifidmatdate;
	}

	public void setMifidmatdate(Integer mifidmatdate) {
		this.mifidmatdate = mifidmatdate;
	}

	@Column(name = "mifidMatDateESMA", precision = 8, scale = 0)
	public Integer getMifidmatdateesma() {
		return this.mifidmatdateesma;
	}

	public void setMifidmatdateesma(Integer mifidmatdateesma) {
		this.mifidmatdateesma = mifidmatdateesma;
	}

	@Column(name = "mifidMostReMaESMA", length = 3)
	public String getMifidmostremaesma() {
		return this.mifidmostremaesma;
	}

	public void setMifidmostremaesma(String mifidmostremaesma) {
		this.mifidmostremaesma = mifidmostremaesma;
	}

	@Column(name = "mifidOpType", length = 6)
	public String getMifidoptype() {
		return this.mifidoptype;
	}

	public void setMifidoptype(String mifidoptype) {
		this.mifidoptype = mifidoptype;
	}

	@Column(name = "mifidOpTypeESMA", length = 4)
	public String getMifidoptypeesma() {
		return this.mifidoptypeesma;
	}

	public void setMifidoptypeesma(String mifidoptypeesma) {
		this.mifidoptypeesma = mifidoptypeesma;
	}

	@Column(name = "mifidPTUW12ESMA", precision = 5)
	public BigDecimal getMifidptuw12esma() {
		return this.mifidptuw12esma;
	}

	public void setMifidptuw12esma(BigDecimal mifidptuw12esma) {
		this.mifidptuw12esma = mifidptuw12esma;
	}

	@Column(name = "mifidPTUWPTV12MESMA", precision = 5)
	public BigDecimal getMifidptuwptv12mesma() {
		return this.mifidptuwptv12mesma;
	}

	public void setMifidptuwptv12mesma(BigDecimal mifidptuwptv12mesma) {
		this.mifidptuwptv12mesma = mifidptuwptv12mesma;
	}

	@Column(name = "mifidPoTrLISThFl", precision = 10, scale = 0)
	public Long getMifidpotrlisthfl() {
		return this.mifidpotrlisthfl;
	}

	public void setMifidpotrlisthfl(Long mifidpotrlisthfl) {
		this.mifidpotrlisthfl = mifidpotrlisthfl;
	}

	@Column(name = "mifidPoTrLISThVl", precision = 10, scale = 0)
	public Long getMifidpotrlisthvl() {
		return this.mifidpotrlisthvl;
	}

	public void setMifidpotrlisthvl(Long mifidpotrlisthvl) {
		this.mifidpotrlisthvl = mifidpotrlisthvl;
	}

	@Column(name = "mifidPoTrLISTrPer", precision = 5)
	public BigDecimal getMifidpotrlistrper() {
		return this.mifidpotrlistrper;
	}

	public void setMifidpotrlistrper(BigDecimal mifidpotrlistrper) {
		this.mifidpotrlistrper = mifidpotrlistrper;
	}

	@Column(name = "mifidPoTrLISVoPer", precision = 5)
	public BigDecimal getMifidpotrlisvoper() {
		return this.mifidpotrlisvoper;
	}

	public void setMifidpotrlisvoper(BigDecimal mifidpotrlisvoper) {
		this.mifidpotrlisvoper = mifidpotrlisvoper;
	}

	@Column(name = "mifidPoTrSSTIThFl", precision = 10, scale = 0)
	public Long getMifidpotrsstithfl() {
		return this.mifidpotrsstithfl;
	}

	public void setMifidpotrsstithfl(Long mifidpotrsstithfl) {
		this.mifidpotrsstithfl = mifidpotrsstithfl;
	}

	@Column(name = "mifidPoTrSSTIThVl", precision = 10, scale = 0)
	public Long getMifidpotrsstithvl() {
		return this.mifidpotrsstithvl;
	}

	public void setMifidpotrsstithvl(Long mifidpotrsstithvl) {
		this.mifidpotrsstithvl = mifidpotrsstithvl;
	}

	@Column(name = "mifidPoTrSSTITrPer", precision = 5)
	public BigDecimal getMifidpotrsstitrper() {
		return this.mifidpotrsstitrper;
	}

	public void setMifidpotrsstitrper(BigDecimal mifidpotrsstitrper) {
		this.mifidpotrsstitrper = mifidpotrsstitrper;
	}

	@Column(name = "mifidPoTrSSTIVoPer", precision = 5)
	public BigDecimal getMifidpotrsstivoper() {
		return this.mifidpotrsstivoper;
	}

	public void setMifidpotrsstivoper(BigDecimal mifidpotrsstivoper) {
		this.mifidpotrsstivoper = mifidpotrsstivoper;
	}

	@Column(name = "mifidPreTrLISThFl", precision = 10, scale = 0)
	public Long getMifidpretrlisthfl() {
		return this.mifidpretrlisthfl;
	}

	public void setMifidpretrlisthfl(Long mifidpretrlisthfl) {
		this.mifidpretrlisthfl = mifidpretrlisthfl;
	}

	@Column(name = "mifidPreTrLISThVl", precision = 10, scale = 0)
	public Long getMifidpretrlisthvl() {
		return this.mifidpretrlisthvl;
	}

	public void setMifidpretrlisthvl(Long mifidpretrlisthvl) {
		this.mifidpretrlisthvl = mifidpretrlisthvl;
	}

	@Column(name = "mifidPreTrLISTrPer", precision = 5)
	public BigDecimal getMifidpretrlistrper() {
		return this.mifidpretrlistrper;
	}

	public void setMifidpretrlistrper(BigDecimal mifidpretrlistrper) {
		this.mifidpretrlistrper = mifidpretrlistrper;
	}

	@Column(name = "mifidPreTrSSTIThFl", precision = 10, scale = 0)
	public Long getMifidpretrsstithfl() {
		return this.mifidpretrsstithfl;
	}

	public void setMifidpretrsstithfl(Long mifidpretrsstithfl) {
		this.mifidpretrsstithfl = mifidpretrsstithfl;
	}

	@Column(name = "mifidPreTrSSTIThVl", precision = 10, scale = 0)
	public Long getMifidpretrsstithvl() {
		return this.mifidpretrsstithvl;
	}

	public void setMifidpretrsstithvl(Long mifidpretrsstithvl) {
		this.mifidpretrsstithvl = mifidpretrsstithvl;
	}

	@Column(name = "mifidPreTrSSTITrPer", precision = 5)
	public BigDecimal getMifidpretrsstitrper() {
		return this.mifidpretrsstitrper;
	}

	public void setMifidpretrsstitrper(BigDecimal mifidpretrsstitrper) {
		this.mifidpretrsstitrper = mifidpretrsstitrper;
	}

	@Column(name = "mifidRegulatedESMA", length = 1)
	public String getMifidregulatedesma() {
		return this.mifidregulatedesma;
	}

	public void setMifidregulatedesma(String mifidregulatedesma) {
		this.mifidregulatedesma = mifidregulatedesma;
	}

	@Column(name = "mifidStMaSizeESMA", precision = 10, scale = 0)
	public Long getMifidstmasizeesma() {
		return this.mifidstmasizeesma;
	}

	public void setMifidstmasizeesma(Long mifidstmasizeesma) {
		this.mifidstmasizeesma = mifidstmasizeesma;
	}

	@Column(name = "mifidStMaSizeCurCode", length = 3)
	public String getMifidstmasizecurcode() {
		return this.mifidstmasizecurcode;
	}

	public void setMifidstmasizecurcode(String mifidstmasizecurcode) {
		this.mifidstmasizecurcode = mifidstmasizecurcode;
	}

	@Column(name = "mifidSubProd", length = 6)
	public String getMifidsubprod() {
		return this.mifidsubprod;
	}

	public void setMifidsubprod(String mifidsubprod) {
		this.mifidsubprod = mifidsubprod;
	}

	@Column(name = "mifidSubProdESMA", length = 4)
	public String getMifidsubprodesma() {
		return this.mifidsubprodesma;
	}

	public void setMifidsubprodesma(String mifidsubprodesma) {
		this.mifidsubprodesma = mifidsubprodesma;
	}

	@Column(name = "mifidTermDate", precision = 8, scale = 0)
	public Integer getMifidtermdate() {
		return this.mifidtermdate;
	}

	public void setMifidtermdate(Integer mifidtermdate) {
		this.mifidtermdate = mifidtermdate;
	}

	@Column(name = "mifidTermDateESMA", precision = 8, scale = 0)
	public Integer getMifidtermdateesma() {
		return this.mifidtermdateesma;
	}

	public void setMifidtermdateesma(Integer mifidtermdateesma) {
		this.mifidtermdateesma = mifidtermdateesma;
	}

	@Column(name = "mifidTrObFlag", length = 1)
	public String getMifidtrobflag() {
		return this.mifidtrobflag;
	}

	public void setMifidtrobflag(String mifidtrobflag) {
		this.mifidtrobflag = mifidtrobflag;
	}

	@Column(name = "mifidTrAdApDate", precision = 8, scale = 0)
	public Integer getMifidtradapdate() {
		return this.mifidtradapdate;
	}

	public void setMifidtradapdate(Integer mifidtradapdate) {
		this.mifidtradapdate = mifidtradapdate;
	}

	@Column(name = "mifidTrAdApDateESMA", precision = 8, scale = 0)
	public Integer getMifidtradapdateesma() {
		return this.mifidtradapdateesma;
	}

	public void setMifidtradapdateesma(Integer mifidtradapdateesma) {
		this.mifidtradapdateesma = mifidtradapdateesma;
	}

	@Column(name = "mifidTrAdReqDate", precision = 8, scale = 0)
	public Integer getMifidtradreqdate() {
		return this.mifidtradreqdate;
	}

	public void setMifidtradreqdate(Integer mifidtradreqdate) {
		this.mifidtradreqdate = mifidtradreqdate;
	}

	@Column(name = "mifidTrAdReqDateESMA", precision = 8, scale = 0)
	public Integer getMifidtradreqdateesma() {
		return this.mifidtradreqdateesma;
	}

	public void setMifidtradreqdateesma(Integer mifidtradreqdateesma) {
		this.mifidtradreqdateesma = mifidtradreqdateesma;
	}

	@Column(name = "mifidTrType", length = 6)
	public String getMifidtrtype() {
		return this.mifidtrtype;
	}

	public void setMifidtrtype(String mifidtrtype) {
		this.mifidtrtype = mifidtrtype;
	}

	@Column(name = "mifidTrTypeESMA", length = 4)
	public String getMifidtrtypeesma() {
		return this.mifidtrtypeesma;
	}

	public void setMifidtrtypeesma(String mifidtrtypeesma) {
		this.mifidtrtypeesma = mifidtrtypeesma;
	}

	@Column(name = "mifidUndIndName", length = 25)
	public String getMifidundindname() {
		return this.mifidundindname;
	}

	public void setMifidundindname(String mifidundindname) {
		this.mifidundindname = mifidundindname;
	}

	@Column(name = "mifidUndIndNameESMA", length = 25)
	public String getMifidundindnameesma() {
		return this.mifidundindnameesma;
	}

	public void setMifidundindnameesma(String mifidundindnameesma) {
		this.mifidundindnameesma = mifidundindnameesma;
	}

	@Column(name = "mifidUndIndTermESMA", length = 6)
	public String getMifidundindtermesma() {
		return this.mifidundindtermesma;
	}

	public void setMifidundindtermesma(String mifidundindtermesma) {
		this.mifidundindtermesma = mifidundindtermesma;
	}

	@Column(name = "mifidUndType", length = 4)
	public String getMifidundtype() {
		return this.mifidundtype;
	}

	public void setMifidundtype(String mifidundtype) {
		this.mifidundtype = mifidundtype;
	}

	@Column(name = "mifirIdentifier", length = 6)
	public String getMifiridentifier() {
		return this.mifiridentifier;
	}

	public void setMifiridentifier(String mifiridentifier) {
		this.mifiridentifier = mifiridentifier;
	}

	@Column(name = "minDenomination", precision = 22, scale = 0)
	public BigDecimal getMindenomination() {
		return this.mindenomination;
	}

	public void setMindenomination(BigDecimal mindenomination) {
		this.mindenomination = mindenomination;
	}

	@Column(name = "ncaAvDailyTurnover", precision = 20)
	public BigDecimal getNcaavdailyturnover() {
		return this.ncaavdailyturnover;
	}

	public void setNcaavdailyturnover(BigDecimal ncaavdailyturnover) {
		this.ncaavdailyturnover = ncaavdailyturnover;
	}

	@Column(name = "ncaAvDailyTurnCurCode", length = 3)
	public String getNcaavdailyturncurcode() {
		return this.ncaavdailyturncurcode;
	}

	public void setNcaavdailyturncurcode(String ncaavdailyturncurcode) {
		this.ncaavdailyturncurcode = ncaavdailyturncurcode;
	}

	@Column(name = "ncaFreeFl", precision = 20, scale = 0)
	public BigDecimal getNcafreefl() {
		return this.ncafreefl;
	}

	public void setNcafreefl(BigDecimal ncafreefl) {
		this.ncafreefl = ncafreefl;
	}

	@Column(name = "ncaFreeFlCurCode", length = 3)
	public String getNcafreeflcurcode() {
		return this.ncafreeflcurcode;
	}

	public void setNcafreeflcurcode(String ncafreeflcurcode) {
		this.ncafreeflcurcode = ncafreeflcurcode;
	}

	@Column(name = "notionalCurESMA", length = 3)
	public String getNotionalcuresma() {
		return this.notionalcuresma;
	}

	public void setNotionalcuresma(String notionalcuresma) {
		this.notionalcuresma = notionalcuresma;
	}

	@Column(name = "optionRoot", length = 40)
	public String getOptionroot() {
		return this.optionroot;
	}

	public void setOptionroot(String optionroot) {
		this.optionroot = optionroot;
	}

	@Column(name = "placeholder", length = 1)
	public String getPlaceholder() {
		return this.placeholder;
	}

	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}

	@Column(name = "priceMultiplierESMA", precision = 38, scale = 0)
	public BigDecimal getPricemultiplieresma() {
		return this.pricemultiplieresma;
	}

	public void setPricemultiplieresma(BigDecimal pricemultiplieresma) {
		this.pricemultiplieresma = pricemultiplieresma;
	}

	@Column(name = "prTrMaQuote", length = 18)
	public String getPrtrmaquote() {
		return this.prtrmaquote;
	}

	public void setPrtrmaquote(String prtrmaquote) {
		this.prtrmaquote = prtrmaquote;
	}

	@Column(name = "reqFATTByIssuer", length = 1)
	public String getReqfattbyissuer() {
		return this.reqfattbyissuer;
	}

	public void setReqfattbyissuer(String reqfattbyissuer) {
		this.reqfattbyissuer = reqfattbyissuer;
	}

	@Column(name = "reqFATTByIssuerESMA", length = 1)
	public String getReqfattbyissueresma() {
		return this.reqfattbyissueresma;
	}

	public void setReqfattbyissueresma(String reqfattbyissueresma) {
		this.reqfattbyissueresma = reqfattbyissueresma;
	}

	@Column(name = "securityDescription", length = 36)
	public String getSecuritydescription() {
		return this.securitydescription;
	}

	public void setSecuritydescription(String securitydescription) {
		this.securitydescription = securitydescription;
	}

	@Column(name = "strikePriceESMA", precision = 18, scale = 0)
	public Long getStrikepriceesma() {
		return this.strikepriceesma;
	}

	public void setStrikepriceesma(Long strikepriceesma) {
		this.strikepriceesma = strikepriceesma;
	}

	@Column(name = "strikePriceCurESMA", length = 3)
	public String getStrikepricecuresma() {
		return this.strikepricecuresma;
	}

	public void setStrikepricecuresma(String strikepricecuresma) {
		this.strikepricecuresma = strikepricecuresma;
	}

	@Column(name = "susCategoryESMA", length = 20)
	public String getSuscategoryesma() {
		return this.suscategoryesma;
	}

	public void setSuscategoryesma(String suscategoryesma) {
		this.suscategoryesma = suscategoryesma;
	}

	@Column(name = "susEndedOnESMA", precision = 8, scale = 0)
	public Integer getSusendedonesma() {
		return this.susendedonesma;
	}

	public void setSusendedonesma(Integer susendedonesma) {
		this.susendedonesma = susendedonesma;
	}

	@Column(name = "susOnGoingESMA", precision = 8, scale = 0)
	public Integer getSusongoingesma() {
		return this.susongoingesma;
	}

	public void setSusongoingesma(Integer susongoingesma) {
		this.susongoingesma = susongoingesma;
	}

	@Column(name = "susRatESMA")
	public String getSusratesma() {
		return this.susratesma;
	}

	public void setSusratesma(String susratesma) {
		this.susratesma = susratesma;
	}

	@Column(name = "susStOnESMA", precision = 8, scale = 0)
	public Integer getSusstonesma() {
		return this.susstonesma;
	}

	public void setSusstonesma(Integer susstonesma) {
		this.susstonesma = susstonesma;
	}

	@Column(name = "ttlAmIssued", precision = 36, scale = 0)
	public BigDecimal getTtlamissued() {
		return this.ttlamissued;
	}

	public void setTtlamissued(BigDecimal ttlamissued) {
		this.ttlamissued = ttlamissued;
	}

	@Column(name = "ttlEUTu12MoESMA", precision = 12, scale = 0)
	public Long getTtleutu12moesma() {
		return this.ttleutu12moesma;
	}

	public void setTtleutu12moesma(Long ttleutu12moesma) {
		this.ttleutu12moesma = ttleutu12moesma;
	}

	@Column(name = "ttlEUVl12MoESMA", precision = 12, scale = 0)
	public Long getTtleuvl12moesma() {
		return this.ttleuvl12moesma;
	}

	public void setTtleuvl12moesma(Long ttleuvl12moesma) {
		this.ttleuvl12moesma = ttleuvl12moesma;
	}

	@Column(name = "undEeaElig", length = 1)
	public String getUndeeaelig() {
		return this.undeeaelig;
	}

	public void setUndeeaelig(String undeeaelig) {
		this.undeeaelig = undeeaelig;
	}

	@Column(name = "undIsin", length = 12)
	public String getUndisin() {
		return this.undisin;
	}

	public void setUndisin(String undisin) {
		this.undisin = undisin;
	}

	@Column(name = "undIsinESMA", length = 12)
	public String getUndisinesma() {
		return this.undisinesma;
	}

	public void setUndisinesma(String undisinesma) {
		this.undisinesma = undisinesma;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[dhsid=");
		builder.append(dhsid);
		builder.append(", ipc=");
		builder.append(ipc);
		builder.append(", assetstatus=");
		builder.append(assetstatus);
		builder.append(", basketundisinlist=");
		builder.append(basketundisinlist);
		builder.append(", basketwrrindicator=");
		builder.append(basketwrrindicator);
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
		builder.append(", fininsshnameesma=");
		builder.append(fininsshnameesma);
		builder.append(", inesmafirds=");
		builder.append(inesmafirds);
		builder.append(", insclassesma=");
		builder.append(insclassesma);
		builder.append(", insfullnameesma=");
		builder.append(insfullnameesma);
		builder.append(", issuedate=");
		builder.append(issuedate);
		builder.append(", issortrvenueleiesma=");
		builder.append(issortrvenueleiesma);
		builder.append(", mrkattsrcpermid=");
		builder.append(mrkattsrcpermid);
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
