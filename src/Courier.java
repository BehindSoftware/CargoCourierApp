/*
import java.util.*;

public class Courier {

    /**
     * Default constructor
     
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

    	if(vehicle == TypeOfShipment.MOTORCYCLE.getValue()) {
    		this.price = 50;
    	}else if (vehicle == TypeOfShipment.VAN.getValue()) {
    		this.price = 100;
    	}else if (vehicle == TypeOfShipment.TRUCK.getValue()) {
    		this.price = 200;
    	}else {
    		this.price = 400;
    	}
    }

    public void setVehicle(int totalsize) {
        if(totalsize<=10) {
        	this.vehicle = TypeOfShipment.MOTORCYCLE.getValue();
        }else if(10<totalsize && totalsize<=100) {
        	this.vehicle =  TypeOfShipment.VAN.getValue();
        }else if(100<totalsize && totalsize<=500) {
        	this.vehicle =  TypeOfShipment.TRUCK.getValue(); 
        }else {
        	this.vehicle = TypeOfShipment.TRAILER.getValue();
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

}*/