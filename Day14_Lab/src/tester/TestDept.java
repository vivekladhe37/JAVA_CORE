package tester;

import java.util.HashMap;
import java.util.Scanner;
import static utils.Collectionutils.*;
import core.Dept;
import thread.DeptHandlerTask;
import thread.SortByDateRunnable;
import thread.SortByNameRunnable;

public class TestDept {
	public static void main(String []args)
	{   
		HashMap<String , Dept> hm =populateData();
	    @SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);

	    for(Dept d: hm.values())
	    {
	    	System.out.println(d);
	    }
	    for(Dept d: hm.values())
	    {
	    	
	    	System.out.println("Enter three file names:");
	    	System.out.println("1.Sort By Salary");
	    	String filename1=sc.next();
	    	System.out.println("2.Sort By Name");
	    	String filename2=sc.next();
	    	System.out.println("3.Sort By Date");
	    	String filename3=sc.next();
		    DeptHandlerTask dept=new DeptHandlerTask(hm,d.getDeptId(),filename1);
		    Thread t1=new Thread(dept);
		    t1.start();
		    SortByNameRunnable sr=new SortByNameRunnable(hm,d.getDeptId(),filename2);
		    Thread t2=new Thread(sr);
		    t2.start();
		    SortByDateRunnable dt=new SortByDateRunnable(hm,d.getDeptId(),filename3);
		    Thread t3=new Thread(dt);
		    t3.start();
		    
	    }
	    
	   
		
	}

}
