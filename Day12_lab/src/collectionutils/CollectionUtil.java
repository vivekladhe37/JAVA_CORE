package collectionutils;


import java.util.HashMap;
import static conversion.conversionUtils.*;
import com.Customer;

//import cust_exception.CustomerExceptionHandling;


public class CollectionUtil {
	
	public static HashMap<String, Customer> populateData()  
	{
		//Customer cust =new Customer();
		HashMap<String, Customer> hm =new HashMap<>();
		try
		{
		hm.put("abc@",new Customer("abc@","abc",112.5,checkDate("01-02-2017"),validateType("silver")));
		hm.put("pbc@",new Customer("pbc@","abc",112.5,checkDate("01-02-2069"),validateType("silver")));
		hm.put("qbc@",new Customer("qbc@","abc",112.5,checkDate("01-02-2000"),validateType("silver")));
		hm.put("rbc@",new Customer("rbc@","abc",112.5,checkDate("01-02-2099"),validateType("silver")));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return hm;
		

}
}