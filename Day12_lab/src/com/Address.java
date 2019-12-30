package com;

import java.io.Serializable;

public class Address implements Serializable
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private String city,state,country,phoneNo,type;
   public Address(String city, String state, String country, String phoneNo, String type) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.phoneNo = phoneNo;
		this.type = type;
		
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", phoneNo=" + phoneNo
				+ ", type=" + type + "]";
	}
	
	
	
}
