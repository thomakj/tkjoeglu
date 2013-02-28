package network.webpage_readers;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.*;

import org.w3c.dom.Document;
import org.w3c.dom.*;

public class XMLReader {
	public void reader(){
		try {

			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();

			URL xmlUrl = new URL("http://html3.scribdassets.com/77hm2p0ytc1bjjlx/pages/19-001fb91a19.jsonp");
			InputStream in = xmlUrl.openStream();
			Document doc = docBuilder.parse(in);

			// normalize text representation
			doc.getDocumentElement ().normalize ();
			
			System.out.println(doc.toString());

			NodeList listOfPersons = doc.getElementsByTagName("GposResponse");

			for(int s=0; s<listOfPersons.getLength() ; s++){
				Node firstPersonNode = listOfPersons.item(s);
				if(firstPersonNode.getNodeType() == Node.ELEMENT_NODE){

					Element firstPersonElement = (Element)firstPersonNode;
					NodeList firstNameList = firstPersonElement.getElementsByTagName("geoLongitude");
					Element firstNameElement = (Element)firstNameList.item(0);

					NodeList textFNList = firstNameElement.getChildNodes();
					String geoLong = textFNList.item(0).getNodeValue().toString();
					System.out.println("geo long : " + geoLong);

					NodeList lastNameList = firstPersonElement.getElementsByTagName("geoLatitude");
					Element lastNameElement = (Element)lastNameList.item(0);

					NodeList textLNList = lastNameElement.getChildNodes();
					String geoLat = textLNList.item(0).getNodeValue().toString();
					System.out.println("geo lat : " + geoLat);
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new XMLReader();
	}

}