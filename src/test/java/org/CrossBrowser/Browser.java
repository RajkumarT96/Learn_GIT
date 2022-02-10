package org.CrossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	@Parameters({"browser"})
	@Test
	private void tc1(String browser) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.instagram.com/accounts/login/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement txtUser = driver.findElement(By.name("username"));
			txtUser.sendKeys("ramss");
		}
		else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.instagram.com/accounts/login/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement txtUser = driver.findElement(By.name("username"));
			txtUser.sendKeys("ramss");
		}
		else {
			WebDriverManager.iedriver().setup();
			WebDriver driver = new InternetExplorerDriver();
			driver.get("https://www.instagram.com/accounts/login/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement txtUser = driver.findElement(By.name("username"));
			txtUser.sendKeys("ramss");
		}

	}

}
