/**
 * 
 */
package org.cis.javaSwing;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 */
public class DatabaseConnection {
	private static final String URL = "jdbc:postgresql://localhost:5432/PCPS";
	private static final String USER = "postgres";
	private static final String PASSWORD = "12345";
	
	private static DatabaseConnection instance = null;
	
	private static Connection connection;
	
	private DatabaseConnection() throws SQLException{
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			
		}catch(ClassNotFoundException ex) {
			System.out.println("Database Connection Creation Failed : " + ex.getMessage());
		}
	}
	
	public static DatabaseConnection getInstance() throws SQLException{
		if(instance == null) {
			instance = new DatabaseConnection();
		}
		else if(instance.getConnection().isClosed()) {
			instance = new DatabaseConnection();
		}
		return instance;
	}
	
	public static Connection getConnection() {
		return connection;
	}
	
}
