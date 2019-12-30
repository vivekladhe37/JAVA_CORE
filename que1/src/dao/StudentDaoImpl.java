package dao;
import static dbutils.DButils.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojos.Student;

public class StudentDaoImpl implements IStudentDao {
	private Connection cn;
	private PreparedStatement pst1,pst2,pst3,pst4;
	List<Student>list=new ArrayList<Student>();
	
	public StudentDaoImpl() throws ClassNotFoundException, SQLException
	{
		cn=fetchConnection();
		pst1=cn.prepareStatement("select * from students s where course_name=?");
		pst2=cn.prepareStatement("update students set marks=marks+?,phone_no=? where id=?");
		pst3=cn.prepareStatement("delete from students where email=?");
		pst4=cn.prepareStatement("select * from Students s");
	}
	
	public void cleanUp() throws SQLException
	{
		if(pst1!=null)
		{
			pst1.close();
		}
		if(pst2!=null)
		{
			pst2.close();
		}
		if(pst3!=null)
		{
			pst3.close();
		}
		if(pst4!=null)
		{
			pst4.close();
		}
		
		System.out.println("StudentDao Cleaned up");
	}

	@Override
	public List<Student> getStudentDetails(String CourseName) throws SQLException {
		list=new ArrayList<Student>();
		pst1.setString(1, CourseName);
		try(ResultSet rst=pst1.executeQuery())
		{
			while(rst.next())
			{
				list.add(new Student(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), 
						rst.getDouble(7)));
			}
		}
		return list;
	}

	@Override
	public String updateStudentDetails(int id,double newmarks, String newphonenumber) throws SQLException {
		pst2.setDouble(1,newmarks );
		pst2.setString(2,newphonenumber) ;
		pst2.setInt(3,id );
		int count =pst2.executeUpdate();
		if(count==1)
		return "Student marks and phone number updated Successfully!!!";
		else
			return "Student is not updated Successfully!!!";
		
	}

	@Override
	public String deleteStudent(String email) throws SQLException {
		pst3.setString(1,email );
		int count=pst3.executeUpdate();
		if(count==1)
		return "Student deleted successfully";
		else
		return "Student not found to delete";
		
	}

	@Override
	public List<Student> getAllStudent() throws SQLException {
		try(ResultSet rst=pst4.executeQuery())
		{
		  while(rst.next())
		  {
			  list.add(new Student(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), 
						rst.getDouble(7)));
		  }
		}
		return list;
	}
	

}
