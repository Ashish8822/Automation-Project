package com.qa.orderout.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registrationpage_locator {
	
	@FindBy(xpath="//a[@class='c72dde48d c36964393']")
	public WebElement signup_button;
	
	@FindBy(xpath="//input[@class='input cb8b8ac5f cbf3fe8f1']")
	public
	WebElement Email_address;
	
	@FindBy(xpath="//p[@class='c192ddc3e cfcd4ae5f']")
	public WebElement Heading_title;
	
	@FindBy(xpath="//input[@class='input cb8b8ac5f c7e639c87']")
	public WebElement password_field;
	
	@FindBy(xpath="//button[@class='c64e877fc c55256a89 c283fdb19 c26d7a986 c9efa3342']")
	public WebElement continue_button;
	
	@FindBy(xpath="//span[@class='c271f0f45' and text()='Your password must contain:']")
	public WebElement password_validation;
	
	@FindBy(xpath="//li[@class='c90406b38 cafb633ed' ]")
	public WebElement invalid_password_locator;
	
	@FindBy(xpath="//li[@class='c90406b38 c0a109bdb' ]")
	public WebElement valid_password_locator;
	
	@FindBy(xpath="//li[@class='c90406b38 cafb633ed']")
	public WebElement passwordlessthan8;
	
	@FindBy(xpath="//div[@class='mt-5 text-center h3']")
	public WebElement titleaftersignup;
	
	@FindBy(xpath="//span[@id='error-element-email']")
	public WebElement invalidemailvalidation;
	

}
