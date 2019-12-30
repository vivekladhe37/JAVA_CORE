package utils;

import java.util.ArrayList;

//import com.app.core.CrcType;
import com.app.core.student;

import cust_exec.StudentCustomExceptionHandling;

import static utils.ValidationUtils.*;

public class CollectionUtils {
	public static student[] populateStudents(int size) {
		
		student [] stds = new student[size];
		try 
		{
			stds[0]=new student(validatePrn("102", stds), validateName("Shweta"), 
					validateEmail("abc@12"), 500,
					validateCourse("dac"), validateNParse("01-01-2005"));
			stds[1]=new student(validatePrn("103", stds), validateName("Renu"), 
					validateEmail("abc@12"), 400,
					validateCourse("dmc"), validateNParse("01-01-2001"));

			stds[2]=new student(validatePrn("101", stds), validateName("Awanti"), 
					validateEmail("abc@12"), 300,
					validateCourse("dac"), validateNParse("01-01-2001"));

			stds[3]=new student(validatePrn("104", stds), validateName("Arya"), 
					validateEmail("abc@12"), 500,
					validateCourse("dmc"), validateNParse("01-01-2001"));


		} 
		catch (Exception e) 
		{
             e.printStackTrace();
		}
		
		return stds;
	}
	public static student getStudentByPrn(ArrayList<student> list,String prn) throws StudentCustomExceptionHandling
	{
		int index=list.indexOf(new student(prn));
		if(index == -1)
			throw new StudentCustomExceptionHandling("No Student Found with this PRN!!!");
		return list.get(index);
		
	}
}
