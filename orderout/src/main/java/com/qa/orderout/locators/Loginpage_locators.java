package com.qa.orderout.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage_locators {

	@FindBy(xpath="//input[@class='input cb8b8ac5f c24cfebe5']")
	public WebElement email_address;
	
	@FindBy(xpath="//input[@class='input cb8b8ac5f c7e639c87']")
	public WebElement password;
	
	@FindBy(xpath="//button[@class='c64e877fc ulp-button-icon c283fdb19 _button-icon']")
	public WebElement password_eye_button;
	
	@FindBy(xpath="//button[@class='c64e877fc c55256a89 c283fdb19 c26d7a986 cebfbdd72']")
	public WebElement continue_button;
	
	
}


