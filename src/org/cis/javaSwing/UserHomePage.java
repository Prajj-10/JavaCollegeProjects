/**
 * 
 */
package org.cis.javaSwing;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * 
 */
public class UserHomePage extends JFrame implements ActionListener {

	FetchData sql = new FetchData();

	List<User> userDetails = new ArrayList<User>();
	List<User> searchDetails = new ArrayList<User>();

	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;

	JFrame frame;

	// Labels Declaration

	JLabel title;
	JLabel name;
	JLabel details;
	JLabel address;
	JLabel phoneNumber;
	JLabel searchusername;

	// Searched User Name Detail Labels

	JLabel searchedName;
	JLabel searchedAddress;
	JLabel searchedNum;
	JLabel searchedUserName;
	JLabel searchedPassword;

	// TextField Declaration

	JTextField searchbox;

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
			for (User u : userDetails) {
				full_name = u.getName();
				full_address = u.getAddress();
				phone_number = u.getPhoneNumber();
				user_name = u.getUserName();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Labels

		title = new JLabel("Welcome " + user_name + " !");
		title.setBounds(50, 50, 250, 50);
		title.setFont(new Font("Times New Roman", Font.BOLD, 27));

		details = new JLabel("Here are your details : ");
		details.setBounds(50, 90, 250, 40);
		details.setFont(new Font("Times New Roman", Font.BOLD, 20));

		name = new JLabel("Name : " + full_name);
		name.setBounds(50, 110, 250, 50);

		address = new JLabel("Address : " + full_address);
		address.setBounds(50, 130, 250, 50);

		phoneNumber = new JLabel("Telephone Number : " + phone_number);
		phoneNumber.setBounds(50, 145, 250, 60);

		searchusername = new JLabel("Search user details by User Name : ");
		searchusername.setBounds(50, 180, 350, 40);
		searchusername.setFont(new Font("Times New Roman", Font.BOLD, 18));

		// TextFields

		searchbox = new JTextField();
		searchbox.setBounds(50, 215, 120, 20);
		searchbox.setFont(new Font("Times New Roman", Font.PLAIN, 16));

		// JButtons

		search = new JButton("Search");
		search.setBounds(50, 250, 95, 30);
		search.setFont(new Font("Times New Roman", Font.BOLD, 16));

		search.addActionListener(this);

		// Adding it to the frame

		add(title);
		add(details);
		add(name);
		add(address);
		add(phoneNumber);
		add(searchusername);
		add(searchbox);
		add(search);
		/*
		 * add(searchedName); add(searchedAddress); add(searchedNum);
		 * add(searchedUserName); add(searchedPassword);
		 */

		// Frame Settings

		setSize(400, 400);
		setLayout(null);
		setVisible(true);

	}

	private void searchUser() throws SQLException {
		String usernameSearched = searchbox.getText();
		System.out.println(usernameSearched);
		searchDetails = sql.getDatafromUsername(usernameSearched);
		for (User u1 : searchDetails) {
			
			JDialog infoBox = new JDialog(frame, "User Information");

			searchedName = new JLabel("<html> Name : " + u1.getName() + "<br> Address : " + u1.getAddress()
			+ "<br> Phone Number : " + u1.getPhoneNumber() + "<br> User Name : " + u1.getUserName() +
			"<br> Password : " + u1.getPassword() + "</html>");
			
			/*
			 * searchedName.setBounds(50, 270, 250, 50); searchedAddress.setBounds(50, 290,
			 * 250, 50); searchedNum.setBounds(50, 310, 250, 50);
			 * searchedUserName.setBounds(50, 330, 250, 50); searchedPassword.setBounds(50,
			 * 350, 250, 50);
			 */
			
			infoBox.add(searchedName);
			
			infoBox.setSize(200, 200);
			
			infoBox.setVisible(true);
			
			/*
			 * System.out.println(u1.getName()); System.out.println(u1.getAddress());
			 * System.out.println(u1.getPassword()); System.out.println(u1.getUserName());
			 * System.out.println(u1.getPhoneNumber());
			 * System.out.println(u1.getPassword());
			 */
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub
		if (e.getSource() == search) {
			try {
				searchUser();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

}
