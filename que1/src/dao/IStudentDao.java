package dao;

import java.sql.SQLException;
import java.util.List;

import pojos.Student;

public interface IStudentDao {
       List<Student> getStudentDetails(String CourseName) throws SQLException;
       String updateStudentDetails (int id,double newmarks,String newphonenumber) throws SQLException;
       String deleteStudent(String email) throws SQLException;
       List<Student>getAllStudent() throws SQLException;
}
