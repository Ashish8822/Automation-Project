package com.qa.orderout.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.qa.orderout.base.TestBase;
import com.qa.orderout.locators.Loginpage_locators;

public class Loginpage extends TestBase{
	
	public Loginpage_locators elements_loginpage=new Loginpage_locators();
	
	
	//initialize page object
	public Loginpage() {
		PageFactory.initElements(driver, elements_loginpage);
		
	}
	
	
	public void verify_valid_login() throws InterruptedException {
		elements_loginpage.email_address.sendKeys("ashish@orderout.co");
		elements_loginpage.password.sendKeys("Ashish@2207");
		elements_loginpage.password_eye_button.click();
		Thread.sleep(2000);
		elements_loginpage.password_eye_button.click();
		Thread.sleep(2000);
		elements_loginpage.continue_button.click();
		
	}

}
