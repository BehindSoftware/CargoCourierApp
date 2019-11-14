import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CargoCourierView {

	private JFrame frame;
	private JTextField userID;
	private JTextField password;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		CargoCourierView window = new CargoCourierView();
		window.frame.setVisible(true);
		
		System.out.println("Welcome to CargoCourierApp!");
		
		CourierAdmin admin = new CourierAdmin();
		
		//if click take userID and Pass
		UserAccount client = new UserAccount(admin.createUserID(),admin.createPassword());
		
		//if click login (take userID and password, then check from XML file )
		
		
		//if login and click send
		client.send();

		//enter a product with size
		client.addProductToList(55);
		
		//ordered ---> paid (courier admin selects and assigns courier)
		admin.decideCourier();


	}
	
	
	
	/**
	 * Create the application.
	 */
	public CargoCourierView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.GRAY);
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUserid = new JLabel("UserID");
		lblUserid.setBounds(55, 90, 66, 15);
		frame.getContentPane().add(lblUserid);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(55, 117, 66, 15);
		frame.getContentPane().add(lblPassword);
		
		userID = new JTextField();
		userID.setBounds(159, 88, 124, 19);
		frame.getContentPane().add(userID);
		userID.setColumns(10);
		
		password = new JTextField();
		password.setBounds(159, 115, 124, 19);
		frame.getContentPane().add(password);
		password.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(userID.getText().isEmpty() || password.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please enter userID and password!");
				}else if(userID.getText().equals("1111") && password.getText().equals("12345")) {
					JOptionPane.showMessageDialog(null, "Welcome Admin!");
				}else {
					System.out.println("There is no authentication");
					JOptionPane.showMessageDialog(null, "Welcome Client!");
					menuScreen menu = new menuScreen();
					menu.setVisible(true);
				}
				
			}
		});
		btnLogin.setBounds(159, 157, 124, 25);
		frame.getContentPane().add(btnLogin);
	}
}
