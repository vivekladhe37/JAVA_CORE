package utils;

import java.time.LocalDate;
import java.util.HashMap;

import com.app.core.Employee;

import custom_excep.EmployeeCustomExceptionHandling;

public class CollectonUtils {

	
	public static HashMap<String,Employee> populateData()
	{
	     HashMap<String, Employee>hm=new HashMap<>();
	     hm.put("100", new Employee("100", "renu", "Hr", 45678.0, LocalDate.parse("1996-09-09"), LocalDate.parse("2016-09-09")));
	     hm.put("101", new Employee("101", "abc", "sales", 34567.0, LocalDate.parse("1989-09-09"), LocalDate.parse("2017-09-09")));
	     hm.put("102", new Employee("102", "pqr", "Finance", 47238.0, LocalDate.parse("1996-09-09"), LocalDate.parse("1996-09-09")));
	      return hm;
	}
	public static Employee getEmployeeById(String id,HashMap<String, Employee> hm) throws EmployeeCustomExceptionHandling
	{
	     	Employee e=hm.get(id);
	     	if(e==null)
	     		throw new EmployeeCustomExceptionHandling("Id not found");
	     	return e;
	}
	
	
}
