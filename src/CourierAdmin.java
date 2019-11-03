
import java.util.*;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CourierAdmin extends UserAccount {

    /**
     * Default constructor
     */
    public CourierAdmin() {
    	
    	super(1111, 1234);
    	
    	String userAccountsDataXMLPath = "/home/vertex/eclipse-workspace-forjava/CargoCourierApp/records/Data.xml";
    	File userAccountsDataXML = new File(userAccountsDataXMLPath);

    	if(userAccountsDataXML.exists()!=true) {

    		try {
    			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
    			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
    			Document doc = docBuilder.newDocument();
    			
    		      Element rootElement = doc.createElement("ClientData");
    		      doc.appendChild(rootElement);
    		      
    		      Element staff = doc.createElement("userAccounts");
    		      rootElement.appendChild(staff);
    		      
    		      Attr attr = doc.createAttribute("title");
    		      attr.setValue("admin");
    		      staff.setAttributeNode(attr);
    		      
    		      Element userID = doc.createElement("userID");
    		      userID.appendChild(doc.createTextNode("1111"));
    		      staff.appendChild(userID);
    		      
    		      Element password = doc.createElement("password");
    		      password.appendChild(doc.createTextNode("1234"));
    		      staff.appendChild(password);
    		      
    		      TransformerFactory transformerFactory = TransformerFactory.newDefaultInstance();
    		      Transformer transformer = transformerFactory.newTransformer();
    		      DOMSource source = new DOMSource(doc);
    		      StreamResult result = new StreamResult(new File(userAccountsDataXMLPath));
    		      transformer.transform(source, result);
    		      
    		} catch (ParserConfigurationException e) {
    			e.printStackTrace();
    		} catch (TransformerConfigurationException e) {
                e.printStackTrace();
            } catch (TransformerException e) {
                e.printStackTrace();
            }

    	}else {
    		System.out.println("userAccountsDataXML exists on /home/vertex/eclipse-workspace-forjava/CargoCourierApp/records");
    	}
    	
    	
    }

    private void addXMLfile() {
       
    }

    protected int createUserID() {
    	Random random = new Random();
        int randomInteger = random.nextInt(9999);
        return randomInteger;
    }

    protected int createPassword() {
    	Random random = new Random();
        int randomInteger = random.nextInt(9999);
        return randomInteger;
    }

    protected void decideCourier() {
    	Courier courier = new Courier();
    	
    }

}