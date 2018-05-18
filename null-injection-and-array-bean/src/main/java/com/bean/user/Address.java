package com.bean.user;

public class Address {
	private String name;
	private String postalCode;
	private String streetName;
	private String streetNumber;

	public Address(String name, String postalCode, String streetName, String streetNumber) {
	
		this.name = name;
		this.postalCode = postalCode;
		this.streetName = streetName;
		this.streetNumber = streetNumber;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", postalCode=" + postalCode + ", streetName=" + streetName + ", streetNumber="
				+ streetNumber + "]";
	}

}
