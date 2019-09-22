package FileUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	
	static FileInputStream fin;
	static Properties prop;
	public static String getProperty(String key) {
		String value=null;
		try {
			fin=new FileInputStream("Input/ObjectRepository.properties");
			prop=new Properties();
			prop.load(fin);
			value=prop.getProperty(key);
			
		} catch (FileNotFoundException e) {
			System.err.println("Unable to open object Repository");
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return value;
		
	}
	public static String getProperty(String key,String Filepath) {
		String value=null;
		try {
			fin=new FileInputStream(Filepath);
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open");
			e.printStackTrace();
		}
		return value;
		

	}
}
