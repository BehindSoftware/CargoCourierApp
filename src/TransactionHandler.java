import com.google.gson.*;

enum StateOfShipment {
	ORDERED,
	PAID,
	LOADED,
	INTRANSFER,
	RECEIVED;
}

enum Vehicle {
	MOTORCYCLE,
	VAN,
	TRUCK,
	TRAILER;
}

public class TransactionHandler {
	String user;
	Gson gson;
	GsonBuilder gBuilder;
	JsonObject obj;
	
	public TransactionHandler(String user) {
		this.user = user;
		gson = new Gson();
	}
}
