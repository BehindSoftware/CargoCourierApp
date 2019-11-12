
import javax.swing.*;

public class CargoCourierApp
{
	//public static JFrame login(Dimension screenSize)
	//{
	//	JFrame fLogin;
	//	JLabel lUserName;
	//	JLabel lPassword;
	//	JTextArea tUserName;
	//	JPasswordField tPassword;
	//	JButton loginButton;
	//	int fLoginWidth = 300;
	//	int fLoginHeight = 300;
	//			
	//	fLogin = new JFrame("Cargo Courier App - Login");
	//	fLogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	//	
	//	fLogin.setSize(fLoginWidth, fLoginHeight);
	//	fLogin.setLayout(null);
	//	
	//	lUserName = new JLabel("User name: ");
	//	lUserName.setLocation(80, 70);
	//	lUserName.setSize(80, 20);
	//	
	//	lPassword = new JLabel("Password: ");
	//	lPassword.setLocation(80, 130);
	//	lPassword.setSize(80, 20);
	//	
	//	tUserName = new JTextArea();
	//	tUserName.setLocation(150, 70);
	//	tUserName.setSize(80, 20);
	//	
	//	tPassword = new JPasswordField();
	//	tPassword.setLocation(150, 130);
	//	tPassword.setSize(80, 20);
	//	
	//	loginButton = new JButton("Login");
	//	loginButton.setLocation(120, 180);
	//	loginButton.setSize(80, 20);
	//	
	//	fLogin.add(lUserName);
	//	fLogin.add(lPassword);
	//	fLogin.add(tUserName);
	//	fLogin.add(tPassword);
	//	fLogin.add(loginButton);
	//	
	//	fLogin.setVisible(true);
	//	
	//	return fLogin;
	//}
	
	public static void main(String[] args)
	{
		LoginView loginView = new LoginView();
		
		//JFrame fLogin = login(screenSize);
		
		
		/* There are two frames:
		 * 	Login frame -> Where user enters user name and password
		 * 	User frame  -> Where all other operations occur
		 */
		//JFrame fLogin = new JFrame("Cargo Courier App - Login");
		//JFrame fUser = new JFrame("Cargo Courier App - Overview");
		
		// Get size of current screen and adjust frames referring to it
		
		
		
		/*
		fUserWidth  = (int)(screen_size.getWidth()  /2);
		fUserHeight = (int)(screen_size.getHeight() /2);
		fUser.setSize(fUserWidth, fUserHeight);
		
		*/
		
		
		//CCAView loginFrame = new CCAView();
		//loginFrame.setVisible(true);
		
		/*GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
	    Rectangle bounds = env.getMaximumWindowBounds();
		
	    System.out.println("Screen Bounds: " + bounds);
		*/
		
		// Adjusting the menu bars
		//JMenuBar mb = new JMenuBar();
        //JMenu m1 = new JMenu("FILE");
        //JMenu m2 = new JMenu("Help");
		
		
		
		//JTabbedPane tabbed_pane = new JTabbedPane();
		
		
		/*CourierAdmin admin = new CourierAdmin();
		
		//if click take userID and Pass
		UserAccount client = new UserAccount(admin.createUserID(),admin.createPassword());
		
		//if click login (take userID and password, then check from XML file )
		
		
		//if login and click send
		client.send();
        
		//enter a product with size
		client.addProductToList(55);
		
		//ordered ---> paid (courier admin selects and assigns courier)
		admin.decideCourier();
		*/
	}
}

