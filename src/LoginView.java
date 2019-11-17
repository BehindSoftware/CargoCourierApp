import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView {
	JFrame frLogin;
	JPanel paLogin;
	JButton buLogin;
	JLabel laUserName;
	JTextField userName;
	JLabel laPassword;
	JPasswordField password;
	UserHandler userHandler;
	
	public LoginView(UserHandler userHandler) {
		this.userHandler = userHandler;
		
		frLogin = new JFrame();
		paLogin = new JPanel();
		buLogin = new JButton("Login");
		laUserName = new JLabel("Username:");
		userName = new JTextField(10);
		laPassword = new JLabel("Password");
		password = new JPasswordField(10);
		
		laUserName.setBounds(55, 90, 70, 15);
		laPassword.setBounds(55, 120, 70, 15);
		userName.setBounds(160, 90, 125, 20);
		password.setBounds(160, 120, 125, 20);
		buLogin.setBounds(160, 160, 125, 25);
		
		paLogin.setLayout(null);
		paLogin.setBackground(Color.lightGray);
		paLogin.add(laUserName);
		paLogin.add(userName);
		paLogin.add(laPassword);
		paLogin.add(password);
		paLogin.add(buLogin);
		
		frLogin.setTitle("Login");
		frLogin.setBounds(100, 100, 350, 300);
		frLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frLogin.setResizable(false);
		frLogin.add(paLogin);
		
		frLogin.setVisible(true);
		
		buLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String usr = userName.getText();
				String pwd = new String(password.getPassword());
				
				if (userHandler.checkAuthentication(usr, pwd) == true) {
					frLogin.setVisible(false);
					CargoCourierApp.goToOverview(usr);
				}
					
			}
		});
	}
}
