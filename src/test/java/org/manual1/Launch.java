package org.manual1;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.TestngDataProvider.AdactinLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Launch extends Base {

	@Test(dataProvider = "SampleData")
	private static void enterText(String username, String password) throws InterruptedException {
		browserLaunch("https://www.instagram.com/accounts/login/");
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println("============================");

		InstaLogin l = new InstaLogin();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement txtUsername = l.getUsername();
		sendData(txtUsername, username);
		WebElement txtPassword = l.getPassword();
		sendData(txtPassword, password);
		WebElement login = l.getSubmit();
		login.click();
//		driver.close();
	}
	
	@DataProvider(name = "SampleData")
	private static Object[][] data() throws IOException {
		return new Object[][] {

				{ workSheet(0, 0), workSheet(0, 1) } };
	}


//	@Test(dataProvider = "SampleData1")
//	private void enterText1(String username1, String password1) {
//		browserLaunch("https://www.instagram.com/accounts/login/");
//		Date d2 = new Date();
//		System.out.println(d2);
//		System.out.println("============================");
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//		InstaLogin l = new InstaLogin();
//		WebElement txtusername2 = l.getUsername();
//		sendData(txtusername2, username1);
//		WebElement txtpassword2 = l.getPassword();
//		sendData(txtpassword2, password1);
//		WebElement submit = l.getSubmit();
//		submit.click();
//		driver.close();
//
//	}
//
//	@DataProvider(name = "SampleData1")
//	private static Object[][] data1() throws IOException {
//		return new Object[][] {
//
//				{workSheet(0, 2), workSheet(0, 3) } };
//	}

}
