package com.qa.orderout.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.orderout.base.TestBase;
import com.qa.orderout.locators.Registrationpage_locator;
import com.qa.orderout.qa.pages.Loginpage;
import com.qa.orderout.qa.pages.Registrationpage;

public class Registration_testcase extends TestBase {
	
	Registrationpage registrationpage;
	Registrationpage_locator registrationpageelement =new Registrationpage_locator();
	
	@BeforeMethod
	public void setup_browser() throws IOException {
		browsersetup();
		registrationpage =new Registrationpage();
		
	}
	
	
	
		@Test(description="Verify valid user registration")
		public void verifyvalidregistration() throws InterruptedException {
			registrationpage.verify_valid_registration();
			//WebElement element3=driver.findElement(By.xpath("//div[@class='mt-5 text-center h3']"));
			String expected_text="Check your inbox to verify your email";
			String actual_text=registrationpageelement.titleaftersignup.getText();
			Assert.assertEquals(actual_text, expected_text);
			if(registrationpageelement.titleaftersignup.getText().equals(expected_text)) {
				System.out.println("user registered in successfully");
			}else{
				System.out.println("user not registered");}
			
		}
		
		@Test(description ="verify invalid password validations ")
		public void verifyinvalidpasswordvalidation() throws InterruptedException {
			registrationpage.verify_password_validation();
			WebElement element=driver.findElement(By.xpath("//li[@class='c90406b38 cafb633ed']"));
			Assert.assertTrue(element.isDisplayed(), "test");
			//Assert.assertTrue(registrationpageelement.passwordlessthan8.isDisplayed());
				
			}
			
		@Test(description="Verify valid password validation")
		public void verifyvalidpasswordvalidation() throws InterruptedException {
			registrationpage.verify_valid_passwordvalidation();
			WebElement element1=driver.findElement(By.xpath("//li[@class='c90406b38 c0a109bdb']"));
			Assert.assertTrue(element1.isDisplayed(), "test");
		}
		
		@Test(description="Verify invalid email registration")
		public void verifyinvalidemail() throws InterruptedException {
			registrationpage.verify_invalid_email();
			String expected_validation="Email is not valid.";
			String actual_validation=registrationpageelement.invalidemailvalidation.getText();
			Assert.assertEquals(expected_validation, actual_validation);
			if(expected_validation.equals(actual_validation)) {
				System.out.println("User get email validation");}
				else {System.out.println("User did not get validation");
			}
			
		}
		
			
		
	


	
	
	@AfterTest
	public void teardown() {
		if (driver==null) {
			driver.quit();
		}
}
}
