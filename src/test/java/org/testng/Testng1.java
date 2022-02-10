package org.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng1 {
	
	@AfterMethod
	private void tc4() {
		System.out.println("@AfterMethod");
	}
	
	@BeforeMethod
	private void tc8() {
		System.out.println("@BeforeMethod");
	}
	@Test
	private void test1() {
		System.out.println("@Test - Test1");
	}
	@Test
	private void test2() {
		System.out.println("@Test - Test2");
	}
	@Test
	private void test3() {
		System.out.println("@Test - Test3");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
