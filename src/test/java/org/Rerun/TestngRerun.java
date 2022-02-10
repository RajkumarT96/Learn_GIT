package org.Rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngRerun {
	@Test
	private void tc1() {
		System.out.println("Test1");
	}
	@Test(retryAnalyzer = TestngRetry.class)
	private void tc2() {
		System.out.println("Test2");
		Assert.assertTrue(false);
		System.out.println("Test3");
	}
	@Test
	private void tc3() {
		System.out.println("Test4");
	}

}
