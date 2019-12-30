package utils;

import static java.time.LocalDate.parse;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import core.Dept;
import core.Emp;

public class Collectionutils {
 public static HashMap<String , Dept> populateData()
 {
	 HashMap<String, Dept> org=new HashMap<String, Dept>();
	 List<Emp> emp1=Arrays.asList(new Emp(12,"Shweta",1000,parse("2018-01-02")),
			 new Emp(13,"Arya",9000,parse("2019-01-02")),
					 new Emp(14,"Isha",4000,parse("2016-01-02")));
	 Dept d1=new Dept("rnd","mumBAI",emp1);
	 List<Emp> emp2=Arrays.asList(new Emp(50,"Shweta",3400,parse("1885-01-02")),
			 new Emp(51,"Arya",6000,parse("1889-01-02")),
					 new Emp(52,"Isha",1000,parse("1884-01-02")));
	 Dept d2=new Dept("hr","delhi",emp2);
	 List<Emp> emp3=Arrays.asList(new Emp(100,"Shweta",89000,parse("2000-01-02")),
			 new Emp(101,"Arya",7000,parse("2100-01-02")),
					 new Emp(102,"Isha",8900,parse("2005-01-02")));
	 Dept d3=new Dept("sales","pune",emp3);
	 org.put(d1.getDeptId(),d1);
	 org.put(d2.getDeptId(),d2);
	 org.put(d3.getDeptId(),d3);
	return org;
	 
 }
 public  synchronized List<Emp> sortEmpbySal(List<Emp> l1)
 {
	 Collections.sort(l1,new Comparator<Emp>(){
		 @Override
		 public int compare(Emp o1,Emp o2)
		 {
			 System.out.println("In sort by salary compare:");
			 return ((Double)o1.getSalaray()).compareTo(o2.getSalaray());
		 }
	});
	 return l1;
 }
 
 public  synchronized List<Emp> sortEmpbyName(List<Emp> l1)
 {
	 Collections.sort(l1,new Comparator<Emp>(){
		 @Override
		 public int compare(Emp o1,Emp o2)
		 {
			 System.out.println("In sort by name compare:");
			 return o1.getName().compareTo(o2.getName());
		 }
	});
	 return l1;
 }
 public  synchronized List<Emp> sortEmpbyDate(List<Emp> l1)
 {
	 Collections.sort(l1,new Comparator<Emp>(){
		 @Override
		 public int compare(Emp o1,Emp o2)
		 { System.out.println("In sort by date compare:");
			 return o1.getHiredtae().compareTo(o2.getHiredtae());
		 }
	});
	 return l1;
 }
 
}
