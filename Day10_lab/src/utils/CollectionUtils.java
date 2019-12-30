package utils;

import java.util.ArrayList;
import java.util.HashMap;

import com.app.core.CrcType;
import com.app.core.student;

import cust_exec.StudentCustomExceptionHandling;

import static utils.ValidationUtils.*;

public class CollectionUtils {
	public static HashMap<String, student> populateStudents() {
		
		
		HashMap<String,student> hm=new HashMap<String, student>();
		try 
		{
			hm.put("103",new student(validatePrn("103", hm), validateName("Shweta"), 
					validateEmail("abc@12"), 500,
					validateCourse("dac"), validateNParse("01-01-2005")));
			hm.put("110",new student(validatePrn("110", hm), validateName("Renu"), 
					validateEmail("abc@12"), 400,
					validateCourse("dmc"), validateNParse("01-03-2001")));

			hm.put("106",new student(validatePrn("106", hm), validateName("Awanti"), 
					validateEmail("abc@12"), 500,
					validateCourse("dac"), validateNParse("01-01-2001")));

			hm.put("102",new student(validatePrn("102", hm), validateName("Arya"), 
					validateEmail("abc@12"), 300,
					validateCourse("dmc"), validateNParse("01-01-2001")));


		} 
		catch (Exception e) 
		{
             e.printStackTrace();
		}
		
		return hm;
	}
	public static student getStudentByPrn(HashMap<String,student> hm,String prn) throws StudentCustomExceptionHandling
	{
		student s=hm.get(prn);
		if(s == null)
			throw new StudentCustomExceptionHandling("No Student Found with this PRN!!!");
		return s;
		
	}
	public static ArrayList<student> courseWiseMarksList(CrcType course,
			HashMap<String, student> hm)
	{
		ArrayList<student> list=new ArrayList<student>();
		for(student s:hm.values())
		{
			if(course.equals(s.getCourse()))
			{
				list.add(s);
			}
			
		}
		return list;
		
	}

}
