package com.tr.dhsloader.model;

import java.util.Arrays;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "DhsIdMap1",schema="dbo")
public class Dhsidmap implements java.io.Serializable {

	private static final long serialVersionUID = -2906401980614302531L;
	private long dhsid;
	private String ric;
	private String ric30;
	private Calendar createdate;
	private Calendar updatedate;
	private String updatesrc;
	private byte[] quoteid;

	public Dhsidmap() {
	}

	public Dhsidmap(long dhsid, String ric, Calendar createdate, Calendar updatedate, String updatesrc) {
		this.dhsid = dhsid;
		this.ric = ric;
		this.createdate = createdate;
		this.updatedate = updatedate;
		this.updatesrc = updatesrc;
	}

	public Dhsidmap(long dhsid, String ric, String ric30, Calendar createdate, Calendar updatedate, String updatesrc, byte[] quoteid) {
		this.dhsid = dhsid;
		this.ric = ric;
		this.ric30 = ric30;
		this.createdate = createdate;
		this.updatedate = updatedate;
		this.updatesrc = updatesrc;
		this.quoteid = quoteid;
	}

	@Id
	@Column(name = "dhsID", unique = true, nullable = false, precision = 12, scale = 0)
	public long getDhsid() {
		return this.dhsid;
	}

	public void setDhsid(long dhsid) {
		this.dhsid = dhsid;
	}

	@Column(name = "ric", nullable = false, length = 50)
	public String getRic() {
		return this.ric;
	}

	public void setRic(String ric) {
		this.ric = ric;
	}

	@Column(name = "ric30", length = 30)
	public String getRic30() {
		return this.ric30;
	}

	public void setRic30(String ric30) {
		this.ric30 = ric30;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDate", nullable = false, length = 7)
	public Calendar getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Calendar createdate) {
		this.createdate = createdate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updateDate", nullable = false, length = 7)
	public Calendar getUpdatedate() {
		return this.updatedate;
	}

	public void setUpdatedate(Calendar updatedate) {
		this.updatedate = updatedate;
	}

	@Column(name = "updateSRC", nullable = false, length = 30)
	public String getUpdatesrc() {
		return this.updatesrc;
	}

	public void setUpdatesrc(String updatesrc) {
		this.updatesrc = updatesrc;
	}

	@Column(name = "quoteID")
	public byte[] getQuoteid() {
		return this.quoteid;
	}

	public void setQuoteid(byte[] quoteid) {
		this.quoteid = quoteid;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdate == null) ? 0 : createdate.hashCode());
		result = prime * result + (int) (dhsid ^ (dhsid >>> 32));
		result = prime * result + Arrays.hashCode(quoteid);
		result = prime * result + ((ric == null) ? 0 : ric.hashCode());
		result = prime * result + ((ric30 == null) ? 0 : ric30.hashCode());
		result = prime * result + ((updatedate == null) ? 0 : updatedate.hashCode());
		result = prime * result + ((updatesrc == null) ? 0 : updatesrc.hashCode());
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
		Dhsidmap other = (Dhsidmap) obj;
		if (createdate == null) {
			if (other.createdate != null)
				return false;
		} else if (!createdate.equals(other.createdate))
			return false;
		if (dhsid != other.dhsid)
			return false;
		if (!Arrays.equals(quoteid, other.quoteid))
			return false;
		if (ric == null) {
			if (other.ric != null)
				return false;
		} else if (!ric.equals(other.ric))
			return false;
		if (ric30 == null) {
			if (other.ric30 != null)
				return false;
		} else if (!ric30.equals(other.ric30))
			return false;
		if (updatedate == null) {
			if (other.updatedate != null)
				return false;
		} else if (!updatedate.equals(other.updatedate))
			return false;
		if (updatesrc == null) {
			if (other.updatesrc != null)
				return false;
		} else if (!updatesrc.equals(other.updatesrc))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[dhsid=");
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
