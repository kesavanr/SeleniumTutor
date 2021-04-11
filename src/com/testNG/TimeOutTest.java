package com.testNG;

import org.testng.annotations.Test;

public class TimeOutTest {
	@Test
	private void searchTv() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("TimeOutTest : searchTv");

	}
	
	@Test
	private void searchAcceessories() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("TimeOutTest : searchAcceessories");
	}
}
