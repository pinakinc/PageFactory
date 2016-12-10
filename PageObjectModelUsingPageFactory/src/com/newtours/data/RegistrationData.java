package com.newtours.data;

import org.testng.annotations.DataProvider;

public class RegistrationData {
	private String firstNm;
	private String lastNm;
	private String phoneNm;
	private String userName;
	private String country;
	private String email;
	private String passwd;
	private String confpasswd;
	
	public String getFirstNm() {
		return firstNm;
	}
	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}
	public String getLastNm() {
		return lastNm;
	}
	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}
	public String getPhoneNm() {
		return phoneNm;
	}
	public void setPhoneNm(String phoneNm) {
		this.phoneNm = phoneNm;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getConfpasswd() {
		return confpasswd;
	}
	public void setConfpasswd(String confpasswd) {
		this.confpasswd = confpasswd;
	}
	
	@DataProvider(name = "registrationdata")
	public static Object[][] getregdata() {
		RegistrationData regdata = new RegistrationData();
		regdata.setFirstNm("Pinakin");
		regdata.setLastNm("Chaubal");
		regdata.setPhoneNm("8652027532");
		regdata.setUserName("pinakinc");
		regdata.setCountry("ANGOLA");
		regdata.setEmail("pinakinc@yahoo.com");
		regdata.setPasswd("p9121975");
		regdata.setConfpasswd("p9121975");
		return new RegistrationData[][] { { regdata } };
			
		
	}

}
