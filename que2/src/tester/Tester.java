package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import static utils.ValidationRules.*;
import static utils.CollectonUtils.*;
import com.app.core.Employee;

import custom_excep.EmployeeCustomExceptionHandling;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<String, Employee> hm = populateData();
			boolean exit = false;
			while (!exit) {
				System.out.println("1.Add Employee");
				System.out.println("2.Display Employee");
				System.out.println("3.view employee by id");
				System.out.println("4.sort Employee by Hiredate");
				System.out.println("5.Enter id to remove");
				System.out.println("Enter your choice");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("enter the id, name,department,salary,dob, hireDate");
					Employee e = new Employee(validateId(sc.next(), hm), sc.next(), sc.next(), sc.nextDouble(),
							LocalDate.parse(sc.next()), LocalDate.parse(sc.next()));
					hm.put(e.getId(), e);
					break;
				case 2:
					for (Employee e1 : hm.values()) {
						System.out.println(e1);
					}
					break;
				case 3:
					System.out.println("Enter id to search employee");
					System.out.println(getEmployeeById(sc.next(), hm));
					break;
				case 4:
					Collection<Employee> emps = hm.values();
					List<Employee> list = new ArrayList<Employee>(emps);
					Collections.sort(list, new Comparator<Employee>() {
						@Override
						public int compare(Employee o1, Employee o2) {
							return o1.getHireDate().compareTo(o2.getHireDate());
						}
					});
					System.out.println("after sorting");
					for (Employee emp : list) {
						System.out.println(emp);
					}
					break;
				case 5:
					System.out.println("Enter id to remove");
					Employee e4 = hm.remove(sc.next());
					try {
						if (e4 == null) {
							// System.out.println("no such id to remove");
							throw new EmployeeCustomExceptionHandling("no such id to remove");
						}
					} catch (Exception ep) {
						ep.printStackTrace();
					}

					System.out.println("removed successfully");
					break;

				default:
					break;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
