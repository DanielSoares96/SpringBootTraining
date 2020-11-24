package com.accenture.training.dto;

import java.sql.Date;
import java.sql.Time;

public class ProductsTO {
	
	private String id;
	private String name;
	private String manufacturer;
	private Date createdAT;
	private Date createdBY;
	private Time modifiedAT;
	private Time modifiedBY;
	private Date validFrom;
	private Date validTO;
	private Double salesPrice;
	private Double basePrice;
	private int quantity;
	
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
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
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
	public Date getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}
	public Date getValidTO() {
		return validTO;
	}
	public void setValidTO(Date validTO) {
		this.validTO = validTO;
	}
	public Double getSalesPrice() {
		return salesPrice;
	}
	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}
	public Double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	


}
