package com.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.newtours.data.RegistrationData;

public class Registerpage {
	private WebDriver driver;

	public Registerpage(WebDriver driver) {
		this.driver = driver;
	}
    
	@CacheLookup
	@FindBy(name = "firstName")
	WebElement txtfirstName;
    
	@CacheLookup
	@FindBy(name = "lastName")
	WebElement txtlastName;
	
	@CacheLookup
	@FindBy(name = "phone")
	WebElement txtphone;
	
	@CacheLookup
	@FindBy(name = "userName")
	WebElement txtuserName;
	
	@CacheLookup
	@FindBy(name = "country")
	WebElement ddcountry;
	
	@CacheLookup
	@FindBy(name = "email")
	WebElement txtemail;
	
	@CacheLookup
	@FindBy(name = "password")
	WebElement txtpassword;
	
	@CacheLookup
	@FindBy(name = "confirmPassword")
	WebElement txtconfirmPassword;
	
	@CacheLookup
	@FindBy(name = "register")
	WebElement btnregister;

	public Registerpage typefirstName(String firstName)
	{
		txtfirstName.sendKeys(firstName);
		return this;
	}
	
	public Registerpage typelastName(String lastName)
	{
		txtlastName.sendKeys(lastName);
		return this;
	}

	public Registerpage typephone(String phone)
	{
		txtphone.sendKeys(phone);
		return this;
	}

	public Registerpage typeuserName(String userName)
	{
		txtuserName.sendKeys(userName);
		return this;
	}

	public Registerpage selectcountry(String country)
	{
		new Select(ddcountry).selectByVisibleText(country);
		return this;
	}
	public Registerpage typeemail(String email)
	{
		txtemail.sendKeys(email);
		return this;
	}
	public Registerpage typepassword(String password)
	{
		txtpassword.sendKeys(password);
		return this;
	}
	public Registerpage typeconfirmPassword(String confirmPassword)
	{
		txtconfirmPassword.sendKeys(confirmPassword);
		return this;
	}
	public ConfirmRegisterpage clickRegister()
	{
		btnregister.click();
		return PageFactory.initElements(driver, ConfirmRegisterpage.class);
	}
	
	public ConfirmRegisterpage registerUser(RegistrationData regdata)
	{
		return typefirstName(regdata.getFirstNm())
				.typelastName(regdata.getLastNm())
				.typephone(regdata.getPhoneNm())
				.typeuserName(regdata.getUserName())
				.selectcountry(regdata.getCountry())
				.typeemail(regdata.getEmail())
				.typepassword(regdata.getPasswd())
				.typeconfirmPassword(regdata.getConfpasswd())
				.clickRegister();
	}




}
