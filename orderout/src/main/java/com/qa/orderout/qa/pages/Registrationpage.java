package com.qa.orderout.qa.pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.PageFactory;

import com.qa.orderout.base.TestBase;
import com.qa.orderout.locators.Registrationpage_locator;

public class Registrationpage extends TestBase{
	public Registrationpage_locator element_registrationpage = new Registrationpage_locator();
	
	
	public Registrationpage() {
		
		PageFactory.initElements(driver, element_registrationpage);
	}
	
	public void verify_valid_registration() throws InterruptedException {
		element_registrationpage.signup_button.click();
		Thread.sleep(2000);
		Registrationpage.generateRandomEmail();
		element_registrationpage.Email_address.sendKeys(Registrationpage.generateRandomEmail());
		element_registrationpage.password_field.sendKeys("Ashish@2207");
		element_registrationpage.continue_button.click();
	}
	
	    public static String generateRandomEmail() {
	        // Generate a random email address
	        return "user" + RandomStringUtils.randomAlphanumeric(5) + "@example.com";
	       
	    }
	
	public void verify_password_validation() throws InterruptedException {
		element_registrationpage.signup_button.click();
		Thread.sleep(1000);
		element_registrationpage.Email_address.sendKeys("Ashishlabh22@gmail.com");
		element_registrationpage.password_field.sendKeys("Ash");
		Thread.sleep(2000);
		
	}
		public void verify_valid_passwordvalidation() throws InterruptedException {
			element_registrationpage.signup_button.click();
			Thread.sleep(2000);
			element_registrationpage.Email_address.sendKeys("Ashish.labh@yopmail.com");
			element_registrationpage.password_field.sendKeys("Ashish@2207");
			Thread.sleep(2000);
			
		}
		
		public void verify_invalid_email() throws InterruptedException {
			element_registrationpage.signup_button.click();
			Thread.sleep(2000);
			element_registrationpage.Email_address.sendKeys("ashishgmail.com");
			element_registrationpage.password_field.sendKeys("Ashish@22087test");
			element_registrationpage.continue_button.click();
			
			
		}
		
		
		
	}


