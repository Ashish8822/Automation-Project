package com.qa.orderout.base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static FileReader fr;
	public static FileReader pr;
	public static Properties loc= new Properties();
	public static Properties pro= new Properties();
	
	@BeforeTest
	public void browsersetup() throws IOException {
		if(driver==null) {
			fr=new FileReader("C:\\Users\\Ashish Labh\\testngpractise\\orderout\\src\\main\\java\\com\\orderout\\qa\\config\\config.properties");
			pr=new FileReader("C:\\Users\\Ashish Labh\\testngpractise\\orderout\\src\\main\\java\\com\\orderout\\qa\\config\\config.properties");
			pro.load(fr);
			loc.load(pr);
		}
		
		if (pro.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if (pro.getProperty("browser").equalsIgnoreCase("firefox")){
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(pro.getProperty("url"));
		}
	
	@AfterTest
	public void Teardown() {
		if (driver==null) {
			driver.quit();
		}
	}
	}
	
	
	

