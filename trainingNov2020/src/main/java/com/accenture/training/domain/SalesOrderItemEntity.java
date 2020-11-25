package com.accenture.training.domain;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "\"TRAINING_SALESORDER_TBLSALESORDERITEM\"")
public class SalesOrderItemEntity{

	@Id
	@Column(name = "\"ID\"")
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
	private String salesOrderId;
	
	@Column(name = "\"PRODUCT_ID\"")
	private String productId;
	
	@Column(name = "\"CREATEDAT\"")
	private Date createdAT;
	
	@Column(name = "\"CREATEDBY\"")
	private Date createdBY;
	
	@Column(name = "\"MODIFIEDAT\"")
	private Time modifiedAT;
	
	@Column(name = "\"MODIFIEDBY\"")
	private Time modifiedBY;
	
	public Date getCreatedAT() {
		return createdAT;
	}

	public void setCreatedAT(Date createdAT) {
		this.createdAT = createdAT;
	}

	public Date getCreatedBY() {
		return createdBY;
	}

	public void setCreatedBY(Date createdBY) {
		this.createdBY = createdBY;
	}

	public Time getModifiedAT() {
		return modifiedAT;
	}

	public void setModifiedAT(Time modifiedAT) {
		this.modifiedAT = modifiedAT;
	}

	public Time getModifiedBY() {
		return modifiedBY;
	}

	public void setModifiedBY(Time modifiedBY) {
		this.modifiedBY = modifiedBY;
	}

	public SalesOrderEntity getSalesOrder() {
		return salesOrder;
	}

	public void setSalesOrder(SalesOrderEntity salesOrder) {
		this.salesOrder = salesOrder;
	}

	@ManyToOne
	@JoinColumn(name = "\"SALESORDER_ID\"")
	private SalesOrderEntity salesOrder;
	
	public String getSalesOrderId() {
		return salesOrderId;
	}

	public void setSalesOrderId(String salesOrderId) {
		this.salesOrderId = salesOrderId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	
}
