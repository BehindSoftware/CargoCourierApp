import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class UserHandler {
	private String pathXML = "DB/Users.xml";
	private File fUserXML;
	private DocumentBuilderFactory docFactory;
	private DocumentBuilder docBuilder;
	private Document doc;
	private NodeList nList;
	
	public UserHandler() {
		try {
			fUserXML = new File(pathXML);
			docFactory = DocumentBuilderFactory.newInstance();
			docBuilder = docFactory.newDocumentBuilder();
			doc = docBuilder.parse(fUserXML);
			doc.getDocumentElement().normalize();
			
			nList = doc.getElementsByTagName("user");
		}
		catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean checkAuthentication(String username, String password) {
		boolean retValue = false;
		
		for (int i = 0; i < nList.getLength(); i++) {
			Node nNode = nList.item(i);
			Element e = (Element) nNode;
			
			if (getUsername(e).toString().equals(username) &&
					getPassword(e).toString().equals(password)) {
				retValue = true;
			}
		}
		return retValue;
	}
	
	public String getUsername(Element e) {
		return e.getElementsByTagName("username").item(0).getTextContent();
	}
	
	public String getPassword(Element e) {
		return e.getElementsByTagName("password").item(0).getTextContent();
	}
	
	// Following ones can be used to add, delete or modify users
	// Only admin can use these methods, probably they will be deleted
	public void setUsername() {
		
	}
	
	public void setPassword() {
		
	}

}
