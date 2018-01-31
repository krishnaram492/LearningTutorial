package com.tr.dhsloader.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "XRefHistory1", schema = "dbo")
public class XrefHistory implements java.io.Serializable {

	private static final long serialVersionUID = -5279845080660993327L;
	private XrefHistoryId Id;
	
	public XrefHistory() {
		
	}

	public XrefHistory(XrefHistoryId id) {
		this.Id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "dhsid", column = @Column(name = "dhsID")),
	@AttributeOverride(name = "colid", column = @Column(name = "colid")),
	@AttributeOverride(name = "begindate", column = @Column(name = "beginDate")),
	@AttributeOverride(name = "value", column = @Column(name = "value")),
	@AttributeOverride(name = "prevvalue", column = @Column(name = "prevValue")),
	@AttributeOverride(name = "filename", column = @Column(name = "fileName")),
	@AttributeOverride(name = "recordtype", column = @Column(name = "recordType")) })
	
	public XrefHistoryId getId() {
		return this. Id;
	}

	public void setId(XrefHistoryId id) {
		this.Id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("XrefHistory [Id=");
		builder.append(Id);
		builder.append("]");
		return builder.toString();
	}
	
	
}
