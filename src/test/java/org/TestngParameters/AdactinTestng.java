package org.TestngParameters;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdactinTestng extends Base {

	@BeforeClass
	public static void test1() {
		browserLaunch("https://adactinhotelapp.com/");
	}

	@BeforeMethod
	public void test2() {
		// time
		Date d = new Date();
		System.out.println(d);
		System.out.println("============================");
		String pageSource = driver.getPageSource();
		// System.out.println(pageSource);
		boolean contains = pageSource.contains("adactin");
		Assert.assertTrue(contains);
		System.out.println("we are in adactinhotelapp");

	}

	@Parameters({ "username", "password" })
	@Test
	private void test3(String username, String password) {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(username);
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys(password);
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();

	}

	@Test
	public void test4() throws IOException, InterruptedException {
		AdactinDetails d = new AdactinDetails();
		WebElement location = d.getLocation();
		sendData(location, workSheet("E:\\JavaSelinium\\Write.xlsx", "Sheet1", 0, 2));
		WebElement hotels = d.getHotels();
		sendData(hotels, workSheet("E:\\JavaSelinium\\Write.xlsx", "Sheet1", 0, 3));
		WebElement roomtype = d.getRoomtype();
		sendData(roomtype, workSheet("E:\\JavaSelinium\\Write.xlsx", "Sheet1", 0, 4));
		WebElement roomcount = d.getRoomcount();
		Select dropDown = d.dropDown(roomcount);
		dropDown.selectByIndex(Integer.parseInt(workSheet("E:\\JavaSelinium\\Write.xlsx", "Sheet1", 0, 5)));
		WebElement datain = d.getDatain();
		datain.clear();
		sendData(datain, workSheet("E:\\JavaSelinium\\Write.xlsx", "Sheet1", 0, 6));
		WebElement dataout = d.getDataout();
		dataout.clear();
		sendData(dataout, workSheet("E:\\JavaSelinium\\Write.xlsx", "Sheet1", 0, 7));
		WebElement adult = d.getAdult();
		Select dropDown2 = d.dropDown(adult);
		dropDown2.selectByIndex(Integer.parseInt(workSheet("E:\\JavaSelinium\\Write.xlsx", "Sheet1", 0, 8)));
		WebElement child = d.getChild();
		Select dropDown3 = d.dropDown(child);
		dropDown3.selectByIndex(Integer.parseInt(workSheet("E:\\JavaSelinium\\Write.xlsx", "Sheet1", 0, 9)));
		WebElement search = d.getSearch();
		search.click();
		Thread.sleep(3000);
	}

	@Test
	public void tset5() throws InterruptedException {
		AdactinSelect s = new AdactinSelect();
		WebElement select = s.getSelect();
		select.click();
		WebElement go = s.getGo();
		go.click();
		Thread.sleep(3000);
	}

	@Test
	public void test6() throws IOException, InterruptedException {
		AdactinBook b = new AdactinBook();
		WebElement firstname = b.getFirstname();
		sendData(firstname, workSheet("E:\\JavaSelinium\\Write.xlsx", "Sheet1", 1, 0));
		WebElement lastname = b.getLastname();
		sendData(lastname, workSheet("E:\\JavaSelinium\\Write.xlsx", "Sheet1", 1, 1));
		WebElement address = b.getAddress();
		sendData(address, workSheet("E:\\JavaSelinium\\Write.xlsx", "Sheet1", 1, 2));
		WebElement cardnum = b.getCardnum();
		sendData(cardnum, workSheet("E:\\JavaSelinium\\Write.xlsx", "Sheet1", 1, 3));
		WebElement cardtype = b.getCardtype();
		Select dropDown5 = b.dropDown(cardtype);
		dropDown5.selectByIndex(Integer.parseInt(workSheet("E:\\JavaSelinium\\Write.xlsx", "Sheet1", 1, 4)));
		WebElement expirymonth = b.getExpirymonth();
		Select dropDown4 = b.dropDown(expirymonth);
		dropDown4.selectByIndex(Integer.parseInt(workSheet("E:\\JavaSelinium\\Write.xlsx", "Sheet1", 1, 5)));
		WebElement expiryyear = b.getExpiryyear();
		Select dropDown6 = b.dropDown(expiryyear);
		dropDown6.selectByIndex(Integer.parseInt(workSheet("E:\\JavaSelinium\\Write.xlsx", "Sheet1", 1, 6)));
		WebElement cvvnum = b.getCvvnum();
		sendData(cvvnum, workSheet("E:\\JavaSelinium\\Write.xlsx", "Sheet1", 1, 7));
		WebElement booknow = b.getBooknow();
		booknow.click();
		Thread.sleep(3000);

	}

	@Test
	public void test7() throws IOException, InterruptedException {
		AdactinOrder o = new AdactinOrder();
		WebElement order = o.getOrder();
		String attributeValue = o.attributeValue(order);
		o.write("E:\\JavaSelinium\\TaskWrite.xlsx", "abcd", 0, 0, attributeValue);
		Thread.sleep(3000);

	}

	@AfterMethod
	public void test8() {
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println("============================");

	}

	@AfterClass
	public static void test9() {
		// driver.close();
	}

}
