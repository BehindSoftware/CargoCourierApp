
public class main {

	public static void main(String [] args) {

		System.out.println("Welcome to CargoCourierApp!");
		
		CourierAdmin admin = new CourierAdmin();
		
		//if click take userID and Pass
		UserAccount client = new UserAccount(admin.createUserID(),admin.createPassword());


	}
}

