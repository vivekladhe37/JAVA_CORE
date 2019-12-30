package utils;

import java.util.List;
import cust_exception.*;
import pojos.Student;

public class StudentValidationRules {

	public static int ValidateId(int id,List<Student> list) throws StudentHandlingException
	{
		if(list.indexOf(new Student(id))==-1)
		{
		  	throw new StudentHandlingException("Id not found");
		}
		return id;
	}
	/*
	 * public static String ValidateEmail(String email,List<Student> list) throws
	 * StudentHandlingException { if((list.contains(new Student(email)))) {
	 * System.out.println("In If Email"); throw new
	 * StudentHandlingException("email not found"); } return email; }
	 */
}
