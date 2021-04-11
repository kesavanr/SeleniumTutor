package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	@Test
	private void searchHardAssert() {
		//HardAssert
		System.out.println("HardAssert Start--------");
		String actualValue = "INFOTECH";
		String expectedValue = "infotech";
		Assert.assertEquals(actualValue, expectedValue);
		System.out.println("HardAssert Completed ===========");
		System.out.println("HardAssert End--------");
	}
	
	@Test
	private void searchSoftAssert() {
		System.out.println("SoftAssert Start--------");
		SoftAssert sa= new SoftAssert();
		long actualValue = 7777;
		long expectedValue = 8888;
		sa.assertEquals(actualValue, expectedValue);
		System.out.println("SoftAssert Completed ===========");
		System.out.println("SoftAssert End--------");
		sa.assertAll();
	}
}
