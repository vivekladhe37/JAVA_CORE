package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import com.app.core.Student;
import static collectionutils.ValidationRules.*;
import static collectionutils.CollectionUtils.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc =new Scanner(System.in))
		{
		  HashMap<Integer, Student> hm= populateData();
		  boolean exit=false;
		  LocalDate currDate=LocalDate.parse("2019-11-24");
		  
		  while(!exit)
		  {
			  List<String> list=new ArrayList<String>();
			  System.out.println("1.Enroll Student");
			  System.out.println("2.Display students");
			  System.out.println("3.Get students by course");
			  switch (sc.nextInt()) {
			  case 1: validateRegDate(currDate);
				  	 System.out.println("no. of courses u want to register");
			         int count=sc.nextInt();
			         for(int i=1;i<=count;i++)
			         {
			         System.out.println("enter the "+ i +"course name ");
			         //if(list.contains(sc.))
			         //list.add(sc.next());
			         checkDuplicateUser(list,sc.next());
			         }
			         System.out.println("Enter name id age ");
			         Student st=new Student(sc.next(), sc.nextInt(), sc.nextInt(), list);
			         hm.put(st.getId(),st);
				
			  break;
			  case 2:for(Student s:hm.values())
			  			{
				  			System.out.println(s);
			  			}
			  
			  break;
			  case 3:System.out.println("enter the coure to search student");
			         String coursename=sc.next();
				     for(Student s1:hm.values())
			  		 {
				       if(s1.getCourseList().contains(coursename))
				       {
				    	   System.out.println(s1.getName());
				       }
			  		 }	
				     break;

			default:
				break;
			}
		  }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
