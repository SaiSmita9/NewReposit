package com.jala.pageobjects;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

	public WebDriver driver;
	Logger log = Logger.getLogger("devpinoyLogger");

	public PageObjects(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// Admin Login Page

	@FindBy(partialLinkText = "Admin")
	public WebElement admin_link;

	@FindBy(id = "txtname")
	public WebElement admin_login_username_txt;

	@FindBy(id = "txtpsw")
	public WebElement admin_login_password_txt;

	@FindBy(id = "btnlogin")
	public WebElement admin_login_button;
	
	@FindBy(linkText ="More")
	public WebElement More_link;
	
	@FindBy(linkText ="Multiple Tabs")
	public WebElement Multiple_tab;
	
	@FindBy(linkText ="One")
	public WebElement option_One;
	
	@FindBy(xpath ="//input[@placeholder='Tab1TextField 1']")
	public WebElement Tab1_Text_Field1;
	
	@FindBy(xpath ="//input[@placeholder='Tab1TextField 2']")
	public WebElement Tab1_Text_Field2;
	
	@FindBy(linkText ="Two")
	public WebElement option_Two;
	
	@FindBy(xpath ="//input[@placeholder='Tab2TextField 1']")
	public WebElement Tab2_Text_Field1;
	
	@FindBy(xpath ="//input[@placeholder='Tab2TextField 2']")
	public WebElement Tab2_Text_Field2;
	
	@FindBy(linkText ="Three")
	public WebElement option_Three;
	
	@FindBy(linkText ="Menu")
	public WebElement menu_tab;
	
	@FindBy(xpath ="//a[contains(text(),'Testing')]")
	public WebElement Testing_options;
	
	@FindBy(id ="label")
	public WebElement label1;
	
	@FindBy(xpath ="//a[contains(text(),'Java')]")
	public WebElement JAVA_option;
	
	@FindBy(id ="label")
	public WebElement label2;
	
	@FindBy(xpath ="//a[contains(text(),'.Net')]")
	public WebElement dot_Net_option;
	
	@FindBy(id ="label")
	public WebElement label3;
	
	@FindBy(xpath ="//a[contains(text(),'Data Base')]")
	public WebElement data_base_option;
	
	@FindBy(id ="label")
	public WebElement label4;
	
	@FindBy(linkText ="Sub Menus")
	public WebElement sub_menu_tab;
	
	@FindBy(linkText ="Testing")
	public WebElement sub_menu_Testing_option;
	
	@FindBy(id ="selbtn")
	public WebElement eve1;
	
	@FindBy(id ="manualbtn")
	public WebElement eve2;
	
	@FindBy(id ="dbbtn")
	public WebElement eve3;
	
	@FindBy(id ="unitbtn")
	public WebElement eve4;
	
	@FindBy(id ="label")
	public WebElement label5;
	
	@FindBy(id ="label")
	public WebElement label6;
	
	@FindBy(id ="label")
	public WebElement label7;
	
	@FindBy(id ="label")
	public WebElement label8;
	
	@FindBy(linkText ="JAVA")
	public WebElement sub_menu_JAVA_option;
	
	@FindBy(id ="advjavabtn")
	public WebElement eve5;
	
	@FindBy(id ="corejavabtn")
	public WebElement eve6;
	
	@FindBy(id ="springbtn")
	public WebElement eve7;
	
	@FindBy(id ="hibernatebtn")
	public WebElement eve8;
	
	@FindBy(linkText =".Net")
	public WebElement sub_menu_dot_net_option;
	
	@FindBy(id ="cbtn")
	public WebElement eve9;
	
	
	@FindBy(id ="aspbtn")
	public WebElement eve10; 
	
	@FindBy(id ="adobtn")
	public WebElement eve11; 
	
	@FindBy(id ="mvcbtn")
	public WebElement eve12; 
	
	@FindBy(linkText ="Database")
	public WebElement sub_menu_data_base_option;
	
	@FindBy(id ="sqlbtn")
	public WebElement eve13; 
	
	@FindBy(id ="mysqlbtn")
	public WebElement eve14; 
	
	@FindBy(id ="oraclebtn")
	public WebElement eve15; 
	
	@FindBy(id ="h2btn")
	public WebElement eve16; 
	
	@FindBy(id ="label")
	public WebElement label9;
	
	@FindBy(id ="label")
	public WebElement label10;
	
	@FindBy(id ="label")
	public WebElement label11;
	
	@FindBy(id ="label")
	public WebElement label12;
	
	@FindBy(id ="label")
	public WebElement label13;
	
	@FindBy(id ="label")
	public WebElement label14;
	
	@FindBy(id ="label")
	public WebElement label15;
	
	@FindBy(id ="label")
	public WebElement label16;
	
	@FindBy(id ="label")
	public WebElement label17;
	
	@FindBy(id ="label")
	public WebElement label18;
	
	@FindBy(id ="label")
	public WebElement label19;
	
	@FindBy(id ="label")
	public WebElement label20;
	
	
	
}
