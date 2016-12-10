package com.newtours.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.newtours.data.RegistrationData;
import com.newtours.pages.Registerpage;

public class WebDriverMain {
	WebDriver driver;
	
	@Test(dataProvider="registrationdata", dataProviderClass=RegistrationData.class)
	public void testRegisterUser (RegistrationData regdata)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhagyashree\\Desktop\\Documents\\Selenium\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/mercuryregister.php");
		Registerpage regpage = PageFactory.initElements(driver, Registerpage.class);
		regpage.registerUser(regdata);
		assert driver.findElement(By.tagName("body")).getText().contains("Thank you");
		driver.quit();
	}

}	
