package thread;

//import java.util.ArrayList;
import java.util.HashMap;
import  static  utils.Collectionutils.*;
import core.Dept;
//import core.Emp;

import static ioutil.CharIoUtil.*;

public class DeptHandlerTask  implements Runnable{
 private HashMap<String , Dept> hm;
 private String deptId,fileName;

	public DeptHandlerTask(HashMap<String, Dept> hm, String deptId, String fileName) {
	super();
	this.hm = hm;
	this.deptId = deptId;
	this.fileName = fileName;
}

	@Override
	public  void run()
	{
		System.out.println(Thread.currentThread().getName());
		try {
		     writeData(fileName,sortEmpbySal(hm.get(deptId).getEmps()));
		    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
