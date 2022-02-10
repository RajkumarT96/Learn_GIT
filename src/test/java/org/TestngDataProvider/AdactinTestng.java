package org.TestngDataProvider;

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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdactinTestng extends Base {

	@Test(dataProvider = "SampleData")
	private static void enterText(String username, String password, String location, String hotels, String roomtype) throws InterruptedException {
		browserLaunch("https://adactinhotelapp.com/");
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println("============================");

		AdactinLogin l = new AdactinLogin();
		WebElement txtUsername = l.getUsername();
		sendData(txtUsername, username);
		WebElement txtPassword = l.getPassword();
		sendData(txtPassword, password);
		WebElement login2 = l.getLogin();
		login2.click();

		 AdactinDetails d = new AdactinDetails();
		 WebElement element = d.getLocation();
		 sendData(element, location);
		 WebElement getHotels = d.getHotels();
		 sendData(getHotels, hotels);
		 WebElement getRoomtype = d.getRoomtype();
		 sendData(getRoomtype, roomtype);
		// WebElement getRoomcount = d.getRoomcount();
		// Select dropDown = d.dropDown(getRoomcount);
		// dropDown.selectByIndex(Integer.parseInt(roomcount));
		// WebElement date1 = d.getDatain();
		// date1.clear();
		// sendData(date1, datein);
		// WebElement date2 = d.getDataout();
		// date2.clear();
		// sendData(date2, dateout);
		// WebElement dropAdult = d.getAdult();
		// Select dropDown2 = d.dropDown(dropAdult);
		// dropDown2.selectByIndex(Integer.parseInt(adult));
		// WebElement dropChild = d.getChild();
		// Select dropDown3 = d.dropDown(dropChild);
		// dropDown3.selectByIndex(Integer.parseInt(child));
		// WebElement btnSearch = d.getSearch();
		// btnSearch.click();
		// Thread.sleep(3000);

		Date d2 = new Date();
		System.out.println(d2);
	}

	@DataProvider(name = "SampleData")
	private static Object[][] data() throws IOException {
		return new Object[][] {

				{ workSheet(0, 0), workSheet(0, 1), workSheet(0, 2), workSheet(0, 3), workSheet(0,4)} };
	}

}
