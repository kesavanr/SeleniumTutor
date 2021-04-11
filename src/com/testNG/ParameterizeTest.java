package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizeTest {
	@Test
	@Ignore
	@Parameters({"username","password"})
	private void getCredintials(@Optional("Optinfotech")String user, @Optional("Opt123456")String pass) {
		System.out.println("Username is : " + user);
		System.out.println("Password is : " + pass);
	}
	
	@Test(enabled=false)
	@Parameters({"name"})
	private void getName(@Optional("Optname")String name) {
		System.out.println("Name is : " + name);
		Assert.assertTrue(false);
	}
	
	@Test
	@Parameters({"loginuser", "loginpassword"})
	private void getParameterEx(String user, @Optional("1212")String pwd) {
		System.out.println(user + " : " + pwd);

	}
}
