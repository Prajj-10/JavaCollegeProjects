/**
 * 
 */
package org.cis.javaSwing;

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
	
	public UserHomePage() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		// Labels 
	
		title = new JLabel("Welcome");
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
