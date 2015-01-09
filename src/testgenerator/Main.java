package testgenerator;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class Main {

	public static void main(String[] args) throws JAXBException, FileNotFoundException, ParserConfigurationException, SAXException, IOException{

	Parser p = new Parser();

	QuestonFilter qf = new QuestonFilter(p.paraseFromXMLToObject());
	qf.printData(qf.getQuestions(2, ""));
}
}
