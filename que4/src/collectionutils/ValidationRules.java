package collectionutils;

import java.time.LocalDate;
import java.util.List;

import custom_excep.StudentCustomExceptionHandling;
public class ValidationRules {
    
	private static LocalDate regDate;
	static
	{
		regDate=LocalDate.parse("2019-11-27");
	}
	public static void validateRegDate(LocalDate date) throws StudentCustomExceptionHandling
	{
		//LocalDate d=LocalDate.parse(date);
		if(date.isAfter(regDate))
		{
			throw new StudentCustomExceptionHandling("Registreation date is over");
		}
		
	}
	public static void checkDuplicateUser(List<String> list,String course) throws StudentCustomExceptionHandling
	{
		if(!list.contains(course))
		{
			list.add(course);
		}
		
		else throw new StudentCustomExceptionHandling("Duplicate user for same course");
	}
	
}
