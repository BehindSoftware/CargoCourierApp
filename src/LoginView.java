import javax.swing.*;

public class LoginView extends JFrame
{
	private JFrame fLogin 			 = new JFrame("Cargo Courier App - Login");
	private JLabel lUserName		 = new JLabel("User name: ");
	private JLabel lPassword		 = new JLabel("Password: ");
	private JTextArea tUserName		 = new JTextArea();
	private JPasswordField tPassword = new JPasswordField();
	private JButton loginButton		 = new JButton("Login");
	private int fLoginWidth 		 = 300;
	private int fLoginHeight 		 = 300;
	
	public LoginView()
	{
		this.fLogin = new JFrame("Cargo Courier App - Login");
		this.fLogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);                                                         
		this.fLogin.setSize(fLoginWidth, fLoginHeight);               
		this.fLogin.setLayout(null);                                  
		
		this.lUserName.setLocation(80, 70);
		this.lUserName.setSize(80, 20);
		
		this.lPassword.setLocation(80, 130);
		this.lPassword.setSize(80, 20);
		
		this.tUserName.setLocation(150, 70);
		this.tUserName.setSize(80, 20);
		
		this.tPassword.setLocation(150, 130);
		this.tPassword.setSize(80, 20);
		
		this.loginButton.setLocation(120, 180);
		this.loginButton.setSize(80, 20);
		
		this.fLogin.add(lUserName);
		this.fLogin.add(lPassword);
		this.fLogin.add(tUserName);
		this.fLogin.add(tPassword);
		this.fLogin.add(loginButton);
		
		this.fLogin.setVisible(true);
		
		//Container container = frameLogin.getContentPane();
		
		/*JPanel panelLogin = new JPanel();
		panelLogin.setBackground(Color.blue);
		panelLogin.setBounds(30, 30, 200, 300);
		
		JLabel lab_username = new JLabel("Username: ");
		JLabel lab_password = new JLabel("Password: ");
		
		JTextField txt_username = new JTextField(10);
		JTextField txt_password = new JTextField(10);
		
		panelLogin.add(lab_username);
		panelLogin.add(lab_password);
		panelLogin.add(txt_username);
		panelLogin.add(txt_password);
		frameLogin.getContentPane().add(panelLogin);
		
		*/
	}
	
}