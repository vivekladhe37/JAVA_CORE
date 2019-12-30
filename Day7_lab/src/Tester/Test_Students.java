package Tester;

/*import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;*/
import java.util.Scanner;
import static utils.CollectionUtils.*;

//import com.app.core.CrcType;
import com.app.core.student;

/*import cust_exec.StudentCustomExceptionHandling;
import utils.CollectionUtils;*/

import static utils.ValidationUtils.*;
public class Test_Students {

	public static void main(String[] args) {
		boolean exit = false;
		int i=0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("How many students?");
			int size=sc.nextInt();
			student[] studs = populateStudents(size);
			while (!exit) {
				try {
					System.out.println("****Menu****");
					System.out.println("1.New Student Admission");
					System.out.println("2.Display Students");
					System.out.println("3.See Students For Specific Course");
					System.out.println("10.Exit");
					System.out.println("Enter your choice:");
					switch (sc.nextInt()) {
					case 1: {
						
					 System.out.println("Enter Prn,Name,Email,Marks,Course,Date of Birth");
                      studs[i++]=new student(validatePrn(sc.next(), studs),validateName(sc.next()),
                    		 validateEmail(sc.next()),sc.nextDouble(),validateCourse(sc.next()),
                    		 validateNParse(sc.next()));
                     System.out.println("Student Admission Done Successfylly!!!");
						
					}
						break;
					case 2: {
						for (student s : studs) {
							System.out.println(s);
						}

					}
						break;
					
					case 3: {
						exit = false;
					}
						break;
					}

				} catch (Exception e) {
                   e.printStackTrace();
				}
			}

		}
	}

}
