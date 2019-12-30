package thread;


//import static utils.Collectionutils.*;

import java.util.HashMap;

import core.Dept;
import ioutil.CharIoUtil;
import utils.Collectionutils;

public class SortByDateRunnable implements Runnable
{

	private HashMap<String , Dept> hm;
	 private String deptId,fileName;

		public SortByDateRunnable(HashMap<String, Dept> hm, String deptId, String fileName) {
		super();
		this.hm = hm;
		this.deptId = deptId;
		this.fileName = fileName;
	}
		Collectionutils c=new Collectionutils();
		CharIoUtil io=new CharIoUtil();
		@Override
		public void run()
		{
			System.out.println(Thread.currentThread().getName() + "Started Execution");
			
			try 
			{
				synchronized (hm.get(deptId).getEmps()) 
				{
					System.out.println("In sort by date run:");
				     io.writeData(fileName,c.sortEmpbyDate(hm.get(deptId).getEmps()));	
				}
				 
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "Finished Execution");
		}
	
	
}
