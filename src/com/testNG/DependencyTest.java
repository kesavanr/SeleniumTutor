package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
	@Test(dependsOnMethods="searchMobile")
	private void searchLaptop() {
		System.out.println("Laptop");
	}
	@Test(dependsOnMethods="searchAccessories")
	private void searchMobile() {
		System.out.println("Mobile");
	}
	@Test(dependsOnMethods="searchDesktop")
	private void searchAccessories() {
		System.out.println("Accessories");
	}
	@Test(dependsOnMethods="searchTV")
	private void searchDesktop() {
		System.out.println("Desktop");
	}
	@Test(dependsOnMethods="searchPlate")
	private void searchTV() {
		System.out.println("TV");
	}
	
	@Test(dependsOnMethods="searchSpoon")
	private void searchPlate() {
		System.out.println("Plate");
	}
	@Test
	private void searchSpoon() {
		System.out.println("Spoon");
		Assert.assertTrue(true);
	}
}
