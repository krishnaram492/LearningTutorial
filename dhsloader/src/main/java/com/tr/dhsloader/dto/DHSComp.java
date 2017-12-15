package com.tr.dhsloader.dto;

import java.io.Serializable;

/**
 * @author Ram
 * 
 */
public class DHSComp implements Serializable {

	private static final long serialVersionUID = 1L;

	private String quoteid;
	private String ric;

	public DHSComp(String quoteid, String ric) {
		super();
		this.quoteid = quoteid;
		this.ric = ric;
	}

	public String getQuoteid() {
		return quoteid;
	}

	public void setQuoteid(String quoteid) {
		this.quoteid = quoteid;
	}

	public String getRic() {
		return ric;
	}

	public void setRic(String ric) {
		this.ric = ric;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((quoteid == null) ? 0 : quoteid.hashCode());
		result = prime * result + ((ric == null) ? 0 : ric.hashCode());
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
		DHSComp other = (DHSComp) obj;
		if (quoteid == null) {
			if (other.quoteid != null)
				return false;
		} else if (!quoteid.equals(other.quoteid))
			return false;
		if (ric == null) {
			if (other.ric != null)
				return false;
		} else if (!ric.equals(other.ric))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DHSComp [quoteid=");
		builder.append(quoteid);
		builder.append(", ric=");
		builder.append(ric);
		builder.append("]");
		return builder.toString();
	}

}
