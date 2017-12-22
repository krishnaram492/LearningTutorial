package com.tr.dhsloader.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "XRefHistory",schema="dbo")
public class XrefHistory implements java.io.Serializable {

	private static final long serialVersionUID = -5279845080660993327L;
	private long dhsid;
	private int colid;
	private long begindate;
	private String value;
	private String prevvalue;
	private String filename;
	private String recordtype;
	private Calendar time;
	
	@Id
	@Column(name = "dhsID")
	public long getDhsid() {
		return dhsid;
	}
	public void setDhsid(long dhsid) {
		this.dhsid = dhsid;
	}

	@Column(name = "colid")
	public int getColid() {
		return colid;
	}
	public void setColid(int colid) {
		this.colid = colid;
	}
	@Column(name = "beginDate")
	public long getBegindate() {
		return begindate;
	}
	public void setBegindate(long begindate) {
		this.begindate = begindate;
	}
	@Column(name = "value",length = 200)
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Column(name = "prevValue",length = 200)
	public String getPrevvalue() {
		return prevvalue;
	}
	public void setPrevvalue(String prevvalue) {
		this.prevvalue = prevvalue;
	}
	@Column(name = "fileName",length = 50)
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	@Column(name = "recordType",length = 2)
	public String getRecordtype() {
		return recordtype;
	}
	public void setRecordtype(String recordtype) {
		this.recordtype = recordtype;
	}
	@Transient
	public Calendar getTime() {
		return time;
	}
	public void setTime(Calendar time) {
		this.time = time;
	}
	
	

}
