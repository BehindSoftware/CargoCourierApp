
public class CargoCourierApp {

	/**
	 * Launch the application.
	 */
	public static void main(String [] args) {
		
		UserHandler userHandler = new UserHandler();
		LoginView loginView = new LoginView(userHandler);
		
		//OverView overView = new OverView();
		//CargoCourierView view = new CargoCourierView();
		//CargoModel model = new CargoModel(view);
		//CargoController controller = new CargoController(view, model);
		
	}
	
	/**
	 * Change frame after login successfully.
	 */
	public static void goToOverview(String username) {
		TransactionHandler trHandler = new TransactionHandler(username);
		OverView overView = new OverView(trHandler);
	}
}

