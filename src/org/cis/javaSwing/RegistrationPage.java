/**
 * 
 */
package org.cis.javaSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * 
 */
public class RegistrationPage extends JFrame implements ActionListener{
	
	// Creates an object of FetchData Class and initializes the database connection.
	
	FetchData sql = new FetchData();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
		JFrame frame;
	
		// Labels Declaration 
	
		JLabel title;
		JLabel name;
		JLabel address;
		JLabel number;
		JLabel username;
		JLabel password;
		
		// TextField Declaration
		
		JTextField nameField;
		JTextField addressField;
		JTextField numberField;
		JTextField UserNameField;
		JPasswordField passwordField;
		
		// Button Declaration 
		
		JButton register;
		JButton clear;
		JButton goBack;
		
		// Check Box
		
		JCheckBox check;
		
		public RegistrationPage() {
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			// Labels 
		
			name = new JLabel("Name");
			name.setBounds(50, 50, 250, 20);
			
			address = new JLabel("Address");
			address.setBounds(50, 80, 250, 20);
			
			number = new JLabel("Phone Number");
			number.setBounds(50, 110, 250, 20);
			
			username = new JLabel("Username");
			username.setBounds(50, 140, 250, 20);
		
			password = new JLabel("Password");
			password.setBounds(50, 170, 250, 20);
		
			title = new JLabel("Registration Page");
			title.setBounds(150, 20, 250, 20);
		
			// TextFields
		
			nameField = new JTextField();
			nameField.setBounds(200, 50, 150, 20);
			
			addressField = new JTextField();
			addressField.setBounds(200, 80, 150, 20);
			
			numberField = new JTextField();
			numberField.setBounds(200, 110, 150, 20);
			
			UserNameField = new JTextField();
			UserNameField.setBounds(200, 140, 150, 20);
		
			passwordField = new JPasswordField();
			passwordField.setBounds(200, 170, 150, 20);
			passwordField.setEchoChar('*');
		
			// Buttons
		
			register = new JButton("Register");
			register.setBounds(70, 220, 95, 30);
		
			clear = new JButton("Clear");
			clear.setBounds(200, 220, 95, 30);
			
			goBack = new JButton("Go Back");
			goBack.setBounds(135, 260, 95, 30);
			
			// Check Box
			
			check = new JCheckBox("Show Password");
			check.setBounds(200, 190, 150, 20);
			
		
			
			// Adding it to the frame
		
			add(name);
			add(address);
			add(number);
			add(username);
			add(password);
			add(title);
		
			add(nameField);
			add(addressField);
			add(numberField);
			add(UserNameField);
			add(passwordField);
		
			add(register);
			add(clear);
			add(goBack);
			add(check);
			
			register.addActionListener(this);
			clear.addActionListener(this);
			goBack.addActionListener(this);
			check.addActionListener(this);
		
			// Frame Settings
		
			setSize(400, 400);
			setLayout(null);
			setVisible(true);
		}
		
		private void RegisterUser() {
			String name = nameField.getText();
			String address = addressField.getText();
			String number = numberField.getText();
	        String username = UserNameField.getText();
	        String password = passwordField.getText();

	        if(name.isEmpty() || address.isEmpty() || number.isEmpty() || username.isEmpty() || password.isEmpty()) {
	        	
	            JOptionPane.showMessageDialog(frame, "Please fill in all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
	            return;
	        }
	        else {	 
	        	// TODO: Add your user registration logic here (e.g., save to database)
	        	// Adds user to the registration table
	        	sql.registerUsers(name, address, number, username, password);
	        	
	        	// Adds the same necessary values to the login table
	        	
	        	sql.addLoginDetails(username, password);
	        	
	        	JOptionPane.showMessageDialog(frame, "Registration successfully done!", "Success", JOptionPane.INFORMATION_MESSAGE);
		        new LoginPage();
		        dispose();
	        }    
	    }
		
		private void ClearTexts() {
			nameField.setText(null);
			addressField.setText(null);
			numberField.setText(null);
			UserNameField.setText(null);
			passwordField.setText(null);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == register) {
				RegisterUser();
			}
			if(e.getSource() == clear) {
				ClearTexts();
			}
			if(e.getSource() == goBack) {
				new LoginPage();
				dispose();
			}
			if(check.isSelected()){
				passwordField.setEchoChar((char)0);
			}
			else {
				passwordField.setEchoChar('*');
			}
			
		}

}
