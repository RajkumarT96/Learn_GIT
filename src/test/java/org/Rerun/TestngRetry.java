package org.Rerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestngRetry implements IRetryAnalyzer {
	int min = 0;
	int max = 3;
	public boolean retry(ITestResult arg0) {
		// TODO Auto-generated method stub
		return false;
	}


}
