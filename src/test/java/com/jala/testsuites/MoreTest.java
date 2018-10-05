package com.jala.testsuites;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class MoreTest extends BaseTest{


	Logger log = Logger.getLogger("devpinoyLogger");

	/**
	 * Date:17-05-2018
	 * 
	 */

	@Test
	public void validloginAdmin() throws Exception {
		try {
			setupApplication();
			System.out.println("First Test For More...............");
			
			log.info("*************** Entering login Admin with valid data **************");
			//Thread.sleep(6000);
			pageObj.loginAdmin();
			Thread.sleep(5000);
			
			log.info("*************** leaving login Admin**************");
			

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	/**
	 * 
	 * @throws Exception
	 */

	@Test(priority =1)
	public void moreOptions() throws Exception  {
		
		try {
			Thread.sleep(3000);
			log.info("*************** Entering For More Options    **************");
		
		pageObj.click(pageObj.More_link, "on  More Button");
		log.info("*************** Entering For More Options    **************");
		
		
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}
	
	
		@Test(priority =2)
		public void multipleTabs() throws Exception  {
			
			try {
				Thread.sleep(6000);
				pageObj.click(pageObj.Multiple_tab, "on  Multiple Tab menu");
				log.info("*************** Clicked on multiple tab menu    **************");
				
				pageObj.click(pageObj.option_One, "on Option One");
				log.info("*************** Clicked on Option one    **************");
				
				pageObj.typing(pageObj.Tab1_Text_Field1, "Sai");
				pageObj.typing(pageObj.Tab1_Text_Field2, "Smita");
				log.info("*************** Value entered to text boxes of Option One    **************");
				
				pageObj.click(pageObj.option_Two, "on Option Two");
				log.info("*************** Clicked on Option Two   **************");
				
				Thread.sleep(3000);
				pageObj.typing(pageObj.Tab2_Text_Field1, "Sai Rath");
				pageObj.typing(pageObj.Tab2_Text_Field2, "Smita Rath");
				log.info("*************** Value entered to text boxes of Clicked on Option Two    **************");
				
				pageObj.click(pageObj.option_Three, "on Option Three");
				log.info("*************** Clicked on Option Three   **************");
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	}
	
		@Test(priority =3)
		public void menuTab() throws Exception  {
			
			try {
				Thread.sleep(3000);
				pageObj.click(pageObj.menu_tab, "on menu tab");
				log.info("*************** Clicked on menu tab   **************");
				
				pageObj.click(pageObj.Testing_options, "on testing option");
				log.info("*************** Clicked on testing option of SIngle Menus  **************");
				 Thread.sleep(3000);
				String actual_text_testing =pageObj.check_text_value(pageObj.label1);
				
				pageObj.click(pageObj.JAVA_option,"on java option");
				log.info("*************** Clicked on java option of Single Menus  **************");
				Thread.sleep(3000);
				String actual_text_java =pageObj.check_text_value(pageObj.label2);
				
				pageObj.click(pageObj.dot_Net_option,"on dot net option");
				log.info("*************** Clicked on dot net option of Single Menus  **************");
				Thread.sleep(3000);
				String actual_text_dot_net =pageObj.check_text_value(pageObj.label3);
				
				pageObj.click(pageObj.data_base_option,"on data base option");
				log.info("*************** Clicked on data base option of Single Menus  **************");
				Thread.sleep(3000);
				String actual_text_data_base =pageObj.check_text_value(pageObj.label4);
				
				
				
				pageObj.click(pageObj.sub_menu_tab, "on sub menu tab");
				log.info("*************** 1.Clicked on sub menu tab   **************");
				Thread.sleep(3000);
				
				pageObj.click(pageObj.sub_menu_Testing_option, "on sub menu testing tab");
				log.info("*************** Clicked on testing option of sub menu tab   **************");
				pageObj.click(pageObj.eve1, "on sub menu->testing->Selenium option");
				Thread.sleep(3000);
				String actual_text_testing_selenium =pageObj.check_text_value(pageObj.label5);
				
				pageObj.click(pageObj.sub_menu_Testing_option, "on sub menu testing tab");
				log.info("*************** Clicked on testing option of sub menu tab   **************");
				pageObj.click(pageObj.eve2, "on sub menu->testing->Manual Testing option");
				Thread.sleep(3000);
				String actual_text_testing_manual_testing =pageObj.check_text_value(pageObj.label6);
				
				
				pageObj.click(pageObj.sub_menu_Testing_option, "on sub menu testing tab");
				log.info("*************** Clicked on testing option of sub menu tab   **************");
				pageObj.click(pageObj.eve3, "on sub menu->testing->Data Base Testing option");
				Thread.sleep(3000);
				String actual_text_testing_database_testing =pageObj.check_text_value(pageObj.label7);
				
				
				pageObj.click(pageObj.sub_menu_Testing_option, "on sub menu testing tab");
				log.info("*************** Clicked on testing option of sub menu tab   **************");
				pageObj.click(pageObj.eve4, "on sub menu->testing->Unit Testing option");
				Thread.sleep(3000);
				String actual_text_testing_unit_testing =pageObj.check_text_value(pageObj.label8);
				
				pageObj.click(pageObj.sub_menu_JAVA_option, "on sub menu JAVA tab");
				log.info("*************** Clicked on JAVA option of sub menu tab   **************");
				pageObj.click(pageObj.eve5, "on sub menu->JAVA->Adv JAVA option");
				Thread.sleep(3000);
				String actual_text_JAVA_Adv_JAVA_testing =pageObj.check_text_value(pageObj.label9);
				
				pageObj.click(pageObj.sub_menu_JAVA_option, "on sub menu JAVA tab");
				log.info("*************** Clicked on JAVA option of sub menu tab   **************");
				pageObj.click(pageObj.eve6, "on sub menu->JAVA->Core JAVA option");
				Thread.sleep(3000);
				String actual_text_JAVA_Core_JAVA_testing =pageObj.check_text_value(pageObj.label10);
				
				pageObj.click(pageObj.sub_menu_JAVA_option, "on sub menu JAVA tab");
				log.info("*************** Clicked on JAVA option of sub menu tab   **************");
				pageObj.click(pageObj.eve7, "on sub menu->JAVA->Spring option");
				Thread.sleep(3000);
				String actual_text_JAVA_Spring_testing =pageObj.check_text_value(pageObj.label11);
				
				pageObj.click(pageObj.sub_menu_JAVA_option, "on sub menu JAVA tab");
				log.info("*************** Clicked on JAVA option of sub menu tab   **************");
				pageObj.click(pageObj.eve8, "on sub menu->JAVA->Hybernate option");
				Thread.sleep(3000);
				String actual_text_JAVA_Hybernate_testing =pageObj.check_text_value(pageObj.label12);
				
				pageObj.click(pageObj.sub_menu_dot_net_option, "on sub menu JAVA tab");
				log.info("*************** Clicked on DOT NET option of sub menu tab   **************");
				pageObj.click(pageObj.eve9, "on sub menu->DOT NET->C# option");
				Thread.sleep(3000);
				String actual_text_Dot_Net_C_sharp_testing =pageObj.check_text_value(pageObj.label13);
				
				pageObj.click(pageObj.sub_menu_dot_net_option, "on sub menu JAVA tab");
				log.info("*************** Clicked on DOT NET option of sub menu tab   **************");
				pageObj.click(pageObj.eve10, "on sub menu->DOT NET->ASP Dot Net option");
				Thread.sleep(3000);
				String actual_text_Dot_Net_ASP_Dot_Net_testing =pageObj.check_text_value(pageObj.label14);
				
				pageObj.click(pageObj.sub_menu_dot_net_option, "on sub menu JAVA tab");
				log.info("*************** Clicked on DOT NET option of sub menu tab   **************");
				pageObj.click(pageObj.eve11, "on sub menu->DOT NET->ADO Dot Net option");
				Thread.sleep(3000);
				String actual_text_Dot_Net_ADO_Dot_Net_testing =pageObj.check_text_value(pageObj.label15);
				
				pageObj.click(pageObj.sub_menu_dot_net_option, "on sub menu JAVA tab");
				log.info("*************** Clicked on DOT NET option of sub menu tab   **************");
				pageObj.click(pageObj.eve12, "on sub menu->DOT NET->MVC option");
				Thread.sleep(3000);
				String actual_text_Dot_Net_MVC_testing =pageObj.check_text_value(pageObj.label16);
				
				pageObj.click(pageObj.sub_menu_data_base_option, "on sub menu JAVA tab");
				log.info("*************** Clicked on DATA BASE option of sub menu tab   **************");
				pageObj.click(pageObj.eve13, "on sub menu->DATA BASE->SQL option");
				Thread.sleep(3000);
				String actual_text_Data_Base_SQL_testing =pageObj.check_text_value(pageObj.label17);
				
				pageObj.click(pageObj.sub_menu_data_base_option, "on sub menu JAVA tab");
				log.info("*************** Clicked on DATA BASE option of sub menu tab   **************");
				pageObj.click(pageObj.eve14, "on sub menu->DATA BASE->MY SQL option");
				Thread.sleep(3000);
				String actual_text_Data_Base_MY_SQL_testing =pageObj.check_text_value(pageObj.label18);
				
				pageObj.click(pageObj.sub_menu_data_base_option, "on sub menu JAVA tab");
				log.info("*************** Clicked on DATA BASE option of sub menu tab   **************");
				pageObj.click(pageObj.eve15, "on sub menu->JAVA->ORACLE option");
				Thread.sleep(3000);
				String actual_text_Data_Base_Oracle_testing =pageObj.check_text_value(pageObj.label19);
				
				pageObj.click(pageObj.sub_menu_data_base_option, "on sub menu JAVA tab");
				log.info("*************** Clicked on DATA BASE option of sub menu tab   **************");
				pageObj.click(pageObj.eve16, "on sub menu->DATA BASE->H2 option");
				Thread.sleep(3000);
				String actual_text_Data_Base_H2_testing =pageObj.check_text_value(pageObj.label20);
			
			
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	}
		
		@Test
		public void autoCompleteTab() throws Exception  {
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	}

		@Test
		public void collapsibleContentTab() throws Exception  {
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	}
}
	


