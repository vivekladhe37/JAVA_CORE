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
	 List<Emp> emp1=Arrays.asList(new Emp(12,"abc",1000,parse("1889-01-02")),
			 new Emp(13,"pqr",1000,parse("1889-01-02")),
					 new Emp(14,"abc",8000,parse("1889-01-02")));
	 Dept d1=new Dept("rnd","mumBAI",emp1);
	 List<Emp> emp2=Arrays.asList(new Emp(50,"xyz",3400,parse("1889-01-02")),
			 new Emp(51,"abcd",6000,parse("1889-01-02")),
					 new Emp(52,"abc",1000,parse("1889-01-02")));
	 Dept d2=new Dept("hr","delhi",emp2);
	 List<Emp> emp3=Arrays.asList(new Emp(100,"ghj",89000,parse("1889-01-02")),
			 new Emp(101,"fh",7000,parse("1889-01-02")),
					 new Emp(102,"abc",8900,parse("1889-01-02")));
	 Dept d3=new Dept("sales","pune",emp3);
	 org.put(d1.getDeptId(),d1);
	 org.put(d2.getDeptId(),d2);
	 org.put(d3.getDeptId(),d3);
	return org;
	 
 }
 public static List<Emp> sortEmpbySal(List<Emp> l1)
 {
	 Collections.sort(l1,new Comparator<Emp>(){
		 @Override
		 public int compare(Emp o1,Emp o2)
		 {
			 return ((Double)o1.getSalaray()).compareTo(o2.getSalaray());
		 }
	});
	 return l1;
 }
 
 
 
 
}
