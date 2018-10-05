package com.jala.framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.jala.pageobjects.PageActions;
import com.jala.pageobjects.PageObjects;

public class BaseTest {
public static WebDriver driver =null;


public PageActions pageObj;
public String adminusername;
public String adminpassword;
public String browserwindow=null;
public String browserURL=null;
public static String URL = "http://magnus2.jalatechnologies.com/";
public static String driverPath = "C:\\Users\\Dilip Kumar Das\\Desktop\\JALA_Technologies\\JAVA\\Siva_project\\chromedriver.exe";
Logger log = Logger.getLogger("devpinoyLogger");

	
	@BeforeClass
	public void setupApplication() throws IOException
	{
		Reporter.log("=====Browser Session Started=====", true);
	
        
			
			

			
			Reporter.log("=====Application Started=====", true);
			
			System.out.println("Application launched successfully");

			// Page Object initilization
			pageObj = new PageActions(driver);
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilip Kumar Das\\Desktop\\JALA_Technologies\\JAVA\\Siva_project\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://magnus2.jalatechnologies.com/");
			
			
		
	}	
		
		
		
	
	
	public void loginAdmin() {

		Properties prop= new Properties();
		
		InputStream input = null;

		try {

			input = new FileInputStream("config.properties");

			// load a properties file
			prop.load(input);
			System.out.println(prop.getProperty("adminusername"));
			System.out.println(prop.getProperty("adminpassword"));
			
			
			log.info("*************** Read values from config file **************");
		}
	catch (IOException ex) {
		ex.printStackTrace();
	
	}	
	}
	
	@AfterClass
	public void closeApplication()
	{
		//driver.quit();
		Reporter.log("=====Browser Session End=====", true);
		
	}
	
	
	

}
