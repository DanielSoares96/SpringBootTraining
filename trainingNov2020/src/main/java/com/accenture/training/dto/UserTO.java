package com.accenture.training.dto;


import java.sql.Date;
import java.sql.Time;


public class UserTO {
	
	private String id;
	private String name;
	private Date createdAT;
	private Date createdBY;
	private Time modifiedAT;
	private Time modifiedBY;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	
	
	


}
