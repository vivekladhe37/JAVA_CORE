package com;

//import java.awt.List;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
//import static conversion.conversionUtils.*;

import enumpack.CustType;

public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email,password;
	double regamt;
	Date reddate;
	private CustType type;
	Address a;
	ArrayList<Address> l3;
	public Customer()
	{}
	public Customer(String email, String password, double regamt, Date reddate,CustType type) {
		super();
		this.email = email;
		this.password = password;
		this.regamt = regamt;
		this.reddate = reddate;
		this.type=type;
		l3=new ArrayList<>();
		
	}
	
	public void linkAddress(String city,String state,String country,String phoneNo,String type)
	{
		
        System.out.println("In link Adress:");
		l3.add(new Address(city,state,country,phoneNo,type));
		
	}
	public void printAddress()
	{
		for(Address a:l3)
		{
			System.out.println(a);
		}
	}
	
	
	@Override
	public String toString() {
		return "Customer [email=" + email + ", password=" + password + ", regamt=" + regamt + ", reddate=" + reddate
				+ ", type=" + type + ", a=" + a + ", l3=" + l3 + "]";
	}
	public  String getEmail()
	{
		return email;
	}
	public  String getpassword()
	{
		return password;
	}
	public CustType getType() {
		return type;
	}
	public Date getReddate() {
		return reddate;
	}
	public void setReddate(Date reddate) {
		this.reddate = reddate;
	}
	public void setType(CustType type) {
		this.type = type;
	}

}
