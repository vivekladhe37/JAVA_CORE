package tester;
import static collectionutils.CollectionUtil.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
//import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

import static conversion.conversionUtils.*;
import com.Customer;
//import static collectionutils.SeriaUtils.*;
import cust_exception.CustomerExceptionHandling;
import enumpack.CustType;
public class Tester {

	public static void main(String[] args) 
	{
		
		boolean exit=false;
		
			
		    try(Scanner sc=new Scanner(System.in))
		    {
			    HashMap<String,Customer> hm=populateData();
		    	while(!exit)
				{
		    	System.out.println("1.Add Customer");
		    	System.out.println("2.Add Address");
		    	System.out.println("3.Display Customer");
		    	System.out.println("4.Login");
		    	System.out.println("5.Remove");
		    	System.out.println("6.Search Customers By Specific Type");
		    	System.out.println("7.Sort As Per email");
		    	System.out.println("8.Sort As Per Date");
		    	System.out.println("9.Exit");
		    	System.out.println("Enter Your Choice:");
		    	switch(sc.nextInt())
		    	{
		    	case 1:
		    		System.out.println("Enter email,password,regamt,reg Date,CustType"); 
		    		
	                Customer c4=new Customer(validateEmail(sc.next(),hm),sc.next(),sc.nextDouble(),checkDate(sc.next()),validateType(sc.next()));
	                hm.put(c4.getEmail(),c4);
	                System.out.println("Enter city,state,country,phoneNo,type"); 
	                for(int i=0;i<2;i++)
	                {
	                System.out.println("Enter Address:\n 1:Home Address");
		    		c4.linkAddress(sc.next(),sc.next(),sc.next(),sc.next(),sc.next());
	                }
		    		System.out.println("Customer Added Successfully!!!");
	              
	               break;
		    	case 2:
		    		break;
		    	case 3:
		                for(Customer c1:hm.values())
		                {
			                 System.out.println(c1);
		                 }
		                break;
		    	case 4:
		    		System.out.println("Enter Email:");
		    		String email=sc.next();
		    		System.out.println("Enter Password:");
		    		String Password=sc.next();
		    		    for(Customer c1:hm.values())
		                {
			                 if(!(c1.getEmail().equals(email) && c1.getpassword().equals(Password)))
			                 {
			                	throw new CustomerExceptionHandling("Login Credetials are not valid"); 
			                 }
			                 else
			                 {
			                 System.out.println("Login Successful!!!\n Your Details");
			                 System.out.println(c1);
			                 break;
			                 }
			                 
		                 }
		    	case 5:
		    		System.out.println("Enter Email for remove:");
		    	       Customer c3=hm.remove(sc.next());
		    	       if(c3 == null)
		    	    	   System.out.println("No Such Email");
		    	       System.out.println("Removed Successfully!!!");
		    	       System.out.println("Student Removed:"+c3);
		    	       break;
		    		    
		    	case 6:
		    		System.out.println("Enter Your type:");
		    		CustType type=validateType(sc.next());
		    		for(Customer c1:hm.values())
	                {
		    			if(c1.getType().equals(type))
		    			{
		                 System.out.println(c1);
		    			}
	                 }
	                break;
		    		
		    	case 7:
		    		TreeMap<String,Customer> tm=new TreeMap<String,Customer>(hm);
		    		for(Customer c1:tm.values())
	                {
		    			
		                 System.out.println(c1);
		    			
	                 }
		    		break;
		    	
		    	case 8:
		    		Collection<Customer> coll=hm.values();
		    		ArrayList<Customer> lists=new ArrayList<Customer>(coll);
		    		Collections.sort(lists,new Comparator<Customer>()
		    			{
		    			@Override
								public int compare(Customer o1, Customer o2) 
								{
									return o1.getReddate().compareTo(o2.getReddate());
						         }
		    			   
		    			
		    				});
		    		System.out.println("After Sorting According To Date:");
		    		for(Customer c1:lists)
	                {
		    			
		                 System.out.println(c1);
		    			
	                 }
		    		break;
		    		
		    	case 9:
		    		exit=true;
		    		break;
		    	}
				}
		    }
		    catch(Exception e)
		    {
		    	//System.out.println(e.getMessage());
		    	e.printStackTrace();
		    }
		   
		}
		
		
	}


