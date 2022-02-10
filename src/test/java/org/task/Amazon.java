package org.task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		WebElement txtSearch = driver.findElement(By.xpath("//input[@name='field-keywords']"));
		txtSearch.sendKeys("iphone", Keys.ENTER);

		WebElement lnkStar = driver
				.findElement(By.xpath("//span[text()='New Apple iPhone 12 Pro (128GB) - Pacific Blue']"
						+ "//parent::a[@class='a-link-normal a-text-normal']//parent::h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"
						+ "//parent::div[@class='a-section a-spacing-none']//parent::div[@class='a-section a-spacing-none']"
						+ "//child::div[@class='a-section a-spacing-none a-spacing-top-micro']"
						+ "//child::i[@class='a-icon a-icon-popover']"));
		Actions action = new Actions(driver);
		action.moveToElement(lnkStar).perform();
		lnkStar.click();

		WebElement txtRate = driver.findElement(
				By.xpath("//div[@class='a-fixed-left-grid-col a-col-left']//child::table[@id='histogramTable']"
						+ "//child::td[@class='a-text-right a-nowrap']//child::span[@class='a-size-base']"
						+ "//child::a[@title='79% of reviews have 5 stars']"));
		String text = txtRate.getText();
		System.out.println(text);
		driver.close();

	}

}
