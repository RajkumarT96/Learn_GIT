package org.Groupings;

import org.testng.annotations.Test;

public class Tetsings {
	@Test(groups="Regression")
	private void tc1() {
		System.out.println("Test1" + Thread.currentThread().getId());
	}
	@Test(groups="Sanity")
	private void tc2() {
		System.out.println("Test2" + Thread.currentThread().getId());
	}
	@Test(groups="Smoke")
	private void tc3() {
		System.out.println("Test3"+ Thread.currentThread().getId());
	}

}
