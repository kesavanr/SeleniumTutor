package com.testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryListner implements IRetryAnalyzer{

	int cnt = 0;
	int limit = 5;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(cnt < limit)
		{
			cnt++;
			return true;
		}
		return false;
	}

}
