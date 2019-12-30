package tester;

import java.util.List;
import java.util.Scanner;

import dao.StudentDaoImpl;
import pojos.Student;
import static utils.StudentValidationRules.*;
public class Tester {
 public static void main(String []args)
 {
	 try(Scanner sc =new Scanner(System.in))
	 {
		 StudentDaoImpl studao=new StudentDaoImpl();
		 boolean exit =false;
		 List<Student> list=null;
		 while(!exit)
		 {
			 System.out.println("1.Get Student Details by course");
			 System.out.println("2.Update the marks and phone number");
			 System.out.println("3.Cancel Admission");
			 System.out.println("Enter your choice");
			 switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter course name");
				list=studao.getStudentDetails(sc.next());
				for(Student s:list)
				{
					System.out.println(s);
				}
				break;
			case 2:{
				    list=studao.getAllStudent();
					System.out.println("Enter the id,new marks and new phone number");
					String msg=studao.updateStudentDetails(ValidateId(sc.nextInt(),list), sc.nextDouble(), sc.next());
					System.out.println(msg);
			        }
					break;
			case 3:
				System.out.println("Enter email to delete student");
				list=studao.getAllStudent();
				System.out.println(studao.deleteStudent((sc.next())));
				break;

			default:
				break;
			}
		 }
	 }
	 catch(Exception e)
		{
			//e.printStackTrace();
		 System.out.println(e.getMessage());
		}
		

 }


}
