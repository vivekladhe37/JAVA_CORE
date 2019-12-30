package com.app.core;
import java.time.LocalDate;
import java.util.*;
public class Student {

	/*
	 * StudentName:String, StudentId: Int (AutoIncrement), studentAge: Int,
	 * CourseList: List<String>
	 */
	private String name;
	private int id,age;
	private LocalDate regDate;
	private List<String> courseList=new ArrayList<>();
	
	public Student(String name, int id, int age, List<String> courseList) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		//this.regDate = regDate;
		this.courseList = courseList;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public List<String> getCourseList() {
		return courseList;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + ", courseList=" + courseList + "]";
	}
	
	/*
	 * public static List<String>getCourses(String course) { List<String> list=new
	 * ArrayList<String>(); list.add(course); }
	 */
	
	
}
