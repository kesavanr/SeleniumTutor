package com.testNG;

import org.testng.annotations.Test;

public class DepandsGroups {
	@Test(groups="Electronic", dependsOnGroups="Kitchen")
	private void searchLaptop() {
		System.out.println("Laptop");
	}
	@Test(groups="Electronic", dependsOnGroups="Kitchen")
	private void searchMobile() {
		System.out.println("Mobile 1");
	}
	@Test(groups="Electronic", dependsOnGroups="Kitchen")
	private void searchAccessories() {
		System.out.println("Accessories");
	}
	@Test(groups="Electronic", dependsOnGroups="Kitchen")
	private void searchDesktop() {
		System.out.println("Desktop");
	}
	@Test(groups="Electronic", dependsOnGroups="Kitchen")
	private void searchTV() {
		System.out.println("TV 1");
	}
	
	@Test(groups="Kitchen")
	private void searchPlate() {
		System.out.println("Plate 111");
	}
	@Test(groups="Kitchen", enabled=false)
	private void searchSpoon() {
		System.out.println("Spoon");
	}
	
	@Test(expectedExceptions= ArithmeticException.class)
	private void testse() {
		// TODO Auto-generated method stub

	}
}
