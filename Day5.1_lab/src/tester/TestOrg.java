package tester;
import java.util.*;
import employee.*;
import manager.*;
import worker.*;
public class TestOrg
{
  /*Write TestOrg in "tester" package.
  Create suitable array to store organization details.
  Provide following options
  1. Hire Manager
  2. Hire Worker  
  3. Display information of all employees , net salary using single for-each loop.
  */
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("How many employees?");
		int noOfEmp=sc.nextInt();
		employee [] emps=new employee[noOfEmp];
		boolean exit=false;
		int ch,i=0;
		while(!exit && i < noOfEmp)
		{
			System.out.println("1.Hire Manager");
			System.out.println("2.Hire Worker");
			System.out.println("3.Display information of all employees");
			System.out.println("4.See Emp Id Details");
			System.out.println("5.Upadte Basic salary of employee");
			System.out.println("6.Manager Get Performance Bonus");
			System.out.println("7.Get Worker Hourly rate");
			System.out.println("8.Exit:");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:{
			System.out.println("Enter name,email,deptId,basic,dept,perfBonus");
		   emps[i]=new manager(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.next(),sc.nextDouble());
		    i++;
			       }break;
			       
			case 2:{
				
				System.out.println("Enter name,email,deptId,basic,hoursWorked,hourlyRate");
				emps[i]=new worker(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextInt(),sc.nextDouble());
				i++;
			       }break;
			case 3:{
				
				     for(employee e:emps)
				     {
				      System.out.println(e.toString());
				      System.out.println("Net Salary:");
				      System.out.println(e.computeNetSalary());
				     }
				     
				     
			       }break;
			case 4:{
				     System.out.println("Enter Id:");
				     int id=sc.nextInt()-101;
				     System.out.println(id+"details:"+emps[id].toString());
				    }break;
			case 5:{
				 System.out.println("Enter Id:");
			     int id=sc.nextInt()-101;
			     System.out.println("Enter Salary increment:");
			     double inc=sc.nextInt();
			     emps[id].setBasic(emps[id].getBasic()+inc);
			     System.out.println("Updated Salary:"+emps[id].getBasic());
			     
			}break;
			case 6:{
				    System.out.println("Enter Id:");
			        int id=sc.nextInt()-101;
				    if(emps[id] instanceof manager)
					{
				        System.out.println("Performance Bonus:");
						System.out.println(((manager) emps[id]).getPerfBonus());
					}
				    else
			         {
			        	 System.out.println("Soory you are not manager");
			         }
				  }break;
			case 7:{
				    System.out.println("Enter Id:");
			         int id=sc.nextInt()-101;
			         if(emps[id] instanceof worker)
			         {
			        	 System.out.println("Workers Hourly Rate:");
			        	 System.out.println(((worker) emps[id]).getHrlyRate());
			         }
			         else
			         {
			        	 System.out.println("Soory you are not worker");
			         }
				
			}break;
			case 8:{
				exit=true;
			}break;
			}
			
		}
	    
		
	}

}
