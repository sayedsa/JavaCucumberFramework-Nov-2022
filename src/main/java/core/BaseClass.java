package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.apache.log4j.PropertyConfigurator;

import java.util.Properties;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;

public class BaseClass {

	public static WebDriver driver;
	public static Properties properties;
	private String userDirectory = System.getProperty("user.dir");
	private String ppfile = ".\\src\\test\\resources\\ProjectData\\project.properties";
	private String pathtoPP = userDirectory + ppfile;
	//public static Logger logger = LogManager.getLogger(BaseClass.class);
	public static Logger logger;
	
	public BaseClass() {
		try {
			BufferedReader reader;
			reader = new BufferedReader(new FileReader(pathtoPP));
			properties = new Properties();

			try {
				properties.load(reader);
				reader.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		logger = Logger.getLogger("logger file");
		PropertyConfigurator.configure(".\\src\\test\\resources\\ProjectData\\Log4j2.properties");
		
	}
	public static String getBrowserName() {
	String browserName = properties.getProperty("browser");
	return browserName;
	}
	public static String getURL() {
	String url = properties.getProperty("url");
	return url;
	}
	
	public static long getImplicitWait() {
	String implicitWait = properties.getProperty("implicitlyWait");
	return Long.parseLong(implicitWait);
	
	}
	
	public static long getPageLoadTimeOut() {
	String pageLoadTimeOut =	properties.getProperty("pageLoadTimeOut");
	return Long.parseLong(pageLoadTimeOut);
		
	}
	public static void initializeDriver() {
		driver.get(getURL());
	}
	public static void tearDown() {
		driver.close();
		driver.quit();
	}
}






