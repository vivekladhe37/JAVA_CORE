package dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	public static Connection fetchconnection() throws SQLException, ClassNotFoundException
	{   String url="jdbc:mysql://localhost:3306/que4";
	    Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(url,"root","renu");
	}

}
