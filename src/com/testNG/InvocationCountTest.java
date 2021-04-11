package com.testNG;

import org.testng.annotations.Test;

public class InvocationCountTest {
	@Test(invocationCount=5)
	private void searchMobile() {
		System.out.println("InvocationCountTest :  Mobile");
	}
	
	@Test(invocationCount=3)
	private void searchDesktop() {
		System.out.println("InvocationCountTest : Desktop");
	}
}
