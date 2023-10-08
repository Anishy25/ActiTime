package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CreateMethod {
	public String readDataFromProperty(String Key) throws IOException {
		
	FileInputStream fis = new FileInputStream("./Testdata/Common data.property");
	Properties p = new Properties();
	p.load(fis);
	String value = p.getProperty(Key);
	return value;
	
	}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		CreateMethod CM = new CreateMethod();
		 String URL = CM.readDataFromProperty("url");
		 String UN = CM.readDataFromProperty("Username");
			String Pwd =CM.readDataFromProperty("password");
		
			System.out.println(URL);
			System.out.println(UN);
			System.out.println(Pwd);
		
		
	}		


}
