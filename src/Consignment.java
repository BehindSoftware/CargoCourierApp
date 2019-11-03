
import java.util.*;

enum StateOfShipment {
	ORDERED,
	PAID,
	LOADED,
	INTRANSFER,
	RECEIVED
}

enum TypeOfShipment{
	MOTORCYCLE,
	VAN,
	TRUCK,
	TRAILER
}

public class Consignment {

    /**
     * Default constructor
     */
    public Consignment() {
    	
    	setConsignmentID();
    	this.consignmentID = getConsignmentID();
    	
    	this.productList = new ArrayList<Integer>();
     	
    }

    public int consignmentID;
    public List<Integer> productList;
    public int shipmentState;

    public void setConsignmentID() {
    	Random random = new Random();
        int randomInteger = random.nextInt(9999);
        this.consignmentID = randomInteger;
    }

    public void setShipmentState() {
        // TODO implement here
    }

    public int getConsignmentID() {
        return this.consignmentID;
    }

    public int getShipmentState() {
        return shipmentState;
    }

}