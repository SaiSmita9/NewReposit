package com.jala.testsuites;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jala.framework.BaseTest;
import com.jala.pageobjects.PageActions;

/**
 * 
 * @author JALA Technologies
 * 
 * 
 */

public class LoginTest extends BaseTest{

	WebDriver driver;
	Logger log = Logger.getLogger("devpinoyLogger");
	
	BaseTest base=new BaseTest();
	/**
	 * Date:17-05-2018
	 * 
	 */

	/**
	 * 
	 * @throws Exception
	 */
	
	
	
	@Test (priority=1)
	public void loginAdminwithINValid() throws Exception {
		try {

			log.info("*************** Entering login Admin with invalid data **************");
			System.out.println("First Test ................");
	//		pageObj.click(pageObj.admin_link, " Admin link");
		//	pageObj.type(pageObj.admin_login_username_txt, "admin");
	//		pageObj.type(pageObj.admin_login_password_txt, "adm ");
		//	pageObj.click(pageObj.admin_login_button, "Clicking the Login button");
			
			log.info("*************** leaving login Admin**************");
			Thread.sleep(2000);

		} catch (Exception e) {
			// TODO: handle exceptionpageObj
			e.printStackTrace();
		}

	}

	
	
	@Test(priority=2)
	public void loginAdminwithValid() throws Exception {
		try {
			Thread.sleep(6000);
			pageObj.loginAdmin();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
}
}
