package com.accenture.training.domain;

import java.security.Timestamp;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "\"TRAINING_USER_TBLUSER\"")
public class UserEntity {
	
	@Id
	@Column(name = "\"ID\"")
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
	private String id;
	
	@Column(name = "\"NAME\"")
	private String name;
	
	@Column(name = "\"CREATEDAT\"")
	private Date createdAT;
	
	@Column(name = "\"CREATEDBY\"")
	private Date createdBY;
	
	@Column(name = "\"MODIFIEDAT\"")
	private Time modifiedAT;
	
	@Column(name = "\"MODIFIEDBY\"")
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
