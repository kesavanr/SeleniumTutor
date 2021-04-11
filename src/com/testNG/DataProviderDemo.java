package com.testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class DataProviderDemo {

	/*@Test(dataProvider="getCredintials")
	private void login(@Optional("user1")String user, @Optional("p123")String pwd, @Optional("cp11212")String cPwd) {
		System.out.println("Username is : " + user);
		System.out.println("Password is : " + pwd);
		System.out.println("ConPassword is : " + cPwd);
	}

	@DataProvider
	private Object[][] getCredintials() {
		return new Object[][] {
			{"ramesh","121313","32323"},
			{"keasdad","121313","32323"}
		};
	}*/
	
	@BeforeSuite
	private void setUp() {
		System.out.println("setUp");
	}
	
	@DataProvider
	private String[][] demoDataProvider() {
		return new String[][] {
			{
				"aaa","111"
			},
			{
				"bbb","222"
			}
		};
	}
	
	@Test(dataProvider="demoDataProvider")
	private void loginDetails(String uname, String pwd) {
		System.out.println(uname + ":" + pwd);

	}
	
	@AfterSuite
	private void deleteCookies() {
		System.out.println("deleteCookies");
	}
}
