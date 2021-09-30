package com.travel.tourism.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class UserPackage {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;

	//@Id
	//@GeneratedValue(generator = "UUID")
	//@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "id", updatable = false, nullable = false)
	//private String id;

	private String userId;
	private String  packageId;

	public Integer  getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String  getUserId() {
		return userId;
	}

	public void setUserId(String  userId) {
		this.userId = userId;
	}

	public String  getPackageId() {
		return packageId;
	}

	public void setPackageId(String  packageId) {
		this.packageId = packageId;
	}

}
