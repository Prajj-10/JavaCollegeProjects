/**
 * 
 */
package org.cis.javaSwing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;





/**
 * 
 */
public class FetchData {
	
	JFrame frame;
	
	static DatabaseConnection dbcon;
	Connection con;

	public FetchData() {
		try {
			dbcon = DatabaseConnection.getInstance();
			con = (Connection) dbcon.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
	}
	
	// Registers User in the database.
	
	public void registerUsers(String name, String address, String phoneNumber, String userName, String password) {
        String sql = "INSERT INTO Registration "
        		+ "(full_name, address, phone_number, user_name, pass) VALUES "
        		+ "(?, ?, ?, ?, ?)";
        PreparedStatement pstmt;

        try {
        	pstmt = con.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, address);
            pstmt.setString(3, phoneNumber);
            pstmt.setString(4, userName);
            pstmt.setString(5, password);
            pstmt.executeUpdate();

        } catch (SQLException e) {
        	JOptionPane.showMessageDialog(frame, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return;
            // Handle exceptions
        }
        
    }
	public void addLoginDetails(String userName, String password) {
        String sql = "INSERT INTO Login_Table "
        		+ "(user_name, pass) VALUES "
        		+ "(?, ?)";
        PreparedStatement pstmt;

        try {
        	pstmt = con.prepareStatement(sql);
            pstmt.setString(1, userName);
            pstmt.setString(2, password);
            pstmt.executeUpdate();

        } catch (SQLException e) {
        	JOptionPane.showMessageDialog(frame, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            // Handle exceptions
        }
	}
	
	public boolean validateUser(String username, String password) throws SQLException {
		String sql = "SELECT * FROM login_table WHERE user_name = ? AND pass = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs;

		try {

			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// Handle error
		}
		return false;
	}
	
}
