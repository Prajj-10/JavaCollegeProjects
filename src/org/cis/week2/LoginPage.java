/**
 * 
 */
package org.cis.week2;

import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 */
public class LoginPage extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField uNameTextField;
	JTextField passwordField;
	JLabel userName;
	JLabel password;
	JButton login;
	JButton cancel;
	
public LoginPage() {
	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	uNameTextField = new JTextField();
	uNameTextField.setBounds(200, 50, 150, 20);
	
	passwordField = new JTextField();
	passwordField.setBounds(200, 80, 150, 20);
	
	userName = new JLabel("Username");
	userName.setBounds(50, 50, 250, 20);
	
	password = new JLabel("Password");
	password.setBounds(50, 80, 250, 20);
	
	login = new JButton("Login");
	login.setBounds(70, 110, 95, 30);
	
	cancel = new JButton("Cancel");
	cancel.setBounds(200, 110, 95, 30);
	
	add(uNameTextField);
	add(passwordField);
	add(userName);
	add(password);
	add(login);
	add(cancel);
	
	
	
	setSize(400, 400);
	setLayout(null);
	setVisible(true);
	
}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginPage();

	}

}
