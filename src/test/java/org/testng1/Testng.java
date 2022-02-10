package org.testng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng {
	@AfterSuite
	private void tc1() {
		System.out.println("@AfterSuite");
	}

	@AfterTest
	private void tc2() {
		System.out.println("@AfterTest");
	}

	@AfterClass
	private void tc3() {
		System.out.println("@AfterClass");
	}

	@AfterMethod
	private void tc4() {
		System.out.println("@AfterMethod");
	}

	@BeforeSuite
	private void tc5() {
		System.out.println("@BeforeSuite");
	}

	@BeforeTest
	private void tc6() {
		System.out.println("@BeforeTest");
	}

	@BeforeClass
	private void tc7() {
		System.out.println("@BeforeClass");
	}

	@BeforeMethod
	private void tc8() {
		System.out.println("@BeforeMethod");
	}

	@Test(priority=50, invocationCount=2, enabled=false)
	private void tc9() {
		System.out.println("test1");
	}

	@Test(priority=-100)
	private void tc10() {
		System.out.println("test2");
	}

}