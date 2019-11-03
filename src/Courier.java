
import java.util.*;

public class Courier {

    /**
     * Default constructor
     */
    public Courier() {
    	setCourierID();
    	setPrice();
    	setVehicle();
    }


    public int courierID;
    public int price;
    public int vehicle;


    public void setCourierID() {
    	Random random = new Random();
        int randomInteger = random.nextInt(9999);
        this.courierID = randomInteger;
    }

    public void setPrice() {
    	Random random = new Random();
        int randomInteger = random.nextInt(9999);
        this.price = randomInteger;
    }

    public void setVehicle() {
        // TODO implement here
    }

    public int getCourierID() {
        return this.courierID;
    }

    public int getPrice() {
        return this.price;
    }

    public void getVehicle() {
        // TODO implement here
    }

}