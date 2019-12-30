package conversion;

//import java.net.Proxy.Type;
//import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import com.Customer;

import cust_exception.CustomerExceptionHandling;
import enumpack.CustType;

public class conversionUtils {
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	private static Date dte;
	
	public static Date checkDate(String d)
	{  
		
		try
		{
			 dte=sdf.parse(d);
			 return dte;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return dte;
	}
	public static String validateEmail(String s,HashMap<String,Customer> h) throws Exception
	{
		if(h.containsKey(s))
			throw new CustomerExceptionHandling("Duplicate Email");
		return s;
	}
	
	
	public static CustType validateType(String s) throws IllegalArgumentException
	{
		return CustType.valueOf(s);
	}

}
