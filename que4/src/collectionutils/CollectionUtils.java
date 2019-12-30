package collectionutils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import com.app.core.Student;

public class CollectionUtils {

	public static HashMap<Integer, Student> populateData()
	{ 	
		HashMap<Integer, Student> hm=new HashMap<Integer, Student>();
		List<String> course1=Arrays.asList("java","os","dbms");
		Student s1=new Student("renu", 1, 22,course1);
		hm.put(1,s1);
		List<String> course2=Arrays.asList("java","os");
		Student s2=new Student("abc", 2, 23, course2);
		hm.put(2,s2);
		List<String> course3=Arrays.asList("Ds","os");
		Student s3=new Student("pqr", 3, 23, course3);
		hm.put(3,s3);
		return hm;
	}
	
	
}
