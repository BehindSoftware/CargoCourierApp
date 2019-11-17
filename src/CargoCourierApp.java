
public class CargoCourierApp {

	/**
	 * Launch the application.
	 */
	public static void main(String [] args) {
		
		UserHandler userHandler = new UserHandler();
		LoginView loginView = new LoginView(userHandler);
	}
	
	/**
	 * Change frame after login successfully.
	 */
	public static void goToOverview(String username) {
		
		TransactionHandler trHandler = new TransactionHandler(username);
		OverView overView = new OverView(trHandler);
	}
}

