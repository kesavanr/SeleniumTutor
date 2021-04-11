package com.testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
	@Test(enabled=false)
	private void searchLaptop() {
		System.out.println("Laptop");
	}
	@Test
	private void searchMobile() {
		System.out.println("Mobile");
	}
	@Test
	private void searchAccessories() {
		System.out.println("Accessories");
	}
	@Test
	@Ignore
	private void searchDesktop() {
		System.out.println("Desktop");
	}
	@Test
	private void searchTV() {
		System.out.println("TV");
	}
}
