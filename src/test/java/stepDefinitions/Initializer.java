package stepDefinitions;

import java.time.Duration;

import org.junit.Before.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



import core.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Initializer extends BaseClass {

	@Before
	public void beforeHooks() {
		
		BaseClass.getBrowserName();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		BaseClass.getURL();
	/*
		if (BaseClass.getBrowserName().equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (BaseClass.getBrowserName().equals("IE")) {

			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else if (BaseClass.getBrowserName().equals("FF")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}
*/
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(45));
	}

	@After
	public void afterHooks() {

		BaseClass.tearDown();

	}
}
