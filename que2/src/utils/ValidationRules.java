package utils;

import java.util.HashMap;

import com.app.core.Employee;

import custom_excep.EmployeeCustomExceptionHandling;

public class ValidationRules {

	
	public static String validateId(String id,HashMap<String, Employee> hm) throws Exception
	{
	 if(hm.containsKey(id))
	 {
		 throw new EmployeeCustomExceptionHandling("Dulpicate email");
	 }
	 return id;
		 
	}
}
