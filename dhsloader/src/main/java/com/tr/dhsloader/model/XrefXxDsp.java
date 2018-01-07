package com.tr.dhsloader.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Thomson Reuters
 * 
 */
@Entity
@Table(name = "XRef_XX_DSP1", schema = "dbo")
public class XrefXxDsp implements java.io.Serializable {

	private static final long serialVersionUID = -1636443729844129372L;
	private XrefXxDspId id;

	public XrefXxDsp() {
	}

	public XrefXxDsp(XrefXxDspId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "action", column = @Column(name = "action", length = 50)),
			@AttributeOverride(name = "levelcode", column = @Column(name = "levelCode", length = 50)),
			@AttributeOverride(name = "ipc", column = @Column(name = "ipc", length = 50)), @AttributeOverride(name = "quoteid", column = @Column(name = "quoteID", length = 50)),
			@AttributeOverride(name = "ric", column = @Column(name = "RIC", length = 50)), @AttributeOverride(name = "sedol", column = @Column(name = "sedol", length = 50)),
			@AttributeOverride(name = "issuepermid", column = @Column(name = "issuePermID", length = 50)),
			@AttributeOverride(name = "assetid", column = @Column(name = "assetID", length = 50)), @AttributeOverride(name = "pilc", column = @Column(name = "pilc", length = 50)),
			@AttributeOverride(name = "cusip", column = @Column(name = "cusip", length = 50)),
			@AttributeOverride(name = "orgpermid", column = @Column(name = "orgPermID", length = 50)),
			@AttributeOverride(name = "assetstatus", column = @Column(name = "assetStatus", length = 50)),
			@AttributeOverride(name = "basketundisinlist", column = @Column(name = "basketUndIsinList", length = 50)),
			@AttributeOverride(name = "basketwrrindicator", column = @Column(name = "basketWrrIndicator", length = 50)),
			@AttributeOverride(name = "cficode", column = @Column(name = "cfiCode", length = 50)),
			@AttributeOverride(name = "cincode", column = @Column(name = "cinCode", length = 50)),
			@AttributeOverride(name = "complegaldomicile", column = @Column(name = "compLegalDomicile", length = 50)),
			@AttributeOverride(name = "compshortname", column = @Column(name = "compShortName", length = 50)),
			@AttributeOverride(name = "dealstartdate", column = @Column(name = "dealStartDate", length = 50)),
			@AttributeOverride(name = "eeavenueelflg", column = @Column(name = "eeaVenueElFlg", length = 50)),
			@AttributeOverride(name = "fininsshname", column = @Column(name = "finInsShName", length = 50)),
			@AttributeOverride(name = "fininsshnameesma", column = @Column(name = "finInsShNameESMA", length = 50)),
			@AttributeOverride(name = "inesmafirds", column = @Column(name = "inEsmaFirds", length = 50)),
			@AttributeOverride(name = "insclassesma", column = @Column(name = "insClassESMA", length = 50)),
			@AttributeOverride(name = "insfullnameesma", column = @Column(name = "insFullNameESMA", length = 50)),
			@AttributeOverride(name = "isin", column = @Column(name = "isin", length = 50)),
			@AttributeOverride(name = "issuedate", column = @Column(name = "issueDate", length = 50)),
			@AttributeOverride(name = "issuerlei", column = @Column(name = "issuerLEI", length = 50)),
			@AttributeOverride(name = "issortrvenueleiesma", column = @Column(name = "issOrTrVenueLeiESMA", length = 50)),
			@AttributeOverride(name = "mrkattsrcpermid", column = @Column(name = "mrkAttSrcPermID", length = 50)),
			@AttributeOverride(name = "marketmic", column = @Column(name = "marketMIC", length = 50)),
			@AttributeOverride(name = "maturitydate", column = @Column(name = "maturityDate", length = 50)),
			@AttributeOverride(name = "mifidasclofun", column = @Column(name = "mifidAsClofUn", length = 50)),
			@AttributeOverride(name = "mifidadnapinsesma", column = @Column(name = "mifidADNAPInsESMA", length = 50)),
			@AttributeOverride(name = "mifidadnoftpinsesma", column = @Column(name = "mifidADNOfTPInsESMA", length = 50)),
			@AttributeOverride(name = "mifidavdatuesma", column = @Column(name = "mifidAvDaTuESMA", length = 50)),
			@AttributeOverride(name = "mifidavdatucurcode", column = @Column(name = "mifidAvDaTuCurCode", length = 50)),
			@AttributeOverride(name = "mifidavvaoftresma", column = @Column(name = "mifidAvVaOfTrESMA", length = 50)),
			@AttributeOverride(name = "mifidavvaoftrcurcode", column = @Column(name = "mifidAvVaOfTrCurCode", length = 50)),
			@AttributeOverride(name = "mifidbaseprod", column = @Column(name = "mifidBaseProd", length = 50)),
			@AttributeOverride(name = "mifidbaseprodesma", column = @Column(name = "mifidBaseProdESMA", length = 50)),
			@AttributeOverride(name = "mifidbondseni", column = @Column(name = "mifidBondSeni", length = 50)),
			@AttributeOverride(name = "mifidbondtype", column = @Column(name = "mifidBondType", length = 50)),
			@AttributeOverride(name = "mifidclobflag", column = @Column(name = "mifidClObFlag", length = 50)),
			@AttributeOverride(name = "mifidcofialiinfornewbo", column = @Column(name = "mifidCofiaLiInForNewBo", length = 50)),
			@AttributeOverride(name = "mifidcodein", column = @Column(name = "mifidCoDeIn", length = 50)),
			@AttributeOverride(name = "mifidcodeinesma", column = @Column(name = "mifidCoDeInESMA", length = 50)),
			@AttributeOverride(name = "mifidcoinflesma", column = @Column(name = "mifidCoInFlESMA", length = 50)),
			@AttributeOverride(name = "mifidcoinre", column = @Column(name = "mifidCoInRe", length = 50)),
			@AttributeOverride(name = "mifidcotype", column = @Column(name = "mifidCoType", length = 50)),
			@AttributeOverride(name = "mifiddeltypeesma", column = @Column(name = "mifidDelTypeESMA", length = 50)),
			@AttributeOverride(name = "mifidemalsubtype", column = @Column(name = "mifidEmAlSubType", length = 50)),
			@AttributeOverride(name = "mifidexerstyle", column = @Column(name = "mifidExerStyle", length = 50)),
			@AttributeOverride(name = "mifidexerstyleesma", column = @Column(name = "mifidExerStyleESMA", length = 50)),
			@AttributeOverride(name = "mifidexpdateesma", column = @Column(name = "mifidExpDateESMA", length = 50)),
			@AttributeOverride(name = "mifidfiprtype", column = @Column(name = "mifidFiPrType", length = 50)),
			@AttributeOverride(name = "mifidfiprtypeesma", column = @Column(name = "mifidFiPrTypeESMA", length = 50)),
			@AttributeOverride(name = "mifidfrtradedate", column = @Column(name = "mifidFrTradeDate", length = 50)),
			@AttributeOverride(name = "mifidfrtradedateesma", column = @Column(name = "mifidFrTradeDateESMA", length = 50)),
			@AttributeOverride(name = "mifidflag", column = @Column(name = "mifidFlag", length = 50)),
			@AttributeOverride(name = "mifidfrfloatesma", column = @Column(name = "mifidFrFloatESMA", length = 50)),
			@AttributeOverride(name = "mifidfrfloatcurcode", column = @Column(name = "mifidFrFloatCurCode", length = 50)),
			@AttributeOverride(name = "mifidfusubpr", column = @Column(name = "mifidFuSubPr", length = 50)),
			@AttributeOverride(name = "mifidfusubpresma", column = @Column(name = "mifidFuSubPrESMA", length = 50)),
			@AttributeOverride(name = "mifidissdateesma", column = @Column(name = "mifidIssDateESMA", length = 50)),
			@AttributeOverride(name = "mifidisssizeesma", column = @Column(name = "mifidIssSizeESMA", length = 50)),
			@AttributeOverride(name = "mifidmatdate", column = @Column(name = "mifidMatDate", length = 50)),
			@AttributeOverride(name = "mifidmatdateesma", column = @Column(name = "mifidMatDateESMA", length = 50)),
			@AttributeOverride(name = "mifidmostremaesma", column = @Column(name = "mifidMostReMaESMA", length = 50)),
			@AttributeOverride(name = "mifidoptype", column = @Column(name = "mifidOpType", length = 50)),
			@AttributeOverride(name = "mifidoptypeesma", column = @Column(name = "mifidOpTypeESMA", length = 50)),
			@AttributeOverride(name = "mifidptuw12esma", column = @Column(name = "mifidPTUW12ESMA", length = 50)),
			@AttributeOverride(name = "mifidptuwptv12mesma", column = @Column(name = "mifidPTUWPTV12MESMA", length = 50)),
			@AttributeOverride(name = "mifidpotrlisthfl", column = @Column(name = "mifidPoTrLISThFl", length = 50)),
			@AttributeOverride(name = "mifidpotrlisthvl", column = @Column(name = "mifidPoTrLISThVl", length = 50)),
			@AttributeOverride(name = "mifidpotrlistrper", column = @Column(name = "mifidPoTrLISTrPer", length = 50)),
			@AttributeOverride(name = "mifidpotrlisvoper", column = @Column(name = "mifidPoTrLISVoPer", length = 50)),
			@AttributeOverride(name = "mifidpotrsstithfl", column = @Column(name = "mifidPoTrSSTIThFl", length = 50)),
			@AttributeOverride(name = "mifidpotrsstithvl", column = @Column(name = "mifidPoTrSSTIThVl", length = 50)),
			@AttributeOverride(name = "mifidpotrsstitrper", column = @Column(name = "mifidPoTrSSTITrPer", length = 50)),
			@AttributeOverride(name = "mifidpotrsstivoper", column = @Column(name = "mifidPoTrSSTIVoPer", length = 50)),
			@AttributeOverride(name = "mifidpretrlisthfl", column = @Column(name = "mifidPreTrLISThFl", length = 50)),
			@AttributeOverride(name = "mifidpretrlisthvl", column = @Column(name = "mifidPreTrLISThVl", length = 50)),
			@AttributeOverride(name = "mifidpretrlistrper", column = @Column(name = "mifidPreTrLISTrPer", length = 50)),
			@AttributeOverride(name = "mifidpretrsstithfl", column = @Column(name = "mifidPreTrSSTIThFl", length = 50)),
			@AttributeOverride(name = "mifidpretrsstithvl", column = @Column(name = "mifidPreTrSSTIThVl", length = 50)),
			@AttributeOverride(name = "mifidpretrsstitrper", column = @Column(name = "mifidPreTrSSTITrPer", length = 50)),
			@AttributeOverride(name = "mifidregulatedesma", column = @Column(name = "mifidRegulatedESMA", length = 50)),
			@AttributeOverride(name = "mifidstmasizeesma", column = @Column(name = "mifidStMaSizeESMA", length = 50)),
			@AttributeOverride(name = "mifidstmasizecurcode", column = @Column(name = "mifidStMaSizeCurCode", length = 50)),
			@AttributeOverride(name = "mifidsubprod", column = @Column(name = "mifidSubProd", length = 50)),
			@AttributeOverride(name = "mifidsubprodesma", column = @Column(name = "mifidSubProdESMA", length = 50)),
			@AttributeOverride(name = "mifidtermdate", column = @Column(name = "mifidTermDate", length = 50)),
			@AttributeOverride(name = "mifidtermdateesma", column = @Column(name = "mifidTermDateESMA", length = 50)),
			@AttributeOverride(name = "mifidtrobflag", column = @Column(name = "mifidTrObFlag", length = 50)),
			@AttributeOverride(name = "mifidtradapdate", column = @Column(name = "mifidTrAdApDate", length = 50)),
			@AttributeOverride(name = "mifidtradapdateesma", column = @Column(name = "mifidTrAdApDateESMA", length = 50)),
			@AttributeOverride(name = "mifidtradreqdate", column = @Column(name = "mifidTrAdReqDate", length = 50)),
			@AttributeOverride(name = "mifidtradreqdateesma", column = @Column(name = "mifidTrAdReqDateESMA", length = 50)),
			@AttributeOverride(name = "mifidtrtype", column = @Column(name = "mifidTrType", length = 50)),
			@AttributeOverride(name = "mifidtrtypeesma", column = @Column(name = "mifidTrTypeESMA", length = 50)),
			@AttributeOverride(name = "mifidundindname", column = @Column(name = "mifidUndIndName", length = 50)),
			@AttributeOverride(name = "mifidundindnameesma", column = @Column(name = "mifidUndIndNameESMA", length = 50)),
			@AttributeOverride(name = "mifidundindtermesma", column = @Column(name = "mifidUndIndTermESMA", length = 50)),
			@AttributeOverride(name = "mifidundtype", column = @Column(name = "mifidUndType", length = 50)),
			@AttributeOverride(name = "mifiridentifier", column = @Column(name = "mifirIdentifier", length = 50)),
			@AttributeOverride(name = "mindenomination", column = @Column(name = "minDenomination", length = 50)),
			@AttributeOverride(name = "ncaavdailyturnover", column = @Column(name = "ncaAvDailyTurnover", length = 50)),
			@AttributeOverride(name = "ncaavdailyturncurcode", column = @Column(name = "ncaAvDailyTurnCurCode", length = 50)),
			@AttributeOverride(name = "ncafreefl", column = @Column(name = "ncaFreeFl", length = 50)),
			@AttributeOverride(name = "ncafreeflcurcode", column = @Column(name = "ncaFreeFlCurCode", length = 50)),
			@AttributeOverride(name = "notionalcuresma", column = @Column(name = "notionalCurESMA", length = 50)),
			@AttributeOverride(name = "optionroot", column = @Column(name = "optionRoot", length = 50)),
			@AttributeOverride(name = "placeholder", column = @Column(name = "placeholder", length = 50)),
			@AttributeOverride(name = "pricemultiplieresma", column = @Column(name = "priceMultiplierESMA", length = 50)),
			@AttributeOverride(name = "prtrmaquote", column = @Column(name = "prTrMaQuote", length = 50)),
			@AttributeOverride(name = "quotepermid", column = @Column(name = "quotePermID", length = 50)),
			@AttributeOverride(name = "reqfattbyissuer", column = @Column(name = "reqFATTByIssuer", length = 50)),
			@AttributeOverride(name = "reqfattbyissueresma", column = @Column(name = "reqFATTByIssuerESMA", length = 50)),
			@AttributeOverride(name = "securitydescription", column = @Column(name = "securityDescription", length = 50)),
			@AttributeOverride(name = "strikepriceesma", column = @Column(name = "strikePriceESMA", length = 50)),
			@AttributeOverride(name = "strikepricecuresma", column = @Column(name = "strikePriceCurESMA", length = 50)),
			@AttributeOverride(name = "suscategoryesma", column = @Column(name = "susCategoryESMA", length = 50)),
			@AttributeOverride(name = "susendedonesma", column = @Column(name = "susEndedOnESMA", length = 50)),
			@AttributeOverride(name = "susongoingesma", column = @Column(name = "susOnGoingESMA", length = 50)),
			@AttributeOverride(name = "susratesma", column = @Column(name = "susRatESMA", length = 50)),
			@AttributeOverride(name = "susstonesma", column = @Column(name = "susStOnESMA", length = 50)),
			@AttributeOverride(name = "ttlamissued", column = @Column(name = "ttlAmIssued", length = 50)),
			@AttributeOverride(name = "ttleutu12moesma", column = @Column(name = "ttlEUTu12MoESMA", length = 50)),
			@AttributeOverride(name = "ttleuvl12moesma", column = @Column(name = "ttlEUVl12MoESMA", length = 50)),
			@AttributeOverride(name = "undeeaelig", column = @Column(name = "undEeaElig", length = 50)),
			@AttributeOverride(name = "undisin", column = @Column(name = "undIsin", length = 50)),
			@AttributeOverride(name = "undisinesma", column = @Column(name = "undIsinESMA", length = 50)) })
	public XrefXxDspId getId() {
		return this.id;
	}

	public void setId(XrefXxDspId id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}

}
