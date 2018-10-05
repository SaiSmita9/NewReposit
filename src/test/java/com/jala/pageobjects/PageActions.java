package com.jala.pageobjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageActions extends PageObjects {

	Logger log = Logger.getLogger("devpinoyLogger");

	public PageActions(WebDriver driver) {
		super(driver);
	}

	/**
	 * Method is to login to the application
	 * 
	 * @author JALA Technologies
	 * @param ele
	 * @param msg
	 */


	/**
	 * Method is to click on a web element
	 * 
	 * @author JALA Technologies
	 * @param ele
	 * @param msg
	 */
	public void click(WebElement ele, String msg) {
		System.out.println("In click method");
		ele.click();
		
		log.info("Clicked on "+msg);

	}

	/**
	 * Method is type text in the Text Box or Text Area Date: 11-Apr-2018
	 * 
	 * @param ele
	 * @param msg
	 */

	public void type(WebElement ele, String msg) {
		System.out.println("In type method");
		ele.clear();
		ele.sendKeys(msg);
		log.info("successfully entered the value  "+msg);
		if(msg.equals("admin")) {
			log.info("login successful");
		}
		else {
			log.info("login fail");
		}


	}
	
	public void typing(WebElement ele, String msg) {
		System.out.println("In type method");
		ele.clear();
		ele.sendKeys(msg);
		log.info("successfully entered the value  "+msg);
	}
	
	
	public void selectCheck(WebElement ele, String msg) {
		System.out.println("In type method");
		ele.clear();
		ele.sendKeys(msg);
		log.info("successfully entered the  "+msg);
		
	}

	public String check_text_value(WebElement ele) {
		System.out.println("read the text");
		String text=ele.getText();
		
		log.info("successfully read the value " +text);
		return text;
	}

	
	/**
	 * Method is to login as admin
	 * 
	 * @author JALA Technologies
	 * @param ele
	 * @param msg
	 */
	
	
	public void loginAdmin() {

		Properties prop= new Properties();
		
		InputStream input = null;

		try {

			input = new FileInputStream("config.properties");

			// load a properties file
			prop.load(input);
			System.out.println(prop.getProperty("adminusername"));
			System.out.println(prop.getProperty("adminpassword"));
			click(admin_link, " Admin link");
			typing(admin_login_username_txt,prop.getProperty("adminusername"));
			typing(admin_login_password_txt,prop.getProperty("adminpassword"));
			Thread.sleep(3000);
			click(admin_login_button,"Clicking the Login button");
			
			
			log.info("*************** Read values from config file **************");
		}
	catch (IOException | InterruptedException ex) {
		ex.printStackTrace();
	
	}	
	}

}
