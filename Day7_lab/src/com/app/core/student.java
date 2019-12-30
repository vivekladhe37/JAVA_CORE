package com.app.core;

//import java.time.LocalDate;
import java.util.Date;
import static utils.ValidationUtils.*;
public class student  implements Comparable<student>
{
	private String prn,name,email;
	private double marks;
	private CrcType course;
	private Date dob;
	
	
	
	public student(String prn, String name, String email, double marks, CrcType course, Date dob) {
		super();
		this.prn = prn;
		this.name = name;
		this.email = email;
		this.marks = marks;
		this.course = course;
		this.dob = dob;
	}

	public student(String prn) {
		super();
		this.prn = prn;
	}

	
	@Override
	public String toString() {
		return "student [prn=" + prn + ", name=" + name + ", email=" + email + ", marks=" + marks + ", course=" + course
				+ ", dob=" + sdf.format(dob) + "]";
	}

	public String getPrn() {
		return prn;
	}
	public void setPrn(String prn) {
		this.prn = prn;
	}
	
	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public CrcType getCourse() {
		return course;
	}

	public void setCourse(CrcType course) {
		this.course = course;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof student)
		{
			return prn.equals(((student) obj).prn);
		}
		return false;
	}

	@Override
	public int compareTo(student o) {
		return prn.compareTo(o.getPrn());
	}
	
}
