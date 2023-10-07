/**
 * 
 */
package org.cis.javaSwing;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * 
 */
public class LoginPage extends JFrame implements ActionListener, ChangeListener{
	
	// Initialize Database Connection with the object of FetchData.
	
	FetchData sql = new FetchData();

	List<User> userDetails = new ArrayList<User>();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JFrame frame;
	
	// Labels Declaration 
	
	JLabel title;
	JLabel userName;
	JLabel password;
	
	// TextField Declaration
	
	JTextField uNameTextField;
	JPasswordField passwordField;  // PasswordField for passwords
	
	// Button Declaration 
	
	JButton login;
	JButton clear;
	JButton register;
	
	// Check Box Field for Passwords
	
	JCheckBox tick;
	
	public LoginPage() {
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		// Labels 
	
		userName = new JLabel("Username");
		userName.setBounds(50, 50, 250, 20);
	
		password = new JLabel("Password");
		password.setBounds(50, 80, 250, 20);
	
		title = new JLabel("Login Page");
		title.setBounds(150, 20, 250,20);
	
		// TextFields
	
		uNameTextField = new JTextField();
		uNameTextField.setBounds(200, 50, 150, 20);
	
		passwordField = new JPasswordField();
		passwordField.setBounds(200, 80, 150, 20);
		passwordField.setEchoChar('*');
	
		// Buttons
	
		login = new JButton("Login");
		login.setBounds(70, 140, 95, 30);
	
		clear = new JButton("Clear");
		clear.setBounds(200, 140, 95, 30);
		
		register = new JButton("Register");
		register.setBounds(140, 190, 95, 30);
		
		// Check Box 
		
		tick = new JCheckBox("Show Password");
		tick.setBounds(200, 100, 150, 20);
		
	
		// Action Listeners 
		
		register.addActionListener(this);
		login.addActionListener(this);
		clear.addActionListener(this);
		
		clear.addChangeListener(this);
		
		tick.addActionListener(this);
		
		// Adding it to the frame
	
		add(userName);
		add(password);
		add(title);
	
		add(uNameTextField);
		add(passwordField);
	
		add(login);
		add(clear);
		add(register);
		
		add(tick);
	
		// Frame Settings
	
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	
	}
	
	private void LoginUser() {
        String username = uNameTextField.getText();
        String password = passwordField.getText();

        if(username.isEmpty() || password.isEmpty()) {
        	
            JOptionPane.showMessageDialog(frame, "Please fill in all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else
			try {
				if(sql.validateUser(username, password) == true) {
					JOptionPane.showMessageDialog(frame, "Login successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
					new UserHomePage(username, password);
					dispose();
					// userDetails = sql.getUserData(username, password);
				}
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(frame, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        // TODO: Add your user registration logic here (e.g., save to database)

        
        // System.out.println(password);
    }
	
	private void clearTexts() {
		uNameTextField.setText(null);
		passwordField.setText(null);
	}
	
	
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			new LoginPage();

	}
	
	
	

	// Action performed for register button
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == register) {
			new RegistrationPage();
			dispose(); 
		}
		if(e.getSource() == login) {
			LoginUser();
		}
		if(e.getSource() == clear) {
			clearTexts();
		}
		if(tick.isSelected()){
			passwordField.setEchoChar((char)0);
		}
		else {
			passwordField.setEchoChar('*');
		}
		
		
			
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
		
	}

}
