package com.qa.orderout.test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.qa.orderout.base.TestBase;
import com.qa.orderout.qa.pages.Loginpage;

public class Login_testcase extends TestBase{
	
	Loginpage loginpage;
	
	
	
	@BeforeMethod
	public void Setup() throws IOException {
		browsersetup();
		loginpage=new Loginpage();
	}
	
	
	@Test(description="verify valid login")
	public void verifyvalidlogin() throws InterruptedException {
		loginpage.verify_valid_login();
	}
	

}
