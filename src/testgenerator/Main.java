package testgenerator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
		
		File xmlFile = new File("test.xml");
		InputStream is = new FileInputStream(xmlFile);
		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLStreamReader reader = factory.createXMLStreamReader(is);
		while(reader.hasNext())
		{
		    if(reader.hasText())
		    {
		        System.out.println(reader.getText());
		    }
		    reader.next();
		}
	}

}
