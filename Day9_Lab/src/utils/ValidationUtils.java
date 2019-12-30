package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.app.core.CrcType;
import com.app.core.student;

import cust_exec.StudentCustomExceptionHandling;

public class ValidationUtils {

	public static Date startdate;
	public static SimpleDateFormat sdf;

	static {

		sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {

			startdate = sdf.parse("01-01-1985");
		} catch (ParseException e) {

			e.printStackTrace();
		}
	}

	public static String validatePrn(String prn, ArrayList<student> list) throws StudentCustomExceptionHandling {
		int index = list.indexOf(new student(prn));
		if (index != -1)
			throw new StudentCustomExceptionHandling("Duplicate PRN!!");
		return prn;
	}

	public static String validateName(String name) throws StudentCustomExceptionHandling {
		if (!(name.length() >= 4 && name.length() <= 10))
			throw new StudentCustomExceptionHandling("name must be min 4 chars & "
					+ "max 10 chars long and should contain '@'");
		return name;

	}

	public static String validateEmail(String email) throws StudentCustomExceptionHandling {
		if (!(email.length() >= 4 && email.length() <= 10 && email.contains("@")))
			throw new StudentCustomExceptionHandling("email must be min 4 chars & max 10 chars long");
		return email;

	}

	public static CrcType validateCourse(String course) throws IllegalArgumentException {
		return CrcType.valueOf(course);
	}
	
	public static Date validateNParse(String dateString) throws ParseException, StudentCustomExceptionHandling
	{
		Date dob=sdf.parse(dateString);
		if(dob.before(startdate))
			throw new StudentCustomExceptionHandling("dob can't be before 1st Jan 1985.");
		return dob;
	}

}
