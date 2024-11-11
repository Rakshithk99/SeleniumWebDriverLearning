package day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\config.properties");
		prop.load(file);
		
		String appurl = prop.getProperty("appurl");
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		String orderid = prop.getProperty("orderid");
		String custid = prop.getProperty("234");
		
		System.out.println(appurl+"\t"+email+"\t"+password+"\t"+orderid+"\t"+custid);
		
		//Reading all keys from properties file
		Set<String> keys = prop.stringPropertyNames();
		System.out.println(keys);
		
		Set<Object> keys2 = prop.keySet();
		System.out.println(keys2);
		
		//Reading all the values from properties file
		Collection<Object> values = prop.values();
		System.out.println(values);
		
		file.close();
	}

}
