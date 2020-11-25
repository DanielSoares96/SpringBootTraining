package com.accenture.training.dto;

import java.sql.Date;
import java.util.List;



public class SalesOrderTO{

	
	private String id;
	private Date creationDate;
	private String createdBy;
	private String status;
	private List<SalesOrderItemTO> salesOrderItems;
	private String userId;
	private String clientId;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public List<SalesOrderItemTO> getSalesOrderItems() {
		return salesOrderItems;
	}
	public void setSalesOrderItems(List<SalesOrderItemTO> salesOrderItems) {
		this.salesOrderItems = salesOrderItems;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
