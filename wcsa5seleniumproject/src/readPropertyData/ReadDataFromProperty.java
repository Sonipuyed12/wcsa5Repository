package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
		
		//browser
		FileInputStream fis = new FileInputStream("./data/config.properties");

		////create a obj of properties class
		Properties prop = new Properties();

		//make file ready for read

		prop.load(fis);

		//read the perticular property

		String data = prop.getProperty("Browser");

		System.out.println(data);

		//url

		//FileInputStream fis1 = new FileInputStream("./data/config.properties");

		////create a obj of properties class
		//Properties prop1 = new Properties();

		//make file ready for read

		//prop.load(fis1);

		//read the perticular property

		//String data1 = prop.getProperty("Url0");

		//System.out.println(data1);	
	}

}
