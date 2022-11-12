package readPropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Flib {

	public String readPropertData(String propPath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);

		Properties prop = new Properties();

		prop.load(fis);
		String value = prop.getProperty(key);
		
		return value;
	}

}
