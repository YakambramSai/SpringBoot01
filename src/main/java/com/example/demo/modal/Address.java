/**
 * 
 */
package com.example.demo.modal;

public class Address {
	
	private String street;
	private String state;
	private Integer pinCode;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	public Address(String street, String state, Integer pinCode) {
		super();
		this.street = street;
		this.state = state;
		this.pinCode = pinCode;
	}
	
	

}
