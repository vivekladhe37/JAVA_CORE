package tester;

import java.util.HashMap;
import java.util.Scanner;
import static utils.Collectionutils.*;
import core.Dept;
import thread.DeptHandlerTask;

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
	    	
	    	System.out.println("Enter the file name");
		    DeptHandlerTask dept=new DeptHandlerTask(hm,d.getDeptId(),sc.next());
		    Thread t1=new Thread(dept);
		    t1.start();
		    
	    }
	    
	   
		
	}

}
