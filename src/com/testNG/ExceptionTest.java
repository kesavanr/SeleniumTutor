package com.testNG;

import org.testng.annotations.Test;

public class ExceptionTest {
	@Test(expectedExceptions=ArithmeticException.class)
	private void callMethods() {
		System.out.println("Before statement");
		int k=50/0;
		System.out.println("After statement");
	}
}
