
import java.util.*;

public class Product {
	int id;
	String name;
	int size;

    /**
     * Default constructor
     */
    public Product() {
    	
    	setProductID();
    	this.productSize = size;
    }

    public int productID;
    public int productSize;
    
    public void setProductID() {
    	Random random = new Random();
        int randomInteger = random.nextInt(9999);
        this.productID = randomInteger;
    }

    public int getProductID() {
        return productID;
    }

    public int getProductSize() {
        return productSize;
    }

}