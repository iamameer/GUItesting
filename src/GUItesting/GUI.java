package GUItesting;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.util.regex.*;


public class GUI {

	
	
	
	private JFrame frame;
	private JTextField UserNameInput;
	private JTextField EmailInput;
	private JPasswordField passwordInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	 public static void infoBox(String infoMessage, String titleBar)
	    {
	        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
	    }
	
	 
	 
	 

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 442, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		UserNameInput = new JTextField();
		UserNameInput.setBounds(147, 108, 159, 37);
		frame.getContentPane().add(UserNameInput);
		UserNameInput.setColumns(10);
		
		EmailInput = new JTextField();
		EmailInput.setColumns(10);
		EmailInput.setBounds(147, 180, 159, 37);
		frame.getContentPane().add(EmailInput);
		
		JLabel lblUsername = new JLabel("UserName:");
		lblUsername.setBounds(66, 119, 54, 15);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(66, 191, 54, 15);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(66, 265, 54, 15);
		frame.getContentPane().add(lblPassword);
		
		
		passwordInput = new JPasswordField();
		passwordInput.setBounds(147, 262, 159, 37);
		frame.getContentPane().add(passwordInput);
		
	
		///GUI Code start from here
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				
				if (UserNameInput.getText().isEmpty() == true ||
				    EmailInput.getText().isEmpty()== true || 
				    passwordInput.getPassword().length == 0) {
					
					infoBox("Please fill up all info!","Error");
				}
				else if (UserNameInput.getText().length()>= 6) {
					
					infoBox("UserName error!","Error");  			
					
				}
			
				else {
					
					infoBox("Sign Up Sucess!","Message");
				}
				
			}
		});
		btnSignUp.setBounds(180, 340, 93, 23);
		frame.getContentPane().add(btnSignUp);
		
		
	}
}
