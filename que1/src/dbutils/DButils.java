package dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButils {
    public static Connection fetchConnection() throws ClassNotFoundException, SQLException
    {
    	String url="jdbc:mysql://localhost:3306/que1";
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	return DriverManager.getConnection(url,"root","renu");
    	
    	
    }
}
