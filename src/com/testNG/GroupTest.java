package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest {
	@Test(priority=4, groups="Electronic")
	private void searchLaptop() {
		System.out.println("Laptop");
	}
	@Test(priority=-1, groups="Electronic")
	private void searchMobile() {
		System.out.println("Mobile");
	}
	@Test(priority=3, groups="Electronic")
	private void searchAccessories() {
		System.out.println("Accessories");
	}
	@Test(priority=1, groups="Electronic")
	private void searchDesktop() {
		System.out.println("Desktop");
	}
	@Test(priority=1, groups="Electronic")
	private void searchTV() {
		System.out.println("TV");
	}
	
	//------------------------------------------------------------
	
	@Test(priority=2, groups="GroupTestKitchen")
	private void searchPlate() {
		System.out.println("1. Plate");
	}
	@Test(priority=5, groups="GroupTestKitchen", retryAnalyzer=IRetryListner.class)//
	private void searchSpoon() {
		System.out.println("1. Spoon");
		Assert.assertEquals(true, false);
	}
	
	//--------------------------------------------------------------
	
	@Test(groups="Motor")
	private void searchTwoWheeler() {
		System.out.println("TwoWheeler");
	}
	@Test(groups="Motor")
	private void searchFourWheeler() {
		System.out.println("FourWheeler");
	}
}
