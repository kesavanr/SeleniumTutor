package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTest {
	@Test
	private void searchLaptop() {
		System.out.println("Laptop");
	}
	@Test(priority=-1)
	private void searchMobile() {
		System.out.println("Mobile");
	}
	@Test(priority=3)
	private void searchAccessories() {
		System.out.println("Accessories");
	}
	@Test(priority=1)
	private void searchDesktop() {
		System.out.println("Desktop");
	}
	@Test(priority=1,retryAnalyzer=IRetryListner.class)
	private void searchTV() {
		System.out.println("TV");
		Assert.assertTrue(false);
	}
}
