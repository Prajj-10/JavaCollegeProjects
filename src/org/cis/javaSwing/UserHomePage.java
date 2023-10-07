/**
 * 
 */
package org.cis.javaSwing;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;




/**
 * 
 */
public class UserHomePage extends JFrame{
	
	FetchData sql = new FetchData();
	
	List<User> userDetails = new ArrayList<User>();
	
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	
	JFrame frame;
	
	// Labels Declaration 
	
	JLabel title;
	JLabel name;
	JLabel address;
	JLabel phoneNumber;
	JLabel searchEmail;
	
	
	// TextField Declaration
	
	JTextField email;
	
	// Button Declaration 
	
	JButton search;
	
	public UserHomePage(String username, String password) {
		
		String full_name = "";
		String full_address = "";
		String phone_number = "";
		String user_name = "";
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		try {
			userDetails = sql.getUserData(username, password);
			for(User u: userDetails) {
				full_name = u.getName();
				full_address = u.getAddress();
				phone_number = u.getPassword();
				user_name = u.getUserName();
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// Labels 
	
		title = new JLabel("Welcome " + full_name);
		title.setBounds(50, 50, 250, 20);
	
	
		// TextFields
		
		// Adding it to the frame
	
		add(title);
	
		// Frame Settings
	
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	
	}

	
	

}
