package ioutil;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

import core.Emp;

public class CharIoUtil {
 public synchronized void writeData(String fileName,List<Emp>list) throws Exception
 {
	 
	 try(PrintWriter pw=new PrintWriter(new FileWriter(fileName)))
	 {
		 for (Emp e: list)
			 pw.println(e);
	 }
 }
}
