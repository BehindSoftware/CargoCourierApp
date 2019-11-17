import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

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
	FileReader fr;
	BufferedReader br;
	GsonBuilder builder;
	Gson gson;
	
	public TransactionHandler(String user) {
		this.user = user;
		
		try {
			builder = new GsonBuilder();
			builder.setPrettyPrinting();
			gson = builder.create();
			
			Product product = new Product();
			
			br = new BufferedReader(new FileReader("DB/Transactions.json"));
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
