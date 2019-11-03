
import java.util.*;

public class Courier {

    /**
     * Default constructor
     */
    public Courier() {
    	setCourierID();
    	//how can we calculate totalsize and pass to this function ? This will be designed.
    	//setVehicle(totalsize);
    	setPrice(this.getVehicle());
    }


    public int courierID;
    public int price;
    public int vehicle;


    public void setCourierID() {
    	Random random = new Random();
        int randomInteger = random.nextInt(9999);
        this.courierID = randomInteger;
    }

    public void setPrice(int vehicle) {
//    	Random random = new Random();
//        int randomInteger = random.nextInt(9999);
//        this.price = randomInteger;
    	if(vehicle == 1) {
    		this.price = 50;
    	}else if (vehicle == 2) {
    		this.price = 100;
    	}else if (vehicle == 3) {
    		this.price = 200;
    	}else {
    		this.price = 400;
    	}
    }

    public void setVehicle(int totalsize) {
    	//enum usage should be designed.
        if(totalsize<=10) {
        	this.vehicle =  1; // TypeOfShipment.MOTORCYCLE;
        }else if(10<totalsize && totalsize<=100) {
        	this.vehicle =  2; //TypeOfShipment.VAN;
        }else if(100<totalsize && totalsize<=500) {
        	this.vehicle =  3; //TypeOfShipment.TRUCK;
        }else {
        	this.vehicle =  4; //TypeOfShipment.TRAILER;
        }
    }

    public int getCourierID() {
        return this.courierID;
    }

    public int getPrice() {
        return this.price;
    }

    public int getVehicle() {
        return this.vehicle;
    }

}