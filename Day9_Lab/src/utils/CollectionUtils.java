package utils;

import java.util.ArrayList;

import com.app.core.CrcType;
import com.app.core.student;

import cust_exec.StudentCustomExceptionHandling;

import static utils.ValidationUtils.*;

public class CollectionUtils {
	public static ArrayList<student> populateStudents() {
		ArrayList<student> list = new ArrayList<student>();
		try 
		{
			list.add(new student(validatePrn("102", list), validateName("Shweta"), 
					validateEmail("abc@12"), 500,
					validateCourse("dac"), validateNParse("01-01-2005")));
			list.add(new student(validatePrn("103", list), validateName("Renu"), 
					validateEmail("abc@12"), 400,
					validateCourse("dmc"), validateNParse("01-01-2001")));

			list.add(new student(validatePrn("101", list), validateName("Awanti"), 
					validateEmail("abc@12"), 300,
					validateCourse("dac"), validateNParse("01-01-2001")));

			list.add(new student(validatePrn("104", list), validateName("Arya"), 
					validateEmail("abc@12"), 500,
					validateCourse("dmc"), validateNParse("01-01-2001")));


		} 
		catch (Exception e) 
		{
             e.printStackTrace();
		}
		
		return list;
	}
	public static student getStudentByPrn(ArrayList<student> list,String prn) throws StudentCustomExceptionHandling
	{
		int index=list.indexOf(new student(prn));
		if(index == -1)
			throw new StudentCustomExceptionHandling("No Student Found with this PRN!!!");
		return list.get(index);
		
	}
	public static ArrayList<student> courseWiseMarksList(CrcType course,
			ArrayList<student> l)
	{
		ArrayList<student> list=new ArrayList<student>();
		for(student s:l)
		{
			if(course.equals(s.getCourse()))
			{
				list.add(s);
			}
			
		}
		return list;
		
	}

}
