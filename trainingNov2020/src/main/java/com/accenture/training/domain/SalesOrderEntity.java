package com.accenture.training.domain;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "\"TRAINING_SALESORDER_TBLSALESORDER\"")
public class SalesOrderEntity {
	
	@Id
	@Column(name = "\"ID\"")
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
	private String id;
	
	@Column(name = "\"STATUS\"")
	private String status;
		
	@Column(name = "\"CREATEDAT\"")
	private Date createdAT;
	
	@Column(name = "\"CREATEDBY\"")
	private String createdBY;
	
	public List<SalesOrderItemEntity> getItems() {
		return items;
	}

	public void setItems(List<SalesOrderItemEntity> items) {
		this.items = items;
	}

	@OneToMany
	@JoinColumn(name = "\"SALESORDER_ID\"")
	private List<SalesOrderItemEntity> items;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public Date getCreatedAT() {
		return createdAT;
	}

	public void setCreatedAT(Date createdAT) {
		this.createdAT = createdAT;
	}

	public String getCreatedBY() {
		return createdBY;
	}

	public void setCreatedBY(String createdBY) {
		this.createdBY = createdBY;
	}
	
	
}
