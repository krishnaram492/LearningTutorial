package com.app.dhsloader.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "DHSIDMAP")
public class Dhsidmap implements java.io.Serializable {

	private static final long serialVersionUID = -2906401980614302531L;
	private long dhsid;
	private String ric;
	private String ric30;
	private Date createdate;
	private Date updatedate;
	private String updatesrc;
	private String quoteid;

	public Dhsidmap() {
	}

	public Dhsidmap(long dhsid, String ric, Date createdate, Date updatedate, String updatesrc) {
		this.dhsid = dhsid;
		this.ric = ric;
		this.createdate = createdate;
		this.updatedate = updatedate;
		this.updatesrc = updatesrc;
	}

	public Dhsidmap(long dhsid, String ric, String ric30, Date createdate, Date updatedate, String updatesrc, String quoteid) {
		this.dhsid = dhsid;
		this.ric = ric;
		this.ric30 = ric30;
		this.createdate = createdate;
		this.updatedate = updatedate;
		this.updatesrc = updatesrc;
		this.quoteid = quoteid;
	}

	@Id
	@Column(name = "DHSID", unique = true, nullable = false, precision = 12, scale = 0)
	public long getDhsid() {
		return this.dhsid;
	}

	public void setDhsid(long dhsid) {
		this.dhsid = dhsid;
	}

	@Column(name = "RIC", nullable = false, length = 50)
	public String getRic() {
		return this.ric;
	}

	public void setRic(String ric) {
		this.ric = ric;
	}

	@Column(name = "RIC30", length = 30)
	public String getRic30() {
		return this.ric30;
	}

	public void setRic30(String ric30) {
		this.ric30 = ric30;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATEDATE", nullable = false, length = 7)
	public Date getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATEDATE", nullable = false, length = 7)
	public Date getUpdatedate() {
		return this.updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	@Column(name = "UPDATESRC", nullable = false, length = 30)
	public String getUpdatesrc() {
		return this.updatesrc;
	}

	public void setUpdatesrc(String updatesrc) {
		this.updatesrc = updatesrc;
	}

	@Column(name = "QUOTEID")
	public String getQuoteid() {
		return this.quoteid;
	}

	public void setQuoteid(String quoteid) {
		this.quoteid = quoteid;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dhsidmap [dhsid=");
		builder.append(dhsid);
		builder.append(", ric=");
		builder.append(ric);
		builder.append(", ric30=");
		builder.append(ric30);
		builder.append(", createdate=");
		builder.append(createdate);
		builder.append(", updatedate=");
		builder.append(updatedate);
		builder.append(", updatesrc=");
		builder.append(updatesrc);
		builder.append(", quoteid=");
		builder.append(quoteid);
		builder.append("]");
		return builder.toString();
	}

}
