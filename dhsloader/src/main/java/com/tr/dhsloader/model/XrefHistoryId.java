package com.tr.dhsloader.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

@Embeddable
public class XrefHistoryId implements java.io.Serializable {

	private static final long serialVersionUID = -5279845080660993327L;
	private long dhsid;
	private int colid;
	private long begindate;
	private String value;
	private String prevvalue;
	private String filename;
	private String recordtype;
	private Calendar time;

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

	@Column(name = "value", length = 200)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Column(name = "prevValue", length = 200)
	public String getPrevvalue() {
		return prevvalue;
	}

	public void setPrevvalue(String prevvalue) {
		this.prevvalue = prevvalue;
	}

	@Column(name = "fileName", length = 50)
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Column(name = "recordType", length = 2)
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (begindate ^ (begindate >>> 32));
		result = prime * result + colid;
		result = prime * result + (int) (dhsid ^ (dhsid >>> 32));
		result = prime * result + ((filename == null) ? 0 : filename.hashCode());
		result = prime * result + ((prevvalue == null) ? 0 : prevvalue.hashCode());
		result = prime * result + ((recordtype == null) ? 0 : recordtype.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		XrefHistoryId other = (XrefHistoryId) obj;
		if (begindate != other.begindate)
			return false;
		if (colid != other.colid)
			return false;
		if (dhsid != other.dhsid)
			return false;
		if (filename == null) {
			if (other.filename != null)
				return false;
		} else if (!filename.equals(other.filename))
			return false;
		if (prevvalue == null) {
			if (other.prevvalue != null)
				return false;
		} else if (!prevvalue.equals(other.prevvalue))
			return false;
		if (recordtype == null) {
			if (other.recordtype != null)
				return false;
		} else if (!recordtype.equals(other.recordtype))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("XrefHistoryId [dhsid=");
		builder.append(dhsid);
		builder.append(", colid=");
		builder.append(colid);
		builder.append(", begindate=");
		builder.append(begindate);
		builder.append(", value=");
		builder.append(value);
		builder.append(", prevvalue=");
		builder.append(prevvalue);
		builder.append(", filename=");
		builder.append(filename);
		builder.append(", recordtype=");
		builder.append(recordtype);
		builder.append(", time=");
		builder.append(time);
		builder.append("]");
		return builder.toString();
	}
	
	

}
