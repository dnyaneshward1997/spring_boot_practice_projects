package com.cdac.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address_table")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String cityName;
	private String stateName;
	private int pinCode;
	
	public Address() {
	}
	
	public Address(int id) {
		super();
		this.id = id;
	}
	
	public Address( String cityName, String stateName, int pinCode) {
		super();
		this.cityName = cityName;
		this.stateName = stateName;
		this.pinCode = pinCode;
	}
	
	public Address(int id, String cityName, String stateName, int pinCode) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.stateName = stateName;
		this.pinCode = pinCode;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return  id + " " + cityName + "  " + stateName + " " + pinCode;
	}
}