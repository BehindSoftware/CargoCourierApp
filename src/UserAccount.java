
import java.util.*;

public class UserAccount {

    /**
     * Default constructor
     */
    public UserAccount(int ID, int pass) {
    	this.userID = ID;
    	this.password = pass;
        System.out.println("userID : " + this.userID);
        System.out.println("password : " + this.password);

    }

    public int userID;
    public int password;
    public void send() {
        Consignment consignment = new Consignment();
        //enter size (tempsizevariable) and click add
        //consignment.productList.add(addProductToList(tempsizevariable));
    }

    public int addProductToList(int size) {
        Product product = new Product(size);
        return product.getProductID();
    }
    
    public void accept() {
        // TODO implement here
    }

    public void track() {
        // TODO implement here
    }

    public void search() {
        // TODO implement here
    }

    public int getUserID() {
        return this.userID;
    }

    public int getPassword() {
        return this.password;
    }

}