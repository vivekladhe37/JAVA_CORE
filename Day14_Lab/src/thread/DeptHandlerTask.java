package thread;

//import java.util.ArrayList;
import java.util.HashMap;
//import  static  utils.Collectionutils.*;
import core.Dept;
//import core.Emp;
import ioutil.CharIoUtil;
import utils.Collectionutils;

//import static ioutil.CharIoUtil.*;

public class DeptHandlerTask  implements Runnable{
 private HashMap<String , Dept> hm;
 private String deptId,fileName;

	public DeptHandlerTask(HashMap<String, Dept> hm, String deptId, String fileName) {
	super();
	this.hm = hm;
	this.deptId = deptId;
	this.fileName = fileName;
}
	Collectionutils c=new Collectionutils();
	CharIoUtil io=new CharIoUtil();
	@Override
	public synchronized void run()
	{
		System.out.println(Thread.currentThread().getName() + "Started Execution");
		try 
		{
			synchronized (hm.get(deptId).getEmps())
            {
				 System.out.println("In sort by salary run:");
			     io.writeData(fileName,c.sortEmpbySal(hm.get(deptId).getEmps()));
			}
			
		  }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "Started Execution");
	}
}
