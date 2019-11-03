
public class CargoCourierApp {

	public static void main(String [] args) {

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
}

