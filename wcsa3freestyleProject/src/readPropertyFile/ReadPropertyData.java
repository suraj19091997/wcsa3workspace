package readPropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		String value = prop.getProperty("password");
		
		System.out.println(value);
	}

}
