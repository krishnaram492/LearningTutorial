package com.app.dhsloader.model;

import java.io.Serializable;

/**
 * @author Manasa
 * 
 */
public class DHSFeed implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String RIC;
	private String Quote_ID;
	private String Asset_ID;
	private String Action;
	private String _13F_Securities_Flag;
	private String _13F_Securities_Flag__Change_Flag;
	private String _13F_Securities_Flag__Previous;
	private String _144A_Registered_Flag;
	private String _144A_Registered_Flag__Change_Flag;
	private String _144A_Registered_Flag__Previous;
	private String AIFMD_Sub_Asset_Type_Code;
	private String AIFMD_Sub_Asset_Type_Code__Change_Flag;
	private String AIFMD_Sub_Asset_Type_Code__Previous;
	private String AII_Code;
	private String AII_Code__Change_Flag;
	private String AII_Code__Previous;
	private String Active_Instrument_Flag;
	private String Active_Instrument_Flag__Change_Flag;
	private String Active_Instrument_Flag__Previous;
	private String Active_Quote_Flag;
	private String Active_Quote_Flag__Change_Flag;
	private String Active_Quote_Flag__Previous;
	private String Asset_Category;
	private String Asset_Category__Change_Flag;
	private String Asset_Category__Previous;
	private String Asset_ID__Change_Flag;
	private String Asset_ID__Previous;
	private String Asset_Ratio_Against;
	private String Asset_Ratio_Against__Change_Flag;
	private String Asset_Ratio_Against__Previous;
	private String Asset_Ratio_For;
	private String Asset_Ratio_For__Change_Flag;
	private String Asset_Ratio_For__Previous;
	private String Asset_Status;
	private String Asset_Status__Change_Flag;
	private String Asset_Status__Previous;
	private String Australia_Code;
	private String Australia_Code__Change_Flag;
	private String Australia_Code__Previous;
	private String Austria_Code;
	private String Austria_Code__Change_Flag;
	private String Austria_Code__Previous;
	private String Barrier_Touched_Date;
	private String Barrier_Touched_Date__Change_Flag;
	private String Barrier_Touched_Date__Previous;
	private String Barrier_Touched_Indicator;
	private String Barrier_Touched_Indicator__Change_Flag;
	private String Barrier_Touched_Indicator__Previous;
	private String Base_Currency_Code;
	private String Base_Currency_Code__Change_Flag;
	private String Base_Currency_Code__Previous;
	private String Basket_Underlying_ISIN_List;
	private String Basket_Underlying_ISIN_List__Change_Flag;
	private String Basket_Underlying_ISIN_List__Previous;
	private String Basket_Warrant_Indicator;
	private String Basket_Warrant_Indicator__Change_Flag;
	private String Basket_Warrant_Indicator__Previous;
	private String Belgium_Code;
	private String Belgium_Code__Change_Flag;
	private String Belgium_Code__Previous;
	private String Bonus_Indicator;
	private String Bonus_Indicator__Change_Flag;
	private String Bonus_Indicator__Previous;
	private String Bonus_Level;
	private String Bonus_Level__Change_Flag;
	private String Bonus_Level__Previous;
	private String CDS_Reference_Obligation_ISIN;
	private String CDS_Reference_Obligation_ISIN__Change_Flag;
	private String CDS_Reference_Obligation_ISIN__Previous;
	private String CFI_Code;
	private String CFI_Code__Change_Flag;
	private String CFI_Code__Previous;
	private String CIN_Code;
	private String CIN_Code__Change_Flag;
	private String CIN_Code__Previous;
	private String CUSIP;
	private String CUSIP__Change_Flag;
	private String CUSIP__Previous;
	private String CUSIP_Issue_Status;
	private String CUSIP_Issue_Status__Change_Flag;
	private String CUSIP_Issue_Status__Previous;
	private String Cash_in_Lieu;
	private String Cash_in_Lieu__Change_Flag;
	private String Cash_in_Lieu__Previous;
	private String China_Connect_ELG;
	private String China_Connect_ELG__Change_Flag;
	private String China_Connect_ELG__Previous;
	private String Common_Code;
	private String Common_Code__Change_Flag;
	private String Common_Code__Previous;
	private String Company_Legal_Domicile;
	private String Company_Legal_Domicile__Change_Flag;
	private String Company_Legal_Domicile__Previous;
	private String Company_Short_Name;
	private String Company_Short_Name__Change_Flag;
	private String Company_Short_Name__Previous;
	private String Consolidated_Quote_ID;
	private String Consolidated_Quote_ID__Change_Flag;
	private String Consolidated_Quote_ID__Previous;
	private String Consolidated_RIC;
	private String Consolidated_RIC__Change_Flag;
	private String Consolidated_RIC__Previous;
	private String Contract_Month_and_Year;
	private String Contract_Month_and_Year__Change_Flag;
	private String Contract_Month_and_Year__Previous;
	private String Contract_Type;
	private String Contract_Type__Change_Flag;
	private String Contract_Type__Previous;
	private String Contributor_Relationship_Name;
	private String Contributor_Relationship_Name__Change_Flag;
	private String Contributor_Relationship_Name__Previous;
	private String Corporate_Action_Version_Number;
	private String Corporate_Action_Version_Number__Change_Flag;
	private String Corporate_Action_Version_Number__Previous;
	private String Country_Primary_Quote;
	private String Country_Primary_Quote__Change_Flag;
	private String Country_Primary_Quote__Previous;
	private String Country_of_Incorporation;
	private String Country_of_Incorporation__Change_Flag;
	private String Country_of_Incorporation__Previous;
	private String Country_of_Taxation_Code;
	private String Country_of_Taxation_Code__Change_Flag;
	private String Country_of_Taxation_Code__Previous;
	private String Coupon_Rate;
	private String Coupon_Rate__Change_Flag;
	private String Coupon_Rate__Previous;
	private String Currency_Code;
	private String Currency_Code__Change_Flag;
	private String Currency_Code__Previous;
	private String Currency_of_Nominal_Value__ESMA;
	private String Currency_of_Nominal_Value__ESMA__Change_Flag;
	private String Currency_of_Nominal_Value__ESMA__Previous;
	private String Current_Amount_Outstanding;
	private String Current_Amount_Outstanding__Change_Flag;
	private String Current_Amount_Outstanding__Previous;
	private String Deal_Start_Date;
	private String Deal_Start_Date__Change_Flag;
	private String Deal_Start_Date__Previous;
	private String Delivery_or_Cash_Settlement_Location;
	private String Delivery_or_Cash_Settlement_Location__Change_Flag;
	private String Delivery_or_Cash_Settlement_Location__Previous;
	private String Depository_Asset_Underlying;
	private String Depository_Asset_Underlying__Change_Flag;
	private String Depository_Asset_Underlying__Previous;
	private String Depository_Asset_Underlying_Quote_ID;
	private String Depository_Asset_Underlying_Quote_ID__Change_Flag;
	private String Depository_Asset_Underlying_Quote_ID__Previous;
	private String Display_Factor;
	private String Display_Factor__Change_Flag;
	private String Display_Factor__Previous;
	private String Dow_Jones_Industrial_Code;
	private String Dow_Jones_Industrial_Code__Change_Flag;
	private String Dow_Jones_Industrial_Code__Previous;
	private String EEA_Venue_Eligible_Flag;
	private String EEA_Venue_Eligible_Flag__Change_Flag;
	private String EEA_Venue_Eligible_Flag__Previous;
	private String ESMA_Instrument_Last_Update_Date;
	private String ESMA_Instrument_Last_Update_Date__Change_Flag;
	private String ESMA_Instrument_Last_Update_Date__Previous;
	private String ETF_Price_Type;
	private String ETF_Price_Type__Change_Flag;
	private String ETF_Price_Type__Previous;
	private String ETF_Principal_Quote_ID;
	private String ETF_Principal_Quote_ID__Change_Flag;
	private String ETF_Principal_Quote_ID__Previous;
	private String ETF_Princpal_Ric;
	private String ETF_Princpal_Ric__Change_Flag;
	private String ETF_Princpal_Ric__Previous;
	private String EU_Short_Sell_Eligible;
	private String EU_Short_Sell_Eligible__Change_Flag;
	private String EU_Short_Sell_Eligible__Previous;
	private String Entity_ID;
	private String Entity_ID__Change_Flag;
	private String Entity_ID__Previous;
	private String Euronext_Trading_Group;
	private String Euronext_Trading_Group__Change_Flag;
	private String Euronext_Trading_Group__Previous;
	private String Exchange_Code;
	private String Exchange_Code__Change_Flag;
	private String Exchange_Code__Previous;
	private String Exchange_Market_Size;
	private String Exchange_Market_Size__Change_Flag;
	private String Exchange_Market_Size__Previous;
	private String Exercise_Style;
	private String Exercise_Style__Change_Flag;
	private String Exercise_Style__Previous;
	private String Exotic_Parameter_Code;
	private String Exotic_Parameter_Code__Change_Flag;
	private String Exotic_Parameter_Code__Previous;
	private String Exotic_Value;
	private String Exotic_Value__Change_Flag;
	private String Exotic_Value__Previous;
	private String Expiration_Date;
	private String Expiration_Date__Change_Flag;
	private String Expiration_Date__Previous;
	private String FTSE_Industrial_Code;
	private String FTSE_Industrial_Code__Change_Flag;
	private String FTSE_Industrial_Code__Previous;
	private String FX_Type__ESMA;
	private String FX_Type__ESMA__Change_Flag;
	private String FX_Type__ESMA__Previous;
	private String File_Code;
	private String File_Code__Change_Flag;
	private String File_Code__Previous;
	private String Financial_Instrument_Short_Name;
	private String Financial_Instrument_Short_Name__Change_Flag;
	private String Financial_Instrument_Short_Name__ESMA;
	private String Financial_Instrument_Short_Name__ESMA__Change_Flag;
	private String Financial_Instrument_Short_Name__ESMA__Previous;
	private String Financial_Instrument_Short_Name__Previous;
	private String Financial_Transaction_Tax_Applied;
	private String Financial_Transaction_Tax_Applied__Change_Flag;
	private String Financial_Transaction_Tax_Applied__Previous;
	private String Financial_Transaction_Tax_Rate;
	private String Financial_Transaction_Tax_Rate__Change_Flag;
	private String Financial_Transaction_Tax_Rate__Previous;
	private String Finsbury_Company_Code;
	private String Finsbury_Company_Code__Change_Flag;
	private String Finsbury_Company_Code__Previous;
	private String First_Notice_Day;
	private String First_Notice_Day__Change_Flag;
	private String First_Notice_Day__Previous;
	private String First_Trading_Date;
	private String First_Trading_Date__Change_Flag;
	private String First_Trading_Date__Previous;
	private String Fixed_Rate__ESMA;
	private String Fixed_Rate__ESMA__Change_Flag;
	private String Fixed_Rate__ESMA__Previous;
	private String Fixed_Rate_of_Leg_1;
	private String Fixed_Rate_of_Leg_1__Change_Flag;
	private String Fixed_Rate_of_Leg_1__ESMA;
	private String Fixed_Rate_of_Leg_1__ESMA__Change_Flag;
	private String Fixed_Rate_of_Leg_1__ESMA__Previous;
	private String Fixed_Rate_of_Leg_1__Previous;
	private String Fixed_Rate_of_Leg_2;
	private String Fixed_Rate_of_Leg_2__Change_Flag;
	private String Fixed_Rate_of_Leg_2__ESMA;
	private String Fixed_Rate_of_Leg_2__ESMA__Change_Flag;
	private String Fixed_Rate_of_Leg_2__ESMA__Previous;
	private String Fixed_Rate_of_Leg_2__Previous;
	private String Floating_Rate_of_Leg_2;
	private String Floating_Rate_of_Leg_2__Change_Flag;
	private String Floating_Rate_of_Leg_2__ESMA;
	private String Floating_Rate_of_Leg_2__ESMA__Change_Flag;
	private String Floating_Rate_of_Leg_2__ESMA__Previous;
	private String Floating_Rate_of_Leg_2__Previous;
	private String Foreign_Ownership_Percent_of_Limit;
	private String Foreign_Ownership_Percent_of_Limit__Change_Flag;
	private String Foreign_Ownership_Percent_of_Limit__Previous;
	private String Foreign_Ownership_Percent_of_Total_Shares;
	private String Foreign_Ownership_Percent_of_Total_Shares__Change_Flag;
	private String Foreign_Ownership_Percent_of_Total_Shares__Previous;
	private String Foreign_Ownership_Shares_Allowed;
	private String Foreign_Ownership_Shares_Allowed__Change_Flag;
	private String Foreign_Ownership_Shares_Allowed__Previous;
	private String Foreign_Ownership_Shares_Held;
	private String Foreign_Ownership_Shares_Held__Change_Flag;
	private String Foreign_Ownership_Shares_Held__Previous;
	private String Foreign_Ownership_Shares_Remaining;
	private String Foreign_Ownership_Shares_Remaining__Change_Flag;
	private String Foreign_Ownership_Shares_Remaining__Previous;
	private String France_Code;
	private String France_Code__Change_Flag;
	private String France_Code__Previous;
	private String Freight_Derivative_Size;
	private String Freight_Derivative_Size__Change_Flag;
	private String Freight_Derivative_Size__Previous;
	private String Fully_Funded_Flag;
	private String Fully_Funded_Flag__Change_Flag;
	private String Fully_Funded_Flag__Previous;
	private String GICS_Industry_Code;
	private String GICS_Industry_Code__Change_Flag;
	private String GICS_Industry_Code__Previous;
	private String ICB_Code;
	private String ICB_Code__Change_Flag;
	private String ICB_Code__Previous;
	private String ILX_Code;
	private String ILX_Code__Change_Flag;
	private String ILX_Code__Previous;
	private String INAV_Quote_ID;
	private String INAV_Quote_ID__Change_Flag;
	private String INAV_Quote_ID__Previous;
	private String INAV_RIC;
	private String INAV_RIC__Change_Flag;
	private String INAV_RIC__Previous;
	private String IR_Term_of_Contract;
	private String IR_Term_of_Contract__Change_Flag;
	private String IR_Term_of_Contract__ESMA;
	private String IR_Term_of_Contract__ESMA__Change_Flag;
	private String IR_Term_of_Contract__ESMA__Previous;
	private String IR_Term_of_Contract__Previous;
	private String IR_Term_of_Contract_of_Leg_2;
	private String IR_Term_of_Contract_of_Leg_2__Change_Flag;
	private String IR_Term_of_Contract_of_Leg_2__ESMA;
	private String IR_Term_of_Contract_of_Leg_2__ESMA__Change_Flag;
	private String IR_Term_of_Contract_of_Leg_2__ESMA__Previous;
	private String IR_Term_of_Contract_of_Leg_2__Previous;
	private String ISIN;
	private String ISIN__Change_Flag;
	private String ISIN__Previous;
	private String ISIX_Code;
	private String ISIX_Code__Change_Flag;
	private String ISIX_Code__Previous;
	private String ISO_CFI_Code;
	private String ISO_CFI_Code__Change_Flag;
	private String ISO_CFI_Code__Previous;
	private String In_ANNA_DSB_Flag;
	private String In_ANNA_DSB_Flag__Change_Flag;
	private String In_ANNA_DSB_Flag__Previous;
	private String In_ESMA_FIRDS;
	private String In_ESMA_FIRDS__Change_Flag;
	private String In_ESMA_FIRDS__Previous;
	private String Inflation_Index_ISIN;
	private String Inflation_Index_ISIN__Change_Flag;
	private String Inflation_Index_ISIN__Previous;
	private String Instrument_Classification__ESMA;
	private String Instrument_Classification__ESMA__Change_Flag;
	private String Instrument_Classification__ESMA__Previous;
	private String Instrument_Full_Name__ESMA;
	private String Instrument_Full_Name__ESMA__Change_Flag;
	private String Instrument_Full_Name__ESMA__Previous;
	private String Inverse_Rate_Marker;
	private String Inverse_Rate_Marker__Change_Flag;
	private String Inverse_Rate_Marker__Previous;
	private String Ireland_Stamp_Duty_Flag;
	private String Ireland_Stamp_Duty_Flag__Change_Flag;
	private String Ireland_Stamp_Duty_Flag__Previous;
	private String Is_Adjusted;
	private String Is_Adjusted__Change_Flag;
	private String Is_Adjusted__Previous;
	private String Issue_Date;
	private String Issue_Date__Change_Flag;
	private String Issue_Date__Previous;
	private String Issue_Perm_ID;
	private String Issue_Perm_ID__Change_Flag;
	private String Issue_Perm_ID__Previous;
	private String Issue_Price;
	private String Issue_Price__Change_Flag;
	private String Issue_Price__Previous;
	private String Issuer_LEI;
	private String Issuer_LEI__Change_Flag;
	private String Issuer_LEI__Previous;
	private String Issuer_Name;
	private String Issuer_Name__Change_Flag;
	private String Issuer_Name__Previous;
	private String Issuer_OrgID;
	private String Issuer_OrgID__Change_Flag;
	private String Issuer_OrgID__Previous;
	private String Issuer_or_Trading_Venue_LEI__ESMA;
	private String Issuer_or_Trading_Venue_LEI__ESMA__Change_Flag;
	private String Issuer_or_Trading_Venue_LEI__ESMA__Previous;
	private String Kazakhstan_Code;
	private String Kazakhstan_Code__Change_Flag;
	private String Kazakhstan_Code__Previous;
	private String Last_Delivery_Date;
	private String Last_Delivery_Date__Change_Flag;
	private String Last_Delivery_Date__Previous;
	private String Last_Trading_Day;
	private String Last_Trading_Day__Change_Flag;
	private String Last_Trading_Day__Previous;
	private String Level;
	private String Limited_Terms_Flag;
	private String Limited_Terms_Flag__Change_Flag;
	private String Limited_Terms_Flag__Previous;
	private String Lipper_ID;
	private String Lipper_ID__Change_Flag;
	private String Lipper_ID__Previous;
	private String Listing_Status;
	private String Listing_Status__Change_Flag;
	private String Listing_Status__Previous;
	private String Listing_Suspension_Initiator__ESMA;
	private String Listing_Suspension_Initiator__ESMA__Change_Flag;
	private String Listing_Suspension_Initiator__ESMA__Previous;
	private String Listing_Suspension_Notifying_NCA__ESMA;
	private String Listing_Suspension_Notifying_NCA__ESMA__Change_Flag;
	private String Listing_Suspension_Notifying_NCA__ESMA__Previous;
	private String Lot_Size;
	private String Lot_Size__Change_Flag;
	private String Lot_Size__Previous;
	private String Lot_Units;
	private String Lot_Units__Change_Flag;
	private String Lot_Units__Previous;
	private String Lower_Barrier;
	private String Lower_Barrier__Change_Flag;
	private String Lower_Barrier__Previous;
	private String MIC;
	private String MIC__Change_Flag;
	private String MIC__Previous;
	private String MIFID_Sub_Asset_Class;
	private String MIFID_Sub_Asset_Class__Change_Flag;
	private String MIFID_Sub_Asset_Class__Previous;
	private String MIFIR_Identifier;
	private String MIFIR_Identifier__Change_Flag;
	private String MIFIR_Identifier__Previous;
	private String Malaysia_Code;
	private String Malaysia_Code__Change_Flag;
	private String Malaysia_Code__Previous;
	private String Market_Attributable_Source_Perm_ID;
	private String Market_Attributable_Source_Perm_ID__Change_Flag;
	private String Market_Attributable_Source_Perm_ID__Previous;
	private String Market_Level_CDHKG;
	private String Market_Level_CDHKG__Change_Flag;
	private String Market_Level_CDHKG__Previous;
	private String Market_MIC;
	private String Market_MIC__Change_Flag;
	private String Market_MIC__Previous;
	private String Market_Segment_MIC;
	private String Market_Segment_MIC__Change_Flag;
	private String Market_Segment_MIC__Previous;
	private String Market_Segment_Name;
	private String Market_Segment_Name__Change_Flag;
	private String Market_Segment_Name__Previous;
	private String Maturity_Date;
	private String Maturity_Date__Change_Flag;
	private String Maturity_Date__Previous;
	private String Method_of_Delivery;
	private String Method_of_Delivery__Change_Flag;
	private String Method_of_Delivery__Previous;
	private String MiFID_Asset_Class;
	private String MiFID_Asset_Class__Change_Flag;
	private String MiFID_Asset_Class__Previous;
	private String MiFID_Asset_Class_of_Underlying;
	private String MiFID_Asset_Class_of_Underlying__Change_Flag;
	private String MiFID_Asset_Class_of_Underlying__Previous;
	private String MiFID_Average_Daily_Notional_Amount_per_instrument__ESMA;
	private String MiFID_Average_Daily_Notional_Amount_per_instrument__ESMA__Change_Flag;
	private String MiFID_Average_Daily_Notional_Amount_per_instrument__ESMA__Previous;
	private String MiFID_Average_Daily_Turnover__ESMA;
	private String MiFID_Average_Daily_Turnover__ESMA__Change_Flag;
	private String MiFID_Average_Daily_Turnover__ESMA__Previous;
	private String MiFID_Average_Daily_Turnover_Currency_Code;
	private String MiFID_Average_Daily_Turnover_Currency_Code__Change_Flag;
	private String MiFID_Average_Daily_Turnover_Currency_Code__Previous;
	private String MiFID_Average_Daily_number_of_Trades_per_instrument__ESMA;
	private String MiFID_Average_Daily_number_of_Trades_per_instrument__ESMA__Change_Flag;
	private String MiFID_Average_Daily_number_of_Trades_per_instrument__ESMA__Previous;
	private String MiFID_Average_Value_Of_Transactions__ESMA;
	private String MiFID_Average_Value_Of_Transactions__ESMA__Change_Flag;
	private String MiFID_Average_Value_Of_Transactions__ESMA__Previous;
	private String MiFID_Average_Value_Of_Transactions_Currency_Code;
	private String MiFID_Average_Value_Of_Transactions_Currency_Code__Change_Flag;
	private String MiFID_Average_Value_Of_Transactions_Currency_Code__Previous;
	private String MiFID_Base_Point_Spread;
	private String MiFID_Base_Point_Spread__Change_Flag;
	private String MiFID_Base_Point_Spread__ESMA;
	private String MiFID_Base_Point_Spread__ESMA__Change_Flag;
	private String MiFID_Base_Point_Spread__ESMA__Previous;
	private String MiFID_Base_Point_Spread__Previous;
	private String MiFID_Base_Product;
	private String MiFID_Base_Product__Change_Flag;
	private String MiFID_Base_Product__ESMA;
	private String MiFID_Base_Product__ESMA__Change_Flag;
	private String MiFID_Base_Product__ESMA__Previous;
	private String MiFID_Base_Product__Previous;
	private String MiFID_Bond_Seniority;
	private String MiFID_Bond_Seniority__Change_Flag;
	private String MiFID_Bond_Seniority__ESMA;
	private String MiFID_Bond_Seniority__ESMA__Change_Flag;
	private String MiFID_Bond_Seniority__ESMA__Previous;
	private String MiFID_Bond_Seniority__Previous;
	private String MiFID_Bond_Type;
	private String MiFID_Bond_Type__Change_Flag;
	private String MiFID_Bond_Type__Previous;
	private String MiFID_COFIA_Liquidity_Flag;
	private String MiFID_COFIA_Liquidity_Flag__Change_Flag;
	private String MiFID_COFIA_Liquidity_Flag__Previous;
	private String MiFID_Clearing_Obligation_Flag;
	private String MiFID_Clearing_Obligation_Flag__Change_Flag;
	private String MiFID_Clearing_Obligation_Flag__Previous;
	private String MiFID_Clearing_Obligation_Flag_Effective_Date;
	private String MiFID_Clearing_Obligation_Flag_Effective_Date__Change_Flag;
	private String MiFID_Clearing_Obligation_Flag_Effective_Date__Previous;
	private String MiFID_Commodities_Derivative_Indicator;
	private String MiFID_Commodities_Derivative_Indicator__Change_Flag;
	private String MiFID_Commodities_Derivative_Indicator__ESMA;
	private String MiFID_Commodities_Derivative_Indicator__ESMA__Change_Flag;
	private String MiFID_Commodities_Derivative_Indicator__ESMA__Previous;
	private String MiFID_Commodities_Derivative_Indicator__Previous;
	private String MiFID_Complex_Instrument_Flag;
	private String MiFID_Complex_Instrument_Flag__Change_Flag;
	private String MiFID_Complex_Instrument_Flag__ESMA;
	private String MiFID_Complex_Instrument_Flag__ESMA__Change_Flag;
	private String MiFID_Complex_Instrument_Flag__ESMA__Previous;
	private String MiFID_Complex_Instrument_Flag__Previous;
	private String MiFID_Complex_Instrument_Reason;
	private String MiFID_Complex_Instrument_Reason__Change_Flag;
	private String MiFID_Complex_Instrument_Reason__Previous;
	private String MiFID_Contract_Subtype;
	private String MiFID_Contract_Subtype__Change_Flag;
	private String MiFID_Contract_Subtype__Previous;
	private String MiFID_Contract_Type;
	private String MiFID_Contract_Type__Change_Flag;
	private String MiFID_Contract_Type__Previous;
	private String MiFID_Delivery_Type;
	private String MiFID_Delivery_Type__Change_Flag;
	private String MiFID_Delivery_Type__ESMA;
	private String MiFID_Delivery_Type__ESMA__Change_Flag;
	private String MiFID_Delivery_Type__ESMA__Previous;
	private String MiFID_Delivery_Type__Previous;
	private String MiFID_Emissions_Allowances_Sub_Type;
	private String MiFID_Emissions_Allowances_Sub_Type__Change_Flag;
	private String MiFID_Emissions_Allowances_Sub_Type__Previous;
	private String MiFID_Exercise_Style;
	private String MiFID_Exercise_Style__Change_Flag;
	private String MiFID_Exercise_Style__ESMA;
	private String MiFID_Exercise_Style__ESMA__Change_Flag;
	private String MiFID_Exercise_Style__ESMA__Previous;
	private String MiFID_Exercise_Style__Previous;
	private String MiFID_Expiration_Date;
	private String MiFID_Expiration_Date__Change_Flag;
	private String MiFID_Expiration_Date__ESMA;
	private String MiFID_Expiration_Date__ESMA__Change_Flag;
	private String MiFID_Expiration_Date__ESMA__Previous;
	private String MiFID_Expiration_Date__Previous;
	private String MiFID_FX_Type;
	private String MiFID_FX_Type__Change_Flag;
	private String MiFID_FX_Type__Previous;
	private String MiFID_Final_Price_Type;
	private String MiFID_Final_Price_Type__Change_Flag;
	private String MiFID_Final_Price_Type__ESMA;
	private String MiFID_Final_Price_Type__ESMA__Change_Flag;
	private String MiFID_Final_Price_Type__ESMA__Previous;
	private String MiFID_Final_Price_Type__Previous;
	private String MiFID_First_Trade_Date;
	private String MiFID_First_Trade_Date__Change_Flag;
	private String MiFID_First_Trade_Date__ESMA;
	private String MiFID_First_Trade_Date__ESMA__Change_Flag;
	private String MiFID_First_Trade_Date__ESMA__Previous;
	private String MiFID_First_Trade_Date__Previous;
	private String MiFID_Flag;
	private String MiFID_Flag__Change_Flag;
	private String MiFID_Flag__Previous;
	private String MiFID_Free_Float__ESMA;
	private String MiFID_Free_Float__ESMA__Change_Flag;
	private String MiFID_Free_Float__ESMA__Previous;
	private String MiFID_Free_Float_Currency_Code;
	private String MiFID_Free_Float_Currency_Code__Change_Flag;
	private String MiFID_Free_Float_Currency_Code__Previous;
	private String MiFID_Free_Float_Upper_Limit__ESMA;
	private String MiFID_Free_Float_Upper_Limit__ESMA__Change_Flag;
	private String MiFID_Free_Float_Upper_Limit__ESMA__Previous;
	private String MiFID_Further_Sub_Product;
	private String MiFID_Further_Sub_Product__Change_Flag;
	private String MiFID_Further_Sub_Product__ESMA;
	private String MiFID_Further_Sub_Product__ESMA__Change_Flag;
	private String MiFID_Further_Sub_Product__ESMA__Previous;
	private String MiFID_Further_Sub_Product__Previous;
	private String MiFID_Index_Identifier;
	private String MiFID_Index_Identifier__Change_Flag;
	private String MiFID_Index_Identifier__ESMA;
	private String MiFID_Index_Identifier__ESMA__Change_Flag;
	private String MiFID_Index_Identifier__ESMA__Previous;
	private String MiFID_Index_Identifier__Previous;
	private String MiFID_Index_Name;
	private String MiFID_Index_Name__Change_Flag;
	private String MiFID_Index_Name__ESMA;
	private String MiFID_Index_Name__ESMA__Change_Flag;
	private String MiFID_Index_Name__ESMA__Previous;
	private String MiFID_Index_Name__Previous;
	private String MiFID_Index_Term;
	private String MiFID_Index_Term__Change_Flag;
	private String MiFID_Index_Term__ESMA;
	private String MiFID_Index_Term__ESMA__Change_Flag;
	private String MiFID_Index_Term__ESMA__Previous;
	private String MiFID_Index_Term__Previous;
	private String MiFID_Inflation_Index_Name;
	private String MiFID_Inflation_Index_Name__Change_Flag;
	private String MiFID_Inflation_Index_Name__Previous;
	private String MiFID_Issuance_Date;
	private String MiFID_Issuance_Date__Change_Flag;
	private String MiFID_Issuance_Date__ESMA;
	private String MiFID_Issuance_Date__ESMA__Change_Flag;
	private String MiFID_Issuance_Date__ESMA__Previous;
	private String MiFID_Issuance_Date__Previous;
	private String MiFID_Issuance_Size__ESMA;
	private String MiFID_Issuance_Size__ESMA__Change_Flag;
	private String MiFID_Issuance_Size__ESMA__Previous;
	private String MiFID_Liquidity_Flag__ESMA;
	private String MiFID_Liquidity_Flag__ESMA__Change_Flag;
	private String MiFID_Liquidity_Flag__ESMA__Previous;
	private String MiFID_Maturity_Date;
	private String MiFID_Maturity_Date__Change_Flag;
	private String MiFID_Maturity_Date__ESMA;
	private String MiFID_Maturity_Date__ESMA__Change_Flag;
	private String MiFID_Maturity_Date__ESMA__Previous;
	private String MiFID_Maturity_Date__Previous;
	private String MiFID_Most_Relevant_Market__ESMA;
	private String MiFID_Most_Relevant_Market__ESMA__Change_Flag;
	private String MiFID_Most_Relevant_Market__ESMA__Previous;
	private String MiFID_Next_Roll_Date;
	private String MiFID_Next_Roll_Date__Change_Flag;
	private String MiFID_Next_Roll_Date__Previous;
	private String MiFID_Option_Type;
	private String MiFID_Option_Type__Change_Flag;
	private String MiFID_Option_Type__ESMA;
	private String MiFID_Option_Type__ESMA__Change_Flag;
	private String MiFID_Option_Type__ESMA__Previous;
	private String MiFID_Option_Type__Previous;
	private String MiFID_Percent_Trading_Under_Waivers_12_Month__ESMA;
	private String MiFID_Percent_Trading_Under_Waivers_12_Month__ESMA__Change_Flag;
	private String MiFID_Percent_Trading_Under_Waivers_12_Month__ESMA__Previous;
	private String MiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA;
	private String MiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA__Change_Flag;
	private String MiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA__Previous;
	private String MiFID_Post_Trade_LIS_Threshold_Floor;
	private String MiFID_Post_Trade_LIS_Threshold_Floor__Change_Flag;
	private String MiFID_Post_Trade_LIS_Threshold_Floor__Previous;
	private String MiFID_Post_Trade_LIS_Threshold_Value;
	private String MiFID_Post_Trade_LIS_Threshold_Value__Change_Flag;
	private String MiFID_Post_Trade_LIS_Threshold_Value__Previous;
	private String MiFID_Post_Trade_LIS_Trade_Percentile;
	private String MiFID_Post_Trade_LIS_Trade_Percentile__Change_Flag;
	private String MiFID_Post_Trade_LIS_Trade_Percentile__Previous;
	private String MiFID_Post_Trade_LIS_Volume_Percentile;
	private String MiFID_Post_Trade_LIS_Volume_Percentile__Change_Flag;
	private String MiFID_Post_Trade_LIS_Volume_Percentile__Previous;
	private String MiFID_Post_Trade_SSTI_Threshold_Floor;
	private String MiFID_Post_Trade_SSTI_Threshold_Floor__Change_Flag;
	private String MiFID_Post_Trade_SSTI_Threshold_Floor__Previous;
	private String MiFID_Post_Trade_SSTI_Threshold_Value;
	private String MiFID_Post_Trade_SSTI_Threshold_Value__Change_Flag;
	private String MiFID_Post_Trade_SSTI_Threshold_Value__Previous;
	private String MiFID_Post_Trade_SSTI_Trade_Percentile;
	private String MiFID_Post_Trade_SSTI_Trade_Percentile__Change_Flag;
	private String MiFID_Post_Trade_SSTI_Trade_Percentile__Previous;
	private String MiFID_Post_Trade_SSTI_Volume_Percentile;
	private String MiFID_Post_Trade_SSTI_Volume_Percentile__Change_Flag;
	private String MiFID_Post_Trade_SSTI_Volume_Percentile__Previous;
	private String MiFID_Pre_Trade_LIS_Threshold_Floor;
	private String MiFID_Pre_Trade_LIS_Threshold_Floor__Change_Flag;
	private String MiFID_Pre_Trade_LIS_Threshold_Floor__Previous;
	private String MiFID_Pre_Trade_LIS_Threshold_Value;
	private String MiFID_Pre_Trade_LIS_Threshold_Value__Change_Flag;
	private String MiFID_Pre_Trade_LIS_Threshold_Value__Previous;
	private String MiFID_Pre_Trade_LIS_Trade_Percentile;
	private String MiFID_Pre_Trade_LIS_Trade_Percentile__Change_Flag;
	private String MiFID_Pre_Trade_LIS_Trade_Percentile__Previous;
	private String MiFID_Pre_Trade_SSTI_Threshold_Floor;
	private String MiFID_Pre_Trade_SSTI_Threshold_Floor__Change_Flag;
	private String MiFID_Pre_Trade_SSTI_Threshold_Floor__Previous;
	private String MiFID_Pre_Trade_SSTI_Threshold_Value;
	private String MiFID_Pre_Trade_SSTI_Threshold_Value__Change_Flag;
	private String MiFID_Pre_Trade_SSTI_Threshold_Value__Previous;
	private String MiFID_Pre_Trade_SSTI_Trade_Percentile;
	private String MiFID_Pre_Trade_SSTI_Trade_Percentile__Change_Flag;
	private String MiFID_Pre_Trade_SSTI_Trade_Percentile__Previous;
	private String MiFID_Primary_Market;
	private String MiFID_Primary_Market__Change_Flag;
	private String MiFID_Primary_Market__Previous;
	private String MiFID_Regulated;
	private String MiFID_Regulated__Change_Flag;
	private String MiFID_Regulated__ESMA;
	private String MiFID_Regulated__ESMA__Change_Flag;
	private String MiFID_Regulated__ESMA__Previous;
	private String MiFID_Regulated__Previous;
	private String MiFID_Series;
	private String MiFID_Series__Change_Flag;
	private String MiFID_Series__Previous;
	private String MiFID_Standard_Market_Size__ESMA;
	private String MiFID_Standard_Market_Size__ESMA__Change_Flag;
	private String MiFID_Standard_Market_Size__ESMA__Previous;
	private String MiFID_Standard_Market_Size_Currency_Code;
	private String MiFID_Standard_Market_Size_Currency_Code__Change_Flag;
	private String MiFID_Standard_Market_Size_Currency_Code__Previous;
	private String MiFID_Sub_Product;
	private String MiFID_Sub_Product__Change_Flag;
	private String MiFID_Sub_Product__ESMA;
	private String MiFID_Sub_Product__ESMA__Change_Flag;
	private String MiFID_Sub_Product__ESMA__Previous;
	private String MiFID_Sub_Product__Previous;
	private String MiFID_SubAsset_Class;
	private String MiFID_SubAsset_Class__Change_Flag;
	private String MiFID_SubAsset_Class__Previous;
	private String MiFID_SubAsset_Class_Perm_ID;
	private String MiFID_SubAsset_Class_Perm_ID__Change_Flag;
	private String MiFID_SubAsset_Class_Perm_ID__Previous;
	private String MiFID_SubClass_Effective_Date;
	private String MiFID_SubClass_Effective_Date__Change_Flag;
	private String MiFID_SubClass_Effective_Date__Previous;
	private String MiFID_SubClass_End_Date;
	private String MiFID_SubClass_End_Date__Change_Flag;
	private String MiFID_SubClass_End_Date__Previous;
	private String MiFID_SubClass_Perm_ID;
	private String MiFID_SubClass_Perm_ID__Change_Flag;
	private String MiFID_SubClass_Perm_ID__Previous;
	private String MiFID_Termination_Date;
	private String MiFID_Termination_Date__Change_Flag;
	private String MiFID_Termination_Date__ESMA;
	private String MiFID_Termination_Date__ESMA__Change_Flag;
	private String MiFID_Termination_Date__ESMA__Previous;
	private String MiFID_Termination_Date__Previous;
	private String MiFID_Threshold_Effective_Date;
	private String MiFID_Threshold_Effective_Date__Change_Flag;
	private String MiFID_Threshold_Effective_Date__Previous;
	private String MiFID_Threshold_End_Date;
	private String MiFID_Threshold_End_Date__Change_Flag;
	private String MiFID_Threshold_End_Date__Previous;
	private String MiFID_Total_Market_Volume__ESMA;
	private String MiFID_Total_Market_Volume__ESMA__Change_Flag;
	private String MiFID_Total_Market_Volume__ESMA__Previous;
	private String MiFID_Total_Market_Volume_Date__ESMA;
	private String MiFID_Total_Market_Volume_Date__ESMA__Change_Flag;
	private String MiFID_Total_Market_Volume_Date__ESMA__Previous;
	private String MiFID_Total_Number_of_Transactions__ESMA;
	private String MiFID_Total_Number_of_Transactions__ESMA__Change_Flag;
	private String MiFID_Total_Number_of_Transactions__ESMA__Previous;
	private String MiFID_Total_Number_of_Transactions_Date__ESMA;
	private String MiFID_Total_Number_of_Transactions_Date__ESMA__Change_Flag;
	private String MiFID_Total_Number_of_Transactions_Date__ESMA__Previous;
	private String MiFID_Trade_Obligation_Effective_Date;
	private String MiFID_Trade_Obligation_Effective_Date__Change_Flag;
	private String MiFID_Trade_Obligation_Effective_Date__Previous;
	private String MiFID_Trade_Obligation_Flag;
	private String MiFID_Trade_Obligation_Flag__Change_Flag;
	private String MiFID_Trade_Obligation_Flag__Previous;
	private String MiFID_Trading_Admission_Approval_Date;
	private String MiFID_Trading_Admission_Approval_Date__Change_Flag;
	private String MiFID_Trading_Admission_Approval_Date__ESMA;
	private String MiFID_Trading_Admission_Approval_Date__ESMA__Change_Flag;
	private String MiFID_Trading_Admission_Approval_Date__ESMA__Previous;
	private String MiFID_Trading_Admission_Approval_Date__Previous;
	private String MiFID_Trading_Admission_Request_Date;
	private String MiFID_Trading_Admission_Request_Date__Change_Flag;
	private String MiFID_Trading_Admission_Request_Date__ESMA;
	private String MiFID_Trading_Admission_Request_Date__ESMA__Change_Flag;
	private String MiFID_Trading_Admission_Request_Date__ESMA__Previous;
	private String MiFID_Trading_Admission_Request_Date__Previous;
	private String MiFID_Transaction_Type;
	private String MiFID_Transaction_Type__Change_Flag;
	private String MiFID_Transaction_Type__ESMA;
	private String MiFID_Transaction_Type__ESMA__Change_Flag;
	private String MiFID_Transaction_Type__ESMA__Previous;
	private String MiFID_Transaction_Type__Previous;
	private String MiFID_Underlying_Index_Name;
	private String MiFID_Underlying_Index_Name__Change_Flag;
	private String MiFID_Underlying_Index_Name__ESMA;
	private String MiFID_Underlying_Index_Name__ESMA__Change_Flag;
	private String MiFID_Underlying_Index_Name__ESMA__Previous;
	private String MiFID_Underlying_Index_Name__Previous;
	private String MiFID_Underlying_Index_Term;
	private String MiFID_Underlying_Index_Term__Change_Flag;
	private String MiFID_Underlying_Index_Term__ESMA;
	private String MiFID_Underlying_Index_Term__ESMA__Change_Flag;
	private String MiFID_Underlying_Index_Term__ESMA__Previous;
	private String MiFID_Underlying_Index_Term__Previous;
	private String MiFID_Underlying_Type;
	private String MiFID_Underlying_Type__Change_Flag;
	private String MiFID_Underlying_Type__Previous;
	private String MiFID_Version;
	private String MiFID_Version__Change_Flag;
	private String MiFID_Version__Previous;
	private String Minimum_Denomination;
	private String Minimum_Denomination__Change_Flag;
	private String Minimum_Denomination__Previous;
	private String Minimum_Denomination_Complex_Flag;
	private String Minimum_Denomination_Complex_Flag__Change_Flag;
	private String Minimum_Denomination_Complex_Flag__Previous;
	private String Minimum_Traded_Value__ESMA;
	private String Minimum_Traded_Value__ESMA__Change_Flag;
	private String Minimum_Traded_Value__ESMA__Previous;
	private String NCA_Average_Daily_Turnover;
	private String NCA_Average_Daily_Turnover__Change_Flag;
	private String NCA_Average_Daily_Turnover__Previous;
	private String NCA_Average_Daily_Turnover_Currency_Code;
	private String NCA_Average_Daily_Turnover_Currency_Code__Change_Flag;
	private String NCA_Average_Daily_Turnover_Currency_Code__Previous;
	private String NCA_Average_Value_Of_Transactions;
	private String NCA_Average_Value_Of_Transactions__Change_Flag;
	private String NCA_Average_Value_Of_Transactions__Previous;
	private String NCA_Average_Value_Of_Transactions_Currency_Code;
	private String NCA_Average_Value_Of_Transactions_Currency_Code__Change_Flag;
	private String NCA_Average_Value_Of_Transactions_Currency_Code__Previous;
	private String NCA_Free_Float;
	private String NCA_Free_Float__Change_Flag;
	private String NCA_Free_Float__Previous;
	private String NCA_Free_Float_Currency_Code;
	private String NCA_Free_Float_Currency_Code__Change_Flag;
	private String NCA_Free_Float_Currency_Code__Previous;
	private String NCA_ORGID;
	private String NCA_ORGID__Change_Flag;
	private String NCA_ORGID__Previous;
	private String Netherlands_Code;
	private String Netherlands_Code__Change_Flag;
	private String Netherlands_Code__Previous;
	private String Next_Contract;
	private String Next_Contract__Change_Flag;
	private String Next_Contract__Previous;
	private String Next_Contract_Date;
	private String Next_Contract_Date__Change_Flag;
	private String Next_Contract_Date__Previous;
	private String Next_Contract_Quote_ID;
	private String Next_Contract_Quote_ID__Change_Flag;
	private String Next_Contract_Quote_ID__Previous;
	private String Notional_Currency;
	private String Notional_Currency__Change_Flag;
	private String Notional_Currency__ESMA;
	private String Notional_Currency__ESMA__Change_Flag;
	private String Notional_Currency__ESMA__Previous;
	private String Notional_Currency__Previous;
	private String Notional_Currency_2;
	private String Notional_Currency_2__Change_Flag;
	private String Notional_Currency_2__ESMA;
	private String Notional_Currency_2__ESMA__Change_Flag;
	private String Notional_Currency_2__ESMA__Previous;
	private String Notional_Currency_2__Previous;
	private String Number_of_Days_to_Maturity;
	private String Number_of_Days_to_Maturity__Change_Flag;
	private String Number_of_Days_to_Maturity__Previous;
	private String Number_of_Issued_Instruments;
	private String Number_of_Issued_Instruments__Change_Flag;
	private String Number_of_Issued_Instruments__Previous;
	private String OCC_Code;
	private String OCC_Code__Change_Flag;
	private String OCC_Code__Previous;
	private String OPOL;
	private String OPOL__Change_Flag;
	private String OPOL__Previous;
	private String OPRA_Regional_Exchange_List;
	private String OPRA_Regional_Exchange_List__Change_Flag;
	private String OPRA_Regional_Exchange_List__Previous;
	private String OpenEnded_Warrant_Indicator;
	private String OpenEnded_Warrant_Indicator__Change_Flag;
	private String OpenEnded_Warrant_Indicator__Previous;
	private String Operating_Mic;
	private String Operating_Mic__Change_Flag;
	private String Operating_Mic__Previous;
	private String Option_root;
	private String Option_root__Change_Flag;
	private String Option_root__Previous;
	private String Organization_Perm_ID;
	private String Organization_Perm_ID__Change_Flag;
	private String Organization_Perm_ID__Previous;
	private String Organization_Sub_Type;
	private String Organization_Sub_Type__Change_Flag;
	private String Organization_Sub_Type__Previous;
	private String Organization_Type;
	private String Organization_Type__Change_Flag;
	private String Organization_Type__Previous;
	private String Original_Expiry_Date;
	private String Original_Expiry_Date__Change_Flag;
	private String Original_Expiry_Date__Previous;
	private String P_Chip_Flag;
	private String P_Chip_Flag__Change_Flag;
	private String P_Chip_Flag__Previous;
	private String PE_Code;
	private String PE_Code__Change_Flag;
	private String PE_Code__Previous;
	private String PILC;
	private String PILC__Change_Flag;
	private String PILC__Previous;
	private String PTM_Levy_Eligibility_Flag;
	private String PTM_Levy_Eligibility_Flag__Change_Flag;
	private String PTM_Levy_Eligibility_Flag__Previous;
	private String Participatory_Notes;
	private String Participatory_Notes__Change_Flag;
	private String Participatory_Notes__Previous;
	private String Periodic_Call_Auc_Session_Flag;
	private String Periodic_Call_Auc_Session_Flag__Change_Flag;
	private String Periodic_Call_Auc_Session_Flag__Previous;
	private String Periodicity;
	private String Periodicity__Change_Flag;
	private String Periodicity__Previous;
	private String Place_of_Listing_Flag;
	private String Place_of_Listing_Flag__Change_Flag;
	private String Place_of_Listing_Flag__Previous;
	private String Placeholder;
	private String Price_Multiplier__DSB;
	private String Price_Multiplier__DSB__Change_Flag;
	private String Price_Multiplier__DSB__Previous;
	private String Price_Multiplier__ESMA;
	private String Price_Multiplier__ESMA__Change_Flag;
	private String Price_Multiplier__ESMA__Previous;
	private String Price_basis;
	private String Price_basis__Change_Flag;
	private String Price_basis__Previous;
	private String Pricing_Unit;
	private String Pricing_Unit__Change_Flag;
	private String Pricing_Unit__Previous;
	private String Primary_Chain_or_Tile;
	private String Primary_Chain_or_Tile__Change_Flag;
	private String Primary_Chain_or_Tile__Previous;
	private String Primary_Chain_or_Tile_Quote_ID;
	private String Primary_Chain_or_Tile_Quote_ID__Change_Flag;
	private String Primary_Chain_or_Tile_Quote_ID__Previous;
	private String Primary_Execution_Venue;
	private String Primary_Execution_Venue__Change_Flag;
	private String Primary_Execution_Venue__Previous;
	private String Primary_Listed_RIC;
	private String Primary_Listed_RIC__Change_Flag;
	private String Primary_Listed_RIC__Previous;
	private String Primary_Market_Quote_ID;
	private String Primary_Market_Quote_ID__Change_Flag;
	private String Primary_Market_Quote_ID__Previous;
	private String Primary_Reference_Market_Quote;
	private String Primary_Reference_Market_Quote__Change_Flag;
	private String Primary_Reference_Market_Quote__Previous;
	private String Primary_Tradable_Market_Quote;
	private String Primary_Tradable_Market_Quote__Change_Flag;
	private String Primary_Tradable_Market_Quote__Previous;
	private String Put_Call_Indicator;
	private String Put_Call_Indicator__Change_Flag;
	private String Put_Call_Indicator__Previous;
	private String Quote_Perm_ID;
	private String Quote_Perm_ID__Change_Flag;
	private String Quote_Perm_ID__Previous;
	private String Quotron_Symbol;
	private String Quotron_Symbol__Change_Flag;
	private String Quotron_Symbol__Previous;
	private String RCS_Underlying_Product;
	private String RCS_Underlying_Product__Change_Flag;
	private String RCS_Underlying_Product__Previous;
	private String RIC__Change_Flag;
	private String RIC__Previous;
	private String RIC_Root;
	private String RIC_Root__Change_Flag;
	private String RIC_Root__Previous;
	private String Red_Chip_Flag;
	private String Red_Chip_Flag__Change_Flag;
	private String Red_Chip_Flag__Previous;
	private String Reference_Rate;
	private String Reference_Rate__Change_Flag;
	private String Reference_Rate__ESMA;
	private String Reference_Rate__ESMA__Change_Flag;
	private String Reference_Rate__ESMA__Previous;
	private String Reference_Rate__Previous;
	private String Regulation_SHO_Flag;
	private String Regulation_SHO_Flag__Change_Flag;
	private String Regulation_SHO_Flag__Previous;
	private String Related_News;
	private String Related_News__Change_Flag;
	private String Related_News__Previous;
	private String Request_for_Admission_to_Trading_by_Issuer;
	private String Request_for_Admission_to_Trading_by_Issuer__Change_Flag;
	private String Request_for_Admission_to_Trading_by_Issuer__ESMA;
	private String Request_for_Admission_to_Trading_by_Issuer__ESMA__Change_Flag;
	private String Request_for_Admission_to_Trading_by_Issuer__ESMA__Previous;
	private String Request_for_Admission_to_Trading_by_Issuer__Previous;
	private String Return_Payout_Trigger;
	private String Return_Payout_Trigger__Change_Flag;
	private String Return_Payout_Trigger__Previous;
	private String Reuters_Editorial_RIC;
	private String Reuters_Editorial_RIC__Change_Flag;
	private String Reuters_Editorial_RIC__Previous;
	private String Reverse_Level;
	private String Reverse_Level__Change_Flag;
	private String Reverse_Level__Previous;
	private String Rio_De_Janeiro_Code;
	private String Rio_De_Janeiro_Code__Change_Flag;
	private String Rio_De_Janeiro_Code__Previous;
	private String Risk_Alert;
	private String Risk_Alert__Change_Flag;
	private String Risk_Alert__Previous;
	private String Roll_Months;
	private String Roll_Months__Change_Flag;
	private String Roll_Months__Previous;
	private String Round_Lot_Size;
	private String Round_Lot_Size__Change_Flag;
	private String Round_Lot_Size__Previous;
	private String Route_or_Time_Charter_Average;
	private String Route_or_Time_Charter_Average__Change_Flag;
	private String Route_or_Time_Charter_Average__Previous;
	private String SEC_Section12;
	private String SEC_Section12__Change_Flag;
	private String SEC_Section12__Previous;
	private String SEDOL;
	private String SEDOL__Change_Flag;
	private String SEDOL__Previous;
	private String SICC_Sector_Code;
	private String SICC_Sector_Code__Change_Flag;
	private String SICC_Sector_Code__Previous;
	private String SICC_Securities_Code;
	private String SICC_Securities_Code__Change_Flag;
	private String SICC_Securities_Code__Previous;
	private String Sao_Paulo_Code;
	private String Sao_Paulo_Code__Change_Flag;
	private String Sao_Paulo_Code__Previous;
	private String Search_Display_Name;
	private String Search_Display_Name__Change_Flag;
	private String Search_Display_Name__Previous;
	private String Secondary_Asset_Underlying_Quote_ID;
	private String Secondary_Asset_Underlying_Quote_ID__Change_Flag;
	private String Secondary_Asset_Underlying_Quote_ID__Previous;
	private String Secondary_Currency_Code;
	private String Secondary_Currency_Code__Change_Flag;
	private String Secondary_Currency_Code__Previous;
	private String Secondary_Underlying_Asset;
	private String Secondary_Underlying_Asset__Change_Flag;
	private String Secondary_Underlying_Asset__Previous;
	private String Security_Description;
	private String Security_Description__Change_Flag;
	private String Security_Description__Previous;
	private String Security_Long_Description;
	private String Security_Long_Description__Change_Flag;
	private String Security_Long_Description__Previous;
	private String Series_Description;
	private String Series_Description__Change_Flag;
	private String Series_Description__Previous;
	private String Settlement_Period;
	private String Settlement_Period__Change_Flag;
	private String Settlement_Period__Previous;
	private String Settlement_Type;
	private String Settlement_Type__Change_Flag;
	private String Settlement_Type__Previous;
	private String Share_Class;
	private String Share_Class__Change_Flag;
	private String Share_Class__Previous;
	private String Short_Sell_Restriction_Type;
	private String Short_Sell_Restriction_Type__Change_Flag;
	private String Short_Sell_Restriction_Type__Previous;
	private String Singapore_Code;
	private String Singapore_Code__Change_Flag;
	private String Singapore_Code__Previous;
	private String Source_Name;
	private String Source_Name__Change_Flag;
	private String Source_Name__Previous;
	private String Source_Type;
	private String Source_Type__Change_Flag;
	private String Source_Type__Previous;
	private String Sovereign_Issuer_Flag;
	private String Sovereign_Issuer_Flag__Change_Flag;
	private String Sovereign_Issuer_Flag__ESMA;
	private String Sovereign_Issuer_Flag__ESMA__Change_Flag;
	private String Sovereign_Issuer_Flag__ESMA__Previous;
	private String Sovereign_Issuer_Flag__Previous;
	private String Stamp_Duty_Country_1;
	private String Stamp_Duty_Country_1__Change_Flag;
	private String Stamp_Duty_Country_1__Previous;
	private String Stamp_Duty_Country_2;
	private String Stamp_Duty_Country_2__Change_Flag;
	private String Stamp_Duty_Country_2__Previous;
	private String Stamp_Duty_Flag;
	private String Stamp_Duty_Flag__Change_Flag;
	private String Stamp_Duty_Flag__Previous;
	private String Start_date;
	private String Start_date__Change_Flag;
	private String Start_date__Previous;
	private String Strike_Price;
	private String Strike_Price__Change_Flag;
	private String Strike_Price__ESMA;
	private String Strike_Price__ESMA__Change_Flag;
	private String Strike_Price__ESMA__Previous;
	private String Strike_Price__Previous;
	private String Strike_Price_Currency__ESMA;
	private String Strike_Price_Currency__ESMA__Change_Flag;
	private String Strike_Price_Currency__ESMA__Previous;
	private String Strike_Price_Currency_Code;
	private String Strike_Price_Currency_Code__Change_Flag;
	private String Strike_Price_Currency_Code__Previous;
	private String Strike_Price_Multiplier;
	private String Strike_Price_Multiplier__Change_Flag;
	private String Strike_Price_Multiplier__Previous;
	private String Suspend_Flag;
	private String Suspend_Flag__Change_Flag;
	private String Suspend_Flag__Previous;
	private String Suspension_Category__ESMA;
	private String Suspension_Category__ESMA__Change_Flag;
	private String Suspension_Category__ESMA__Previous;
	private String Suspension_Ended_On__ESMA;
	private String Suspension_Ended_On__ESMA__Change_Flag;
	private String Suspension_Ended_On__ESMA__Previous;
	private String Suspension_On_Going__ESMA;
	private String Suspension_On_Going__ESMA__Change_Flag;
	private String Suspension_On_Going__ESMA__Previous;
	private String Suspension_Rationale__ESMA;
	private String Suspension_Rationale__ESMA__Change_Flag;
	private String Suspension_Rationale__ESMA__Previous;
	private String Suspension_Started_On__ESMA;
	private String Suspension_Started_On__ESMA__Change_Flag;
	private String Suspension_Started_On__ESMA__Previous;
	private String TRBC_Industry_Code;
	private String TRBC_Industry_Code__Change_Flag;
	private String TRBC_Industry_Code__Previous;
	private String Taiwan_Code;
	private String Taiwan_Code__Change_Flag;
	private String Taiwan_Code__Previous;
	private String Term_Maturity;
	private String Term_Maturity__Change_Flag;
	private String Term_Maturity__Previous;
	private String Term_Start;
	private String Term_Start__Change_Flag;
	private String Term_Start__Previous;
	private String Thomson_Reuters_Classification_Scheme;
	private String Thomson_Reuters_Classification_Scheme__Change_Flag;
	private String Thomson_Reuters_Classification_Scheme__Previous;
	private String Tick_Size;
	private String Tick_Size__Change_Flag;
	private String Tick_Size__Previous;
	private String Tick_Size_Currency;
	private String Tick_Size_Currency__Change_Flag;
	private String Tick_Size_Currency__Previous;
	private String Tick_Size_Pilot_Group;
	private String Tick_Size_Pilot_Group__Change_Flag;
	private String Tick_Size_Pilot_Group__Previous;
	private String Tick_Value;
	private String Tick_Value__Change_Flag;
	private String Tick_Value__Previous;
	private String Tick_Value_Currency;
	private String Tick_Value_Currency__Change_Flag;
	private String Tick_Value_Currency__Previous;
	private String Ticker;
	private String Ticker__Change_Flag;
	private String Ticker__Previous;
	private String ToTV__DSB;
	private String ToTV__DSB__Change_Flag;
	private String ToTV__DSB__Previous;
	private String ToTV_Effective_Date__DSB;
	private String ToTV_Effective_Date__DSB__Change_Flag;
	private String ToTV_Effective_Date__DSB__Previous;
	private String Total_Amount_Issued;
	private String Total_Amount_Issued__Change_Flag;
	private String Total_Amount_Issued__Previous;
	private String Total_EU_Turnover_12_Month__ESMA;
	private String Total_EU_Turnover_12_Month__ESMA__Change_Flag;
	private String Total_EU_Turnover_12_Month__ESMA__Previous;
	private String Total_EU_Volume_12_Month__ESMA;
	private String Total_EU_Volume_12_Month__ESMA__Change_Flag;
	private String Total_EU_Volume_12_Month__ESMA__Previous;
	private String Trading_Status;
	private String Trading_Status__Change_Flag;
	private String Trading_Status__Previous;
	private String Trading_Style;
	private String Trading_Style__Change_Flag;
	private String Trading_Style__Previous;
	private String Trading_Symbol;
	private String Trading_Symbol__Change_Flag;
	private String Trading_Symbol__Previous;
	private String UK_Stamp_Duty_Flag;
	private String UK_Stamp_Duty_Flag__Change_Flag;
	private String UK_Stamp_Duty_Flag__Previous;
	private String Underlying_Asset_Type;
	private String Underlying_Asset_Type__Change_Flag;
	private String Underlying_Asset_Type__Previous;
	private String Underlying_Contract;
	private String Underlying_Contract__Change_Flag;
	private String Underlying_Contract__Previous;
	private String Underlying_Contract_Exp_Date;
	private String Underlying_Contract_Exp_Date__Change_Flag;
	private String Underlying_Contract_Exp_Date__Previous;
	private String Underlying_Contract_Quote_ID;
	private String Underlying_Contract_Quote_ID__Change_Flag;
	private String Underlying_Contract_Quote_ID__Previous;
	private String Underlying_EEA_Venue_Eligible;
	private String Underlying_EEA_Venue_Eligible__Change_Flag;
	private String Underlying_EEA_Venue_Eligible__Previous;
	private String Underlying_ISIN;
	private String Underlying_ISIN__Change_Flag;
	private String Underlying_ISIN__ESMA;
	private String Underlying_ISIN__ESMA__Change_Flag;
	private String Underlying_ISIN__ESMA__Previous;
	private String Underlying_ISIN__Previous;
	private String Underlying_Index_ISIN;
	private String Underlying_Index_ISIN__Change_Flag;
	private String Underlying_Index_ISIN__Previous;
	private String Underlying_Issue_Perm_ID;
	private String Underlying_Issue_Perm_ID__Change_Flag;
	private String Underlying_Issue_Perm_ID__Previous;
	private String Underlying_Issuer_LEI__ESMA;
	private String Underlying_Issuer_LEI__ESMA__Change_Flag;
	private String Underlying_Issuer_LEI__ESMA__Previous;
	private String Underlying_Issuer_Organization_Perm_ID;
	private String Underlying_Issuer_Organization_Perm_ID__Change_Flag;
	private String Underlying_Issuer_Organization_Perm_ID__Previous;
	private String Underlying_Quote_ID;
	private String Underlying_Quote_ID__Change_Flag;
	private String Underlying_Quote_ID__Previous;
	private String Underlying_RIC;
	private String Underlying_RIC__Change_Flag;
	private String Underlying_RIC__Previous;
	private String Underlying_RIC_File_Signature;
	private String Underlying_RIC_File_Signature__Change_Flag;
	private String Underlying_RIC_File_Signature__Previous;
	private String Underlying_in_ESMA_FIRDS;
	private String Underlying_in_ESMA_FIRDS__Change_Flag;
	private String Underlying_in_ESMA_FIRDS__Previous;
	private String Unscaled_Strike_Price;
	private String Unscaled_Strike_Price__Change_Flag;
	private String Unscaled_Strike_Price__Previous;
	private String Update_Frequency;
	private String Update_Frequency__Change_Flag;
	private String Update_Frequency__Previous;
	private String Upper_Barrier;
	private String Upper_Barrier__Change_Flag;
	private String Upper_Barrier__Previous;
	private String Valoren;
	private String Valoren__Change_Flag;
	private String Valoren__Previous;
	private String Valuation_Method_or_Trigger;
	private String Valuation_Method_or_Trigger__Change_Flag;
	private String Valuation_Method_or_Trigger__Previous;
	private String Venue_Listing_Suspension_End_Date;
	private String Venue_Listing_Suspension_End_Date__Change_Flag;
	private String Venue_Listing_Suspension_End_Date__Previous;
	private String Venue_Suspended_From_Listing_Flag;
	private String Venue_Suspended_From_Listing_Flag__Change_Flag;
	private String Venue_Suspended_From_Listing_Flag__Previous;
	private String Warrant_Issue_Date;
	private String Warrant_Issue_Date__Change_Flag;
	private String Warrant_Issue_Date__Previous;
	private String Warrant_Underlying_RIC;
	private String Warrant_Underlying_RIC__Change_Flag;
	private String Warrant_Underlying_RIC__Previous;
	private String Warrent_Form;
	private String Warrent_Form__Change_Flag;
	private String Warrent_Form__Previous;
	private String Warrent_Underlying_Quote_ID;
	private String Warrent_Underlying_Quote_ID__Change_Flag;
	private String Warrent_Underlying_Quote_ID__Previous;
	private String Wertpapier;
	private String Wertpapier__Change_Flag;
	private String Wertpapier__Previous;
	private String When_Distributed_Flag;
	private String When_Distributed_Flag__Change_Flag;
	private String When_Distributed_Flag__Previous;
	private String When_Issued_Flag;
	private String When_Issued_Flag__Change_Flag;
	private String When_Issued_Flag__Previous;
	private String uTOTV__DSB;
	private String uTOTV__DSB__Change_Flag;
	private String uTOTV__DSB__Previous;
	private String uToTV_Effective_Date__DSB;
	private String uToTV_Effective_Date__DSB__Change_Flag;
	private String uToTV_Effective_Date__DSB__Previous;

	public String getRIC() {
		return RIC;
	}

	public void setRIC(String rIC) {
		RIC = rIC;
	}

	public String getQuote_ID() {
		return Quote_ID;
	}

	public void setQuote_ID(String quote_ID) {
		Quote_ID = quote_ID;
	}

	public String getAsset_ID() {
		return Asset_ID;
	}

	public void setAsset_ID(String asset_ID) {
		Asset_ID = asset_ID;
	}

	public String getAction() {
		return Action;
	}

	public void setAction(String action) {
		Action = action;
	}

	public String get_13F_Securities_Flag() {
		return _13F_Securities_Flag;
	}

	public void set_13F_Securities_Flag(String _13f_Securities_Flag) {
		_13F_Securities_Flag = _13f_Securities_Flag;
	}

	public String get_13F_Securities_Flag__Change_Flag() {
		return _13F_Securities_Flag__Change_Flag;
	}

	public void set_13F_Securities_Flag__Change_Flag(
			String _13f_Securities_Flag__Change_Flag) {
		_13F_Securities_Flag__Change_Flag = _13f_Securities_Flag__Change_Flag;
	}

	public String get_13F_Securities_Flag__Previous() {
		return _13F_Securities_Flag__Previous;
	}

	public void set_13F_Securities_Flag__Previous(
			String _13f_Securities_Flag__Previous) {
		_13F_Securities_Flag__Previous = _13f_Securities_Flag__Previous;
	}

	public String get_144A_Registered_Flag() {
		return _144A_Registered_Flag;
	}

	public void set_144A_Registered_Flag(String _144a_Registered_Flag) {
		_144A_Registered_Flag = _144a_Registered_Flag;
	}

	public String get_144A_Registered_Flag__Change_Flag() {
		return _144A_Registered_Flag__Change_Flag;
	}

	public void set_144A_Registered_Flag__Change_Flag(
			String _144a_Registered_Flag__Change_Flag) {
		_144A_Registered_Flag__Change_Flag = _144a_Registered_Flag__Change_Flag;
	}

	public String get_144A_Registered_Flag__Previous() {
		return _144A_Registered_Flag__Previous;
	}

	public void set_144A_Registered_Flag__Previous(
			String _144a_Registered_Flag__Previous) {
		_144A_Registered_Flag__Previous = _144a_Registered_Flag__Previous;
	}

	public String getAIFMD_Sub_Asset_Type_Code() {
		return AIFMD_Sub_Asset_Type_Code;
	}

	public void setAIFMD_Sub_Asset_Type_Code(String aIFMD_Sub_Asset_Type_Code) {
		AIFMD_Sub_Asset_Type_Code = aIFMD_Sub_Asset_Type_Code;
	}

	public String getAIFMD_Sub_Asset_Type_Code__Change_Flag() {
		return AIFMD_Sub_Asset_Type_Code__Change_Flag;
	}

	public void setAIFMD_Sub_Asset_Type_Code__Change_Flag(
			String aIFMD_Sub_Asset_Type_Code__Change_Flag) {
		AIFMD_Sub_Asset_Type_Code__Change_Flag = aIFMD_Sub_Asset_Type_Code__Change_Flag;
	}

	public String getAIFMD_Sub_Asset_Type_Code__Previous() {
		return AIFMD_Sub_Asset_Type_Code__Previous;
	}

	public void setAIFMD_Sub_Asset_Type_Code__Previous(
			String aIFMD_Sub_Asset_Type_Code__Previous) {
		AIFMD_Sub_Asset_Type_Code__Previous = aIFMD_Sub_Asset_Type_Code__Previous;
	}

	public String getAII_Code() {
		return AII_Code;
	}

	public void setAII_Code(String aII_Code) {
		AII_Code = aII_Code;
	}

	public String getAII_Code__Change_Flag() {
		return AII_Code__Change_Flag;
	}

	public void setAII_Code__Change_Flag(String aII_Code__Change_Flag) {
		AII_Code__Change_Flag = aII_Code__Change_Flag;
	}

	public String getAII_Code__Previous() {
		return AII_Code__Previous;
	}

	public void setAII_Code__Previous(String aII_Code__Previous) {
		AII_Code__Previous = aII_Code__Previous;
	}

	public String getActive_Instrument_Flag() {
		return Active_Instrument_Flag;
	}

	public void setActive_Instrument_Flag(String active_Instrument_Flag) {
		Active_Instrument_Flag = active_Instrument_Flag;
	}

	public String getActive_Instrument_Flag__Change_Flag() {
		return Active_Instrument_Flag__Change_Flag;
	}

	public void setActive_Instrument_Flag__Change_Flag(
			String active_Instrument_Flag__Change_Flag) {
		Active_Instrument_Flag__Change_Flag = active_Instrument_Flag__Change_Flag;
	}

	public String getActive_Instrument_Flag__Previous() {
		return Active_Instrument_Flag__Previous;
	}

	public void setActive_Instrument_Flag__Previous(
			String active_Instrument_Flag__Previous) {
		Active_Instrument_Flag__Previous = active_Instrument_Flag__Previous;
	}

	public String getActive_Quote_Flag() {
		return Active_Quote_Flag;
	}

	public void setActive_Quote_Flag(String active_Quote_Flag) {
		Active_Quote_Flag = active_Quote_Flag;
	}

	public String getActive_Quote_Flag__Change_Flag() {
		return Active_Quote_Flag__Change_Flag;
	}

	public void setActive_Quote_Flag__Change_Flag(
			String active_Quote_Flag__Change_Flag) {
		Active_Quote_Flag__Change_Flag = active_Quote_Flag__Change_Flag;
	}

	public String getActive_Quote_Flag__Previous() {
		return Active_Quote_Flag__Previous;
	}

	public void setActive_Quote_Flag__Previous(
			String active_Quote_Flag__Previous) {
		Active_Quote_Flag__Previous = active_Quote_Flag__Previous;
	}

	public String getAsset_Category() {
		return Asset_Category;
	}

	public void setAsset_Category(String asset_Category) {
		Asset_Category = asset_Category;
	}

	public String getAsset_Category__Change_Flag() {
		return Asset_Category__Change_Flag;
	}

	public void setAsset_Category__Change_Flag(
			String asset_Category__Change_Flag) {
		Asset_Category__Change_Flag = asset_Category__Change_Flag;
	}

	public String getAsset_Category__Previous() {
		return Asset_Category__Previous;
	}

	public void setAsset_Category__Previous(String asset_Category__Previous) {
		Asset_Category__Previous = asset_Category__Previous;
	}

	public String getAsset_ID__Change_Flag() {
		return Asset_ID__Change_Flag;
	}

	public void setAsset_ID__Change_Flag(String asset_ID__Change_Flag) {
		Asset_ID__Change_Flag = asset_ID__Change_Flag;
	}

	public String getAsset_ID__Previous() {
		return Asset_ID__Previous;
	}

	public void setAsset_ID__Previous(String asset_ID__Previous) {
		Asset_ID__Previous = asset_ID__Previous;
	}

	public String getAsset_Ratio_Against() {
		return Asset_Ratio_Against;
	}

	public void setAsset_Ratio_Against(String asset_Ratio_Against) {
		Asset_Ratio_Against = asset_Ratio_Against;
	}

	public String getAsset_Ratio_Against__Change_Flag() {
		return Asset_Ratio_Against__Change_Flag;
	}

	public void setAsset_Ratio_Against__Change_Flag(
			String asset_Ratio_Against__Change_Flag) {
		Asset_Ratio_Against__Change_Flag = asset_Ratio_Against__Change_Flag;
	}

	public String getAsset_Ratio_Against__Previous() {
		return Asset_Ratio_Against__Previous;
	}

	public void setAsset_Ratio_Against__Previous(
			String asset_Ratio_Against__Previous) {
		Asset_Ratio_Against__Previous = asset_Ratio_Against__Previous;
	}

	public String getAsset_Ratio_For() {
		return Asset_Ratio_For;
	}

	public void setAsset_Ratio_For(String asset_Ratio_For) {
		Asset_Ratio_For = asset_Ratio_For;
	}

	public String getAsset_Ratio_For__Change_Flag() {
		return Asset_Ratio_For__Change_Flag;
	}

	public void setAsset_Ratio_For__Change_Flag(
			String asset_Ratio_For__Change_Flag) {
		Asset_Ratio_For__Change_Flag = asset_Ratio_For__Change_Flag;
	}

	public String getAsset_Ratio_For__Previous() {
		return Asset_Ratio_For__Previous;
	}

	public void setAsset_Ratio_For__Previous(String asset_Ratio_For__Previous) {
		Asset_Ratio_For__Previous = asset_Ratio_For__Previous;
	}

	public String getAsset_Status() {
		return Asset_Status;
	}

	public void setAsset_Status(String asset_Status) {
		Asset_Status = asset_Status;
	}

	public String getAsset_Status__Change_Flag() {
		return Asset_Status__Change_Flag;
	}

	public void setAsset_Status__Change_Flag(String asset_Status__Change_Flag) {
		Asset_Status__Change_Flag = asset_Status__Change_Flag;
	}

	public String getAsset_Status__Previous() {
		return Asset_Status__Previous;
	}

	public void setAsset_Status__Previous(String asset_Status__Previous) {
		Asset_Status__Previous = asset_Status__Previous;
	}

	public String getAustralia_Code() {
		return Australia_Code;
	}

	public void setAustralia_Code(String australia_Code) {
		Australia_Code = australia_Code;
	}

	public String getAustralia_Code__Change_Flag() {
		return Australia_Code__Change_Flag;
	}

	public void setAustralia_Code__Change_Flag(
			String australia_Code__Change_Flag) {
		Australia_Code__Change_Flag = australia_Code__Change_Flag;
	}

	public String getAustralia_Code__Previous() {
		return Australia_Code__Previous;
	}

	public void setAustralia_Code__Previous(String australia_Code__Previous) {
		Australia_Code__Previous = australia_Code__Previous;
	}

	public String getAustria_Code() {
		return Austria_Code;
	}

	public void setAustria_Code(String austria_Code) {
		Austria_Code = austria_Code;
	}

	public String getAustria_Code__Change_Flag() {
		return Austria_Code__Change_Flag;
	}

	public void setAustria_Code__Change_Flag(String austria_Code__Change_Flag) {
		Austria_Code__Change_Flag = austria_Code__Change_Flag;
	}

	public String getAustria_Code__Previous() {
		return Austria_Code__Previous;
	}

	public void setAustria_Code__Previous(String austria_Code__Previous) {
		Austria_Code__Previous = austria_Code__Previous;
	}

	public String getBarrier_Touched_Date() {
		return Barrier_Touched_Date;
	}

	public void setBarrier_Touched_Date(String barrier_Touched_Date) {
		Barrier_Touched_Date = barrier_Touched_Date;
	}

	public String getBarrier_Touched_Date__Change_Flag() {
		return Barrier_Touched_Date__Change_Flag;
	}

	public void setBarrier_Touched_Date__Change_Flag(
			String barrier_Touched_Date__Change_Flag) {
		Barrier_Touched_Date__Change_Flag = barrier_Touched_Date__Change_Flag;
	}

	public String getBarrier_Touched_Date__Previous() {
		return Barrier_Touched_Date__Previous;
	}

	public void setBarrier_Touched_Date__Previous(
			String barrier_Touched_Date__Previous) {
		Barrier_Touched_Date__Previous = barrier_Touched_Date__Previous;
	}

	public String getBarrier_Touched_Indicator() {
		return Barrier_Touched_Indicator;
	}

	public void setBarrier_Touched_Indicator(String barrier_Touched_Indicator) {
		Barrier_Touched_Indicator = barrier_Touched_Indicator;
	}

	public String getBarrier_Touched_Indicator__Change_Flag() {
		return Barrier_Touched_Indicator__Change_Flag;
	}

	public void setBarrier_Touched_Indicator__Change_Flag(
			String barrier_Touched_Indicator__Change_Flag) {
		Barrier_Touched_Indicator__Change_Flag = barrier_Touched_Indicator__Change_Flag;
	}

	public String getBarrier_Touched_Indicator__Previous() {
		return Barrier_Touched_Indicator__Previous;
	}

	public void setBarrier_Touched_Indicator__Previous(
			String barrier_Touched_Indicator__Previous) {
		Barrier_Touched_Indicator__Previous = barrier_Touched_Indicator__Previous;
	}

	public String getBase_Currency_Code() {
		return Base_Currency_Code;
	}

	public void setBase_Currency_Code(String base_Currency_Code) {
		Base_Currency_Code = base_Currency_Code;
	}

	public String getBase_Currency_Code__Change_Flag() {
		return Base_Currency_Code__Change_Flag;
	}

	public void setBase_Currency_Code__Change_Flag(
			String base_Currency_Code__Change_Flag) {
		Base_Currency_Code__Change_Flag = base_Currency_Code__Change_Flag;
	}

	public String getBase_Currency_Code__Previous() {
		return Base_Currency_Code__Previous;
	}

	public void setBase_Currency_Code__Previous(
			String base_Currency_Code__Previous) {
		Base_Currency_Code__Previous = base_Currency_Code__Previous;
	}

	public String getBasket_Underlying_ISIN_List() {
		return Basket_Underlying_ISIN_List;
	}

	public void setBasket_Underlying_ISIN_List(
			String basket_Underlying_ISIN_List) {
		Basket_Underlying_ISIN_List = basket_Underlying_ISIN_List;
	}

	public String getBasket_Underlying_ISIN_List__Change_Flag() {
		return Basket_Underlying_ISIN_List__Change_Flag;
	}

	public void setBasket_Underlying_ISIN_List__Change_Flag(
			String basket_Underlying_ISIN_List__Change_Flag) {
		Basket_Underlying_ISIN_List__Change_Flag = basket_Underlying_ISIN_List__Change_Flag;
	}

	public String getBasket_Underlying_ISIN_List__Previous() {
		return Basket_Underlying_ISIN_List__Previous;
	}

	public void setBasket_Underlying_ISIN_List__Previous(
			String basket_Underlying_ISIN_List__Previous) {
		Basket_Underlying_ISIN_List__Previous = basket_Underlying_ISIN_List__Previous;
	}

	public String getBasket_Warrant_Indicator() {
		return Basket_Warrant_Indicator;
	}

	public void setBasket_Warrant_Indicator(String basket_Warrant_Indicator) {
		Basket_Warrant_Indicator = basket_Warrant_Indicator;
	}

	public String getBasket_Warrant_Indicator__Change_Flag() {
		return Basket_Warrant_Indicator__Change_Flag;
	}

	public void setBasket_Warrant_Indicator__Change_Flag(
			String basket_Warrant_Indicator__Change_Flag) {
		Basket_Warrant_Indicator__Change_Flag = basket_Warrant_Indicator__Change_Flag;
	}

	public String getBasket_Warrant_Indicator__Previous() {
		return Basket_Warrant_Indicator__Previous;
	}

	public void setBasket_Warrant_Indicator__Previous(
			String basket_Warrant_Indicator__Previous) {
		Basket_Warrant_Indicator__Previous = basket_Warrant_Indicator__Previous;
	}

	public String getBelgium_Code() {
		return Belgium_Code;
	}

	public void setBelgium_Code(String belgium_Code) {
		Belgium_Code = belgium_Code;
	}

	public String getBelgium_Code__Change_Flag() {
		return Belgium_Code__Change_Flag;
	}

	public void setBelgium_Code__Change_Flag(String belgium_Code__Change_Flag) {
		Belgium_Code__Change_Flag = belgium_Code__Change_Flag;
	}

	public String getBelgium_Code__Previous() {
		return Belgium_Code__Previous;
	}

	public void setBelgium_Code__Previous(String belgium_Code__Previous) {
		Belgium_Code__Previous = belgium_Code__Previous;
	}

	public String getBonus_Indicator() {
		return Bonus_Indicator;
	}

	public void setBonus_Indicator(String bonus_Indicator) {
		Bonus_Indicator = bonus_Indicator;
	}

	public String getBonus_Indicator__Change_Flag() {
		return Bonus_Indicator__Change_Flag;
	}

	public void setBonus_Indicator__Change_Flag(
			String bonus_Indicator__Change_Flag) {
		Bonus_Indicator__Change_Flag = bonus_Indicator__Change_Flag;
	}

	public String getBonus_Indicator__Previous() {
		return Bonus_Indicator__Previous;
	}

	public void setBonus_Indicator__Previous(String bonus_Indicator__Previous) {
		Bonus_Indicator__Previous = bonus_Indicator__Previous;
	}

	public String getBonus_Level() {
		return Bonus_Level;
	}

	public void setBonus_Level(String bonus_Level) {
		Bonus_Level = bonus_Level;
	}

	public String getBonus_Level__Change_Flag() {
		return Bonus_Level__Change_Flag;
	}

	public void setBonus_Level__Change_Flag(String bonus_Level__Change_Flag) {
		Bonus_Level__Change_Flag = bonus_Level__Change_Flag;
	}

	public String getBonus_Level__Previous() {
		return Bonus_Level__Previous;
	}

	public void setBonus_Level__Previous(String bonus_Level__Previous) {
		Bonus_Level__Previous = bonus_Level__Previous;
	}

	public String getCDS_Reference_Obligation_ISIN() {
		return CDS_Reference_Obligation_ISIN;
	}

	public void setCDS_Reference_Obligation_ISIN(
			String cDS_Reference_Obligation_ISIN) {
		CDS_Reference_Obligation_ISIN = cDS_Reference_Obligation_ISIN;
	}

	public String getCDS_Reference_Obligation_ISIN__Change_Flag() {
		return CDS_Reference_Obligation_ISIN__Change_Flag;
	}

	public void setCDS_Reference_Obligation_ISIN__Change_Flag(
			String cDS_Reference_Obligation_ISIN__Change_Flag) {
		CDS_Reference_Obligation_ISIN__Change_Flag = cDS_Reference_Obligation_ISIN__Change_Flag;
	}

	public String getCDS_Reference_Obligation_ISIN__Previous() {
		return CDS_Reference_Obligation_ISIN__Previous;
	}

	public void setCDS_Reference_Obligation_ISIN__Previous(
			String cDS_Reference_Obligation_ISIN__Previous) {
		CDS_Reference_Obligation_ISIN__Previous = cDS_Reference_Obligation_ISIN__Previous;
	}

	public String getCFI_Code() {
		return CFI_Code;
	}

	public void setCFI_Code(String cFI_Code) {
		CFI_Code = cFI_Code;
	}

	public String getCFI_Code__Change_Flag() {
		return CFI_Code__Change_Flag;
	}

	public void setCFI_Code__Change_Flag(String cFI_Code__Change_Flag) {
		CFI_Code__Change_Flag = cFI_Code__Change_Flag;
	}

	public String getCFI_Code__Previous() {
		return CFI_Code__Previous;
	}

	public void setCFI_Code__Previous(String cFI_Code__Previous) {
		CFI_Code__Previous = cFI_Code__Previous;
	}

	public String getCIN_Code() {
		return CIN_Code;
	}

	public void setCIN_Code(String cIN_Code) {
		CIN_Code = cIN_Code;
	}

	public String getCIN_Code__Change_Flag() {
		return CIN_Code__Change_Flag;
	}

	public void setCIN_Code__Change_Flag(String cIN_Code__Change_Flag) {
		CIN_Code__Change_Flag = cIN_Code__Change_Flag;
	}

	public String getCIN_Code__Previous() {
		return CIN_Code__Previous;
	}

	public void setCIN_Code__Previous(String cIN_Code__Previous) {
		CIN_Code__Previous = cIN_Code__Previous;
	}

	public String getCUSIP() {
		return CUSIP;
	}

	public void setCUSIP(String cUSIP) {
		CUSIP = cUSIP;
	}

	public String getCUSIP__Change_Flag() {
		return CUSIP__Change_Flag;
	}

	public void setCUSIP__Change_Flag(String cUSIP__Change_Flag) {
		CUSIP__Change_Flag = cUSIP__Change_Flag;
	}

	public String getCUSIP__Previous() {
		return CUSIP__Previous;
	}

	public void setCUSIP__Previous(String cUSIP__Previous) {
		CUSIP__Previous = cUSIP__Previous;
	}

	public String getCUSIP_Issue_Status() {
		return CUSIP_Issue_Status;
	}

	public void setCUSIP_Issue_Status(String cUSIP_Issue_Status) {
		CUSIP_Issue_Status = cUSIP_Issue_Status;
	}

	public String getCUSIP_Issue_Status__Change_Flag() {
		return CUSIP_Issue_Status__Change_Flag;
	}

	public void setCUSIP_Issue_Status__Change_Flag(
			String cUSIP_Issue_Status__Change_Flag) {
		CUSIP_Issue_Status__Change_Flag = cUSIP_Issue_Status__Change_Flag;
	}

	public String getCUSIP_Issue_Status__Previous() {
		return CUSIP_Issue_Status__Previous;
	}

	public void setCUSIP_Issue_Status__Previous(
			String cUSIP_Issue_Status__Previous) {
		CUSIP_Issue_Status__Previous = cUSIP_Issue_Status__Previous;
	}

	public String getCash_in_Lieu() {
		return Cash_in_Lieu;
	}

	public void setCash_in_Lieu(String cash_in_Lieu) {
		Cash_in_Lieu = cash_in_Lieu;
	}

	public String getCash_in_Lieu__Change_Flag() {
		return Cash_in_Lieu__Change_Flag;
	}

	public void setCash_in_Lieu__Change_Flag(String cash_in_Lieu__Change_Flag) {
		Cash_in_Lieu__Change_Flag = cash_in_Lieu__Change_Flag;
	}

	public String getCash_in_Lieu__Previous() {
		return Cash_in_Lieu__Previous;
	}

	public void setCash_in_Lieu__Previous(String cash_in_Lieu__Previous) {
		Cash_in_Lieu__Previous = cash_in_Lieu__Previous;
	}

	public String getChina_Connect_ELG() {
		return China_Connect_ELG;
	}

	public void setChina_Connect_ELG(String china_Connect_ELG) {
		China_Connect_ELG = china_Connect_ELG;
	}

	public String getChina_Connect_ELG__Change_Flag() {
		return China_Connect_ELG__Change_Flag;
	}

	public void setChina_Connect_ELG__Change_Flag(
			String china_Connect_ELG__Change_Flag) {
		China_Connect_ELG__Change_Flag = china_Connect_ELG__Change_Flag;
	}

	public String getChina_Connect_ELG__Previous() {
		return China_Connect_ELG__Previous;
	}

	public void setChina_Connect_ELG__Previous(
			String china_Connect_ELG__Previous) {
		China_Connect_ELG__Previous = china_Connect_ELG__Previous;
	}

	public String getCommon_Code() {
		return Common_Code;
	}

	public void setCommon_Code(String common_Code) {
		Common_Code = common_Code;
	}

	public String getCommon_Code__Change_Flag() {
		return Common_Code__Change_Flag;
	}

	public void setCommon_Code__Change_Flag(String common_Code__Change_Flag) {
		Common_Code__Change_Flag = common_Code__Change_Flag;
	}

	public String getCommon_Code__Previous() {
		return Common_Code__Previous;
	}

	public void setCommon_Code__Previous(String common_Code__Previous) {
		Common_Code__Previous = common_Code__Previous;
	}

	public String getCompany_Legal_Domicile() {
		return Company_Legal_Domicile;
	}

	public void setCompany_Legal_Domicile(String company_Legal_Domicile) {
		Company_Legal_Domicile = company_Legal_Domicile;
	}

	public String getCompany_Legal_Domicile__Change_Flag() {
		return Company_Legal_Domicile__Change_Flag;
	}

	public void setCompany_Legal_Domicile__Change_Flag(
			String company_Legal_Domicile__Change_Flag) {
		Company_Legal_Domicile__Change_Flag = company_Legal_Domicile__Change_Flag;
	}

	public String getCompany_Legal_Domicile__Previous() {
		return Company_Legal_Domicile__Previous;
	}

	public void setCompany_Legal_Domicile__Previous(
			String company_Legal_Domicile__Previous) {
		Company_Legal_Domicile__Previous = company_Legal_Domicile__Previous;
	}

	public String getCompany_Short_Name() {
		return Company_Short_Name;
	}

	public void setCompany_Short_Name(String company_Short_Name) {
		Company_Short_Name = company_Short_Name;
	}

	public String getCompany_Short_Name__Change_Flag() {
		return Company_Short_Name__Change_Flag;
	}

	public void setCompany_Short_Name__Change_Flag(
			String company_Short_Name__Change_Flag) {
		Company_Short_Name__Change_Flag = company_Short_Name__Change_Flag;
	}

	public String getCompany_Short_Name__Previous() {
		return Company_Short_Name__Previous;
	}

	public void setCompany_Short_Name__Previous(
			String company_Short_Name__Previous) {
		Company_Short_Name__Previous = company_Short_Name__Previous;
	}

	public String getConsolidated_Quote_ID() {
		return Consolidated_Quote_ID;
	}

	public void setConsolidated_Quote_ID(String consolidated_Quote_ID) {
		Consolidated_Quote_ID = consolidated_Quote_ID;
	}

	public String getConsolidated_Quote_ID__Change_Flag() {
		return Consolidated_Quote_ID__Change_Flag;
	}

	public void setConsolidated_Quote_ID__Change_Flag(
			String consolidated_Quote_ID__Change_Flag) {
		Consolidated_Quote_ID__Change_Flag = consolidated_Quote_ID__Change_Flag;
	}

	public String getConsolidated_Quote_ID__Previous() {
		return Consolidated_Quote_ID__Previous;
	}

	public void setConsolidated_Quote_ID__Previous(
			String consolidated_Quote_ID__Previous) {
		Consolidated_Quote_ID__Previous = consolidated_Quote_ID__Previous;
	}

	public String getConsolidated_RIC() {
		return Consolidated_RIC;
	}

	public void setConsolidated_RIC(String consolidated_RIC) {
		Consolidated_RIC = consolidated_RIC;
	}

	public String getConsolidated_RIC__Change_Flag() {
		return Consolidated_RIC__Change_Flag;
	}

	public void setConsolidated_RIC__Change_Flag(
			String consolidated_RIC__Change_Flag) {
		Consolidated_RIC__Change_Flag = consolidated_RIC__Change_Flag;
	}

	public String getConsolidated_RIC__Previous() {
		return Consolidated_RIC__Previous;
	}

	public void setConsolidated_RIC__Previous(String consolidated_RIC__Previous) {
		Consolidated_RIC__Previous = consolidated_RIC__Previous;
	}

	public String getContract_Month_and_Year() {
		return Contract_Month_and_Year;
	}

	public void setContract_Month_and_Year(String contract_Month_and_Year) {
		Contract_Month_and_Year = contract_Month_and_Year;
	}

	public String getContract_Month_and_Year__Change_Flag() {
		return Contract_Month_and_Year__Change_Flag;
	}

	public void setContract_Month_and_Year__Change_Flag(
			String contract_Month_and_Year__Change_Flag) {
		Contract_Month_and_Year__Change_Flag = contract_Month_and_Year__Change_Flag;
	}

	public String getContract_Month_and_Year__Previous() {
		return Contract_Month_and_Year__Previous;
	}

	public void setContract_Month_and_Year__Previous(
			String contract_Month_and_Year__Previous) {
		Contract_Month_and_Year__Previous = contract_Month_and_Year__Previous;
	}

	public String getContract_Type() {
		return Contract_Type;
	}

	public void setContract_Type(String contract_Type) {
		Contract_Type = contract_Type;
	}

	public String getContract_Type__Change_Flag() {
		return Contract_Type__Change_Flag;
	}

	public void setContract_Type__Change_Flag(String contract_Type__Change_Flag) {
		Contract_Type__Change_Flag = contract_Type__Change_Flag;
	}

	public String getContract_Type__Previous() {
		return Contract_Type__Previous;
	}

	public void setContract_Type__Previous(String contract_Type__Previous) {
		Contract_Type__Previous = contract_Type__Previous;
	}

	public String getContributor_Relationship_Name() {
		return Contributor_Relationship_Name;
	}

	public void setContributor_Relationship_Name(
			String contributor_Relationship_Name) {
		Contributor_Relationship_Name = contributor_Relationship_Name;
	}

	public String getContributor_Relationship_Name__Change_Flag() {
		return Contributor_Relationship_Name__Change_Flag;
	}

	public void setContributor_Relationship_Name__Change_Flag(
			String contributor_Relationship_Name__Change_Flag) {
		Contributor_Relationship_Name__Change_Flag = contributor_Relationship_Name__Change_Flag;
	}

	public String getContributor_Relationship_Name__Previous() {
		return Contributor_Relationship_Name__Previous;
	}

	public void setContributor_Relationship_Name__Previous(
			String contributor_Relationship_Name__Previous) {
		Contributor_Relationship_Name__Previous = contributor_Relationship_Name__Previous;
	}

	public String getCorporate_Action_Version_Number() {
		return Corporate_Action_Version_Number;
	}

	public void setCorporate_Action_Version_Number(
			String corporate_Action_Version_Number) {
		Corporate_Action_Version_Number = corporate_Action_Version_Number;
	}

	public String getCorporate_Action_Version_Number__Change_Flag() {
		return Corporate_Action_Version_Number__Change_Flag;
	}

	public void setCorporate_Action_Version_Number__Change_Flag(
			String corporate_Action_Version_Number__Change_Flag) {
		Corporate_Action_Version_Number__Change_Flag = corporate_Action_Version_Number__Change_Flag;
	}

	public String getCorporate_Action_Version_Number__Previous() {
		return Corporate_Action_Version_Number__Previous;
	}

	public void setCorporate_Action_Version_Number__Previous(
			String corporate_Action_Version_Number__Previous) {
		Corporate_Action_Version_Number__Previous = corporate_Action_Version_Number__Previous;
	}

	public String getCountry_Primary_Quote() {
		return Country_Primary_Quote;
	}

	public void setCountry_Primary_Quote(String country_Primary_Quote) {
		Country_Primary_Quote = country_Primary_Quote;
	}

	public String getCountry_Primary_Quote__Change_Flag() {
		return Country_Primary_Quote__Change_Flag;
	}

	public void setCountry_Primary_Quote__Change_Flag(
			String country_Primary_Quote__Change_Flag) {
		Country_Primary_Quote__Change_Flag = country_Primary_Quote__Change_Flag;
	}

	public String getCountry_Primary_Quote__Previous() {
		return Country_Primary_Quote__Previous;
	}

	public void setCountry_Primary_Quote__Previous(
			String country_Primary_Quote__Previous) {
		Country_Primary_Quote__Previous = country_Primary_Quote__Previous;
	}

	public String getCountry_of_Incorporation() {
		return Country_of_Incorporation;
	}

	public void setCountry_of_Incorporation(String country_of_Incorporation) {
		Country_of_Incorporation = country_of_Incorporation;
	}

	public String getCountry_of_Incorporation__Change_Flag() {
		return Country_of_Incorporation__Change_Flag;
	}

	public void setCountry_of_Incorporation__Change_Flag(
			String country_of_Incorporation__Change_Flag) {
		Country_of_Incorporation__Change_Flag = country_of_Incorporation__Change_Flag;
	}

	public String getCountry_of_Incorporation__Previous() {
		return Country_of_Incorporation__Previous;
	}

	public void setCountry_of_Incorporation__Previous(
			String country_of_Incorporation__Previous) {
		Country_of_Incorporation__Previous = country_of_Incorporation__Previous;
	}

	public String getCountry_of_Taxation_Code() {
		return Country_of_Taxation_Code;
	}

	public void setCountry_of_Taxation_Code(String country_of_Taxation_Code) {
		Country_of_Taxation_Code = country_of_Taxation_Code;
	}

	public String getCountry_of_Taxation_Code__Change_Flag() {
		return Country_of_Taxation_Code__Change_Flag;
	}

	public void setCountry_of_Taxation_Code__Change_Flag(
			String country_of_Taxation_Code__Change_Flag) {
		Country_of_Taxation_Code__Change_Flag = country_of_Taxation_Code__Change_Flag;
	}

	public String getCountry_of_Taxation_Code__Previous() {
		return Country_of_Taxation_Code__Previous;
	}

	public void setCountry_of_Taxation_Code__Previous(
			String country_of_Taxation_Code__Previous) {
		Country_of_Taxation_Code__Previous = country_of_Taxation_Code__Previous;
	}

	public String getCoupon_Rate() {
		return Coupon_Rate;
	}

	public void setCoupon_Rate(String coupon_Rate) {
		Coupon_Rate = coupon_Rate;
	}

	public String getCoupon_Rate__Change_Flag() {
		return Coupon_Rate__Change_Flag;
	}

	public void setCoupon_Rate__Change_Flag(String coupon_Rate__Change_Flag) {
		Coupon_Rate__Change_Flag = coupon_Rate__Change_Flag;
	}

	public String getCoupon_Rate__Previous() {
		return Coupon_Rate__Previous;
	}

	public void setCoupon_Rate__Previous(String coupon_Rate__Previous) {
		Coupon_Rate__Previous = coupon_Rate__Previous;
	}

	public String getCurrency_Code() {
		return Currency_Code;
	}

	public void setCurrency_Code(String currency_Code) {
		Currency_Code = currency_Code;
	}

	public String getCurrency_Code__Change_Flag() {
		return Currency_Code__Change_Flag;
	}

	public void setCurrency_Code__Change_Flag(String currency_Code__Change_Flag) {
		Currency_Code__Change_Flag = currency_Code__Change_Flag;
	}

	public String getCurrency_Code__Previous() {
		return Currency_Code__Previous;
	}

	public void setCurrency_Code__Previous(String currency_Code__Previous) {
		Currency_Code__Previous = currency_Code__Previous;
	}

	public String getCurrency_of_Nominal_Value__ESMA() {
		return Currency_of_Nominal_Value__ESMA;
	}

	public void setCurrency_of_Nominal_Value__ESMA(
			String currency_of_Nominal_Value__ESMA) {
		Currency_of_Nominal_Value__ESMA = currency_of_Nominal_Value__ESMA;
	}

	public String getCurrency_of_Nominal_Value__ESMA__Change_Flag() {
		return Currency_of_Nominal_Value__ESMA__Change_Flag;
	}

	public void setCurrency_of_Nominal_Value__ESMA__Change_Flag(
			String currency_of_Nominal_Value__ESMA__Change_Flag) {
		Currency_of_Nominal_Value__ESMA__Change_Flag = currency_of_Nominal_Value__ESMA__Change_Flag;
	}

	public String getCurrency_of_Nominal_Value__ESMA__Previous() {
		return Currency_of_Nominal_Value__ESMA__Previous;
	}

	public void setCurrency_of_Nominal_Value__ESMA__Previous(
			String currency_of_Nominal_Value__ESMA__Previous) {
		Currency_of_Nominal_Value__ESMA__Previous = currency_of_Nominal_Value__ESMA__Previous;
	}

	public String getCurrent_Amount_Outstanding() {
		return Current_Amount_Outstanding;
	}

	public void setCurrent_Amount_Outstanding(String current_Amount_Outstanding) {
		Current_Amount_Outstanding = current_Amount_Outstanding;
	}

	public String getCurrent_Amount_Outstanding__Change_Flag() {
		return Current_Amount_Outstanding__Change_Flag;
	}

	public void setCurrent_Amount_Outstanding__Change_Flag(
			String current_Amount_Outstanding__Change_Flag) {
		Current_Amount_Outstanding__Change_Flag = current_Amount_Outstanding__Change_Flag;
	}

	public String getCurrent_Amount_Outstanding__Previous() {
		return Current_Amount_Outstanding__Previous;
	}

	public void setCurrent_Amount_Outstanding__Previous(
			String current_Amount_Outstanding__Previous) {
		Current_Amount_Outstanding__Previous = current_Amount_Outstanding__Previous;
	}

	public String getDeal_Start_Date() {
		return Deal_Start_Date;
	}

	public void setDeal_Start_Date(String deal_Start_Date) {
		Deal_Start_Date = deal_Start_Date;
	}

	public String getDeal_Start_Date__Change_Flag() {
		return Deal_Start_Date__Change_Flag;
	}

	public void setDeal_Start_Date__Change_Flag(
			String deal_Start_Date__Change_Flag) {
		Deal_Start_Date__Change_Flag = deal_Start_Date__Change_Flag;
	}

	public String getDeal_Start_Date__Previous() {
		return Deal_Start_Date__Previous;
	}

	public void setDeal_Start_Date__Previous(String deal_Start_Date__Previous) {
		Deal_Start_Date__Previous = deal_Start_Date__Previous;
	}

	public String getDelivery_or_Cash_Settlement_Location() {
		return Delivery_or_Cash_Settlement_Location;
	}

	public void setDelivery_or_Cash_Settlement_Location(
			String delivery_or_Cash_Settlement_Location) {
		Delivery_or_Cash_Settlement_Location = delivery_or_Cash_Settlement_Location;
	}

	public String getDelivery_or_Cash_Settlement_Location__Change_Flag() {
		return Delivery_or_Cash_Settlement_Location__Change_Flag;
	}

	public void setDelivery_or_Cash_Settlement_Location__Change_Flag(
			String delivery_or_Cash_Settlement_Location__Change_Flag) {
		Delivery_or_Cash_Settlement_Location__Change_Flag = delivery_or_Cash_Settlement_Location__Change_Flag;
	}

	public String getDelivery_or_Cash_Settlement_Location__Previous() {
		return Delivery_or_Cash_Settlement_Location__Previous;
	}

	public void setDelivery_or_Cash_Settlement_Location__Previous(
			String delivery_or_Cash_Settlement_Location__Previous) {
		Delivery_or_Cash_Settlement_Location__Previous = delivery_or_Cash_Settlement_Location__Previous;
	}

	public String getDepository_Asset_Underlying() {
		return Depository_Asset_Underlying;
	}

	public void setDepository_Asset_Underlying(
			String depository_Asset_Underlying) {
		Depository_Asset_Underlying = depository_Asset_Underlying;
	}

	public String getDepository_Asset_Underlying__Change_Flag() {
		return Depository_Asset_Underlying__Change_Flag;
	}

	public void setDepository_Asset_Underlying__Change_Flag(
			String depository_Asset_Underlying__Change_Flag) {
		Depository_Asset_Underlying__Change_Flag = depository_Asset_Underlying__Change_Flag;
	}

	public String getDepository_Asset_Underlying__Previous() {
		return Depository_Asset_Underlying__Previous;
	}

	public void setDepository_Asset_Underlying__Previous(
			String depository_Asset_Underlying__Previous) {
		Depository_Asset_Underlying__Previous = depository_Asset_Underlying__Previous;
	}

	public String getDepository_Asset_Underlying_Quote_ID() {
		return Depository_Asset_Underlying_Quote_ID;
	}

	public void setDepository_Asset_Underlying_Quote_ID(
			String depository_Asset_Underlying_Quote_ID) {
		Depository_Asset_Underlying_Quote_ID = depository_Asset_Underlying_Quote_ID;
	}

	public String getDepository_Asset_Underlying_Quote_ID__Change_Flag() {
		return Depository_Asset_Underlying_Quote_ID__Change_Flag;
	}

	public void setDepository_Asset_Underlying_Quote_ID__Change_Flag(
			String depository_Asset_Underlying_Quote_ID__Change_Flag) {
		Depository_Asset_Underlying_Quote_ID__Change_Flag = depository_Asset_Underlying_Quote_ID__Change_Flag;
	}

	public String getDepository_Asset_Underlying_Quote_ID__Previous() {
		return Depository_Asset_Underlying_Quote_ID__Previous;
	}

	public void setDepository_Asset_Underlying_Quote_ID__Previous(
			String depository_Asset_Underlying_Quote_ID__Previous) {
		Depository_Asset_Underlying_Quote_ID__Previous = depository_Asset_Underlying_Quote_ID__Previous;
	}

	public String getDisplay_Factor() {
		return Display_Factor;
	}

	public void setDisplay_Factor(String display_Factor) {
		Display_Factor = display_Factor;
	}

	public String getDisplay_Factor__Change_Flag() {
		return Display_Factor__Change_Flag;
	}

	public void setDisplay_Factor__Change_Flag(
			String display_Factor__Change_Flag) {
		Display_Factor__Change_Flag = display_Factor__Change_Flag;
	}

	public String getDisplay_Factor__Previous() {
		return Display_Factor__Previous;
	}

	public void setDisplay_Factor__Previous(String display_Factor__Previous) {
		Display_Factor__Previous = display_Factor__Previous;
	}

	public String getDow_Jones_Industrial_Code() {
		return Dow_Jones_Industrial_Code;
	}

	public void setDow_Jones_Industrial_Code(String dow_Jones_Industrial_Code) {
		Dow_Jones_Industrial_Code = dow_Jones_Industrial_Code;
	}

	public String getDow_Jones_Industrial_Code__Change_Flag() {
		return Dow_Jones_Industrial_Code__Change_Flag;
	}

	public void setDow_Jones_Industrial_Code__Change_Flag(
			String dow_Jones_Industrial_Code__Change_Flag) {
		Dow_Jones_Industrial_Code__Change_Flag = dow_Jones_Industrial_Code__Change_Flag;
	}

	public String getDow_Jones_Industrial_Code__Previous() {
		return Dow_Jones_Industrial_Code__Previous;
	}

	public void setDow_Jones_Industrial_Code__Previous(
			String dow_Jones_Industrial_Code__Previous) {
		Dow_Jones_Industrial_Code__Previous = dow_Jones_Industrial_Code__Previous;
	}

	public String getEEA_Venue_Eligible_Flag() {
		return EEA_Venue_Eligible_Flag;
	}

	public void setEEA_Venue_Eligible_Flag(String eEA_Venue_Eligible_Flag) {
		EEA_Venue_Eligible_Flag = eEA_Venue_Eligible_Flag;
	}

	public String getEEA_Venue_Eligible_Flag__Change_Flag() {
		return EEA_Venue_Eligible_Flag__Change_Flag;
	}

	public void setEEA_Venue_Eligible_Flag__Change_Flag(
			String eEA_Venue_Eligible_Flag__Change_Flag) {
		EEA_Venue_Eligible_Flag__Change_Flag = eEA_Venue_Eligible_Flag__Change_Flag;
	}

	public String getEEA_Venue_Eligible_Flag__Previous() {
		return EEA_Venue_Eligible_Flag__Previous;
	}

	public void setEEA_Venue_Eligible_Flag__Previous(
			String eEA_Venue_Eligible_Flag__Previous) {
		EEA_Venue_Eligible_Flag__Previous = eEA_Venue_Eligible_Flag__Previous;
	}

	public String getESMA_Instrument_Last_Update_Date() {
		return ESMA_Instrument_Last_Update_Date;
	}

	public void setESMA_Instrument_Last_Update_Date(
			String eSMA_Instrument_Last_Update_Date) {
		ESMA_Instrument_Last_Update_Date = eSMA_Instrument_Last_Update_Date;
	}

	public String getESMA_Instrument_Last_Update_Date__Change_Flag() {
		return ESMA_Instrument_Last_Update_Date__Change_Flag;
	}

	public void setESMA_Instrument_Last_Update_Date__Change_Flag(
			String eSMA_Instrument_Last_Update_Date__Change_Flag) {
		ESMA_Instrument_Last_Update_Date__Change_Flag = eSMA_Instrument_Last_Update_Date__Change_Flag;
	}

	public String getESMA_Instrument_Last_Update_Date__Previous() {
		return ESMA_Instrument_Last_Update_Date__Previous;
	}

	public void setESMA_Instrument_Last_Update_Date__Previous(
			String eSMA_Instrument_Last_Update_Date__Previous) {
		ESMA_Instrument_Last_Update_Date__Previous = eSMA_Instrument_Last_Update_Date__Previous;
	}

	public String getETF_Price_Type() {
		return ETF_Price_Type;
	}

	public void setETF_Price_Type(String eTF_Price_Type) {
		ETF_Price_Type = eTF_Price_Type;
	}

	public String getETF_Price_Type__Change_Flag() {
		return ETF_Price_Type__Change_Flag;
	}

	public void setETF_Price_Type__Change_Flag(
			String eTF_Price_Type__Change_Flag) {
		ETF_Price_Type__Change_Flag = eTF_Price_Type__Change_Flag;
	}

	public String getETF_Price_Type__Previous() {
		return ETF_Price_Type__Previous;
	}

	public void setETF_Price_Type__Previous(String eTF_Price_Type__Previous) {
		ETF_Price_Type__Previous = eTF_Price_Type__Previous;
	}

	public String getETF_Principal_Quote_ID() {
		return ETF_Principal_Quote_ID;
	}

	public void setETF_Principal_Quote_ID(String eTF_Principal_Quote_ID) {
		ETF_Principal_Quote_ID = eTF_Principal_Quote_ID;
	}

	public String getETF_Principal_Quote_ID__Change_Flag() {
		return ETF_Principal_Quote_ID__Change_Flag;
	}

	public void setETF_Principal_Quote_ID__Change_Flag(
			String eTF_Principal_Quote_ID__Change_Flag) {
		ETF_Principal_Quote_ID__Change_Flag = eTF_Principal_Quote_ID__Change_Flag;
	}

	public String getETF_Principal_Quote_ID__Previous() {
		return ETF_Principal_Quote_ID__Previous;
	}

	public void setETF_Principal_Quote_ID__Previous(
			String eTF_Principal_Quote_ID__Previous) {
		ETF_Principal_Quote_ID__Previous = eTF_Principal_Quote_ID__Previous;
	}

	public String getETF_Princpal_Ric() {
		return ETF_Princpal_Ric;
	}

	public void setETF_Princpal_Ric(String eTF_Princpal_Ric) {
		ETF_Princpal_Ric = eTF_Princpal_Ric;
	}

	public String getETF_Princpal_Ric__Change_Flag() {
		return ETF_Princpal_Ric__Change_Flag;
	}

	public void setETF_Princpal_Ric__Change_Flag(
			String eTF_Princpal_Ric__Change_Flag) {
		ETF_Princpal_Ric__Change_Flag = eTF_Princpal_Ric__Change_Flag;
	}

	public String getETF_Princpal_Ric__Previous() {
		return ETF_Princpal_Ric__Previous;
	}

	public void setETF_Princpal_Ric__Previous(String eTF_Princpal_Ric__Previous) {
		ETF_Princpal_Ric__Previous = eTF_Princpal_Ric__Previous;
	}

	public String getEU_Short_Sell_Eligible() {
		return EU_Short_Sell_Eligible;
	}

	public void setEU_Short_Sell_Eligible(String eU_Short_Sell_Eligible) {
		EU_Short_Sell_Eligible = eU_Short_Sell_Eligible;
	}

	public String getEU_Short_Sell_Eligible__Change_Flag() {
		return EU_Short_Sell_Eligible__Change_Flag;
	}

	public void setEU_Short_Sell_Eligible__Change_Flag(
			String eU_Short_Sell_Eligible__Change_Flag) {
		EU_Short_Sell_Eligible__Change_Flag = eU_Short_Sell_Eligible__Change_Flag;
	}

	public String getEU_Short_Sell_Eligible__Previous() {
		return EU_Short_Sell_Eligible__Previous;
	}

	public void setEU_Short_Sell_Eligible__Previous(
			String eU_Short_Sell_Eligible__Previous) {
		EU_Short_Sell_Eligible__Previous = eU_Short_Sell_Eligible__Previous;
	}

	public String getEntity_ID() {
		return Entity_ID;
	}

	public void setEntity_ID(String entity_ID) {
		Entity_ID = entity_ID;
	}

	public String getEntity_ID__Change_Flag() {
		return Entity_ID__Change_Flag;
	}

	public void setEntity_ID__Change_Flag(String entity_ID__Change_Flag) {
		Entity_ID__Change_Flag = entity_ID__Change_Flag;
	}

	public String getEntity_ID__Previous() {
		return Entity_ID__Previous;
	}

	public void setEntity_ID__Previous(String entity_ID__Previous) {
		Entity_ID__Previous = entity_ID__Previous;
	}

	public String getEuronext_Trading_Group() {
		return Euronext_Trading_Group;
	}

	public void setEuronext_Trading_Group(String euronext_Trading_Group) {
		Euronext_Trading_Group = euronext_Trading_Group;
	}

	public String getEuronext_Trading_Group__Change_Flag() {
		return Euronext_Trading_Group__Change_Flag;
	}

	public void setEuronext_Trading_Group__Change_Flag(
			String euronext_Trading_Group__Change_Flag) {
		Euronext_Trading_Group__Change_Flag = euronext_Trading_Group__Change_Flag;
	}

	public String getEuronext_Trading_Group__Previous() {
		return Euronext_Trading_Group__Previous;
	}

	public void setEuronext_Trading_Group__Previous(
			String euronext_Trading_Group__Previous) {
		Euronext_Trading_Group__Previous = euronext_Trading_Group__Previous;
	}

	public String getExchange_Code() {
		return Exchange_Code;
	}

	public void setExchange_Code(String exchange_Code) {
		Exchange_Code = exchange_Code;
	}

	public String getExchange_Code__Change_Flag() {
		return Exchange_Code__Change_Flag;
	}

	public void setExchange_Code__Change_Flag(String exchange_Code__Change_Flag) {
		Exchange_Code__Change_Flag = exchange_Code__Change_Flag;
	}

	public String getExchange_Code__Previous() {
		return Exchange_Code__Previous;
	}

	public void setExchange_Code__Previous(String exchange_Code__Previous) {
		Exchange_Code__Previous = exchange_Code__Previous;
	}

	public String getExchange_Market_Size() {
		return Exchange_Market_Size;
	}

	public void setExchange_Market_Size(String exchange_Market_Size) {
		Exchange_Market_Size = exchange_Market_Size;
	}

	public String getExchange_Market_Size__Change_Flag() {
		return Exchange_Market_Size__Change_Flag;
	}

	public void setExchange_Market_Size__Change_Flag(
			String exchange_Market_Size__Change_Flag) {
		Exchange_Market_Size__Change_Flag = exchange_Market_Size__Change_Flag;
	}

	public String getExchange_Market_Size__Previous() {
		return Exchange_Market_Size__Previous;
	}

	public void setExchange_Market_Size__Previous(
			String exchange_Market_Size__Previous) {
		Exchange_Market_Size__Previous = exchange_Market_Size__Previous;
	}

	public String getExercise_Style() {
		return Exercise_Style;
	}

	public void setExercise_Style(String exercise_Style) {
		Exercise_Style = exercise_Style;
	}

	public String getExercise_Style__Change_Flag() {
		return Exercise_Style__Change_Flag;
	}

	public void setExercise_Style__Change_Flag(
			String exercise_Style__Change_Flag) {
		Exercise_Style__Change_Flag = exercise_Style__Change_Flag;
	}

	public String getExercise_Style__Previous() {
		return Exercise_Style__Previous;
	}

	public void setExercise_Style__Previous(String exercise_Style__Previous) {
		Exercise_Style__Previous = exercise_Style__Previous;
	}

	public String getExotic_Parameter_Code() {
		return Exotic_Parameter_Code;
	}

	public void setExotic_Parameter_Code(String exotic_Parameter_Code) {
		Exotic_Parameter_Code = exotic_Parameter_Code;
	}

	public String getExotic_Parameter_Code__Change_Flag() {
		return Exotic_Parameter_Code__Change_Flag;
	}

	public void setExotic_Parameter_Code__Change_Flag(
			String exotic_Parameter_Code__Change_Flag) {
		Exotic_Parameter_Code__Change_Flag = exotic_Parameter_Code__Change_Flag;
	}

	public String getExotic_Parameter_Code__Previous() {
		return Exotic_Parameter_Code__Previous;
	}

	public void setExotic_Parameter_Code__Previous(
			String exotic_Parameter_Code__Previous) {
		Exotic_Parameter_Code__Previous = exotic_Parameter_Code__Previous;
	}

	public String getExotic_Value() {
		return Exotic_Value;
	}

	public void setExotic_Value(String exotic_Value) {
		Exotic_Value = exotic_Value;
	}

	public String getExotic_Value__Change_Flag() {
		return Exotic_Value__Change_Flag;
	}

	public void setExotic_Value__Change_Flag(String exotic_Value__Change_Flag) {
		Exotic_Value__Change_Flag = exotic_Value__Change_Flag;
	}

	public String getExotic_Value__Previous() {
		return Exotic_Value__Previous;
	}

	public void setExotic_Value__Previous(String exotic_Value__Previous) {
		Exotic_Value__Previous = exotic_Value__Previous;
	}

	public String getExpiration_Date() {
		return Expiration_Date;
	}

	public void setExpiration_Date(String expiration_Date) {
		Expiration_Date = expiration_Date;
	}

	public String getExpiration_Date__Change_Flag() {
		return Expiration_Date__Change_Flag;
	}

	public void setExpiration_Date__Change_Flag(
			String expiration_Date__Change_Flag) {
		Expiration_Date__Change_Flag = expiration_Date__Change_Flag;
	}

	public String getExpiration_Date__Previous() {
		return Expiration_Date__Previous;
	}

	public void setExpiration_Date__Previous(String expiration_Date__Previous) {
		Expiration_Date__Previous = expiration_Date__Previous;
	}

	public String getFTSE_Industrial_Code() {
		return FTSE_Industrial_Code;
	}

	public void setFTSE_Industrial_Code(String fTSE_Industrial_Code) {
		FTSE_Industrial_Code = fTSE_Industrial_Code;
	}

	public String getFTSE_Industrial_Code__Change_Flag() {
		return FTSE_Industrial_Code__Change_Flag;
	}

	public void setFTSE_Industrial_Code__Change_Flag(
			String fTSE_Industrial_Code__Change_Flag) {
		FTSE_Industrial_Code__Change_Flag = fTSE_Industrial_Code__Change_Flag;
	}

	public String getFTSE_Industrial_Code__Previous() {
		return FTSE_Industrial_Code__Previous;
	}

	public void setFTSE_Industrial_Code__Previous(
			String fTSE_Industrial_Code__Previous) {
		FTSE_Industrial_Code__Previous = fTSE_Industrial_Code__Previous;
	}

	public String getFX_Type__ESMA() {
		return FX_Type__ESMA;
	}

	public void setFX_Type__ESMA(String fX_Type__ESMA) {
		FX_Type__ESMA = fX_Type__ESMA;
	}

	public String getFX_Type__ESMA__Change_Flag() {
		return FX_Type__ESMA__Change_Flag;
	}

	public void setFX_Type__ESMA__Change_Flag(String fX_Type__ESMA__Change_Flag) {
		FX_Type__ESMA__Change_Flag = fX_Type__ESMA__Change_Flag;
	}

	public String getFX_Type__ESMA__Previous() {
		return FX_Type__ESMA__Previous;
	}

	public void setFX_Type__ESMA__Previous(String fX_Type__ESMA__Previous) {
		FX_Type__ESMA__Previous = fX_Type__ESMA__Previous;
	}

	public String getFile_Code() {
		return File_Code;
	}

	public void setFile_Code(String file_Code) {
		File_Code = file_Code;
	}

	public String getFile_Code__Change_Flag() {
		return File_Code__Change_Flag;
	}

	public void setFile_Code__Change_Flag(String file_Code__Change_Flag) {
		File_Code__Change_Flag = file_Code__Change_Flag;
	}

	public String getFile_Code__Previous() {
		return File_Code__Previous;
	}

	public void setFile_Code__Previous(String file_Code__Previous) {
		File_Code__Previous = file_Code__Previous;
	}

	public String getFinancial_Instrument_Short_Name() {
		return Financial_Instrument_Short_Name;
	}

	public void setFinancial_Instrument_Short_Name(
			String financial_Instrument_Short_Name) {
		Financial_Instrument_Short_Name = financial_Instrument_Short_Name;
	}

	public String getFinancial_Instrument_Short_Name__Change_Flag() {
		return Financial_Instrument_Short_Name__Change_Flag;
	}

	public void setFinancial_Instrument_Short_Name__Change_Flag(
			String financial_Instrument_Short_Name__Change_Flag) {
		Financial_Instrument_Short_Name__Change_Flag = financial_Instrument_Short_Name__Change_Flag;
	}

	public String getFinancial_Instrument_Short_Name__ESMA() {
		return Financial_Instrument_Short_Name__ESMA;
	}

	public void setFinancial_Instrument_Short_Name__ESMA(
			String financial_Instrument_Short_Name__ESMA) {
		Financial_Instrument_Short_Name__ESMA = financial_Instrument_Short_Name__ESMA;
	}

	public String getFinancial_Instrument_Short_Name__ESMA__Change_Flag() {
		return Financial_Instrument_Short_Name__ESMA__Change_Flag;
	}

	public void setFinancial_Instrument_Short_Name__ESMA__Change_Flag(
			String financial_Instrument_Short_Name__ESMA__Change_Flag) {
		Financial_Instrument_Short_Name__ESMA__Change_Flag = financial_Instrument_Short_Name__ESMA__Change_Flag;
	}

	public String getFinancial_Instrument_Short_Name__ESMA__Previous() {
		return Financial_Instrument_Short_Name__ESMA__Previous;
	}

	public void setFinancial_Instrument_Short_Name__ESMA__Previous(
			String financial_Instrument_Short_Name__ESMA__Previous) {
		Financial_Instrument_Short_Name__ESMA__Previous = financial_Instrument_Short_Name__ESMA__Previous;
	}

	public String getFinancial_Instrument_Short_Name__Previous() {
		return Financial_Instrument_Short_Name__Previous;
	}

	public void setFinancial_Instrument_Short_Name__Previous(
			String financial_Instrument_Short_Name__Previous) {
		Financial_Instrument_Short_Name__Previous = financial_Instrument_Short_Name__Previous;
	}

	public String getFinancial_Transaction_Tax_Applied() {
		return Financial_Transaction_Tax_Applied;
	}

	public void setFinancial_Transaction_Tax_Applied(
			String financial_Transaction_Tax_Applied) {
		Financial_Transaction_Tax_Applied = financial_Transaction_Tax_Applied;
	}

	public String getFinancial_Transaction_Tax_Applied__Change_Flag() {
		return Financial_Transaction_Tax_Applied__Change_Flag;
	}

	public void setFinancial_Transaction_Tax_Applied__Change_Flag(
			String financial_Transaction_Tax_Applied__Change_Flag) {
		Financial_Transaction_Tax_Applied__Change_Flag = financial_Transaction_Tax_Applied__Change_Flag;
	}

	public String getFinancial_Transaction_Tax_Applied__Previous() {
		return Financial_Transaction_Tax_Applied__Previous;
	}

	public void setFinancial_Transaction_Tax_Applied__Previous(
			String financial_Transaction_Tax_Applied__Previous) {
		Financial_Transaction_Tax_Applied__Previous = financial_Transaction_Tax_Applied__Previous;
	}

	public String getFinancial_Transaction_Tax_Rate() {
		return Financial_Transaction_Tax_Rate;
	}

	public void setFinancial_Transaction_Tax_Rate(
			String financial_Transaction_Tax_Rate) {
		Financial_Transaction_Tax_Rate = financial_Transaction_Tax_Rate;
	}

	public String getFinancial_Transaction_Tax_Rate__Change_Flag() {
		return Financial_Transaction_Tax_Rate__Change_Flag;
	}

	public void setFinancial_Transaction_Tax_Rate__Change_Flag(
			String financial_Transaction_Tax_Rate__Change_Flag) {
		Financial_Transaction_Tax_Rate__Change_Flag = financial_Transaction_Tax_Rate__Change_Flag;
	}

	public String getFinancial_Transaction_Tax_Rate__Previous() {
		return Financial_Transaction_Tax_Rate__Previous;
	}

	public void setFinancial_Transaction_Tax_Rate__Previous(
			String financial_Transaction_Tax_Rate__Previous) {
		Financial_Transaction_Tax_Rate__Previous = financial_Transaction_Tax_Rate__Previous;
	}

	public String getFinsbury_Company_Code() {
		return Finsbury_Company_Code;
	}

	public void setFinsbury_Company_Code(String finsbury_Company_Code) {
		Finsbury_Company_Code = finsbury_Company_Code;
	}

	public String getFinsbury_Company_Code__Change_Flag() {
		return Finsbury_Company_Code__Change_Flag;
	}

	public void setFinsbury_Company_Code__Change_Flag(
			String finsbury_Company_Code__Change_Flag) {
		Finsbury_Company_Code__Change_Flag = finsbury_Company_Code__Change_Flag;
	}

	public String getFinsbury_Company_Code__Previous() {
		return Finsbury_Company_Code__Previous;
	}

	public void setFinsbury_Company_Code__Previous(
			String finsbury_Company_Code__Previous) {
		Finsbury_Company_Code__Previous = finsbury_Company_Code__Previous;
	}

	public String getFirst_Notice_Day() {
		return First_Notice_Day;
	}

	public void setFirst_Notice_Day(String first_Notice_Day) {
		First_Notice_Day = first_Notice_Day;
	}

	public String getFirst_Notice_Day__Change_Flag() {
		return First_Notice_Day__Change_Flag;
	}

	public void setFirst_Notice_Day__Change_Flag(
			String first_Notice_Day__Change_Flag) {
		First_Notice_Day__Change_Flag = first_Notice_Day__Change_Flag;
	}

	public String getFirst_Notice_Day__Previous() {
		return First_Notice_Day__Previous;
	}

	public void setFirst_Notice_Day__Previous(String first_Notice_Day__Previous) {
		First_Notice_Day__Previous = first_Notice_Day__Previous;
	}

	public String getFirst_Trading_Date() {
		return First_Trading_Date;
	}

	public void setFirst_Trading_Date(String first_Trading_Date) {
		First_Trading_Date = first_Trading_Date;
	}

	public String getFirst_Trading_Date__Change_Flag() {
		return First_Trading_Date__Change_Flag;
	}

	public void setFirst_Trading_Date__Change_Flag(
			String first_Trading_Date__Change_Flag) {
		First_Trading_Date__Change_Flag = first_Trading_Date__Change_Flag;
	}

	public String getFirst_Trading_Date__Previous() {
		return First_Trading_Date__Previous;
	}

	public void setFirst_Trading_Date__Previous(
			String first_Trading_Date__Previous) {
		First_Trading_Date__Previous = first_Trading_Date__Previous;
	}

	public String getFixed_Rate__ESMA() {
		return Fixed_Rate__ESMA;
	}

	public void setFixed_Rate__ESMA(String fixed_Rate__ESMA) {
		Fixed_Rate__ESMA = fixed_Rate__ESMA;
	}

	public String getFixed_Rate__ESMA__Change_Flag() {
		return Fixed_Rate__ESMA__Change_Flag;
	}

	public void setFixed_Rate__ESMA__Change_Flag(
			String fixed_Rate__ESMA__Change_Flag) {
		Fixed_Rate__ESMA__Change_Flag = fixed_Rate__ESMA__Change_Flag;
	}

	public String getFixed_Rate__ESMA__Previous() {
		return Fixed_Rate__ESMA__Previous;
	}

	public void setFixed_Rate__ESMA__Previous(String fixed_Rate__ESMA__Previous) {
		Fixed_Rate__ESMA__Previous = fixed_Rate__ESMA__Previous;
	}

	public String getFixed_Rate_of_Leg_1() {
		return Fixed_Rate_of_Leg_1;
	}

	public void setFixed_Rate_of_Leg_1(String fixed_Rate_of_Leg_1) {
		Fixed_Rate_of_Leg_1 = fixed_Rate_of_Leg_1;
	}

	public String getFixed_Rate_of_Leg_1__Change_Flag() {
		return Fixed_Rate_of_Leg_1__Change_Flag;
	}

	public void setFixed_Rate_of_Leg_1__Change_Flag(
			String fixed_Rate_of_Leg_1__Change_Flag) {
		Fixed_Rate_of_Leg_1__Change_Flag = fixed_Rate_of_Leg_1__Change_Flag;
	}

	public String getFixed_Rate_of_Leg_1__ESMA() {
		return Fixed_Rate_of_Leg_1__ESMA;
	}

	public void setFixed_Rate_of_Leg_1__ESMA(String fixed_Rate_of_Leg_1__ESMA) {
		Fixed_Rate_of_Leg_1__ESMA = fixed_Rate_of_Leg_1__ESMA;
	}

	public String getFixed_Rate_of_Leg_1__ESMA__Change_Flag() {
		return Fixed_Rate_of_Leg_1__ESMA__Change_Flag;
	}

	public void setFixed_Rate_of_Leg_1__ESMA__Change_Flag(
			String fixed_Rate_of_Leg_1__ESMA__Change_Flag) {
		Fixed_Rate_of_Leg_1__ESMA__Change_Flag = fixed_Rate_of_Leg_1__ESMA__Change_Flag;
	}

	public String getFixed_Rate_of_Leg_1__ESMA__Previous() {
		return Fixed_Rate_of_Leg_1__ESMA__Previous;
	}

	public void setFixed_Rate_of_Leg_1__ESMA__Previous(
			String fixed_Rate_of_Leg_1__ESMA__Previous) {
		Fixed_Rate_of_Leg_1__ESMA__Previous = fixed_Rate_of_Leg_1__ESMA__Previous;
	}

	public String getFixed_Rate_of_Leg_1__Previous() {
		return Fixed_Rate_of_Leg_1__Previous;
	}

	public void setFixed_Rate_of_Leg_1__Previous(
			String fixed_Rate_of_Leg_1__Previous) {
		Fixed_Rate_of_Leg_1__Previous = fixed_Rate_of_Leg_1__Previous;
	}

	public String getFixed_Rate_of_Leg_2() {
		return Fixed_Rate_of_Leg_2;
	}

	public void setFixed_Rate_of_Leg_2(String fixed_Rate_of_Leg_2) {
		Fixed_Rate_of_Leg_2 = fixed_Rate_of_Leg_2;
	}

	public String getFixed_Rate_of_Leg_2__Change_Flag() {
		return Fixed_Rate_of_Leg_2__Change_Flag;
	}

	public void setFixed_Rate_of_Leg_2__Change_Flag(
			String fixed_Rate_of_Leg_2__Change_Flag) {
		Fixed_Rate_of_Leg_2__Change_Flag = fixed_Rate_of_Leg_2__Change_Flag;
	}

	public String getFixed_Rate_of_Leg_2__ESMA() {
		return Fixed_Rate_of_Leg_2__ESMA;
	}

	public void setFixed_Rate_of_Leg_2__ESMA(String fixed_Rate_of_Leg_2__ESMA) {
		Fixed_Rate_of_Leg_2__ESMA = fixed_Rate_of_Leg_2__ESMA;
	}

	public String getFixed_Rate_of_Leg_2__ESMA__Change_Flag() {
		return Fixed_Rate_of_Leg_2__ESMA__Change_Flag;
	}

	public void setFixed_Rate_of_Leg_2__ESMA__Change_Flag(
			String fixed_Rate_of_Leg_2__ESMA__Change_Flag) {
		Fixed_Rate_of_Leg_2__ESMA__Change_Flag = fixed_Rate_of_Leg_2__ESMA__Change_Flag;
	}

	public String getFixed_Rate_of_Leg_2__ESMA__Previous() {
		return Fixed_Rate_of_Leg_2__ESMA__Previous;
	}

	public void setFixed_Rate_of_Leg_2__ESMA__Previous(
			String fixed_Rate_of_Leg_2__ESMA__Previous) {
		Fixed_Rate_of_Leg_2__ESMA__Previous = fixed_Rate_of_Leg_2__ESMA__Previous;
	}

	public String getFixed_Rate_of_Leg_2__Previous() {
		return Fixed_Rate_of_Leg_2__Previous;
	}

	public void setFixed_Rate_of_Leg_2__Previous(
			String fixed_Rate_of_Leg_2__Previous) {
		Fixed_Rate_of_Leg_2__Previous = fixed_Rate_of_Leg_2__Previous;
	}

	public String getFloating_Rate_of_Leg_2() {
		return Floating_Rate_of_Leg_2;
	}

	public void setFloating_Rate_of_Leg_2(String floating_Rate_of_Leg_2) {
		Floating_Rate_of_Leg_2 = floating_Rate_of_Leg_2;
	}

	public String getFloating_Rate_of_Leg_2__Change_Flag() {
		return Floating_Rate_of_Leg_2__Change_Flag;
	}

	public void setFloating_Rate_of_Leg_2__Change_Flag(
			String floating_Rate_of_Leg_2__Change_Flag) {
		Floating_Rate_of_Leg_2__Change_Flag = floating_Rate_of_Leg_2__Change_Flag;
	}

	public String getFloating_Rate_of_Leg_2__ESMA() {
		return Floating_Rate_of_Leg_2__ESMA;
	}

	public void setFloating_Rate_of_Leg_2__ESMA(
			String floating_Rate_of_Leg_2__ESMA) {
		Floating_Rate_of_Leg_2__ESMA = floating_Rate_of_Leg_2__ESMA;
	}

	public String getFloating_Rate_of_Leg_2__ESMA__Change_Flag() {
		return Floating_Rate_of_Leg_2__ESMA__Change_Flag;
	}

	public void setFloating_Rate_of_Leg_2__ESMA__Change_Flag(
			String floating_Rate_of_Leg_2__ESMA__Change_Flag) {
		Floating_Rate_of_Leg_2__ESMA__Change_Flag = floating_Rate_of_Leg_2__ESMA__Change_Flag;
	}

	public String getFloating_Rate_of_Leg_2__ESMA__Previous() {
		return Floating_Rate_of_Leg_2__ESMA__Previous;
	}

	public void setFloating_Rate_of_Leg_2__ESMA__Previous(
			String floating_Rate_of_Leg_2__ESMA__Previous) {
		Floating_Rate_of_Leg_2__ESMA__Previous = floating_Rate_of_Leg_2__ESMA__Previous;
	}

	public String getFloating_Rate_of_Leg_2__Previous() {
		return Floating_Rate_of_Leg_2__Previous;
	}

	public void setFloating_Rate_of_Leg_2__Previous(
			String floating_Rate_of_Leg_2__Previous) {
		Floating_Rate_of_Leg_2__Previous = floating_Rate_of_Leg_2__Previous;
	}

	public String getForeign_Ownership_Percent_of_Limit() {
		return Foreign_Ownership_Percent_of_Limit;
	}

	public void setForeign_Ownership_Percent_of_Limit(
			String foreign_Ownership_Percent_of_Limit) {
		Foreign_Ownership_Percent_of_Limit = foreign_Ownership_Percent_of_Limit;
	}

	public String getForeign_Ownership_Percent_of_Limit__Change_Flag() {
		return Foreign_Ownership_Percent_of_Limit__Change_Flag;
	}

	public void setForeign_Ownership_Percent_of_Limit__Change_Flag(
			String foreign_Ownership_Percent_of_Limit__Change_Flag) {
		Foreign_Ownership_Percent_of_Limit__Change_Flag = foreign_Ownership_Percent_of_Limit__Change_Flag;
	}

	public String getForeign_Ownership_Percent_of_Limit__Previous() {
		return Foreign_Ownership_Percent_of_Limit__Previous;
	}

	public void setForeign_Ownership_Percent_of_Limit__Previous(
			String foreign_Ownership_Percent_of_Limit__Previous) {
		Foreign_Ownership_Percent_of_Limit__Previous = foreign_Ownership_Percent_of_Limit__Previous;
	}

	public String getForeign_Ownership_Percent_of_Total_Shares() {
		return Foreign_Ownership_Percent_of_Total_Shares;
	}

	public void setForeign_Ownership_Percent_of_Total_Shares(
			String foreign_Ownership_Percent_of_Total_Shares) {
		Foreign_Ownership_Percent_of_Total_Shares = foreign_Ownership_Percent_of_Total_Shares;
	}

	public String getForeign_Ownership_Percent_of_Total_Shares__Change_Flag() {
		return Foreign_Ownership_Percent_of_Total_Shares__Change_Flag;
	}

	public void setForeign_Ownership_Percent_of_Total_Shares__Change_Flag(
			String foreign_Ownership_Percent_of_Total_Shares__Change_Flag) {
		Foreign_Ownership_Percent_of_Total_Shares__Change_Flag = foreign_Ownership_Percent_of_Total_Shares__Change_Flag;
	}

	public String getForeign_Ownership_Percent_of_Total_Shares__Previous() {
		return Foreign_Ownership_Percent_of_Total_Shares__Previous;
	}

	public void setForeign_Ownership_Percent_of_Total_Shares__Previous(
			String foreign_Ownership_Percent_of_Total_Shares__Previous) {
		Foreign_Ownership_Percent_of_Total_Shares__Previous = foreign_Ownership_Percent_of_Total_Shares__Previous;
	}

	public String getForeign_Ownership_Shares_Allowed() {
		return Foreign_Ownership_Shares_Allowed;
	}

	public void setForeign_Ownership_Shares_Allowed(
			String foreign_Ownership_Shares_Allowed) {
		Foreign_Ownership_Shares_Allowed = foreign_Ownership_Shares_Allowed;
	}

	public String getForeign_Ownership_Shares_Allowed__Change_Flag() {
		return Foreign_Ownership_Shares_Allowed__Change_Flag;
	}

	public void setForeign_Ownership_Shares_Allowed__Change_Flag(
			String foreign_Ownership_Shares_Allowed__Change_Flag) {
		Foreign_Ownership_Shares_Allowed__Change_Flag = foreign_Ownership_Shares_Allowed__Change_Flag;
	}

	public String getForeign_Ownership_Shares_Allowed__Previous() {
		return Foreign_Ownership_Shares_Allowed__Previous;
	}

	public void setForeign_Ownership_Shares_Allowed__Previous(
			String foreign_Ownership_Shares_Allowed__Previous) {
		Foreign_Ownership_Shares_Allowed__Previous = foreign_Ownership_Shares_Allowed__Previous;
	}

	public String getForeign_Ownership_Shares_Held() {
		return Foreign_Ownership_Shares_Held;
	}

	public void setForeign_Ownership_Shares_Held(
			String foreign_Ownership_Shares_Held) {
		Foreign_Ownership_Shares_Held = foreign_Ownership_Shares_Held;
	}

	public String getForeign_Ownership_Shares_Held__Change_Flag() {
		return Foreign_Ownership_Shares_Held__Change_Flag;
	}

	public void setForeign_Ownership_Shares_Held__Change_Flag(
			String foreign_Ownership_Shares_Held__Change_Flag) {
		Foreign_Ownership_Shares_Held__Change_Flag = foreign_Ownership_Shares_Held__Change_Flag;
	}

	public String getForeign_Ownership_Shares_Held__Previous() {
		return Foreign_Ownership_Shares_Held__Previous;
	}

	public void setForeign_Ownership_Shares_Held__Previous(
			String foreign_Ownership_Shares_Held__Previous) {
		Foreign_Ownership_Shares_Held__Previous = foreign_Ownership_Shares_Held__Previous;
	}

	public String getForeign_Ownership_Shares_Remaining() {
		return Foreign_Ownership_Shares_Remaining;
	}

	public void setForeign_Ownership_Shares_Remaining(
			String foreign_Ownership_Shares_Remaining) {
		Foreign_Ownership_Shares_Remaining = foreign_Ownership_Shares_Remaining;
	}

	public String getForeign_Ownership_Shares_Remaining__Change_Flag() {
		return Foreign_Ownership_Shares_Remaining__Change_Flag;
	}

	public void setForeign_Ownership_Shares_Remaining__Change_Flag(
			String foreign_Ownership_Shares_Remaining__Change_Flag) {
		Foreign_Ownership_Shares_Remaining__Change_Flag = foreign_Ownership_Shares_Remaining__Change_Flag;
	}

	public String getForeign_Ownership_Shares_Remaining__Previous() {
		return Foreign_Ownership_Shares_Remaining__Previous;
	}

	public void setForeign_Ownership_Shares_Remaining__Previous(
			String foreign_Ownership_Shares_Remaining__Previous) {
		Foreign_Ownership_Shares_Remaining__Previous = foreign_Ownership_Shares_Remaining__Previous;
	}

	public String getFrance_Code() {
		return France_Code;
	}

	public void setFrance_Code(String france_Code) {
		France_Code = france_Code;
	}

	public String getFrance_Code__Change_Flag() {
		return France_Code__Change_Flag;
	}

	public void setFrance_Code__Change_Flag(String france_Code__Change_Flag) {
		France_Code__Change_Flag = france_Code__Change_Flag;
	}

	public String getFrance_Code__Previous() {
		return France_Code__Previous;
	}

	public void setFrance_Code__Previous(String france_Code__Previous) {
		France_Code__Previous = france_Code__Previous;
	}

	public String getFreight_Derivative_Size() {
		return Freight_Derivative_Size;
	}

	public void setFreight_Derivative_Size(String freight_Derivative_Size) {
		Freight_Derivative_Size = freight_Derivative_Size;
	}

	public String getFreight_Derivative_Size__Change_Flag() {
		return Freight_Derivative_Size__Change_Flag;
	}

	public void setFreight_Derivative_Size__Change_Flag(
			String freight_Derivative_Size__Change_Flag) {
		Freight_Derivative_Size__Change_Flag = freight_Derivative_Size__Change_Flag;
	}

	public String getFreight_Derivative_Size__Previous() {
		return Freight_Derivative_Size__Previous;
	}

	public void setFreight_Derivative_Size__Previous(
			String freight_Derivative_Size__Previous) {
		Freight_Derivative_Size__Previous = freight_Derivative_Size__Previous;
	}

	public String getFully_Funded_Flag() {
		return Fully_Funded_Flag;
	}

	public void setFully_Funded_Flag(String fully_Funded_Flag) {
		Fully_Funded_Flag = fully_Funded_Flag;
	}

	public String getFully_Funded_Flag__Change_Flag() {
		return Fully_Funded_Flag__Change_Flag;
	}

	public void setFully_Funded_Flag__Change_Flag(
			String fully_Funded_Flag__Change_Flag) {
		Fully_Funded_Flag__Change_Flag = fully_Funded_Flag__Change_Flag;
	}

	public String getFully_Funded_Flag__Previous() {
		return Fully_Funded_Flag__Previous;
	}

	public void setFully_Funded_Flag__Previous(
			String fully_Funded_Flag__Previous) {
		Fully_Funded_Flag__Previous = fully_Funded_Flag__Previous;
	}

	public String getGICS_Industry_Code() {
		return GICS_Industry_Code;
	}

	public void setGICS_Industry_Code(String gICS_Industry_Code) {
		GICS_Industry_Code = gICS_Industry_Code;
	}

	public String getGICS_Industry_Code__Change_Flag() {
		return GICS_Industry_Code__Change_Flag;
	}

	public void setGICS_Industry_Code__Change_Flag(
			String gICS_Industry_Code__Change_Flag) {
		GICS_Industry_Code__Change_Flag = gICS_Industry_Code__Change_Flag;
	}

	public String getGICS_Industry_Code__Previous() {
		return GICS_Industry_Code__Previous;
	}

	public void setGICS_Industry_Code__Previous(
			String gICS_Industry_Code__Previous) {
		GICS_Industry_Code__Previous = gICS_Industry_Code__Previous;
	}

	public String getICB_Code() {
		return ICB_Code;
	}

	public void setICB_Code(String iCB_Code) {
		ICB_Code = iCB_Code;
	}

	public String getICB_Code__Change_Flag() {
		return ICB_Code__Change_Flag;
	}

	public void setICB_Code__Change_Flag(String iCB_Code__Change_Flag) {
		ICB_Code__Change_Flag = iCB_Code__Change_Flag;
	}

	public String getICB_Code__Previous() {
		return ICB_Code__Previous;
	}

	public void setICB_Code__Previous(String iCB_Code__Previous) {
		ICB_Code__Previous = iCB_Code__Previous;
	}

	public String getILX_Code() {
		return ILX_Code;
	}

	public void setILX_Code(String iLX_Code) {
		ILX_Code = iLX_Code;
	}

	public String getILX_Code__Change_Flag() {
		return ILX_Code__Change_Flag;
	}

	public void setILX_Code__Change_Flag(String iLX_Code__Change_Flag) {
		ILX_Code__Change_Flag = iLX_Code__Change_Flag;
	}

	public String getILX_Code__Previous() {
		return ILX_Code__Previous;
	}

	public void setILX_Code__Previous(String iLX_Code__Previous) {
		ILX_Code__Previous = iLX_Code__Previous;
	}

	public String getINAV_Quote_ID() {
		return INAV_Quote_ID;
	}

	public void setINAV_Quote_ID(String iNAV_Quote_ID) {
		INAV_Quote_ID = iNAV_Quote_ID;
	}

	public String getINAV_Quote_ID__Change_Flag() {
		return INAV_Quote_ID__Change_Flag;
	}

	public void setINAV_Quote_ID__Change_Flag(String iNAV_Quote_ID__Change_Flag) {
		INAV_Quote_ID__Change_Flag = iNAV_Quote_ID__Change_Flag;
	}

	public String getINAV_Quote_ID__Previous() {
		return INAV_Quote_ID__Previous;
	}

	public void setINAV_Quote_ID__Previous(String iNAV_Quote_ID__Previous) {
		INAV_Quote_ID__Previous = iNAV_Quote_ID__Previous;
	}

	public String getINAV_RIC() {
		return INAV_RIC;
	}

	public void setINAV_RIC(String iNAV_RIC) {
		INAV_RIC = iNAV_RIC;
	}

	public String getINAV_RIC__Change_Flag() {
		return INAV_RIC__Change_Flag;
	}

	public void setINAV_RIC__Change_Flag(String iNAV_RIC__Change_Flag) {
		INAV_RIC__Change_Flag = iNAV_RIC__Change_Flag;
	}

	public String getINAV_RIC__Previous() {
		return INAV_RIC__Previous;
	}

	public void setINAV_RIC__Previous(String iNAV_RIC__Previous) {
		INAV_RIC__Previous = iNAV_RIC__Previous;
	}

	public String getIR_Term_of_Contract() {
		return IR_Term_of_Contract;
	}

	public void setIR_Term_of_Contract(String iR_Term_of_Contract) {
		IR_Term_of_Contract = iR_Term_of_Contract;
	}

	public String getIR_Term_of_Contract__Change_Flag() {
		return IR_Term_of_Contract__Change_Flag;
	}

	public void setIR_Term_of_Contract__Change_Flag(
			String iR_Term_of_Contract__Change_Flag) {
		IR_Term_of_Contract__Change_Flag = iR_Term_of_Contract__Change_Flag;
	}

	public String getIR_Term_of_Contract__ESMA() {
		return IR_Term_of_Contract__ESMA;
	}

	public void setIR_Term_of_Contract__ESMA(String iR_Term_of_Contract__ESMA) {
		IR_Term_of_Contract__ESMA = iR_Term_of_Contract__ESMA;
	}

	public String getIR_Term_of_Contract__ESMA__Change_Flag() {
		return IR_Term_of_Contract__ESMA__Change_Flag;
	}

	public void setIR_Term_of_Contract__ESMA__Change_Flag(
			String iR_Term_of_Contract__ESMA__Change_Flag) {
		IR_Term_of_Contract__ESMA__Change_Flag = iR_Term_of_Contract__ESMA__Change_Flag;
	}

	public String getIR_Term_of_Contract__ESMA__Previous() {
		return IR_Term_of_Contract__ESMA__Previous;
	}

	public void setIR_Term_of_Contract__ESMA__Previous(
			String iR_Term_of_Contract__ESMA__Previous) {
		IR_Term_of_Contract__ESMA__Previous = iR_Term_of_Contract__ESMA__Previous;
	}

	public String getIR_Term_of_Contract__Previous() {
		return IR_Term_of_Contract__Previous;
	}

	public void setIR_Term_of_Contract__Previous(
			String iR_Term_of_Contract__Previous) {
		IR_Term_of_Contract__Previous = iR_Term_of_Contract__Previous;
	}

	public String getIR_Term_of_Contract_of_Leg_2() {
		return IR_Term_of_Contract_of_Leg_2;
	}

	public void setIR_Term_of_Contract_of_Leg_2(
			String iR_Term_of_Contract_of_Leg_2) {
		IR_Term_of_Contract_of_Leg_2 = iR_Term_of_Contract_of_Leg_2;
	}

	public String getIR_Term_of_Contract_of_Leg_2__Change_Flag() {
		return IR_Term_of_Contract_of_Leg_2__Change_Flag;
	}

	public void setIR_Term_of_Contract_of_Leg_2__Change_Flag(
			String iR_Term_of_Contract_of_Leg_2__Change_Flag) {
		IR_Term_of_Contract_of_Leg_2__Change_Flag = iR_Term_of_Contract_of_Leg_2__Change_Flag;
	}

	public String getIR_Term_of_Contract_of_Leg_2__ESMA() {
		return IR_Term_of_Contract_of_Leg_2__ESMA;
	}

	public void setIR_Term_of_Contract_of_Leg_2__ESMA(
			String iR_Term_of_Contract_of_Leg_2__ESMA) {
		IR_Term_of_Contract_of_Leg_2__ESMA = iR_Term_of_Contract_of_Leg_2__ESMA;
	}

	public String getIR_Term_of_Contract_of_Leg_2__ESMA__Change_Flag() {
		return IR_Term_of_Contract_of_Leg_2__ESMA__Change_Flag;
	}

	public void setIR_Term_of_Contract_of_Leg_2__ESMA__Change_Flag(
			String iR_Term_of_Contract_of_Leg_2__ESMA__Change_Flag) {
		IR_Term_of_Contract_of_Leg_2__ESMA__Change_Flag = iR_Term_of_Contract_of_Leg_2__ESMA__Change_Flag;
	}

	public String getIR_Term_of_Contract_of_Leg_2__ESMA__Previous() {
		return IR_Term_of_Contract_of_Leg_2__ESMA__Previous;
	}

	public void setIR_Term_of_Contract_of_Leg_2__ESMA__Previous(
			String iR_Term_of_Contract_of_Leg_2__ESMA__Previous) {
		IR_Term_of_Contract_of_Leg_2__ESMA__Previous = iR_Term_of_Contract_of_Leg_2__ESMA__Previous;
	}

	public String getIR_Term_of_Contract_of_Leg_2__Previous() {
		return IR_Term_of_Contract_of_Leg_2__Previous;
	}

	public void setIR_Term_of_Contract_of_Leg_2__Previous(
			String iR_Term_of_Contract_of_Leg_2__Previous) {
		IR_Term_of_Contract_of_Leg_2__Previous = iR_Term_of_Contract_of_Leg_2__Previous;
	}

	public String getISIN() {
		return ISIN;
	}

	public void setISIN(String iSIN) {
		ISIN = iSIN;
	}

	public String getISIN__Change_Flag() {
		return ISIN__Change_Flag;
	}

	public void setISIN__Change_Flag(String iSIN__Change_Flag) {
		ISIN__Change_Flag = iSIN__Change_Flag;
	}

	public String getISIN__Previous() {
		return ISIN__Previous;
	}

	public void setISIN__Previous(String iSIN__Previous) {
		ISIN__Previous = iSIN__Previous;
	}

	public String getISIX_Code() {
		return ISIX_Code;
	}

	public void setISIX_Code(String iSIX_Code) {
		ISIX_Code = iSIX_Code;
	}

	public String getISIX_Code__Change_Flag() {
		return ISIX_Code__Change_Flag;
	}

	public void setISIX_Code__Change_Flag(String iSIX_Code__Change_Flag) {
		ISIX_Code__Change_Flag = iSIX_Code__Change_Flag;
	}

	public String getISIX_Code__Previous() {
		return ISIX_Code__Previous;
	}

	public void setISIX_Code__Previous(String iSIX_Code__Previous) {
		ISIX_Code__Previous = iSIX_Code__Previous;
	}

	public String getISO_CFI_Code() {
		return ISO_CFI_Code;
	}

	public void setISO_CFI_Code(String iSO_CFI_Code) {
		ISO_CFI_Code = iSO_CFI_Code;
	}

	public String getISO_CFI_Code__Change_Flag() {
		return ISO_CFI_Code__Change_Flag;
	}

	public void setISO_CFI_Code__Change_Flag(String iSO_CFI_Code__Change_Flag) {
		ISO_CFI_Code__Change_Flag = iSO_CFI_Code__Change_Flag;
	}

	public String getISO_CFI_Code__Previous() {
		return ISO_CFI_Code__Previous;
	}

	public void setISO_CFI_Code__Previous(String iSO_CFI_Code__Previous) {
		ISO_CFI_Code__Previous = iSO_CFI_Code__Previous;
	}

	public String getIn_ANNA_DSB_Flag() {
		return In_ANNA_DSB_Flag;
	}

	public void setIn_ANNA_DSB_Flag(String in_ANNA_DSB_Flag) {
		In_ANNA_DSB_Flag = in_ANNA_DSB_Flag;
	}

	public String getIn_ANNA_DSB_Flag__Change_Flag() {
		return In_ANNA_DSB_Flag__Change_Flag;
	}

	public void setIn_ANNA_DSB_Flag__Change_Flag(
			String in_ANNA_DSB_Flag__Change_Flag) {
		In_ANNA_DSB_Flag__Change_Flag = in_ANNA_DSB_Flag__Change_Flag;
	}

	public String getIn_ANNA_DSB_Flag__Previous() {
		return In_ANNA_DSB_Flag__Previous;
	}

	public void setIn_ANNA_DSB_Flag__Previous(String in_ANNA_DSB_Flag__Previous) {
		In_ANNA_DSB_Flag__Previous = in_ANNA_DSB_Flag__Previous;
	}

	public String getIn_ESMA_FIRDS() {
		return In_ESMA_FIRDS;
	}

	public void setIn_ESMA_FIRDS(String in_ESMA_FIRDS) {
		In_ESMA_FIRDS = in_ESMA_FIRDS;
	}

	public String getIn_ESMA_FIRDS__Change_Flag() {
		return In_ESMA_FIRDS__Change_Flag;
	}

	public void setIn_ESMA_FIRDS__Change_Flag(String in_ESMA_FIRDS__Change_Flag) {
		In_ESMA_FIRDS__Change_Flag = in_ESMA_FIRDS__Change_Flag;
	}

	public String getIn_ESMA_FIRDS__Previous() {
		return In_ESMA_FIRDS__Previous;
	}

	public void setIn_ESMA_FIRDS__Previous(String in_ESMA_FIRDS__Previous) {
		In_ESMA_FIRDS__Previous = in_ESMA_FIRDS__Previous;
	}

	public String getInflation_Index_ISIN() {
		return Inflation_Index_ISIN;
	}

	public void setInflation_Index_ISIN(String inflation_Index_ISIN) {
		Inflation_Index_ISIN = inflation_Index_ISIN;
	}

	public String getInflation_Index_ISIN__Change_Flag() {
		return Inflation_Index_ISIN__Change_Flag;
	}

	public void setInflation_Index_ISIN__Change_Flag(
			String inflation_Index_ISIN__Change_Flag) {
		Inflation_Index_ISIN__Change_Flag = inflation_Index_ISIN__Change_Flag;
	}

	public String getInflation_Index_ISIN__Previous() {
		return Inflation_Index_ISIN__Previous;
	}

	public void setInflation_Index_ISIN__Previous(
			String inflation_Index_ISIN__Previous) {
		Inflation_Index_ISIN__Previous = inflation_Index_ISIN__Previous;
	}

	public String getInstrument_Classification__ESMA() {
		return Instrument_Classification__ESMA;
	}

	public void setInstrument_Classification__ESMA(
			String instrument_Classification__ESMA) {
		Instrument_Classification__ESMA = instrument_Classification__ESMA;
	}

	public String getInstrument_Classification__ESMA__Change_Flag() {
		return Instrument_Classification__ESMA__Change_Flag;
	}

	public void setInstrument_Classification__ESMA__Change_Flag(
			String instrument_Classification__ESMA__Change_Flag) {
		Instrument_Classification__ESMA__Change_Flag = instrument_Classification__ESMA__Change_Flag;
	}

	public String getInstrument_Classification__ESMA__Previous() {
		return Instrument_Classification__ESMA__Previous;
	}

	public void setInstrument_Classification__ESMA__Previous(
			String instrument_Classification__ESMA__Previous) {
		Instrument_Classification__ESMA__Previous = instrument_Classification__ESMA__Previous;
	}

	public String getInstrument_Full_Name__ESMA() {
		return Instrument_Full_Name__ESMA;
	}

	public void setInstrument_Full_Name__ESMA(String instrument_Full_Name__ESMA) {
		Instrument_Full_Name__ESMA = instrument_Full_Name__ESMA;
	}

	public String getInstrument_Full_Name__ESMA__Change_Flag() {
		return Instrument_Full_Name__ESMA__Change_Flag;
	}

	public void setInstrument_Full_Name__ESMA__Change_Flag(
			String instrument_Full_Name__ESMA__Change_Flag) {
		Instrument_Full_Name__ESMA__Change_Flag = instrument_Full_Name__ESMA__Change_Flag;
	}

	public String getInstrument_Full_Name__ESMA__Previous() {
		return Instrument_Full_Name__ESMA__Previous;
	}

	public void setInstrument_Full_Name__ESMA__Previous(
			String instrument_Full_Name__ESMA__Previous) {
		Instrument_Full_Name__ESMA__Previous = instrument_Full_Name__ESMA__Previous;
	}

	public String getInverse_Rate_Marker() {
		return Inverse_Rate_Marker;
	}

	public void setInverse_Rate_Marker(String inverse_Rate_Marker) {
		Inverse_Rate_Marker = inverse_Rate_Marker;
	}

	public String getInverse_Rate_Marker__Change_Flag() {
		return Inverse_Rate_Marker__Change_Flag;
	}

	public void setInverse_Rate_Marker__Change_Flag(
			String inverse_Rate_Marker__Change_Flag) {
		Inverse_Rate_Marker__Change_Flag = inverse_Rate_Marker__Change_Flag;
	}

	public String getInverse_Rate_Marker__Previous() {
		return Inverse_Rate_Marker__Previous;
	}

	public void setInverse_Rate_Marker__Previous(
			String inverse_Rate_Marker__Previous) {
		Inverse_Rate_Marker__Previous = inverse_Rate_Marker__Previous;
	}

	public String getIreland_Stamp_Duty_Flag() {
		return Ireland_Stamp_Duty_Flag;
	}

	public void setIreland_Stamp_Duty_Flag(String ireland_Stamp_Duty_Flag) {
		Ireland_Stamp_Duty_Flag = ireland_Stamp_Duty_Flag;
	}

	public String getIreland_Stamp_Duty_Flag__Change_Flag() {
		return Ireland_Stamp_Duty_Flag__Change_Flag;
	}

	public void setIreland_Stamp_Duty_Flag__Change_Flag(
			String ireland_Stamp_Duty_Flag__Change_Flag) {
		Ireland_Stamp_Duty_Flag__Change_Flag = ireland_Stamp_Duty_Flag__Change_Flag;
	}

	public String getIreland_Stamp_Duty_Flag__Previous() {
		return Ireland_Stamp_Duty_Flag__Previous;
	}

	public void setIreland_Stamp_Duty_Flag__Previous(
			String ireland_Stamp_Duty_Flag__Previous) {
		Ireland_Stamp_Duty_Flag__Previous = ireland_Stamp_Duty_Flag__Previous;
	}

	public String getIs_Adjusted() {
		return Is_Adjusted;
	}

	public void setIs_Adjusted(String is_Adjusted) {
		Is_Adjusted = is_Adjusted;
	}

	public String getIs_Adjusted__Change_Flag() {
		return Is_Adjusted__Change_Flag;
	}

	public void setIs_Adjusted__Change_Flag(String is_Adjusted__Change_Flag) {
		Is_Adjusted__Change_Flag = is_Adjusted__Change_Flag;
	}

	public String getIs_Adjusted__Previous() {
		return Is_Adjusted__Previous;
	}

	public void setIs_Adjusted__Previous(String is_Adjusted__Previous) {
		Is_Adjusted__Previous = is_Adjusted__Previous;
	}

	public String getIssue_Date() {
		return Issue_Date;
	}

	public void setIssue_Date(String issue_Date) {
		Issue_Date = issue_Date;
	}

	public String getIssue_Date__Change_Flag() {
		return Issue_Date__Change_Flag;
	}

	public void setIssue_Date__Change_Flag(String issue_Date__Change_Flag) {
		Issue_Date__Change_Flag = issue_Date__Change_Flag;
	}

	public String getIssue_Date__Previous() {
		return Issue_Date__Previous;
	}

	public void setIssue_Date__Previous(String issue_Date__Previous) {
		Issue_Date__Previous = issue_Date__Previous;
	}

	public String getIssue_Perm_ID() {
		return Issue_Perm_ID;
	}

	public void setIssue_Perm_ID(String issue_Perm_ID) {
		Issue_Perm_ID = issue_Perm_ID;
	}

	public String getIssue_Perm_ID__Change_Flag() {
		return Issue_Perm_ID__Change_Flag;
	}

	public void setIssue_Perm_ID__Change_Flag(String issue_Perm_ID__Change_Flag) {
		Issue_Perm_ID__Change_Flag = issue_Perm_ID__Change_Flag;
	}

	public String getIssue_Perm_ID__Previous() {
		return Issue_Perm_ID__Previous;
	}

	public void setIssue_Perm_ID__Previous(String issue_Perm_ID__Previous) {
		Issue_Perm_ID__Previous = issue_Perm_ID__Previous;
	}

	public String getIssue_Price() {
		return Issue_Price;
	}

	public void setIssue_Price(String issue_Price) {
		Issue_Price = issue_Price;
	}

	public String getIssue_Price__Change_Flag() {
		return Issue_Price__Change_Flag;
	}

	public void setIssue_Price__Change_Flag(String issue_Price__Change_Flag) {
		Issue_Price__Change_Flag = issue_Price__Change_Flag;
	}

	public String getIssue_Price__Previous() {
		return Issue_Price__Previous;
	}

	public void setIssue_Price__Previous(String issue_Price__Previous) {
		Issue_Price__Previous = issue_Price__Previous;
	}

	public String getIssuer_LEI() {
		return Issuer_LEI;
	}

	public void setIssuer_LEI(String issuer_LEI) {
		Issuer_LEI = issuer_LEI;
	}

	public String getIssuer_LEI__Change_Flag() {
		return Issuer_LEI__Change_Flag;
	}

	public void setIssuer_LEI__Change_Flag(String issuer_LEI__Change_Flag) {
		Issuer_LEI__Change_Flag = issuer_LEI__Change_Flag;
	}

	public String getIssuer_LEI__Previous() {
		return Issuer_LEI__Previous;
	}

	public void setIssuer_LEI__Previous(String issuer_LEI__Previous) {
		Issuer_LEI__Previous = issuer_LEI__Previous;
	}

	public String getIssuer_Name() {
		return Issuer_Name;
	}

	public void setIssuer_Name(String issuer_Name) {
		Issuer_Name = issuer_Name;
	}

	public String getIssuer_Name__Change_Flag() {
		return Issuer_Name__Change_Flag;
	}

	public void setIssuer_Name__Change_Flag(String issuer_Name__Change_Flag) {
		Issuer_Name__Change_Flag = issuer_Name__Change_Flag;
	}

	public String getIssuer_Name__Previous() {
		return Issuer_Name__Previous;
	}

	public void setIssuer_Name__Previous(String issuer_Name__Previous) {
		Issuer_Name__Previous = issuer_Name__Previous;
	}

	public String getIssuer_OrgID() {
		return Issuer_OrgID;
	}

	public void setIssuer_OrgID(String issuer_OrgID) {
		Issuer_OrgID = issuer_OrgID;
	}

	public String getIssuer_OrgID__Change_Flag() {
		return Issuer_OrgID__Change_Flag;
	}

	public void setIssuer_OrgID__Change_Flag(String issuer_OrgID__Change_Flag) {
		Issuer_OrgID__Change_Flag = issuer_OrgID__Change_Flag;
	}

	public String getIssuer_OrgID__Previous() {
		return Issuer_OrgID__Previous;
	}

	public void setIssuer_OrgID__Previous(String issuer_OrgID__Previous) {
		Issuer_OrgID__Previous = issuer_OrgID__Previous;
	}

	public String getIssuer_or_Trading_Venue_LEI__ESMA() {
		return Issuer_or_Trading_Venue_LEI__ESMA;
	}

	public void setIssuer_or_Trading_Venue_LEI__ESMA(
			String issuer_or_Trading_Venue_LEI__ESMA) {
		Issuer_or_Trading_Venue_LEI__ESMA = issuer_or_Trading_Venue_LEI__ESMA;
	}

	public String getIssuer_or_Trading_Venue_LEI__ESMA__Change_Flag() {
		return Issuer_or_Trading_Venue_LEI__ESMA__Change_Flag;
	}

	public void setIssuer_or_Trading_Venue_LEI__ESMA__Change_Flag(
			String issuer_or_Trading_Venue_LEI__ESMA__Change_Flag) {
		Issuer_or_Trading_Venue_LEI__ESMA__Change_Flag = issuer_or_Trading_Venue_LEI__ESMA__Change_Flag;
	}

	public String getIssuer_or_Trading_Venue_LEI__ESMA__Previous() {
		return Issuer_or_Trading_Venue_LEI__ESMA__Previous;
	}

	public void setIssuer_or_Trading_Venue_LEI__ESMA__Previous(
			String issuer_or_Trading_Venue_LEI__ESMA__Previous) {
		Issuer_or_Trading_Venue_LEI__ESMA__Previous = issuer_or_Trading_Venue_LEI__ESMA__Previous;
	}

	public String getKazakhstan_Code() {
		return Kazakhstan_Code;
	}

	public void setKazakhstan_Code(String kazakhstan_Code) {
		Kazakhstan_Code = kazakhstan_Code;
	}

	public String getKazakhstan_Code__Change_Flag() {
		return Kazakhstan_Code__Change_Flag;
	}

	public void setKazakhstan_Code__Change_Flag(
			String kazakhstan_Code__Change_Flag) {
		Kazakhstan_Code__Change_Flag = kazakhstan_Code__Change_Flag;
	}

	public String getKazakhstan_Code__Previous() {
		return Kazakhstan_Code__Previous;
	}

	public void setKazakhstan_Code__Previous(String kazakhstan_Code__Previous) {
		Kazakhstan_Code__Previous = kazakhstan_Code__Previous;
	}

	public String getLast_Delivery_Date() {
		return Last_Delivery_Date;
	}

	public void setLast_Delivery_Date(String last_Delivery_Date) {
		Last_Delivery_Date = last_Delivery_Date;
	}

	public String getLast_Delivery_Date__Change_Flag() {
		return Last_Delivery_Date__Change_Flag;
	}

	public void setLast_Delivery_Date__Change_Flag(
			String last_Delivery_Date__Change_Flag) {
		Last_Delivery_Date__Change_Flag = last_Delivery_Date__Change_Flag;
	}

	public String getLast_Delivery_Date__Previous() {
		return Last_Delivery_Date__Previous;
	}

	public void setLast_Delivery_Date__Previous(
			String last_Delivery_Date__Previous) {
		Last_Delivery_Date__Previous = last_Delivery_Date__Previous;
	}

	public String getLast_Trading_Day() {
		return Last_Trading_Day;
	}

	public void setLast_Trading_Day(String last_Trading_Day) {
		Last_Trading_Day = last_Trading_Day;
	}

	public String getLast_Trading_Day__Change_Flag() {
		return Last_Trading_Day__Change_Flag;
	}

	public void setLast_Trading_Day__Change_Flag(
			String last_Trading_Day__Change_Flag) {
		Last_Trading_Day__Change_Flag = last_Trading_Day__Change_Flag;
	}

	public String getLast_Trading_Day__Previous() {
		return Last_Trading_Day__Previous;
	}

	public void setLast_Trading_Day__Previous(String last_Trading_Day__Previous) {
		Last_Trading_Day__Previous = last_Trading_Day__Previous;
	}

	public String getLevel() {
		return Level;
	}

	public void setLevel(String level) {
		Level = level;
	}

	public String getLimited_Terms_Flag() {
		return Limited_Terms_Flag;
	}

	public void setLimited_Terms_Flag(String limited_Terms_Flag) {
		Limited_Terms_Flag = limited_Terms_Flag;
	}

	public String getLimited_Terms_Flag__Change_Flag() {
		return Limited_Terms_Flag__Change_Flag;
	}

	public void setLimited_Terms_Flag__Change_Flag(
			String limited_Terms_Flag__Change_Flag) {
		Limited_Terms_Flag__Change_Flag = limited_Terms_Flag__Change_Flag;
	}

	public String getLimited_Terms_Flag__Previous() {
		return Limited_Terms_Flag__Previous;
	}

	public void setLimited_Terms_Flag__Previous(
			String limited_Terms_Flag__Previous) {
		Limited_Terms_Flag__Previous = limited_Terms_Flag__Previous;
	}

	public String getLipper_ID() {
		return Lipper_ID;
	}

	public void setLipper_ID(String lipper_ID) {
		Lipper_ID = lipper_ID;
	}

	public String getLipper_ID__Change_Flag() {
		return Lipper_ID__Change_Flag;
	}

	public void setLipper_ID__Change_Flag(String lipper_ID__Change_Flag) {
		Lipper_ID__Change_Flag = lipper_ID__Change_Flag;
	}

	public String getLipper_ID__Previous() {
		return Lipper_ID__Previous;
	}

	public void setLipper_ID__Previous(String lipper_ID__Previous) {
		Lipper_ID__Previous = lipper_ID__Previous;
	}

	public String getListing_Status() {
		return Listing_Status;
	}

	public void setListing_Status(String listing_Status) {
		Listing_Status = listing_Status;
	}

	public String getListing_Status__Change_Flag() {
		return Listing_Status__Change_Flag;
	}

	public void setListing_Status__Change_Flag(
			String listing_Status__Change_Flag) {
		Listing_Status__Change_Flag = listing_Status__Change_Flag;
	}

	public String getListing_Status__Previous() {
		return Listing_Status__Previous;
	}

	public void setListing_Status__Previous(String listing_Status__Previous) {
		Listing_Status__Previous = listing_Status__Previous;
	}

	public String getListing_Suspension_Initiator__ESMA() {
		return Listing_Suspension_Initiator__ESMA;
	}

	public void setListing_Suspension_Initiator__ESMA(
			String listing_Suspension_Initiator__ESMA) {
		Listing_Suspension_Initiator__ESMA = listing_Suspension_Initiator__ESMA;
	}

	public String getListing_Suspension_Initiator__ESMA__Change_Flag() {
		return Listing_Suspension_Initiator__ESMA__Change_Flag;
	}

	public void setListing_Suspension_Initiator__ESMA__Change_Flag(
			String listing_Suspension_Initiator__ESMA__Change_Flag) {
		Listing_Suspension_Initiator__ESMA__Change_Flag = listing_Suspension_Initiator__ESMA__Change_Flag;
	}

	public String getListing_Suspension_Initiator__ESMA__Previous() {
		return Listing_Suspension_Initiator__ESMA__Previous;
	}

	public void setListing_Suspension_Initiator__ESMA__Previous(
			String listing_Suspension_Initiator__ESMA__Previous) {
		Listing_Suspension_Initiator__ESMA__Previous = listing_Suspension_Initiator__ESMA__Previous;
	}

	public String getListing_Suspension_Notifying_NCA__ESMA() {
		return Listing_Suspension_Notifying_NCA__ESMA;
	}

	public void setListing_Suspension_Notifying_NCA__ESMA(
			String listing_Suspension_Notifying_NCA__ESMA) {
		Listing_Suspension_Notifying_NCA__ESMA = listing_Suspension_Notifying_NCA__ESMA;
	}

	public String getListing_Suspension_Notifying_NCA__ESMA__Change_Flag() {
		return Listing_Suspension_Notifying_NCA__ESMA__Change_Flag;
	}

	public void setListing_Suspension_Notifying_NCA__ESMA__Change_Flag(
			String listing_Suspension_Notifying_NCA__ESMA__Change_Flag) {
		Listing_Suspension_Notifying_NCA__ESMA__Change_Flag = listing_Suspension_Notifying_NCA__ESMA__Change_Flag;
	}

	public String getListing_Suspension_Notifying_NCA__ESMA__Previous() {
		return Listing_Suspension_Notifying_NCA__ESMA__Previous;
	}

	public void setListing_Suspension_Notifying_NCA__ESMA__Previous(
			String listing_Suspension_Notifying_NCA__ESMA__Previous) {
		Listing_Suspension_Notifying_NCA__ESMA__Previous = listing_Suspension_Notifying_NCA__ESMA__Previous;
	}

	public String getLot_Size() {
		return Lot_Size;
	}

	public void setLot_Size(String lot_Size) {
		Lot_Size = lot_Size;
	}

	public String getLot_Size__Change_Flag() {
		return Lot_Size__Change_Flag;
	}

	public void setLot_Size__Change_Flag(String lot_Size__Change_Flag) {
		Lot_Size__Change_Flag = lot_Size__Change_Flag;
	}

	public String getLot_Size__Previous() {
		return Lot_Size__Previous;
	}

	public void setLot_Size__Previous(String lot_Size__Previous) {
		Lot_Size__Previous = lot_Size__Previous;
	}

	public String getLot_Units() {
		return Lot_Units;
	}

	public void setLot_Units(String lot_Units) {
		Lot_Units = lot_Units;
	}

	public String getLot_Units__Change_Flag() {
		return Lot_Units__Change_Flag;
	}

	public void setLot_Units__Change_Flag(String lot_Units__Change_Flag) {
		Lot_Units__Change_Flag = lot_Units__Change_Flag;
	}

	public String getLot_Units__Previous() {
		return Lot_Units__Previous;
	}

	public void setLot_Units__Previous(String lot_Units__Previous) {
		Lot_Units__Previous = lot_Units__Previous;
	}

	public String getLower_Barrier() {
		return Lower_Barrier;
	}

	public void setLower_Barrier(String lower_Barrier) {
		Lower_Barrier = lower_Barrier;
	}

	public String getLower_Barrier__Change_Flag() {
		return Lower_Barrier__Change_Flag;
	}

	public void setLower_Barrier__Change_Flag(String lower_Barrier__Change_Flag) {
		Lower_Barrier__Change_Flag = lower_Barrier__Change_Flag;
	}

	public String getLower_Barrier__Previous() {
		return Lower_Barrier__Previous;
	}

	public void setLower_Barrier__Previous(String lower_Barrier__Previous) {
		Lower_Barrier__Previous = lower_Barrier__Previous;
	}

	public String getMIC() {
		return MIC;
	}

	public void setMIC(String mIC) {
		MIC = mIC;
	}

	public String getMIC__Change_Flag() {
		return MIC__Change_Flag;
	}

	public void setMIC__Change_Flag(String mIC__Change_Flag) {
		MIC__Change_Flag = mIC__Change_Flag;
	}

	public String getMIC__Previous() {
		return MIC__Previous;
	}

	public void setMIC__Previous(String mIC__Previous) {
		MIC__Previous = mIC__Previous;
	}

	public String getMIFID_Sub_Asset_Class() {
		return MIFID_Sub_Asset_Class;
	}

	public void setMIFID_Sub_Asset_Class(String mIFID_Sub_Asset_Class) {
		MIFID_Sub_Asset_Class = mIFID_Sub_Asset_Class;
	}

	public String getMIFID_Sub_Asset_Class__Change_Flag() {
		return MIFID_Sub_Asset_Class__Change_Flag;
	}

	public void setMIFID_Sub_Asset_Class__Change_Flag(
			String mIFID_Sub_Asset_Class__Change_Flag) {
		MIFID_Sub_Asset_Class__Change_Flag = mIFID_Sub_Asset_Class__Change_Flag;
	}

	public String getMIFID_Sub_Asset_Class__Previous() {
		return MIFID_Sub_Asset_Class__Previous;
	}

	public void setMIFID_Sub_Asset_Class__Previous(
			String mIFID_Sub_Asset_Class__Previous) {
		MIFID_Sub_Asset_Class__Previous = mIFID_Sub_Asset_Class__Previous;
	}

	public String getMIFIR_Identifier() {
		return MIFIR_Identifier;
	}

	public void setMIFIR_Identifier(String mIFIR_Identifier) {
		MIFIR_Identifier = mIFIR_Identifier;
	}

	public String getMIFIR_Identifier__Change_Flag() {
		return MIFIR_Identifier__Change_Flag;
	}

	public void setMIFIR_Identifier__Change_Flag(
			String mIFIR_Identifier__Change_Flag) {
		MIFIR_Identifier__Change_Flag = mIFIR_Identifier__Change_Flag;
	}

	public String getMIFIR_Identifier__Previous() {
		return MIFIR_Identifier__Previous;
	}

	public void setMIFIR_Identifier__Previous(String mIFIR_Identifier__Previous) {
		MIFIR_Identifier__Previous = mIFIR_Identifier__Previous;
	}

	public String getMalaysia_Code() {
		return Malaysia_Code;
	}

	public void setMalaysia_Code(String malaysia_Code) {
		Malaysia_Code = malaysia_Code;
	}

	public String getMalaysia_Code__Change_Flag() {
		return Malaysia_Code__Change_Flag;
	}

	public void setMalaysia_Code__Change_Flag(String malaysia_Code__Change_Flag) {
		Malaysia_Code__Change_Flag = malaysia_Code__Change_Flag;
	}

	public String getMalaysia_Code__Previous() {
		return Malaysia_Code__Previous;
	}

	public void setMalaysia_Code__Previous(String malaysia_Code__Previous) {
		Malaysia_Code__Previous = malaysia_Code__Previous;
	}

	public String getMarket_Attributable_Source_Perm_ID() {
		return Market_Attributable_Source_Perm_ID;
	}

	public void setMarket_Attributable_Source_Perm_ID(
			String market_Attributable_Source_Perm_ID) {
		Market_Attributable_Source_Perm_ID = market_Attributable_Source_Perm_ID;
	}

	public String getMarket_Attributable_Source_Perm_ID__Change_Flag() {
		return Market_Attributable_Source_Perm_ID__Change_Flag;
	}

	public void setMarket_Attributable_Source_Perm_ID__Change_Flag(
			String market_Attributable_Source_Perm_ID__Change_Flag) {
		Market_Attributable_Source_Perm_ID__Change_Flag = market_Attributable_Source_Perm_ID__Change_Flag;
	}

	public String getMarket_Attributable_Source_Perm_ID__Previous() {
		return Market_Attributable_Source_Perm_ID__Previous;
	}

	public void setMarket_Attributable_Source_Perm_ID__Previous(
			String market_Attributable_Source_Perm_ID__Previous) {
		Market_Attributable_Source_Perm_ID__Previous = market_Attributable_Source_Perm_ID__Previous;
	}

	public String getMarket_Level_CDHKG() {
		return Market_Level_CDHKG;
	}

	public void setMarket_Level_CDHKG(String market_Level_CDHKG) {
		Market_Level_CDHKG = market_Level_CDHKG;
	}

	public String getMarket_Level_CDHKG__Change_Flag() {
		return Market_Level_CDHKG__Change_Flag;
	}

	public void setMarket_Level_CDHKG__Change_Flag(
			String market_Level_CDHKG__Change_Flag) {
		Market_Level_CDHKG__Change_Flag = market_Level_CDHKG__Change_Flag;
	}

	public String getMarket_Level_CDHKG__Previous() {
		return Market_Level_CDHKG__Previous;
	}

	public void setMarket_Level_CDHKG__Previous(
			String market_Level_CDHKG__Previous) {
		Market_Level_CDHKG__Previous = market_Level_CDHKG__Previous;
	}

	public String getMarket_MIC() {
		return Market_MIC;
	}

	public void setMarket_MIC(String market_MIC) {
		Market_MIC = market_MIC;
	}

	public String getMarket_MIC__Change_Flag() {
		return Market_MIC__Change_Flag;
	}

	public void setMarket_MIC__Change_Flag(String market_MIC__Change_Flag) {
		Market_MIC__Change_Flag = market_MIC__Change_Flag;
	}

	public String getMarket_MIC__Previous() {
		return Market_MIC__Previous;
	}

	public void setMarket_MIC__Previous(String market_MIC__Previous) {
		Market_MIC__Previous = market_MIC__Previous;
	}

	public String getMarket_Segment_MIC() {
		return Market_Segment_MIC;
	}

	public void setMarket_Segment_MIC(String market_Segment_MIC) {
		Market_Segment_MIC = market_Segment_MIC;
	}

	public String getMarket_Segment_MIC__Change_Flag() {
		return Market_Segment_MIC__Change_Flag;
	}

	public void setMarket_Segment_MIC__Change_Flag(
			String market_Segment_MIC__Change_Flag) {
		Market_Segment_MIC__Change_Flag = market_Segment_MIC__Change_Flag;
	}

	public String getMarket_Segment_MIC__Previous() {
		return Market_Segment_MIC__Previous;
	}

	public void setMarket_Segment_MIC__Previous(
			String market_Segment_MIC__Previous) {
		Market_Segment_MIC__Previous = market_Segment_MIC__Previous;
	}

	public String getMarket_Segment_Name() {
		return Market_Segment_Name;
	}

	public void setMarket_Segment_Name(String market_Segment_Name) {
		Market_Segment_Name = market_Segment_Name;
	}

	public String getMarket_Segment_Name__Change_Flag() {
		return Market_Segment_Name__Change_Flag;
	}

	public void setMarket_Segment_Name__Change_Flag(
			String market_Segment_Name__Change_Flag) {
		Market_Segment_Name__Change_Flag = market_Segment_Name__Change_Flag;
	}

	public String getMarket_Segment_Name__Previous() {
		return Market_Segment_Name__Previous;
	}

	public void setMarket_Segment_Name__Previous(
			String market_Segment_Name__Previous) {
		Market_Segment_Name__Previous = market_Segment_Name__Previous;
	}

	public String getMaturity_Date() {
		return Maturity_Date;
	}

	public void setMaturity_Date(String maturity_Date) {
		Maturity_Date = maturity_Date;
	}

	public String getMaturity_Date__Change_Flag() {
		return Maturity_Date__Change_Flag;
	}

	public void setMaturity_Date__Change_Flag(String maturity_Date__Change_Flag) {
		Maturity_Date__Change_Flag = maturity_Date__Change_Flag;
	}

	public String getMaturity_Date__Previous() {
		return Maturity_Date__Previous;
	}

	public void setMaturity_Date__Previous(String maturity_Date__Previous) {
		Maturity_Date__Previous = maturity_Date__Previous;
	}

	public String getMethod_of_Delivery() {
		return Method_of_Delivery;
	}

	public void setMethod_of_Delivery(String method_of_Delivery) {
		Method_of_Delivery = method_of_Delivery;
	}

	public String getMethod_of_Delivery__Change_Flag() {
		return Method_of_Delivery__Change_Flag;
	}

	public void setMethod_of_Delivery__Change_Flag(
			String method_of_Delivery__Change_Flag) {
		Method_of_Delivery__Change_Flag = method_of_Delivery__Change_Flag;
	}

	public String getMethod_of_Delivery__Previous() {
		return Method_of_Delivery__Previous;
	}

	public void setMethod_of_Delivery__Previous(
			String method_of_Delivery__Previous) {
		Method_of_Delivery__Previous = method_of_Delivery__Previous;
	}

	public String getMiFID_Asset_Class() {
		return MiFID_Asset_Class;
	}

	public void setMiFID_Asset_Class(String miFID_Asset_Class) {
		MiFID_Asset_Class = miFID_Asset_Class;
	}

	public String getMiFID_Asset_Class__Change_Flag() {
		return MiFID_Asset_Class__Change_Flag;
	}

	public void setMiFID_Asset_Class__Change_Flag(
			String miFID_Asset_Class__Change_Flag) {
		MiFID_Asset_Class__Change_Flag = miFID_Asset_Class__Change_Flag;
	}

	public String getMiFID_Asset_Class__Previous() {
		return MiFID_Asset_Class__Previous;
	}

	public void setMiFID_Asset_Class__Previous(
			String miFID_Asset_Class__Previous) {
		MiFID_Asset_Class__Previous = miFID_Asset_Class__Previous;
	}

	public String getMiFID_Asset_Class_of_Underlying() {
		return MiFID_Asset_Class_of_Underlying;
	}

	public void setMiFID_Asset_Class_of_Underlying(
			String miFID_Asset_Class_of_Underlying) {
		MiFID_Asset_Class_of_Underlying = miFID_Asset_Class_of_Underlying;
	}

	public String getMiFID_Asset_Class_of_Underlying__Change_Flag() {
		return MiFID_Asset_Class_of_Underlying__Change_Flag;
	}

	public void setMiFID_Asset_Class_of_Underlying__Change_Flag(
			String miFID_Asset_Class_of_Underlying__Change_Flag) {
		MiFID_Asset_Class_of_Underlying__Change_Flag = miFID_Asset_Class_of_Underlying__Change_Flag;
	}

	public String getMiFID_Asset_Class_of_Underlying__Previous() {
		return MiFID_Asset_Class_of_Underlying__Previous;
	}

	public void setMiFID_Asset_Class_of_Underlying__Previous(
			String miFID_Asset_Class_of_Underlying__Previous) {
		MiFID_Asset_Class_of_Underlying__Previous = miFID_Asset_Class_of_Underlying__Previous;
	}

	public String getMiFID_Average_Daily_Notional_Amount_per_instrument__ESMA() {
		return MiFID_Average_Daily_Notional_Amount_per_instrument__ESMA;
	}

	public void setMiFID_Average_Daily_Notional_Amount_per_instrument__ESMA(
			String miFID_Average_Daily_Notional_Amount_per_instrument__ESMA) {
		MiFID_Average_Daily_Notional_Amount_per_instrument__ESMA = miFID_Average_Daily_Notional_Amount_per_instrument__ESMA;
	}

	public String getMiFID_Average_Daily_Notional_Amount_per_instrument__ESMA__Change_Flag() {
		return MiFID_Average_Daily_Notional_Amount_per_instrument__ESMA__Change_Flag;
	}

	public void setMiFID_Average_Daily_Notional_Amount_per_instrument__ESMA__Change_Flag(
			String miFID_Average_Daily_Notional_Amount_per_instrument__ESMA__Change_Flag) {
		MiFID_Average_Daily_Notional_Amount_per_instrument__ESMA__Change_Flag = miFID_Average_Daily_Notional_Amount_per_instrument__ESMA__Change_Flag;
	}

	public String getMiFID_Average_Daily_Notional_Amount_per_instrument__ESMA__Previous() {
		return MiFID_Average_Daily_Notional_Amount_per_instrument__ESMA__Previous;
	}

	public void setMiFID_Average_Daily_Notional_Amount_per_instrument__ESMA__Previous(
			String miFID_Average_Daily_Notional_Amount_per_instrument__ESMA__Previous) {
		MiFID_Average_Daily_Notional_Amount_per_instrument__ESMA__Previous = miFID_Average_Daily_Notional_Amount_per_instrument__ESMA__Previous;
	}

	public String getMiFID_Average_Daily_Turnover__ESMA() {
		return MiFID_Average_Daily_Turnover__ESMA;
	}

	public void setMiFID_Average_Daily_Turnover__ESMA(
			String miFID_Average_Daily_Turnover__ESMA) {
		MiFID_Average_Daily_Turnover__ESMA = miFID_Average_Daily_Turnover__ESMA;
	}

	public String getMiFID_Average_Daily_Turnover__ESMA__Change_Flag() {
		return MiFID_Average_Daily_Turnover__ESMA__Change_Flag;
	}

	public void setMiFID_Average_Daily_Turnover__ESMA__Change_Flag(
			String miFID_Average_Daily_Turnover__ESMA__Change_Flag) {
		MiFID_Average_Daily_Turnover__ESMA__Change_Flag = miFID_Average_Daily_Turnover__ESMA__Change_Flag;
	}

	public String getMiFID_Average_Daily_Turnover__ESMA__Previous() {
		return MiFID_Average_Daily_Turnover__ESMA__Previous;
	}

	public void setMiFID_Average_Daily_Turnover__ESMA__Previous(
			String miFID_Average_Daily_Turnover__ESMA__Previous) {
		MiFID_Average_Daily_Turnover__ESMA__Previous = miFID_Average_Daily_Turnover__ESMA__Previous;
	}

	public String getMiFID_Average_Daily_Turnover_Currency_Code() {
		return MiFID_Average_Daily_Turnover_Currency_Code;
	}

	public void setMiFID_Average_Daily_Turnover_Currency_Code(
			String miFID_Average_Daily_Turnover_Currency_Code) {
		MiFID_Average_Daily_Turnover_Currency_Code = miFID_Average_Daily_Turnover_Currency_Code;
	}

	public String getMiFID_Average_Daily_Turnover_Currency_Code__Change_Flag() {
		return MiFID_Average_Daily_Turnover_Currency_Code__Change_Flag;
	}

	public void setMiFID_Average_Daily_Turnover_Currency_Code__Change_Flag(
			String miFID_Average_Daily_Turnover_Currency_Code__Change_Flag) {
		MiFID_Average_Daily_Turnover_Currency_Code__Change_Flag = miFID_Average_Daily_Turnover_Currency_Code__Change_Flag;
	}

	public String getMiFID_Average_Daily_Turnover_Currency_Code__Previous() {
		return MiFID_Average_Daily_Turnover_Currency_Code__Previous;
	}

	public void setMiFID_Average_Daily_Turnover_Currency_Code__Previous(
			String miFID_Average_Daily_Turnover_Currency_Code__Previous) {
		MiFID_Average_Daily_Turnover_Currency_Code__Previous = miFID_Average_Daily_Turnover_Currency_Code__Previous;
	}

	public String getMiFID_Average_Daily_number_of_Trades_per_instrument__ESMA() {
		return MiFID_Average_Daily_number_of_Trades_per_instrument__ESMA;
	}

	public void setMiFID_Average_Daily_number_of_Trades_per_instrument__ESMA(
			String miFID_Average_Daily_number_of_Trades_per_instrument__ESMA) {
		MiFID_Average_Daily_number_of_Trades_per_instrument__ESMA = miFID_Average_Daily_number_of_Trades_per_instrument__ESMA;
	}

	public String getMiFID_Average_Daily_number_of_Trades_per_instrument__ESMA__Change_Flag() {
		return MiFID_Average_Daily_number_of_Trades_per_instrument__ESMA__Change_Flag;
	}

	public void setMiFID_Average_Daily_number_of_Trades_per_instrument__ESMA__Change_Flag(
			String miFID_Average_Daily_number_of_Trades_per_instrument__ESMA__Change_Flag) {
		MiFID_Average_Daily_number_of_Trades_per_instrument__ESMA__Change_Flag = miFID_Average_Daily_number_of_Trades_per_instrument__ESMA__Change_Flag;
	}

	public String getMiFID_Average_Daily_number_of_Trades_per_instrument__ESMA__Previous() {
		return MiFID_Average_Daily_number_of_Trades_per_instrument__ESMA__Previous;
	}

	public void setMiFID_Average_Daily_number_of_Trades_per_instrument__ESMA__Previous(
			String miFID_Average_Daily_number_of_Trades_per_instrument__ESMA__Previous) {
		MiFID_Average_Daily_number_of_Trades_per_instrument__ESMA__Previous = miFID_Average_Daily_number_of_Trades_per_instrument__ESMA__Previous;
	}

	public String getMiFID_Average_Value_Of_Transactions__ESMA() {
		return MiFID_Average_Value_Of_Transactions__ESMA;
	}

	public void setMiFID_Average_Value_Of_Transactions__ESMA(
			String miFID_Average_Value_Of_Transactions__ESMA) {
		MiFID_Average_Value_Of_Transactions__ESMA = miFID_Average_Value_Of_Transactions__ESMA;
	}

	public String getMiFID_Average_Value_Of_Transactions__ESMA__Change_Flag() {
		return MiFID_Average_Value_Of_Transactions__ESMA__Change_Flag;
	}

	public void setMiFID_Average_Value_Of_Transactions__ESMA__Change_Flag(
			String miFID_Average_Value_Of_Transactions__ESMA__Change_Flag) {
		MiFID_Average_Value_Of_Transactions__ESMA__Change_Flag = miFID_Average_Value_Of_Transactions__ESMA__Change_Flag;
	}

	public String getMiFID_Average_Value_Of_Transactions__ESMA__Previous() {
		return MiFID_Average_Value_Of_Transactions__ESMA__Previous;
	}

	public void setMiFID_Average_Value_Of_Transactions__ESMA__Previous(
			String miFID_Average_Value_Of_Transactions__ESMA__Previous) {
		MiFID_Average_Value_Of_Transactions__ESMA__Previous = miFID_Average_Value_Of_Transactions__ESMA__Previous;
	}

	public String getMiFID_Average_Value_Of_Transactions_Currency_Code() {
		return MiFID_Average_Value_Of_Transactions_Currency_Code;
	}

	public void setMiFID_Average_Value_Of_Transactions_Currency_Code(
			String miFID_Average_Value_Of_Transactions_Currency_Code) {
		MiFID_Average_Value_Of_Transactions_Currency_Code = miFID_Average_Value_Of_Transactions_Currency_Code;
	}

	public String getMiFID_Average_Value_Of_Transactions_Currency_Code__Change_Flag() {
		return MiFID_Average_Value_Of_Transactions_Currency_Code__Change_Flag;
	}

	public void setMiFID_Average_Value_Of_Transactions_Currency_Code__Change_Flag(
			String miFID_Average_Value_Of_Transactions_Currency_Code__Change_Flag) {
		MiFID_Average_Value_Of_Transactions_Currency_Code__Change_Flag = miFID_Average_Value_Of_Transactions_Currency_Code__Change_Flag;
	}

	public String getMiFID_Average_Value_Of_Transactions_Currency_Code__Previous() {
		return MiFID_Average_Value_Of_Transactions_Currency_Code__Previous;
	}

	public void setMiFID_Average_Value_Of_Transactions_Currency_Code__Previous(
			String miFID_Average_Value_Of_Transactions_Currency_Code__Previous) {
		MiFID_Average_Value_Of_Transactions_Currency_Code__Previous = miFID_Average_Value_Of_Transactions_Currency_Code__Previous;
	}

	public String getMiFID_Base_Point_Spread() {
		return MiFID_Base_Point_Spread;
	}

	public void setMiFID_Base_Point_Spread(String miFID_Base_Point_Spread) {
		MiFID_Base_Point_Spread = miFID_Base_Point_Spread;
	}

	public String getMiFID_Base_Point_Spread__Change_Flag() {
		return MiFID_Base_Point_Spread__Change_Flag;
	}

	public void setMiFID_Base_Point_Spread__Change_Flag(
			String miFID_Base_Point_Spread__Change_Flag) {
		MiFID_Base_Point_Spread__Change_Flag = miFID_Base_Point_Spread__Change_Flag;
	}

	public String getMiFID_Base_Point_Spread__ESMA() {
		return MiFID_Base_Point_Spread__ESMA;
	}

	public void setMiFID_Base_Point_Spread__ESMA(
			String miFID_Base_Point_Spread__ESMA) {
		MiFID_Base_Point_Spread__ESMA = miFID_Base_Point_Spread__ESMA;
	}

	public String getMiFID_Base_Point_Spread__ESMA__Change_Flag() {
		return MiFID_Base_Point_Spread__ESMA__Change_Flag;
	}

	public void setMiFID_Base_Point_Spread__ESMA__Change_Flag(
			String miFID_Base_Point_Spread__ESMA__Change_Flag) {
		MiFID_Base_Point_Spread__ESMA__Change_Flag = miFID_Base_Point_Spread__ESMA__Change_Flag;
	}

	public String getMiFID_Base_Point_Spread__ESMA__Previous() {
		return MiFID_Base_Point_Spread__ESMA__Previous;
	}

	public void setMiFID_Base_Point_Spread__ESMA__Previous(
			String miFID_Base_Point_Spread__ESMA__Previous) {
		MiFID_Base_Point_Spread__ESMA__Previous = miFID_Base_Point_Spread__ESMA__Previous;
	}

	public String getMiFID_Base_Point_Spread__Previous() {
		return MiFID_Base_Point_Spread__Previous;
	}

	public void setMiFID_Base_Point_Spread__Previous(
			String miFID_Base_Point_Spread__Previous) {
		MiFID_Base_Point_Spread__Previous = miFID_Base_Point_Spread__Previous;
	}

	public String getMiFID_Base_Product() {
		return MiFID_Base_Product;
	}

	public void setMiFID_Base_Product(String miFID_Base_Product) {
		MiFID_Base_Product = miFID_Base_Product;
	}

	public String getMiFID_Base_Product__Change_Flag() {
		return MiFID_Base_Product__Change_Flag;
	}

	public void setMiFID_Base_Product__Change_Flag(
			String miFID_Base_Product__Change_Flag) {
		MiFID_Base_Product__Change_Flag = miFID_Base_Product__Change_Flag;
	}

	public String getMiFID_Base_Product__ESMA() {
		return MiFID_Base_Product__ESMA;
	}

	public void setMiFID_Base_Product__ESMA(String miFID_Base_Product__ESMA) {
		MiFID_Base_Product__ESMA = miFID_Base_Product__ESMA;
	}

	public String getMiFID_Base_Product__ESMA__Change_Flag() {
		return MiFID_Base_Product__ESMA__Change_Flag;
	}

	public void setMiFID_Base_Product__ESMA__Change_Flag(
			String miFID_Base_Product__ESMA__Change_Flag) {
		MiFID_Base_Product__ESMA__Change_Flag = miFID_Base_Product__ESMA__Change_Flag;
	}

	public String getMiFID_Base_Product__ESMA__Previous() {
		return MiFID_Base_Product__ESMA__Previous;
	}

	public void setMiFID_Base_Product__ESMA__Previous(
			String miFID_Base_Product__ESMA__Previous) {
		MiFID_Base_Product__ESMA__Previous = miFID_Base_Product__ESMA__Previous;
	}

	public String getMiFID_Base_Product__Previous() {
		return MiFID_Base_Product__Previous;
	}

	public void setMiFID_Base_Product__Previous(
			String miFID_Base_Product__Previous) {
		MiFID_Base_Product__Previous = miFID_Base_Product__Previous;
	}

	public String getMiFID_Bond_Seniority() {
		return MiFID_Bond_Seniority;
	}

	public void setMiFID_Bond_Seniority(String miFID_Bond_Seniority) {
		MiFID_Bond_Seniority = miFID_Bond_Seniority;
	}

	public String getMiFID_Bond_Seniority__Change_Flag() {
		return MiFID_Bond_Seniority__Change_Flag;
	}

	public void setMiFID_Bond_Seniority__Change_Flag(
			String miFID_Bond_Seniority__Change_Flag) {
		MiFID_Bond_Seniority__Change_Flag = miFID_Bond_Seniority__Change_Flag;
	}

	public String getMiFID_Bond_Seniority__ESMA() {
		return MiFID_Bond_Seniority__ESMA;
	}

	public void setMiFID_Bond_Seniority__ESMA(String miFID_Bond_Seniority__ESMA) {
		MiFID_Bond_Seniority__ESMA = miFID_Bond_Seniority__ESMA;
	}

	public String getMiFID_Bond_Seniority__ESMA__Change_Flag() {
		return MiFID_Bond_Seniority__ESMA__Change_Flag;
	}

	public void setMiFID_Bond_Seniority__ESMA__Change_Flag(
			String miFID_Bond_Seniority__ESMA__Change_Flag) {
		MiFID_Bond_Seniority__ESMA__Change_Flag = miFID_Bond_Seniority__ESMA__Change_Flag;
	}

	public String getMiFID_Bond_Seniority__ESMA__Previous() {
		return MiFID_Bond_Seniority__ESMA__Previous;
	}

	public void setMiFID_Bond_Seniority__ESMA__Previous(
			String miFID_Bond_Seniority__ESMA__Previous) {
		MiFID_Bond_Seniority__ESMA__Previous = miFID_Bond_Seniority__ESMA__Previous;
	}

	public String getMiFID_Bond_Seniority__Previous() {
		return MiFID_Bond_Seniority__Previous;
	}

	public void setMiFID_Bond_Seniority__Previous(
			String miFID_Bond_Seniority__Previous) {
		MiFID_Bond_Seniority__Previous = miFID_Bond_Seniority__Previous;
	}

	public String getMiFID_Bond_Type() {
		return MiFID_Bond_Type;
	}

	public void setMiFID_Bond_Type(String miFID_Bond_Type) {
		MiFID_Bond_Type = miFID_Bond_Type;
	}

	public String getMiFID_Bond_Type__Change_Flag() {
		return MiFID_Bond_Type__Change_Flag;
	}

	public void setMiFID_Bond_Type__Change_Flag(
			String miFID_Bond_Type__Change_Flag) {
		MiFID_Bond_Type__Change_Flag = miFID_Bond_Type__Change_Flag;
	}

	public String getMiFID_Bond_Type__Previous() {
		return MiFID_Bond_Type__Previous;
	}

	public void setMiFID_Bond_Type__Previous(String miFID_Bond_Type__Previous) {
		MiFID_Bond_Type__Previous = miFID_Bond_Type__Previous;
	}

	public String getMiFID_COFIA_Liquidity_Flag() {
		return MiFID_COFIA_Liquidity_Flag;
	}

	public void setMiFID_COFIA_Liquidity_Flag(String miFID_COFIA_Liquidity_Flag) {
		MiFID_COFIA_Liquidity_Flag = miFID_COFIA_Liquidity_Flag;
	}

	public String getMiFID_COFIA_Liquidity_Flag__Change_Flag() {
		return MiFID_COFIA_Liquidity_Flag__Change_Flag;
	}

	public void setMiFID_COFIA_Liquidity_Flag__Change_Flag(
			String miFID_COFIA_Liquidity_Flag__Change_Flag) {
		MiFID_COFIA_Liquidity_Flag__Change_Flag = miFID_COFIA_Liquidity_Flag__Change_Flag;
	}

	public String getMiFID_COFIA_Liquidity_Flag__Previous() {
		return MiFID_COFIA_Liquidity_Flag__Previous;
	}

	public void setMiFID_COFIA_Liquidity_Flag__Previous(
			String miFID_COFIA_Liquidity_Flag__Previous) {
		MiFID_COFIA_Liquidity_Flag__Previous = miFID_COFIA_Liquidity_Flag__Previous;
	}

	public String getMiFID_Clearing_Obligation_Flag() {
		return MiFID_Clearing_Obligation_Flag;
	}

	public void setMiFID_Clearing_Obligation_Flag(
			String miFID_Clearing_Obligation_Flag) {
		MiFID_Clearing_Obligation_Flag = miFID_Clearing_Obligation_Flag;
	}

	public String getMiFID_Clearing_Obligation_Flag__Change_Flag() {
		return MiFID_Clearing_Obligation_Flag__Change_Flag;
	}

	public void setMiFID_Clearing_Obligation_Flag__Change_Flag(
			String miFID_Clearing_Obligation_Flag__Change_Flag) {
		MiFID_Clearing_Obligation_Flag__Change_Flag = miFID_Clearing_Obligation_Flag__Change_Flag;
	}

	public String getMiFID_Clearing_Obligation_Flag__Previous() {
		return MiFID_Clearing_Obligation_Flag__Previous;
	}

	public void setMiFID_Clearing_Obligation_Flag__Previous(
			String miFID_Clearing_Obligation_Flag__Previous) {
		MiFID_Clearing_Obligation_Flag__Previous = miFID_Clearing_Obligation_Flag__Previous;
	}

	public String getMiFID_Clearing_Obligation_Flag_Effective_Date() {
		return MiFID_Clearing_Obligation_Flag_Effective_Date;
	}

	public void setMiFID_Clearing_Obligation_Flag_Effective_Date(
			String miFID_Clearing_Obligation_Flag_Effective_Date) {
		MiFID_Clearing_Obligation_Flag_Effective_Date = miFID_Clearing_Obligation_Flag_Effective_Date;
	}

	public String getMiFID_Clearing_Obligation_Flag_Effective_Date__Change_Flag() {
		return MiFID_Clearing_Obligation_Flag_Effective_Date__Change_Flag;
	}

	public void setMiFID_Clearing_Obligation_Flag_Effective_Date__Change_Flag(
			String miFID_Clearing_Obligation_Flag_Effective_Date__Change_Flag) {
		MiFID_Clearing_Obligation_Flag_Effective_Date__Change_Flag = miFID_Clearing_Obligation_Flag_Effective_Date__Change_Flag;
	}

	public String getMiFID_Clearing_Obligation_Flag_Effective_Date__Previous() {
		return MiFID_Clearing_Obligation_Flag_Effective_Date__Previous;
	}

	public void setMiFID_Clearing_Obligation_Flag_Effective_Date__Previous(
			String miFID_Clearing_Obligation_Flag_Effective_Date__Previous) {
		MiFID_Clearing_Obligation_Flag_Effective_Date__Previous = miFID_Clearing_Obligation_Flag_Effective_Date__Previous;
	}

	public String getMiFID_Commodities_Derivative_Indicator() {
		return MiFID_Commodities_Derivative_Indicator;
	}

	public void setMiFID_Commodities_Derivative_Indicator(
			String miFID_Commodities_Derivative_Indicator) {
		MiFID_Commodities_Derivative_Indicator = miFID_Commodities_Derivative_Indicator;
	}

	public String getMiFID_Commodities_Derivative_Indicator__Change_Flag() {
		return MiFID_Commodities_Derivative_Indicator__Change_Flag;
	}

	public void setMiFID_Commodities_Derivative_Indicator__Change_Flag(
			String miFID_Commodities_Derivative_Indicator__Change_Flag) {
		MiFID_Commodities_Derivative_Indicator__Change_Flag = miFID_Commodities_Derivative_Indicator__Change_Flag;
	}

	public String getMiFID_Commodities_Derivative_Indicator__ESMA() {
		return MiFID_Commodities_Derivative_Indicator__ESMA;
	}

	public void setMiFID_Commodities_Derivative_Indicator__ESMA(
			String miFID_Commodities_Derivative_Indicator__ESMA) {
		MiFID_Commodities_Derivative_Indicator__ESMA = miFID_Commodities_Derivative_Indicator__ESMA;
	}

	public String getMiFID_Commodities_Derivative_Indicator__ESMA__Change_Flag() {
		return MiFID_Commodities_Derivative_Indicator__ESMA__Change_Flag;
	}

	public void setMiFID_Commodities_Derivative_Indicator__ESMA__Change_Flag(
			String miFID_Commodities_Derivative_Indicator__ESMA__Change_Flag) {
		MiFID_Commodities_Derivative_Indicator__ESMA__Change_Flag = miFID_Commodities_Derivative_Indicator__ESMA__Change_Flag;
	}

	public String getMiFID_Commodities_Derivative_Indicator__ESMA__Previous() {
		return MiFID_Commodities_Derivative_Indicator__ESMA__Previous;
	}

	public void setMiFID_Commodities_Derivative_Indicator__ESMA__Previous(
			String miFID_Commodities_Derivative_Indicator__ESMA__Previous) {
		MiFID_Commodities_Derivative_Indicator__ESMA__Previous = miFID_Commodities_Derivative_Indicator__ESMA__Previous;
	}

	public String getMiFID_Commodities_Derivative_Indicator__Previous() {
		return MiFID_Commodities_Derivative_Indicator__Previous;
	}

	public void setMiFID_Commodities_Derivative_Indicator__Previous(
			String miFID_Commodities_Derivative_Indicator__Previous) {
		MiFID_Commodities_Derivative_Indicator__Previous = miFID_Commodities_Derivative_Indicator__Previous;
	}

	public String getMiFID_Complex_Instrument_Flag() {
		return MiFID_Complex_Instrument_Flag;
	}

	public void setMiFID_Complex_Instrument_Flag(
			String miFID_Complex_Instrument_Flag) {
		MiFID_Complex_Instrument_Flag = miFID_Complex_Instrument_Flag;
	}

	public String getMiFID_Complex_Instrument_Flag__Change_Flag() {
		return MiFID_Complex_Instrument_Flag__Change_Flag;
	}

	public void setMiFID_Complex_Instrument_Flag__Change_Flag(
			String miFID_Complex_Instrument_Flag__Change_Flag) {
		MiFID_Complex_Instrument_Flag__Change_Flag = miFID_Complex_Instrument_Flag__Change_Flag;
	}

	public String getMiFID_Complex_Instrument_Flag__ESMA() {
		return MiFID_Complex_Instrument_Flag__ESMA;
	}

	public void setMiFID_Complex_Instrument_Flag__ESMA(
			String miFID_Complex_Instrument_Flag__ESMA) {
		MiFID_Complex_Instrument_Flag__ESMA = miFID_Complex_Instrument_Flag__ESMA;
	}

	public String getMiFID_Complex_Instrument_Flag__ESMA__Change_Flag() {
		return MiFID_Complex_Instrument_Flag__ESMA__Change_Flag;
	}

	public void setMiFID_Complex_Instrument_Flag__ESMA__Change_Flag(
			String miFID_Complex_Instrument_Flag__ESMA__Change_Flag) {
		MiFID_Complex_Instrument_Flag__ESMA__Change_Flag = miFID_Complex_Instrument_Flag__ESMA__Change_Flag;
	}

	public String getMiFID_Complex_Instrument_Flag__ESMA__Previous() {
		return MiFID_Complex_Instrument_Flag__ESMA__Previous;
	}

	public void setMiFID_Complex_Instrument_Flag__ESMA__Previous(
			String miFID_Complex_Instrument_Flag__ESMA__Previous) {
		MiFID_Complex_Instrument_Flag__ESMA__Previous = miFID_Complex_Instrument_Flag__ESMA__Previous;
	}

	public String getMiFID_Complex_Instrument_Flag__Previous() {
		return MiFID_Complex_Instrument_Flag__Previous;
	}

	public void setMiFID_Complex_Instrument_Flag__Previous(
			String miFID_Complex_Instrument_Flag__Previous) {
		MiFID_Complex_Instrument_Flag__Previous = miFID_Complex_Instrument_Flag__Previous;
	}

	public String getMiFID_Complex_Instrument_Reason() {
		return MiFID_Complex_Instrument_Reason;
	}

	public void setMiFID_Complex_Instrument_Reason(
			String miFID_Complex_Instrument_Reason) {
		MiFID_Complex_Instrument_Reason = miFID_Complex_Instrument_Reason;
	}

	public String getMiFID_Complex_Instrument_Reason__Change_Flag() {
		return MiFID_Complex_Instrument_Reason__Change_Flag;
	}

	public void setMiFID_Complex_Instrument_Reason__Change_Flag(
			String miFID_Complex_Instrument_Reason__Change_Flag) {
		MiFID_Complex_Instrument_Reason__Change_Flag = miFID_Complex_Instrument_Reason__Change_Flag;
	}

	public String getMiFID_Complex_Instrument_Reason__Previous() {
		return MiFID_Complex_Instrument_Reason__Previous;
	}

	public void setMiFID_Complex_Instrument_Reason__Previous(
			String miFID_Complex_Instrument_Reason__Previous) {
		MiFID_Complex_Instrument_Reason__Previous = miFID_Complex_Instrument_Reason__Previous;
	}

	public String getMiFID_Contract_Subtype() {
		return MiFID_Contract_Subtype;
	}

	public void setMiFID_Contract_Subtype(String miFID_Contract_Subtype) {
		MiFID_Contract_Subtype = miFID_Contract_Subtype;
	}

	public String getMiFID_Contract_Subtype__Change_Flag() {
		return MiFID_Contract_Subtype__Change_Flag;
	}

	public void setMiFID_Contract_Subtype__Change_Flag(
			String miFID_Contract_Subtype__Change_Flag) {
		MiFID_Contract_Subtype__Change_Flag = miFID_Contract_Subtype__Change_Flag;
	}

	public String getMiFID_Contract_Subtype__Previous() {
		return MiFID_Contract_Subtype__Previous;
	}

	public void setMiFID_Contract_Subtype__Previous(
			String miFID_Contract_Subtype__Previous) {
		MiFID_Contract_Subtype__Previous = miFID_Contract_Subtype__Previous;
	}

	public String getMiFID_Contract_Type() {
		return MiFID_Contract_Type;
	}

	public void setMiFID_Contract_Type(String miFID_Contract_Type) {
		MiFID_Contract_Type = miFID_Contract_Type;
	}

	public String getMiFID_Contract_Type__Change_Flag() {
		return MiFID_Contract_Type__Change_Flag;
	}

	public void setMiFID_Contract_Type__Change_Flag(
			String miFID_Contract_Type__Change_Flag) {
		MiFID_Contract_Type__Change_Flag = miFID_Contract_Type__Change_Flag;
	}

	public String getMiFID_Contract_Type__Previous() {
		return MiFID_Contract_Type__Previous;
	}

	public void setMiFID_Contract_Type__Previous(
			String miFID_Contract_Type__Previous) {
		MiFID_Contract_Type__Previous = miFID_Contract_Type__Previous;
	}

	public String getMiFID_Delivery_Type() {
		return MiFID_Delivery_Type;
	}

	public void setMiFID_Delivery_Type(String miFID_Delivery_Type) {
		MiFID_Delivery_Type = miFID_Delivery_Type;
	}

	public String getMiFID_Delivery_Type__Change_Flag() {
		return MiFID_Delivery_Type__Change_Flag;
	}

	public void setMiFID_Delivery_Type__Change_Flag(
			String miFID_Delivery_Type__Change_Flag) {
		MiFID_Delivery_Type__Change_Flag = miFID_Delivery_Type__Change_Flag;
	}

	public String getMiFID_Delivery_Type__ESMA() {
		return MiFID_Delivery_Type__ESMA;
	}

	public void setMiFID_Delivery_Type__ESMA(String miFID_Delivery_Type__ESMA) {
		MiFID_Delivery_Type__ESMA = miFID_Delivery_Type__ESMA;
	}

	public String getMiFID_Delivery_Type__ESMA__Change_Flag() {
		return MiFID_Delivery_Type__ESMA__Change_Flag;
	}

	public void setMiFID_Delivery_Type__ESMA__Change_Flag(
			String miFID_Delivery_Type__ESMA__Change_Flag) {
		MiFID_Delivery_Type__ESMA__Change_Flag = miFID_Delivery_Type__ESMA__Change_Flag;
	}

	public String getMiFID_Delivery_Type__ESMA__Previous() {
		return MiFID_Delivery_Type__ESMA__Previous;
	}

	public void setMiFID_Delivery_Type__ESMA__Previous(
			String miFID_Delivery_Type__ESMA__Previous) {
		MiFID_Delivery_Type__ESMA__Previous = miFID_Delivery_Type__ESMA__Previous;
	}

	public String getMiFID_Delivery_Type__Previous() {
		return MiFID_Delivery_Type__Previous;
	}

	public void setMiFID_Delivery_Type__Previous(
			String miFID_Delivery_Type__Previous) {
		MiFID_Delivery_Type__Previous = miFID_Delivery_Type__Previous;
	}

	public String getMiFID_Emissions_Allowances_Sub_Type() {
		return MiFID_Emissions_Allowances_Sub_Type;
	}

	public void setMiFID_Emissions_Allowances_Sub_Type(
			String miFID_Emissions_Allowances_Sub_Type) {
		MiFID_Emissions_Allowances_Sub_Type = miFID_Emissions_Allowances_Sub_Type;
	}

	public String getMiFID_Emissions_Allowances_Sub_Type__Change_Flag() {
		return MiFID_Emissions_Allowances_Sub_Type__Change_Flag;
	}

	public void setMiFID_Emissions_Allowances_Sub_Type__Change_Flag(
			String miFID_Emissions_Allowances_Sub_Type__Change_Flag) {
		MiFID_Emissions_Allowances_Sub_Type__Change_Flag = miFID_Emissions_Allowances_Sub_Type__Change_Flag;
	}

	public String getMiFID_Emissions_Allowances_Sub_Type__Previous() {
		return MiFID_Emissions_Allowances_Sub_Type__Previous;
	}

	public void setMiFID_Emissions_Allowances_Sub_Type__Previous(
			String miFID_Emissions_Allowances_Sub_Type__Previous) {
		MiFID_Emissions_Allowances_Sub_Type__Previous = miFID_Emissions_Allowances_Sub_Type__Previous;
	}

	public String getMiFID_Exercise_Style() {
		return MiFID_Exercise_Style;
	}

	public void setMiFID_Exercise_Style(String miFID_Exercise_Style) {
		MiFID_Exercise_Style = miFID_Exercise_Style;
	}

	public String getMiFID_Exercise_Style__Change_Flag() {
		return MiFID_Exercise_Style__Change_Flag;
	}

	public void setMiFID_Exercise_Style__Change_Flag(
			String miFID_Exercise_Style__Change_Flag) {
		MiFID_Exercise_Style__Change_Flag = miFID_Exercise_Style__Change_Flag;
	}

	public String getMiFID_Exercise_Style__ESMA() {
		return MiFID_Exercise_Style__ESMA;
	}

	public void setMiFID_Exercise_Style__ESMA(String miFID_Exercise_Style__ESMA) {
		MiFID_Exercise_Style__ESMA = miFID_Exercise_Style__ESMA;
	}

	public String getMiFID_Exercise_Style__ESMA__Change_Flag() {
		return MiFID_Exercise_Style__ESMA__Change_Flag;
	}

	public void setMiFID_Exercise_Style__ESMA__Change_Flag(
			String miFID_Exercise_Style__ESMA__Change_Flag) {
		MiFID_Exercise_Style__ESMA__Change_Flag = miFID_Exercise_Style__ESMA__Change_Flag;
	}

	public String getMiFID_Exercise_Style__ESMA__Previous() {
		return MiFID_Exercise_Style__ESMA__Previous;
	}

	public void setMiFID_Exercise_Style__ESMA__Previous(
			String miFID_Exercise_Style__ESMA__Previous) {
		MiFID_Exercise_Style__ESMA__Previous = miFID_Exercise_Style__ESMA__Previous;
	}

	public String getMiFID_Exercise_Style__Previous() {
		return MiFID_Exercise_Style__Previous;
	}

	public void setMiFID_Exercise_Style__Previous(
			String miFID_Exercise_Style__Previous) {
		MiFID_Exercise_Style__Previous = miFID_Exercise_Style__Previous;
	}

	public String getMiFID_Expiration_Date() {
		return MiFID_Expiration_Date;
	}

	public void setMiFID_Expiration_Date(String miFID_Expiration_Date) {
		MiFID_Expiration_Date = miFID_Expiration_Date;
	}

	public String getMiFID_Expiration_Date__Change_Flag() {
		return MiFID_Expiration_Date__Change_Flag;
	}

	public void setMiFID_Expiration_Date__Change_Flag(
			String miFID_Expiration_Date__Change_Flag) {
		MiFID_Expiration_Date__Change_Flag = miFID_Expiration_Date__Change_Flag;
	}

	public String getMiFID_Expiration_Date__ESMA() {
		return MiFID_Expiration_Date__ESMA;
	}

	public void setMiFID_Expiration_Date__ESMA(
			String miFID_Expiration_Date__ESMA) {
		MiFID_Expiration_Date__ESMA = miFID_Expiration_Date__ESMA;
	}

	public String getMiFID_Expiration_Date__ESMA__Change_Flag() {
		return MiFID_Expiration_Date__ESMA__Change_Flag;
	}

	public void setMiFID_Expiration_Date__ESMA__Change_Flag(
			String miFID_Expiration_Date__ESMA__Change_Flag) {
		MiFID_Expiration_Date__ESMA__Change_Flag = miFID_Expiration_Date__ESMA__Change_Flag;
	}

	public String getMiFID_Expiration_Date__ESMA__Previous() {
		return MiFID_Expiration_Date__ESMA__Previous;
	}

	public void setMiFID_Expiration_Date__ESMA__Previous(
			String miFID_Expiration_Date__ESMA__Previous) {
		MiFID_Expiration_Date__ESMA__Previous = miFID_Expiration_Date__ESMA__Previous;
	}

	public String getMiFID_Expiration_Date__Previous() {
		return MiFID_Expiration_Date__Previous;
	}

	public void setMiFID_Expiration_Date__Previous(
			String miFID_Expiration_Date__Previous) {
		MiFID_Expiration_Date__Previous = miFID_Expiration_Date__Previous;
	}

	public String getMiFID_FX_Type() {
		return MiFID_FX_Type;
	}

	public void setMiFID_FX_Type(String miFID_FX_Type) {
		MiFID_FX_Type = miFID_FX_Type;
	}

	public String getMiFID_FX_Type__Change_Flag() {
		return MiFID_FX_Type__Change_Flag;
	}

	public void setMiFID_FX_Type__Change_Flag(String miFID_FX_Type__Change_Flag) {
		MiFID_FX_Type__Change_Flag = miFID_FX_Type__Change_Flag;
	}

	public String getMiFID_FX_Type__Previous() {
		return MiFID_FX_Type__Previous;
	}

	public void setMiFID_FX_Type__Previous(String miFID_FX_Type__Previous) {
		MiFID_FX_Type__Previous = miFID_FX_Type__Previous;
	}

	public String getMiFID_Final_Price_Type() {
		return MiFID_Final_Price_Type;
	}

	public void setMiFID_Final_Price_Type(String miFID_Final_Price_Type) {
		MiFID_Final_Price_Type = miFID_Final_Price_Type;
	}

	public String getMiFID_Final_Price_Type__Change_Flag() {
		return MiFID_Final_Price_Type__Change_Flag;
	}

	public void setMiFID_Final_Price_Type__Change_Flag(
			String miFID_Final_Price_Type__Change_Flag) {
		MiFID_Final_Price_Type__Change_Flag = miFID_Final_Price_Type__Change_Flag;
	}

	public String getMiFID_Final_Price_Type__ESMA() {
		return MiFID_Final_Price_Type__ESMA;
	}

	public void setMiFID_Final_Price_Type__ESMA(
			String miFID_Final_Price_Type__ESMA) {
		MiFID_Final_Price_Type__ESMA = miFID_Final_Price_Type__ESMA;
	}

	public String getMiFID_Final_Price_Type__ESMA__Change_Flag() {
		return MiFID_Final_Price_Type__ESMA__Change_Flag;
	}

	public void setMiFID_Final_Price_Type__ESMA__Change_Flag(
			String miFID_Final_Price_Type__ESMA__Change_Flag) {
		MiFID_Final_Price_Type__ESMA__Change_Flag = miFID_Final_Price_Type__ESMA__Change_Flag;
	}

	public String getMiFID_Final_Price_Type__ESMA__Previous() {
		return MiFID_Final_Price_Type__ESMA__Previous;
	}

	public void setMiFID_Final_Price_Type__ESMA__Previous(
			String miFID_Final_Price_Type__ESMA__Previous) {
		MiFID_Final_Price_Type__ESMA__Previous = miFID_Final_Price_Type__ESMA__Previous;
	}

	public String getMiFID_Final_Price_Type__Previous() {
		return MiFID_Final_Price_Type__Previous;
	}

	public void setMiFID_Final_Price_Type__Previous(
			String miFID_Final_Price_Type__Previous) {
		MiFID_Final_Price_Type__Previous = miFID_Final_Price_Type__Previous;
	}

	public String getMiFID_First_Trade_Date() {
		return MiFID_First_Trade_Date;
	}

	public void setMiFID_First_Trade_Date(String miFID_First_Trade_Date) {
		MiFID_First_Trade_Date = miFID_First_Trade_Date;
	}

	public String getMiFID_First_Trade_Date__Change_Flag() {
		return MiFID_First_Trade_Date__Change_Flag;
	}

	public void setMiFID_First_Trade_Date__Change_Flag(
			String miFID_First_Trade_Date__Change_Flag) {
		MiFID_First_Trade_Date__Change_Flag = miFID_First_Trade_Date__Change_Flag;
	}

	public String getMiFID_First_Trade_Date__ESMA() {
		return MiFID_First_Trade_Date__ESMA;
	}

	public void setMiFID_First_Trade_Date__ESMA(
			String miFID_First_Trade_Date__ESMA) {
		MiFID_First_Trade_Date__ESMA = miFID_First_Trade_Date__ESMA;
	}

	public String getMiFID_First_Trade_Date__ESMA__Change_Flag() {
		return MiFID_First_Trade_Date__ESMA__Change_Flag;
	}

	public void setMiFID_First_Trade_Date__ESMA__Change_Flag(
			String miFID_First_Trade_Date__ESMA__Change_Flag) {
		MiFID_First_Trade_Date__ESMA__Change_Flag = miFID_First_Trade_Date__ESMA__Change_Flag;
	}

	public String getMiFID_First_Trade_Date__ESMA__Previous() {
		return MiFID_First_Trade_Date__ESMA__Previous;
	}

	public void setMiFID_First_Trade_Date__ESMA__Previous(
			String miFID_First_Trade_Date__ESMA__Previous) {
		MiFID_First_Trade_Date__ESMA__Previous = miFID_First_Trade_Date__ESMA__Previous;
	}

	public String getMiFID_First_Trade_Date__Previous() {
		return MiFID_First_Trade_Date__Previous;
	}

	public void setMiFID_First_Trade_Date__Previous(
			String miFID_First_Trade_Date__Previous) {
		MiFID_First_Trade_Date__Previous = miFID_First_Trade_Date__Previous;
	}

	public String getMiFID_Flag() {
		return MiFID_Flag;
	}

	public void setMiFID_Flag(String miFID_Flag) {
		MiFID_Flag = miFID_Flag;
	}

	public String getMiFID_Flag__Change_Flag() {
		return MiFID_Flag__Change_Flag;
	}

	public void setMiFID_Flag__Change_Flag(String miFID_Flag__Change_Flag) {
		MiFID_Flag__Change_Flag = miFID_Flag__Change_Flag;
	}

	public String getMiFID_Flag__Previous() {
		return MiFID_Flag__Previous;
	}

	public void setMiFID_Flag__Previous(String miFID_Flag__Previous) {
		MiFID_Flag__Previous = miFID_Flag__Previous;
	}

	public String getMiFID_Free_Float__ESMA() {
		return MiFID_Free_Float__ESMA;
	}

	public void setMiFID_Free_Float__ESMA(String miFID_Free_Float__ESMA) {
		MiFID_Free_Float__ESMA = miFID_Free_Float__ESMA;
	}

	public String getMiFID_Free_Float__ESMA__Change_Flag() {
		return MiFID_Free_Float__ESMA__Change_Flag;
	}

	public void setMiFID_Free_Float__ESMA__Change_Flag(
			String miFID_Free_Float__ESMA__Change_Flag) {
		MiFID_Free_Float__ESMA__Change_Flag = miFID_Free_Float__ESMA__Change_Flag;
	}

	public String getMiFID_Free_Float__ESMA__Previous() {
		return MiFID_Free_Float__ESMA__Previous;
	}

	public void setMiFID_Free_Float__ESMA__Previous(
			String miFID_Free_Float__ESMA__Previous) {
		MiFID_Free_Float__ESMA__Previous = miFID_Free_Float__ESMA__Previous;
	}

	public String getMiFID_Free_Float_Currency_Code() {
		return MiFID_Free_Float_Currency_Code;
	}

	public void setMiFID_Free_Float_Currency_Code(
			String miFID_Free_Float_Currency_Code) {
		MiFID_Free_Float_Currency_Code = miFID_Free_Float_Currency_Code;
	}

	public String getMiFID_Free_Float_Currency_Code__Change_Flag() {
		return MiFID_Free_Float_Currency_Code__Change_Flag;
	}

	public void setMiFID_Free_Float_Currency_Code__Change_Flag(
			String miFID_Free_Float_Currency_Code__Change_Flag) {
		MiFID_Free_Float_Currency_Code__Change_Flag = miFID_Free_Float_Currency_Code__Change_Flag;
	}

	public String getMiFID_Free_Float_Currency_Code__Previous() {
		return MiFID_Free_Float_Currency_Code__Previous;
	}

	public void setMiFID_Free_Float_Currency_Code__Previous(
			String miFID_Free_Float_Currency_Code__Previous) {
		MiFID_Free_Float_Currency_Code__Previous = miFID_Free_Float_Currency_Code__Previous;
	}

	public String getMiFID_Free_Float_Upper_Limit__ESMA() {
		return MiFID_Free_Float_Upper_Limit__ESMA;
	}

	public void setMiFID_Free_Float_Upper_Limit__ESMA(
			String miFID_Free_Float_Upper_Limit__ESMA) {
		MiFID_Free_Float_Upper_Limit__ESMA = miFID_Free_Float_Upper_Limit__ESMA;
	}

	public String getMiFID_Free_Float_Upper_Limit__ESMA__Change_Flag() {
		return MiFID_Free_Float_Upper_Limit__ESMA__Change_Flag;
	}

	public void setMiFID_Free_Float_Upper_Limit__ESMA__Change_Flag(
			String miFID_Free_Float_Upper_Limit__ESMA__Change_Flag) {
		MiFID_Free_Float_Upper_Limit__ESMA__Change_Flag = miFID_Free_Float_Upper_Limit__ESMA__Change_Flag;
	}

	public String getMiFID_Free_Float_Upper_Limit__ESMA__Previous() {
		return MiFID_Free_Float_Upper_Limit__ESMA__Previous;
	}

	public void setMiFID_Free_Float_Upper_Limit__ESMA__Previous(
			String miFID_Free_Float_Upper_Limit__ESMA__Previous) {
		MiFID_Free_Float_Upper_Limit__ESMA__Previous = miFID_Free_Float_Upper_Limit__ESMA__Previous;
	}

	public String getMiFID_Further_Sub_Product() {
		return MiFID_Further_Sub_Product;
	}

	public void setMiFID_Further_Sub_Product(String miFID_Further_Sub_Product) {
		MiFID_Further_Sub_Product = miFID_Further_Sub_Product;
	}

	public String getMiFID_Further_Sub_Product__Change_Flag() {
		return MiFID_Further_Sub_Product__Change_Flag;
	}

	public void setMiFID_Further_Sub_Product__Change_Flag(
			String miFID_Further_Sub_Product__Change_Flag) {
		MiFID_Further_Sub_Product__Change_Flag = miFID_Further_Sub_Product__Change_Flag;
	}

	public String getMiFID_Further_Sub_Product__ESMA() {
		return MiFID_Further_Sub_Product__ESMA;
	}

	public void setMiFID_Further_Sub_Product__ESMA(
			String miFID_Further_Sub_Product__ESMA) {
		MiFID_Further_Sub_Product__ESMA = miFID_Further_Sub_Product__ESMA;
	}

	public String getMiFID_Further_Sub_Product__ESMA__Change_Flag() {
		return MiFID_Further_Sub_Product__ESMA__Change_Flag;
	}

	public void setMiFID_Further_Sub_Product__ESMA__Change_Flag(
			String miFID_Further_Sub_Product__ESMA__Change_Flag) {
		MiFID_Further_Sub_Product__ESMA__Change_Flag = miFID_Further_Sub_Product__ESMA__Change_Flag;
	}

	public String getMiFID_Further_Sub_Product__ESMA__Previous() {
		return MiFID_Further_Sub_Product__ESMA__Previous;
	}

	public void setMiFID_Further_Sub_Product__ESMA__Previous(
			String miFID_Further_Sub_Product__ESMA__Previous) {
		MiFID_Further_Sub_Product__ESMA__Previous = miFID_Further_Sub_Product__ESMA__Previous;
	}

	public String getMiFID_Further_Sub_Product__Previous() {
		return MiFID_Further_Sub_Product__Previous;
	}

	public void setMiFID_Further_Sub_Product__Previous(
			String miFID_Further_Sub_Product__Previous) {
		MiFID_Further_Sub_Product__Previous = miFID_Further_Sub_Product__Previous;
	}

	public String getMiFID_Index_Identifier() {
		return MiFID_Index_Identifier;
	}

	public void setMiFID_Index_Identifier(String miFID_Index_Identifier) {
		MiFID_Index_Identifier = miFID_Index_Identifier;
	}

	public String getMiFID_Index_Identifier__Change_Flag() {
		return MiFID_Index_Identifier__Change_Flag;
	}

	public void setMiFID_Index_Identifier__Change_Flag(
			String miFID_Index_Identifier__Change_Flag) {
		MiFID_Index_Identifier__Change_Flag = miFID_Index_Identifier__Change_Flag;
	}

	public String getMiFID_Index_Identifier__ESMA() {
		return MiFID_Index_Identifier__ESMA;
	}

	public void setMiFID_Index_Identifier__ESMA(
			String miFID_Index_Identifier__ESMA) {
		MiFID_Index_Identifier__ESMA = miFID_Index_Identifier__ESMA;
	}

	public String getMiFID_Index_Identifier__ESMA__Change_Flag() {
		return MiFID_Index_Identifier__ESMA__Change_Flag;
	}

	public void setMiFID_Index_Identifier__ESMA__Change_Flag(
			String miFID_Index_Identifier__ESMA__Change_Flag) {
		MiFID_Index_Identifier__ESMA__Change_Flag = miFID_Index_Identifier__ESMA__Change_Flag;
	}

	public String getMiFID_Index_Identifier__ESMA__Previous() {
		return MiFID_Index_Identifier__ESMA__Previous;
	}

	public void setMiFID_Index_Identifier__ESMA__Previous(
			String miFID_Index_Identifier__ESMA__Previous) {
		MiFID_Index_Identifier__ESMA__Previous = miFID_Index_Identifier__ESMA__Previous;
	}

	public String getMiFID_Index_Identifier__Previous() {
		return MiFID_Index_Identifier__Previous;
	}

	public void setMiFID_Index_Identifier__Previous(
			String miFID_Index_Identifier__Previous) {
		MiFID_Index_Identifier__Previous = miFID_Index_Identifier__Previous;
	}

	public String getMiFID_Index_Name() {
		return MiFID_Index_Name;
	}

	public void setMiFID_Index_Name(String miFID_Index_Name) {
		MiFID_Index_Name = miFID_Index_Name;
	}

	public String getMiFID_Index_Name__Change_Flag() {
		return MiFID_Index_Name__Change_Flag;
	}

	public void setMiFID_Index_Name__Change_Flag(
			String miFID_Index_Name__Change_Flag) {
		MiFID_Index_Name__Change_Flag = miFID_Index_Name__Change_Flag;
	}

	public String getMiFID_Index_Name__ESMA() {
		return MiFID_Index_Name__ESMA;
	}

	public void setMiFID_Index_Name__ESMA(String miFID_Index_Name__ESMA) {
		MiFID_Index_Name__ESMA = miFID_Index_Name__ESMA;
	}

	public String getMiFID_Index_Name__ESMA__Change_Flag() {
		return MiFID_Index_Name__ESMA__Change_Flag;
	}

	public void setMiFID_Index_Name__ESMA__Change_Flag(
			String miFID_Index_Name__ESMA__Change_Flag) {
		MiFID_Index_Name__ESMA__Change_Flag = miFID_Index_Name__ESMA__Change_Flag;
	}

	public String getMiFID_Index_Name__ESMA__Previous() {
		return MiFID_Index_Name__ESMA__Previous;
	}

	public void setMiFID_Index_Name__ESMA__Previous(
			String miFID_Index_Name__ESMA__Previous) {
		MiFID_Index_Name__ESMA__Previous = miFID_Index_Name__ESMA__Previous;
	}

	public String getMiFID_Index_Name__Previous() {
		return MiFID_Index_Name__Previous;
	}

	public void setMiFID_Index_Name__Previous(String miFID_Index_Name__Previous) {
		MiFID_Index_Name__Previous = miFID_Index_Name__Previous;
	}

	public String getMiFID_Index_Term() {
		return MiFID_Index_Term;
	}

	public void setMiFID_Index_Term(String miFID_Index_Term) {
		MiFID_Index_Term = miFID_Index_Term;
	}

	public String getMiFID_Index_Term__Change_Flag() {
		return MiFID_Index_Term__Change_Flag;
	}

	public void setMiFID_Index_Term__Change_Flag(
			String miFID_Index_Term__Change_Flag) {
		MiFID_Index_Term__Change_Flag = miFID_Index_Term__Change_Flag;
	}

	public String getMiFID_Index_Term__ESMA() {
		return MiFID_Index_Term__ESMA;
	}

	public void setMiFID_Index_Term__ESMA(String miFID_Index_Term__ESMA) {
		MiFID_Index_Term__ESMA = miFID_Index_Term__ESMA;
	}

	public String getMiFID_Index_Term__ESMA__Change_Flag() {
		return MiFID_Index_Term__ESMA__Change_Flag;
	}

	public void setMiFID_Index_Term__ESMA__Change_Flag(
			String miFID_Index_Term__ESMA__Change_Flag) {
		MiFID_Index_Term__ESMA__Change_Flag = miFID_Index_Term__ESMA__Change_Flag;
	}

	public String getMiFID_Index_Term__ESMA__Previous() {
		return MiFID_Index_Term__ESMA__Previous;
	}

	public void setMiFID_Index_Term__ESMA__Previous(
			String miFID_Index_Term__ESMA__Previous) {
		MiFID_Index_Term__ESMA__Previous = miFID_Index_Term__ESMA__Previous;
	}

	public String getMiFID_Index_Term__Previous() {
		return MiFID_Index_Term__Previous;
	}

	public void setMiFID_Index_Term__Previous(String miFID_Index_Term__Previous) {
		MiFID_Index_Term__Previous = miFID_Index_Term__Previous;
	}

	public String getMiFID_Inflation_Index_Name() {
		return MiFID_Inflation_Index_Name;
	}

	public void setMiFID_Inflation_Index_Name(String miFID_Inflation_Index_Name) {
		MiFID_Inflation_Index_Name = miFID_Inflation_Index_Name;
	}

	public String getMiFID_Inflation_Index_Name__Change_Flag() {
		return MiFID_Inflation_Index_Name__Change_Flag;
	}

	public void setMiFID_Inflation_Index_Name__Change_Flag(
			String miFID_Inflation_Index_Name__Change_Flag) {
		MiFID_Inflation_Index_Name__Change_Flag = miFID_Inflation_Index_Name__Change_Flag;
	}

	public String getMiFID_Inflation_Index_Name__Previous() {
		return MiFID_Inflation_Index_Name__Previous;
	}

	public void setMiFID_Inflation_Index_Name__Previous(
			String miFID_Inflation_Index_Name__Previous) {
		MiFID_Inflation_Index_Name__Previous = miFID_Inflation_Index_Name__Previous;
	}

	public String getMiFID_Issuance_Date() {
		return MiFID_Issuance_Date;
	}

	public void setMiFID_Issuance_Date(String miFID_Issuance_Date) {
		MiFID_Issuance_Date = miFID_Issuance_Date;
	}

	public String getMiFID_Issuance_Date__Change_Flag() {
		return MiFID_Issuance_Date__Change_Flag;
	}

	public void setMiFID_Issuance_Date__Change_Flag(
			String miFID_Issuance_Date__Change_Flag) {
		MiFID_Issuance_Date__Change_Flag = miFID_Issuance_Date__Change_Flag;
	}

	public String getMiFID_Issuance_Date__ESMA() {
		return MiFID_Issuance_Date__ESMA;
	}

	public void setMiFID_Issuance_Date__ESMA(String miFID_Issuance_Date__ESMA) {
		MiFID_Issuance_Date__ESMA = miFID_Issuance_Date__ESMA;
	}

	public String getMiFID_Issuance_Date__ESMA__Change_Flag() {
		return MiFID_Issuance_Date__ESMA__Change_Flag;
	}

	public void setMiFID_Issuance_Date__ESMA__Change_Flag(
			String miFID_Issuance_Date__ESMA__Change_Flag) {
		MiFID_Issuance_Date__ESMA__Change_Flag = miFID_Issuance_Date__ESMA__Change_Flag;
	}

	public String getMiFID_Issuance_Date__ESMA__Previous() {
		return MiFID_Issuance_Date__ESMA__Previous;
	}

	public void setMiFID_Issuance_Date__ESMA__Previous(
			String miFID_Issuance_Date__ESMA__Previous) {
		MiFID_Issuance_Date__ESMA__Previous = miFID_Issuance_Date__ESMA__Previous;
	}

	public String getMiFID_Issuance_Date__Previous() {
		return MiFID_Issuance_Date__Previous;
	}

	public void setMiFID_Issuance_Date__Previous(
			String miFID_Issuance_Date__Previous) {
		MiFID_Issuance_Date__Previous = miFID_Issuance_Date__Previous;
	}

	public String getMiFID_Issuance_Size__ESMA() {
		return MiFID_Issuance_Size__ESMA;
	}

	public void setMiFID_Issuance_Size__ESMA(String miFID_Issuance_Size__ESMA) {
		MiFID_Issuance_Size__ESMA = miFID_Issuance_Size__ESMA;
	}

	public String getMiFID_Issuance_Size__ESMA__Change_Flag() {
		return MiFID_Issuance_Size__ESMA__Change_Flag;
	}

	public void setMiFID_Issuance_Size__ESMA__Change_Flag(
			String miFID_Issuance_Size__ESMA__Change_Flag) {
		MiFID_Issuance_Size__ESMA__Change_Flag = miFID_Issuance_Size__ESMA__Change_Flag;
	}

	public String getMiFID_Issuance_Size__ESMA__Previous() {
		return MiFID_Issuance_Size__ESMA__Previous;
	}

	public void setMiFID_Issuance_Size__ESMA__Previous(
			String miFID_Issuance_Size__ESMA__Previous) {
		MiFID_Issuance_Size__ESMA__Previous = miFID_Issuance_Size__ESMA__Previous;
	}

	public String getMiFID_Liquidity_Flag__ESMA() {
		return MiFID_Liquidity_Flag__ESMA;
	}

	public void setMiFID_Liquidity_Flag__ESMA(String miFID_Liquidity_Flag__ESMA) {
		MiFID_Liquidity_Flag__ESMA = miFID_Liquidity_Flag__ESMA;
	}

	public String getMiFID_Liquidity_Flag__ESMA__Change_Flag() {
		return MiFID_Liquidity_Flag__ESMA__Change_Flag;
	}

	public void setMiFID_Liquidity_Flag__ESMA__Change_Flag(
			String miFID_Liquidity_Flag__ESMA__Change_Flag) {
		MiFID_Liquidity_Flag__ESMA__Change_Flag = miFID_Liquidity_Flag__ESMA__Change_Flag;
	}

	public String getMiFID_Liquidity_Flag__ESMA__Previous() {
		return MiFID_Liquidity_Flag__ESMA__Previous;
	}

	public void setMiFID_Liquidity_Flag__ESMA__Previous(
			String miFID_Liquidity_Flag__ESMA__Previous) {
		MiFID_Liquidity_Flag__ESMA__Previous = miFID_Liquidity_Flag__ESMA__Previous;
	}

	public String getMiFID_Maturity_Date() {
		return MiFID_Maturity_Date;
	}

	public void setMiFID_Maturity_Date(String miFID_Maturity_Date) {
		MiFID_Maturity_Date = miFID_Maturity_Date;
	}

	public String getMiFID_Maturity_Date__Change_Flag() {
		return MiFID_Maturity_Date__Change_Flag;
	}

	public void setMiFID_Maturity_Date__Change_Flag(
			String miFID_Maturity_Date__Change_Flag) {
		MiFID_Maturity_Date__Change_Flag = miFID_Maturity_Date__Change_Flag;
	}

	public String getMiFID_Maturity_Date__ESMA() {
		return MiFID_Maturity_Date__ESMA;
	}

	public void setMiFID_Maturity_Date__ESMA(String miFID_Maturity_Date__ESMA) {
		MiFID_Maturity_Date__ESMA = miFID_Maturity_Date__ESMA;
	}

	public String getMiFID_Maturity_Date__ESMA__Change_Flag() {
		return MiFID_Maturity_Date__ESMA__Change_Flag;
	}

	public void setMiFID_Maturity_Date__ESMA__Change_Flag(
			String miFID_Maturity_Date__ESMA__Change_Flag) {
		MiFID_Maturity_Date__ESMA__Change_Flag = miFID_Maturity_Date__ESMA__Change_Flag;
	}

	public String getMiFID_Maturity_Date__ESMA__Previous() {
		return MiFID_Maturity_Date__ESMA__Previous;
	}

	public void setMiFID_Maturity_Date__ESMA__Previous(
			String miFID_Maturity_Date__ESMA__Previous) {
		MiFID_Maturity_Date__ESMA__Previous = miFID_Maturity_Date__ESMA__Previous;
	}

	public String getMiFID_Maturity_Date__Previous() {
		return MiFID_Maturity_Date__Previous;
	}

	public void setMiFID_Maturity_Date__Previous(
			String miFID_Maturity_Date__Previous) {
		MiFID_Maturity_Date__Previous = miFID_Maturity_Date__Previous;
	}

	public String getMiFID_Most_Relevant_Market__ESMA() {
		return MiFID_Most_Relevant_Market__ESMA;
	}

	public void setMiFID_Most_Relevant_Market__ESMA(
			String miFID_Most_Relevant_Market__ESMA) {
		MiFID_Most_Relevant_Market__ESMA = miFID_Most_Relevant_Market__ESMA;
	}

	public String getMiFID_Most_Relevant_Market__ESMA__Change_Flag() {
		return MiFID_Most_Relevant_Market__ESMA__Change_Flag;
	}

	public void setMiFID_Most_Relevant_Market__ESMA__Change_Flag(
			String miFID_Most_Relevant_Market__ESMA__Change_Flag) {
		MiFID_Most_Relevant_Market__ESMA__Change_Flag = miFID_Most_Relevant_Market__ESMA__Change_Flag;
	}

	public String getMiFID_Most_Relevant_Market__ESMA__Previous() {
		return MiFID_Most_Relevant_Market__ESMA__Previous;
	}

	public void setMiFID_Most_Relevant_Market__ESMA__Previous(
			String miFID_Most_Relevant_Market__ESMA__Previous) {
		MiFID_Most_Relevant_Market__ESMA__Previous = miFID_Most_Relevant_Market__ESMA__Previous;
	}

	public String getMiFID_Next_Roll_Date() {
		return MiFID_Next_Roll_Date;
	}

	public void setMiFID_Next_Roll_Date(String miFID_Next_Roll_Date) {
		MiFID_Next_Roll_Date = miFID_Next_Roll_Date;
	}

	public String getMiFID_Next_Roll_Date__Change_Flag() {
		return MiFID_Next_Roll_Date__Change_Flag;
	}

	public void setMiFID_Next_Roll_Date__Change_Flag(
			String miFID_Next_Roll_Date__Change_Flag) {
		MiFID_Next_Roll_Date__Change_Flag = miFID_Next_Roll_Date__Change_Flag;
	}

	public String getMiFID_Next_Roll_Date__Previous() {
		return MiFID_Next_Roll_Date__Previous;
	}

	public void setMiFID_Next_Roll_Date__Previous(
			String miFID_Next_Roll_Date__Previous) {
		MiFID_Next_Roll_Date__Previous = miFID_Next_Roll_Date__Previous;
	}

	public String getMiFID_Option_Type() {
		return MiFID_Option_Type;
	}

	public void setMiFID_Option_Type(String miFID_Option_Type) {
		MiFID_Option_Type = miFID_Option_Type;
	}

	public String getMiFID_Option_Type__Change_Flag() {
		return MiFID_Option_Type__Change_Flag;
	}

	public void setMiFID_Option_Type__Change_Flag(
			String miFID_Option_Type__Change_Flag) {
		MiFID_Option_Type__Change_Flag = miFID_Option_Type__Change_Flag;
	}

	public String getMiFID_Option_Type__ESMA() {
		return MiFID_Option_Type__ESMA;
	}

	public void setMiFID_Option_Type__ESMA(String miFID_Option_Type__ESMA) {
		MiFID_Option_Type__ESMA = miFID_Option_Type__ESMA;
	}

	public String getMiFID_Option_Type__ESMA__Change_Flag() {
		return MiFID_Option_Type__ESMA__Change_Flag;
	}

	public void setMiFID_Option_Type__ESMA__Change_Flag(
			String miFID_Option_Type__ESMA__Change_Flag) {
		MiFID_Option_Type__ESMA__Change_Flag = miFID_Option_Type__ESMA__Change_Flag;
	}

	public String getMiFID_Option_Type__ESMA__Previous() {
		return MiFID_Option_Type__ESMA__Previous;
	}

	public void setMiFID_Option_Type__ESMA__Previous(
			String miFID_Option_Type__ESMA__Previous) {
		MiFID_Option_Type__ESMA__Previous = miFID_Option_Type__ESMA__Previous;
	}

	public String getMiFID_Option_Type__Previous() {
		return MiFID_Option_Type__Previous;
	}

	public void setMiFID_Option_Type__Previous(
			String miFID_Option_Type__Previous) {
		MiFID_Option_Type__Previous = miFID_Option_Type__Previous;
	}

	public String getMiFID_Percent_Trading_Under_Waivers_12_Month__ESMA() {
		return MiFID_Percent_Trading_Under_Waivers_12_Month__ESMA;
	}

	public void setMiFID_Percent_Trading_Under_Waivers_12_Month__ESMA(
			String miFID_Percent_Trading_Under_Waivers_12_Month__ESMA) {
		MiFID_Percent_Trading_Under_Waivers_12_Month__ESMA = miFID_Percent_Trading_Under_Waivers_12_Month__ESMA;
	}

	public String getMiFID_Percent_Trading_Under_Waivers_12_Month__ESMA__Change_Flag() {
		return MiFID_Percent_Trading_Under_Waivers_12_Month__ESMA__Change_Flag;
	}

	public void setMiFID_Percent_Trading_Under_Waivers_12_Month__ESMA__Change_Flag(
			String miFID_Percent_Trading_Under_Waivers_12_Month__ESMA__Change_Flag) {
		MiFID_Percent_Trading_Under_Waivers_12_Month__ESMA__Change_Flag = miFID_Percent_Trading_Under_Waivers_12_Month__ESMA__Change_Flag;
	}

	public String getMiFID_Percent_Trading_Under_Waivers_12_Month__ESMA__Previous() {
		return MiFID_Percent_Trading_Under_Waivers_12_Month__ESMA__Previous;
	}

	public void setMiFID_Percent_Trading_Under_Waivers_12_Month__ESMA__Previous(
			String miFID_Percent_Trading_Under_Waivers_12_Month__ESMA__Previous) {
		MiFID_Percent_Trading_Under_Waivers_12_Month__ESMA__Previous = miFID_Percent_Trading_Under_Waivers_12_Month__ESMA__Previous;
	}

	public String getMiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA() {
		return MiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA;
	}

	public void setMiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA(
			String miFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA) {
		MiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA = miFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA;
	}

	public String getMiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA__Change_Flag() {
		return MiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA__Change_Flag;
	}

	public void setMiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA__Change_Flag(
			String miFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA__Change_Flag) {
		MiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA__Change_Flag = miFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA__Change_Flag;
	}

	public String getMiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA__Previous() {
		return MiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA__Previous;
	}

	public void setMiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA__Previous(
			String miFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA__Previous) {
		MiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA__Previous = miFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA__Previous;
	}

	public String getMiFID_Post_Trade_LIS_Threshold_Floor() {
		return MiFID_Post_Trade_LIS_Threshold_Floor;
	}

	public void setMiFID_Post_Trade_LIS_Threshold_Floor(
			String miFID_Post_Trade_LIS_Threshold_Floor) {
		MiFID_Post_Trade_LIS_Threshold_Floor = miFID_Post_Trade_LIS_Threshold_Floor;
	}

	public String getMiFID_Post_Trade_LIS_Threshold_Floor__Change_Flag() {
		return MiFID_Post_Trade_LIS_Threshold_Floor__Change_Flag;
	}

	public void setMiFID_Post_Trade_LIS_Threshold_Floor__Change_Flag(
			String miFID_Post_Trade_LIS_Threshold_Floor__Change_Flag) {
		MiFID_Post_Trade_LIS_Threshold_Floor__Change_Flag = miFID_Post_Trade_LIS_Threshold_Floor__Change_Flag;
	}

	public String getMiFID_Post_Trade_LIS_Threshold_Floor__Previous() {
		return MiFID_Post_Trade_LIS_Threshold_Floor__Previous;
	}

	public void setMiFID_Post_Trade_LIS_Threshold_Floor__Previous(
			String miFID_Post_Trade_LIS_Threshold_Floor__Previous) {
		MiFID_Post_Trade_LIS_Threshold_Floor__Previous = miFID_Post_Trade_LIS_Threshold_Floor__Previous;
	}

	public String getMiFID_Post_Trade_LIS_Threshold_Value() {
		return MiFID_Post_Trade_LIS_Threshold_Value;
	}

	public void setMiFID_Post_Trade_LIS_Threshold_Value(
			String miFID_Post_Trade_LIS_Threshold_Value) {
		MiFID_Post_Trade_LIS_Threshold_Value = miFID_Post_Trade_LIS_Threshold_Value;
	}

	public String getMiFID_Post_Trade_LIS_Threshold_Value__Change_Flag() {
		return MiFID_Post_Trade_LIS_Threshold_Value__Change_Flag;
	}

	public void setMiFID_Post_Trade_LIS_Threshold_Value__Change_Flag(
			String miFID_Post_Trade_LIS_Threshold_Value__Change_Flag) {
		MiFID_Post_Trade_LIS_Threshold_Value__Change_Flag = miFID_Post_Trade_LIS_Threshold_Value__Change_Flag;
	}

	public String getMiFID_Post_Trade_LIS_Threshold_Value__Previous() {
		return MiFID_Post_Trade_LIS_Threshold_Value__Previous;
	}

	public void setMiFID_Post_Trade_LIS_Threshold_Value__Previous(
			String miFID_Post_Trade_LIS_Threshold_Value__Previous) {
		MiFID_Post_Trade_LIS_Threshold_Value__Previous = miFID_Post_Trade_LIS_Threshold_Value__Previous;
	}

	public String getMiFID_Post_Trade_LIS_Trade_Percentile() {
		return MiFID_Post_Trade_LIS_Trade_Percentile;
	}

	public void setMiFID_Post_Trade_LIS_Trade_Percentile(
			String miFID_Post_Trade_LIS_Trade_Percentile) {
		MiFID_Post_Trade_LIS_Trade_Percentile = miFID_Post_Trade_LIS_Trade_Percentile;
	}

	public String getMiFID_Post_Trade_LIS_Trade_Percentile__Change_Flag() {
		return MiFID_Post_Trade_LIS_Trade_Percentile__Change_Flag;
	}

	public void setMiFID_Post_Trade_LIS_Trade_Percentile__Change_Flag(
			String miFID_Post_Trade_LIS_Trade_Percentile__Change_Flag) {
		MiFID_Post_Trade_LIS_Trade_Percentile__Change_Flag = miFID_Post_Trade_LIS_Trade_Percentile__Change_Flag;
	}

	public String getMiFID_Post_Trade_LIS_Trade_Percentile__Previous() {
		return MiFID_Post_Trade_LIS_Trade_Percentile__Previous;
	}

	public void setMiFID_Post_Trade_LIS_Trade_Percentile__Previous(
			String miFID_Post_Trade_LIS_Trade_Percentile__Previous) {
		MiFID_Post_Trade_LIS_Trade_Percentile__Previous = miFID_Post_Trade_LIS_Trade_Percentile__Previous;
	}

	public String getMiFID_Post_Trade_LIS_Volume_Percentile() {
		return MiFID_Post_Trade_LIS_Volume_Percentile;
	}

	public void setMiFID_Post_Trade_LIS_Volume_Percentile(
			String miFID_Post_Trade_LIS_Volume_Percentile) {
		MiFID_Post_Trade_LIS_Volume_Percentile = miFID_Post_Trade_LIS_Volume_Percentile;
	}

	public String getMiFID_Post_Trade_LIS_Volume_Percentile__Change_Flag() {
		return MiFID_Post_Trade_LIS_Volume_Percentile__Change_Flag;
	}

	public void setMiFID_Post_Trade_LIS_Volume_Percentile__Change_Flag(
			String miFID_Post_Trade_LIS_Volume_Percentile__Change_Flag) {
		MiFID_Post_Trade_LIS_Volume_Percentile__Change_Flag = miFID_Post_Trade_LIS_Volume_Percentile__Change_Flag;
	}

	public String getMiFID_Post_Trade_LIS_Volume_Percentile__Previous() {
		return MiFID_Post_Trade_LIS_Volume_Percentile__Previous;
	}

	public void setMiFID_Post_Trade_LIS_Volume_Percentile__Previous(
			String miFID_Post_Trade_LIS_Volume_Percentile__Previous) {
		MiFID_Post_Trade_LIS_Volume_Percentile__Previous = miFID_Post_Trade_LIS_Volume_Percentile__Previous;
	}

	public String getMiFID_Post_Trade_SSTI_Threshold_Floor() {
		return MiFID_Post_Trade_SSTI_Threshold_Floor;
	}

	public void setMiFID_Post_Trade_SSTI_Threshold_Floor(
			String miFID_Post_Trade_SSTI_Threshold_Floor) {
		MiFID_Post_Trade_SSTI_Threshold_Floor = miFID_Post_Trade_SSTI_Threshold_Floor;
	}

	public String getMiFID_Post_Trade_SSTI_Threshold_Floor__Change_Flag() {
		return MiFID_Post_Trade_SSTI_Threshold_Floor__Change_Flag;
	}

	public void setMiFID_Post_Trade_SSTI_Threshold_Floor__Change_Flag(
			String miFID_Post_Trade_SSTI_Threshold_Floor__Change_Flag) {
		MiFID_Post_Trade_SSTI_Threshold_Floor__Change_Flag = miFID_Post_Trade_SSTI_Threshold_Floor__Change_Flag;
	}

	public String getMiFID_Post_Trade_SSTI_Threshold_Floor__Previous() {
		return MiFID_Post_Trade_SSTI_Threshold_Floor__Previous;
	}

	public void setMiFID_Post_Trade_SSTI_Threshold_Floor__Previous(
			String miFID_Post_Trade_SSTI_Threshold_Floor__Previous) {
		MiFID_Post_Trade_SSTI_Threshold_Floor__Previous = miFID_Post_Trade_SSTI_Threshold_Floor__Previous;
	}

	public String getMiFID_Post_Trade_SSTI_Threshold_Value() {
		return MiFID_Post_Trade_SSTI_Threshold_Value;
	}

	public void setMiFID_Post_Trade_SSTI_Threshold_Value(
			String miFID_Post_Trade_SSTI_Threshold_Value) {
		MiFID_Post_Trade_SSTI_Threshold_Value = miFID_Post_Trade_SSTI_Threshold_Value;
	}

	public String getMiFID_Post_Trade_SSTI_Threshold_Value__Change_Flag() {
		return MiFID_Post_Trade_SSTI_Threshold_Value__Change_Flag;
	}

	public void setMiFID_Post_Trade_SSTI_Threshold_Value__Change_Flag(
			String miFID_Post_Trade_SSTI_Threshold_Value__Change_Flag) {
		MiFID_Post_Trade_SSTI_Threshold_Value__Change_Flag = miFID_Post_Trade_SSTI_Threshold_Value__Change_Flag;
	}

	public String getMiFID_Post_Trade_SSTI_Threshold_Value__Previous() {
		return MiFID_Post_Trade_SSTI_Threshold_Value__Previous;
	}

	public void setMiFID_Post_Trade_SSTI_Threshold_Value__Previous(
			String miFID_Post_Trade_SSTI_Threshold_Value__Previous) {
		MiFID_Post_Trade_SSTI_Threshold_Value__Previous = miFID_Post_Trade_SSTI_Threshold_Value__Previous;
	}

	public String getMiFID_Post_Trade_SSTI_Trade_Percentile() {
		return MiFID_Post_Trade_SSTI_Trade_Percentile;
	}

	public void setMiFID_Post_Trade_SSTI_Trade_Percentile(
			String miFID_Post_Trade_SSTI_Trade_Percentile) {
		MiFID_Post_Trade_SSTI_Trade_Percentile = miFID_Post_Trade_SSTI_Trade_Percentile;
	}

	public String getMiFID_Post_Trade_SSTI_Trade_Percentile__Change_Flag() {
		return MiFID_Post_Trade_SSTI_Trade_Percentile__Change_Flag;
	}

	public void setMiFID_Post_Trade_SSTI_Trade_Percentile__Change_Flag(
			String miFID_Post_Trade_SSTI_Trade_Percentile__Change_Flag) {
		MiFID_Post_Trade_SSTI_Trade_Percentile__Change_Flag = miFID_Post_Trade_SSTI_Trade_Percentile__Change_Flag;
	}

	public String getMiFID_Post_Trade_SSTI_Trade_Percentile__Previous() {
		return MiFID_Post_Trade_SSTI_Trade_Percentile__Previous;
	}

	public void setMiFID_Post_Trade_SSTI_Trade_Percentile__Previous(
			String miFID_Post_Trade_SSTI_Trade_Percentile__Previous) {
		MiFID_Post_Trade_SSTI_Trade_Percentile__Previous = miFID_Post_Trade_SSTI_Trade_Percentile__Previous;
	}

	public String getMiFID_Post_Trade_SSTI_Volume_Percentile() {
		return MiFID_Post_Trade_SSTI_Volume_Percentile;
	}

	public void setMiFID_Post_Trade_SSTI_Volume_Percentile(
			String miFID_Post_Trade_SSTI_Volume_Percentile) {
		MiFID_Post_Trade_SSTI_Volume_Percentile = miFID_Post_Trade_SSTI_Volume_Percentile;
	}

	public String getMiFID_Post_Trade_SSTI_Volume_Percentile__Change_Flag() {
		return MiFID_Post_Trade_SSTI_Volume_Percentile__Change_Flag;
	}

	public void setMiFID_Post_Trade_SSTI_Volume_Percentile__Change_Flag(
			String miFID_Post_Trade_SSTI_Volume_Percentile__Change_Flag) {
		MiFID_Post_Trade_SSTI_Volume_Percentile__Change_Flag = miFID_Post_Trade_SSTI_Volume_Percentile__Change_Flag;
	}

	public String getMiFID_Post_Trade_SSTI_Volume_Percentile__Previous() {
		return MiFID_Post_Trade_SSTI_Volume_Percentile__Previous;
	}

	public void setMiFID_Post_Trade_SSTI_Volume_Percentile__Previous(
			String miFID_Post_Trade_SSTI_Volume_Percentile__Previous) {
		MiFID_Post_Trade_SSTI_Volume_Percentile__Previous = miFID_Post_Trade_SSTI_Volume_Percentile__Previous;
	}

	public String getMiFID_Pre_Trade_LIS_Threshold_Floor() {
		return MiFID_Pre_Trade_LIS_Threshold_Floor;
	}

	public void setMiFID_Pre_Trade_LIS_Threshold_Floor(
			String miFID_Pre_Trade_LIS_Threshold_Floor) {
		MiFID_Pre_Trade_LIS_Threshold_Floor = miFID_Pre_Trade_LIS_Threshold_Floor;
	}

	public String getMiFID_Pre_Trade_LIS_Threshold_Floor__Change_Flag() {
		return MiFID_Pre_Trade_LIS_Threshold_Floor__Change_Flag;
	}

	public void setMiFID_Pre_Trade_LIS_Threshold_Floor__Change_Flag(
			String miFID_Pre_Trade_LIS_Threshold_Floor__Change_Flag) {
		MiFID_Pre_Trade_LIS_Threshold_Floor__Change_Flag = miFID_Pre_Trade_LIS_Threshold_Floor__Change_Flag;
	}

	public String getMiFID_Pre_Trade_LIS_Threshold_Floor__Previous() {
		return MiFID_Pre_Trade_LIS_Threshold_Floor__Previous;
	}

	public void setMiFID_Pre_Trade_LIS_Threshold_Floor__Previous(
			String miFID_Pre_Trade_LIS_Threshold_Floor__Previous) {
		MiFID_Pre_Trade_LIS_Threshold_Floor__Previous = miFID_Pre_Trade_LIS_Threshold_Floor__Previous;
	}

	public String getMiFID_Pre_Trade_LIS_Threshold_Value() {
		return MiFID_Pre_Trade_LIS_Threshold_Value;
	}

	public void setMiFID_Pre_Trade_LIS_Threshold_Value(
			String miFID_Pre_Trade_LIS_Threshold_Value) {
		MiFID_Pre_Trade_LIS_Threshold_Value = miFID_Pre_Trade_LIS_Threshold_Value;
	}

	public String getMiFID_Pre_Trade_LIS_Threshold_Value__Change_Flag() {
		return MiFID_Pre_Trade_LIS_Threshold_Value__Change_Flag;
	}

	public void setMiFID_Pre_Trade_LIS_Threshold_Value__Change_Flag(
			String miFID_Pre_Trade_LIS_Threshold_Value__Change_Flag) {
		MiFID_Pre_Trade_LIS_Threshold_Value__Change_Flag = miFID_Pre_Trade_LIS_Threshold_Value__Change_Flag;
	}

	public String getMiFID_Pre_Trade_LIS_Threshold_Value__Previous() {
		return MiFID_Pre_Trade_LIS_Threshold_Value__Previous;
	}

	public void setMiFID_Pre_Trade_LIS_Threshold_Value__Previous(
			String miFID_Pre_Trade_LIS_Threshold_Value__Previous) {
		MiFID_Pre_Trade_LIS_Threshold_Value__Previous = miFID_Pre_Trade_LIS_Threshold_Value__Previous;
	}

	public String getMiFID_Pre_Trade_LIS_Trade_Percentile() {
		return MiFID_Pre_Trade_LIS_Trade_Percentile;
	}

	public void setMiFID_Pre_Trade_LIS_Trade_Percentile(
			String miFID_Pre_Trade_LIS_Trade_Percentile) {
		MiFID_Pre_Trade_LIS_Trade_Percentile = miFID_Pre_Trade_LIS_Trade_Percentile;
	}

	public String getMiFID_Pre_Trade_LIS_Trade_Percentile__Change_Flag() {
		return MiFID_Pre_Trade_LIS_Trade_Percentile__Change_Flag;
	}

	public void setMiFID_Pre_Trade_LIS_Trade_Percentile__Change_Flag(
			String miFID_Pre_Trade_LIS_Trade_Percentile__Change_Flag) {
		MiFID_Pre_Trade_LIS_Trade_Percentile__Change_Flag = miFID_Pre_Trade_LIS_Trade_Percentile__Change_Flag;
	}

	public String getMiFID_Pre_Trade_LIS_Trade_Percentile__Previous() {
		return MiFID_Pre_Trade_LIS_Trade_Percentile__Previous;
	}

	public void setMiFID_Pre_Trade_LIS_Trade_Percentile__Previous(
			String miFID_Pre_Trade_LIS_Trade_Percentile__Previous) {
		MiFID_Pre_Trade_LIS_Trade_Percentile__Previous = miFID_Pre_Trade_LIS_Trade_Percentile__Previous;
	}

	public String getMiFID_Pre_Trade_SSTI_Threshold_Floor() {
		return MiFID_Pre_Trade_SSTI_Threshold_Floor;
	}

	public void setMiFID_Pre_Trade_SSTI_Threshold_Floor(
			String miFID_Pre_Trade_SSTI_Threshold_Floor) {
		MiFID_Pre_Trade_SSTI_Threshold_Floor = miFID_Pre_Trade_SSTI_Threshold_Floor;
	}

	public String getMiFID_Pre_Trade_SSTI_Threshold_Floor__Change_Flag() {
		return MiFID_Pre_Trade_SSTI_Threshold_Floor__Change_Flag;
	}

	public void setMiFID_Pre_Trade_SSTI_Threshold_Floor__Change_Flag(
			String miFID_Pre_Trade_SSTI_Threshold_Floor__Change_Flag) {
		MiFID_Pre_Trade_SSTI_Threshold_Floor__Change_Flag = miFID_Pre_Trade_SSTI_Threshold_Floor__Change_Flag;
	}

	public String getMiFID_Pre_Trade_SSTI_Threshold_Floor__Previous() {
		return MiFID_Pre_Trade_SSTI_Threshold_Floor__Previous;
	}

	public void setMiFID_Pre_Trade_SSTI_Threshold_Floor__Previous(
			String miFID_Pre_Trade_SSTI_Threshold_Floor__Previous) {
		MiFID_Pre_Trade_SSTI_Threshold_Floor__Previous = miFID_Pre_Trade_SSTI_Threshold_Floor__Previous;
	}

	public String getMiFID_Pre_Trade_SSTI_Threshold_Value() {
		return MiFID_Pre_Trade_SSTI_Threshold_Value;
	}

	public void setMiFID_Pre_Trade_SSTI_Threshold_Value(
			String miFID_Pre_Trade_SSTI_Threshold_Value) {
		MiFID_Pre_Trade_SSTI_Threshold_Value = miFID_Pre_Trade_SSTI_Threshold_Value;
	}

	public String getMiFID_Pre_Trade_SSTI_Threshold_Value__Change_Flag() {
		return MiFID_Pre_Trade_SSTI_Threshold_Value__Change_Flag;
	}

	public void setMiFID_Pre_Trade_SSTI_Threshold_Value__Change_Flag(
			String miFID_Pre_Trade_SSTI_Threshold_Value__Change_Flag) {
		MiFID_Pre_Trade_SSTI_Threshold_Value__Change_Flag = miFID_Pre_Trade_SSTI_Threshold_Value__Change_Flag;
	}

	public String getMiFID_Pre_Trade_SSTI_Threshold_Value__Previous() {
		return MiFID_Pre_Trade_SSTI_Threshold_Value__Previous;
	}

	public void setMiFID_Pre_Trade_SSTI_Threshold_Value__Previous(
			String miFID_Pre_Trade_SSTI_Threshold_Value__Previous) {
		MiFID_Pre_Trade_SSTI_Threshold_Value__Previous = miFID_Pre_Trade_SSTI_Threshold_Value__Previous;
	}

	public String getMiFID_Pre_Trade_SSTI_Trade_Percentile() {
		return MiFID_Pre_Trade_SSTI_Trade_Percentile;
	}

	public void setMiFID_Pre_Trade_SSTI_Trade_Percentile(
			String miFID_Pre_Trade_SSTI_Trade_Percentile) {
		MiFID_Pre_Trade_SSTI_Trade_Percentile = miFID_Pre_Trade_SSTI_Trade_Percentile;
	}

	public String getMiFID_Pre_Trade_SSTI_Trade_Percentile__Change_Flag() {
		return MiFID_Pre_Trade_SSTI_Trade_Percentile__Change_Flag;
	}

	public void setMiFID_Pre_Trade_SSTI_Trade_Percentile__Change_Flag(
			String miFID_Pre_Trade_SSTI_Trade_Percentile__Change_Flag) {
		MiFID_Pre_Trade_SSTI_Trade_Percentile__Change_Flag = miFID_Pre_Trade_SSTI_Trade_Percentile__Change_Flag;
	}

	public String getMiFID_Pre_Trade_SSTI_Trade_Percentile__Previous() {
		return MiFID_Pre_Trade_SSTI_Trade_Percentile__Previous;
	}

	public void setMiFID_Pre_Trade_SSTI_Trade_Percentile__Previous(
			String miFID_Pre_Trade_SSTI_Trade_Percentile__Previous) {
		MiFID_Pre_Trade_SSTI_Trade_Percentile__Previous = miFID_Pre_Trade_SSTI_Trade_Percentile__Previous;
	}

	public String getMiFID_Primary_Market() {
		return MiFID_Primary_Market;
	}

	public void setMiFID_Primary_Market(String miFID_Primary_Market) {
		MiFID_Primary_Market = miFID_Primary_Market;
	}

	public String getMiFID_Primary_Market__Change_Flag() {
		return MiFID_Primary_Market__Change_Flag;
	}

	public void setMiFID_Primary_Market__Change_Flag(
			String miFID_Primary_Market__Change_Flag) {
		MiFID_Primary_Market__Change_Flag = miFID_Primary_Market__Change_Flag;
	}

	public String getMiFID_Primary_Market__Previous() {
		return MiFID_Primary_Market__Previous;
	}

	public void setMiFID_Primary_Market__Previous(
			String miFID_Primary_Market__Previous) {
		MiFID_Primary_Market__Previous = miFID_Primary_Market__Previous;
	}

	public String getMiFID_Regulated() {
		return MiFID_Regulated;
	}

	public void setMiFID_Regulated(String miFID_Regulated) {
		MiFID_Regulated = miFID_Regulated;
	}

	public String getMiFID_Regulated__Change_Flag() {
		return MiFID_Regulated__Change_Flag;
	}

	public void setMiFID_Regulated__Change_Flag(
			String miFID_Regulated__Change_Flag) {
		MiFID_Regulated__Change_Flag = miFID_Regulated__Change_Flag;
	}

	public String getMiFID_Regulated__ESMA() {
		return MiFID_Regulated__ESMA;
	}

	public void setMiFID_Regulated__ESMA(String miFID_Regulated__ESMA) {
		MiFID_Regulated__ESMA = miFID_Regulated__ESMA;
	}

	public String getMiFID_Regulated__ESMA__Change_Flag() {
		return MiFID_Regulated__ESMA__Change_Flag;
	}

	public void setMiFID_Regulated__ESMA__Change_Flag(
			String miFID_Regulated__ESMA__Change_Flag) {
		MiFID_Regulated__ESMA__Change_Flag = miFID_Regulated__ESMA__Change_Flag;
	}

	public String getMiFID_Regulated__ESMA__Previous() {
		return MiFID_Regulated__ESMA__Previous;
	}

	public void setMiFID_Regulated__ESMA__Previous(
			String miFID_Regulated__ESMA__Previous) {
		MiFID_Regulated__ESMA__Previous = miFID_Regulated__ESMA__Previous;
	}

	public String getMiFID_Regulated__Previous() {
		return MiFID_Regulated__Previous;
	}

	public void setMiFID_Regulated__Previous(String miFID_Regulated__Previous) {
		MiFID_Regulated__Previous = miFID_Regulated__Previous;
	}

	public String getMiFID_Series() {
		return MiFID_Series;
	}

	public void setMiFID_Series(String miFID_Series) {
		MiFID_Series = miFID_Series;
	}

	public String getMiFID_Series__Change_Flag() {
		return MiFID_Series__Change_Flag;
	}

	public void setMiFID_Series__Change_Flag(String miFID_Series__Change_Flag) {
		MiFID_Series__Change_Flag = miFID_Series__Change_Flag;
	}

	public String getMiFID_Series__Previous() {
		return MiFID_Series__Previous;
	}

	public void setMiFID_Series__Previous(String miFID_Series__Previous) {
		MiFID_Series__Previous = miFID_Series__Previous;
	}

	public String getMiFID_Standard_Market_Size__ESMA() {
		return MiFID_Standard_Market_Size__ESMA;
	}

	public void setMiFID_Standard_Market_Size__ESMA(
			String miFID_Standard_Market_Size__ESMA) {
		MiFID_Standard_Market_Size__ESMA = miFID_Standard_Market_Size__ESMA;
	}

	public String getMiFID_Standard_Market_Size__ESMA__Change_Flag() {
		return MiFID_Standard_Market_Size__ESMA__Change_Flag;
	}

	public void setMiFID_Standard_Market_Size__ESMA__Change_Flag(
			String miFID_Standard_Market_Size__ESMA__Change_Flag) {
		MiFID_Standard_Market_Size__ESMA__Change_Flag = miFID_Standard_Market_Size__ESMA__Change_Flag;
	}

	public String getMiFID_Standard_Market_Size__ESMA__Previous() {
		return MiFID_Standard_Market_Size__ESMA__Previous;
	}

	public void setMiFID_Standard_Market_Size__ESMA__Previous(
			String miFID_Standard_Market_Size__ESMA__Previous) {
		MiFID_Standard_Market_Size__ESMA__Previous = miFID_Standard_Market_Size__ESMA__Previous;
	}

	public String getMiFID_Standard_Market_Size_Currency_Code() {
		return MiFID_Standard_Market_Size_Currency_Code;
	}

	public void setMiFID_Standard_Market_Size_Currency_Code(
			String miFID_Standard_Market_Size_Currency_Code) {
		MiFID_Standard_Market_Size_Currency_Code = miFID_Standard_Market_Size_Currency_Code;
	}

	public String getMiFID_Standard_Market_Size_Currency_Code__Change_Flag() {
		return MiFID_Standard_Market_Size_Currency_Code__Change_Flag;
	}

	public void setMiFID_Standard_Market_Size_Currency_Code__Change_Flag(
			String miFID_Standard_Market_Size_Currency_Code__Change_Flag) {
		MiFID_Standard_Market_Size_Currency_Code__Change_Flag = miFID_Standard_Market_Size_Currency_Code__Change_Flag;
	}

	public String getMiFID_Standard_Market_Size_Currency_Code__Previous() {
		return MiFID_Standard_Market_Size_Currency_Code__Previous;
	}

	public void setMiFID_Standard_Market_Size_Currency_Code__Previous(
			String miFID_Standard_Market_Size_Currency_Code__Previous) {
		MiFID_Standard_Market_Size_Currency_Code__Previous = miFID_Standard_Market_Size_Currency_Code__Previous;
	}

	public String getMiFID_Sub_Product() {
		return MiFID_Sub_Product;
	}

	public void setMiFID_Sub_Product(String miFID_Sub_Product) {
		MiFID_Sub_Product = miFID_Sub_Product;
	}

	public String getMiFID_Sub_Product__Change_Flag() {
		return MiFID_Sub_Product__Change_Flag;
	}

	public void setMiFID_Sub_Product__Change_Flag(
			String miFID_Sub_Product__Change_Flag) {
		MiFID_Sub_Product__Change_Flag = miFID_Sub_Product__Change_Flag;
	}

	public String getMiFID_Sub_Product__ESMA() {
		return MiFID_Sub_Product__ESMA;
	}

	public void setMiFID_Sub_Product__ESMA(String miFID_Sub_Product__ESMA) {
		MiFID_Sub_Product__ESMA = miFID_Sub_Product__ESMA;
	}

	public String getMiFID_Sub_Product__ESMA__Change_Flag() {
		return MiFID_Sub_Product__ESMA__Change_Flag;
	}

	public void setMiFID_Sub_Product__ESMA__Change_Flag(
			String miFID_Sub_Product__ESMA__Change_Flag) {
		MiFID_Sub_Product__ESMA__Change_Flag = miFID_Sub_Product__ESMA__Change_Flag;
	}

	public String getMiFID_Sub_Product__ESMA__Previous() {
		return MiFID_Sub_Product__ESMA__Previous;
	}

	public void setMiFID_Sub_Product__ESMA__Previous(
			String miFID_Sub_Product__ESMA__Previous) {
		MiFID_Sub_Product__ESMA__Previous = miFID_Sub_Product__ESMA__Previous;
	}

	public String getMiFID_Sub_Product__Previous() {
		return MiFID_Sub_Product__Previous;
	}

	public void setMiFID_Sub_Product__Previous(
			String miFID_Sub_Product__Previous) {
		MiFID_Sub_Product__Previous = miFID_Sub_Product__Previous;
	}

	public String getMiFID_SubAsset_Class() {
		return MiFID_SubAsset_Class;
	}

	public void setMiFID_SubAsset_Class(String miFID_SubAsset_Class) {
		MiFID_SubAsset_Class = miFID_SubAsset_Class;
	}

	public String getMiFID_SubAsset_Class__Change_Flag() {
		return MiFID_SubAsset_Class__Change_Flag;
	}

	public void setMiFID_SubAsset_Class__Change_Flag(
			String miFID_SubAsset_Class__Change_Flag) {
		MiFID_SubAsset_Class__Change_Flag = miFID_SubAsset_Class__Change_Flag;
	}

	public String getMiFID_SubAsset_Class__Previous() {
		return MiFID_SubAsset_Class__Previous;
	}

	public void setMiFID_SubAsset_Class__Previous(
			String miFID_SubAsset_Class__Previous) {
		MiFID_SubAsset_Class__Previous = miFID_SubAsset_Class__Previous;
	}

	public String getMiFID_SubAsset_Class_Perm_ID() {
		return MiFID_SubAsset_Class_Perm_ID;
	}

	public void setMiFID_SubAsset_Class_Perm_ID(
			String miFID_SubAsset_Class_Perm_ID) {
		MiFID_SubAsset_Class_Perm_ID = miFID_SubAsset_Class_Perm_ID;
	}

	public String getMiFID_SubAsset_Class_Perm_ID__Change_Flag() {
		return MiFID_SubAsset_Class_Perm_ID__Change_Flag;
	}

	public void setMiFID_SubAsset_Class_Perm_ID__Change_Flag(
			String miFID_SubAsset_Class_Perm_ID__Change_Flag) {
		MiFID_SubAsset_Class_Perm_ID__Change_Flag = miFID_SubAsset_Class_Perm_ID__Change_Flag;
	}

	public String getMiFID_SubAsset_Class_Perm_ID__Previous() {
		return MiFID_SubAsset_Class_Perm_ID__Previous;
	}

	public void setMiFID_SubAsset_Class_Perm_ID__Previous(
			String miFID_SubAsset_Class_Perm_ID__Previous) {
		MiFID_SubAsset_Class_Perm_ID__Previous = miFID_SubAsset_Class_Perm_ID__Previous;
	}

	public String getMiFID_SubClass_Effective_Date() {
		return MiFID_SubClass_Effective_Date;
	}

	public void setMiFID_SubClass_Effective_Date(
			String miFID_SubClass_Effective_Date) {
		MiFID_SubClass_Effective_Date = miFID_SubClass_Effective_Date;
	}

	public String getMiFID_SubClass_Effective_Date__Change_Flag() {
		return MiFID_SubClass_Effective_Date__Change_Flag;
	}

	public void setMiFID_SubClass_Effective_Date__Change_Flag(
			String miFID_SubClass_Effective_Date__Change_Flag) {
		MiFID_SubClass_Effective_Date__Change_Flag = miFID_SubClass_Effective_Date__Change_Flag;
	}

	public String getMiFID_SubClass_Effective_Date__Previous() {
		return MiFID_SubClass_Effective_Date__Previous;
	}

	public void setMiFID_SubClass_Effective_Date__Previous(
			String miFID_SubClass_Effective_Date__Previous) {
		MiFID_SubClass_Effective_Date__Previous = miFID_SubClass_Effective_Date__Previous;
	}

	public String getMiFID_SubClass_End_Date() {
		return MiFID_SubClass_End_Date;
	}

	public void setMiFID_SubClass_End_Date(String miFID_SubClass_End_Date) {
		MiFID_SubClass_End_Date = miFID_SubClass_End_Date;
	}

	public String getMiFID_SubClass_End_Date__Change_Flag() {
		return MiFID_SubClass_End_Date__Change_Flag;
	}

	public void setMiFID_SubClass_End_Date__Change_Flag(
			String miFID_SubClass_End_Date__Change_Flag) {
		MiFID_SubClass_End_Date__Change_Flag = miFID_SubClass_End_Date__Change_Flag;
	}

	public String getMiFID_SubClass_End_Date__Previous() {
		return MiFID_SubClass_End_Date__Previous;
	}

	public void setMiFID_SubClass_End_Date__Previous(
			String miFID_SubClass_End_Date__Previous) {
		MiFID_SubClass_End_Date__Previous = miFID_SubClass_End_Date__Previous;
	}

	public String getMiFID_SubClass_Perm_ID() {
		return MiFID_SubClass_Perm_ID;
	}

	public void setMiFID_SubClass_Perm_ID(String miFID_SubClass_Perm_ID) {
		MiFID_SubClass_Perm_ID = miFID_SubClass_Perm_ID;
	}

	public String getMiFID_SubClass_Perm_ID__Change_Flag() {
		return MiFID_SubClass_Perm_ID__Change_Flag;
	}

	public void setMiFID_SubClass_Perm_ID__Change_Flag(
			String miFID_SubClass_Perm_ID__Change_Flag) {
		MiFID_SubClass_Perm_ID__Change_Flag = miFID_SubClass_Perm_ID__Change_Flag;
	}

	public String getMiFID_SubClass_Perm_ID__Previous() {
		return MiFID_SubClass_Perm_ID__Previous;
	}

	public void setMiFID_SubClass_Perm_ID__Previous(
			String miFID_SubClass_Perm_ID__Previous) {
		MiFID_SubClass_Perm_ID__Previous = miFID_SubClass_Perm_ID__Previous;
	}

	public String getMiFID_Termination_Date() {
		return MiFID_Termination_Date;
	}

	public void setMiFID_Termination_Date(String miFID_Termination_Date) {
		MiFID_Termination_Date = miFID_Termination_Date;
	}

	public String getMiFID_Termination_Date__Change_Flag() {
		return MiFID_Termination_Date__Change_Flag;
	}

	public void setMiFID_Termination_Date__Change_Flag(
			String miFID_Termination_Date__Change_Flag) {
		MiFID_Termination_Date__Change_Flag = miFID_Termination_Date__Change_Flag;
	}

	public String getMiFID_Termination_Date__ESMA() {
		return MiFID_Termination_Date__ESMA;
	}

	public void setMiFID_Termination_Date__ESMA(
			String miFID_Termination_Date__ESMA) {
		MiFID_Termination_Date__ESMA = miFID_Termination_Date__ESMA;
	}

	public String getMiFID_Termination_Date__ESMA__Change_Flag() {
		return MiFID_Termination_Date__ESMA__Change_Flag;
	}

	public void setMiFID_Termination_Date__ESMA__Change_Flag(
			String miFID_Termination_Date__ESMA__Change_Flag) {
		MiFID_Termination_Date__ESMA__Change_Flag = miFID_Termination_Date__ESMA__Change_Flag;
	}

	public String getMiFID_Termination_Date__ESMA__Previous() {
		return MiFID_Termination_Date__ESMA__Previous;
	}

	public void setMiFID_Termination_Date__ESMA__Previous(
			String miFID_Termination_Date__ESMA__Previous) {
		MiFID_Termination_Date__ESMA__Previous = miFID_Termination_Date__ESMA__Previous;
	}

	public String getMiFID_Termination_Date__Previous() {
		return MiFID_Termination_Date__Previous;
	}

	public void setMiFID_Termination_Date__Previous(
			String miFID_Termination_Date__Previous) {
		MiFID_Termination_Date__Previous = miFID_Termination_Date__Previous;
	}

	public String getMiFID_Threshold_Effective_Date() {
		return MiFID_Threshold_Effective_Date;
	}

	public void setMiFID_Threshold_Effective_Date(
			String miFID_Threshold_Effective_Date) {
		MiFID_Threshold_Effective_Date = miFID_Threshold_Effective_Date;
	}

	public String getMiFID_Threshold_Effective_Date__Change_Flag() {
		return MiFID_Threshold_Effective_Date__Change_Flag;
	}

	public void setMiFID_Threshold_Effective_Date__Change_Flag(
			String miFID_Threshold_Effective_Date__Change_Flag) {
		MiFID_Threshold_Effective_Date__Change_Flag = miFID_Threshold_Effective_Date__Change_Flag;
	}

	public String getMiFID_Threshold_Effective_Date__Previous() {
		return MiFID_Threshold_Effective_Date__Previous;
	}

	public void setMiFID_Threshold_Effective_Date__Previous(
			String miFID_Threshold_Effective_Date__Previous) {
		MiFID_Threshold_Effective_Date__Previous = miFID_Threshold_Effective_Date__Previous;
	}

	public String getMiFID_Threshold_End_Date() {
		return MiFID_Threshold_End_Date;
	}

	public void setMiFID_Threshold_End_Date(String miFID_Threshold_End_Date) {
		MiFID_Threshold_End_Date = miFID_Threshold_End_Date;
	}

	public String getMiFID_Threshold_End_Date__Change_Flag() {
		return MiFID_Threshold_End_Date__Change_Flag;
	}

	public void setMiFID_Threshold_End_Date__Change_Flag(
			String miFID_Threshold_End_Date__Change_Flag) {
		MiFID_Threshold_End_Date__Change_Flag = miFID_Threshold_End_Date__Change_Flag;
	}

	public String getMiFID_Threshold_End_Date__Previous() {
		return MiFID_Threshold_End_Date__Previous;
	}

	public void setMiFID_Threshold_End_Date__Previous(
			String miFID_Threshold_End_Date__Previous) {
		MiFID_Threshold_End_Date__Previous = miFID_Threshold_End_Date__Previous;
	}

	public String getMiFID_Total_Market_Volume__ESMA() {
		return MiFID_Total_Market_Volume__ESMA;
	}

	public void setMiFID_Total_Market_Volume__ESMA(
			String miFID_Total_Market_Volume__ESMA) {
		MiFID_Total_Market_Volume__ESMA = miFID_Total_Market_Volume__ESMA;
	}

	public String getMiFID_Total_Market_Volume__ESMA__Change_Flag() {
		return MiFID_Total_Market_Volume__ESMA__Change_Flag;
	}

	public void setMiFID_Total_Market_Volume__ESMA__Change_Flag(
			String miFID_Total_Market_Volume__ESMA__Change_Flag) {
		MiFID_Total_Market_Volume__ESMA__Change_Flag = miFID_Total_Market_Volume__ESMA__Change_Flag;
	}

	public String getMiFID_Total_Market_Volume__ESMA__Previous() {
		return MiFID_Total_Market_Volume__ESMA__Previous;
	}

	public void setMiFID_Total_Market_Volume__ESMA__Previous(
			String miFID_Total_Market_Volume__ESMA__Previous) {
		MiFID_Total_Market_Volume__ESMA__Previous = miFID_Total_Market_Volume__ESMA__Previous;
	}

	public String getMiFID_Total_Market_Volume_Date__ESMA() {
		return MiFID_Total_Market_Volume_Date__ESMA;
	}

	public void setMiFID_Total_Market_Volume_Date__ESMA(
			String miFID_Total_Market_Volume_Date__ESMA) {
		MiFID_Total_Market_Volume_Date__ESMA = miFID_Total_Market_Volume_Date__ESMA;
	}

	public String getMiFID_Total_Market_Volume_Date__ESMA__Change_Flag() {
		return MiFID_Total_Market_Volume_Date__ESMA__Change_Flag;
	}

	public void setMiFID_Total_Market_Volume_Date__ESMA__Change_Flag(
			String miFID_Total_Market_Volume_Date__ESMA__Change_Flag) {
		MiFID_Total_Market_Volume_Date__ESMA__Change_Flag = miFID_Total_Market_Volume_Date__ESMA__Change_Flag;
	}

	public String getMiFID_Total_Market_Volume_Date__ESMA__Previous() {
		return MiFID_Total_Market_Volume_Date__ESMA__Previous;
	}

	public void setMiFID_Total_Market_Volume_Date__ESMA__Previous(
			String miFID_Total_Market_Volume_Date__ESMA__Previous) {
		MiFID_Total_Market_Volume_Date__ESMA__Previous = miFID_Total_Market_Volume_Date__ESMA__Previous;
	}

	public String getMiFID_Total_Number_of_Transactions__ESMA() {
		return MiFID_Total_Number_of_Transactions__ESMA;
	}

	public void setMiFID_Total_Number_of_Transactions__ESMA(
			String miFID_Total_Number_of_Transactions__ESMA) {
		MiFID_Total_Number_of_Transactions__ESMA = miFID_Total_Number_of_Transactions__ESMA;
	}

	public String getMiFID_Total_Number_of_Transactions__ESMA__Change_Flag() {
		return MiFID_Total_Number_of_Transactions__ESMA__Change_Flag;
	}

	public void setMiFID_Total_Number_of_Transactions__ESMA__Change_Flag(
			String miFID_Total_Number_of_Transactions__ESMA__Change_Flag) {
		MiFID_Total_Number_of_Transactions__ESMA__Change_Flag = miFID_Total_Number_of_Transactions__ESMA__Change_Flag;
	}

	public String getMiFID_Total_Number_of_Transactions__ESMA__Previous() {
		return MiFID_Total_Number_of_Transactions__ESMA__Previous;
	}

	public void setMiFID_Total_Number_of_Transactions__ESMA__Previous(
			String miFID_Total_Number_of_Transactions__ESMA__Previous) {
		MiFID_Total_Number_of_Transactions__ESMA__Previous = miFID_Total_Number_of_Transactions__ESMA__Previous;
	}

	public String getMiFID_Total_Number_of_Transactions_Date__ESMA() {
		return MiFID_Total_Number_of_Transactions_Date__ESMA;
	}

	public void setMiFID_Total_Number_of_Transactions_Date__ESMA(
			String miFID_Total_Number_of_Transactions_Date__ESMA) {
		MiFID_Total_Number_of_Transactions_Date__ESMA = miFID_Total_Number_of_Transactions_Date__ESMA;
	}

	public String getMiFID_Total_Number_of_Transactions_Date__ESMA__Change_Flag() {
		return MiFID_Total_Number_of_Transactions_Date__ESMA__Change_Flag;
	}

	public void setMiFID_Total_Number_of_Transactions_Date__ESMA__Change_Flag(
			String miFID_Total_Number_of_Transactions_Date__ESMA__Change_Flag) {
		MiFID_Total_Number_of_Transactions_Date__ESMA__Change_Flag = miFID_Total_Number_of_Transactions_Date__ESMA__Change_Flag;
	}

	public String getMiFID_Total_Number_of_Transactions_Date__ESMA__Previous() {
		return MiFID_Total_Number_of_Transactions_Date__ESMA__Previous;
	}

	public void setMiFID_Total_Number_of_Transactions_Date__ESMA__Previous(
			String miFID_Total_Number_of_Transactions_Date__ESMA__Previous) {
		MiFID_Total_Number_of_Transactions_Date__ESMA__Previous = miFID_Total_Number_of_Transactions_Date__ESMA__Previous;
	}

	public String getMiFID_Trade_Obligation_Effective_Date() {
		return MiFID_Trade_Obligation_Effective_Date;
	}

	public void setMiFID_Trade_Obligation_Effective_Date(
			String miFID_Trade_Obligation_Effective_Date) {
		MiFID_Trade_Obligation_Effective_Date = miFID_Trade_Obligation_Effective_Date;
	}

	public String getMiFID_Trade_Obligation_Effective_Date__Change_Flag() {
		return MiFID_Trade_Obligation_Effective_Date__Change_Flag;
	}

	public void setMiFID_Trade_Obligation_Effective_Date__Change_Flag(
			String miFID_Trade_Obligation_Effective_Date__Change_Flag) {
		MiFID_Trade_Obligation_Effective_Date__Change_Flag = miFID_Trade_Obligation_Effective_Date__Change_Flag;
	}

	public String getMiFID_Trade_Obligation_Effective_Date__Previous() {
		return MiFID_Trade_Obligation_Effective_Date__Previous;
	}

	public void setMiFID_Trade_Obligation_Effective_Date__Previous(
			String miFID_Trade_Obligation_Effective_Date__Previous) {
		MiFID_Trade_Obligation_Effective_Date__Previous = miFID_Trade_Obligation_Effective_Date__Previous;
	}

	public String getMiFID_Trade_Obligation_Flag() {
		return MiFID_Trade_Obligation_Flag;
	}

	public void setMiFID_Trade_Obligation_Flag(
			String miFID_Trade_Obligation_Flag) {
		MiFID_Trade_Obligation_Flag = miFID_Trade_Obligation_Flag;
	}

	public String getMiFID_Trade_Obligation_Flag__Change_Flag() {
		return MiFID_Trade_Obligation_Flag__Change_Flag;
	}

	public void setMiFID_Trade_Obligation_Flag__Change_Flag(
			String miFID_Trade_Obligation_Flag__Change_Flag) {
		MiFID_Trade_Obligation_Flag__Change_Flag = miFID_Trade_Obligation_Flag__Change_Flag;
	}

	public String getMiFID_Trade_Obligation_Flag__Previous() {
		return MiFID_Trade_Obligation_Flag__Previous;
	}

	public void setMiFID_Trade_Obligation_Flag__Previous(
			String miFID_Trade_Obligation_Flag__Previous) {
		MiFID_Trade_Obligation_Flag__Previous = miFID_Trade_Obligation_Flag__Previous;
	}

	public String getMiFID_Trading_Admission_Approval_Date() {
		return MiFID_Trading_Admission_Approval_Date;
	}

	public void setMiFID_Trading_Admission_Approval_Date(
			String miFID_Trading_Admission_Approval_Date) {
		MiFID_Trading_Admission_Approval_Date = miFID_Trading_Admission_Approval_Date;
	}

	public String getMiFID_Trading_Admission_Approval_Date__Change_Flag() {
		return MiFID_Trading_Admission_Approval_Date__Change_Flag;
	}

	public void setMiFID_Trading_Admission_Approval_Date__Change_Flag(
			String miFID_Trading_Admission_Approval_Date__Change_Flag) {
		MiFID_Trading_Admission_Approval_Date__Change_Flag = miFID_Trading_Admission_Approval_Date__Change_Flag;
	}

	public String getMiFID_Trading_Admission_Approval_Date__ESMA() {
		return MiFID_Trading_Admission_Approval_Date__ESMA;
	}

	public void setMiFID_Trading_Admission_Approval_Date__ESMA(
			String miFID_Trading_Admission_Approval_Date__ESMA) {
		MiFID_Trading_Admission_Approval_Date__ESMA = miFID_Trading_Admission_Approval_Date__ESMA;
	}

	public String getMiFID_Trading_Admission_Approval_Date__ESMA__Change_Flag() {
		return MiFID_Trading_Admission_Approval_Date__ESMA__Change_Flag;
	}

	public void setMiFID_Trading_Admission_Approval_Date__ESMA__Change_Flag(
			String miFID_Trading_Admission_Approval_Date__ESMA__Change_Flag) {
		MiFID_Trading_Admission_Approval_Date__ESMA__Change_Flag = miFID_Trading_Admission_Approval_Date__ESMA__Change_Flag;
	}

	public String getMiFID_Trading_Admission_Approval_Date__ESMA__Previous() {
		return MiFID_Trading_Admission_Approval_Date__ESMA__Previous;
	}

	public void setMiFID_Trading_Admission_Approval_Date__ESMA__Previous(
			String miFID_Trading_Admission_Approval_Date__ESMA__Previous) {
		MiFID_Trading_Admission_Approval_Date__ESMA__Previous = miFID_Trading_Admission_Approval_Date__ESMA__Previous;
	}

	public String getMiFID_Trading_Admission_Approval_Date__Previous() {
		return MiFID_Trading_Admission_Approval_Date__Previous;
	}

	public void setMiFID_Trading_Admission_Approval_Date__Previous(
			String miFID_Trading_Admission_Approval_Date__Previous) {
		MiFID_Trading_Admission_Approval_Date__Previous = miFID_Trading_Admission_Approval_Date__Previous;
	}

	public String getMiFID_Trading_Admission_Request_Date() {
		return MiFID_Trading_Admission_Request_Date;
	}

	public void setMiFID_Trading_Admission_Request_Date(
			String miFID_Trading_Admission_Request_Date) {
		MiFID_Trading_Admission_Request_Date = miFID_Trading_Admission_Request_Date;
	}

	public String getMiFID_Trading_Admission_Request_Date__Change_Flag() {
		return MiFID_Trading_Admission_Request_Date__Change_Flag;
	}

	public void setMiFID_Trading_Admission_Request_Date__Change_Flag(
			String miFID_Trading_Admission_Request_Date__Change_Flag) {
		MiFID_Trading_Admission_Request_Date__Change_Flag = miFID_Trading_Admission_Request_Date__Change_Flag;
	}

	public String getMiFID_Trading_Admission_Request_Date__ESMA() {
		return MiFID_Trading_Admission_Request_Date__ESMA;
	}

	public void setMiFID_Trading_Admission_Request_Date__ESMA(
			String miFID_Trading_Admission_Request_Date__ESMA) {
		MiFID_Trading_Admission_Request_Date__ESMA = miFID_Trading_Admission_Request_Date__ESMA;
	}

	public String getMiFID_Trading_Admission_Request_Date__ESMA__Change_Flag() {
		return MiFID_Trading_Admission_Request_Date__ESMA__Change_Flag;
	}

	public void setMiFID_Trading_Admission_Request_Date__ESMA__Change_Flag(
			String miFID_Trading_Admission_Request_Date__ESMA__Change_Flag) {
		MiFID_Trading_Admission_Request_Date__ESMA__Change_Flag = miFID_Trading_Admission_Request_Date__ESMA__Change_Flag;
	}

	public String getMiFID_Trading_Admission_Request_Date__ESMA__Previous() {
		return MiFID_Trading_Admission_Request_Date__ESMA__Previous;
	}

	public void setMiFID_Trading_Admission_Request_Date__ESMA__Previous(
			String miFID_Trading_Admission_Request_Date__ESMA__Previous) {
		MiFID_Trading_Admission_Request_Date__ESMA__Previous = miFID_Trading_Admission_Request_Date__ESMA__Previous;
	}

	public String getMiFID_Trading_Admission_Request_Date__Previous() {
		return MiFID_Trading_Admission_Request_Date__Previous;
	}

	public void setMiFID_Trading_Admission_Request_Date__Previous(
			String miFID_Trading_Admission_Request_Date__Previous) {
		MiFID_Trading_Admission_Request_Date__Previous = miFID_Trading_Admission_Request_Date__Previous;
	}

	public String getMiFID_Transaction_Type() {
		return MiFID_Transaction_Type;
	}

	public void setMiFID_Transaction_Type(String miFID_Transaction_Type) {
		MiFID_Transaction_Type = miFID_Transaction_Type;
	}

	public String getMiFID_Transaction_Type__Change_Flag() {
		return MiFID_Transaction_Type__Change_Flag;
	}

	public void setMiFID_Transaction_Type__Change_Flag(
			String miFID_Transaction_Type__Change_Flag) {
		MiFID_Transaction_Type__Change_Flag = miFID_Transaction_Type__Change_Flag;
	}

	public String getMiFID_Transaction_Type__ESMA() {
		return MiFID_Transaction_Type__ESMA;
	}

	public void setMiFID_Transaction_Type__ESMA(
			String miFID_Transaction_Type__ESMA) {
		MiFID_Transaction_Type__ESMA = miFID_Transaction_Type__ESMA;
	}

	public String getMiFID_Transaction_Type__ESMA__Change_Flag() {
		return MiFID_Transaction_Type__ESMA__Change_Flag;
	}

	public void setMiFID_Transaction_Type__ESMA__Change_Flag(
			String miFID_Transaction_Type__ESMA__Change_Flag) {
		MiFID_Transaction_Type__ESMA__Change_Flag = miFID_Transaction_Type__ESMA__Change_Flag;
	}

	public String getMiFID_Transaction_Type__ESMA__Previous() {
		return MiFID_Transaction_Type__ESMA__Previous;
	}

	public void setMiFID_Transaction_Type__ESMA__Previous(
			String miFID_Transaction_Type__ESMA__Previous) {
		MiFID_Transaction_Type__ESMA__Previous = miFID_Transaction_Type__ESMA__Previous;
	}

	public String getMiFID_Transaction_Type__Previous() {
		return MiFID_Transaction_Type__Previous;
	}

	public void setMiFID_Transaction_Type__Previous(
			String miFID_Transaction_Type__Previous) {
		MiFID_Transaction_Type__Previous = miFID_Transaction_Type__Previous;
	}

	public String getMiFID_Underlying_Index_Name() {
		return MiFID_Underlying_Index_Name;
	}

	public void setMiFID_Underlying_Index_Name(
			String miFID_Underlying_Index_Name) {
		MiFID_Underlying_Index_Name = miFID_Underlying_Index_Name;
	}

	public String getMiFID_Underlying_Index_Name__Change_Flag() {
		return MiFID_Underlying_Index_Name__Change_Flag;
	}

	public void setMiFID_Underlying_Index_Name__Change_Flag(
			String miFID_Underlying_Index_Name__Change_Flag) {
		MiFID_Underlying_Index_Name__Change_Flag = miFID_Underlying_Index_Name__Change_Flag;
	}

	public String getMiFID_Underlying_Index_Name__ESMA() {
		return MiFID_Underlying_Index_Name__ESMA;
	}

	public void setMiFID_Underlying_Index_Name__ESMA(
			String miFID_Underlying_Index_Name__ESMA) {
		MiFID_Underlying_Index_Name__ESMA = miFID_Underlying_Index_Name__ESMA;
	}

	public String getMiFID_Underlying_Index_Name__ESMA__Change_Flag() {
		return MiFID_Underlying_Index_Name__ESMA__Change_Flag;
	}

	public void setMiFID_Underlying_Index_Name__ESMA__Change_Flag(
			String miFID_Underlying_Index_Name__ESMA__Change_Flag) {
		MiFID_Underlying_Index_Name__ESMA__Change_Flag = miFID_Underlying_Index_Name__ESMA__Change_Flag;
	}

	public String getMiFID_Underlying_Index_Name__ESMA__Previous() {
		return MiFID_Underlying_Index_Name__ESMA__Previous;
	}

	public void setMiFID_Underlying_Index_Name__ESMA__Previous(
			String miFID_Underlying_Index_Name__ESMA__Previous) {
		MiFID_Underlying_Index_Name__ESMA__Previous = miFID_Underlying_Index_Name__ESMA__Previous;
	}

	public String getMiFID_Underlying_Index_Name__Previous() {
		return MiFID_Underlying_Index_Name__Previous;
	}

	public void setMiFID_Underlying_Index_Name__Previous(
			String miFID_Underlying_Index_Name__Previous) {
		MiFID_Underlying_Index_Name__Previous = miFID_Underlying_Index_Name__Previous;
	}

	public String getMiFID_Underlying_Index_Term() {
		return MiFID_Underlying_Index_Term;
	}

	public void setMiFID_Underlying_Index_Term(
			String miFID_Underlying_Index_Term) {
		MiFID_Underlying_Index_Term = miFID_Underlying_Index_Term;
	}

	public String getMiFID_Underlying_Index_Term__Change_Flag() {
		return MiFID_Underlying_Index_Term__Change_Flag;
	}

	public void setMiFID_Underlying_Index_Term__Change_Flag(
			String miFID_Underlying_Index_Term__Change_Flag) {
		MiFID_Underlying_Index_Term__Change_Flag = miFID_Underlying_Index_Term__Change_Flag;
	}

	public String getMiFID_Underlying_Index_Term__ESMA() {
		return MiFID_Underlying_Index_Term__ESMA;
	}

	public void setMiFID_Underlying_Index_Term__ESMA(
			String miFID_Underlying_Index_Term__ESMA) {
		MiFID_Underlying_Index_Term__ESMA = miFID_Underlying_Index_Term__ESMA;
	}

	public String getMiFID_Underlying_Index_Term__ESMA__Change_Flag() {
		return MiFID_Underlying_Index_Term__ESMA__Change_Flag;
	}

	public void setMiFID_Underlying_Index_Term__ESMA__Change_Flag(
			String miFID_Underlying_Index_Term__ESMA__Change_Flag) {
		MiFID_Underlying_Index_Term__ESMA__Change_Flag = miFID_Underlying_Index_Term__ESMA__Change_Flag;
	}

	public String getMiFID_Underlying_Index_Term__ESMA__Previous() {
		return MiFID_Underlying_Index_Term__ESMA__Previous;
	}

	public void setMiFID_Underlying_Index_Term__ESMA__Previous(
			String miFID_Underlying_Index_Term__ESMA__Previous) {
		MiFID_Underlying_Index_Term__ESMA__Previous = miFID_Underlying_Index_Term__ESMA__Previous;
	}

	public String getMiFID_Underlying_Index_Term__Previous() {
		return MiFID_Underlying_Index_Term__Previous;
	}

	public void setMiFID_Underlying_Index_Term__Previous(
			String miFID_Underlying_Index_Term__Previous) {
		MiFID_Underlying_Index_Term__Previous = miFID_Underlying_Index_Term__Previous;
	}

	public String getMiFID_Underlying_Type() {
		return MiFID_Underlying_Type;
	}

	public void setMiFID_Underlying_Type(String miFID_Underlying_Type) {
		MiFID_Underlying_Type = miFID_Underlying_Type;
	}

	public String getMiFID_Underlying_Type__Change_Flag() {
		return MiFID_Underlying_Type__Change_Flag;
	}

	public void setMiFID_Underlying_Type__Change_Flag(
			String miFID_Underlying_Type__Change_Flag) {
		MiFID_Underlying_Type__Change_Flag = miFID_Underlying_Type__Change_Flag;
	}

	public String getMiFID_Underlying_Type__Previous() {
		return MiFID_Underlying_Type__Previous;
	}

	public void setMiFID_Underlying_Type__Previous(
			String miFID_Underlying_Type__Previous) {
		MiFID_Underlying_Type__Previous = miFID_Underlying_Type__Previous;
	}

	public String getMiFID_Version() {
		return MiFID_Version;
	}

	public void setMiFID_Version(String miFID_Version) {
		MiFID_Version = miFID_Version;
	}

	public String getMiFID_Version__Change_Flag() {
		return MiFID_Version__Change_Flag;
	}

	public void setMiFID_Version__Change_Flag(String miFID_Version__Change_Flag) {
		MiFID_Version__Change_Flag = miFID_Version__Change_Flag;
	}

	public String getMiFID_Version__Previous() {
		return MiFID_Version__Previous;
	}

	public void setMiFID_Version__Previous(String miFID_Version__Previous) {
		MiFID_Version__Previous = miFID_Version__Previous;
	}

	public String getMinimum_Denomination() {
		return Minimum_Denomination;
	}

	public void setMinimum_Denomination(String minimum_Denomination) {
		Minimum_Denomination = minimum_Denomination;
	}

	public String getMinimum_Denomination__Change_Flag() {
		return Minimum_Denomination__Change_Flag;
	}

	public void setMinimum_Denomination__Change_Flag(
			String minimum_Denomination__Change_Flag) {
		Minimum_Denomination__Change_Flag = minimum_Denomination__Change_Flag;
	}

	public String getMinimum_Denomination__Previous() {
		return Minimum_Denomination__Previous;
	}

	public void setMinimum_Denomination__Previous(
			String minimum_Denomination__Previous) {
		Minimum_Denomination__Previous = minimum_Denomination__Previous;
	}

	public String getMinimum_Denomination_Complex_Flag() {
		return Minimum_Denomination_Complex_Flag;
	}

	public void setMinimum_Denomination_Complex_Flag(
			String minimum_Denomination_Complex_Flag) {
		Minimum_Denomination_Complex_Flag = minimum_Denomination_Complex_Flag;
	}

	public String getMinimum_Denomination_Complex_Flag__Change_Flag() {
		return Minimum_Denomination_Complex_Flag__Change_Flag;
	}

	public void setMinimum_Denomination_Complex_Flag__Change_Flag(
			String minimum_Denomination_Complex_Flag__Change_Flag) {
		Minimum_Denomination_Complex_Flag__Change_Flag = minimum_Denomination_Complex_Flag__Change_Flag;
	}

	public String getMinimum_Denomination_Complex_Flag__Previous() {
		return Minimum_Denomination_Complex_Flag__Previous;
	}

	public void setMinimum_Denomination_Complex_Flag__Previous(
			String minimum_Denomination_Complex_Flag__Previous) {
		Minimum_Denomination_Complex_Flag__Previous = minimum_Denomination_Complex_Flag__Previous;
	}

	public String getMinimum_Traded_Value__ESMA() {
		return Minimum_Traded_Value__ESMA;
	}

	public void setMinimum_Traded_Value__ESMA(String minimum_Traded_Value__ESMA) {
		Minimum_Traded_Value__ESMA = minimum_Traded_Value__ESMA;
	}

	public String getMinimum_Traded_Value__ESMA__Change_Flag() {
		return Minimum_Traded_Value__ESMA__Change_Flag;
	}

	public void setMinimum_Traded_Value__ESMA__Change_Flag(
			String minimum_Traded_Value__ESMA__Change_Flag) {
		Minimum_Traded_Value__ESMA__Change_Flag = minimum_Traded_Value__ESMA__Change_Flag;
	}

	public String getMinimum_Traded_Value__ESMA__Previous() {
		return Minimum_Traded_Value__ESMA__Previous;
	}

	public void setMinimum_Traded_Value__ESMA__Previous(
			String minimum_Traded_Value__ESMA__Previous) {
		Minimum_Traded_Value__ESMA__Previous = minimum_Traded_Value__ESMA__Previous;
	}

	public String getNCA_Average_Daily_Turnover() {
		return NCA_Average_Daily_Turnover;
	}

	public void setNCA_Average_Daily_Turnover(String nCA_Average_Daily_Turnover) {
		NCA_Average_Daily_Turnover = nCA_Average_Daily_Turnover;
	}

	public String getNCA_Average_Daily_Turnover__Change_Flag() {
		return NCA_Average_Daily_Turnover__Change_Flag;
	}

	public void setNCA_Average_Daily_Turnover__Change_Flag(
			String nCA_Average_Daily_Turnover__Change_Flag) {
		NCA_Average_Daily_Turnover__Change_Flag = nCA_Average_Daily_Turnover__Change_Flag;
	}

	public String getNCA_Average_Daily_Turnover__Previous() {
		return NCA_Average_Daily_Turnover__Previous;
	}

	public void setNCA_Average_Daily_Turnover__Previous(
			String nCA_Average_Daily_Turnover__Previous) {
		NCA_Average_Daily_Turnover__Previous = nCA_Average_Daily_Turnover__Previous;
	}

	public String getNCA_Average_Daily_Turnover_Currency_Code() {
		return NCA_Average_Daily_Turnover_Currency_Code;
	}

	public void setNCA_Average_Daily_Turnover_Currency_Code(
			String nCA_Average_Daily_Turnover_Currency_Code) {
		NCA_Average_Daily_Turnover_Currency_Code = nCA_Average_Daily_Turnover_Currency_Code;
	}

	public String getNCA_Average_Daily_Turnover_Currency_Code__Change_Flag() {
		return NCA_Average_Daily_Turnover_Currency_Code__Change_Flag;
	}

	public void setNCA_Average_Daily_Turnover_Currency_Code__Change_Flag(
			String nCA_Average_Daily_Turnover_Currency_Code__Change_Flag) {
		NCA_Average_Daily_Turnover_Currency_Code__Change_Flag = nCA_Average_Daily_Turnover_Currency_Code__Change_Flag;
	}

	public String getNCA_Average_Daily_Turnover_Currency_Code__Previous() {
		return NCA_Average_Daily_Turnover_Currency_Code__Previous;
	}

	public void setNCA_Average_Daily_Turnover_Currency_Code__Previous(
			String nCA_Average_Daily_Turnover_Currency_Code__Previous) {
		NCA_Average_Daily_Turnover_Currency_Code__Previous = nCA_Average_Daily_Turnover_Currency_Code__Previous;
	}

	public String getNCA_Average_Value_Of_Transactions() {
		return NCA_Average_Value_Of_Transactions;
	}

	public void setNCA_Average_Value_Of_Transactions(
			String nCA_Average_Value_Of_Transactions) {
		NCA_Average_Value_Of_Transactions = nCA_Average_Value_Of_Transactions;
	}

	public String getNCA_Average_Value_Of_Transactions__Change_Flag() {
		return NCA_Average_Value_Of_Transactions__Change_Flag;
	}

	public void setNCA_Average_Value_Of_Transactions__Change_Flag(
			String nCA_Average_Value_Of_Transactions__Change_Flag) {
		NCA_Average_Value_Of_Transactions__Change_Flag = nCA_Average_Value_Of_Transactions__Change_Flag;
	}

	public String getNCA_Average_Value_Of_Transactions__Previous() {
		return NCA_Average_Value_Of_Transactions__Previous;
	}

	public void setNCA_Average_Value_Of_Transactions__Previous(
			String nCA_Average_Value_Of_Transactions__Previous) {
		NCA_Average_Value_Of_Transactions__Previous = nCA_Average_Value_Of_Transactions__Previous;
	}

	public String getNCA_Average_Value_Of_Transactions_Currency_Code() {
		return NCA_Average_Value_Of_Transactions_Currency_Code;
	}

	public void setNCA_Average_Value_Of_Transactions_Currency_Code(
			String nCA_Average_Value_Of_Transactions_Currency_Code) {
		NCA_Average_Value_Of_Transactions_Currency_Code = nCA_Average_Value_Of_Transactions_Currency_Code;
	}

	public String getNCA_Average_Value_Of_Transactions_Currency_Code__Change_Flag() {
		return NCA_Average_Value_Of_Transactions_Currency_Code__Change_Flag;
	}

	public void setNCA_Average_Value_Of_Transactions_Currency_Code__Change_Flag(
			String nCA_Average_Value_Of_Transactions_Currency_Code__Change_Flag) {
		NCA_Average_Value_Of_Transactions_Currency_Code__Change_Flag = nCA_Average_Value_Of_Transactions_Currency_Code__Change_Flag;
	}

	public String getNCA_Average_Value_Of_Transactions_Currency_Code__Previous() {
		return NCA_Average_Value_Of_Transactions_Currency_Code__Previous;
	}

	public void setNCA_Average_Value_Of_Transactions_Currency_Code__Previous(
			String nCA_Average_Value_Of_Transactions_Currency_Code__Previous) {
		NCA_Average_Value_Of_Transactions_Currency_Code__Previous = nCA_Average_Value_Of_Transactions_Currency_Code__Previous;
	}

	public String getNCA_Free_Float() {
		return NCA_Free_Float;
	}

	public void setNCA_Free_Float(String nCA_Free_Float) {
		NCA_Free_Float = nCA_Free_Float;
	}

	public String getNCA_Free_Float__Change_Flag() {
		return NCA_Free_Float__Change_Flag;
	}

	public void setNCA_Free_Float__Change_Flag(
			String nCA_Free_Float__Change_Flag) {
		NCA_Free_Float__Change_Flag = nCA_Free_Float__Change_Flag;
	}

	public String getNCA_Free_Float__Previous() {
		return NCA_Free_Float__Previous;
	}

	public void setNCA_Free_Float__Previous(String nCA_Free_Float__Previous) {
		NCA_Free_Float__Previous = nCA_Free_Float__Previous;
	}

	public String getNCA_Free_Float_Currency_Code() {
		return NCA_Free_Float_Currency_Code;
	}

	public void setNCA_Free_Float_Currency_Code(
			String nCA_Free_Float_Currency_Code) {
		NCA_Free_Float_Currency_Code = nCA_Free_Float_Currency_Code;
	}

	public String getNCA_Free_Float_Currency_Code__Change_Flag() {
		return NCA_Free_Float_Currency_Code__Change_Flag;
	}

	public void setNCA_Free_Float_Currency_Code__Change_Flag(
			String nCA_Free_Float_Currency_Code__Change_Flag) {
		NCA_Free_Float_Currency_Code__Change_Flag = nCA_Free_Float_Currency_Code__Change_Flag;
	}

	public String getNCA_Free_Float_Currency_Code__Previous() {
		return NCA_Free_Float_Currency_Code__Previous;
	}

	public void setNCA_Free_Float_Currency_Code__Previous(
			String nCA_Free_Float_Currency_Code__Previous) {
		NCA_Free_Float_Currency_Code__Previous = nCA_Free_Float_Currency_Code__Previous;
	}

	public String getNCA_ORGID() {
		return NCA_ORGID;
	}

	public void setNCA_ORGID(String nCA_ORGID) {
		NCA_ORGID = nCA_ORGID;
	}

	public String getNCA_ORGID__Change_Flag() {
		return NCA_ORGID__Change_Flag;
	}

	public void setNCA_ORGID__Change_Flag(String nCA_ORGID__Change_Flag) {
		NCA_ORGID__Change_Flag = nCA_ORGID__Change_Flag;
	}

	public String getNCA_ORGID__Previous() {
		return NCA_ORGID__Previous;
	}

	public void setNCA_ORGID__Previous(String nCA_ORGID__Previous) {
		NCA_ORGID__Previous = nCA_ORGID__Previous;
	}

	public String getNetherlands_Code() {
		return Netherlands_Code;
	}

	public void setNetherlands_Code(String netherlands_Code) {
		Netherlands_Code = netherlands_Code;
	}

	public String getNetherlands_Code__Change_Flag() {
		return Netherlands_Code__Change_Flag;
	}

	public void setNetherlands_Code__Change_Flag(
			String netherlands_Code__Change_Flag) {
		Netherlands_Code__Change_Flag = netherlands_Code__Change_Flag;
	}

	public String getNetherlands_Code__Previous() {
		return Netherlands_Code__Previous;
	}

	public void setNetherlands_Code__Previous(String netherlands_Code__Previous) {
		Netherlands_Code__Previous = netherlands_Code__Previous;
	}

	public String getNext_Contract() {
		return Next_Contract;
	}

	public void setNext_Contract(String next_Contract) {
		Next_Contract = next_Contract;
	}

	public String getNext_Contract__Change_Flag() {
		return Next_Contract__Change_Flag;
	}

	public void setNext_Contract__Change_Flag(String next_Contract__Change_Flag) {
		Next_Contract__Change_Flag = next_Contract__Change_Flag;
	}

	public String getNext_Contract__Previous() {
		return Next_Contract__Previous;
	}

	public void setNext_Contract__Previous(String next_Contract__Previous) {
		Next_Contract__Previous = next_Contract__Previous;
	}

	public String getNext_Contract_Date() {
		return Next_Contract_Date;
	}

	public void setNext_Contract_Date(String next_Contract_Date) {
		Next_Contract_Date = next_Contract_Date;
	}

	public String getNext_Contract_Date__Change_Flag() {
		return Next_Contract_Date__Change_Flag;
	}

	public void setNext_Contract_Date__Change_Flag(
			String next_Contract_Date__Change_Flag) {
		Next_Contract_Date__Change_Flag = next_Contract_Date__Change_Flag;
	}

	public String getNext_Contract_Date__Previous() {
		return Next_Contract_Date__Previous;
	}

	public void setNext_Contract_Date__Previous(
			String next_Contract_Date__Previous) {
		Next_Contract_Date__Previous = next_Contract_Date__Previous;
	}

	public String getNext_Contract_Quote_ID() {
		return Next_Contract_Quote_ID;
	}

	public void setNext_Contract_Quote_ID(String next_Contract_Quote_ID) {
		Next_Contract_Quote_ID = next_Contract_Quote_ID;
	}

	public String getNext_Contract_Quote_ID__Change_Flag() {
		return Next_Contract_Quote_ID__Change_Flag;
	}

	public void setNext_Contract_Quote_ID__Change_Flag(
			String next_Contract_Quote_ID__Change_Flag) {
		Next_Contract_Quote_ID__Change_Flag = next_Contract_Quote_ID__Change_Flag;
	}

	public String getNext_Contract_Quote_ID__Previous() {
		return Next_Contract_Quote_ID__Previous;
	}

	public void setNext_Contract_Quote_ID__Previous(
			String next_Contract_Quote_ID__Previous) {
		Next_Contract_Quote_ID__Previous = next_Contract_Quote_ID__Previous;
	}

	public String getNotional_Currency() {
		return Notional_Currency;
	}

	public void setNotional_Currency(String notional_Currency) {
		Notional_Currency = notional_Currency;
	}

	public String getNotional_Currency__Change_Flag() {
		return Notional_Currency__Change_Flag;
	}

	public void setNotional_Currency__Change_Flag(
			String notional_Currency__Change_Flag) {
		Notional_Currency__Change_Flag = notional_Currency__Change_Flag;
	}

	public String getNotional_Currency__ESMA() {
		return Notional_Currency__ESMA;
	}

	public void setNotional_Currency__ESMA(String notional_Currency__ESMA) {
		Notional_Currency__ESMA = notional_Currency__ESMA;
	}

	public String getNotional_Currency__ESMA__Change_Flag() {
		return Notional_Currency__ESMA__Change_Flag;
	}

	public void setNotional_Currency__ESMA__Change_Flag(
			String notional_Currency__ESMA__Change_Flag) {
		Notional_Currency__ESMA__Change_Flag = notional_Currency__ESMA__Change_Flag;
	}

	public String getNotional_Currency__ESMA__Previous() {
		return Notional_Currency__ESMA__Previous;
	}

	public void setNotional_Currency__ESMA__Previous(
			String notional_Currency__ESMA__Previous) {
		Notional_Currency__ESMA__Previous = notional_Currency__ESMA__Previous;
	}

	public String getNotional_Currency__Previous() {
		return Notional_Currency__Previous;
	}

	public void setNotional_Currency__Previous(
			String notional_Currency__Previous) {
		Notional_Currency__Previous = notional_Currency__Previous;
	}

	public String getNotional_Currency_2() {
		return Notional_Currency_2;
	}

	public void setNotional_Currency_2(String notional_Currency_2) {
		Notional_Currency_2 = notional_Currency_2;
	}

	public String getNotional_Currency_2__Change_Flag() {
		return Notional_Currency_2__Change_Flag;
	}

	public void setNotional_Currency_2__Change_Flag(
			String notional_Currency_2__Change_Flag) {
		Notional_Currency_2__Change_Flag = notional_Currency_2__Change_Flag;
	}

	public String getNotional_Currency_2__ESMA() {
		return Notional_Currency_2__ESMA;
	}

	public void setNotional_Currency_2__ESMA(String notional_Currency_2__ESMA) {
		Notional_Currency_2__ESMA = notional_Currency_2__ESMA;
	}

	public String getNotional_Currency_2__ESMA__Change_Flag() {
		return Notional_Currency_2__ESMA__Change_Flag;
	}

	public void setNotional_Currency_2__ESMA__Change_Flag(
			String notional_Currency_2__ESMA__Change_Flag) {
		Notional_Currency_2__ESMA__Change_Flag = notional_Currency_2__ESMA__Change_Flag;
	}

	public String getNotional_Currency_2__ESMA__Previous() {
		return Notional_Currency_2__ESMA__Previous;
	}

	public void setNotional_Currency_2__ESMA__Previous(
			String notional_Currency_2__ESMA__Previous) {
		Notional_Currency_2__ESMA__Previous = notional_Currency_2__ESMA__Previous;
	}

	public String getNotional_Currency_2__Previous() {
		return Notional_Currency_2__Previous;
	}

	public void setNotional_Currency_2__Previous(
			String notional_Currency_2__Previous) {
		Notional_Currency_2__Previous = notional_Currency_2__Previous;
	}

	public String getNumber_of_Days_to_Maturity() {
		return Number_of_Days_to_Maturity;
	}

	public void setNumber_of_Days_to_Maturity(String number_of_Days_to_Maturity) {
		Number_of_Days_to_Maturity = number_of_Days_to_Maturity;
	}

	public String getNumber_of_Days_to_Maturity__Change_Flag() {
		return Number_of_Days_to_Maturity__Change_Flag;
	}

	public void setNumber_of_Days_to_Maturity__Change_Flag(
			String number_of_Days_to_Maturity__Change_Flag) {
		Number_of_Days_to_Maturity__Change_Flag = number_of_Days_to_Maturity__Change_Flag;
	}

	public String getNumber_of_Days_to_Maturity__Previous() {
		return Number_of_Days_to_Maturity__Previous;
	}

	public void setNumber_of_Days_to_Maturity__Previous(
			String number_of_Days_to_Maturity__Previous) {
		Number_of_Days_to_Maturity__Previous = number_of_Days_to_Maturity__Previous;
	}

	public String getNumber_of_Issued_Instruments() {
		return Number_of_Issued_Instruments;
	}

	public void setNumber_of_Issued_Instruments(
			String number_of_Issued_Instruments) {
		Number_of_Issued_Instruments = number_of_Issued_Instruments;
	}

	public String getNumber_of_Issued_Instruments__Change_Flag() {
		return Number_of_Issued_Instruments__Change_Flag;
	}

	public void setNumber_of_Issued_Instruments__Change_Flag(
			String number_of_Issued_Instruments__Change_Flag) {
		Number_of_Issued_Instruments__Change_Flag = number_of_Issued_Instruments__Change_Flag;
	}

	public String getNumber_of_Issued_Instruments__Previous() {
		return Number_of_Issued_Instruments__Previous;
	}

	public void setNumber_of_Issued_Instruments__Previous(
			String number_of_Issued_Instruments__Previous) {
		Number_of_Issued_Instruments__Previous = number_of_Issued_Instruments__Previous;
	}

	public String getOCC_Code() {
		return OCC_Code;
	}

	public void setOCC_Code(String oCC_Code) {
		OCC_Code = oCC_Code;
	}

	public String getOCC_Code__Change_Flag() {
		return OCC_Code__Change_Flag;
	}

	public void setOCC_Code__Change_Flag(String oCC_Code__Change_Flag) {
		OCC_Code__Change_Flag = oCC_Code__Change_Flag;
	}

	public String getOCC_Code__Previous() {
		return OCC_Code__Previous;
	}

	public void setOCC_Code__Previous(String oCC_Code__Previous) {
		OCC_Code__Previous = oCC_Code__Previous;
	}

	public String getOPOL() {
		return OPOL;
	}

	public void setOPOL(String oPOL) {
		OPOL = oPOL;
	}

	public String getOPOL__Change_Flag() {
		return OPOL__Change_Flag;
	}

	public void setOPOL__Change_Flag(String oPOL__Change_Flag) {
		OPOL__Change_Flag = oPOL__Change_Flag;
	}

	public String getOPOL__Previous() {
		return OPOL__Previous;
	}

	public void setOPOL__Previous(String oPOL__Previous) {
		OPOL__Previous = oPOL__Previous;
	}

	public String getOPRA_Regional_Exchange_List() {
		return OPRA_Regional_Exchange_List;
	}

	public void setOPRA_Regional_Exchange_List(
			String oPRA_Regional_Exchange_List) {
		OPRA_Regional_Exchange_List = oPRA_Regional_Exchange_List;
	}

	public String getOPRA_Regional_Exchange_List__Change_Flag() {
		return OPRA_Regional_Exchange_List__Change_Flag;
	}

	public void setOPRA_Regional_Exchange_List__Change_Flag(
			String oPRA_Regional_Exchange_List__Change_Flag) {
		OPRA_Regional_Exchange_List__Change_Flag = oPRA_Regional_Exchange_List__Change_Flag;
	}

	public String getOPRA_Regional_Exchange_List__Previous() {
		return OPRA_Regional_Exchange_List__Previous;
	}

	public void setOPRA_Regional_Exchange_List__Previous(
			String oPRA_Regional_Exchange_List__Previous) {
		OPRA_Regional_Exchange_List__Previous = oPRA_Regional_Exchange_List__Previous;
	}

	public String getOpenEnded_Warrant_Indicator() {
		return OpenEnded_Warrant_Indicator;
	}

	public void setOpenEnded_Warrant_Indicator(
			String openEnded_Warrant_Indicator) {
		OpenEnded_Warrant_Indicator = openEnded_Warrant_Indicator;
	}

	public String getOpenEnded_Warrant_Indicator__Change_Flag() {
		return OpenEnded_Warrant_Indicator__Change_Flag;
	}

	public void setOpenEnded_Warrant_Indicator__Change_Flag(
			String openEnded_Warrant_Indicator__Change_Flag) {
		OpenEnded_Warrant_Indicator__Change_Flag = openEnded_Warrant_Indicator__Change_Flag;
	}

	public String getOpenEnded_Warrant_Indicator__Previous() {
		return OpenEnded_Warrant_Indicator__Previous;
	}

	public void setOpenEnded_Warrant_Indicator__Previous(
			String openEnded_Warrant_Indicator__Previous) {
		OpenEnded_Warrant_Indicator__Previous = openEnded_Warrant_Indicator__Previous;
	}

	public String getOperating_Mic() {
		return Operating_Mic;
	}

	public void setOperating_Mic(String operating_Mic) {
		Operating_Mic = operating_Mic;
	}

	public String getOperating_Mic__Change_Flag() {
		return Operating_Mic__Change_Flag;
	}

	public void setOperating_Mic__Change_Flag(String operating_Mic__Change_Flag) {
		Operating_Mic__Change_Flag = operating_Mic__Change_Flag;
	}

	public String getOperating_Mic__Previous() {
		return Operating_Mic__Previous;
	}

	public void setOperating_Mic__Previous(String operating_Mic__Previous) {
		Operating_Mic__Previous = operating_Mic__Previous;
	}

	public String getOption_root() {
		return Option_root;
	}

	public void setOption_root(String option_root) {
		Option_root = option_root;
	}

	public String getOption_root__Change_Flag() {
		return Option_root__Change_Flag;
	}

	public void setOption_root__Change_Flag(String option_root__Change_Flag) {
		Option_root__Change_Flag = option_root__Change_Flag;
	}

	public String getOption_root__Previous() {
		return Option_root__Previous;
	}

	public void setOption_root__Previous(String option_root__Previous) {
		Option_root__Previous = option_root__Previous;
	}

	public String getOrganization_Perm_ID() {
		return Organization_Perm_ID;
	}

	public void setOrganization_Perm_ID(String organization_Perm_ID) {
		Organization_Perm_ID = organization_Perm_ID;
	}

	public String getOrganization_Perm_ID__Change_Flag() {
		return Organization_Perm_ID__Change_Flag;
	}

	public void setOrganization_Perm_ID__Change_Flag(
			String organization_Perm_ID__Change_Flag) {
		Organization_Perm_ID__Change_Flag = organization_Perm_ID__Change_Flag;
	}

	public String getOrganization_Perm_ID__Previous() {
		return Organization_Perm_ID__Previous;
	}

	public void setOrganization_Perm_ID__Previous(
			String organization_Perm_ID__Previous) {
		Organization_Perm_ID__Previous = organization_Perm_ID__Previous;
	}

	public String getOrganization_Sub_Type() {
		return Organization_Sub_Type;
	}

	public void setOrganization_Sub_Type(String organization_Sub_Type) {
		Organization_Sub_Type = organization_Sub_Type;
	}

	public String getOrganization_Sub_Type__Change_Flag() {
		return Organization_Sub_Type__Change_Flag;
	}

	public void setOrganization_Sub_Type__Change_Flag(
			String organization_Sub_Type__Change_Flag) {
		Organization_Sub_Type__Change_Flag = organization_Sub_Type__Change_Flag;
	}

	public String getOrganization_Sub_Type__Previous() {
		return Organization_Sub_Type__Previous;
	}

	public void setOrganization_Sub_Type__Previous(
			String organization_Sub_Type__Previous) {
		Organization_Sub_Type__Previous = organization_Sub_Type__Previous;
	}

	public String getOrganization_Type() {
		return Organization_Type;
	}

	public void setOrganization_Type(String organization_Type) {
		Organization_Type = organization_Type;
	}

	public String getOrganization_Type__Change_Flag() {
		return Organization_Type__Change_Flag;
	}

	public void setOrganization_Type__Change_Flag(
			String organization_Type__Change_Flag) {
		Organization_Type__Change_Flag = organization_Type__Change_Flag;
	}

	public String getOrganization_Type__Previous() {
		return Organization_Type__Previous;
	}

	public void setOrganization_Type__Previous(
			String organization_Type__Previous) {
		Organization_Type__Previous = organization_Type__Previous;
	}

	public String getOriginal_Expiry_Date() {
		return Original_Expiry_Date;
	}

	public void setOriginal_Expiry_Date(String original_Expiry_Date) {
		Original_Expiry_Date = original_Expiry_Date;
	}

	public String getOriginal_Expiry_Date__Change_Flag() {
		return Original_Expiry_Date__Change_Flag;
	}

	public void setOriginal_Expiry_Date__Change_Flag(
			String original_Expiry_Date__Change_Flag) {
		Original_Expiry_Date__Change_Flag = original_Expiry_Date__Change_Flag;
	}

	public String getOriginal_Expiry_Date__Previous() {
		return Original_Expiry_Date__Previous;
	}

	public void setOriginal_Expiry_Date__Previous(
			String original_Expiry_Date__Previous) {
		Original_Expiry_Date__Previous = original_Expiry_Date__Previous;
	}

	public String getP_Chip_Flag() {
		return P_Chip_Flag;
	}

	public void setP_Chip_Flag(String p_Chip_Flag) {
		P_Chip_Flag = p_Chip_Flag;
	}

	public String getP_Chip_Flag__Change_Flag() {
		return P_Chip_Flag__Change_Flag;
	}

	public void setP_Chip_Flag__Change_Flag(String p_Chip_Flag__Change_Flag) {
		P_Chip_Flag__Change_Flag = p_Chip_Flag__Change_Flag;
	}

	public String getP_Chip_Flag__Previous() {
		return P_Chip_Flag__Previous;
	}

	public void setP_Chip_Flag__Previous(String p_Chip_Flag__Previous) {
		P_Chip_Flag__Previous = p_Chip_Flag__Previous;
	}

	public String getPE_Code() {
		return PE_Code;
	}

	public void setPE_Code(String pE_Code) {
		PE_Code = pE_Code;
	}

	public String getPE_Code__Change_Flag() {
		return PE_Code__Change_Flag;
	}

	public void setPE_Code__Change_Flag(String pE_Code__Change_Flag) {
		PE_Code__Change_Flag = pE_Code__Change_Flag;
	}

	public String getPE_Code__Previous() {
		return PE_Code__Previous;
	}

	public void setPE_Code__Previous(String pE_Code__Previous) {
		PE_Code__Previous = pE_Code__Previous;
	}

	public String getPILC() {
		return PILC;
	}

	public void setPILC(String pILC) {
		PILC = pILC;
	}

	public String getPILC__Change_Flag() {
		return PILC__Change_Flag;
	}

	public void setPILC__Change_Flag(String pILC__Change_Flag) {
		PILC__Change_Flag = pILC__Change_Flag;
	}

	public String getPILC__Previous() {
		return PILC__Previous;
	}

	public void setPILC__Previous(String pILC__Previous) {
		PILC__Previous = pILC__Previous;
	}

	public String getPTM_Levy_Eligibility_Flag() {
		return PTM_Levy_Eligibility_Flag;
	}

	public void setPTM_Levy_Eligibility_Flag(String pTM_Levy_Eligibility_Flag) {
		PTM_Levy_Eligibility_Flag = pTM_Levy_Eligibility_Flag;
	}

	public String getPTM_Levy_Eligibility_Flag__Change_Flag() {
		return PTM_Levy_Eligibility_Flag__Change_Flag;
	}

	public void setPTM_Levy_Eligibility_Flag__Change_Flag(
			String pTM_Levy_Eligibility_Flag__Change_Flag) {
		PTM_Levy_Eligibility_Flag__Change_Flag = pTM_Levy_Eligibility_Flag__Change_Flag;
	}

	public String getPTM_Levy_Eligibility_Flag__Previous() {
		return PTM_Levy_Eligibility_Flag__Previous;
	}

	public void setPTM_Levy_Eligibility_Flag__Previous(
			String pTM_Levy_Eligibility_Flag__Previous) {
		PTM_Levy_Eligibility_Flag__Previous = pTM_Levy_Eligibility_Flag__Previous;
	}

	public String getParticipatory_Notes() {
		return Participatory_Notes;
	}

	public void setParticipatory_Notes(String participatory_Notes) {
		Participatory_Notes = participatory_Notes;
	}

	public String getParticipatory_Notes__Change_Flag() {
		return Participatory_Notes__Change_Flag;
	}

	public void setParticipatory_Notes__Change_Flag(
			String participatory_Notes__Change_Flag) {
		Participatory_Notes__Change_Flag = participatory_Notes__Change_Flag;
	}

	public String getParticipatory_Notes__Previous() {
		return Participatory_Notes__Previous;
	}

	public void setParticipatory_Notes__Previous(
			String participatory_Notes__Previous) {
		Participatory_Notes__Previous = participatory_Notes__Previous;
	}

	public String getPeriodic_Call_Auc_Session_Flag() {
		return Periodic_Call_Auc_Session_Flag;
	}

	public void setPeriodic_Call_Auc_Session_Flag(
			String periodic_Call_Auc_Session_Flag) {
		Periodic_Call_Auc_Session_Flag = periodic_Call_Auc_Session_Flag;
	}

	public String getPeriodic_Call_Auc_Session_Flag__Change_Flag() {
		return Periodic_Call_Auc_Session_Flag__Change_Flag;
	}

	public void setPeriodic_Call_Auc_Session_Flag__Change_Flag(
			String periodic_Call_Auc_Session_Flag__Change_Flag) {
		Periodic_Call_Auc_Session_Flag__Change_Flag = periodic_Call_Auc_Session_Flag__Change_Flag;
	}

	public String getPeriodic_Call_Auc_Session_Flag__Previous() {
		return Periodic_Call_Auc_Session_Flag__Previous;
	}

	public void setPeriodic_Call_Auc_Session_Flag__Previous(
			String periodic_Call_Auc_Session_Flag__Previous) {
		Periodic_Call_Auc_Session_Flag__Previous = periodic_Call_Auc_Session_Flag__Previous;
	}

	public String getPeriodicity() {
		return Periodicity;
	}

	public void setPeriodicity(String periodicity) {
		Periodicity = periodicity;
	}

	public String getPeriodicity__Change_Flag() {
		return Periodicity__Change_Flag;
	}

	public void setPeriodicity__Change_Flag(String periodicity__Change_Flag) {
		Periodicity__Change_Flag = periodicity__Change_Flag;
	}

	public String getPeriodicity__Previous() {
		return Periodicity__Previous;
	}

	public void setPeriodicity__Previous(String periodicity__Previous) {
		Periodicity__Previous = periodicity__Previous;
	}

	public String getPlace_of_Listing_Flag() {
		return Place_of_Listing_Flag;
	}

	public void setPlace_of_Listing_Flag(String place_of_Listing_Flag) {
		Place_of_Listing_Flag = place_of_Listing_Flag;
	}

	public String getPlace_of_Listing_Flag__Change_Flag() {
		return Place_of_Listing_Flag__Change_Flag;
	}

	public void setPlace_of_Listing_Flag__Change_Flag(
			String place_of_Listing_Flag__Change_Flag) {
		Place_of_Listing_Flag__Change_Flag = place_of_Listing_Flag__Change_Flag;
	}

	public String getPlace_of_Listing_Flag__Previous() {
		return Place_of_Listing_Flag__Previous;
	}

	public void setPlace_of_Listing_Flag__Previous(
			String place_of_Listing_Flag__Previous) {
		Place_of_Listing_Flag__Previous = place_of_Listing_Flag__Previous;
	}

	public String getPlaceholder() {
		return Placeholder;
	}

	public void setPlaceholder(String placeholder) {
		Placeholder = placeholder;
	}

	public String getPrice_Multiplier__DSB() {
		return Price_Multiplier__DSB;
	}

	public void setPrice_Multiplier__DSB(String price_Multiplier__DSB) {
		Price_Multiplier__DSB = price_Multiplier__DSB;
	}

	public String getPrice_Multiplier__DSB__Change_Flag() {
		return Price_Multiplier__DSB__Change_Flag;
	}

	public void setPrice_Multiplier__DSB__Change_Flag(
			String price_Multiplier__DSB__Change_Flag) {
		Price_Multiplier__DSB__Change_Flag = price_Multiplier__DSB__Change_Flag;
	}

	public String getPrice_Multiplier__DSB__Previous() {
		return Price_Multiplier__DSB__Previous;
	}

	public void setPrice_Multiplier__DSB__Previous(
			String price_Multiplier__DSB__Previous) {
		Price_Multiplier__DSB__Previous = price_Multiplier__DSB__Previous;
	}

	public String getPrice_Multiplier__ESMA() {
		return Price_Multiplier__ESMA;
	}

	public void setPrice_Multiplier__ESMA(String price_Multiplier__ESMA) {
		Price_Multiplier__ESMA = price_Multiplier__ESMA;
	}

	public String getPrice_Multiplier__ESMA__Change_Flag() {
		return Price_Multiplier__ESMA__Change_Flag;
	}

	public void setPrice_Multiplier__ESMA__Change_Flag(
			String price_Multiplier__ESMA__Change_Flag) {
		Price_Multiplier__ESMA__Change_Flag = price_Multiplier__ESMA__Change_Flag;
	}

	public String getPrice_Multiplier__ESMA__Previous() {
		return Price_Multiplier__ESMA__Previous;
	}

	public void setPrice_Multiplier__ESMA__Previous(
			String price_Multiplier__ESMA__Previous) {
		Price_Multiplier__ESMA__Previous = price_Multiplier__ESMA__Previous;
	}

	public String getPrice_basis() {
		return Price_basis;
	}

	public void setPrice_basis(String price_basis) {
		Price_basis = price_basis;
	}

	public String getPrice_basis__Change_Flag() {
		return Price_basis__Change_Flag;
	}

	public void setPrice_basis__Change_Flag(String price_basis__Change_Flag) {
		Price_basis__Change_Flag = price_basis__Change_Flag;
	}

	public String getPrice_basis__Previous() {
		return Price_basis__Previous;
	}

	public void setPrice_basis__Previous(String price_basis__Previous) {
		Price_basis__Previous = price_basis__Previous;
	}

	public String getPricing_Unit() {
		return Pricing_Unit;
	}

	public void setPricing_Unit(String pricing_Unit) {
		Pricing_Unit = pricing_Unit;
	}

	public String getPricing_Unit__Change_Flag() {
		return Pricing_Unit__Change_Flag;
	}

	public void setPricing_Unit__Change_Flag(String pricing_Unit__Change_Flag) {
		Pricing_Unit__Change_Flag = pricing_Unit__Change_Flag;
	}

	public String getPricing_Unit__Previous() {
		return Pricing_Unit__Previous;
	}

	public void setPricing_Unit__Previous(String pricing_Unit__Previous) {
		Pricing_Unit__Previous = pricing_Unit__Previous;
	}

	public String getPrimary_Chain_or_Tile() {
		return Primary_Chain_or_Tile;
	}

	public void setPrimary_Chain_or_Tile(String primary_Chain_or_Tile) {
		Primary_Chain_or_Tile = primary_Chain_or_Tile;
	}

	public String getPrimary_Chain_or_Tile__Change_Flag() {
		return Primary_Chain_or_Tile__Change_Flag;
	}

	public void setPrimary_Chain_or_Tile__Change_Flag(
			String primary_Chain_or_Tile__Change_Flag) {
		Primary_Chain_or_Tile__Change_Flag = primary_Chain_or_Tile__Change_Flag;
	}

	public String getPrimary_Chain_or_Tile__Previous() {
		return Primary_Chain_or_Tile__Previous;
	}

	public void setPrimary_Chain_or_Tile__Previous(
			String primary_Chain_or_Tile__Previous) {
		Primary_Chain_or_Tile__Previous = primary_Chain_or_Tile__Previous;
	}

	public String getPrimary_Chain_or_Tile_Quote_ID() {
		return Primary_Chain_or_Tile_Quote_ID;
	}

	public void setPrimary_Chain_or_Tile_Quote_ID(
			String primary_Chain_or_Tile_Quote_ID) {
		Primary_Chain_or_Tile_Quote_ID = primary_Chain_or_Tile_Quote_ID;
	}

	public String getPrimary_Chain_or_Tile_Quote_ID__Change_Flag() {
		return Primary_Chain_or_Tile_Quote_ID__Change_Flag;
	}

	public void setPrimary_Chain_or_Tile_Quote_ID__Change_Flag(
			String primary_Chain_or_Tile_Quote_ID__Change_Flag) {
		Primary_Chain_or_Tile_Quote_ID__Change_Flag = primary_Chain_or_Tile_Quote_ID__Change_Flag;
	}

	public String getPrimary_Chain_or_Tile_Quote_ID__Previous() {
		return Primary_Chain_or_Tile_Quote_ID__Previous;
	}

	public void setPrimary_Chain_or_Tile_Quote_ID__Previous(
			String primary_Chain_or_Tile_Quote_ID__Previous) {
		Primary_Chain_or_Tile_Quote_ID__Previous = primary_Chain_or_Tile_Quote_ID__Previous;
	}

	public String getPrimary_Execution_Venue() {
		return Primary_Execution_Venue;
	}

	public void setPrimary_Execution_Venue(String primary_Execution_Venue) {
		Primary_Execution_Venue = primary_Execution_Venue;
	}

	public String getPrimary_Execution_Venue__Change_Flag() {
		return Primary_Execution_Venue__Change_Flag;
	}

	public void setPrimary_Execution_Venue__Change_Flag(
			String primary_Execution_Venue__Change_Flag) {
		Primary_Execution_Venue__Change_Flag = primary_Execution_Venue__Change_Flag;
	}

	public String getPrimary_Execution_Venue__Previous() {
		return Primary_Execution_Venue__Previous;
	}

	public void setPrimary_Execution_Venue__Previous(
			String primary_Execution_Venue__Previous) {
		Primary_Execution_Venue__Previous = primary_Execution_Venue__Previous;
	}

	public String getPrimary_Listed_RIC() {
		return Primary_Listed_RIC;
	}

	public void setPrimary_Listed_RIC(String primary_Listed_RIC) {
		Primary_Listed_RIC = primary_Listed_RIC;
	}

	public String getPrimary_Listed_RIC__Change_Flag() {
		return Primary_Listed_RIC__Change_Flag;
	}

	public void setPrimary_Listed_RIC__Change_Flag(
			String primary_Listed_RIC__Change_Flag) {
		Primary_Listed_RIC__Change_Flag = primary_Listed_RIC__Change_Flag;
	}

	public String getPrimary_Listed_RIC__Previous() {
		return Primary_Listed_RIC__Previous;
	}

	public void setPrimary_Listed_RIC__Previous(
			String primary_Listed_RIC__Previous) {
		Primary_Listed_RIC__Previous = primary_Listed_RIC__Previous;
	}

	public String getPrimary_Market_Quote_ID() {
		return Primary_Market_Quote_ID;
	}

	public void setPrimary_Market_Quote_ID(String primary_Market_Quote_ID) {
		Primary_Market_Quote_ID = primary_Market_Quote_ID;
	}

	public String getPrimary_Market_Quote_ID__Change_Flag() {
		return Primary_Market_Quote_ID__Change_Flag;
	}

	public void setPrimary_Market_Quote_ID__Change_Flag(
			String primary_Market_Quote_ID__Change_Flag) {
		Primary_Market_Quote_ID__Change_Flag = primary_Market_Quote_ID__Change_Flag;
	}

	public String getPrimary_Market_Quote_ID__Previous() {
		return Primary_Market_Quote_ID__Previous;
	}

	public void setPrimary_Market_Quote_ID__Previous(
			String primary_Market_Quote_ID__Previous) {
		Primary_Market_Quote_ID__Previous = primary_Market_Quote_ID__Previous;
	}

	public String getPrimary_Reference_Market_Quote() {
		return Primary_Reference_Market_Quote;
	}

	public void setPrimary_Reference_Market_Quote(
			String primary_Reference_Market_Quote) {
		Primary_Reference_Market_Quote = primary_Reference_Market_Quote;
	}

	public String getPrimary_Reference_Market_Quote__Change_Flag() {
		return Primary_Reference_Market_Quote__Change_Flag;
	}

	public void setPrimary_Reference_Market_Quote__Change_Flag(
			String primary_Reference_Market_Quote__Change_Flag) {
		Primary_Reference_Market_Quote__Change_Flag = primary_Reference_Market_Quote__Change_Flag;
	}

	public String getPrimary_Reference_Market_Quote__Previous() {
		return Primary_Reference_Market_Quote__Previous;
	}

	public void setPrimary_Reference_Market_Quote__Previous(
			String primary_Reference_Market_Quote__Previous) {
		Primary_Reference_Market_Quote__Previous = primary_Reference_Market_Quote__Previous;
	}

	public String getPrimary_Tradable_Market_Quote() {
		return Primary_Tradable_Market_Quote;
	}

	public void setPrimary_Tradable_Market_Quote(
			String primary_Tradable_Market_Quote) {
		Primary_Tradable_Market_Quote = primary_Tradable_Market_Quote;
	}

	public String getPrimary_Tradable_Market_Quote__Change_Flag() {
		return Primary_Tradable_Market_Quote__Change_Flag;
	}

	public void setPrimary_Tradable_Market_Quote__Change_Flag(
			String primary_Tradable_Market_Quote__Change_Flag) {
		Primary_Tradable_Market_Quote__Change_Flag = primary_Tradable_Market_Quote__Change_Flag;
	}

	public String getPrimary_Tradable_Market_Quote__Previous() {
		return Primary_Tradable_Market_Quote__Previous;
	}

	public void setPrimary_Tradable_Market_Quote__Previous(
			String primary_Tradable_Market_Quote__Previous) {
		Primary_Tradable_Market_Quote__Previous = primary_Tradable_Market_Quote__Previous;
	}

	public String getPut_Call_Indicator() {
		return Put_Call_Indicator;
	}

	public void setPut_Call_Indicator(String put_Call_Indicator) {
		Put_Call_Indicator = put_Call_Indicator;
	}

	public String getPut_Call_Indicator__Change_Flag() {
		return Put_Call_Indicator__Change_Flag;
	}

	public void setPut_Call_Indicator__Change_Flag(
			String put_Call_Indicator__Change_Flag) {
		Put_Call_Indicator__Change_Flag = put_Call_Indicator__Change_Flag;
	}

	public String getPut_Call_Indicator__Previous() {
		return Put_Call_Indicator__Previous;
	}

	public void setPut_Call_Indicator__Previous(
			String put_Call_Indicator__Previous) {
		Put_Call_Indicator__Previous = put_Call_Indicator__Previous;
	}

	public String getQuote_Perm_ID() {
		return Quote_Perm_ID;
	}

	public void setQuote_Perm_ID(String quote_Perm_ID) {
		Quote_Perm_ID = quote_Perm_ID;
	}

	public String getQuote_Perm_ID__Change_Flag() {
		return Quote_Perm_ID__Change_Flag;
	}

	public void setQuote_Perm_ID__Change_Flag(String quote_Perm_ID__Change_Flag) {
		Quote_Perm_ID__Change_Flag = quote_Perm_ID__Change_Flag;
	}

	public String getQuote_Perm_ID__Previous() {
		return Quote_Perm_ID__Previous;
	}

	public void setQuote_Perm_ID__Previous(String quote_Perm_ID__Previous) {
		Quote_Perm_ID__Previous = quote_Perm_ID__Previous;
	}

	public String getQuotron_Symbol() {
		return Quotron_Symbol;
	}

	public void setQuotron_Symbol(String quotron_Symbol) {
		Quotron_Symbol = quotron_Symbol;
	}

	public String getQuotron_Symbol__Change_Flag() {
		return Quotron_Symbol__Change_Flag;
	}

	public void setQuotron_Symbol__Change_Flag(
			String quotron_Symbol__Change_Flag) {
		Quotron_Symbol__Change_Flag = quotron_Symbol__Change_Flag;
	}

	public String getQuotron_Symbol__Previous() {
		return Quotron_Symbol__Previous;
	}

	public void setQuotron_Symbol__Previous(String quotron_Symbol__Previous) {
		Quotron_Symbol__Previous = quotron_Symbol__Previous;
	}

	public String getRCS_Underlying_Product() {
		return RCS_Underlying_Product;
	}

	public void setRCS_Underlying_Product(String rCS_Underlying_Product) {
		RCS_Underlying_Product = rCS_Underlying_Product;
	}

	public String getRCS_Underlying_Product__Change_Flag() {
		return RCS_Underlying_Product__Change_Flag;
	}

	public void setRCS_Underlying_Product__Change_Flag(
			String rCS_Underlying_Product__Change_Flag) {
		RCS_Underlying_Product__Change_Flag = rCS_Underlying_Product__Change_Flag;
	}

	public String getRCS_Underlying_Product__Previous() {
		return RCS_Underlying_Product__Previous;
	}

	public void setRCS_Underlying_Product__Previous(
			String rCS_Underlying_Product__Previous) {
		RCS_Underlying_Product__Previous = rCS_Underlying_Product__Previous;
	}

	public String getRIC__Change_Flag() {
		return RIC__Change_Flag;
	}

	public void setRIC__Change_Flag(String rIC__Change_Flag) {
		RIC__Change_Flag = rIC__Change_Flag;
	}

	public String getRIC__Previous() {
		return RIC__Previous;
	}

	public void setRIC__Previous(String rIC__Previous) {
		RIC__Previous = rIC__Previous;
	}

	public String getRIC_Root() {
		return RIC_Root;
	}

	public void setRIC_Root(String rIC_Root) {
		RIC_Root = rIC_Root;
	}

	public String getRIC_Root__Change_Flag() {
		return RIC_Root__Change_Flag;
	}

	public void setRIC_Root__Change_Flag(String rIC_Root__Change_Flag) {
		RIC_Root__Change_Flag = rIC_Root__Change_Flag;
	}

	public String getRIC_Root__Previous() {
		return RIC_Root__Previous;
	}

	public void setRIC_Root__Previous(String rIC_Root__Previous) {
		RIC_Root__Previous = rIC_Root__Previous;
	}

	public String getRed_Chip_Flag() {
		return Red_Chip_Flag;
	}

	public void setRed_Chip_Flag(String red_Chip_Flag) {
		Red_Chip_Flag = red_Chip_Flag;
	}

	public String getRed_Chip_Flag__Change_Flag() {
		return Red_Chip_Flag__Change_Flag;
	}

	public void setRed_Chip_Flag__Change_Flag(String red_Chip_Flag__Change_Flag) {
		Red_Chip_Flag__Change_Flag = red_Chip_Flag__Change_Flag;
	}

	public String getRed_Chip_Flag__Previous() {
		return Red_Chip_Flag__Previous;
	}

	public void setRed_Chip_Flag__Previous(String red_Chip_Flag__Previous) {
		Red_Chip_Flag__Previous = red_Chip_Flag__Previous;
	}

	public String getReference_Rate() {
		return Reference_Rate;
	}

	public void setReference_Rate(String reference_Rate) {
		Reference_Rate = reference_Rate;
	}

	public String getReference_Rate__Change_Flag() {
		return Reference_Rate__Change_Flag;
	}

	public void setReference_Rate__Change_Flag(
			String reference_Rate__Change_Flag) {
		Reference_Rate__Change_Flag = reference_Rate__Change_Flag;
	}

	public String getReference_Rate__ESMA() {
		return Reference_Rate__ESMA;
	}

	public void setReference_Rate__ESMA(String reference_Rate__ESMA) {
		Reference_Rate__ESMA = reference_Rate__ESMA;
	}

	public String getReference_Rate__ESMA__Change_Flag() {
		return Reference_Rate__ESMA__Change_Flag;
	}

	public void setReference_Rate__ESMA__Change_Flag(
			String reference_Rate__ESMA__Change_Flag) {
		Reference_Rate__ESMA__Change_Flag = reference_Rate__ESMA__Change_Flag;
	}

	public String getReference_Rate__ESMA__Previous() {
		return Reference_Rate__ESMA__Previous;
	}

	public void setReference_Rate__ESMA__Previous(
			String reference_Rate__ESMA__Previous) {
		Reference_Rate__ESMA__Previous = reference_Rate__ESMA__Previous;
	}

	public String getReference_Rate__Previous() {
		return Reference_Rate__Previous;
	}

	public void setReference_Rate__Previous(String reference_Rate__Previous) {
		Reference_Rate__Previous = reference_Rate__Previous;
	}

	public String getRegulation_SHO_Flag() {
		return Regulation_SHO_Flag;
	}

	public void setRegulation_SHO_Flag(String regulation_SHO_Flag) {
		Regulation_SHO_Flag = regulation_SHO_Flag;
	}

	public String getRegulation_SHO_Flag__Change_Flag() {
		return Regulation_SHO_Flag__Change_Flag;
	}

	public void setRegulation_SHO_Flag__Change_Flag(
			String regulation_SHO_Flag__Change_Flag) {
		Regulation_SHO_Flag__Change_Flag = regulation_SHO_Flag__Change_Flag;
	}

	public String getRegulation_SHO_Flag__Previous() {
		return Regulation_SHO_Flag__Previous;
	}

	public void setRegulation_SHO_Flag__Previous(
			String regulation_SHO_Flag__Previous) {
		Regulation_SHO_Flag__Previous = regulation_SHO_Flag__Previous;
	}

	public String getRelated_News() {
		return Related_News;
	}

	public void setRelated_News(String related_News) {
		Related_News = related_News;
	}

	public String getRelated_News__Change_Flag() {
		return Related_News__Change_Flag;
	}

	public void setRelated_News__Change_Flag(String related_News__Change_Flag) {
		Related_News__Change_Flag = related_News__Change_Flag;
	}

	public String getRelated_News__Previous() {
		return Related_News__Previous;
	}

	public void setRelated_News__Previous(String related_News__Previous) {
		Related_News__Previous = related_News__Previous;
	}

	public String getRequest_for_Admission_to_Trading_by_Issuer() {
		return Request_for_Admission_to_Trading_by_Issuer;
	}

	public void setRequest_for_Admission_to_Trading_by_Issuer(
			String request_for_Admission_to_Trading_by_Issuer) {
		Request_for_Admission_to_Trading_by_Issuer = request_for_Admission_to_Trading_by_Issuer;
	}

	public String getRequest_for_Admission_to_Trading_by_Issuer__Change_Flag() {
		return Request_for_Admission_to_Trading_by_Issuer__Change_Flag;
	}

	public void setRequest_for_Admission_to_Trading_by_Issuer__Change_Flag(
			String request_for_Admission_to_Trading_by_Issuer__Change_Flag) {
		Request_for_Admission_to_Trading_by_Issuer__Change_Flag = request_for_Admission_to_Trading_by_Issuer__Change_Flag;
	}

	public String getRequest_for_Admission_to_Trading_by_Issuer__ESMA() {
		return Request_for_Admission_to_Trading_by_Issuer__ESMA;
	}

	public void setRequest_for_Admission_to_Trading_by_Issuer__ESMA(
			String request_for_Admission_to_Trading_by_Issuer__ESMA) {
		Request_for_Admission_to_Trading_by_Issuer__ESMA = request_for_Admission_to_Trading_by_Issuer__ESMA;
	}

	public String getRequest_for_Admission_to_Trading_by_Issuer__ESMA__Change_Flag() {
		return Request_for_Admission_to_Trading_by_Issuer__ESMA__Change_Flag;
	}

	public void setRequest_for_Admission_to_Trading_by_Issuer__ESMA__Change_Flag(
			String request_for_Admission_to_Trading_by_Issuer__ESMA__Change_Flag) {
		Request_for_Admission_to_Trading_by_Issuer__ESMA__Change_Flag = request_for_Admission_to_Trading_by_Issuer__ESMA__Change_Flag;
	}

	public String getRequest_for_Admission_to_Trading_by_Issuer__ESMA__Previous() {
		return Request_for_Admission_to_Trading_by_Issuer__ESMA__Previous;
	}

	public void setRequest_for_Admission_to_Trading_by_Issuer__ESMA__Previous(
			String request_for_Admission_to_Trading_by_Issuer__ESMA__Previous) {
		Request_for_Admission_to_Trading_by_Issuer__ESMA__Previous = request_for_Admission_to_Trading_by_Issuer__ESMA__Previous;
	}

	public String getRequest_for_Admission_to_Trading_by_Issuer__Previous() {
		return Request_for_Admission_to_Trading_by_Issuer__Previous;
	}

	public void setRequest_for_Admission_to_Trading_by_Issuer__Previous(
			String request_for_Admission_to_Trading_by_Issuer__Previous) {
		Request_for_Admission_to_Trading_by_Issuer__Previous = request_for_Admission_to_Trading_by_Issuer__Previous;
	}

	public String getReturn_Payout_Trigger() {
		return Return_Payout_Trigger;
	}

	public void setReturn_Payout_Trigger(String return_Payout_Trigger) {
		Return_Payout_Trigger = return_Payout_Trigger;
	}

	public String getReturn_Payout_Trigger__Change_Flag() {
		return Return_Payout_Trigger__Change_Flag;
	}

	public void setReturn_Payout_Trigger__Change_Flag(
			String return_Payout_Trigger__Change_Flag) {
		Return_Payout_Trigger__Change_Flag = return_Payout_Trigger__Change_Flag;
	}

	public String getReturn_Payout_Trigger__Previous() {
		return Return_Payout_Trigger__Previous;
	}

	public void setReturn_Payout_Trigger__Previous(
			String return_Payout_Trigger__Previous) {
		Return_Payout_Trigger__Previous = return_Payout_Trigger__Previous;
	}

	public String getReuters_Editorial_RIC() {
		return Reuters_Editorial_RIC;
	}

	public void setReuters_Editorial_RIC(String reuters_Editorial_RIC) {
		Reuters_Editorial_RIC = reuters_Editorial_RIC;
	}

	public String getReuters_Editorial_RIC__Change_Flag() {
		return Reuters_Editorial_RIC__Change_Flag;
	}

	public void setReuters_Editorial_RIC__Change_Flag(
			String reuters_Editorial_RIC__Change_Flag) {
		Reuters_Editorial_RIC__Change_Flag = reuters_Editorial_RIC__Change_Flag;
	}

	public String getReuters_Editorial_RIC__Previous() {
		return Reuters_Editorial_RIC__Previous;
	}

	public void setReuters_Editorial_RIC__Previous(
			String reuters_Editorial_RIC__Previous) {
		Reuters_Editorial_RIC__Previous = reuters_Editorial_RIC__Previous;
	}

	public String getReverse_Level() {
		return Reverse_Level;
	}

	public void setReverse_Level(String reverse_Level) {
		Reverse_Level = reverse_Level;
	}

	public String getReverse_Level__Change_Flag() {
		return Reverse_Level__Change_Flag;
	}

	public void setReverse_Level__Change_Flag(String reverse_Level__Change_Flag) {
		Reverse_Level__Change_Flag = reverse_Level__Change_Flag;
	}

	public String getReverse_Level__Previous() {
		return Reverse_Level__Previous;
	}

	public void setReverse_Level__Previous(String reverse_Level__Previous) {
		Reverse_Level__Previous = reverse_Level__Previous;
	}

	public String getRio_De_Janeiro_Code() {
		return Rio_De_Janeiro_Code;
	}

	public void setRio_De_Janeiro_Code(String rio_De_Janeiro_Code) {
		Rio_De_Janeiro_Code = rio_De_Janeiro_Code;
	}

	public String getRio_De_Janeiro_Code__Change_Flag() {
		return Rio_De_Janeiro_Code__Change_Flag;
	}

	public void setRio_De_Janeiro_Code__Change_Flag(
			String rio_De_Janeiro_Code__Change_Flag) {
		Rio_De_Janeiro_Code__Change_Flag = rio_De_Janeiro_Code__Change_Flag;
	}

	public String getRio_De_Janeiro_Code__Previous() {
		return Rio_De_Janeiro_Code__Previous;
	}

	public void setRio_De_Janeiro_Code__Previous(
			String rio_De_Janeiro_Code__Previous) {
		Rio_De_Janeiro_Code__Previous = rio_De_Janeiro_Code__Previous;
	}

	public String getRisk_Alert() {
		return Risk_Alert;
	}

	public void setRisk_Alert(String risk_Alert) {
		Risk_Alert = risk_Alert;
	}

	public String getRisk_Alert__Change_Flag() {
		return Risk_Alert__Change_Flag;
	}

	public void setRisk_Alert__Change_Flag(String risk_Alert__Change_Flag) {
		Risk_Alert__Change_Flag = risk_Alert__Change_Flag;
	}

	public String getRisk_Alert__Previous() {
		return Risk_Alert__Previous;
	}

	public void setRisk_Alert__Previous(String risk_Alert__Previous) {
		Risk_Alert__Previous = risk_Alert__Previous;
	}

	public String getRoll_Months() {
		return Roll_Months;
	}

	public void setRoll_Months(String roll_Months) {
		Roll_Months = roll_Months;
	}

	public String getRoll_Months__Change_Flag() {
		return Roll_Months__Change_Flag;
	}

	public void setRoll_Months__Change_Flag(String roll_Months__Change_Flag) {
		Roll_Months__Change_Flag = roll_Months__Change_Flag;
	}

	public String getRoll_Months__Previous() {
		return Roll_Months__Previous;
	}

	public void setRoll_Months__Previous(String roll_Months__Previous) {
		Roll_Months__Previous = roll_Months__Previous;
	}

	public String getRound_Lot_Size() {
		return Round_Lot_Size;
	}

	public void setRound_Lot_Size(String round_Lot_Size) {
		Round_Lot_Size = round_Lot_Size;
	}

	public String getRound_Lot_Size__Change_Flag() {
		return Round_Lot_Size__Change_Flag;
	}

	public void setRound_Lot_Size__Change_Flag(
			String round_Lot_Size__Change_Flag) {
		Round_Lot_Size__Change_Flag = round_Lot_Size__Change_Flag;
	}

	public String getRound_Lot_Size__Previous() {
		return Round_Lot_Size__Previous;
	}

	public void setRound_Lot_Size__Previous(String round_Lot_Size__Previous) {
		Round_Lot_Size__Previous = round_Lot_Size__Previous;
	}

	public String getRoute_or_Time_Charter_Average() {
		return Route_or_Time_Charter_Average;
	}

	public void setRoute_or_Time_Charter_Average(
			String route_or_Time_Charter_Average) {
		Route_or_Time_Charter_Average = route_or_Time_Charter_Average;
	}

	public String getRoute_or_Time_Charter_Average__Change_Flag() {
		return Route_or_Time_Charter_Average__Change_Flag;
	}

	public void setRoute_or_Time_Charter_Average__Change_Flag(
			String route_or_Time_Charter_Average__Change_Flag) {
		Route_or_Time_Charter_Average__Change_Flag = route_or_Time_Charter_Average__Change_Flag;
	}

	public String getRoute_or_Time_Charter_Average__Previous() {
		return Route_or_Time_Charter_Average__Previous;
	}

	public void setRoute_or_Time_Charter_Average__Previous(
			String route_or_Time_Charter_Average__Previous) {
		Route_or_Time_Charter_Average__Previous = route_or_Time_Charter_Average__Previous;
	}

	public String getSEC_Section12() {
		return SEC_Section12;
	}

	public void setSEC_Section12(String sEC_Section12) {
		SEC_Section12 = sEC_Section12;
	}

	public String getSEC_Section12__Change_Flag() {
		return SEC_Section12__Change_Flag;
	}

	public void setSEC_Section12__Change_Flag(String sEC_Section12__Change_Flag) {
		SEC_Section12__Change_Flag = sEC_Section12__Change_Flag;
	}

	public String getSEC_Section12__Previous() {
		return SEC_Section12__Previous;
	}

	public void setSEC_Section12__Previous(String sEC_Section12__Previous) {
		SEC_Section12__Previous = sEC_Section12__Previous;
	}

	public String getSEDOL() {
		return SEDOL;
	}

	public void setSEDOL(String sEDOL) {
		SEDOL = sEDOL;
	}

	public String getSEDOL__Change_Flag() {
		return SEDOL__Change_Flag;
	}

	public void setSEDOL__Change_Flag(String sEDOL__Change_Flag) {
		SEDOL__Change_Flag = sEDOL__Change_Flag;
	}

	public String getSEDOL__Previous() {
		return SEDOL__Previous;
	}

	public void setSEDOL__Previous(String sEDOL__Previous) {
		SEDOL__Previous = sEDOL__Previous;
	}

	public String getSICC_Sector_Code() {
		return SICC_Sector_Code;
	}

	public void setSICC_Sector_Code(String sICC_Sector_Code) {
		SICC_Sector_Code = sICC_Sector_Code;
	}

	public String getSICC_Sector_Code__Change_Flag() {
		return SICC_Sector_Code__Change_Flag;
	}

	public void setSICC_Sector_Code__Change_Flag(
			String sICC_Sector_Code__Change_Flag) {
		SICC_Sector_Code__Change_Flag = sICC_Sector_Code__Change_Flag;
	}

	public String getSICC_Sector_Code__Previous() {
		return SICC_Sector_Code__Previous;
	}

	public void setSICC_Sector_Code__Previous(String sICC_Sector_Code__Previous) {
		SICC_Sector_Code__Previous = sICC_Sector_Code__Previous;
	}

	public String getSICC_Securities_Code() {
		return SICC_Securities_Code;
	}

	public void setSICC_Securities_Code(String sICC_Securities_Code) {
		SICC_Securities_Code = sICC_Securities_Code;
	}

	public String getSICC_Securities_Code__Change_Flag() {
		return SICC_Securities_Code__Change_Flag;
	}

	public void setSICC_Securities_Code__Change_Flag(
			String sICC_Securities_Code__Change_Flag) {
		SICC_Securities_Code__Change_Flag = sICC_Securities_Code__Change_Flag;
	}

	public String getSICC_Securities_Code__Previous() {
		return SICC_Securities_Code__Previous;
	}

	public void setSICC_Securities_Code__Previous(
			String sICC_Securities_Code__Previous) {
		SICC_Securities_Code__Previous = sICC_Securities_Code__Previous;
	}

	public String getSao_Paulo_Code() {
		return Sao_Paulo_Code;
	}

	public void setSao_Paulo_Code(String sao_Paulo_Code) {
		Sao_Paulo_Code = sao_Paulo_Code;
	}

	public String getSao_Paulo_Code__Change_Flag() {
		return Sao_Paulo_Code__Change_Flag;
	}

	public void setSao_Paulo_Code__Change_Flag(
			String sao_Paulo_Code__Change_Flag) {
		Sao_Paulo_Code__Change_Flag = sao_Paulo_Code__Change_Flag;
	}

	public String getSao_Paulo_Code__Previous() {
		return Sao_Paulo_Code__Previous;
	}

	public void setSao_Paulo_Code__Previous(String sao_Paulo_Code__Previous) {
		Sao_Paulo_Code__Previous = sao_Paulo_Code__Previous;
	}

	public String getSearch_Display_Name() {
		return Search_Display_Name;
	}

	public void setSearch_Display_Name(String search_Display_Name) {
		Search_Display_Name = search_Display_Name;
	}

	public String getSearch_Display_Name__Change_Flag() {
		return Search_Display_Name__Change_Flag;
	}

	public void setSearch_Display_Name__Change_Flag(
			String search_Display_Name__Change_Flag) {
		Search_Display_Name__Change_Flag = search_Display_Name__Change_Flag;
	}

	public String getSearch_Display_Name__Previous() {
		return Search_Display_Name__Previous;
	}

	public void setSearch_Display_Name__Previous(
			String search_Display_Name__Previous) {
		Search_Display_Name__Previous = search_Display_Name__Previous;
	}

	public String getSecondary_Asset_Underlying_Quote_ID() {
		return Secondary_Asset_Underlying_Quote_ID;
	}

	public void setSecondary_Asset_Underlying_Quote_ID(
			String secondary_Asset_Underlying_Quote_ID) {
		Secondary_Asset_Underlying_Quote_ID = secondary_Asset_Underlying_Quote_ID;
	}

	public String getSecondary_Asset_Underlying_Quote_ID__Change_Flag() {
		return Secondary_Asset_Underlying_Quote_ID__Change_Flag;
	}

	public void setSecondary_Asset_Underlying_Quote_ID__Change_Flag(
			String secondary_Asset_Underlying_Quote_ID__Change_Flag) {
		Secondary_Asset_Underlying_Quote_ID__Change_Flag = secondary_Asset_Underlying_Quote_ID__Change_Flag;
	}

	public String getSecondary_Asset_Underlying_Quote_ID__Previous() {
		return Secondary_Asset_Underlying_Quote_ID__Previous;
	}

	public void setSecondary_Asset_Underlying_Quote_ID__Previous(
			String secondary_Asset_Underlying_Quote_ID__Previous) {
		Secondary_Asset_Underlying_Quote_ID__Previous = secondary_Asset_Underlying_Quote_ID__Previous;
	}

	public String getSecondary_Currency_Code() {
		return Secondary_Currency_Code;
	}

	public void setSecondary_Currency_Code(String secondary_Currency_Code) {
		Secondary_Currency_Code = secondary_Currency_Code;
	}

	public String getSecondary_Currency_Code__Change_Flag() {
		return Secondary_Currency_Code__Change_Flag;
	}

	public void setSecondary_Currency_Code__Change_Flag(
			String secondary_Currency_Code__Change_Flag) {
		Secondary_Currency_Code__Change_Flag = secondary_Currency_Code__Change_Flag;
	}

	public String getSecondary_Currency_Code__Previous() {
		return Secondary_Currency_Code__Previous;
	}

	public void setSecondary_Currency_Code__Previous(
			String secondary_Currency_Code__Previous) {
		Secondary_Currency_Code__Previous = secondary_Currency_Code__Previous;
	}

	public String getSecondary_Underlying_Asset() {
		return Secondary_Underlying_Asset;
	}

	public void setSecondary_Underlying_Asset(String secondary_Underlying_Asset) {
		Secondary_Underlying_Asset = secondary_Underlying_Asset;
	}

	public String getSecondary_Underlying_Asset__Change_Flag() {
		return Secondary_Underlying_Asset__Change_Flag;
	}

	public void setSecondary_Underlying_Asset__Change_Flag(
			String secondary_Underlying_Asset__Change_Flag) {
		Secondary_Underlying_Asset__Change_Flag = secondary_Underlying_Asset__Change_Flag;
	}

	public String getSecondary_Underlying_Asset__Previous() {
		return Secondary_Underlying_Asset__Previous;
	}

	public void setSecondary_Underlying_Asset__Previous(
			String secondary_Underlying_Asset__Previous) {
		Secondary_Underlying_Asset__Previous = secondary_Underlying_Asset__Previous;
	}

	public String getSecurity_Description() {
		return Security_Description;
	}

	public void setSecurity_Description(String security_Description) {
		Security_Description = security_Description;
	}

	public String getSecurity_Description__Change_Flag() {
		return Security_Description__Change_Flag;
	}

	public void setSecurity_Description__Change_Flag(
			String security_Description__Change_Flag) {
		Security_Description__Change_Flag = security_Description__Change_Flag;
	}

	public String getSecurity_Description__Previous() {
		return Security_Description__Previous;
	}

	public void setSecurity_Description__Previous(
			String security_Description__Previous) {
		Security_Description__Previous = security_Description__Previous;
	}

	public String getSecurity_Long_Description() {
		return Security_Long_Description;
	}

	public void setSecurity_Long_Description(String security_Long_Description) {
		Security_Long_Description = security_Long_Description;
	}

	public String getSecurity_Long_Description__Change_Flag() {
		return Security_Long_Description__Change_Flag;
	}

	public void setSecurity_Long_Description__Change_Flag(
			String security_Long_Description__Change_Flag) {
		Security_Long_Description__Change_Flag = security_Long_Description__Change_Flag;
	}

	public String getSecurity_Long_Description__Previous() {
		return Security_Long_Description__Previous;
	}

	public void setSecurity_Long_Description__Previous(
			String security_Long_Description__Previous) {
		Security_Long_Description__Previous = security_Long_Description__Previous;
	}

	public String getSeries_Description() {
		return Series_Description;
	}

	public void setSeries_Description(String series_Description) {
		Series_Description = series_Description;
	}

	public String getSeries_Description__Change_Flag() {
		return Series_Description__Change_Flag;
	}

	public void setSeries_Description__Change_Flag(
			String series_Description__Change_Flag) {
		Series_Description__Change_Flag = series_Description__Change_Flag;
	}

	public String getSeries_Description__Previous() {
		return Series_Description__Previous;
	}

	public void setSeries_Description__Previous(
			String series_Description__Previous) {
		Series_Description__Previous = series_Description__Previous;
	}

	public String getSettlement_Period() {
		return Settlement_Period;
	}

	public void setSettlement_Period(String settlement_Period) {
		Settlement_Period = settlement_Period;
	}

	public String getSettlement_Period__Change_Flag() {
		return Settlement_Period__Change_Flag;
	}

	public void setSettlement_Period__Change_Flag(
			String settlement_Period__Change_Flag) {
		Settlement_Period__Change_Flag = settlement_Period__Change_Flag;
	}

	public String getSettlement_Period__Previous() {
		return Settlement_Period__Previous;
	}

	public void setSettlement_Period__Previous(
			String settlement_Period__Previous) {
		Settlement_Period__Previous = settlement_Period__Previous;
	}

	public String getSettlement_Type() {
		return Settlement_Type;
	}

	public void setSettlement_Type(String settlement_Type) {
		Settlement_Type = settlement_Type;
	}

	public String getSettlement_Type__Change_Flag() {
		return Settlement_Type__Change_Flag;
	}

	public void setSettlement_Type__Change_Flag(
			String settlement_Type__Change_Flag) {
		Settlement_Type__Change_Flag = settlement_Type__Change_Flag;
	}

	public String getSettlement_Type__Previous() {
		return Settlement_Type__Previous;
	}

	public void setSettlement_Type__Previous(String settlement_Type__Previous) {
		Settlement_Type__Previous = settlement_Type__Previous;
	}

	public String getShare_Class() {
		return Share_Class;
	}

	public void setShare_Class(String share_Class) {
		Share_Class = share_Class;
	}

	public String getShare_Class__Change_Flag() {
		return Share_Class__Change_Flag;
	}

	public void setShare_Class__Change_Flag(String share_Class__Change_Flag) {
		Share_Class__Change_Flag = share_Class__Change_Flag;
	}

	public String getShare_Class__Previous() {
		return Share_Class__Previous;
	}

	public void setShare_Class__Previous(String share_Class__Previous) {
		Share_Class__Previous = share_Class__Previous;
	}

	public String getShort_Sell_Restriction_Type() {
		return Short_Sell_Restriction_Type;
	}

	public void setShort_Sell_Restriction_Type(
			String short_Sell_Restriction_Type) {
		Short_Sell_Restriction_Type = short_Sell_Restriction_Type;
	}

	public String getShort_Sell_Restriction_Type__Change_Flag() {
		return Short_Sell_Restriction_Type__Change_Flag;
	}

	public void setShort_Sell_Restriction_Type__Change_Flag(
			String short_Sell_Restriction_Type__Change_Flag) {
		Short_Sell_Restriction_Type__Change_Flag = short_Sell_Restriction_Type__Change_Flag;
	}

	public String getShort_Sell_Restriction_Type__Previous() {
		return Short_Sell_Restriction_Type__Previous;
	}

	public void setShort_Sell_Restriction_Type__Previous(
			String short_Sell_Restriction_Type__Previous) {
		Short_Sell_Restriction_Type__Previous = short_Sell_Restriction_Type__Previous;
	}

	public String getSingapore_Code() {
		return Singapore_Code;
	}

	public void setSingapore_Code(String singapore_Code) {
		Singapore_Code = singapore_Code;
	}

	public String getSingapore_Code__Change_Flag() {
		return Singapore_Code__Change_Flag;
	}

	public void setSingapore_Code__Change_Flag(
			String singapore_Code__Change_Flag) {
		Singapore_Code__Change_Flag = singapore_Code__Change_Flag;
	}

	public String getSingapore_Code__Previous() {
		return Singapore_Code__Previous;
	}

	public void setSingapore_Code__Previous(String singapore_Code__Previous) {
		Singapore_Code__Previous = singapore_Code__Previous;
	}

	public String getSource_Name() {
		return Source_Name;
	}

	public void setSource_Name(String source_Name) {
		Source_Name = source_Name;
	}

	public String getSource_Name__Change_Flag() {
		return Source_Name__Change_Flag;
	}

	public void setSource_Name__Change_Flag(String source_Name__Change_Flag) {
		Source_Name__Change_Flag = source_Name__Change_Flag;
	}

	public String getSource_Name__Previous() {
		return Source_Name__Previous;
	}

	public void setSource_Name__Previous(String source_Name__Previous) {
		Source_Name__Previous = source_Name__Previous;
	}

	public String getSource_Type() {
		return Source_Type;
	}

	public void setSource_Type(String source_Type) {
		Source_Type = source_Type;
	}

	public String getSource_Type__Change_Flag() {
		return Source_Type__Change_Flag;
	}

	public void setSource_Type__Change_Flag(String source_Type__Change_Flag) {
		Source_Type__Change_Flag = source_Type__Change_Flag;
	}

	public String getSource_Type__Previous() {
		return Source_Type__Previous;
	}

	public void setSource_Type__Previous(String source_Type__Previous) {
		Source_Type__Previous = source_Type__Previous;
	}

	public String getSovereign_Issuer_Flag() {
		return Sovereign_Issuer_Flag;
	}

	public void setSovereign_Issuer_Flag(String sovereign_Issuer_Flag) {
		Sovereign_Issuer_Flag = sovereign_Issuer_Flag;
	}

	public String getSovereign_Issuer_Flag__Change_Flag() {
		return Sovereign_Issuer_Flag__Change_Flag;
	}

	public void setSovereign_Issuer_Flag__Change_Flag(
			String sovereign_Issuer_Flag__Change_Flag) {
		Sovereign_Issuer_Flag__Change_Flag = sovereign_Issuer_Flag__Change_Flag;
	}

	public String getSovereign_Issuer_Flag__ESMA() {
		return Sovereign_Issuer_Flag__ESMA;
	}

	public void setSovereign_Issuer_Flag__ESMA(
			String sovereign_Issuer_Flag__ESMA) {
		Sovereign_Issuer_Flag__ESMA = sovereign_Issuer_Flag__ESMA;
	}

	public String getSovereign_Issuer_Flag__ESMA__Change_Flag() {
		return Sovereign_Issuer_Flag__ESMA__Change_Flag;
	}

	public void setSovereign_Issuer_Flag__ESMA__Change_Flag(
			String sovereign_Issuer_Flag__ESMA__Change_Flag) {
		Sovereign_Issuer_Flag__ESMA__Change_Flag = sovereign_Issuer_Flag__ESMA__Change_Flag;
	}

	public String getSovereign_Issuer_Flag__ESMA__Previous() {
		return Sovereign_Issuer_Flag__ESMA__Previous;
	}

	public void setSovereign_Issuer_Flag__ESMA__Previous(
			String sovereign_Issuer_Flag__ESMA__Previous) {
		Sovereign_Issuer_Flag__ESMA__Previous = sovereign_Issuer_Flag__ESMA__Previous;
	}

	public String getSovereign_Issuer_Flag__Previous() {
		return Sovereign_Issuer_Flag__Previous;
	}

	public void setSovereign_Issuer_Flag__Previous(
			String sovereign_Issuer_Flag__Previous) {
		Sovereign_Issuer_Flag__Previous = sovereign_Issuer_Flag__Previous;
	}

	public String getStamp_Duty_Country_1() {
		return Stamp_Duty_Country_1;
	}

	public void setStamp_Duty_Country_1(String stamp_Duty_Country_1) {
		Stamp_Duty_Country_1 = stamp_Duty_Country_1;
	}

	public String getStamp_Duty_Country_1__Change_Flag() {
		return Stamp_Duty_Country_1__Change_Flag;
	}

	public void setStamp_Duty_Country_1__Change_Flag(
			String stamp_Duty_Country_1__Change_Flag) {
		Stamp_Duty_Country_1__Change_Flag = stamp_Duty_Country_1__Change_Flag;
	}

	public String getStamp_Duty_Country_1__Previous() {
		return Stamp_Duty_Country_1__Previous;
	}

	public void setStamp_Duty_Country_1__Previous(
			String stamp_Duty_Country_1__Previous) {
		Stamp_Duty_Country_1__Previous = stamp_Duty_Country_1__Previous;
	}

	public String getStamp_Duty_Country_2() {
		return Stamp_Duty_Country_2;
	}

	public void setStamp_Duty_Country_2(String stamp_Duty_Country_2) {
		Stamp_Duty_Country_2 = stamp_Duty_Country_2;
	}

	public String getStamp_Duty_Country_2__Change_Flag() {
		return Stamp_Duty_Country_2__Change_Flag;
	}

	public void setStamp_Duty_Country_2__Change_Flag(
			String stamp_Duty_Country_2__Change_Flag) {
		Stamp_Duty_Country_2__Change_Flag = stamp_Duty_Country_2__Change_Flag;
	}

	public String getStamp_Duty_Country_2__Previous() {
		return Stamp_Duty_Country_2__Previous;
	}

	public void setStamp_Duty_Country_2__Previous(
			String stamp_Duty_Country_2__Previous) {
		Stamp_Duty_Country_2__Previous = stamp_Duty_Country_2__Previous;
	}

	public String getStamp_Duty_Flag() {
		return Stamp_Duty_Flag;
	}

	public void setStamp_Duty_Flag(String stamp_Duty_Flag) {
		Stamp_Duty_Flag = stamp_Duty_Flag;
	}

	public String getStamp_Duty_Flag__Change_Flag() {
		return Stamp_Duty_Flag__Change_Flag;
	}

	public void setStamp_Duty_Flag__Change_Flag(
			String stamp_Duty_Flag__Change_Flag) {
		Stamp_Duty_Flag__Change_Flag = stamp_Duty_Flag__Change_Flag;
	}

	public String getStamp_Duty_Flag__Previous() {
		return Stamp_Duty_Flag__Previous;
	}

	public void setStamp_Duty_Flag__Previous(String stamp_Duty_Flag__Previous) {
		Stamp_Duty_Flag__Previous = stamp_Duty_Flag__Previous;
	}

	public String getStart_date() {
		return Start_date;
	}

	public void setStart_date(String start_date) {
		Start_date = start_date;
	}

	public String getStart_date__Change_Flag() {
		return Start_date__Change_Flag;
	}

	public void setStart_date__Change_Flag(String start_date__Change_Flag) {
		Start_date__Change_Flag = start_date__Change_Flag;
	}

	public String getStart_date__Previous() {
		return Start_date__Previous;
	}

	public void setStart_date__Previous(String start_date__Previous) {
		Start_date__Previous = start_date__Previous;
	}

	public String getStrike_Price() {
		return Strike_Price;
	}

	public void setStrike_Price(String strike_Price) {
		Strike_Price = strike_Price;
	}

	public String getStrike_Price__Change_Flag() {
		return Strike_Price__Change_Flag;
	}

	public void setStrike_Price__Change_Flag(String strike_Price__Change_Flag) {
		Strike_Price__Change_Flag = strike_Price__Change_Flag;
	}

	public String getStrike_Price__ESMA() {
		return Strike_Price__ESMA;
	}

	public void setStrike_Price__ESMA(String strike_Price__ESMA) {
		Strike_Price__ESMA = strike_Price__ESMA;
	}

	public String getStrike_Price__ESMA__Change_Flag() {
		return Strike_Price__ESMA__Change_Flag;
	}

	public void setStrike_Price__ESMA__Change_Flag(
			String strike_Price__ESMA__Change_Flag) {
		Strike_Price__ESMA__Change_Flag = strike_Price__ESMA__Change_Flag;
	}

	public String getStrike_Price__ESMA__Previous() {
		return Strike_Price__ESMA__Previous;
	}

	public void setStrike_Price__ESMA__Previous(
			String strike_Price__ESMA__Previous) {
		Strike_Price__ESMA__Previous = strike_Price__ESMA__Previous;
	}

	public String getStrike_Price__Previous() {
		return Strike_Price__Previous;
	}

	public void setStrike_Price__Previous(String strike_Price__Previous) {
		Strike_Price__Previous = strike_Price__Previous;
	}

	public String getStrike_Price_Currency__ESMA() {
		return Strike_Price_Currency__ESMA;
	}

	public void setStrike_Price_Currency__ESMA(
			String strike_Price_Currency__ESMA) {
		Strike_Price_Currency__ESMA = strike_Price_Currency__ESMA;
	}

	public String getStrike_Price_Currency__ESMA__Change_Flag() {
		return Strike_Price_Currency__ESMA__Change_Flag;
	}

	public void setStrike_Price_Currency__ESMA__Change_Flag(
			String strike_Price_Currency__ESMA__Change_Flag) {
		Strike_Price_Currency__ESMA__Change_Flag = strike_Price_Currency__ESMA__Change_Flag;
	}

	public String getStrike_Price_Currency__ESMA__Previous() {
		return Strike_Price_Currency__ESMA__Previous;
	}

	public void setStrike_Price_Currency__ESMA__Previous(
			String strike_Price_Currency__ESMA__Previous) {
		Strike_Price_Currency__ESMA__Previous = strike_Price_Currency__ESMA__Previous;
	}

	public String getStrike_Price_Currency_Code() {
		return Strike_Price_Currency_Code;
	}

	public void setStrike_Price_Currency_Code(String strike_Price_Currency_Code) {
		Strike_Price_Currency_Code = strike_Price_Currency_Code;
	}

	public String getStrike_Price_Currency_Code__Change_Flag() {
		return Strike_Price_Currency_Code__Change_Flag;
	}

	public void setStrike_Price_Currency_Code__Change_Flag(
			String strike_Price_Currency_Code__Change_Flag) {
		Strike_Price_Currency_Code__Change_Flag = strike_Price_Currency_Code__Change_Flag;
	}

	public String getStrike_Price_Currency_Code__Previous() {
		return Strike_Price_Currency_Code__Previous;
	}

	public void setStrike_Price_Currency_Code__Previous(
			String strike_Price_Currency_Code__Previous) {
		Strike_Price_Currency_Code__Previous = strike_Price_Currency_Code__Previous;
	}

	public String getStrike_Price_Multiplier() {
		return Strike_Price_Multiplier;
	}

	public void setStrike_Price_Multiplier(String strike_Price_Multiplier) {
		Strike_Price_Multiplier = strike_Price_Multiplier;
	}

	public String getStrike_Price_Multiplier__Change_Flag() {
		return Strike_Price_Multiplier__Change_Flag;
	}

	public void setStrike_Price_Multiplier__Change_Flag(
			String strike_Price_Multiplier__Change_Flag) {
		Strike_Price_Multiplier__Change_Flag = strike_Price_Multiplier__Change_Flag;
	}

	public String getStrike_Price_Multiplier__Previous() {
		return Strike_Price_Multiplier__Previous;
	}

	public void setStrike_Price_Multiplier__Previous(
			String strike_Price_Multiplier__Previous) {
		Strike_Price_Multiplier__Previous = strike_Price_Multiplier__Previous;
	}

	public String getSuspend_Flag() {
		return Suspend_Flag;
	}

	public void setSuspend_Flag(String suspend_Flag) {
		Suspend_Flag = suspend_Flag;
	}

	public String getSuspend_Flag__Change_Flag() {
		return Suspend_Flag__Change_Flag;
	}

	public void setSuspend_Flag__Change_Flag(String suspend_Flag__Change_Flag) {
		Suspend_Flag__Change_Flag = suspend_Flag__Change_Flag;
	}

	public String getSuspend_Flag__Previous() {
		return Suspend_Flag__Previous;
	}

	public void setSuspend_Flag__Previous(String suspend_Flag__Previous) {
		Suspend_Flag__Previous = suspend_Flag__Previous;
	}

	public String getSuspension_Category__ESMA() {
		return Suspension_Category__ESMA;
	}

	public void setSuspension_Category__ESMA(String suspension_Category__ESMA) {
		Suspension_Category__ESMA = suspension_Category__ESMA;
	}

	public String getSuspension_Category__ESMA__Change_Flag() {
		return Suspension_Category__ESMA__Change_Flag;
	}

	public void setSuspension_Category__ESMA__Change_Flag(
			String suspension_Category__ESMA__Change_Flag) {
		Suspension_Category__ESMA__Change_Flag = suspension_Category__ESMA__Change_Flag;
	}

	public String getSuspension_Category__ESMA__Previous() {
		return Suspension_Category__ESMA__Previous;
	}

	public void setSuspension_Category__ESMA__Previous(
			String suspension_Category__ESMA__Previous) {
		Suspension_Category__ESMA__Previous = suspension_Category__ESMA__Previous;
	}

	public String getSuspension_Ended_On__ESMA() {
		return Suspension_Ended_On__ESMA;
	}

	public void setSuspension_Ended_On__ESMA(String suspension_Ended_On__ESMA) {
		Suspension_Ended_On__ESMA = suspension_Ended_On__ESMA;
	}

	public String getSuspension_Ended_On__ESMA__Change_Flag() {
		return Suspension_Ended_On__ESMA__Change_Flag;
	}

	public void setSuspension_Ended_On__ESMA__Change_Flag(
			String suspension_Ended_On__ESMA__Change_Flag) {
		Suspension_Ended_On__ESMA__Change_Flag = suspension_Ended_On__ESMA__Change_Flag;
	}

	public String getSuspension_Ended_On__ESMA__Previous() {
		return Suspension_Ended_On__ESMA__Previous;
	}

	public void setSuspension_Ended_On__ESMA__Previous(
			String suspension_Ended_On__ESMA__Previous) {
		Suspension_Ended_On__ESMA__Previous = suspension_Ended_On__ESMA__Previous;
	}

	public String getSuspension_On_Going__ESMA() {
		return Suspension_On_Going__ESMA;
	}

	public void setSuspension_On_Going__ESMA(String suspension_On_Going__ESMA) {
		Suspension_On_Going__ESMA = suspension_On_Going__ESMA;
	}

	public String getSuspension_On_Going__ESMA__Change_Flag() {
		return Suspension_On_Going__ESMA__Change_Flag;
	}

	public void setSuspension_On_Going__ESMA__Change_Flag(
			String suspension_On_Going__ESMA__Change_Flag) {
		Suspension_On_Going__ESMA__Change_Flag = suspension_On_Going__ESMA__Change_Flag;
	}

	public String getSuspension_On_Going__ESMA__Previous() {
		return Suspension_On_Going__ESMA__Previous;
	}

	public void setSuspension_On_Going__ESMA__Previous(
			String suspension_On_Going__ESMA__Previous) {
		Suspension_On_Going__ESMA__Previous = suspension_On_Going__ESMA__Previous;
	}

	public String getSuspension_Rationale__ESMA() {
		return Suspension_Rationale__ESMA;
	}

	public void setSuspension_Rationale__ESMA(String suspension_Rationale__ESMA) {
		Suspension_Rationale__ESMA = suspension_Rationale__ESMA;
	}

	public String getSuspension_Rationale__ESMA__Change_Flag() {
		return Suspension_Rationale__ESMA__Change_Flag;
	}

	public void setSuspension_Rationale__ESMA__Change_Flag(
			String suspension_Rationale__ESMA__Change_Flag) {
		Suspension_Rationale__ESMA__Change_Flag = suspension_Rationale__ESMA__Change_Flag;
	}

	public String getSuspension_Rationale__ESMA__Previous() {
		return Suspension_Rationale__ESMA__Previous;
	}

	public void setSuspension_Rationale__ESMA__Previous(
			String suspension_Rationale__ESMA__Previous) {
		Suspension_Rationale__ESMA__Previous = suspension_Rationale__ESMA__Previous;
	}

	public String getSuspension_Started_On__ESMA() {
		return Suspension_Started_On__ESMA;
	}

	public void setSuspension_Started_On__ESMA(
			String suspension_Started_On__ESMA) {
		Suspension_Started_On__ESMA = suspension_Started_On__ESMA;
	}

	public String getSuspension_Started_On__ESMA__Change_Flag() {
		return Suspension_Started_On__ESMA__Change_Flag;
	}

	public void setSuspension_Started_On__ESMA__Change_Flag(
			String suspension_Started_On__ESMA__Change_Flag) {
		Suspension_Started_On__ESMA__Change_Flag = suspension_Started_On__ESMA__Change_Flag;
	}

	public String getSuspension_Started_On__ESMA__Previous() {
		return Suspension_Started_On__ESMA__Previous;
	}

	public void setSuspension_Started_On__ESMA__Previous(
			String suspension_Started_On__ESMA__Previous) {
		Suspension_Started_On__ESMA__Previous = suspension_Started_On__ESMA__Previous;
	}

	public String getTRBC_Industry_Code() {
		return TRBC_Industry_Code;
	}

	public void setTRBC_Industry_Code(String tRBC_Industry_Code) {
		TRBC_Industry_Code = tRBC_Industry_Code;
	}

	public String getTRBC_Industry_Code__Change_Flag() {
		return TRBC_Industry_Code__Change_Flag;
	}

	public void setTRBC_Industry_Code__Change_Flag(
			String tRBC_Industry_Code__Change_Flag) {
		TRBC_Industry_Code__Change_Flag = tRBC_Industry_Code__Change_Flag;
	}

	public String getTRBC_Industry_Code__Previous() {
		return TRBC_Industry_Code__Previous;
	}

	public void setTRBC_Industry_Code__Previous(
			String tRBC_Industry_Code__Previous) {
		TRBC_Industry_Code__Previous = tRBC_Industry_Code__Previous;
	}

	public String getTaiwan_Code() {
		return Taiwan_Code;
	}

	public void setTaiwan_Code(String taiwan_Code) {
		Taiwan_Code = taiwan_Code;
	}

	public String getTaiwan_Code__Change_Flag() {
		return Taiwan_Code__Change_Flag;
	}

	public void setTaiwan_Code__Change_Flag(String taiwan_Code__Change_Flag) {
		Taiwan_Code__Change_Flag = taiwan_Code__Change_Flag;
	}

	public String getTaiwan_Code__Previous() {
		return Taiwan_Code__Previous;
	}

	public void setTaiwan_Code__Previous(String taiwan_Code__Previous) {
		Taiwan_Code__Previous = taiwan_Code__Previous;
	}

	public String getTerm_Maturity() {
		return Term_Maturity;
	}

	public void setTerm_Maturity(String term_Maturity) {
		Term_Maturity = term_Maturity;
	}

	public String getTerm_Maturity__Change_Flag() {
		return Term_Maturity__Change_Flag;
	}

	public void setTerm_Maturity__Change_Flag(String term_Maturity__Change_Flag) {
		Term_Maturity__Change_Flag = term_Maturity__Change_Flag;
	}

	public String getTerm_Maturity__Previous() {
		return Term_Maturity__Previous;
	}

	public void setTerm_Maturity__Previous(String term_Maturity__Previous) {
		Term_Maturity__Previous = term_Maturity__Previous;
	}

	public String getTerm_Start() {
		return Term_Start;
	}

	public void setTerm_Start(String term_Start) {
		Term_Start = term_Start;
	}

	public String getTerm_Start__Change_Flag() {
		return Term_Start__Change_Flag;
	}

	public void setTerm_Start__Change_Flag(String term_Start__Change_Flag) {
		Term_Start__Change_Flag = term_Start__Change_Flag;
	}

	public String getTerm_Start__Previous() {
		return Term_Start__Previous;
	}

	public void setTerm_Start__Previous(String term_Start__Previous) {
		Term_Start__Previous = term_Start__Previous;
	}

	public String getThomson_Reuters_Classification_Scheme() {
		return Thomson_Reuters_Classification_Scheme;
	}

	public void setThomson_Reuters_Classification_Scheme(
			String thomson_Reuters_Classification_Scheme) {
		Thomson_Reuters_Classification_Scheme = thomson_Reuters_Classification_Scheme;
	}

	public String getThomson_Reuters_Classification_Scheme__Change_Flag() {
		return Thomson_Reuters_Classification_Scheme__Change_Flag;
	}

	public void setThomson_Reuters_Classification_Scheme__Change_Flag(
			String thomson_Reuters_Classification_Scheme__Change_Flag) {
		Thomson_Reuters_Classification_Scheme__Change_Flag = thomson_Reuters_Classification_Scheme__Change_Flag;
	}

	public String getThomson_Reuters_Classification_Scheme__Previous() {
		return Thomson_Reuters_Classification_Scheme__Previous;
	}

	public void setThomson_Reuters_Classification_Scheme__Previous(
			String thomson_Reuters_Classification_Scheme__Previous) {
		Thomson_Reuters_Classification_Scheme__Previous = thomson_Reuters_Classification_Scheme__Previous;
	}

	public String getTick_Size() {
		return Tick_Size;
	}

	public void setTick_Size(String tick_Size) {
		Tick_Size = tick_Size;
	}

	public String getTick_Size__Change_Flag() {
		return Tick_Size__Change_Flag;
	}

	public void setTick_Size__Change_Flag(String tick_Size__Change_Flag) {
		Tick_Size__Change_Flag = tick_Size__Change_Flag;
	}

	public String getTick_Size__Previous() {
		return Tick_Size__Previous;
	}

	public void setTick_Size__Previous(String tick_Size__Previous) {
		Tick_Size__Previous = tick_Size__Previous;
	}

	public String getTick_Size_Currency() {
		return Tick_Size_Currency;
	}

	public void setTick_Size_Currency(String tick_Size_Currency) {
		Tick_Size_Currency = tick_Size_Currency;
	}

	public String getTick_Size_Currency__Change_Flag() {
		return Tick_Size_Currency__Change_Flag;
	}

	public void setTick_Size_Currency__Change_Flag(
			String tick_Size_Currency__Change_Flag) {
		Tick_Size_Currency__Change_Flag = tick_Size_Currency__Change_Flag;
	}

	public String getTick_Size_Currency__Previous() {
		return Tick_Size_Currency__Previous;
	}

	public void setTick_Size_Currency__Previous(
			String tick_Size_Currency__Previous) {
		Tick_Size_Currency__Previous = tick_Size_Currency__Previous;
	}

	public String getTick_Size_Pilot_Group() {
		return Tick_Size_Pilot_Group;
	}

	public void setTick_Size_Pilot_Group(String tick_Size_Pilot_Group) {
		Tick_Size_Pilot_Group = tick_Size_Pilot_Group;
	}

	public String getTick_Size_Pilot_Group__Change_Flag() {
		return Tick_Size_Pilot_Group__Change_Flag;
	}

	public void setTick_Size_Pilot_Group__Change_Flag(
			String tick_Size_Pilot_Group__Change_Flag) {
		Tick_Size_Pilot_Group__Change_Flag = tick_Size_Pilot_Group__Change_Flag;
	}

	public String getTick_Size_Pilot_Group__Previous() {
		return Tick_Size_Pilot_Group__Previous;
	}

	public void setTick_Size_Pilot_Group__Previous(
			String tick_Size_Pilot_Group__Previous) {
		Tick_Size_Pilot_Group__Previous = tick_Size_Pilot_Group__Previous;
	}

	public String getTick_Value() {
		return Tick_Value;
	}

	public void setTick_Value(String tick_Value) {
		Tick_Value = tick_Value;
	}

	public String getTick_Value__Change_Flag() {
		return Tick_Value__Change_Flag;
	}

	public void setTick_Value__Change_Flag(String tick_Value__Change_Flag) {
		Tick_Value__Change_Flag = tick_Value__Change_Flag;
	}

	public String getTick_Value__Previous() {
		return Tick_Value__Previous;
	}

	public void setTick_Value__Previous(String tick_Value__Previous) {
		Tick_Value__Previous = tick_Value__Previous;
	}

	public String getTick_Value_Currency() {
		return Tick_Value_Currency;
	}

	public void setTick_Value_Currency(String tick_Value_Currency) {
		Tick_Value_Currency = tick_Value_Currency;
	}

	public String getTick_Value_Currency__Change_Flag() {
		return Tick_Value_Currency__Change_Flag;
	}

	public void setTick_Value_Currency__Change_Flag(
			String tick_Value_Currency__Change_Flag) {
		Tick_Value_Currency__Change_Flag = tick_Value_Currency__Change_Flag;
	}

	public String getTick_Value_Currency__Previous() {
		return Tick_Value_Currency__Previous;
	}

	public void setTick_Value_Currency__Previous(
			String tick_Value_Currency__Previous) {
		Tick_Value_Currency__Previous = tick_Value_Currency__Previous;
	}

	public String getTicker() {
		return Ticker;
	}

	public void setTicker(String ticker) {
		Ticker = ticker;
	}

	public String getTicker__Change_Flag() {
		return Ticker__Change_Flag;
	}

	public void setTicker__Change_Flag(String ticker__Change_Flag) {
		Ticker__Change_Flag = ticker__Change_Flag;
	}

	public String getTicker__Previous() {
		return Ticker__Previous;
	}

	public void setTicker__Previous(String ticker__Previous) {
		Ticker__Previous = ticker__Previous;
	}

	public String getToTV__DSB() {
		return ToTV__DSB;
	}

	public void setToTV__DSB(String toTV__DSB) {
		ToTV__DSB = toTV__DSB;
	}

	public String getToTV__DSB__Change_Flag() {
		return ToTV__DSB__Change_Flag;
	}

	public void setToTV__DSB__Change_Flag(String toTV__DSB__Change_Flag) {
		ToTV__DSB__Change_Flag = toTV__DSB__Change_Flag;
	}

	public String getToTV__DSB__Previous() {
		return ToTV__DSB__Previous;
	}

	public void setToTV__DSB__Previous(String toTV__DSB__Previous) {
		ToTV__DSB__Previous = toTV__DSB__Previous;
	}

	public String getToTV_Effective_Date__DSB() {
		return ToTV_Effective_Date__DSB;
	}

	public void setToTV_Effective_Date__DSB(String toTV_Effective_Date__DSB) {
		ToTV_Effective_Date__DSB = toTV_Effective_Date__DSB;
	}

	public String getToTV_Effective_Date__DSB__Change_Flag() {
		return ToTV_Effective_Date__DSB__Change_Flag;
	}

	public void setToTV_Effective_Date__DSB__Change_Flag(
			String toTV_Effective_Date__DSB__Change_Flag) {
		ToTV_Effective_Date__DSB__Change_Flag = toTV_Effective_Date__DSB__Change_Flag;
	}

	public String getToTV_Effective_Date__DSB__Previous() {
		return ToTV_Effective_Date__DSB__Previous;
	}

	public void setToTV_Effective_Date__DSB__Previous(
			String toTV_Effective_Date__DSB__Previous) {
		ToTV_Effective_Date__DSB__Previous = toTV_Effective_Date__DSB__Previous;
	}

	public String getTotal_Amount_Issued() {
		return Total_Amount_Issued;
	}

	public void setTotal_Amount_Issued(String total_Amount_Issued) {
		Total_Amount_Issued = total_Amount_Issued;
	}

	public String getTotal_Amount_Issued__Change_Flag() {
		return Total_Amount_Issued__Change_Flag;
	}

	public void setTotal_Amount_Issued__Change_Flag(
			String total_Amount_Issued__Change_Flag) {
		Total_Amount_Issued__Change_Flag = total_Amount_Issued__Change_Flag;
	}

	public String getTotal_Amount_Issued__Previous() {
		return Total_Amount_Issued__Previous;
	}

	public void setTotal_Amount_Issued__Previous(
			String total_Amount_Issued__Previous) {
		Total_Amount_Issued__Previous = total_Amount_Issued__Previous;
	}

	public String getTotal_EU_Turnover_12_Month__ESMA() {
		return Total_EU_Turnover_12_Month__ESMA;
	}

	public void setTotal_EU_Turnover_12_Month__ESMA(
			String total_EU_Turnover_12_Month__ESMA) {
		Total_EU_Turnover_12_Month__ESMA = total_EU_Turnover_12_Month__ESMA;
	}

	public String getTotal_EU_Turnover_12_Month__ESMA__Change_Flag() {
		return Total_EU_Turnover_12_Month__ESMA__Change_Flag;
	}

	public void setTotal_EU_Turnover_12_Month__ESMA__Change_Flag(
			String total_EU_Turnover_12_Month__ESMA__Change_Flag) {
		Total_EU_Turnover_12_Month__ESMA__Change_Flag = total_EU_Turnover_12_Month__ESMA__Change_Flag;
	}

	public String getTotal_EU_Turnover_12_Month__ESMA__Previous() {
		return Total_EU_Turnover_12_Month__ESMA__Previous;
	}

	public void setTotal_EU_Turnover_12_Month__ESMA__Previous(
			String total_EU_Turnover_12_Month__ESMA__Previous) {
		Total_EU_Turnover_12_Month__ESMA__Previous = total_EU_Turnover_12_Month__ESMA__Previous;
	}

	public String getTotal_EU_Volume_12_Month__ESMA() {
		return Total_EU_Volume_12_Month__ESMA;
	}

	public void setTotal_EU_Volume_12_Month__ESMA(
			String total_EU_Volume_12_Month__ESMA) {
		Total_EU_Volume_12_Month__ESMA = total_EU_Volume_12_Month__ESMA;
	}

	public String getTotal_EU_Volume_12_Month__ESMA__Change_Flag() {
		return Total_EU_Volume_12_Month__ESMA__Change_Flag;
	}

	public void setTotal_EU_Volume_12_Month__ESMA__Change_Flag(
			String total_EU_Volume_12_Month__ESMA__Change_Flag) {
		Total_EU_Volume_12_Month__ESMA__Change_Flag = total_EU_Volume_12_Month__ESMA__Change_Flag;
	}

	public String getTotal_EU_Volume_12_Month__ESMA__Previous() {
		return Total_EU_Volume_12_Month__ESMA__Previous;
	}

	public void setTotal_EU_Volume_12_Month__ESMA__Previous(
			String total_EU_Volume_12_Month__ESMA__Previous) {
		Total_EU_Volume_12_Month__ESMA__Previous = total_EU_Volume_12_Month__ESMA__Previous;
	}

	public String getTrading_Status() {
		return Trading_Status;
	}

	public void setTrading_Status(String trading_Status) {
		Trading_Status = trading_Status;
	}

	public String getTrading_Status__Change_Flag() {
		return Trading_Status__Change_Flag;
	}

	public void setTrading_Status__Change_Flag(
			String trading_Status__Change_Flag) {
		Trading_Status__Change_Flag = trading_Status__Change_Flag;
	}

	public String getTrading_Status__Previous() {
		return Trading_Status__Previous;
	}

	public void setTrading_Status__Previous(String trading_Status__Previous) {
		Trading_Status__Previous = trading_Status__Previous;
	}

	public String getTrading_Style() {
		return Trading_Style;
	}

	public void setTrading_Style(String trading_Style) {
		Trading_Style = trading_Style;
	}

	public String getTrading_Style__Change_Flag() {
		return Trading_Style__Change_Flag;
	}

	public void setTrading_Style__Change_Flag(String trading_Style__Change_Flag) {
		Trading_Style__Change_Flag = trading_Style__Change_Flag;
	}

	public String getTrading_Style__Previous() {
		return Trading_Style__Previous;
	}

	public void setTrading_Style__Previous(String trading_Style__Previous) {
		Trading_Style__Previous = trading_Style__Previous;
	}

	public String getTrading_Symbol() {
		return Trading_Symbol;
	}

	public void setTrading_Symbol(String trading_Symbol) {
		Trading_Symbol = trading_Symbol;
	}

	public String getTrading_Symbol__Change_Flag() {
		return Trading_Symbol__Change_Flag;
	}

	public void setTrading_Symbol__Change_Flag(
			String trading_Symbol__Change_Flag) {
		Trading_Symbol__Change_Flag = trading_Symbol__Change_Flag;
	}

	public String getTrading_Symbol__Previous() {
		return Trading_Symbol__Previous;
	}

	public void setTrading_Symbol__Previous(String trading_Symbol__Previous) {
		Trading_Symbol__Previous = trading_Symbol__Previous;
	}

	public String getUK_Stamp_Duty_Flag() {
		return UK_Stamp_Duty_Flag;
	}

	public void setUK_Stamp_Duty_Flag(String uK_Stamp_Duty_Flag) {
		UK_Stamp_Duty_Flag = uK_Stamp_Duty_Flag;
	}

	public String getUK_Stamp_Duty_Flag__Change_Flag() {
		return UK_Stamp_Duty_Flag__Change_Flag;
	}

	public void setUK_Stamp_Duty_Flag__Change_Flag(
			String uK_Stamp_Duty_Flag__Change_Flag) {
		UK_Stamp_Duty_Flag__Change_Flag = uK_Stamp_Duty_Flag__Change_Flag;
	}

	public String getUK_Stamp_Duty_Flag__Previous() {
		return UK_Stamp_Duty_Flag__Previous;
	}

	public void setUK_Stamp_Duty_Flag__Previous(
			String uK_Stamp_Duty_Flag__Previous) {
		UK_Stamp_Duty_Flag__Previous = uK_Stamp_Duty_Flag__Previous;
	}

	public String getUnderlying_Asset_Type() {
		return Underlying_Asset_Type;
	}

	public void setUnderlying_Asset_Type(String underlying_Asset_Type) {
		Underlying_Asset_Type = underlying_Asset_Type;
	}

	public String getUnderlying_Asset_Type__Change_Flag() {
		return Underlying_Asset_Type__Change_Flag;
	}

	public void setUnderlying_Asset_Type__Change_Flag(
			String underlying_Asset_Type__Change_Flag) {
		Underlying_Asset_Type__Change_Flag = underlying_Asset_Type__Change_Flag;
	}

	public String getUnderlying_Asset_Type__Previous() {
		return Underlying_Asset_Type__Previous;
	}

	public void setUnderlying_Asset_Type__Previous(
			String underlying_Asset_Type__Previous) {
		Underlying_Asset_Type__Previous = underlying_Asset_Type__Previous;
	}

	public String getUnderlying_Contract() {
		return Underlying_Contract;
	}

	public void setUnderlying_Contract(String underlying_Contract) {
		Underlying_Contract = underlying_Contract;
	}

	public String getUnderlying_Contract__Change_Flag() {
		return Underlying_Contract__Change_Flag;
	}

	public void setUnderlying_Contract__Change_Flag(
			String underlying_Contract__Change_Flag) {
		Underlying_Contract__Change_Flag = underlying_Contract__Change_Flag;
	}

	public String getUnderlying_Contract__Previous() {
		return Underlying_Contract__Previous;
	}

	public void setUnderlying_Contract__Previous(
			String underlying_Contract__Previous) {
		Underlying_Contract__Previous = underlying_Contract__Previous;
	}

	public String getUnderlying_Contract_Exp_Date() {
		return Underlying_Contract_Exp_Date;
	}

	public void setUnderlying_Contract_Exp_Date(
			String underlying_Contract_Exp_Date) {
		Underlying_Contract_Exp_Date = underlying_Contract_Exp_Date;
	}

	public String getUnderlying_Contract_Exp_Date__Change_Flag() {
		return Underlying_Contract_Exp_Date__Change_Flag;
	}

	public void setUnderlying_Contract_Exp_Date__Change_Flag(
			String underlying_Contract_Exp_Date__Change_Flag) {
		Underlying_Contract_Exp_Date__Change_Flag = underlying_Contract_Exp_Date__Change_Flag;
	}

	public String getUnderlying_Contract_Exp_Date__Previous() {
		return Underlying_Contract_Exp_Date__Previous;
	}

	public void setUnderlying_Contract_Exp_Date__Previous(
			String underlying_Contract_Exp_Date__Previous) {
		Underlying_Contract_Exp_Date__Previous = underlying_Contract_Exp_Date__Previous;
	}

	public String getUnderlying_Contract_Quote_ID() {
		return Underlying_Contract_Quote_ID;
	}

	public void setUnderlying_Contract_Quote_ID(
			String underlying_Contract_Quote_ID) {
		Underlying_Contract_Quote_ID = underlying_Contract_Quote_ID;
	}

	public String getUnderlying_Contract_Quote_ID__Change_Flag() {
		return Underlying_Contract_Quote_ID__Change_Flag;
	}

	public void setUnderlying_Contract_Quote_ID__Change_Flag(
			String underlying_Contract_Quote_ID__Change_Flag) {
		Underlying_Contract_Quote_ID__Change_Flag = underlying_Contract_Quote_ID__Change_Flag;
	}

	public String getUnderlying_Contract_Quote_ID__Previous() {
		return Underlying_Contract_Quote_ID__Previous;
	}

	public void setUnderlying_Contract_Quote_ID__Previous(
			String underlying_Contract_Quote_ID__Previous) {
		Underlying_Contract_Quote_ID__Previous = underlying_Contract_Quote_ID__Previous;
	}

	public String getUnderlying_EEA_Venue_Eligible() {
		return Underlying_EEA_Venue_Eligible;
	}

	public void setUnderlying_EEA_Venue_Eligible(
			String underlying_EEA_Venue_Eligible) {
		Underlying_EEA_Venue_Eligible = underlying_EEA_Venue_Eligible;
	}

	public String getUnderlying_EEA_Venue_Eligible__Change_Flag() {
		return Underlying_EEA_Venue_Eligible__Change_Flag;
	}

	public void setUnderlying_EEA_Venue_Eligible__Change_Flag(
			String underlying_EEA_Venue_Eligible__Change_Flag) {
		Underlying_EEA_Venue_Eligible__Change_Flag = underlying_EEA_Venue_Eligible__Change_Flag;
	}

	public String getUnderlying_EEA_Venue_Eligible__Previous() {
		return Underlying_EEA_Venue_Eligible__Previous;
	}

	public void setUnderlying_EEA_Venue_Eligible__Previous(
			String underlying_EEA_Venue_Eligible__Previous) {
		Underlying_EEA_Venue_Eligible__Previous = underlying_EEA_Venue_Eligible__Previous;
	}

	public String getUnderlying_ISIN() {
		return Underlying_ISIN;
	}

	public void setUnderlying_ISIN(String underlying_ISIN) {
		Underlying_ISIN = underlying_ISIN;
	}

	public String getUnderlying_ISIN__Change_Flag() {
		return Underlying_ISIN__Change_Flag;
	}

	public void setUnderlying_ISIN__Change_Flag(
			String underlying_ISIN__Change_Flag) {
		Underlying_ISIN__Change_Flag = underlying_ISIN__Change_Flag;
	}

	public String getUnderlying_ISIN__ESMA() {
		return Underlying_ISIN__ESMA;
	}

	public void setUnderlying_ISIN__ESMA(String underlying_ISIN__ESMA) {
		Underlying_ISIN__ESMA = underlying_ISIN__ESMA;
	}

	public String getUnderlying_ISIN__ESMA__Change_Flag() {
		return Underlying_ISIN__ESMA__Change_Flag;
	}

	public void setUnderlying_ISIN__ESMA__Change_Flag(
			String underlying_ISIN__ESMA__Change_Flag) {
		Underlying_ISIN__ESMA__Change_Flag = underlying_ISIN__ESMA__Change_Flag;
	}

	public String getUnderlying_ISIN__ESMA__Previous() {
		return Underlying_ISIN__ESMA__Previous;
	}

	public void setUnderlying_ISIN__ESMA__Previous(
			String underlying_ISIN__ESMA__Previous) {
		Underlying_ISIN__ESMA__Previous = underlying_ISIN__ESMA__Previous;
	}

	public String getUnderlying_ISIN__Previous() {
		return Underlying_ISIN__Previous;
	}

	public void setUnderlying_ISIN__Previous(String underlying_ISIN__Previous) {
		Underlying_ISIN__Previous = underlying_ISIN__Previous;
	}

	public String getUnderlying_Index_ISIN() {
		return Underlying_Index_ISIN;
	}

	public void setUnderlying_Index_ISIN(String underlying_Index_ISIN) {
		Underlying_Index_ISIN = underlying_Index_ISIN;
	}

	public String getUnderlying_Index_ISIN__Change_Flag() {
		return Underlying_Index_ISIN__Change_Flag;
	}

	public void setUnderlying_Index_ISIN__Change_Flag(
			String underlying_Index_ISIN__Change_Flag) {
		Underlying_Index_ISIN__Change_Flag = underlying_Index_ISIN__Change_Flag;
	}

	public String getUnderlying_Index_ISIN__Previous() {
		return Underlying_Index_ISIN__Previous;
	}

	public void setUnderlying_Index_ISIN__Previous(
			String underlying_Index_ISIN__Previous) {
		Underlying_Index_ISIN__Previous = underlying_Index_ISIN__Previous;
	}

	public String getUnderlying_Issue_Perm_ID() {
		return Underlying_Issue_Perm_ID;
	}

	public void setUnderlying_Issue_Perm_ID(String underlying_Issue_Perm_ID) {
		Underlying_Issue_Perm_ID = underlying_Issue_Perm_ID;
	}

	public String getUnderlying_Issue_Perm_ID__Change_Flag() {
		return Underlying_Issue_Perm_ID__Change_Flag;
	}

	public void setUnderlying_Issue_Perm_ID__Change_Flag(
			String underlying_Issue_Perm_ID__Change_Flag) {
		Underlying_Issue_Perm_ID__Change_Flag = underlying_Issue_Perm_ID__Change_Flag;
	}

	public String getUnderlying_Issue_Perm_ID__Previous() {
		return Underlying_Issue_Perm_ID__Previous;
	}

	public void setUnderlying_Issue_Perm_ID__Previous(
			String underlying_Issue_Perm_ID__Previous) {
		Underlying_Issue_Perm_ID__Previous = underlying_Issue_Perm_ID__Previous;
	}

	public String getUnderlying_Issuer_LEI__ESMA() {
		return Underlying_Issuer_LEI__ESMA;
	}

	public void setUnderlying_Issuer_LEI__ESMA(
			String underlying_Issuer_LEI__ESMA) {
		Underlying_Issuer_LEI__ESMA = underlying_Issuer_LEI__ESMA;
	}

	public String getUnderlying_Issuer_LEI__ESMA__Change_Flag() {
		return Underlying_Issuer_LEI__ESMA__Change_Flag;
	}

	public void setUnderlying_Issuer_LEI__ESMA__Change_Flag(
			String underlying_Issuer_LEI__ESMA__Change_Flag) {
		Underlying_Issuer_LEI__ESMA__Change_Flag = underlying_Issuer_LEI__ESMA__Change_Flag;
	}

	public String getUnderlying_Issuer_LEI__ESMA__Previous() {
		return Underlying_Issuer_LEI__ESMA__Previous;
	}

	public void setUnderlying_Issuer_LEI__ESMA__Previous(
			String underlying_Issuer_LEI__ESMA__Previous) {
		Underlying_Issuer_LEI__ESMA__Previous = underlying_Issuer_LEI__ESMA__Previous;
	}

	public String getUnderlying_Issuer_Organization_Perm_ID() {
		return Underlying_Issuer_Organization_Perm_ID;
	}

	public void setUnderlying_Issuer_Organization_Perm_ID(
			String underlying_Issuer_Organization_Perm_ID) {
		Underlying_Issuer_Organization_Perm_ID = underlying_Issuer_Organization_Perm_ID;
	}

	public String getUnderlying_Issuer_Organization_Perm_ID__Change_Flag() {
		return Underlying_Issuer_Organization_Perm_ID__Change_Flag;
	}

	public void setUnderlying_Issuer_Organization_Perm_ID__Change_Flag(
			String underlying_Issuer_Organization_Perm_ID__Change_Flag) {
		Underlying_Issuer_Organization_Perm_ID__Change_Flag = underlying_Issuer_Organization_Perm_ID__Change_Flag;
	}

	public String getUnderlying_Issuer_Organization_Perm_ID__Previous() {
		return Underlying_Issuer_Organization_Perm_ID__Previous;
	}

	public void setUnderlying_Issuer_Organization_Perm_ID__Previous(
			String underlying_Issuer_Organization_Perm_ID__Previous) {
		Underlying_Issuer_Organization_Perm_ID__Previous = underlying_Issuer_Organization_Perm_ID__Previous;
	}

	public String getUnderlying_Quote_ID() {
		return Underlying_Quote_ID;
	}

	public void setUnderlying_Quote_ID(String underlying_Quote_ID) {
		Underlying_Quote_ID = underlying_Quote_ID;
	}

	public String getUnderlying_Quote_ID__Change_Flag() {
		return Underlying_Quote_ID__Change_Flag;
	}

	public void setUnderlying_Quote_ID__Change_Flag(
			String underlying_Quote_ID__Change_Flag) {
		Underlying_Quote_ID__Change_Flag = underlying_Quote_ID__Change_Flag;
	}

	public String getUnderlying_Quote_ID__Previous() {
		return Underlying_Quote_ID__Previous;
	}

	public void setUnderlying_Quote_ID__Previous(
			String underlying_Quote_ID__Previous) {
		Underlying_Quote_ID__Previous = underlying_Quote_ID__Previous;
	}

	public String getUnderlying_RIC() {
		return Underlying_RIC;
	}

	public void setUnderlying_RIC(String underlying_RIC) {
		Underlying_RIC = underlying_RIC;
	}

	public String getUnderlying_RIC__Change_Flag() {
		return Underlying_RIC__Change_Flag;
	}

	public void setUnderlying_RIC__Change_Flag(
			String underlying_RIC__Change_Flag) {
		Underlying_RIC__Change_Flag = underlying_RIC__Change_Flag;
	}

	public String getUnderlying_RIC__Previous() {
		return Underlying_RIC__Previous;
	}

	public void setUnderlying_RIC__Previous(String underlying_RIC__Previous) {
		Underlying_RIC__Previous = underlying_RIC__Previous;
	}

	public String getUnderlying_RIC_File_Signature() {
		return Underlying_RIC_File_Signature;
	}

	public void setUnderlying_RIC_File_Signature(
			String underlying_RIC_File_Signature) {
		Underlying_RIC_File_Signature = underlying_RIC_File_Signature;
	}

	public String getUnderlying_RIC_File_Signature__Change_Flag() {
		return Underlying_RIC_File_Signature__Change_Flag;
	}

	public void setUnderlying_RIC_File_Signature__Change_Flag(
			String underlying_RIC_File_Signature__Change_Flag) {
		Underlying_RIC_File_Signature__Change_Flag = underlying_RIC_File_Signature__Change_Flag;
	}

	public String getUnderlying_RIC_File_Signature__Previous() {
		return Underlying_RIC_File_Signature__Previous;
	}

	public void setUnderlying_RIC_File_Signature__Previous(
			String underlying_RIC_File_Signature__Previous) {
		Underlying_RIC_File_Signature__Previous = underlying_RIC_File_Signature__Previous;
	}

	public String getUnderlying_in_ESMA_FIRDS() {
		return Underlying_in_ESMA_FIRDS;
	}

	public void setUnderlying_in_ESMA_FIRDS(String underlying_in_ESMA_FIRDS) {
		Underlying_in_ESMA_FIRDS = underlying_in_ESMA_FIRDS;
	}

	public String getUnderlying_in_ESMA_FIRDS__Change_Flag() {
		return Underlying_in_ESMA_FIRDS__Change_Flag;
	}

	public void setUnderlying_in_ESMA_FIRDS__Change_Flag(
			String underlying_in_ESMA_FIRDS__Change_Flag) {
		Underlying_in_ESMA_FIRDS__Change_Flag = underlying_in_ESMA_FIRDS__Change_Flag;
	}

	public String getUnderlying_in_ESMA_FIRDS__Previous() {
		return Underlying_in_ESMA_FIRDS__Previous;
	}

	public void setUnderlying_in_ESMA_FIRDS__Previous(
			String underlying_in_ESMA_FIRDS__Previous) {
		Underlying_in_ESMA_FIRDS__Previous = underlying_in_ESMA_FIRDS__Previous;
	}

	public String getUnscaled_Strike_Price() {
		return Unscaled_Strike_Price;
	}

	public void setUnscaled_Strike_Price(String unscaled_Strike_Price) {
		Unscaled_Strike_Price = unscaled_Strike_Price;
	}

	public String getUnscaled_Strike_Price__Change_Flag() {
		return Unscaled_Strike_Price__Change_Flag;
	}

	public void setUnscaled_Strike_Price__Change_Flag(
			String unscaled_Strike_Price__Change_Flag) {
		Unscaled_Strike_Price__Change_Flag = unscaled_Strike_Price__Change_Flag;
	}

	public String getUnscaled_Strike_Price__Previous() {
		return Unscaled_Strike_Price__Previous;
	}

	public void setUnscaled_Strike_Price__Previous(
			String unscaled_Strike_Price__Previous) {
		Unscaled_Strike_Price__Previous = unscaled_Strike_Price__Previous;
	}

	public String getUpdate_Frequency() {
		return Update_Frequency;
	}

	public void setUpdate_Frequency(String update_Frequency) {
		Update_Frequency = update_Frequency;
	}

	public String getUpdate_Frequency__Change_Flag() {
		return Update_Frequency__Change_Flag;
	}

	public void setUpdate_Frequency__Change_Flag(
			String update_Frequency__Change_Flag) {
		Update_Frequency__Change_Flag = update_Frequency__Change_Flag;
	}

	public String getUpdate_Frequency__Previous() {
		return Update_Frequency__Previous;
	}

	public void setUpdate_Frequency__Previous(String update_Frequency__Previous) {
		Update_Frequency__Previous = update_Frequency__Previous;
	}

	public String getUpper_Barrier() {
		return Upper_Barrier;
	}

	public void setUpper_Barrier(String upper_Barrier) {
		Upper_Barrier = upper_Barrier;
	}

	public String getUpper_Barrier__Change_Flag() {
		return Upper_Barrier__Change_Flag;
	}

	public void setUpper_Barrier__Change_Flag(String upper_Barrier__Change_Flag) {
		Upper_Barrier__Change_Flag = upper_Barrier__Change_Flag;
	}

	public String getUpper_Barrier__Previous() {
		return Upper_Barrier__Previous;
	}

	public void setUpper_Barrier__Previous(String upper_Barrier__Previous) {
		Upper_Barrier__Previous = upper_Barrier__Previous;
	}

	public String getValoren() {
		return Valoren;
	}

	public void setValoren(String valoren) {
		Valoren = valoren;
	}

	public String getValoren__Change_Flag() {
		return Valoren__Change_Flag;
	}

	public void setValoren__Change_Flag(String valoren__Change_Flag) {
		Valoren__Change_Flag = valoren__Change_Flag;
	}

	public String getValoren__Previous() {
		return Valoren__Previous;
	}

	public void setValoren__Previous(String valoren__Previous) {
		Valoren__Previous = valoren__Previous;
	}

	public String getValuation_Method_or_Trigger() {
		return Valuation_Method_or_Trigger;
	}

	public void setValuation_Method_or_Trigger(
			String valuation_Method_or_Trigger) {
		Valuation_Method_or_Trigger = valuation_Method_or_Trigger;
	}

	public String getValuation_Method_or_Trigger__Change_Flag() {
		return Valuation_Method_or_Trigger__Change_Flag;
	}

	public void setValuation_Method_or_Trigger__Change_Flag(
			String valuation_Method_or_Trigger__Change_Flag) {
		Valuation_Method_or_Trigger__Change_Flag = valuation_Method_or_Trigger__Change_Flag;
	}

	public String getValuation_Method_or_Trigger__Previous() {
		return Valuation_Method_or_Trigger__Previous;
	}

	public void setValuation_Method_or_Trigger__Previous(
			String valuation_Method_or_Trigger__Previous) {
		Valuation_Method_or_Trigger__Previous = valuation_Method_or_Trigger__Previous;
	}

	public String getVenue_Listing_Suspension_End_Date() {
		return Venue_Listing_Suspension_End_Date;
	}

	public void setVenue_Listing_Suspension_End_Date(
			String venue_Listing_Suspension_End_Date) {
		Venue_Listing_Suspension_End_Date = venue_Listing_Suspension_End_Date;
	}

	public String getVenue_Listing_Suspension_End_Date__Change_Flag() {
		return Venue_Listing_Suspension_End_Date__Change_Flag;
	}

	public void setVenue_Listing_Suspension_End_Date__Change_Flag(
			String venue_Listing_Suspension_End_Date__Change_Flag) {
		Venue_Listing_Suspension_End_Date__Change_Flag = venue_Listing_Suspension_End_Date__Change_Flag;
	}

	public String getVenue_Listing_Suspension_End_Date__Previous() {
		return Venue_Listing_Suspension_End_Date__Previous;
	}

	public void setVenue_Listing_Suspension_End_Date__Previous(
			String venue_Listing_Suspension_End_Date__Previous) {
		Venue_Listing_Suspension_End_Date__Previous = venue_Listing_Suspension_End_Date__Previous;
	}

	public String getVenue_Suspended_From_Listing_Flag() {
		return Venue_Suspended_From_Listing_Flag;
	}

	public void setVenue_Suspended_From_Listing_Flag(
			String venue_Suspended_From_Listing_Flag) {
		Venue_Suspended_From_Listing_Flag = venue_Suspended_From_Listing_Flag;
	}

	public String getVenue_Suspended_From_Listing_Flag__Change_Flag() {
		return Venue_Suspended_From_Listing_Flag__Change_Flag;
	}

	public void setVenue_Suspended_From_Listing_Flag__Change_Flag(
			String venue_Suspended_From_Listing_Flag__Change_Flag) {
		Venue_Suspended_From_Listing_Flag__Change_Flag = venue_Suspended_From_Listing_Flag__Change_Flag;
	}

	public String getVenue_Suspended_From_Listing_Flag__Previous() {
		return Venue_Suspended_From_Listing_Flag__Previous;
	}

	public void setVenue_Suspended_From_Listing_Flag__Previous(
			String venue_Suspended_From_Listing_Flag__Previous) {
		Venue_Suspended_From_Listing_Flag__Previous = venue_Suspended_From_Listing_Flag__Previous;
	}

	public String getWarrant_Issue_Date() {
		return Warrant_Issue_Date;
	}

	public void setWarrant_Issue_Date(String warrant_Issue_Date) {
		Warrant_Issue_Date = warrant_Issue_Date;
	}

	public String getWarrant_Issue_Date__Change_Flag() {
		return Warrant_Issue_Date__Change_Flag;
	}

	public void setWarrant_Issue_Date__Change_Flag(
			String warrant_Issue_Date__Change_Flag) {
		Warrant_Issue_Date__Change_Flag = warrant_Issue_Date__Change_Flag;
	}

	public String getWarrant_Issue_Date__Previous() {
		return Warrant_Issue_Date__Previous;
	}

	public void setWarrant_Issue_Date__Previous(
			String warrant_Issue_Date__Previous) {
		Warrant_Issue_Date__Previous = warrant_Issue_Date__Previous;
	}

	public String getWarrant_Underlying_RIC() {
		return Warrant_Underlying_RIC;
	}

	public void setWarrant_Underlying_RIC(String warrant_Underlying_RIC) {
		Warrant_Underlying_RIC = warrant_Underlying_RIC;
	}

	public String getWarrant_Underlying_RIC__Change_Flag() {
		return Warrant_Underlying_RIC__Change_Flag;
	}

	public void setWarrant_Underlying_RIC__Change_Flag(
			String warrant_Underlying_RIC__Change_Flag) {
		Warrant_Underlying_RIC__Change_Flag = warrant_Underlying_RIC__Change_Flag;
	}

	public String getWarrant_Underlying_RIC__Previous() {
		return Warrant_Underlying_RIC__Previous;
	}

	public void setWarrant_Underlying_RIC__Previous(
			String warrant_Underlying_RIC__Previous) {
		Warrant_Underlying_RIC__Previous = warrant_Underlying_RIC__Previous;
	}

	public String getWarrent_Form() {
		return Warrent_Form;
	}

	public void setWarrent_Form(String warrent_Form) {
		Warrent_Form = warrent_Form;
	}

	public String getWarrent_Form__Change_Flag() {
		return Warrent_Form__Change_Flag;
	}

	public void setWarrent_Form__Change_Flag(String warrent_Form__Change_Flag) {
		Warrent_Form__Change_Flag = warrent_Form__Change_Flag;
	}

	public String getWarrent_Form__Previous() {
		return Warrent_Form__Previous;
	}

	public void setWarrent_Form__Previous(String warrent_Form__Previous) {
		Warrent_Form__Previous = warrent_Form__Previous;
	}

	public String getWarrent_Underlying_Quote_ID() {
		return Warrent_Underlying_Quote_ID;
	}

	public void setWarrent_Underlying_Quote_ID(
			String warrent_Underlying_Quote_ID) {
		Warrent_Underlying_Quote_ID = warrent_Underlying_Quote_ID;
	}

	public String getWarrent_Underlying_Quote_ID__Change_Flag() {
		return Warrent_Underlying_Quote_ID__Change_Flag;
	}

	public void setWarrent_Underlying_Quote_ID__Change_Flag(
			String warrent_Underlying_Quote_ID__Change_Flag) {
		Warrent_Underlying_Quote_ID__Change_Flag = warrent_Underlying_Quote_ID__Change_Flag;
	}

	public String getWarrent_Underlying_Quote_ID__Previous() {
		return Warrent_Underlying_Quote_ID__Previous;
	}

	public void setWarrent_Underlying_Quote_ID__Previous(
			String warrent_Underlying_Quote_ID__Previous) {
		Warrent_Underlying_Quote_ID__Previous = warrent_Underlying_Quote_ID__Previous;
	}

	public String getWertpapier() {
		return Wertpapier;
	}

	public void setWertpapier(String wertpapier) {
		Wertpapier = wertpapier;
	}

	public String getWertpapier__Change_Flag() {
		return Wertpapier__Change_Flag;
	}

	public void setWertpapier__Change_Flag(String wertpapier__Change_Flag) {
		Wertpapier__Change_Flag = wertpapier__Change_Flag;
	}

	public String getWertpapier__Previous() {
		return Wertpapier__Previous;
	}

	public void setWertpapier__Previous(String wertpapier__Previous) {
		Wertpapier__Previous = wertpapier__Previous;
	}

	public String getWhen_Distributed_Flag() {
		return When_Distributed_Flag;
	}

	public void setWhen_Distributed_Flag(String when_Distributed_Flag) {
		When_Distributed_Flag = when_Distributed_Flag;
	}

	public String getWhen_Distributed_Flag__Change_Flag() {
		return When_Distributed_Flag__Change_Flag;
	}

	public void setWhen_Distributed_Flag__Change_Flag(
			String when_Distributed_Flag__Change_Flag) {
		When_Distributed_Flag__Change_Flag = when_Distributed_Flag__Change_Flag;
	}

	public String getWhen_Distributed_Flag__Previous() {
		return When_Distributed_Flag__Previous;
	}

	public void setWhen_Distributed_Flag__Previous(
			String when_Distributed_Flag__Previous) {
		When_Distributed_Flag__Previous = when_Distributed_Flag__Previous;
	}

	public String getWhen_Issued_Flag() {
		return When_Issued_Flag;
	}

	public void setWhen_Issued_Flag(String when_Issued_Flag) {
		When_Issued_Flag = when_Issued_Flag;
	}

	public String getWhen_Issued_Flag__Change_Flag() {
		return When_Issued_Flag__Change_Flag;
	}

	public void setWhen_Issued_Flag__Change_Flag(
			String when_Issued_Flag__Change_Flag) {
		When_Issued_Flag__Change_Flag = when_Issued_Flag__Change_Flag;
	}

	public String getWhen_Issued_Flag__Previous() {
		return When_Issued_Flag__Previous;
	}

	public void setWhen_Issued_Flag__Previous(String when_Issued_Flag__Previous) {
		When_Issued_Flag__Previous = when_Issued_Flag__Previous;
	}

	public String getuTOTV__DSB() {
		return uTOTV__DSB;
	}

	public void setuTOTV__DSB(String uTOTV__DSB) {
		this.uTOTV__DSB = uTOTV__DSB;
	}

	public String getuTOTV__DSB__Change_Flag() {
		return uTOTV__DSB__Change_Flag;
	}

	public void setuTOTV__DSB__Change_Flag(String uTOTV__DSB__Change_Flag) {
		this.uTOTV__DSB__Change_Flag = uTOTV__DSB__Change_Flag;
	}

	public String getuTOTV__DSB__Previous() {
		return uTOTV__DSB__Previous;
	}

	public void setuTOTV__DSB__Previous(String uTOTV__DSB__Previous) {
		this.uTOTV__DSB__Previous = uTOTV__DSB__Previous;
	}

	public String getuToTV_Effective_Date__DSB() {
		return uToTV_Effective_Date__DSB;
	}

	public void setuToTV_Effective_Date__DSB(String uToTV_Effective_Date__DSB) {
		this.uToTV_Effective_Date__DSB = uToTV_Effective_Date__DSB;
	}

	public String getuToTV_Effective_Date__DSB__Change_Flag() {
		return uToTV_Effective_Date__DSB__Change_Flag;
	}

	public void setuToTV_Effective_Date__DSB__Change_Flag(
			String uToTV_Effective_Date__DSB__Change_Flag) {
		this.uToTV_Effective_Date__DSB__Change_Flag = uToTV_Effective_Date__DSB__Change_Flag;
	}

	public String getuToTV_Effective_Date__DSB__Previous() {
		return uToTV_Effective_Date__DSB__Previous;
	}

	public void setuToTV_Effective_Date__DSB__Previous(
			String uToTV_Effective_Date__DSB__Previous) {
		this.uToTV_Effective_Date__DSB__Previous = uToTV_Effective_Date__DSB__Previous;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reference [RIC=");
		builder.append(RIC);
		builder.append(", Quote_ID=");
		builder.append(Quote_ID);
		builder.append(", Asset_ID=");
		builder.append(Asset_ID);
		builder.append(", Action=");
		builder.append(Action);
		builder.append(", _13F_Securities_Flag=");
		builder.append(_13F_Securities_Flag);
		builder.append(", _13F_Securities_Flag__Change_Flag=");
		builder.append(_13F_Securities_Flag__Change_Flag);
		builder.append(", _13F_Securities_Flag__Previous=");
		builder.append(_13F_Securities_Flag__Previous);
		builder.append(", _144A_Registered_Flag=");
		builder.append(_144A_Registered_Flag);
		builder.append(", _144A_Registered_Flag__Change_Flag=");
		builder.append(_144A_Registered_Flag__Change_Flag);
		builder.append(", _144A_Registered_Flag__Previous=");
		builder.append(_144A_Registered_Flag__Previous);
		builder.append(", AIFMD_Sub_Asset_Type_Code=");
		builder.append(AIFMD_Sub_Asset_Type_Code);
		builder.append(", AIFMD_Sub_Asset_Type_Code__Change_Flag=");
		builder.append(AIFMD_Sub_Asset_Type_Code__Change_Flag);
		builder.append(", AIFMD_Sub_Asset_Type_Code__Previous=");
		builder.append(AIFMD_Sub_Asset_Type_Code__Previous);
		builder.append(", AII_Code=");
		builder.append(AII_Code);
		builder.append(", AII_Code__Change_Flag=");
		builder.append(AII_Code__Change_Flag);
		builder.append(", AII_Code__Previous=");
		builder.append(AII_Code__Previous);
		builder.append(", Active_Instrument_Flag=");
		builder.append(Active_Instrument_Flag);
		builder.append(", Active_Instrument_Flag__Change_Flag=");
		builder.append(Active_Instrument_Flag__Change_Flag);
		builder.append(", Active_Instrument_Flag__Previous=");
		builder.append(Active_Instrument_Flag__Previous);
		builder.append(", Active_Quote_Flag=");
		builder.append(Active_Quote_Flag);
		builder.append(", Active_Quote_Flag__Change_Flag=");
		builder.append(Active_Quote_Flag__Change_Flag);
		builder.append(", Active_Quote_Flag__Previous=");
		builder.append(Active_Quote_Flag__Previous);
		builder.append(", Asset_Category=");
		builder.append(Asset_Category);
		builder.append(", Asset_Category__Change_Flag=");
		builder.append(Asset_Category__Change_Flag);
		builder.append(", Asset_Category__Previous=");
		builder.append(Asset_Category__Previous);
		builder.append(", Asset_ID__Change_Flag=");
		builder.append(Asset_ID__Change_Flag);
		builder.append(", Asset_ID__Previous=");
		builder.append(Asset_ID__Previous);
		builder.append(", Asset_Ratio_Against=");
		builder.append(Asset_Ratio_Against);
		builder.append(", Asset_Ratio_Against__Change_Flag=");
		builder.append(Asset_Ratio_Against__Change_Flag);
		builder.append(", Asset_Ratio_Against__Previous=");
		builder.append(Asset_Ratio_Against__Previous);
		builder.append(", Asset_Ratio_For=");
		builder.append(Asset_Ratio_For);
		builder.append(", Asset_Ratio_For__Change_Flag=");
		builder.append(Asset_Ratio_For__Change_Flag);
		builder.append(", Asset_Ratio_For__Previous=");
		builder.append(Asset_Ratio_For__Previous);
		builder.append(", Asset_Status=");
		builder.append(Asset_Status);
		builder.append(", Asset_Status__Change_Flag=");
		builder.append(Asset_Status__Change_Flag);
		builder.append(", Asset_Status__Previous=");
		builder.append(Asset_Status__Previous);
		builder.append(", Australia_Code=");
		builder.append(Australia_Code);
		builder.append(", Australia_Code__Change_Flag=");
		builder.append(Australia_Code__Change_Flag);
		builder.append(", Australia_Code__Previous=");
		builder.append(Australia_Code__Previous);
		builder.append(", Austria_Code=");
		builder.append(Austria_Code);
		builder.append(", Austria_Code__Change_Flag=");
		builder.append(Austria_Code__Change_Flag);
		builder.append(", Austria_Code__Previous=");
		builder.append(Austria_Code__Previous);
		builder.append(", Barrier_Touched_Date=");
		builder.append(Barrier_Touched_Date);
		builder.append(", Barrier_Touched_Date__Change_Flag=");
		builder.append(Barrier_Touched_Date__Change_Flag);
		builder.append(", Barrier_Touched_Date__Previous=");
		builder.append(Barrier_Touched_Date__Previous);
		builder.append(", Barrier_Touched_Indicator=");
		builder.append(Barrier_Touched_Indicator);
		builder.append(", Barrier_Touched_Indicator__Change_Flag=");
		builder.append(Barrier_Touched_Indicator__Change_Flag);
		builder.append(", Barrier_Touched_Indicator__Previous=");
		builder.append(Barrier_Touched_Indicator__Previous);
		builder.append(", Base_Currency_Code=");
		builder.append(Base_Currency_Code);
		builder.append(", Base_Currency_Code__Change_Flag=");
		builder.append(Base_Currency_Code__Change_Flag);
		builder.append(", Base_Currency_Code__Previous=");
		builder.append(Base_Currency_Code__Previous);
		builder.append(", Basket_Underlying_ISIN_List=");
		builder.append(Basket_Underlying_ISIN_List);
		builder.append(", Basket_Underlying_ISIN_List__Change_Flag=");
		builder.append(Basket_Underlying_ISIN_List__Change_Flag);
		builder.append(", Basket_Underlying_ISIN_List__Previous=");
		builder.append(Basket_Underlying_ISIN_List__Previous);
		builder.append(", Basket_Warrant_Indicator=");
		builder.append(Basket_Warrant_Indicator);
		builder.append(", Basket_Warrant_Indicator__Change_Flag=");
		builder.append(Basket_Warrant_Indicator__Change_Flag);
		builder.append(", Basket_Warrant_Indicator__Previous=");
		builder.append(Basket_Warrant_Indicator__Previous);
		builder.append(", Belgium_Code=");
		builder.append(Belgium_Code);
		builder.append(", Belgium_Code__Change_Flag=");
		builder.append(Belgium_Code__Change_Flag);
		builder.append(", Belgium_Code__Previous=");
		builder.append(Belgium_Code__Previous);
		builder.append(", Bonus_Indicator=");
		builder.append(Bonus_Indicator);
		builder.append(", Bonus_Indicator__Change_Flag=");
		builder.append(Bonus_Indicator__Change_Flag);
		builder.append(", Bonus_Indicator__Previous=");
		builder.append(Bonus_Indicator__Previous);
		builder.append(", Bonus_Level=");
		builder.append(Bonus_Level);
		builder.append(", Bonus_Level__Change_Flag=");
		builder.append(Bonus_Level__Change_Flag);
		builder.append(", Bonus_Level__Previous=");
		builder.append(Bonus_Level__Previous);
		builder.append(", CDS_Reference_Obligation_ISIN=");
		builder.append(CDS_Reference_Obligation_ISIN);
		builder.append(", CDS_Reference_Obligation_ISIN__Change_Flag=");
		builder.append(CDS_Reference_Obligation_ISIN__Change_Flag);
		builder.append(", CDS_Reference_Obligation_ISIN__Previous=");
		builder.append(CDS_Reference_Obligation_ISIN__Previous);
		builder.append(", CFI_Code=");
		builder.append(CFI_Code);
		builder.append(", CFI_Code__Change_Flag=");
		builder.append(CFI_Code__Change_Flag);
		builder.append(", CFI_Code__Previous=");
		builder.append(CFI_Code__Previous);
		builder.append(", CIN_Code=");
		builder.append(CIN_Code);
		builder.append(", CIN_Code__Change_Flag=");
		builder.append(CIN_Code__Change_Flag);
		builder.append(", CIN_Code__Previous=");
		builder.append(CIN_Code__Previous);
		builder.append(", CUSIP=");
		builder.append(CUSIP);
		builder.append(", CUSIP__Change_Flag=");
		builder.append(CUSIP__Change_Flag);
		builder.append(", CUSIP__Previous=");
		builder.append(CUSIP__Previous);
		builder.append(", CUSIP_Issue_Status=");
		builder.append(CUSIP_Issue_Status);
		builder.append(", CUSIP_Issue_Status__Change_Flag=");
		builder.append(CUSIP_Issue_Status__Change_Flag);
		builder.append(", CUSIP_Issue_Status__Previous=");
		builder.append(CUSIP_Issue_Status__Previous);
		builder.append(", Cash_in_Lieu=");
		builder.append(Cash_in_Lieu);
		builder.append(", Cash_in_Lieu__Change_Flag=");
		builder.append(Cash_in_Lieu__Change_Flag);
		builder.append(", Cash_in_Lieu__Previous=");
		builder.append(Cash_in_Lieu__Previous);
		builder.append(", China_Connect_ELG=");
		builder.append(China_Connect_ELG);
		builder.append(", China_Connect_ELG__Change_Flag=");
		builder.append(China_Connect_ELG__Change_Flag);
		builder.append(", China_Connect_ELG__Previous=");
		builder.append(China_Connect_ELG__Previous);
		builder.append(", Common_Code=");
		builder.append(Common_Code);
		builder.append(", Common_Code__Change_Flag=");
		builder.append(Common_Code__Change_Flag);
		builder.append(", Common_Code__Previous=");
		builder.append(Common_Code__Previous);
		builder.append(", Company_Legal_Domicile=");
		builder.append(Company_Legal_Domicile);
		builder.append(", Company_Legal_Domicile__Change_Flag=");
		builder.append(Company_Legal_Domicile__Change_Flag);
		builder.append(", Company_Legal_Domicile__Previous=");
		builder.append(Company_Legal_Domicile__Previous);
		builder.append(", Company_Short_Name=");
		builder.append(Company_Short_Name);
		builder.append(", Company_Short_Name__Change_Flag=");
		builder.append(Company_Short_Name__Change_Flag);
		builder.append(", Company_Short_Name__Previous=");
		builder.append(Company_Short_Name__Previous);
		builder.append(", Consolidated_Quote_ID=");
		builder.append(Consolidated_Quote_ID);
		builder.append(", Consolidated_Quote_ID__Change_Flag=");
		builder.append(Consolidated_Quote_ID__Change_Flag);
		builder.append(", Consolidated_Quote_ID__Previous=");
		builder.append(Consolidated_Quote_ID__Previous);
		builder.append(", Consolidated_RIC=");
		builder.append(Consolidated_RIC);
		builder.append(", Consolidated_RIC__Change_Flag=");
		builder.append(Consolidated_RIC__Change_Flag);
		builder.append(", Consolidated_RIC__Previous=");
		builder.append(Consolidated_RIC__Previous);
		builder.append(", Contract_Month_and_Year=");
		builder.append(Contract_Month_and_Year);
		builder.append(", Contract_Month_and_Year__Change_Flag=");
		builder.append(Contract_Month_and_Year__Change_Flag);
		builder.append(", Contract_Month_and_Year__Previous=");
		builder.append(Contract_Month_and_Year__Previous);
		builder.append(", Contract_Type=");
		builder.append(Contract_Type);
		builder.append(", Contract_Type__Change_Flag=");
		builder.append(Contract_Type__Change_Flag);
		builder.append(", Contract_Type__Previous=");
		builder.append(Contract_Type__Previous);
		builder.append(", Contributor_Relationship_Name=");
		builder.append(Contributor_Relationship_Name);
		builder.append(", Contributor_Relationship_Name__Change_Flag=");
		builder.append(Contributor_Relationship_Name__Change_Flag);
		builder.append(", Contributor_Relationship_Name__Previous=");
		builder.append(Contributor_Relationship_Name__Previous);
		builder.append(", Corporate_Action_Version_Number=");
		builder.append(Corporate_Action_Version_Number);
		builder.append(", Corporate_Action_Version_Number__Change_Flag=");
		builder.append(Corporate_Action_Version_Number__Change_Flag);
		builder.append(", Corporate_Action_Version_Number__Previous=");
		builder.append(Corporate_Action_Version_Number__Previous);
		builder.append(", Country_Primary_Quote=");
		builder.append(Country_Primary_Quote);
		builder.append(", Country_Primary_Quote__Change_Flag=");
		builder.append(Country_Primary_Quote__Change_Flag);
		builder.append(", Country_Primary_Quote__Previous=");
		builder.append(Country_Primary_Quote__Previous);
		builder.append(", Country_of_Incorporation=");
		builder.append(Country_of_Incorporation);
		builder.append(", Country_of_Incorporation__Change_Flag=");
		builder.append(Country_of_Incorporation__Change_Flag);
		builder.append(", Country_of_Incorporation__Previous=");
		builder.append(Country_of_Incorporation__Previous);
		builder.append(", Country_of_Taxation_Code=");
		builder.append(Country_of_Taxation_Code);
		builder.append(", Country_of_Taxation_Code__Change_Flag=");
		builder.append(Country_of_Taxation_Code__Change_Flag);
		builder.append(", Country_of_Taxation_Code__Previous=");
		builder.append(Country_of_Taxation_Code__Previous);
		builder.append(", Coupon_Rate=");
		builder.append(Coupon_Rate);
		builder.append(", Coupon_Rate__Change_Flag=");
		builder.append(Coupon_Rate__Change_Flag);
		builder.append(", Coupon_Rate__Previous=");
		builder.append(Coupon_Rate__Previous);
		builder.append(", Currency_Code=");
		builder.append(Currency_Code);
		builder.append(", Currency_Code__Change_Flag=");
		builder.append(Currency_Code__Change_Flag);
		builder.append(", Currency_Code__Previous=");
		builder.append(Currency_Code__Previous);
		builder.append(", Currency_of_Nominal_Value__ESMA=");
		builder.append(Currency_of_Nominal_Value__ESMA);
		builder.append(", Currency_of_Nominal_Value__ESMA__Change_Flag=");
		builder.append(Currency_of_Nominal_Value__ESMA__Change_Flag);
		builder.append(", Currency_of_Nominal_Value__ESMA__Previous=");
		builder.append(Currency_of_Nominal_Value__ESMA__Previous);
		builder.append(", Current_Amount_Outstanding=");
		builder.append(Current_Amount_Outstanding);
		builder.append(", Current_Amount_Outstanding__Change_Flag=");
		builder.append(Current_Amount_Outstanding__Change_Flag);
		builder.append(", Current_Amount_Outstanding__Previous=");
		builder.append(Current_Amount_Outstanding__Previous);
		builder.append(", Deal_Start_Date=");
		builder.append(Deal_Start_Date);
		builder.append(", Deal_Start_Date__Change_Flag=");
		builder.append(Deal_Start_Date__Change_Flag);
		builder.append(", Deal_Start_Date__Previous=");
		builder.append(Deal_Start_Date__Previous);
		builder.append(", Delivery_or_Cash_Settlement_Location=");
		builder.append(Delivery_or_Cash_Settlement_Location);
		builder.append(", Delivery_or_Cash_Settlement_Location__Change_Flag=");
		builder.append(Delivery_or_Cash_Settlement_Location__Change_Flag);
		builder.append(", Delivery_or_Cash_Settlement_Location__Previous=");
		builder.append(Delivery_or_Cash_Settlement_Location__Previous);
		builder.append(", Depository_Asset_Underlying=");
		builder.append(Depository_Asset_Underlying);
		builder.append(", Depository_Asset_Underlying__Change_Flag=");
		builder.append(Depository_Asset_Underlying__Change_Flag);
		builder.append(", Depository_Asset_Underlying__Previous=");
		builder.append(Depository_Asset_Underlying__Previous);
		builder.append(", Depository_Asset_Underlying_Quote_ID=");
		builder.append(Depository_Asset_Underlying_Quote_ID);
		builder.append(", Depository_Asset_Underlying_Quote_ID__Change_Flag=");
		builder.append(Depository_Asset_Underlying_Quote_ID__Change_Flag);
		builder.append(", Depository_Asset_Underlying_Quote_ID__Previous=");
		builder.append(Depository_Asset_Underlying_Quote_ID__Previous);
		builder.append(", Display_Factor=");
		builder.append(Display_Factor);
		builder.append(", Display_Factor__Change_Flag=");
		builder.append(Display_Factor__Change_Flag);
		builder.append(", Display_Factor__Previous=");
		builder.append(Display_Factor__Previous);
		builder.append(", Dow_Jones_Industrial_Code=");
		builder.append(Dow_Jones_Industrial_Code);
		builder.append(", Dow_Jones_Industrial_Code__Change_Flag=");
		builder.append(Dow_Jones_Industrial_Code__Change_Flag);
		builder.append(", Dow_Jones_Industrial_Code__Previous=");
		builder.append(Dow_Jones_Industrial_Code__Previous);
		builder.append(", EEA_Venue_Eligible_Flag=");
		builder.append(EEA_Venue_Eligible_Flag);
		builder.append(", EEA_Venue_Eligible_Flag__Change_Flag=");
		builder.append(EEA_Venue_Eligible_Flag__Change_Flag);
		builder.append(", EEA_Venue_Eligible_Flag__Previous=");
		builder.append(EEA_Venue_Eligible_Flag__Previous);
		builder.append(", ESMA_Instrument_Last_Update_Date=");
		builder.append(ESMA_Instrument_Last_Update_Date);
		builder.append(", ESMA_Instrument_Last_Update_Date__Change_Flag=");
		builder.append(ESMA_Instrument_Last_Update_Date__Change_Flag);
		builder.append(", ESMA_Instrument_Last_Update_Date__Previous=");
		builder.append(ESMA_Instrument_Last_Update_Date__Previous);
		builder.append(", ETF_Price_Type=");
		builder.append(ETF_Price_Type);
		builder.append(", ETF_Price_Type__Change_Flag=");
		builder.append(ETF_Price_Type__Change_Flag);
		builder.append(", ETF_Price_Type__Previous=");
		builder.append(ETF_Price_Type__Previous);
		builder.append(", ETF_Principal_Quote_ID=");
		builder.append(ETF_Principal_Quote_ID);
		builder.append(", ETF_Principal_Quote_ID__Change_Flag=");
		builder.append(ETF_Principal_Quote_ID__Change_Flag);
		builder.append(", ETF_Principal_Quote_ID__Previous=");
		builder.append(ETF_Principal_Quote_ID__Previous);
		builder.append(", ETF_Princpal_Ric=");
		builder.append(ETF_Princpal_Ric);
		builder.append(", ETF_Princpal_Ric__Change_Flag=");
		builder.append(ETF_Princpal_Ric__Change_Flag);
		builder.append(", ETF_Princpal_Ric__Previous=");
		builder.append(ETF_Princpal_Ric__Previous);
		builder.append(", EU_Short_Sell_Eligible=");
		builder.append(EU_Short_Sell_Eligible);
		builder.append(", EU_Short_Sell_Eligible__Change_Flag=");
		builder.append(EU_Short_Sell_Eligible__Change_Flag);
		builder.append(", EU_Short_Sell_Eligible__Previous=");
		builder.append(EU_Short_Sell_Eligible__Previous);
		builder.append(", Entity_ID=");
		builder.append(Entity_ID);
		builder.append(", Entity_ID__Change_Flag=");
		builder.append(Entity_ID__Change_Flag);
		builder.append(", Entity_ID__Previous=");
		builder.append(Entity_ID__Previous);
		builder.append(", Euronext_Trading_Group=");
		builder.append(Euronext_Trading_Group);
		builder.append(", Euronext_Trading_Group__Change_Flag=");
		builder.append(Euronext_Trading_Group__Change_Flag);
		builder.append(", Euronext_Trading_Group__Previous=");
		builder.append(Euronext_Trading_Group__Previous);
		builder.append(", Exchange_Code=");
		builder.append(Exchange_Code);
		builder.append(", Exchange_Code__Change_Flag=");
		builder.append(Exchange_Code__Change_Flag);
		builder.append(", Exchange_Code__Previous=");
		builder.append(Exchange_Code__Previous);
		builder.append(", Exchange_Market_Size=");
		builder.append(Exchange_Market_Size);
		builder.append(", Exchange_Market_Size__Change_Flag=");
		builder.append(Exchange_Market_Size__Change_Flag);
		builder.append(", Exchange_Market_Size__Previous=");
		builder.append(Exchange_Market_Size__Previous);
		builder.append(", Exercise_Style=");
		builder.append(Exercise_Style);
		builder.append(", Exercise_Style__Change_Flag=");
		builder.append(Exercise_Style__Change_Flag);
		builder.append(", Exercise_Style__Previous=");
		builder.append(Exercise_Style__Previous);
		builder.append(", Exotic_Parameter_Code=");
		builder.append(Exotic_Parameter_Code);
		builder.append(", Exotic_Parameter_Code__Change_Flag=");
		builder.append(Exotic_Parameter_Code__Change_Flag);
		builder.append(", Exotic_Parameter_Code__Previous=");
		builder.append(Exotic_Parameter_Code__Previous);
		builder.append(", Exotic_Value=");
		builder.append(Exotic_Value);
		builder.append(", Exotic_Value__Change_Flag=");
		builder.append(Exotic_Value__Change_Flag);
		builder.append(", Exotic_Value__Previous=");
		builder.append(Exotic_Value__Previous);
		builder.append(", Expiration_Date=");
		builder.append(Expiration_Date);
		builder.append(", Expiration_Date__Change_Flag=");
		builder.append(Expiration_Date__Change_Flag);
		builder.append(", Expiration_Date__Previous=");
		builder.append(Expiration_Date__Previous);
		builder.append(", FTSE_Industrial_Code=");
		builder.append(FTSE_Industrial_Code);
		builder.append(", FTSE_Industrial_Code__Change_Flag=");
		builder.append(FTSE_Industrial_Code__Change_Flag);
		builder.append(", FTSE_Industrial_Code__Previous=");
		builder.append(FTSE_Industrial_Code__Previous);
		builder.append(", FX_Type__ESMA=");
		builder.append(FX_Type__ESMA);
		builder.append(", FX_Type__ESMA__Change_Flag=");
		builder.append(FX_Type__ESMA__Change_Flag);
		builder.append(", FX_Type__ESMA__Previous=");
		builder.append(FX_Type__ESMA__Previous);
		builder.append(", File_Code=");
		builder.append(File_Code);
		builder.append(", File_Code__Change_Flag=");
		builder.append(File_Code__Change_Flag);
		builder.append(", File_Code__Previous=");
		builder.append(File_Code__Previous);
		builder.append(", Financial_Instrument_Short_Name=");
		builder.append(Financial_Instrument_Short_Name);
		builder.append(", Financial_Instrument_Short_Name__Change_Flag=");
		builder.append(Financial_Instrument_Short_Name__Change_Flag);
		builder.append(", Financial_Instrument_Short_Name__ESMA=");
		builder.append(Financial_Instrument_Short_Name__ESMA);
		builder.append(", Financial_Instrument_Short_Name__ESMA__Change_Flag=");
		builder.append(Financial_Instrument_Short_Name__ESMA__Change_Flag);
		builder.append(", Financial_Instrument_Short_Name__ESMA__Previous=");
		builder.append(Financial_Instrument_Short_Name__ESMA__Previous);
		builder.append(", Financial_Instrument_Short_Name__Previous=");
		builder.append(Financial_Instrument_Short_Name__Previous);
		builder.append(", Financial_Transaction_Tax_Applied=");
		builder.append(Financial_Transaction_Tax_Applied);
		builder.append(", Financial_Transaction_Tax_Applied__Change_Flag=");
		builder.append(Financial_Transaction_Tax_Applied__Change_Flag);
		builder.append(", Financial_Transaction_Tax_Applied__Previous=");
		builder.append(Financial_Transaction_Tax_Applied__Previous);
		builder.append(", Financial_Transaction_Tax_Rate=");
		builder.append(Financial_Transaction_Tax_Rate);
		builder.append(", Financial_Transaction_Tax_Rate__Change_Flag=");
		builder.append(Financial_Transaction_Tax_Rate__Change_Flag);
		builder.append(", Financial_Transaction_Tax_Rate__Previous=");
		builder.append(Financial_Transaction_Tax_Rate__Previous);
		builder.append(", Finsbury_Company_Code=");
		builder.append(Finsbury_Company_Code);
		builder.append(", Finsbury_Company_Code__Change_Flag=");
		builder.append(Finsbury_Company_Code__Change_Flag);
		builder.append(", Finsbury_Company_Code__Previous=");
		builder.append(Finsbury_Company_Code__Previous);
		builder.append(", First_Notice_Day=");
		builder.append(First_Notice_Day);
		builder.append(", First_Notice_Day__Change_Flag=");
		builder.append(First_Notice_Day__Change_Flag);
		builder.append(", First_Notice_Day__Previous=");
		builder.append(First_Notice_Day__Previous);
		builder.append(", First_Trading_Date=");
		builder.append(First_Trading_Date);
		builder.append(", First_Trading_Date__Change_Flag=");
		builder.append(First_Trading_Date__Change_Flag);
		builder.append(", First_Trading_Date__Previous=");
		builder.append(First_Trading_Date__Previous);
		builder.append(", Fixed_Rate__ESMA=");
		builder.append(Fixed_Rate__ESMA);
		builder.append(", Fixed_Rate__ESMA__Change_Flag=");
		builder.append(Fixed_Rate__ESMA__Change_Flag);
		builder.append(", Fixed_Rate__ESMA__Previous=");
		builder.append(Fixed_Rate__ESMA__Previous);
		builder.append(", Fixed_Rate_of_Leg_1=");
		builder.append(Fixed_Rate_of_Leg_1);
		builder.append(", Fixed_Rate_of_Leg_1__Change_Flag=");
		builder.append(Fixed_Rate_of_Leg_1__Change_Flag);
		builder.append(", Fixed_Rate_of_Leg_1__ESMA=");
		builder.append(Fixed_Rate_of_Leg_1__ESMA);
		builder.append(", Fixed_Rate_of_Leg_1__ESMA__Change_Flag=");
		builder.append(Fixed_Rate_of_Leg_1__ESMA__Change_Flag);
		builder.append(", Fixed_Rate_of_Leg_1__ESMA__Previous=");
		builder.append(Fixed_Rate_of_Leg_1__ESMA__Previous);
		builder.append(", Fixed_Rate_of_Leg_1__Previous=");
		builder.append(Fixed_Rate_of_Leg_1__Previous);
		builder.append(", Fixed_Rate_of_Leg_2=");
		builder.append(Fixed_Rate_of_Leg_2);
		builder.append(", Fixed_Rate_of_Leg_2__Change_Flag=");
		builder.append(Fixed_Rate_of_Leg_2__Change_Flag);
		builder.append(", Fixed_Rate_of_Leg_2__ESMA=");
		builder.append(Fixed_Rate_of_Leg_2__ESMA);
		builder.append(", Fixed_Rate_of_Leg_2__ESMA__Change_Flag=");
		builder.append(Fixed_Rate_of_Leg_2__ESMA__Change_Flag);
		builder.append(", Fixed_Rate_of_Leg_2__ESMA__Previous=");
		builder.append(Fixed_Rate_of_Leg_2__ESMA__Previous);
		builder.append(", Fixed_Rate_of_Leg_2__Previous=");
		builder.append(Fixed_Rate_of_Leg_2__Previous);
		builder.append(", Floating_Rate_of_Leg_2=");
		builder.append(Floating_Rate_of_Leg_2);
		builder.append(", Floating_Rate_of_Leg_2__Change_Flag=");
		builder.append(Floating_Rate_of_Leg_2__Change_Flag);
		builder.append(", Floating_Rate_of_Leg_2__ESMA=");
		builder.append(Floating_Rate_of_Leg_2__ESMA);
		builder.append(", Floating_Rate_of_Leg_2__ESMA__Change_Flag=");
		builder.append(Floating_Rate_of_Leg_2__ESMA__Change_Flag);
		builder.append(", Floating_Rate_of_Leg_2__ESMA__Previous=");
		builder.append(Floating_Rate_of_Leg_2__ESMA__Previous);
		builder.append(", Floating_Rate_of_Leg_2__Previous=");
		builder.append(Floating_Rate_of_Leg_2__Previous);
		builder.append(", Foreign_Ownership_Percent_of_Limit=");
		builder.append(Foreign_Ownership_Percent_of_Limit);
		builder.append(", Foreign_Ownership_Percent_of_Limit__Change_Flag=");
		builder.append(Foreign_Ownership_Percent_of_Limit__Change_Flag);
		builder.append(", Foreign_Ownership_Percent_of_Limit__Previous=");
		builder.append(Foreign_Ownership_Percent_of_Limit__Previous);
		builder.append(", Foreign_Ownership_Percent_of_Total_Shares=");
		builder.append(Foreign_Ownership_Percent_of_Total_Shares);
		builder.append(", Foreign_Ownership_Percent_of_Total_Shares__Change_Flag=");
		builder.append(Foreign_Ownership_Percent_of_Total_Shares__Change_Flag);
		builder.append(", Foreign_Ownership_Percent_of_Total_Shares__Previous=");
		builder.append(Foreign_Ownership_Percent_of_Total_Shares__Previous);
		builder.append(", Foreign_Ownership_Shares_Allowed=");
		builder.append(Foreign_Ownership_Shares_Allowed);
		builder.append(", Foreign_Ownership_Shares_Allowed__Change_Flag=");
		builder.append(Foreign_Ownership_Shares_Allowed__Change_Flag);
		builder.append(", Foreign_Ownership_Shares_Allowed__Previous=");
		builder.append(Foreign_Ownership_Shares_Allowed__Previous);
		builder.append(", Foreign_Ownership_Shares_Held=");
		builder.append(Foreign_Ownership_Shares_Held);
		builder.append(", Foreign_Ownership_Shares_Held__Change_Flag=");
		builder.append(Foreign_Ownership_Shares_Held__Change_Flag);
		builder.append(", Foreign_Ownership_Shares_Held__Previous=");
		builder.append(Foreign_Ownership_Shares_Held__Previous);
		builder.append(", Foreign_Ownership_Shares_Remaining=");
		builder.append(Foreign_Ownership_Shares_Remaining);
		builder.append(", Foreign_Ownership_Shares_Remaining__Change_Flag=");
		builder.append(Foreign_Ownership_Shares_Remaining__Change_Flag);
		builder.append(", Foreign_Ownership_Shares_Remaining__Previous=");
		builder.append(Foreign_Ownership_Shares_Remaining__Previous);
		builder.append(", France_Code=");
		builder.append(France_Code);
		builder.append(", France_Code__Change_Flag=");
		builder.append(France_Code__Change_Flag);
		builder.append(", France_Code__Previous=");
		builder.append(France_Code__Previous);
		builder.append(", Freight_Derivative_Size=");
		builder.append(Freight_Derivative_Size);
		builder.append(", Freight_Derivative_Size__Change_Flag=");
		builder.append(Freight_Derivative_Size__Change_Flag);
		builder.append(", Freight_Derivative_Size__Previous=");
		builder.append(Freight_Derivative_Size__Previous);
		builder.append(", Fully_Funded_Flag=");
		builder.append(Fully_Funded_Flag);
		builder.append(", Fully_Funded_Flag__Change_Flag=");
		builder.append(Fully_Funded_Flag__Change_Flag);
		builder.append(", Fully_Funded_Flag__Previous=");
		builder.append(Fully_Funded_Flag__Previous);
		builder.append(", GICS_Industry_Code=");
		builder.append(GICS_Industry_Code);
		builder.append(", GICS_Industry_Code__Change_Flag=");
		builder.append(GICS_Industry_Code__Change_Flag);
		builder.append(", GICS_Industry_Code__Previous=");
		builder.append(GICS_Industry_Code__Previous);
		builder.append(", ICB_Code=");
		builder.append(ICB_Code);
		builder.append(", ICB_Code__Change_Flag=");
		builder.append(ICB_Code__Change_Flag);
		builder.append(", ICB_Code__Previous=");
		builder.append(ICB_Code__Previous);
		builder.append(", ILX_Code=");
		builder.append(ILX_Code);
		builder.append(", ILX_Code__Change_Flag=");
		builder.append(ILX_Code__Change_Flag);
		builder.append(", ILX_Code__Previous=");
		builder.append(ILX_Code__Previous);
		builder.append(", INAV_Quote_ID=");
		builder.append(INAV_Quote_ID);
		builder.append(", INAV_Quote_ID__Change_Flag=");
		builder.append(INAV_Quote_ID__Change_Flag);
		builder.append(", INAV_Quote_ID__Previous=");
		builder.append(INAV_Quote_ID__Previous);
		builder.append(", INAV_RIC=");
		builder.append(INAV_RIC);
		builder.append(", INAV_RIC__Change_Flag=");
		builder.append(INAV_RIC__Change_Flag);
		builder.append(", INAV_RIC__Previous=");
		builder.append(INAV_RIC__Previous);
		builder.append(", IR_Term_of_Contract=");
		builder.append(IR_Term_of_Contract);
		builder.append(", IR_Term_of_Contract__Change_Flag=");
		builder.append(IR_Term_of_Contract__Change_Flag);
		builder.append(", IR_Term_of_Contract__ESMA=");
		builder.append(IR_Term_of_Contract__ESMA);
		builder.append(", IR_Term_of_Contract__ESMA__Change_Flag=");
		builder.append(IR_Term_of_Contract__ESMA__Change_Flag);
		builder.append(", IR_Term_of_Contract__ESMA__Previous=");
		builder.append(IR_Term_of_Contract__ESMA__Previous);
		builder.append(", IR_Term_of_Contract__Previous=");
		builder.append(IR_Term_of_Contract__Previous);
		builder.append(", IR_Term_of_Contract_of_Leg_2=");
		builder.append(IR_Term_of_Contract_of_Leg_2);
		builder.append(", IR_Term_of_Contract_of_Leg_2__Change_Flag=");
		builder.append(IR_Term_of_Contract_of_Leg_2__Change_Flag);
		builder.append(", IR_Term_of_Contract_of_Leg_2__ESMA=");
		builder.append(IR_Term_of_Contract_of_Leg_2__ESMA);
		builder.append(", IR_Term_of_Contract_of_Leg_2__ESMA__Change_Flag=");
		builder.append(IR_Term_of_Contract_of_Leg_2__ESMA__Change_Flag);
		builder.append(", IR_Term_of_Contract_of_Leg_2__ESMA__Previous=");
		builder.append(IR_Term_of_Contract_of_Leg_2__ESMA__Previous);
		builder.append(", IR_Term_of_Contract_of_Leg_2__Previous=");
		builder.append(IR_Term_of_Contract_of_Leg_2__Previous);
		builder.append(", ISIN=");
		builder.append(ISIN);
		builder.append(", ISIN__Change_Flag=");
		builder.append(ISIN__Change_Flag);
		builder.append(", ISIN__Previous=");
		builder.append(ISIN__Previous);
		builder.append(", ISIX_Code=");
		builder.append(ISIX_Code);
		builder.append(", ISIX_Code__Change_Flag=");
		builder.append(ISIX_Code__Change_Flag);
		builder.append(", ISIX_Code__Previous=");
		builder.append(ISIX_Code__Previous);
		builder.append(", ISO_CFI_Code=");
		builder.append(ISO_CFI_Code);
		builder.append(", ISO_CFI_Code__Change_Flag=");
		builder.append(ISO_CFI_Code__Change_Flag);
		builder.append(", ISO_CFI_Code__Previous=");
		builder.append(ISO_CFI_Code__Previous);
		builder.append(", In_ANNA_DSB_Flag=");
		builder.append(In_ANNA_DSB_Flag);
		builder.append(", In_ANNA_DSB_Flag__Change_Flag=");
		builder.append(In_ANNA_DSB_Flag__Change_Flag);
		builder.append(", In_ANNA_DSB_Flag__Previous=");
		builder.append(In_ANNA_DSB_Flag__Previous);
		builder.append(", In_ESMA_FIRDS=");
		builder.append(In_ESMA_FIRDS);
		builder.append(", In_ESMA_FIRDS__Change_Flag=");
		builder.append(In_ESMA_FIRDS__Change_Flag);
		builder.append(", In_ESMA_FIRDS__Previous=");
		builder.append(In_ESMA_FIRDS__Previous);
		builder.append(", Inflation_Index_ISIN=");
		builder.append(Inflation_Index_ISIN);
		builder.append(", Inflation_Index_ISIN__Change_Flag=");
		builder.append(Inflation_Index_ISIN__Change_Flag);
		builder.append(", Inflation_Index_ISIN__Previous=");
		builder.append(Inflation_Index_ISIN__Previous);
		builder.append(", Instrument_Classification__ESMA=");
		builder.append(Instrument_Classification__ESMA);
		builder.append(", Instrument_Classification__ESMA__Change_Flag=");
		builder.append(Instrument_Classification__ESMA__Change_Flag);
		builder.append(", Instrument_Classification__ESMA__Previous=");
		builder.append(Instrument_Classification__ESMA__Previous);
		builder.append(", Instrument_Full_Name__ESMA=");
		builder.append(Instrument_Full_Name__ESMA);
		builder.append(", Instrument_Full_Name__ESMA__Change_Flag=");
		builder.append(Instrument_Full_Name__ESMA__Change_Flag);
		builder.append(", Instrument_Full_Name__ESMA__Previous=");
		builder.append(Instrument_Full_Name__ESMA__Previous);
		builder.append(", Inverse_Rate_Marker=");
		builder.append(Inverse_Rate_Marker);
		builder.append(", Inverse_Rate_Marker__Change_Flag=");
		builder.append(Inverse_Rate_Marker__Change_Flag);
		builder.append(", Inverse_Rate_Marker__Previous=");
		builder.append(Inverse_Rate_Marker__Previous);
		builder.append(", Ireland_Stamp_Duty_Flag=");
		builder.append(Ireland_Stamp_Duty_Flag);
		builder.append(", Ireland_Stamp_Duty_Flag__Change_Flag=");
		builder.append(Ireland_Stamp_Duty_Flag__Change_Flag);
		builder.append(", Ireland_Stamp_Duty_Flag__Previous=");
		builder.append(Ireland_Stamp_Duty_Flag__Previous);
		builder.append(", Is_Adjusted=");
		builder.append(Is_Adjusted);
		builder.append(", Is_Adjusted__Change_Flag=");
		builder.append(Is_Adjusted__Change_Flag);
		builder.append(", Is_Adjusted__Previous=");
		builder.append(Is_Adjusted__Previous);
		builder.append(", Issue_Date=");
		builder.append(Issue_Date);
		builder.append(", Issue_Date__Change_Flag=");
		builder.append(Issue_Date__Change_Flag);
		builder.append(", Issue_Date__Previous=");
		builder.append(Issue_Date__Previous);
		builder.append(", Issue_Perm_ID=");
		builder.append(Issue_Perm_ID);
		builder.append(", Issue_Perm_ID__Change_Flag=");
		builder.append(Issue_Perm_ID__Change_Flag);
		builder.append(", Issue_Perm_ID__Previous=");
		builder.append(Issue_Perm_ID__Previous);
		builder.append(", Issue_Price=");
		builder.append(Issue_Price);
		builder.append(", Issue_Price__Change_Flag=");
		builder.append(Issue_Price__Change_Flag);
		builder.append(", Issue_Price__Previous=");
		builder.append(Issue_Price__Previous);
		builder.append(", Issuer_LEI=");
		builder.append(Issuer_LEI);
		builder.append(", Issuer_LEI__Change_Flag=");
		builder.append(Issuer_LEI__Change_Flag);
		builder.append(", Issuer_LEI__Previous=");
		builder.append(Issuer_LEI__Previous);
		builder.append(", Issuer_Name=");
		builder.append(Issuer_Name);
		builder.append(", Issuer_Name__Change_Flag=");
		builder.append(Issuer_Name__Change_Flag);
		builder.append(", Issuer_Name__Previous=");
		builder.append(Issuer_Name__Previous);
		builder.append(", Issuer_OrgID=");
		builder.append(Issuer_OrgID);
		builder.append(", Issuer_OrgID__Change_Flag=");
		builder.append(Issuer_OrgID__Change_Flag);
		builder.append(", Issuer_OrgID__Previous=");
		builder.append(Issuer_OrgID__Previous);
		builder.append(", Issuer_or_Trading_Venue_LEI__ESMA=");
		builder.append(Issuer_or_Trading_Venue_LEI__ESMA);
		builder.append(", Issuer_or_Trading_Venue_LEI__ESMA__Change_Flag=");
		builder.append(Issuer_or_Trading_Venue_LEI__ESMA__Change_Flag);
		builder.append(", Issuer_or_Trading_Venue_LEI__ESMA__Previous=");
		builder.append(Issuer_or_Trading_Venue_LEI__ESMA__Previous);
		builder.append(", Kazakhstan_Code=");
		builder.append(Kazakhstan_Code);
		builder.append(", Kazakhstan_Code__Change_Flag=");
		builder.append(Kazakhstan_Code__Change_Flag);
		builder.append(", Kazakhstan_Code__Previous=");
		builder.append(Kazakhstan_Code__Previous);
		builder.append(", Last_Delivery_Date=");
		builder.append(Last_Delivery_Date);
		builder.append(", Last_Delivery_Date__Change_Flag=");
		builder.append(Last_Delivery_Date__Change_Flag);
		builder.append(", Last_Delivery_Date__Previous=");
		builder.append(Last_Delivery_Date__Previous);
		builder.append(", Last_Trading_Day=");
		builder.append(Last_Trading_Day);
		builder.append(", Last_Trading_Day__Change_Flag=");
		builder.append(Last_Trading_Day__Change_Flag);
		builder.append(", Last_Trading_Day__Previous=");
		builder.append(Last_Trading_Day__Previous);
		builder.append(", Level=");
		builder.append(Level);
		builder.append(", Limited_Terms_Flag=");
		builder.append(Limited_Terms_Flag);
		builder.append(", Limited_Terms_Flag__Change_Flag=");
		builder.append(Limited_Terms_Flag__Change_Flag);
		builder.append(", Limited_Terms_Flag__Previous=");
		builder.append(Limited_Terms_Flag__Previous);
		builder.append(", Lipper_ID=");
		builder.append(Lipper_ID);
		builder.append(", Lipper_ID__Change_Flag=");
		builder.append(Lipper_ID__Change_Flag);
		builder.append(", Lipper_ID__Previous=");
		builder.append(Lipper_ID__Previous);
		builder.append(", Listing_Status=");
		builder.append(Listing_Status);
		builder.append(", Listing_Status__Change_Flag=");
		builder.append(Listing_Status__Change_Flag);
		builder.append(", Listing_Status__Previous=");
		builder.append(Listing_Status__Previous);
		builder.append(", Listing_Suspension_Initiator__ESMA=");
		builder.append(Listing_Suspension_Initiator__ESMA);
		builder.append(", Listing_Suspension_Initiator__ESMA__Change_Flag=");
		builder.append(Listing_Suspension_Initiator__ESMA__Change_Flag);
		builder.append(", Listing_Suspension_Initiator__ESMA__Previous=");
		builder.append(Listing_Suspension_Initiator__ESMA__Previous);
		builder.append(", Listing_Suspension_Notifying_NCA__ESMA=");
		builder.append(Listing_Suspension_Notifying_NCA__ESMA);
		builder.append(", Listing_Suspension_Notifying_NCA__ESMA__Change_Flag=");
		builder.append(Listing_Suspension_Notifying_NCA__ESMA__Change_Flag);
		builder.append(", Listing_Suspension_Notifying_NCA__ESMA__Previous=");
		builder.append(Listing_Suspension_Notifying_NCA__ESMA__Previous);
		builder.append(", Lot_Size=");
		builder.append(Lot_Size);
		builder.append(", Lot_Size__Change_Flag=");
		builder.append(Lot_Size__Change_Flag);
		builder.append(", Lot_Size__Previous=");
		builder.append(Lot_Size__Previous);
		builder.append(", Lot_Units=");
		builder.append(Lot_Units);
		builder.append(", Lot_Units__Change_Flag=");
		builder.append(Lot_Units__Change_Flag);
		builder.append(", Lot_Units__Previous=");
		builder.append(Lot_Units__Previous);
		builder.append(", Lower_Barrier=");
		builder.append(Lower_Barrier);
		builder.append(", Lower_Barrier__Change_Flag=");
		builder.append(Lower_Barrier__Change_Flag);
		builder.append(", Lower_Barrier__Previous=");
		builder.append(Lower_Barrier__Previous);
		builder.append(", MIC=");
		builder.append(MIC);
		builder.append(", MIC__Change_Flag=");
		builder.append(MIC__Change_Flag);
		builder.append(", MIC__Previous=");
		builder.append(MIC__Previous);
		builder.append(", MIFID_Sub_Asset_Class=");
		builder.append(MIFID_Sub_Asset_Class);
		builder.append(", MIFID_Sub_Asset_Class__Change_Flag=");
		builder.append(MIFID_Sub_Asset_Class__Change_Flag);
		builder.append(", MIFID_Sub_Asset_Class__Previous=");
		builder.append(MIFID_Sub_Asset_Class__Previous);
		builder.append(", MIFIR_Identifier=");
		builder.append(MIFIR_Identifier);
		builder.append(", MIFIR_Identifier__Change_Flag=");
		builder.append(MIFIR_Identifier__Change_Flag);
		builder.append(", MIFIR_Identifier__Previous=");
		builder.append(MIFIR_Identifier__Previous);
		builder.append(", Malaysia_Code=");
		builder.append(Malaysia_Code);
		builder.append(", Malaysia_Code__Change_Flag=");
		builder.append(Malaysia_Code__Change_Flag);
		builder.append(", Malaysia_Code__Previous=");
		builder.append(Malaysia_Code__Previous);
		builder.append(", Market_Attributable_Source_Perm_ID=");
		builder.append(Market_Attributable_Source_Perm_ID);
		builder.append(", Market_Attributable_Source_Perm_ID__Change_Flag=");
		builder.append(Market_Attributable_Source_Perm_ID__Change_Flag);
		builder.append(", Market_Attributable_Source_Perm_ID__Previous=");
		builder.append(Market_Attributable_Source_Perm_ID__Previous);
		builder.append(", Market_Level_CDHKG=");
		builder.append(Market_Level_CDHKG);
		builder.append(", Market_Level_CDHKG__Change_Flag=");
		builder.append(Market_Level_CDHKG__Change_Flag);
		builder.append(", Market_Level_CDHKG__Previous=");
		builder.append(Market_Level_CDHKG__Previous);
		builder.append(", Market_MIC=");
		builder.append(Market_MIC);
		builder.append(", Market_MIC__Change_Flag=");
		builder.append(Market_MIC__Change_Flag);
		builder.append(", Market_MIC__Previous=");
		builder.append(Market_MIC__Previous);
		builder.append(", Market_Segment_MIC=");
		builder.append(Market_Segment_MIC);
		builder.append(", Market_Segment_MIC__Change_Flag=");
		builder.append(Market_Segment_MIC__Change_Flag);
		builder.append(", Market_Segment_MIC__Previous=");
		builder.append(Market_Segment_MIC__Previous);
		builder.append(", Market_Segment_Name=");
		builder.append(Market_Segment_Name);
		builder.append(", Market_Segment_Name__Change_Flag=");
		builder.append(Market_Segment_Name__Change_Flag);
		builder.append(", Market_Segment_Name__Previous=");
		builder.append(Market_Segment_Name__Previous);
		builder.append(", Maturity_Date=");
		builder.append(Maturity_Date);
		builder.append(", Maturity_Date__Change_Flag=");
		builder.append(Maturity_Date__Change_Flag);
		builder.append(", Maturity_Date__Previous=");
		builder.append(Maturity_Date__Previous);
		builder.append(", Method_of_Delivery=");
		builder.append(Method_of_Delivery);
		builder.append(", Method_of_Delivery__Change_Flag=");
		builder.append(Method_of_Delivery__Change_Flag);
		builder.append(", Method_of_Delivery__Previous=");
		builder.append(Method_of_Delivery__Previous);
		builder.append(", MiFID_Asset_Class=");
		builder.append(MiFID_Asset_Class);
		builder.append(", MiFID_Asset_Class__Change_Flag=");
		builder.append(MiFID_Asset_Class__Change_Flag);
		builder.append(", MiFID_Asset_Class__Previous=");
		builder.append(MiFID_Asset_Class__Previous);
		builder.append(", MiFID_Asset_Class_of_Underlying=");
		builder.append(MiFID_Asset_Class_of_Underlying);
		builder.append(", MiFID_Asset_Class_of_Underlying__Change_Flag=");
		builder.append(MiFID_Asset_Class_of_Underlying__Change_Flag);
		builder.append(", MiFID_Asset_Class_of_Underlying__Previous=");
		builder.append(MiFID_Asset_Class_of_Underlying__Previous);
		builder.append(", MiFID_Average_Daily_Notional_Amount_per_instrument__ESMA=");
		builder.append(MiFID_Average_Daily_Notional_Amount_per_instrument__ESMA);
		builder.append(", MiFID_Average_Daily_Notional_Amount_per_instrument__ESMA__Change_Flag=");
		builder.append(MiFID_Average_Daily_Notional_Amount_per_instrument__ESMA__Change_Flag);
		builder.append(", MiFID_Average_Daily_Notional_Amount_per_instrument__ESMA__Previous=");
		builder.append(MiFID_Average_Daily_Notional_Amount_per_instrument__ESMA__Previous);
		builder.append(", MiFID_Average_Daily_Turnover__ESMA=");
		builder.append(MiFID_Average_Daily_Turnover__ESMA);
		builder.append(", MiFID_Average_Daily_Turnover__ESMA__Change_Flag=");
		builder.append(MiFID_Average_Daily_Turnover__ESMA__Change_Flag);
		builder.append(", MiFID_Average_Daily_Turnover__ESMA__Previous=");
		builder.append(MiFID_Average_Daily_Turnover__ESMA__Previous);
		builder.append(", MiFID_Average_Daily_Turnover_Currency_Code=");
		builder.append(MiFID_Average_Daily_Turnover_Currency_Code);
		builder.append(", MiFID_Average_Daily_Turnover_Currency_Code__Change_Flag=");
		builder.append(MiFID_Average_Daily_Turnover_Currency_Code__Change_Flag);
		builder.append(", MiFID_Average_Daily_Turnover_Currency_Code__Previous=");
		builder.append(MiFID_Average_Daily_Turnover_Currency_Code__Previous);
		builder.append(", MiFID_Average_Daily_number_of_Trades_per_instrument__ESMA=");
		builder.append(MiFID_Average_Daily_number_of_Trades_per_instrument__ESMA);
		builder.append(", MiFID_Average_Daily_number_of_Trades_per_instrument__ESMA__Change_Flag=");
		builder.append(MiFID_Average_Daily_number_of_Trades_per_instrument__ESMA__Change_Flag);
		builder.append(", MiFID_Average_Daily_number_of_Trades_per_instrument__ESMA__Previous=");
		builder.append(MiFID_Average_Daily_number_of_Trades_per_instrument__ESMA__Previous);
		builder.append(", MiFID_Average_Value_Of_Transactions__ESMA=");
		builder.append(MiFID_Average_Value_Of_Transactions__ESMA);
		builder.append(", MiFID_Average_Value_Of_Transactions__ESMA__Change_Flag=");
		builder.append(MiFID_Average_Value_Of_Transactions__ESMA__Change_Flag);
		builder.append(", MiFID_Average_Value_Of_Transactions__ESMA__Previous=");
		builder.append(MiFID_Average_Value_Of_Transactions__ESMA__Previous);
		builder.append(", MiFID_Average_Value_Of_Transactions_Currency_Code=");
		builder.append(MiFID_Average_Value_Of_Transactions_Currency_Code);
		builder.append(", MiFID_Average_Value_Of_Transactions_Currency_Code__Change_Flag=");
		builder.append(MiFID_Average_Value_Of_Transactions_Currency_Code__Change_Flag);
		builder.append(", MiFID_Average_Value_Of_Transactions_Currency_Code__Previous=");
		builder.append(MiFID_Average_Value_Of_Transactions_Currency_Code__Previous);
		builder.append(", MiFID_Base_Point_Spread=");
		builder.append(MiFID_Base_Point_Spread);
		builder.append(", MiFID_Base_Point_Spread__Change_Flag=");
		builder.append(MiFID_Base_Point_Spread__Change_Flag);
		builder.append(", MiFID_Base_Point_Spread__ESMA=");
		builder.append(MiFID_Base_Point_Spread__ESMA);
		builder.append(", MiFID_Base_Point_Spread__ESMA__Change_Flag=");
		builder.append(MiFID_Base_Point_Spread__ESMA__Change_Flag);
		builder.append(", MiFID_Base_Point_Spread__ESMA__Previous=");
		builder.append(MiFID_Base_Point_Spread__ESMA__Previous);
		builder.append(", MiFID_Base_Point_Spread__Previous=");
		builder.append(MiFID_Base_Point_Spread__Previous);
		builder.append(", MiFID_Base_Product=");
		builder.append(MiFID_Base_Product);
		builder.append(", MiFID_Base_Product__Change_Flag=");
		builder.append(MiFID_Base_Product__Change_Flag);
		builder.append(", MiFID_Base_Product__ESMA=");
		builder.append(MiFID_Base_Product__ESMA);
		builder.append(", MiFID_Base_Product__ESMA__Change_Flag=");
		builder.append(MiFID_Base_Product__ESMA__Change_Flag);
		builder.append(", MiFID_Base_Product__ESMA__Previous=");
		builder.append(MiFID_Base_Product__ESMA__Previous);
		builder.append(", MiFID_Base_Product__Previous=");
		builder.append(MiFID_Base_Product__Previous);
		builder.append(", MiFID_Bond_Seniority=");
		builder.append(MiFID_Bond_Seniority);
		builder.append(", MiFID_Bond_Seniority__Change_Flag=");
		builder.append(MiFID_Bond_Seniority__Change_Flag);
		builder.append(", MiFID_Bond_Seniority__ESMA=");
		builder.append(MiFID_Bond_Seniority__ESMA);
		builder.append(", MiFID_Bond_Seniority__ESMA__Change_Flag=");
		builder.append(MiFID_Bond_Seniority__ESMA__Change_Flag);
		builder.append(", MiFID_Bond_Seniority__ESMA__Previous=");
		builder.append(MiFID_Bond_Seniority__ESMA__Previous);
		builder.append(", MiFID_Bond_Seniority__Previous=");
		builder.append(MiFID_Bond_Seniority__Previous);
		builder.append(", MiFID_Bond_Type=");
		builder.append(MiFID_Bond_Type);
		builder.append(", MiFID_Bond_Type__Change_Flag=");
		builder.append(MiFID_Bond_Type__Change_Flag);
		builder.append(", MiFID_Bond_Type__Previous=");
		builder.append(MiFID_Bond_Type__Previous);
		builder.append(", MiFID_COFIA_Liquidity_Flag=");
		builder.append(MiFID_COFIA_Liquidity_Flag);
		builder.append(", MiFID_COFIA_Liquidity_Flag__Change_Flag=");
		builder.append(MiFID_COFIA_Liquidity_Flag__Change_Flag);
		builder.append(", MiFID_COFIA_Liquidity_Flag__Previous=");
		builder.append(MiFID_COFIA_Liquidity_Flag__Previous);
		builder.append(", MiFID_Clearing_Obligation_Flag=");
		builder.append(MiFID_Clearing_Obligation_Flag);
		builder.append(", MiFID_Clearing_Obligation_Flag__Change_Flag=");
		builder.append(MiFID_Clearing_Obligation_Flag__Change_Flag);
		builder.append(", MiFID_Clearing_Obligation_Flag__Previous=");
		builder.append(MiFID_Clearing_Obligation_Flag__Previous);
		builder.append(", MiFID_Clearing_Obligation_Flag_Effective_Date=");
		builder.append(MiFID_Clearing_Obligation_Flag_Effective_Date);
		builder.append(", MiFID_Clearing_Obligation_Flag_Effective_Date__Change_Flag=");
		builder.append(MiFID_Clearing_Obligation_Flag_Effective_Date__Change_Flag);
		builder.append(", MiFID_Clearing_Obligation_Flag_Effective_Date__Previous=");
		builder.append(MiFID_Clearing_Obligation_Flag_Effective_Date__Previous);
		builder.append(", MiFID_Commodities_Derivative_Indicator=");
		builder.append(MiFID_Commodities_Derivative_Indicator);
		builder.append(", MiFID_Commodities_Derivative_Indicator__Change_Flag=");
		builder.append(MiFID_Commodities_Derivative_Indicator__Change_Flag);
		builder.append(", MiFID_Commodities_Derivative_Indicator__ESMA=");
		builder.append(MiFID_Commodities_Derivative_Indicator__ESMA);
		builder.append(", MiFID_Commodities_Derivative_Indicator__ESMA__Change_Flag=");
		builder.append(MiFID_Commodities_Derivative_Indicator__ESMA__Change_Flag);
		builder.append(", MiFID_Commodities_Derivative_Indicator__ESMA__Previous=");
		builder.append(MiFID_Commodities_Derivative_Indicator__ESMA__Previous);
		builder.append(", MiFID_Commodities_Derivative_Indicator__Previous=");
		builder.append(MiFID_Commodities_Derivative_Indicator__Previous);
		builder.append(", MiFID_Complex_Instrument_Flag=");
		builder.append(MiFID_Complex_Instrument_Flag);
		builder.append(", MiFID_Complex_Instrument_Flag__Change_Flag=");
		builder.append(MiFID_Complex_Instrument_Flag__Change_Flag);
		builder.append(", MiFID_Complex_Instrument_Flag__ESMA=");
		builder.append(MiFID_Complex_Instrument_Flag__ESMA);
		builder.append(", MiFID_Complex_Instrument_Flag__ESMA__Change_Flag=");
		builder.append(MiFID_Complex_Instrument_Flag__ESMA__Change_Flag);
		builder.append(", MiFID_Complex_Instrument_Flag__ESMA__Previous=");
		builder.append(MiFID_Complex_Instrument_Flag__ESMA__Previous);
		builder.append(", MiFID_Complex_Instrument_Flag__Previous=");
		builder.append(MiFID_Complex_Instrument_Flag__Previous);
		builder.append(", MiFID_Complex_Instrument_Reason=");
		builder.append(MiFID_Complex_Instrument_Reason);
		builder.append(", MiFID_Complex_Instrument_Reason__Change_Flag=");
		builder.append(MiFID_Complex_Instrument_Reason__Change_Flag);
		builder.append(", MiFID_Complex_Instrument_Reason__Previous=");
		builder.append(MiFID_Complex_Instrument_Reason__Previous);
		builder.append(", MiFID_Contract_Subtype=");
		builder.append(MiFID_Contract_Subtype);
		builder.append(", MiFID_Contract_Subtype__Change_Flag=");
		builder.append(MiFID_Contract_Subtype__Change_Flag);
		builder.append(", MiFID_Contract_Subtype__Previous=");
		builder.append(MiFID_Contract_Subtype__Previous);
		builder.append(", MiFID_Contract_Type=");
		builder.append(MiFID_Contract_Type);
		builder.append(", MiFID_Contract_Type__Change_Flag=");
		builder.append(MiFID_Contract_Type__Change_Flag);
		builder.append(", MiFID_Contract_Type__Previous=");
		builder.append(MiFID_Contract_Type__Previous);
		builder.append(", MiFID_Delivery_Type=");
		builder.append(MiFID_Delivery_Type);
		builder.append(", MiFID_Delivery_Type__Change_Flag=");
		builder.append(MiFID_Delivery_Type__Change_Flag);
		builder.append(", MiFID_Delivery_Type__ESMA=");
		builder.append(MiFID_Delivery_Type__ESMA);
		builder.append(", MiFID_Delivery_Type__ESMA__Change_Flag=");
		builder.append(MiFID_Delivery_Type__ESMA__Change_Flag);
		builder.append(", MiFID_Delivery_Type__ESMA__Previous=");
		builder.append(MiFID_Delivery_Type__ESMA__Previous);
		builder.append(", MiFID_Delivery_Type__Previous=");
		builder.append(MiFID_Delivery_Type__Previous);
		builder.append(", MiFID_Emissions_Allowances_Sub_Type=");
		builder.append(MiFID_Emissions_Allowances_Sub_Type);
		builder.append(", MiFID_Emissions_Allowances_Sub_Type__Change_Flag=");
		builder.append(MiFID_Emissions_Allowances_Sub_Type__Change_Flag);
		builder.append(", MiFID_Emissions_Allowances_Sub_Type__Previous=");
		builder.append(MiFID_Emissions_Allowances_Sub_Type__Previous);
		builder.append(", MiFID_Exercise_Style=");
		builder.append(MiFID_Exercise_Style);
		builder.append(", MiFID_Exercise_Style__Change_Flag=");
		builder.append(MiFID_Exercise_Style__Change_Flag);
		builder.append(", MiFID_Exercise_Style__ESMA=");
		builder.append(MiFID_Exercise_Style__ESMA);
		builder.append(", MiFID_Exercise_Style__ESMA__Change_Flag=");
		builder.append(MiFID_Exercise_Style__ESMA__Change_Flag);
		builder.append(", MiFID_Exercise_Style__ESMA__Previous=");
		builder.append(MiFID_Exercise_Style__ESMA__Previous);
		builder.append(", MiFID_Exercise_Style__Previous=");
		builder.append(MiFID_Exercise_Style__Previous);
		builder.append(", MiFID_Expiration_Date=");
		builder.append(MiFID_Expiration_Date);
		builder.append(", MiFID_Expiration_Date__Change_Flag=");
		builder.append(MiFID_Expiration_Date__Change_Flag);
		builder.append(", MiFID_Expiration_Date__ESMA=");
		builder.append(MiFID_Expiration_Date__ESMA);
		builder.append(", MiFID_Expiration_Date__ESMA__Change_Flag=");
		builder.append(MiFID_Expiration_Date__ESMA__Change_Flag);
		builder.append(", MiFID_Expiration_Date__ESMA__Previous=");
		builder.append(MiFID_Expiration_Date__ESMA__Previous);
		builder.append(", MiFID_Expiration_Date__Previous=");
		builder.append(MiFID_Expiration_Date__Previous);
		builder.append(", MiFID_FX_Type=");
		builder.append(MiFID_FX_Type);
		builder.append(", MiFID_FX_Type__Change_Flag=");
		builder.append(MiFID_FX_Type__Change_Flag);
		builder.append(", MiFID_FX_Type__Previous=");
		builder.append(MiFID_FX_Type__Previous);
		builder.append(", MiFID_Final_Price_Type=");
		builder.append(MiFID_Final_Price_Type);
		builder.append(", MiFID_Final_Price_Type__Change_Flag=");
		builder.append(MiFID_Final_Price_Type__Change_Flag);
		builder.append(", MiFID_Final_Price_Type__ESMA=");
		builder.append(MiFID_Final_Price_Type__ESMA);
		builder.append(", MiFID_Final_Price_Type__ESMA__Change_Flag=");
		builder.append(MiFID_Final_Price_Type__ESMA__Change_Flag);
		builder.append(", MiFID_Final_Price_Type__ESMA__Previous=");
		builder.append(MiFID_Final_Price_Type__ESMA__Previous);
		builder.append(", MiFID_Final_Price_Type__Previous=");
		builder.append(MiFID_Final_Price_Type__Previous);
		builder.append(", MiFID_First_Trade_Date=");
		builder.append(MiFID_First_Trade_Date);
		builder.append(", MiFID_First_Trade_Date__Change_Flag=");
		builder.append(MiFID_First_Trade_Date__Change_Flag);
		builder.append(", MiFID_First_Trade_Date__ESMA=");
		builder.append(MiFID_First_Trade_Date__ESMA);
		builder.append(", MiFID_First_Trade_Date__ESMA__Change_Flag=");
		builder.append(MiFID_First_Trade_Date__ESMA__Change_Flag);
		builder.append(", MiFID_First_Trade_Date__ESMA__Previous=");
		builder.append(MiFID_First_Trade_Date__ESMA__Previous);
		builder.append(", MiFID_First_Trade_Date__Previous=");
		builder.append(MiFID_First_Trade_Date__Previous);
		builder.append(", MiFID_Flag=");
		builder.append(MiFID_Flag);
		builder.append(", MiFID_Flag__Change_Flag=");
		builder.append(MiFID_Flag__Change_Flag);
		builder.append(", MiFID_Flag__Previous=");
		builder.append(MiFID_Flag__Previous);
		builder.append(", MiFID_Free_Float__ESMA=");
		builder.append(MiFID_Free_Float__ESMA);
		builder.append(", MiFID_Free_Float__ESMA__Change_Flag=");
		builder.append(MiFID_Free_Float__ESMA__Change_Flag);
		builder.append(", MiFID_Free_Float__ESMA__Previous=");
		builder.append(MiFID_Free_Float__ESMA__Previous);
		builder.append(", MiFID_Free_Float_Currency_Code=");
		builder.append(MiFID_Free_Float_Currency_Code);
		builder.append(", MiFID_Free_Float_Currency_Code__Change_Flag=");
		builder.append(MiFID_Free_Float_Currency_Code__Change_Flag);
		builder.append(", MiFID_Free_Float_Currency_Code__Previous=");
		builder.append(MiFID_Free_Float_Currency_Code__Previous);
		builder.append(", MiFID_Free_Float_Upper_Limit__ESMA=");
		builder.append(MiFID_Free_Float_Upper_Limit__ESMA);
		builder.append(", MiFID_Free_Float_Upper_Limit__ESMA__Change_Flag=");
		builder.append(MiFID_Free_Float_Upper_Limit__ESMA__Change_Flag);
		builder.append(", MiFID_Free_Float_Upper_Limit__ESMA__Previous=");
		builder.append(MiFID_Free_Float_Upper_Limit__ESMA__Previous);
		builder.append(", MiFID_Further_Sub_Product=");
		builder.append(MiFID_Further_Sub_Product);
		builder.append(", MiFID_Further_Sub_Product__Change_Flag=");
		builder.append(MiFID_Further_Sub_Product__Change_Flag);
		builder.append(", MiFID_Further_Sub_Product__ESMA=");
		builder.append(MiFID_Further_Sub_Product__ESMA);
		builder.append(", MiFID_Further_Sub_Product__ESMA__Change_Flag=");
		builder.append(MiFID_Further_Sub_Product__ESMA__Change_Flag);
		builder.append(", MiFID_Further_Sub_Product__ESMA__Previous=");
		builder.append(MiFID_Further_Sub_Product__ESMA__Previous);
		builder.append(", MiFID_Further_Sub_Product__Previous=");
		builder.append(MiFID_Further_Sub_Product__Previous);
		builder.append(", MiFID_Index_Identifier=");
		builder.append(MiFID_Index_Identifier);
		builder.append(", MiFID_Index_Identifier__Change_Flag=");
		builder.append(MiFID_Index_Identifier__Change_Flag);
		builder.append(", MiFID_Index_Identifier__ESMA=");
		builder.append(MiFID_Index_Identifier__ESMA);
		builder.append(", MiFID_Index_Identifier__ESMA__Change_Flag=");
		builder.append(MiFID_Index_Identifier__ESMA__Change_Flag);
		builder.append(", MiFID_Index_Identifier__ESMA__Previous=");
		builder.append(MiFID_Index_Identifier__ESMA__Previous);
		builder.append(", MiFID_Index_Identifier__Previous=");
		builder.append(MiFID_Index_Identifier__Previous);
		builder.append(", MiFID_Index_Name=");
		builder.append(MiFID_Index_Name);
		builder.append(", MiFID_Index_Name__Change_Flag=");
		builder.append(MiFID_Index_Name__Change_Flag);
		builder.append(", MiFID_Index_Name__ESMA=");
		builder.append(MiFID_Index_Name__ESMA);
		builder.append(", MiFID_Index_Name__ESMA__Change_Flag=");
		builder.append(MiFID_Index_Name__ESMA__Change_Flag);
		builder.append(", MiFID_Index_Name__ESMA__Previous=");
		builder.append(MiFID_Index_Name__ESMA__Previous);
		builder.append(", MiFID_Index_Name__Previous=");
		builder.append(MiFID_Index_Name__Previous);
		builder.append(", MiFID_Index_Term=");
		builder.append(MiFID_Index_Term);
		builder.append(", MiFID_Index_Term__Change_Flag=");
		builder.append(MiFID_Index_Term__Change_Flag);
		builder.append(", MiFID_Index_Term__ESMA=");
		builder.append(MiFID_Index_Term__ESMA);
		builder.append(", MiFID_Index_Term__ESMA__Change_Flag=");
		builder.append(MiFID_Index_Term__ESMA__Change_Flag);
		builder.append(", MiFID_Index_Term__ESMA__Previous=");
		builder.append(MiFID_Index_Term__ESMA__Previous);
		builder.append(", MiFID_Index_Term__Previous=");
		builder.append(MiFID_Index_Term__Previous);
		builder.append(", MiFID_Inflation_Index_Name=");
		builder.append(MiFID_Inflation_Index_Name);
		builder.append(", MiFID_Inflation_Index_Name__Change_Flag=");
		builder.append(MiFID_Inflation_Index_Name__Change_Flag);
		builder.append(", MiFID_Inflation_Index_Name__Previous=");
		builder.append(MiFID_Inflation_Index_Name__Previous);
		builder.append(", MiFID_Issuance_Date=");
		builder.append(MiFID_Issuance_Date);
		builder.append(", MiFID_Issuance_Date__Change_Flag=");
		builder.append(MiFID_Issuance_Date__Change_Flag);
		builder.append(", MiFID_Issuance_Date__ESMA=");
		builder.append(MiFID_Issuance_Date__ESMA);
		builder.append(", MiFID_Issuance_Date__ESMA__Change_Flag=");
		builder.append(MiFID_Issuance_Date__ESMA__Change_Flag);
		builder.append(", MiFID_Issuance_Date__ESMA__Previous=");
		builder.append(MiFID_Issuance_Date__ESMA__Previous);
		builder.append(", MiFID_Issuance_Date__Previous=");
		builder.append(MiFID_Issuance_Date__Previous);
		builder.append(", MiFID_Issuance_Size__ESMA=");
		builder.append(MiFID_Issuance_Size__ESMA);
		builder.append(", MiFID_Issuance_Size__ESMA__Change_Flag=");
		builder.append(MiFID_Issuance_Size__ESMA__Change_Flag);
		builder.append(", MiFID_Issuance_Size__ESMA__Previous=");
		builder.append(MiFID_Issuance_Size__ESMA__Previous);
		builder.append(", MiFID_Liquidity_Flag__ESMA=");
		builder.append(MiFID_Liquidity_Flag__ESMA);
		builder.append(", MiFID_Liquidity_Flag__ESMA__Change_Flag=");
		builder.append(MiFID_Liquidity_Flag__ESMA__Change_Flag);
		builder.append(", MiFID_Liquidity_Flag__ESMA__Previous=");
		builder.append(MiFID_Liquidity_Flag__ESMA__Previous);
		builder.append(", MiFID_Maturity_Date=");
		builder.append(MiFID_Maturity_Date);
		builder.append(", MiFID_Maturity_Date__Change_Flag=");
		builder.append(MiFID_Maturity_Date__Change_Flag);
		builder.append(", MiFID_Maturity_Date__ESMA=");
		builder.append(MiFID_Maturity_Date__ESMA);
		builder.append(", MiFID_Maturity_Date__ESMA__Change_Flag=");
		builder.append(MiFID_Maturity_Date__ESMA__Change_Flag);
		builder.append(", MiFID_Maturity_Date__ESMA__Previous=");
		builder.append(MiFID_Maturity_Date__ESMA__Previous);
		builder.append(", MiFID_Maturity_Date__Previous=");
		builder.append(MiFID_Maturity_Date__Previous);
		builder.append(", MiFID_Most_Relevant_Market__ESMA=");
		builder.append(MiFID_Most_Relevant_Market__ESMA);
		builder.append(", MiFID_Most_Relevant_Market__ESMA__Change_Flag=");
		builder.append(MiFID_Most_Relevant_Market__ESMA__Change_Flag);
		builder.append(", MiFID_Most_Relevant_Market__ESMA__Previous=");
		builder.append(MiFID_Most_Relevant_Market__ESMA__Previous);
		builder.append(", MiFID_Next_Roll_Date=");
		builder.append(MiFID_Next_Roll_Date);
		builder.append(", MiFID_Next_Roll_Date__Change_Flag=");
		builder.append(MiFID_Next_Roll_Date__Change_Flag);
		builder.append(", MiFID_Next_Roll_Date__Previous=");
		builder.append(MiFID_Next_Roll_Date__Previous);
		builder.append(", MiFID_Option_Type=");
		builder.append(MiFID_Option_Type);
		builder.append(", MiFID_Option_Type__Change_Flag=");
		builder.append(MiFID_Option_Type__Change_Flag);
		builder.append(", MiFID_Option_Type__ESMA=");
		builder.append(MiFID_Option_Type__ESMA);
		builder.append(", MiFID_Option_Type__ESMA__Change_Flag=");
		builder.append(MiFID_Option_Type__ESMA__Change_Flag);
		builder.append(", MiFID_Option_Type__ESMA__Previous=");
		builder.append(MiFID_Option_Type__ESMA__Previous);
		builder.append(", MiFID_Option_Type__Previous=");
		builder.append(MiFID_Option_Type__Previous);
		builder.append(", MiFID_Percent_Trading_Under_Waivers_12_Month__ESMA=");
		builder.append(MiFID_Percent_Trading_Under_Waivers_12_Month__ESMA);
		builder.append(", MiFID_Percent_Trading_Under_Waivers_12_Month__ESMA__Change_Flag=");
		builder.append(MiFID_Percent_Trading_Under_Waivers_12_Month__ESMA__Change_Flag);
		builder.append(", MiFID_Percent_Trading_Under_Waivers_12_Month__ESMA__Previous=");
		builder.append(MiFID_Percent_Trading_Under_Waivers_12_Month__ESMA__Previous);
		builder.append(", MiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA=");
		builder.append(MiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA);
		builder.append(", MiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA__Change_Flag=");
		builder.append(MiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA__Change_Flag);
		builder.append(", MiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA__Previous=");
		builder.append(MiFID_Percent_Trading_Under_Waivers_Per_Trading_Venue_12_Month__ESMA__Previous);
		builder.append(", MiFID_Post_Trade_LIS_Threshold_Floor=");
		builder.append(MiFID_Post_Trade_LIS_Threshold_Floor);
		builder.append(", MiFID_Post_Trade_LIS_Threshold_Floor__Change_Flag=");
		builder.append(MiFID_Post_Trade_LIS_Threshold_Floor__Change_Flag);
		builder.append(", MiFID_Post_Trade_LIS_Threshold_Floor__Previous=");
		builder.append(MiFID_Post_Trade_LIS_Threshold_Floor__Previous);
		builder.append(", MiFID_Post_Trade_LIS_Threshold_Value=");
		builder.append(MiFID_Post_Trade_LIS_Threshold_Value);
		builder.append(", MiFID_Post_Trade_LIS_Threshold_Value__Change_Flag=");
		builder.append(MiFID_Post_Trade_LIS_Threshold_Value__Change_Flag);
		builder.append(", MiFID_Post_Trade_LIS_Threshold_Value__Previous=");
		builder.append(MiFID_Post_Trade_LIS_Threshold_Value__Previous);
		builder.append(", MiFID_Post_Trade_LIS_Trade_Percentile=");
		builder.append(MiFID_Post_Trade_LIS_Trade_Percentile);
		builder.append(", MiFID_Post_Trade_LIS_Trade_Percentile__Change_Flag=");
		builder.append(MiFID_Post_Trade_LIS_Trade_Percentile__Change_Flag);
		builder.append(", MiFID_Post_Trade_LIS_Trade_Percentile__Previous=");
		builder.append(MiFID_Post_Trade_LIS_Trade_Percentile__Previous);
		builder.append(", MiFID_Post_Trade_LIS_Volume_Percentile=");
		builder.append(MiFID_Post_Trade_LIS_Volume_Percentile);
		builder.append(", MiFID_Post_Trade_LIS_Volume_Percentile__Change_Flag=");
		builder.append(MiFID_Post_Trade_LIS_Volume_Percentile__Change_Flag);
		builder.append(", MiFID_Post_Trade_LIS_Volume_Percentile__Previous=");
		builder.append(MiFID_Post_Trade_LIS_Volume_Percentile__Previous);
		builder.append(", MiFID_Post_Trade_SSTI_Threshold_Floor=");
		builder.append(MiFID_Post_Trade_SSTI_Threshold_Floor);
		builder.append(", MiFID_Post_Trade_SSTI_Threshold_Floor__Change_Flag=");
		builder.append(MiFID_Post_Trade_SSTI_Threshold_Floor__Change_Flag);
		builder.append(", MiFID_Post_Trade_SSTI_Threshold_Floor__Previous=");
		builder.append(MiFID_Post_Trade_SSTI_Threshold_Floor__Previous);
		builder.append(", MiFID_Post_Trade_SSTI_Threshold_Value=");
		builder.append(MiFID_Post_Trade_SSTI_Threshold_Value);
		builder.append(", MiFID_Post_Trade_SSTI_Threshold_Value__Change_Flag=");
		builder.append(MiFID_Post_Trade_SSTI_Threshold_Value__Change_Flag);
		builder.append(", MiFID_Post_Trade_SSTI_Threshold_Value__Previous=");
		builder.append(MiFID_Post_Trade_SSTI_Threshold_Value__Previous);
		builder.append(", MiFID_Post_Trade_SSTI_Trade_Percentile=");
		builder.append(MiFID_Post_Trade_SSTI_Trade_Percentile);
		builder.append(", MiFID_Post_Trade_SSTI_Trade_Percentile__Change_Flag=");
		builder.append(MiFID_Post_Trade_SSTI_Trade_Percentile__Change_Flag);
		builder.append(", MiFID_Post_Trade_SSTI_Trade_Percentile__Previous=");
		builder.append(MiFID_Post_Trade_SSTI_Trade_Percentile__Previous);
		builder.append(", MiFID_Post_Trade_SSTI_Volume_Percentile=");
		builder.append(MiFID_Post_Trade_SSTI_Volume_Percentile);
		builder.append(", MiFID_Post_Trade_SSTI_Volume_Percentile__Change_Flag=");
		builder.append(MiFID_Post_Trade_SSTI_Volume_Percentile__Change_Flag);
		builder.append(", MiFID_Post_Trade_SSTI_Volume_Percentile__Previous=");
		builder.append(MiFID_Post_Trade_SSTI_Volume_Percentile__Previous);
		builder.append(", MiFID_Pre_Trade_LIS_Threshold_Floor=");
		builder.append(MiFID_Pre_Trade_LIS_Threshold_Floor);
		builder.append(", MiFID_Pre_Trade_LIS_Threshold_Floor__Change_Flag=");
		builder.append(MiFID_Pre_Trade_LIS_Threshold_Floor__Change_Flag);
		builder.append(", MiFID_Pre_Trade_LIS_Threshold_Floor__Previous=");
		builder.append(MiFID_Pre_Trade_LIS_Threshold_Floor__Previous);
		builder.append(", MiFID_Pre_Trade_LIS_Threshold_Value=");
		builder.append(MiFID_Pre_Trade_LIS_Threshold_Value);
		builder.append(", MiFID_Pre_Trade_LIS_Threshold_Value__Change_Flag=");
		builder.append(MiFID_Pre_Trade_LIS_Threshold_Value__Change_Flag);
		builder.append(", MiFID_Pre_Trade_LIS_Threshold_Value__Previous=");
		builder.append(MiFID_Pre_Trade_LIS_Threshold_Value__Previous);
		builder.append(", MiFID_Pre_Trade_LIS_Trade_Percentile=");
		builder.append(MiFID_Pre_Trade_LIS_Trade_Percentile);
		builder.append(", MiFID_Pre_Trade_LIS_Trade_Percentile__Change_Flag=");
		builder.append(MiFID_Pre_Trade_LIS_Trade_Percentile__Change_Flag);
		builder.append(", MiFID_Pre_Trade_LIS_Trade_Percentile__Previous=");
		builder.append(MiFID_Pre_Trade_LIS_Trade_Percentile__Previous);
		builder.append(", MiFID_Pre_Trade_SSTI_Threshold_Floor=");
		builder.append(MiFID_Pre_Trade_SSTI_Threshold_Floor);
		builder.append(", MiFID_Pre_Trade_SSTI_Threshold_Floor__Change_Flag=");
		builder.append(MiFID_Pre_Trade_SSTI_Threshold_Floor__Change_Flag);
		builder.append(", MiFID_Pre_Trade_SSTI_Threshold_Floor__Previous=");
		builder.append(MiFID_Pre_Trade_SSTI_Threshold_Floor__Previous);
		builder.append(", MiFID_Pre_Trade_SSTI_Threshold_Value=");
		builder.append(MiFID_Pre_Trade_SSTI_Threshold_Value);
		builder.append(", MiFID_Pre_Trade_SSTI_Threshold_Value__Change_Flag=");
		builder.append(MiFID_Pre_Trade_SSTI_Threshold_Value__Change_Flag);
		builder.append(", MiFID_Pre_Trade_SSTI_Threshold_Value__Previous=");
		builder.append(MiFID_Pre_Trade_SSTI_Threshold_Value__Previous);
		builder.append(", MiFID_Pre_Trade_SSTI_Trade_Percentile=");
		builder.append(MiFID_Pre_Trade_SSTI_Trade_Percentile);
		builder.append(", MiFID_Pre_Trade_SSTI_Trade_Percentile__Change_Flag=");
		builder.append(MiFID_Pre_Trade_SSTI_Trade_Percentile__Change_Flag);
		builder.append(", MiFID_Pre_Trade_SSTI_Trade_Percentile__Previous=");
		builder.append(MiFID_Pre_Trade_SSTI_Trade_Percentile__Previous);
		builder.append(", MiFID_Primary_Market=");
		builder.append(MiFID_Primary_Market);
		builder.append(", MiFID_Primary_Market__Change_Flag=");
		builder.append(MiFID_Primary_Market__Change_Flag);
		builder.append(", MiFID_Primary_Market__Previous=");
		builder.append(MiFID_Primary_Market__Previous);
		builder.append(", MiFID_Regulated=");
		builder.append(MiFID_Regulated);
		builder.append(", MiFID_Regulated__Change_Flag=");
		builder.append(MiFID_Regulated__Change_Flag);
		builder.append(", MiFID_Regulated__ESMA=");
		builder.append(MiFID_Regulated__ESMA);
		builder.append(", MiFID_Regulated__ESMA__Change_Flag=");
		builder.append(MiFID_Regulated__ESMA__Change_Flag);
		builder.append(", MiFID_Regulated__ESMA__Previous=");
		builder.append(MiFID_Regulated__ESMA__Previous);
		builder.append(", MiFID_Regulated__Previous=");
		builder.append(MiFID_Regulated__Previous);
		builder.append(", MiFID_Series=");
		builder.append(MiFID_Series);
		builder.append(", MiFID_Series__Change_Flag=");
		builder.append(MiFID_Series__Change_Flag);
		builder.append(", MiFID_Series__Previous=");
		builder.append(MiFID_Series__Previous);
		builder.append(", MiFID_Standard_Market_Size__ESMA=");
		builder.append(MiFID_Standard_Market_Size__ESMA);
		builder.append(", MiFID_Standard_Market_Size__ESMA__Change_Flag=");
		builder.append(MiFID_Standard_Market_Size__ESMA__Change_Flag);
		builder.append(", MiFID_Standard_Market_Size__ESMA__Previous=");
		builder.append(MiFID_Standard_Market_Size__ESMA__Previous);
		builder.append(", MiFID_Standard_Market_Size_Currency_Code=");
		builder.append(MiFID_Standard_Market_Size_Currency_Code);
		builder.append(", MiFID_Standard_Market_Size_Currency_Code__Change_Flag=");
		builder.append(MiFID_Standard_Market_Size_Currency_Code__Change_Flag);
		builder.append(", MiFID_Standard_Market_Size_Currency_Code__Previous=");
		builder.append(MiFID_Standard_Market_Size_Currency_Code__Previous);
		builder.append(", MiFID_Sub_Product=");
		builder.append(MiFID_Sub_Product);
		builder.append(", MiFID_Sub_Product__Change_Flag=");
		builder.append(MiFID_Sub_Product__Change_Flag);
		builder.append(", MiFID_Sub_Product__ESMA=");
		builder.append(MiFID_Sub_Product__ESMA);
		builder.append(", MiFID_Sub_Product__ESMA__Change_Flag=");
		builder.append(MiFID_Sub_Product__ESMA__Change_Flag);
		builder.append(", MiFID_Sub_Product__ESMA__Previous=");
		builder.append(MiFID_Sub_Product__ESMA__Previous);
		builder.append(", MiFID_Sub_Product__Previous=");
		builder.append(MiFID_Sub_Product__Previous);
		builder.append(", MiFID_SubAsset_Class=");
		builder.append(MiFID_SubAsset_Class);
		builder.append(", MiFID_SubAsset_Class__Change_Flag=");
		builder.append(MiFID_SubAsset_Class__Change_Flag);
		builder.append(", MiFID_SubAsset_Class__Previous=");
		builder.append(MiFID_SubAsset_Class__Previous);
		builder.append(", MiFID_SubAsset_Class_Perm_ID=");
		builder.append(MiFID_SubAsset_Class_Perm_ID);
		builder.append(", MiFID_SubAsset_Class_Perm_ID__Change_Flag=");
		builder.append(MiFID_SubAsset_Class_Perm_ID__Change_Flag);
		builder.append(", MiFID_SubAsset_Class_Perm_ID__Previous=");
		builder.append(MiFID_SubAsset_Class_Perm_ID__Previous);
		builder.append(", MiFID_SubClass_Effective_Date=");
		builder.append(MiFID_SubClass_Effective_Date);
		builder.append(", MiFID_SubClass_Effective_Date__Change_Flag=");
		builder.append(MiFID_SubClass_Effective_Date__Change_Flag);
		builder.append(", MiFID_SubClass_Effective_Date__Previous=");
		builder.append(MiFID_SubClass_Effective_Date__Previous);
		builder.append(", MiFID_SubClass_End_Date=");
		builder.append(MiFID_SubClass_End_Date);
		builder.append(", MiFID_SubClass_End_Date__Change_Flag=");
		builder.append(MiFID_SubClass_End_Date__Change_Flag);
		builder.append(", MiFID_SubClass_End_Date__Previous=");
		builder.append(MiFID_SubClass_End_Date__Previous);
		builder.append(", MiFID_SubClass_Perm_ID=");
		builder.append(MiFID_SubClass_Perm_ID);
		builder.append(", MiFID_SubClass_Perm_ID__Change_Flag=");
		builder.append(MiFID_SubClass_Perm_ID__Change_Flag);
		builder.append(", MiFID_SubClass_Perm_ID__Previous=");
		builder.append(MiFID_SubClass_Perm_ID__Previous);
		builder.append(", MiFID_Termination_Date=");
		builder.append(MiFID_Termination_Date);
		builder.append(", MiFID_Termination_Date__Change_Flag=");
		builder.append(MiFID_Termination_Date__Change_Flag);
		builder.append(", MiFID_Termination_Date__ESMA=");
		builder.append(MiFID_Termination_Date__ESMA);
		builder.append(", MiFID_Termination_Date__ESMA__Change_Flag=");
		builder.append(MiFID_Termination_Date__ESMA__Change_Flag);
		builder.append(", MiFID_Termination_Date__ESMA__Previous=");
		builder.append(MiFID_Termination_Date__ESMA__Previous);
		builder.append(", MiFID_Termination_Date__Previous=");
		builder.append(MiFID_Termination_Date__Previous);
		builder.append(", MiFID_Threshold_Effective_Date=");
		builder.append(MiFID_Threshold_Effective_Date);
		builder.append(", MiFID_Threshold_Effective_Date__Change_Flag=");
		builder.append(MiFID_Threshold_Effective_Date__Change_Flag);
		builder.append(", MiFID_Threshold_Effective_Date__Previous=");
		builder.append(MiFID_Threshold_Effective_Date__Previous);
		builder.append(", MiFID_Threshold_End_Date=");
		builder.append(MiFID_Threshold_End_Date);
		builder.append(", MiFID_Threshold_End_Date__Change_Flag=");
		builder.append(MiFID_Threshold_End_Date__Change_Flag);
		builder.append(", MiFID_Threshold_End_Date__Previous=");
		builder.append(MiFID_Threshold_End_Date__Previous);
		builder.append(", MiFID_Total_Market_Volume__ESMA=");
		builder.append(MiFID_Total_Market_Volume__ESMA);
		builder.append(", MiFID_Total_Market_Volume__ESMA__Change_Flag=");
		builder.append(MiFID_Total_Market_Volume__ESMA__Change_Flag);
		builder.append(", MiFID_Total_Market_Volume__ESMA__Previous=");
		builder.append(MiFID_Total_Market_Volume__ESMA__Previous);
		builder.append(", MiFID_Total_Market_Volume_Date__ESMA=");
		builder.append(MiFID_Total_Market_Volume_Date__ESMA);
		builder.append(", MiFID_Total_Market_Volume_Date__ESMA__Change_Flag=");
		builder.append(MiFID_Total_Market_Volume_Date__ESMA__Change_Flag);
		builder.append(", MiFID_Total_Market_Volume_Date__ESMA__Previous=");
		builder.append(MiFID_Total_Market_Volume_Date__ESMA__Previous);
		builder.append(", MiFID_Total_Number_of_Transactions__ESMA=");
		builder.append(MiFID_Total_Number_of_Transactions__ESMA);
		builder.append(", MiFID_Total_Number_of_Transactions__ESMA__Change_Flag=");
		builder.append(MiFID_Total_Number_of_Transactions__ESMA__Change_Flag);
		builder.append(", MiFID_Total_Number_of_Transactions__ESMA__Previous=");
		builder.append(MiFID_Total_Number_of_Transactions__ESMA__Previous);
		builder.append(", MiFID_Total_Number_of_Transactions_Date__ESMA=");
		builder.append(MiFID_Total_Number_of_Transactions_Date__ESMA);
		builder.append(", MiFID_Total_Number_of_Transactions_Date__ESMA__Change_Flag=");
		builder.append(MiFID_Total_Number_of_Transactions_Date__ESMA__Change_Flag);
		builder.append(", MiFID_Total_Number_of_Transactions_Date__ESMA__Previous=");
		builder.append(MiFID_Total_Number_of_Transactions_Date__ESMA__Previous);
		builder.append(", MiFID_Trade_Obligation_Effective_Date=");
		builder.append(MiFID_Trade_Obligation_Effective_Date);
		builder.append(", MiFID_Trade_Obligation_Effective_Date__Change_Flag=");
		builder.append(MiFID_Trade_Obligation_Effective_Date__Change_Flag);
		builder.append(", MiFID_Trade_Obligation_Effective_Date__Previous=");
		builder.append(MiFID_Trade_Obligation_Effective_Date__Previous);
		builder.append(", MiFID_Trade_Obligation_Flag=");
		builder.append(MiFID_Trade_Obligation_Flag);
		builder.append(", MiFID_Trade_Obligation_Flag__Change_Flag=");
		builder.append(MiFID_Trade_Obligation_Flag__Change_Flag);
		builder.append(", MiFID_Trade_Obligation_Flag__Previous=");
		builder.append(MiFID_Trade_Obligation_Flag__Previous);
		builder.append(", MiFID_Trading_Admission_Approval_Date=");
		builder.append(MiFID_Trading_Admission_Approval_Date);
		builder.append(", MiFID_Trading_Admission_Approval_Date__Change_Flag=");
		builder.append(MiFID_Trading_Admission_Approval_Date__Change_Flag);
		builder.append(", MiFID_Trading_Admission_Approval_Date__ESMA=");
		builder.append(MiFID_Trading_Admission_Approval_Date__ESMA);
		builder.append(", MiFID_Trading_Admission_Approval_Date__ESMA__Change_Flag=");
		builder.append(MiFID_Trading_Admission_Approval_Date__ESMA__Change_Flag);
		builder.append(", MiFID_Trading_Admission_Approval_Date__ESMA__Previous=");
		builder.append(MiFID_Trading_Admission_Approval_Date__ESMA__Previous);
		builder.append(", MiFID_Trading_Admission_Approval_Date__Previous=");
		builder.append(MiFID_Trading_Admission_Approval_Date__Previous);
		builder.append(", MiFID_Trading_Admission_Request_Date=");
		builder.append(MiFID_Trading_Admission_Request_Date);
		builder.append(", MiFID_Trading_Admission_Request_Date__Change_Flag=");
		builder.append(MiFID_Trading_Admission_Request_Date__Change_Flag);
		builder.append(", MiFID_Trading_Admission_Request_Date__ESMA=");
		builder.append(MiFID_Trading_Admission_Request_Date__ESMA);
		builder.append(", MiFID_Trading_Admission_Request_Date__ESMA__Change_Flag=");
		builder.append(MiFID_Trading_Admission_Request_Date__ESMA__Change_Flag);
		builder.append(", MiFID_Trading_Admission_Request_Date__ESMA__Previous=");
		builder.append(MiFID_Trading_Admission_Request_Date__ESMA__Previous);
		builder.append(", MiFID_Trading_Admission_Request_Date__Previous=");
		builder.append(MiFID_Trading_Admission_Request_Date__Previous);
		builder.append(", MiFID_Transaction_Type=");
		builder.append(MiFID_Transaction_Type);
		builder.append(", MiFID_Transaction_Type__Change_Flag=");
		builder.append(MiFID_Transaction_Type__Change_Flag);
		builder.append(", MiFID_Transaction_Type__ESMA=");
		builder.append(MiFID_Transaction_Type__ESMA);
		builder.append(", MiFID_Transaction_Type__ESMA__Change_Flag=");
		builder.append(MiFID_Transaction_Type__ESMA__Change_Flag);
		builder.append(", MiFID_Transaction_Type__ESMA__Previous=");
		builder.append(MiFID_Transaction_Type__ESMA__Previous);
		builder.append(", MiFID_Transaction_Type__Previous=");
		builder.append(MiFID_Transaction_Type__Previous);
		builder.append(", MiFID_Underlying_Index_Name=");
		builder.append(MiFID_Underlying_Index_Name);
		builder.append(", MiFID_Underlying_Index_Name__Change_Flag=");
		builder.append(MiFID_Underlying_Index_Name__Change_Flag);
		builder.append(", MiFID_Underlying_Index_Name__ESMA=");
		builder.append(MiFID_Underlying_Index_Name__ESMA);
		builder.append(", MiFID_Underlying_Index_Name__ESMA__Change_Flag=");
		builder.append(MiFID_Underlying_Index_Name__ESMA__Change_Flag);
		builder.append(", MiFID_Underlying_Index_Name__ESMA__Previous=");
		builder.append(MiFID_Underlying_Index_Name__ESMA__Previous);
		builder.append(", MiFID_Underlying_Index_Name__Previous=");
		builder.append(MiFID_Underlying_Index_Name__Previous);
		builder.append(", MiFID_Underlying_Index_Term=");
		builder.append(MiFID_Underlying_Index_Term);
		builder.append(", MiFID_Underlying_Index_Term__Change_Flag=");
		builder.append(MiFID_Underlying_Index_Term__Change_Flag);
		builder.append(", MiFID_Underlying_Index_Term__ESMA=");
		builder.append(MiFID_Underlying_Index_Term__ESMA);
		builder.append(", MiFID_Underlying_Index_Term__ESMA__Change_Flag=");
		builder.append(MiFID_Underlying_Index_Term__ESMA__Change_Flag);
		builder.append(", MiFID_Underlying_Index_Term__ESMA__Previous=");
		builder.append(MiFID_Underlying_Index_Term__ESMA__Previous);
		builder.append(", MiFID_Underlying_Index_Term__Previous=");
		builder.append(MiFID_Underlying_Index_Term__Previous);
		builder.append(", MiFID_Underlying_Type=");
		builder.append(MiFID_Underlying_Type);
		builder.append(", MiFID_Underlying_Type__Change_Flag=");
		builder.append(MiFID_Underlying_Type__Change_Flag);
		builder.append(", MiFID_Underlying_Type__Previous=");
		builder.append(MiFID_Underlying_Type__Previous);
		builder.append(", MiFID_Version=");
		builder.append(MiFID_Version);
		builder.append(", MiFID_Version__Change_Flag=");
		builder.append(MiFID_Version__Change_Flag);
		builder.append(", MiFID_Version__Previous=");
		builder.append(MiFID_Version__Previous);
		builder.append(", Minimum_Denomination=");
		builder.append(Minimum_Denomination);
		builder.append(", Minimum_Denomination__Change_Flag=");
		builder.append(Minimum_Denomination__Change_Flag);
		builder.append(", Minimum_Denomination__Previous=");
		builder.append(Minimum_Denomination__Previous);
		builder.append(", Minimum_Denomination_Complex_Flag=");
		builder.append(Minimum_Denomination_Complex_Flag);
		builder.append(", Minimum_Denomination_Complex_Flag__Change_Flag=");
		builder.append(Minimum_Denomination_Complex_Flag__Change_Flag);
		builder.append(", Minimum_Denomination_Complex_Flag__Previous=");
		builder.append(Minimum_Denomination_Complex_Flag__Previous);
		builder.append(", Minimum_Traded_Value__ESMA=");
		builder.append(Minimum_Traded_Value__ESMA);
		builder.append(", Minimum_Traded_Value__ESMA__Change_Flag=");
		builder.append(Minimum_Traded_Value__ESMA__Change_Flag);
		builder.append(", Minimum_Traded_Value__ESMA__Previous=");
		builder.append(Minimum_Traded_Value__ESMA__Previous);
		builder.append(", NCA_Average_Daily_Turnover=");
		builder.append(NCA_Average_Daily_Turnover);
		builder.append(", NCA_Average_Daily_Turnover__Change_Flag=");
		builder.append(NCA_Average_Daily_Turnover__Change_Flag);
		builder.append(", NCA_Average_Daily_Turnover__Previous=");
		builder.append(NCA_Average_Daily_Turnover__Previous);
		builder.append(", NCA_Average_Daily_Turnover_Currency_Code=");
		builder.append(NCA_Average_Daily_Turnover_Currency_Code);
		builder.append(", NCA_Average_Daily_Turnover_Currency_Code__Change_Flag=");
		builder.append(NCA_Average_Daily_Turnover_Currency_Code__Change_Flag);
		builder.append(", NCA_Average_Daily_Turnover_Currency_Code__Previous=");
		builder.append(NCA_Average_Daily_Turnover_Currency_Code__Previous);
		builder.append(", NCA_Average_Value_Of_Transactions=");
		builder.append(NCA_Average_Value_Of_Transactions);
		builder.append(", NCA_Average_Value_Of_Transactions__Change_Flag=");
		builder.append(NCA_Average_Value_Of_Transactions__Change_Flag);
		builder.append(", NCA_Average_Value_Of_Transactions__Previous=");
		builder.append(NCA_Average_Value_Of_Transactions__Previous);
		builder.append(", NCA_Average_Value_Of_Transactions_Currency_Code=");
		builder.append(NCA_Average_Value_Of_Transactions_Currency_Code);
		builder.append(", NCA_Average_Value_Of_Transactions_Currency_Code__Change_Flag=");
		builder.append(NCA_Average_Value_Of_Transactions_Currency_Code__Change_Flag);
		builder.append(", NCA_Average_Value_Of_Transactions_Currency_Code__Previous=");
		builder.append(NCA_Average_Value_Of_Transactions_Currency_Code__Previous);
		builder.append(", NCA_Free_Float=");
		builder.append(NCA_Free_Float);
		builder.append(", NCA_Free_Float__Change_Flag=");
		builder.append(NCA_Free_Float__Change_Flag);
		builder.append(", NCA_Free_Float__Previous=");
		builder.append(NCA_Free_Float__Previous);
		builder.append(", NCA_Free_Float_Currency_Code=");
		builder.append(NCA_Free_Float_Currency_Code);
		builder.append(", NCA_Free_Float_Currency_Code__Change_Flag=");
		builder.append(NCA_Free_Float_Currency_Code__Change_Flag);
		builder.append(", NCA_Free_Float_Currency_Code__Previous=");
		builder.append(NCA_Free_Float_Currency_Code__Previous);
		builder.append(", NCA_ORGID=");
		builder.append(NCA_ORGID);
		builder.append(", NCA_ORGID__Change_Flag=");
		builder.append(NCA_ORGID__Change_Flag);
		builder.append(", NCA_ORGID__Previous=");
		builder.append(NCA_ORGID__Previous);
		builder.append(", Netherlands_Code=");
		builder.append(Netherlands_Code);
		builder.append(", Netherlands_Code__Change_Flag=");
		builder.append(Netherlands_Code__Change_Flag);
		builder.append(", Netherlands_Code__Previous=");
		builder.append(Netherlands_Code__Previous);
		builder.append(", Next_Contract=");
		builder.append(Next_Contract);
		builder.append(", Next_Contract__Change_Flag=");
		builder.append(Next_Contract__Change_Flag);
		builder.append(", Next_Contract__Previous=");
		builder.append(Next_Contract__Previous);
		builder.append(", Next_Contract_Date=");
		builder.append(Next_Contract_Date);
		builder.append(", Next_Contract_Date__Change_Flag=");
		builder.append(Next_Contract_Date__Change_Flag);
		builder.append(", Next_Contract_Date__Previous=");
		builder.append(Next_Contract_Date__Previous);
		builder.append(", Next_Contract_Quote_ID=");
		builder.append(Next_Contract_Quote_ID);
		builder.append(", Next_Contract_Quote_ID__Change_Flag=");
		builder.append(Next_Contract_Quote_ID__Change_Flag);
		builder.append(", Next_Contract_Quote_ID__Previous=");
		builder.append(Next_Contract_Quote_ID__Previous);
		builder.append(", Notional_Currency=");
		builder.append(Notional_Currency);
		builder.append(", Notional_Currency__Change_Flag=");
		builder.append(Notional_Currency__Change_Flag);
		builder.append(", Notional_Currency__ESMA=");
		builder.append(Notional_Currency__ESMA);
		builder.append(", Notional_Currency__ESMA__Change_Flag=");
		builder.append(Notional_Currency__ESMA__Change_Flag);
		builder.append(", Notional_Currency__ESMA__Previous=");
		builder.append(Notional_Currency__ESMA__Previous);
		builder.append(", Notional_Currency__Previous=");
		builder.append(Notional_Currency__Previous);
		builder.append(", Notional_Currency_2=");
		builder.append(Notional_Currency_2);
		builder.append(", Notional_Currency_2__Change_Flag=");
		builder.append(Notional_Currency_2__Change_Flag);
		builder.append(", Notional_Currency_2__ESMA=");
		builder.append(Notional_Currency_2__ESMA);
		builder.append(", Notional_Currency_2__ESMA__Change_Flag=");
		builder.append(Notional_Currency_2__ESMA__Change_Flag);
		builder.append(", Notional_Currency_2__ESMA__Previous=");
		builder.append(Notional_Currency_2__ESMA__Previous);
		builder.append(", Notional_Currency_2__Previous=");
		builder.append(Notional_Currency_2__Previous);
		builder.append(", Number_of_Days_to_Maturity=");
		builder.append(Number_of_Days_to_Maturity);
		builder.append(", Number_of_Days_to_Maturity__Change_Flag=");
		builder.append(Number_of_Days_to_Maturity__Change_Flag);
		builder.append(", Number_of_Days_to_Maturity__Previous=");
		builder.append(Number_of_Days_to_Maturity__Previous);
		builder.append(", Number_of_Issued_Instruments=");
		builder.append(Number_of_Issued_Instruments);
		builder.append(", Number_of_Issued_Instruments__Change_Flag=");
		builder.append(Number_of_Issued_Instruments__Change_Flag);
		builder.append(", Number_of_Issued_Instruments__Previous=");
		builder.append(Number_of_Issued_Instruments__Previous);
		builder.append(", OCC_Code=");
		builder.append(OCC_Code);
		builder.append(", OCC_Code__Change_Flag=");
		builder.append(OCC_Code__Change_Flag);
		builder.append(", OCC_Code__Previous=");
		builder.append(OCC_Code__Previous);
		builder.append(", OPOL=");
		builder.append(OPOL);
		builder.append(", OPOL__Change_Flag=");
		builder.append(OPOL__Change_Flag);
		builder.append(", OPOL__Previous=");
		builder.append(OPOL__Previous);
		builder.append(", OPRA_Regional_Exchange_List=");
		builder.append(OPRA_Regional_Exchange_List);
		builder.append(", OPRA_Regional_Exchange_List__Change_Flag=");
		builder.append(OPRA_Regional_Exchange_List__Change_Flag);
		builder.append(", OPRA_Regional_Exchange_List__Previous=");
		builder.append(OPRA_Regional_Exchange_List__Previous);
		builder.append(", OpenEnded_Warrant_Indicator=");
		builder.append(OpenEnded_Warrant_Indicator);
		builder.append(", OpenEnded_Warrant_Indicator__Change_Flag=");
		builder.append(OpenEnded_Warrant_Indicator__Change_Flag);
		builder.append(", OpenEnded_Warrant_Indicator__Previous=");
		builder.append(OpenEnded_Warrant_Indicator__Previous);
		builder.append(", Operating_Mic=");
		builder.append(Operating_Mic);
		builder.append(", Operating_Mic__Change_Flag=");
		builder.append(Operating_Mic__Change_Flag);
		builder.append(", Operating_Mic__Previous=");
		builder.append(Operating_Mic__Previous);
		builder.append(", Option_root=");
		builder.append(Option_root);
		builder.append(", Option_root__Change_Flag=");
		builder.append(Option_root__Change_Flag);
		builder.append(", Option_root__Previous=");
		builder.append(Option_root__Previous);
		builder.append(", Organization_Perm_ID=");
		builder.append(Organization_Perm_ID);
		builder.append(", Organization_Perm_ID__Change_Flag=");
		builder.append(Organization_Perm_ID__Change_Flag);
		builder.append(", Organization_Perm_ID__Previous=");
		builder.append(Organization_Perm_ID__Previous);
		builder.append(", Organization_Sub_Type=");
		builder.append(Organization_Sub_Type);
		builder.append(", Organization_Sub_Type__Change_Flag=");
		builder.append(Organization_Sub_Type__Change_Flag);
		builder.append(", Organization_Sub_Type__Previous=");
		builder.append(Organization_Sub_Type__Previous);
		builder.append(", Organization_Type=");
		builder.append(Organization_Type);
		builder.append(", Organization_Type__Change_Flag=");
		builder.append(Organization_Type__Change_Flag);
		builder.append(", Organization_Type__Previous=");
		builder.append(Organization_Type__Previous);
		builder.append(", Original_Expiry_Date=");
		builder.append(Original_Expiry_Date);
		builder.append(", Original_Expiry_Date__Change_Flag=");
		builder.append(Original_Expiry_Date__Change_Flag);
		builder.append(", Original_Expiry_Date__Previous=");
		builder.append(Original_Expiry_Date__Previous);
		builder.append(", P_Chip_Flag=");
		builder.append(P_Chip_Flag);
		builder.append(", P_Chip_Flag__Change_Flag=");
		builder.append(P_Chip_Flag__Change_Flag);
		builder.append(", P_Chip_Flag__Previous=");
		builder.append(P_Chip_Flag__Previous);
		builder.append(", PE_Code=");
		builder.append(PE_Code);
		builder.append(", PE_Code__Change_Flag=");
		builder.append(PE_Code__Change_Flag);
		builder.append(", PE_Code__Previous=");
		builder.append(PE_Code__Previous);
		builder.append(", PILC=");
		builder.append(PILC);
		builder.append(", PILC__Change_Flag=");
		builder.append(PILC__Change_Flag);
		builder.append(", PILC__Previous=");
		builder.append(PILC__Previous);
		builder.append(", PTM_Levy_Eligibility_Flag=");
		builder.append(PTM_Levy_Eligibility_Flag);
		builder.append(", PTM_Levy_Eligibility_Flag__Change_Flag=");
		builder.append(PTM_Levy_Eligibility_Flag__Change_Flag);
		builder.append(", PTM_Levy_Eligibility_Flag__Previous=");
		builder.append(PTM_Levy_Eligibility_Flag__Previous);
		builder.append(", Participatory_Notes=");
		builder.append(Participatory_Notes);
		builder.append(", Participatory_Notes__Change_Flag=");
		builder.append(Participatory_Notes__Change_Flag);
		builder.append(", Participatory_Notes__Previous=");
		builder.append(Participatory_Notes__Previous);
		builder.append(", Periodic_Call_Auc_Session_Flag=");
		builder.append(Periodic_Call_Auc_Session_Flag);
		builder.append(", Periodic_Call_Auc_Session_Flag__Change_Flag=");
		builder.append(Periodic_Call_Auc_Session_Flag__Change_Flag);
		builder.append(", Periodic_Call_Auc_Session_Flag__Previous=");
		builder.append(Periodic_Call_Auc_Session_Flag__Previous);
		builder.append(", Periodicity=");
		builder.append(Periodicity);
		builder.append(", Periodicity__Change_Flag=");
		builder.append(Periodicity__Change_Flag);
		builder.append(", Periodicity__Previous=");
		builder.append(Periodicity__Previous);
		builder.append(", Place_of_Listing_Flag=");
		builder.append(Place_of_Listing_Flag);
		builder.append(", Place_of_Listing_Flag__Change_Flag=");
		builder.append(Place_of_Listing_Flag__Change_Flag);
		builder.append(", Place_of_Listing_Flag__Previous=");
		builder.append(Place_of_Listing_Flag__Previous);
		builder.append(", Placeholder=");
		builder.append(Placeholder);
		builder.append(", Price_Multiplier__DSB=");
		builder.append(Price_Multiplier__DSB);
		builder.append(", Price_Multiplier__DSB__Change_Flag=");
		builder.append(Price_Multiplier__DSB__Change_Flag);
		builder.append(", Price_Multiplier__DSB__Previous=");
		builder.append(Price_Multiplier__DSB__Previous);
		builder.append(", Price_Multiplier__ESMA=");
		builder.append(Price_Multiplier__ESMA);
		builder.append(", Price_Multiplier__ESMA__Change_Flag=");
		builder.append(Price_Multiplier__ESMA__Change_Flag);
		builder.append(", Price_Multiplier__ESMA__Previous=");
		builder.append(Price_Multiplier__ESMA__Previous);
		builder.append(", Price_basis=");
		builder.append(Price_basis);
		builder.append(", Price_basis__Change_Flag=");
		builder.append(Price_basis__Change_Flag);
		builder.append(", Price_basis__Previous=");
		builder.append(Price_basis__Previous);
		builder.append(", Pricing_Unit=");
		builder.append(Pricing_Unit);
		builder.append(", Pricing_Unit__Change_Flag=");
		builder.append(Pricing_Unit__Change_Flag);
		builder.append(", Pricing_Unit__Previous=");
		builder.append(Pricing_Unit__Previous);
		builder.append(", Primary_Chain_or_Tile=");
		builder.append(Primary_Chain_or_Tile);
		builder.append(", Primary_Chain_or_Tile__Change_Flag=");
		builder.append(Primary_Chain_or_Tile__Change_Flag);
		builder.append(", Primary_Chain_or_Tile__Previous=");
		builder.append(Primary_Chain_or_Tile__Previous);
		builder.append(", Primary_Chain_or_Tile_Quote_ID=");
		builder.append(Primary_Chain_or_Tile_Quote_ID);
		builder.append(", Primary_Chain_or_Tile_Quote_ID__Change_Flag=");
		builder.append(Primary_Chain_or_Tile_Quote_ID__Change_Flag);
		builder.append(", Primary_Chain_or_Tile_Quote_ID__Previous=");
		builder.append(Primary_Chain_or_Tile_Quote_ID__Previous);
		builder.append(", Primary_Execution_Venue=");
		builder.append(Primary_Execution_Venue);
		builder.append(", Primary_Execution_Venue__Change_Flag=");
		builder.append(Primary_Execution_Venue__Change_Flag);
		builder.append(", Primary_Execution_Venue__Previous=");
		builder.append(Primary_Execution_Venue__Previous);
		builder.append(", Primary_Listed_RIC=");
		builder.append(Primary_Listed_RIC);
		builder.append(", Primary_Listed_RIC__Change_Flag=");
		builder.append(Primary_Listed_RIC__Change_Flag);
		builder.append(", Primary_Listed_RIC__Previous=");
		builder.append(Primary_Listed_RIC__Previous);
		builder.append(", Primary_Market_Quote_ID=");
		builder.append(Primary_Market_Quote_ID);
		builder.append(", Primary_Market_Quote_ID__Change_Flag=");
		builder.append(Primary_Market_Quote_ID__Change_Flag);
		builder.append(", Primary_Market_Quote_ID__Previous=");
		builder.append(Primary_Market_Quote_ID__Previous);
		builder.append(", Primary_Reference_Market_Quote=");
		builder.append(Primary_Reference_Market_Quote);
		builder.append(", Primary_Reference_Market_Quote__Change_Flag=");
		builder.append(Primary_Reference_Market_Quote__Change_Flag);
		builder.append(", Primary_Reference_Market_Quote__Previous=");
		builder.append(Primary_Reference_Market_Quote__Previous);
		builder.append(", Primary_Tradable_Market_Quote=");
		builder.append(Primary_Tradable_Market_Quote);
		builder.append(", Primary_Tradable_Market_Quote__Change_Flag=");
		builder.append(Primary_Tradable_Market_Quote__Change_Flag);
		builder.append(", Primary_Tradable_Market_Quote__Previous=");
		builder.append(Primary_Tradable_Market_Quote__Previous);
		builder.append(", Put_Call_Indicator=");
		builder.append(Put_Call_Indicator);
		builder.append(", Put_Call_Indicator__Change_Flag=");
		builder.append(Put_Call_Indicator__Change_Flag);
		builder.append(", Put_Call_Indicator__Previous=");
		builder.append(Put_Call_Indicator__Previous);
		builder.append(", Quote_Perm_ID=");
		builder.append(Quote_Perm_ID);
		builder.append(", Quote_Perm_ID__Change_Flag=");
		builder.append(Quote_Perm_ID__Change_Flag);
		builder.append(", Quote_Perm_ID__Previous=");
		builder.append(Quote_Perm_ID__Previous);
		builder.append(", Quotron_Symbol=");
		builder.append(Quotron_Symbol);
		builder.append(", Quotron_Symbol__Change_Flag=");
		builder.append(Quotron_Symbol__Change_Flag);
		builder.append(", Quotron_Symbol__Previous=");
		builder.append(Quotron_Symbol__Previous);
		builder.append(", RCS_Underlying_Product=");
		builder.append(RCS_Underlying_Product);
		builder.append(", RCS_Underlying_Product__Change_Flag=");
		builder.append(RCS_Underlying_Product__Change_Flag);
		builder.append(", RCS_Underlying_Product__Previous=");
		builder.append(RCS_Underlying_Product__Previous);
		builder.append(", RIC__Change_Flag=");
		builder.append(RIC__Change_Flag);
		builder.append(", RIC__Previous=");
		builder.append(RIC__Previous);
		builder.append(", RIC_Root=");
		builder.append(RIC_Root);
		builder.append(", RIC_Root__Change_Flag=");
		builder.append(RIC_Root__Change_Flag);
		builder.append(", RIC_Root__Previous=");
		builder.append(RIC_Root__Previous);
		builder.append(", Red_Chip_Flag=");
		builder.append(Red_Chip_Flag);
		builder.append(", Red_Chip_Flag__Change_Flag=");
		builder.append(Red_Chip_Flag__Change_Flag);
		builder.append(", Red_Chip_Flag__Previous=");
		builder.append(Red_Chip_Flag__Previous);
		builder.append(", Reference_Rate=");
		builder.append(Reference_Rate);
		builder.append(", Reference_Rate__Change_Flag=");
		builder.append(Reference_Rate__Change_Flag);
		builder.append(", Reference_Rate__ESMA=");
		builder.append(Reference_Rate__ESMA);
		builder.append(", Reference_Rate__ESMA__Change_Flag=");
		builder.append(Reference_Rate__ESMA__Change_Flag);
		builder.append(", Reference_Rate__ESMA__Previous=");
		builder.append(Reference_Rate__ESMA__Previous);
		builder.append(", Reference_Rate__Previous=");
		builder.append(Reference_Rate__Previous);
		builder.append(", Regulation_SHO_Flag=");
		builder.append(Regulation_SHO_Flag);
		builder.append(", Regulation_SHO_Flag__Change_Flag=");
		builder.append(Regulation_SHO_Flag__Change_Flag);
		builder.append(", Regulation_SHO_Flag__Previous=");
		builder.append(Regulation_SHO_Flag__Previous);
		builder.append(", Related_News=");
		builder.append(Related_News);
		builder.append(", Related_News__Change_Flag=");
		builder.append(Related_News__Change_Flag);
		builder.append(", Related_News__Previous=");
		builder.append(Related_News__Previous);
		builder.append(", Request_for_Admission_to_Trading_by_Issuer=");
		builder.append(Request_for_Admission_to_Trading_by_Issuer);
		builder.append(", Request_for_Admission_to_Trading_by_Issuer__Change_Flag=");
		builder.append(Request_for_Admission_to_Trading_by_Issuer__Change_Flag);
		builder.append(", Request_for_Admission_to_Trading_by_Issuer__ESMA=");
		builder.append(Request_for_Admission_to_Trading_by_Issuer__ESMA);
		builder.append(", Request_for_Admission_to_Trading_by_Issuer__ESMA__Change_Flag=");
		builder.append(Request_for_Admission_to_Trading_by_Issuer__ESMA__Change_Flag);
		builder.append(", Request_for_Admission_to_Trading_by_Issuer__ESMA__Previous=");
		builder.append(Request_for_Admission_to_Trading_by_Issuer__ESMA__Previous);
		builder.append(", Request_for_Admission_to_Trading_by_Issuer__Previous=");
		builder.append(Request_for_Admission_to_Trading_by_Issuer__Previous);
		builder.append(", Return_Payout_Trigger=");
		builder.append(Return_Payout_Trigger);
		builder.append(", Return_Payout_Trigger__Change_Flag=");
		builder.append(Return_Payout_Trigger__Change_Flag);
		builder.append(", Return_Payout_Trigger__Previous=");
		builder.append(Return_Payout_Trigger__Previous);
		builder.append(", Reuters_Editorial_RIC=");
		builder.append(Reuters_Editorial_RIC);
		builder.append(", Reuters_Editorial_RIC__Change_Flag=");
		builder.append(Reuters_Editorial_RIC__Change_Flag);
		builder.append(", Reuters_Editorial_RIC__Previous=");
		builder.append(Reuters_Editorial_RIC__Previous);
		builder.append(", Reverse_Level=");
		builder.append(Reverse_Level);
		builder.append(", Reverse_Level__Change_Flag=");
		builder.append(Reverse_Level__Change_Flag);
		builder.append(", Reverse_Level__Previous=");
		builder.append(Reverse_Level__Previous);
		builder.append(", Rio_De_Janeiro_Code=");
		builder.append(Rio_De_Janeiro_Code);
		builder.append(", Rio_De_Janeiro_Code__Change_Flag=");
		builder.append(Rio_De_Janeiro_Code__Change_Flag);
		builder.append(", Rio_De_Janeiro_Code__Previous=");
		builder.append(Rio_De_Janeiro_Code__Previous);
		builder.append(", Risk_Alert=");
		builder.append(Risk_Alert);
		builder.append(", Risk_Alert__Change_Flag=");
		builder.append(Risk_Alert__Change_Flag);
		builder.append(", Risk_Alert__Previous=");
		builder.append(Risk_Alert__Previous);
		builder.append(", Roll_Months=");
		builder.append(Roll_Months);
		builder.append(", Roll_Months__Change_Flag=");
		builder.append(Roll_Months__Change_Flag);
		builder.append(", Roll_Months__Previous=");
		builder.append(Roll_Months__Previous);
		builder.append(", Round_Lot_Size=");
		builder.append(Round_Lot_Size);
		builder.append(", Round_Lot_Size__Change_Flag=");
		builder.append(Round_Lot_Size__Change_Flag);
		builder.append(", Round_Lot_Size__Previous=");
		builder.append(Round_Lot_Size__Previous);
		builder.append(", Route_or_Time_Charter_Average=");
		builder.append(Route_or_Time_Charter_Average);
		builder.append(", Route_or_Time_Charter_Average__Change_Flag=");
		builder.append(Route_or_Time_Charter_Average__Change_Flag);
		builder.append(", Route_or_Time_Charter_Average__Previous=");
		builder.append(Route_or_Time_Charter_Average__Previous);
		builder.append(", SEC_Section12=");
		builder.append(SEC_Section12);
		builder.append(", SEC_Section12__Change_Flag=");
		builder.append(SEC_Section12__Change_Flag);
		builder.append(", SEC_Section12__Previous=");
		builder.append(SEC_Section12__Previous);
		builder.append(", SEDOL=");
		builder.append(SEDOL);
		builder.append(", SEDOL__Change_Flag=");
		builder.append(SEDOL__Change_Flag);
		builder.append(", SEDOL__Previous=");
		builder.append(SEDOL__Previous);
		builder.append(", SICC_Sector_Code=");
		builder.append(SICC_Sector_Code);
		builder.append(", SICC_Sector_Code__Change_Flag=");
		builder.append(SICC_Sector_Code__Change_Flag);
		builder.append(", SICC_Sector_Code__Previous=");
		builder.append(SICC_Sector_Code__Previous);
		builder.append(", SICC_Securities_Code=");
		builder.append(SICC_Securities_Code);
		builder.append(", SICC_Securities_Code__Change_Flag=");
		builder.append(SICC_Securities_Code__Change_Flag);
		builder.append(", SICC_Securities_Code__Previous=");
		builder.append(SICC_Securities_Code__Previous);
		builder.append(", Sao_Paulo_Code=");
		builder.append(Sao_Paulo_Code);
		builder.append(", Sao_Paulo_Code__Change_Flag=");
		builder.append(Sao_Paulo_Code__Change_Flag);
		builder.append(", Sao_Paulo_Code__Previous=");
		builder.append(Sao_Paulo_Code__Previous);
		builder.append(", Search_Display_Name=");
		builder.append(Search_Display_Name);
		builder.append(", Search_Display_Name__Change_Flag=");
		builder.append(Search_Display_Name__Change_Flag);
		builder.append(", Search_Display_Name__Previous=");
		builder.append(Search_Display_Name__Previous);
		builder.append(", Secondary_Asset_Underlying_Quote_ID=");
		builder.append(Secondary_Asset_Underlying_Quote_ID);
		builder.append(", Secondary_Asset_Underlying_Quote_ID__Change_Flag=");
		builder.append(Secondary_Asset_Underlying_Quote_ID__Change_Flag);
		builder.append(", Secondary_Asset_Underlying_Quote_ID__Previous=");
		builder.append(Secondary_Asset_Underlying_Quote_ID__Previous);
		builder.append(", Secondary_Currency_Code=");
		builder.append(Secondary_Currency_Code);
		builder.append(", Secondary_Currency_Code__Change_Flag=");
		builder.append(Secondary_Currency_Code__Change_Flag);
		builder.append(", Secondary_Currency_Code__Previous=");
		builder.append(Secondary_Currency_Code__Previous);
		builder.append(", Secondary_Underlying_Asset=");
		builder.append(Secondary_Underlying_Asset);
		builder.append(", Secondary_Underlying_Asset__Change_Flag=");
		builder.append(Secondary_Underlying_Asset__Change_Flag);
		builder.append(", Secondary_Underlying_Asset__Previous=");
		builder.append(Secondary_Underlying_Asset__Previous);
		builder.append(", Security_Description=");
		builder.append(Security_Description);
		builder.append(", Security_Description__Change_Flag=");
		builder.append(Security_Description__Change_Flag);
		builder.append(", Security_Description__Previous=");
		builder.append(Security_Description__Previous);
		builder.append(", Security_Long_Description=");
		builder.append(Security_Long_Description);
		builder.append(", Security_Long_Description__Change_Flag=");
		builder.append(Security_Long_Description__Change_Flag);
		builder.append(", Security_Long_Description__Previous=");
		builder.append(Security_Long_Description__Previous);
		builder.append(", Series_Description=");
		builder.append(Series_Description);
		builder.append(", Series_Description__Change_Flag=");
		builder.append(Series_Description__Change_Flag);
		builder.append(", Series_Description__Previous=");
		builder.append(Series_Description__Previous);
		builder.append(", Settlement_Period=");
		builder.append(Settlement_Period);
		builder.append(", Settlement_Period__Change_Flag=");
		builder.append(Settlement_Period__Change_Flag);
		builder.append(", Settlement_Period__Previous=");
		builder.append(Settlement_Period__Previous);
		builder.append(", Settlement_Type=");
		builder.append(Settlement_Type);
		builder.append(", Settlement_Type__Change_Flag=");
		builder.append(Settlement_Type__Change_Flag);
		builder.append(", Settlement_Type__Previous=");
		builder.append(Settlement_Type__Previous);
		builder.append(", Share_Class=");
		builder.append(Share_Class);
		builder.append(", Share_Class__Change_Flag=");
		builder.append(Share_Class__Change_Flag);
		builder.append(", Share_Class__Previous=");
		builder.append(Share_Class__Previous);
		builder.append(", Short_Sell_Restriction_Type=");
		builder.append(Short_Sell_Restriction_Type);
		builder.append(", Short_Sell_Restriction_Type__Change_Flag=");
		builder.append(Short_Sell_Restriction_Type__Change_Flag);
		builder.append(", Short_Sell_Restriction_Type__Previous=");
		builder.append(Short_Sell_Restriction_Type__Previous);
		builder.append(", Singapore_Code=");
		builder.append(Singapore_Code);
		builder.append(", Singapore_Code__Change_Flag=");
		builder.append(Singapore_Code__Change_Flag);
		builder.append(", Singapore_Code__Previous=");
		builder.append(Singapore_Code__Previous);
		builder.append(", Source_Name=");
		builder.append(Source_Name);
		builder.append(", Source_Name__Change_Flag=");
		builder.append(Source_Name__Change_Flag);
		builder.append(", Source_Name__Previous=");
		builder.append(Source_Name__Previous);
		builder.append(", Source_Type=");
		builder.append(Source_Type);
		builder.append(", Source_Type__Change_Flag=");
		builder.append(Source_Type__Change_Flag);
		builder.append(", Source_Type__Previous=");
		builder.append(Source_Type__Previous);
		builder.append(", Sovereign_Issuer_Flag=");
		builder.append(Sovereign_Issuer_Flag);
		builder.append(", Sovereign_Issuer_Flag__Change_Flag=");
		builder.append(Sovereign_Issuer_Flag__Change_Flag);
		builder.append(", Sovereign_Issuer_Flag__ESMA=");
		builder.append(Sovereign_Issuer_Flag__ESMA);
		builder.append(", Sovereign_Issuer_Flag__ESMA__Change_Flag=");
		builder.append(Sovereign_Issuer_Flag__ESMA__Change_Flag);
		builder.append(", Sovereign_Issuer_Flag__ESMA__Previous=");
		builder.append(Sovereign_Issuer_Flag__ESMA__Previous);
		builder.append(", Sovereign_Issuer_Flag__Previous=");
		builder.append(Sovereign_Issuer_Flag__Previous);
		builder.append(", Stamp_Duty_Country_1=");
		builder.append(Stamp_Duty_Country_1);
		builder.append(", Stamp_Duty_Country_1__Change_Flag=");
		builder.append(Stamp_Duty_Country_1__Change_Flag);
		builder.append(", Stamp_Duty_Country_1__Previous=");
		builder.append(Stamp_Duty_Country_1__Previous);
		builder.append(", Stamp_Duty_Country_2=");
		builder.append(Stamp_Duty_Country_2);
		builder.append(", Stamp_Duty_Country_2__Change_Flag=");
		builder.append(Stamp_Duty_Country_2__Change_Flag);
		builder.append(", Stamp_Duty_Country_2__Previous=");
		builder.append(Stamp_Duty_Country_2__Previous);
		builder.append(", Stamp_Duty_Flag=");
		builder.append(Stamp_Duty_Flag);
		builder.append(", Stamp_Duty_Flag__Change_Flag=");
		builder.append(Stamp_Duty_Flag__Change_Flag);
		builder.append(", Stamp_Duty_Flag__Previous=");
		builder.append(Stamp_Duty_Flag__Previous);
		builder.append(", Start_date=");
		builder.append(Start_date);
		builder.append(", Start_date__Change_Flag=");
		builder.append(Start_date__Change_Flag);
		builder.append(", Start_date__Previous=");
		builder.append(Start_date__Previous);
		builder.append(", Strike_Price=");
		builder.append(Strike_Price);
		builder.append(", Strike_Price__Change_Flag=");
		builder.append(Strike_Price__Change_Flag);
		builder.append(", Strike_Price__ESMA=");
		builder.append(Strike_Price__ESMA);
		builder.append(", Strike_Price__ESMA__Change_Flag=");
		builder.append(Strike_Price__ESMA__Change_Flag);
		builder.append(", Strike_Price__ESMA__Previous=");
		builder.append(Strike_Price__ESMA__Previous);
		builder.append(", Strike_Price__Previous=");
		builder.append(Strike_Price__Previous);
		builder.append(", Strike_Price_Currency__ESMA=");
		builder.append(Strike_Price_Currency__ESMA);
		builder.append(", Strike_Price_Currency__ESMA__Change_Flag=");
		builder.append(Strike_Price_Currency__ESMA__Change_Flag);
		builder.append(", Strike_Price_Currency__ESMA__Previous=");
		builder.append(Strike_Price_Currency__ESMA__Previous);
		builder.append(", Strike_Price_Currency_Code=");
		builder.append(Strike_Price_Currency_Code);
		builder.append(", Strike_Price_Currency_Code__Change_Flag=");
		builder.append(Strike_Price_Currency_Code__Change_Flag);
		builder.append(", Strike_Price_Currency_Code__Previous=");
		builder.append(Strike_Price_Currency_Code__Previous);
		builder.append(", Strike_Price_Multiplier=");
		builder.append(Strike_Price_Multiplier);
		builder.append(", Strike_Price_Multiplier__Change_Flag=");
		builder.append(Strike_Price_Multiplier__Change_Flag);
		builder.append(", Strike_Price_Multiplier__Previous=");
		builder.append(Strike_Price_Multiplier__Previous);
		builder.append(", Suspend_Flag=");
		builder.append(Suspend_Flag);
		builder.append(", Suspend_Flag__Change_Flag=");
		builder.append(Suspend_Flag__Change_Flag);
		builder.append(", Suspend_Flag__Previous=");
		builder.append(Suspend_Flag__Previous);
		builder.append(", Suspension_Category__ESMA=");
		builder.append(Suspension_Category__ESMA);
		builder.append(", Suspension_Category__ESMA__Change_Flag=");
		builder.append(Suspension_Category__ESMA__Change_Flag);
		builder.append(", Suspension_Category__ESMA__Previous=");
		builder.append(Suspension_Category__ESMA__Previous);
		builder.append(", Suspension_Ended_On__ESMA=");
		builder.append(Suspension_Ended_On__ESMA);
		builder.append(", Suspension_Ended_On__ESMA__Change_Flag=");
		builder.append(Suspension_Ended_On__ESMA__Change_Flag);
		builder.append(", Suspension_Ended_On__ESMA__Previous=");
		builder.append(Suspension_Ended_On__ESMA__Previous);
		builder.append(", Suspension_On_Going__ESMA=");
		builder.append(Suspension_On_Going__ESMA);
		builder.append(", Suspension_On_Going__ESMA__Change_Flag=");
		builder.append(Suspension_On_Going__ESMA__Change_Flag);
		builder.append(", Suspension_On_Going__ESMA__Previous=");
		builder.append(Suspension_On_Going__ESMA__Previous);
		builder.append(", Suspension_Rationale__ESMA=");
		builder.append(Suspension_Rationale__ESMA);
		builder.append(", Suspension_Rationale__ESMA__Change_Flag=");
		builder.append(Suspension_Rationale__ESMA__Change_Flag);
		builder.append(", Suspension_Rationale__ESMA__Previous=");
		builder.append(Suspension_Rationale__ESMA__Previous);
		builder.append(", Suspension_Started_On__ESMA=");
		builder.append(Suspension_Started_On__ESMA);
		builder.append(", Suspension_Started_On__ESMA__Change_Flag=");
		builder.append(Suspension_Started_On__ESMA__Change_Flag);
		builder.append(", Suspension_Started_On__ESMA__Previous=");
		builder.append(Suspension_Started_On__ESMA__Previous);
		builder.append(", TRBC_Industry_Code=");
		builder.append(TRBC_Industry_Code);
		builder.append(", TRBC_Industry_Code__Change_Flag=");
		builder.append(TRBC_Industry_Code__Change_Flag);
		builder.append(", TRBC_Industry_Code__Previous=");
		builder.append(TRBC_Industry_Code__Previous);
		builder.append(", Taiwan_Code=");
		builder.append(Taiwan_Code);
		builder.append(", Taiwan_Code__Change_Flag=");
		builder.append(Taiwan_Code__Change_Flag);
		builder.append(", Taiwan_Code__Previous=");
		builder.append(Taiwan_Code__Previous);
		builder.append(", Term_Maturity=");
		builder.append(Term_Maturity);
		builder.append(", Term_Maturity__Change_Flag=");
		builder.append(Term_Maturity__Change_Flag);
		builder.append(", Term_Maturity__Previous=");
		builder.append(Term_Maturity__Previous);
		builder.append(", Term_Start=");
		builder.append(Term_Start);
		builder.append(", Term_Start__Change_Flag=");
		builder.append(Term_Start__Change_Flag);
		builder.append(", Term_Start__Previous=");
		builder.append(Term_Start__Previous);
		builder.append(", Thomson_Reuters_Classification_Scheme=");
		builder.append(Thomson_Reuters_Classification_Scheme);
		builder.append(", Thomson_Reuters_Classification_Scheme__Change_Flag=");
		builder.append(Thomson_Reuters_Classification_Scheme__Change_Flag);
		builder.append(", Thomson_Reuters_Classification_Scheme__Previous=");
		builder.append(Thomson_Reuters_Classification_Scheme__Previous);
		builder.append(", Tick_Size=");
		builder.append(Tick_Size);
		builder.append(", Tick_Size__Change_Flag=");
		builder.append(Tick_Size__Change_Flag);
		builder.append(", Tick_Size__Previous=");
		builder.append(Tick_Size__Previous);
		builder.append(", Tick_Size_Currency=");
		builder.append(Tick_Size_Currency);
		builder.append(", Tick_Size_Currency__Change_Flag=");
		builder.append(Tick_Size_Currency__Change_Flag);
		builder.append(", Tick_Size_Currency__Previous=");
		builder.append(Tick_Size_Currency__Previous);
		builder.append(", Tick_Size_Pilot_Group=");
		builder.append(Tick_Size_Pilot_Group);
		builder.append(", Tick_Size_Pilot_Group__Change_Flag=");
		builder.append(Tick_Size_Pilot_Group__Change_Flag);
		builder.append(", Tick_Size_Pilot_Group__Previous=");
		builder.append(Tick_Size_Pilot_Group__Previous);
		builder.append(", Tick_Value=");
		builder.append(Tick_Value);
		builder.append(", Tick_Value__Change_Flag=");
		builder.append(Tick_Value__Change_Flag);
		builder.append(", Tick_Value__Previous=");
		builder.append(Tick_Value__Previous);
		builder.append(", Tick_Value_Currency=");
		builder.append(Tick_Value_Currency);
		builder.append(", Tick_Value_Currency__Change_Flag=");
		builder.append(Tick_Value_Currency__Change_Flag);
		builder.append(", Tick_Value_Currency__Previous=");
		builder.append(Tick_Value_Currency__Previous);
		builder.append(", Ticker=");
		builder.append(Ticker);
		builder.append(", Ticker__Change_Flag=");
		builder.append(Ticker__Change_Flag);
		builder.append(", Ticker__Previous=");
		builder.append(Ticker__Previous);
		builder.append(", ToTV__DSB=");
		builder.append(ToTV__DSB);
		builder.append(", ToTV__DSB__Change_Flag=");
		builder.append(ToTV__DSB__Change_Flag);
		builder.append(", ToTV__DSB__Previous=");
		builder.append(ToTV__DSB__Previous);
		builder.append(", ToTV_Effective_Date__DSB=");
		builder.append(ToTV_Effective_Date__DSB);
		builder.append(", ToTV_Effective_Date__DSB__Change_Flag=");
		builder.append(ToTV_Effective_Date__DSB__Change_Flag);
		builder.append(", ToTV_Effective_Date__DSB__Previous=");
		builder.append(ToTV_Effective_Date__DSB__Previous);
		builder.append(", Total_Amount_Issued=");
		builder.append(Total_Amount_Issued);
		builder.append(", Total_Amount_Issued__Change_Flag=");
		builder.append(Total_Amount_Issued__Change_Flag);
		builder.append(", Total_Amount_Issued__Previous=");
		builder.append(Total_Amount_Issued__Previous);
		builder.append(", Total_EU_Turnover_12_Month__ESMA=");
		builder.append(Total_EU_Turnover_12_Month__ESMA);
		builder.append(", Total_EU_Turnover_12_Month__ESMA__Change_Flag=");
		builder.append(Total_EU_Turnover_12_Month__ESMA__Change_Flag);
		builder.append(", Total_EU_Turnover_12_Month__ESMA__Previous=");
		builder.append(Total_EU_Turnover_12_Month__ESMA__Previous);
		builder.append(", Total_EU_Volume_12_Month__ESMA=");
		builder.append(Total_EU_Volume_12_Month__ESMA);
		builder.append(", Total_EU_Volume_12_Month__ESMA__Change_Flag=");
		builder.append(Total_EU_Volume_12_Month__ESMA__Change_Flag);
		builder.append(", Total_EU_Volume_12_Month__ESMA__Previous=");
		builder.append(Total_EU_Volume_12_Month__ESMA__Previous);
		builder.append(", Trading_Status=");
		builder.append(Trading_Status);
		builder.append(", Trading_Status__Change_Flag=");
		builder.append(Trading_Status__Change_Flag);
		builder.append(", Trading_Status__Previous=");
		builder.append(Trading_Status__Previous);
		builder.append(", Trading_Style=");
		builder.append(Trading_Style);
		builder.append(", Trading_Style__Change_Flag=");
		builder.append(Trading_Style__Change_Flag);
		builder.append(", Trading_Style__Previous=");
		builder.append(Trading_Style__Previous);
		builder.append(", Trading_Symbol=");
		builder.append(Trading_Symbol);
		builder.append(", Trading_Symbol__Change_Flag=");
		builder.append(Trading_Symbol__Change_Flag);
		builder.append(", Trading_Symbol__Previous=");
		builder.append(Trading_Symbol__Previous);
		builder.append(", UK_Stamp_Duty_Flag=");
		builder.append(UK_Stamp_Duty_Flag);
		builder.append(", UK_Stamp_Duty_Flag__Change_Flag=");
		builder.append(UK_Stamp_Duty_Flag__Change_Flag);
		builder.append(", UK_Stamp_Duty_Flag__Previous=");
		builder.append(UK_Stamp_Duty_Flag__Previous);
		builder.append(", Underlying_Asset_Type=");
		builder.append(Underlying_Asset_Type);
		builder.append(", Underlying_Asset_Type__Change_Flag=");
		builder.append(Underlying_Asset_Type__Change_Flag);
		builder.append(", Underlying_Asset_Type__Previous=");
		builder.append(Underlying_Asset_Type__Previous);
		builder.append(", Underlying_Contract=");
		builder.append(Underlying_Contract);
		builder.append(", Underlying_Contract__Change_Flag=");
		builder.append(Underlying_Contract__Change_Flag);
		builder.append(", Underlying_Contract__Previous=");
		builder.append(Underlying_Contract__Previous);
		builder.append(", Underlying_Contract_Exp_Date=");
		builder.append(Underlying_Contract_Exp_Date);
		builder.append(", Underlying_Contract_Exp_Date__Change_Flag=");
		builder.append(Underlying_Contract_Exp_Date__Change_Flag);
		builder.append(", Underlying_Contract_Exp_Date__Previous=");
		builder.append(Underlying_Contract_Exp_Date__Previous);
		builder.append(", Underlying_Contract_Quote_ID=");
		builder.append(Underlying_Contract_Quote_ID);
		builder.append(", Underlying_Contract_Quote_ID__Change_Flag=");
		builder.append(Underlying_Contract_Quote_ID__Change_Flag);
		builder.append(", Underlying_Contract_Quote_ID__Previous=");
		builder.append(Underlying_Contract_Quote_ID__Previous);
		builder.append(", Underlying_EEA_Venue_Eligible=");
		builder.append(Underlying_EEA_Venue_Eligible);
		builder.append(", Underlying_EEA_Venue_Eligible__Change_Flag=");
		builder.append(Underlying_EEA_Venue_Eligible__Change_Flag);
		builder.append(", Underlying_EEA_Venue_Eligible__Previous=");
		builder.append(Underlying_EEA_Venue_Eligible__Previous);
		builder.append(", Underlying_ISIN=");
		builder.append(Underlying_ISIN);
		builder.append(", Underlying_ISIN__Change_Flag=");
		builder.append(Underlying_ISIN__Change_Flag);
		builder.append(", Underlying_ISIN__ESMA=");
		builder.append(Underlying_ISIN__ESMA);
		builder.append(", Underlying_ISIN__ESMA__Change_Flag=");
		builder.append(Underlying_ISIN__ESMA__Change_Flag);
		builder.append(", Underlying_ISIN__ESMA__Previous=");
		builder.append(Underlying_ISIN__ESMA__Previous);
		builder.append(", Underlying_ISIN__Previous=");
		builder.append(Underlying_ISIN__Previous);
		builder.append(", Underlying_Index_ISIN=");
		builder.append(Underlying_Index_ISIN);
		builder.append(", Underlying_Index_ISIN__Change_Flag=");
		builder.append(Underlying_Index_ISIN__Change_Flag);
		builder.append(", Underlying_Index_ISIN__Previous=");
		builder.append(Underlying_Index_ISIN__Previous);
		builder.append(", Underlying_Issue_Perm_ID=");
		builder.append(Underlying_Issue_Perm_ID);
		builder.append(", Underlying_Issue_Perm_ID__Change_Flag=");
		builder.append(Underlying_Issue_Perm_ID__Change_Flag);
		builder.append(", Underlying_Issue_Perm_ID__Previous=");
		builder.append(Underlying_Issue_Perm_ID__Previous);
		builder.append(", Underlying_Issuer_LEI__ESMA=");
		builder.append(Underlying_Issuer_LEI__ESMA);
		builder.append(", Underlying_Issuer_LEI__ESMA__Change_Flag=");
		builder.append(Underlying_Issuer_LEI__ESMA__Change_Flag);
		builder.append(", Underlying_Issuer_LEI__ESMA__Previous=");
		builder.append(Underlying_Issuer_LEI__ESMA__Previous);
		builder.append(", Underlying_Issuer_Organization_Perm_ID=");
		builder.append(Underlying_Issuer_Organization_Perm_ID);
		builder.append(", Underlying_Issuer_Organization_Perm_ID__Change_Flag=");
		builder.append(Underlying_Issuer_Organization_Perm_ID__Change_Flag);
		builder.append(", Underlying_Issuer_Organization_Perm_ID__Previous=");
		builder.append(Underlying_Issuer_Organization_Perm_ID__Previous);
		builder.append(", Underlying_Quote_ID=");
		builder.append(Underlying_Quote_ID);
		builder.append(", Underlying_Quote_ID__Change_Flag=");
		builder.append(Underlying_Quote_ID__Change_Flag);
		builder.append(", Underlying_Quote_ID__Previous=");
		builder.append(Underlying_Quote_ID__Previous);
		builder.append(", Underlying_RIC=");
		builder.append(Underlying_RIC);
		builder.append(", Underlying_RIC__Change_Flag=");
		builder.append(Underlying_RIC__Change_Flag);
		builder.append(", Underlying_RIC__Previous=");
		builder.append(Underlying_RIC__Previous);
		builder.append(", Underlying_RIC_File_Signature=");
		builder.append(Underlying_RIC_File_Signature);
		builder.append(", Underlying_RIC_File_Signature__Change_Flag=");
		builder.append(Underlying_RIC_File_Signature__Change_Flag);
		builder.append(", Underlying_RIC_File_Signature__Previous=");
		builder.append(Underlying_RIC_File_Signature__Previous);
		builder.append(", Underlying_in_ESMA_FIRDS=");
		builder.append(Underlying_in_ESMA_FIRDS);
		builder.append(", Underlying_in_ESMA_FIRDS__Change_Flag=");
		builder.append(Underlying_in_ESMA_FIRDS__Change_Flag);
		builder.append(", Underlying_in_ESMA_FIRDS__Previous=");
		builder.append(Underlying_in_ESMA_FIRDS__Previous);
		builder.append(", Unscaled_Strike_Price=");
		builder.append(Unscaled_Strike_Price);
		builder.append(", Unscaled_Strike_Price__Change_Flag=");
		builder.append(Unscaled_Strike_Price__Change_Flag);
		builder.append(", Unscaled_Strike_Price__Previous=");
		builder.append(Unscaled_Strike_Price__Previous);
		builder.append(", Update_Frequency=");
		builder.append(Update_Frequency);
		builder.append(", Update_Frequency__Change_Flag=");
		builder.append(Update_Frequency__Change_Flag);
		builder.append(", Update_Frequency__Previous=");
		builder.append(Update_Frequency__Previous);
		builder.append(", Upper_Barrier=");
		builder.append(Upper_Barrier);
		builder.append(", Upper_Barrier__Change_Flag=");
		builder.append(Upper_Barrier__Change_Flag);
		builder.append(", Upper_Barrier__Previous=");
		builder.append(Upper_Barrier__Previous);
		builder.append(", Valoren=");
		builder.append(Valoren);
		builder.append(", Valoren__Change_Flag=");
		builder.append(Valoren__Change_Flag);
		builder.append(", Valoren__Previous=");
		builder.append(Valoren__Previous);
		builder.append(", Valuation_Method_or_Trigger=");
		builder.append(Valuation_Method_or_Trigger);
		builder.append(", Valuation_Method_or_Trigger__Change_Flag=");
		builder.append(Valuation_Method_or_Trigger__Change_Flag);
		builder.append(", Valuation_Method_or_Trigger__Previous=");
		builder.append(Valuation_Method_or_Trigger__Previous);
		builder.append(", Venue_Listing_Suspension_End_Date=");
		builder.append(Venue_Listing_Suspension_End_Date);
		builder.append(", Venue_Listing_Suspension_End_Date__Change_Flag=");
		builder.append(Venue_Listing_Suspension_End_Date__Change_Flag);
		builder.append(", Venue_Listing_Suspension_End_Date__Previous=");
		builder.append(Venue_Listing_Suspension_End_Date__Previous);
		builder.append(", Venue_Suspended_From_Listing_Flag=");
		builder.append(Venue_Suspended_From_Listing_Flag);
		builder.append(", Venue_Suspended_From_Listing_Flag__Change_Flag=");
		builder.append(Venue_Suspended_From_Listing_Flag__Change_Flag);
		builder.append(", Venue_Suspended_From_Listing_Flag__Previous=");
		builder.append(Venue_Suspended_From_Listing_Flag__Previous);
		builder.append(", Warrant_Issue_Date=");
		builder.append(Warrant_Issue_Date);
		builder.append(", Warrant_Issue_Date__Change_Flag=");
		builder.append(Warrant_Issue_Date__Change_Flag);
		builder.append(", Warrant_Issue_Date__Previous=");
		builder.append(Warrant_Issue_Date__Previous);
		builder.append(", Warrant_Underlying_RIC=");
		builder.append(Warrant_Underlying_RIC);
		builder.append(", Warrant_Underlying_RIC__Change_Flag=");
		builder.append(Warrant_Underlying_RIC__Change_Flag);
		builder.append(", Warrant_Underlying_RIC__Previous=");
		builder.append(Warrant_Underlying_RIC__Previous);
		builder.append(", Warrent_Form=");
		builder.append(Warrent_Form);
		builder.append(", Warrent_Form__Change_Flag=");
		builder.append(Warrent_Form__Change_Flag);
		builder.append(", Warrent_Form__Previous=");
		builder.append(Warrent_Form__Previous);
		builder.append(", Warrent_Underlying_Quote_ID=");
		builder.append(Warrent_Underlying_Quote_ID);
		builder.append(", Warrent_Underlying_Quote_ID__Change_Flag=");
		builder.append(Warrent_Underlying_Quote_ID__Change_Flag);
		builder.append(", Warrent_Underlying_Quote_ID__Previous=");
		builder.append(Warrent_Underlying_Quote_ID__Previous);
		builder.append(", Wertpapier=");
		builder.append(Wertpapier);
		builder.append(", Wertpapier__Change_Flag=");
		builder.append(Wertpapier__Change_Flag);
		builder.append(", Wertpapier__Previous=");
		builder.append(Wertpapier__Previous);
		builder.append(", When_Distributed_Flag=");
		builder.append(When_Distributed_Flag);
		builder.append(", When_Distributed_Flag__Change_Flag=");
		builder.append(When_Distributed_Flag__Change_Flag);
		builder.append(", When_Distributed_Flag__Previous=");
		builder.append(When_Distributed_Flag__Previous);
		builder.append(", When_Issued_Flag=");
		builder.append(When_Issued_Flag);
		builder.append(", When_Issued_Flag__Change_Flag=");
		builder.append(When_Issued_Flag__Change_Flag);
		builder.append(", When_Issued_Flag__Previous=");
		builder.append(When_Issued_Flag__Previous);
		builder.append(", uTOTV__DSB=");
		builder.append(uTOTV__DSB);
		builder.append(", uTOTV__DSB__Change_Flag=");
		builder.append(uTOTV__DSB__Change_Flag);
		builder.append(", uTOTV__DSB__Previous=");
		builder.append(uTOTV__DSB__Previous);
		builder.append(", uToTV_Effective_Date__DSB=");
		builder.append(uToTV_Effective_Date__DSB);
		builder.append(", uToTV_Effective_Date__DSB__Change_Flag=");
		builder.append(uToTV_Effective_Date__DSB__Change_Flag);
		builder.append(", uToTV_Effective_Date__DSB__Previous=");
		builder.append(uToTV_Effective_Date__DSB__Previous);
		builder.append("]");
		return builder.toString();
	}

}
