package pojos;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Student {

	/*
	 * create table students(id number(5) primary key,name varchar2(20), email
	 * varchar2 (20) unique ,address varchar2(10), phone_no varchar2(10),course_name
	 * varchar2(15), marks number(4,1));
	 */
	private int id;
	private String name,email,address,phoneNumber,courseName;
	private double marks;
	public Student(int id, String name, String email, String address, String phoneNumber, String courseName,
			double marks) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.courseName = courseName;
		this.marks = marks;
	}
	
	public Student(int id) {
		super();
		this.id = id;
	}

	public Student(String email) {
		super();
		this.email=email;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", phoneNumber="
				+ phoneNumber + ", courseName=" + courseName + ", marks=" + marks + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student)
		{
			System.out.println("in equals of id");
			if(((Integer)id).equals(((Student) obj).getId()))
			{
				System.out.println("in if");
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
