/**
 * 
 */
package org.cis.week2;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 
 */
public class ConnectionTester {
	
	static DatabaseConnection dbcon;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			dbcon = DatabaseConnection.getInstance();
			Connection con=(Connection) dbcon.getConnection();
			System.out.println(con.toString());
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

		
	}

}
