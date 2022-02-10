package org.assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {
	@Test (expectedExceptions=AssertionError.class)
	private void tc1() {
		System.out.println("Test1");
		SoftAssert s = new SoftAssert();
		s.assertTrue(false);
		System.out.println("Test2");
		s.assertAll();

	}

}
