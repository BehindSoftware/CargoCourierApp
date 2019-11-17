import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CargoCourierView {
	
	JFrame frLogin 			= new JFrame();
	JPanel paLogin 			= new JPanel(new GridLayout(2,2));
	JButton buLogin 		= new JButton("Login");
	JLabel laUserName 		= new JLabel("UserID");
	JTextField userName		= new JTextField();
	JLabel laPassword 		= new JLabel("Password");
	JPasswordField password = new JPasswordField();
	
	/**
	 * Create the application.
	 */
	public CargoCourierView() {
		
		initialize();
	}
	
	/**
	 * Initialize the contents of the frLogin.
	 */
	private void initialize() {
		
		frLogin.getContentPane().setLayout(null);
		frLogin.setBackground(Color.GRAY);
		frLogin.getContentPane().setBackground(Color.GRAY);
		frLogin.setBounds(100, 100, 450, 300);
		frLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblUserid = new JLabel("UserID");
		lblUserid.setBounds(55, 90, 66, 15);
		frLogin.getContentPane().add(lblUserid);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(55, 117, 66, 15);
		frLogin.getContentPane().add(lblPassword);
		
		userName = new JTextField();
		userName.setBounds(159, 88, 124, 19);
		frLogin.getContentPane().add(userName);
		userName.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(159, 115, 124, 19);
		frLogin.getContentPane().add(password);
		password.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(userName.getText().isEmpty() || password.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please enter userName and password!");
				}else if(userName.getText().equals("1111") && password.getText().equals("12345")) {
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
		frLogin.getContentPane().add(btnLogin);
	}

	//public static void main(String[] args) {

		/*CargoCourierView window = new CargoCourierView();
		window.frLogin.setVisible(true);
		
		System.out.println("Welcome to CargoCourierApp!");
		
		CourierAdmin admin = new CourierAdmin();
		
		//if click take userName and Pass
		UserAccount client = new UserAccount(admin.createUserID(),admin.createPassword());
		
		//if click login (take userName and password, then check from XML file )
		
		
		//if login and click send
		client.send();

		//enter a product with size
		client.addProductToList(55);
		
		//ordered ---> paid (courier admin selects and assigns courier)
		admin.decideCourier();
		*/

	//}

	
}
