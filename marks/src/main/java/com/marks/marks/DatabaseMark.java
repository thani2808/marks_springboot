package com.marks.marks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseMark {
	
	private static String url = "jdbc:mysql://localhost:3306/student";
	private static String user = "root";
	private static String password = "Thani@01";
	
	private static Connection connection = null;
	private DatabaseMark() {
		
	}
	
	public static Connection getConnection() throws SQLException {
		connection = DriverManager.getConnection(url, user, password);
		
		return connection;
	}

	
	public static void closeConnection(Connection connection) throws SQLException{
		connection.close();
		
	}


}
