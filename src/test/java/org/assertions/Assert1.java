package org.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert1 {
	@Test
	(expectedExceptions=AssertionError.class)
	private void tc1() {
		System.out.println("Test1");
		Assert.assertTrue(false);
		System.out.println("Test2");

	}

}
