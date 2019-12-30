package collectionutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.Customer;

public class SeriaUtils 
{
	
	public static void storeDetails(HashMap<String, Customer> hm,String filename) throws FileNotFoundException, IOException
	{
	//	ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename));
		//out.writeObject(hm);
		
		  try(ObjectOutputStream out=new ObjectOutputStream(new
		  FileOutputStream(filename))) { //System.out.println("just.."+filename);
		  out.writeObject(hm); }
		 
	}
	@SuppressWarnings("unchecked")
	public static HashMap<String, Customer> restoreDetails(String filename) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		//System.out.println("test");
			File f1=new File(filename);
			if(f1.exists() && f1.isFile() && f1.canRead())
			{
				System.out.println("test");
				try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(f1)))
				{
					return (HashMap<String, Customer>)in.readObject();
					
				}
			
			}
			return new HashMap<>();
		
	}

}
