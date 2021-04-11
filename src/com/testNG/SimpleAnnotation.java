package com.testNG;

import org.testng.annotations.*;

public class SimpleAnnotation {
	
	@BeforeSuite
	private void setUp() {
		System.out.println("setUp");
	}
	@BeforeTest
	private void browserLaunch() {
		System.out.println("browserLaunch");
	}
	@BeforeClass
	private void enterUrl() {
		System.out.println("enterUrl");
	}
	@BeforeMethod
	private void login() {
		System.out.println("login");
	}
	@Test
	private void searchLaptop() {
		System.out.println("searchLaptop");
	}
	@Test
	private void searchMobile() {
		System.out.println("searchMobile");
	}
	@AfterMethod
	private void verfiyHomePage() {
		System.out.println("verfiyHomePage");
	}
	@AfterClass
	private void logout() {
		System.out.println("logout");
	}
	@AfterTest
	private void closeBrowser() {
		System.out.println("closeBrowser");
	}
	@AfterSuite
	private void deleteCookies() {
		System.out.println("deleteCookies");
	}
}
