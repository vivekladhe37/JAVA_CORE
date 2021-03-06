package Tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import static utils.CollectionUtils.*;

import com.app.core.CrcType;
import com.app.core.student;

import cust_exec.StudentCustomExceptionHandling;
//import utils.CollectionUtils;

import static utils.ValidationUtils.*;
public class Test_Students {

	public static void main(String[] args) {
		boolean exit = false;
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<student> list = populateStudents();
			while (!exit) {
				try {
					System.out.println("****Menu****");
					System.out.println("1.New Student Admission");
					System.out.println("2.Display Students");
					System.out.println("3.See Students For Specific Course");
					System.out.println("4.Update Student Marks");
					
					System.out.println("5.PRN & names of all students born after "
							+ "specific date & enrolled in a specific course.");
					System.out.println("6.Cancel Admission");
					System.out.println("7.Sort students as per prns");
					System.out.println("8.Sort students as per dob & marks");
					System.out.println("9.Name of a topper for a specific course");
					System.out.println("100.Exit");
					System.out.println("Enter your choice:");
					switch (sc.nextInt()) {
					case 1: {
						
					 System.out.println("Enter Prn,Name,Email,Marks,Course,Date of Birth");
                     list.add(new student(validatePrn(sc.next(), list),validateName(sc.next()),
                    		 validateEmail(sc.next()),sc.nextDouble(),validateCourse(sc.next()),
                    		 validateNParse(sc.next())));
                     System.out.println("Student Admission Done Successfylly!!!");
						
					}
						break;
					case 2: {
						for (student s : list) {
							System.out.println(s);
						}

					}
						break;
					case 3:{
						System.out.println("Enter Course name:");
						CrcType course=validateCourse(sc.next());
						System.out.println("Students Belonging to that Course:");
						for(student s:list)
						{
							if(course.equals(s.getCourse()))
							{
								System.out.println(s);
							}
							
						}
					}break;
					case 4:{
						
						System.out.println("Enter PRN of Student and marks to update:");
						student s=getStudentByPrn(list, sc.next());
						s.setMarks(sc.nextDouble());
						System.out.println("Student Marks updated Successfully!!!");
						
						
					}break;
					case 5:{
						System.out.println("Enter Course Name:");
						CrcType course=validateCourse(sc.next());
						System.out.println("Enter Date:");
						Date date=validateNParse(sc.next());
						for(student s:list)
						{
							if(course.equals(s.getCourse()) && s.getDob().after(date))
							{
								
								System.out.println("PRN:" + s.getPrn());
								System.out.println("Name:" +  s.getName());
								
								
							}
							
						}
						
					}break;
					case 6:{
						System.out.println("Enter PRN No:");
						if(!list.remove(new student(sc.next())))
							throw new StudentCustomExceptionHandling
							("No Student with this PRN!!!!");
						System.out.println("Student removed Succcessfullyy!!!");
							
							
					}break;
					case 7:{
						System.out.println("Sorted List of Students by PRN:");
						Collections.sort(list);
						for(student s:list)
						{
						  System.out.println(s);
						}
						
					}break;
					case 8:{
						
						System.out.println("Sorted List:");
						Collections.sort(list, new Comparator<student>() {

							@Override
							public int compare(student o1, student o2) {
								int ret=o1.getDob().compareTo(o2.getDob());
								if(ret != 0)
									return ret;
						    return ((Double)o1.getMarks()).compareTo(o2.getMarks());
								
							
							}
					     });
						
						for(student s:list)
						{
							System.out.println(s);
						}
						
					}break;
					case 9:{
						
						System.out.println("Enter Course Name:");
						CrcType course=validateCourse(sc.next());
						ArrayList<student> list1=courseWiseMarksList(course, list);
						
						student s=Collections.max(list1,new Comparator<student>() {

							@Override
							public int compare(student o1, student o2) {
							   return ((Double)o1.getMarks()).compareTo(o2.getMarks()); 
								
							}
						});
						System.out.println("Topper is:" + s.getName());
						
					}break;
					case 100: {
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
