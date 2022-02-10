package org.task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		WebElement txtSearch = driver.findElement(By.xpath("//input[@name='field-keywords']"));
		txtSearch.sendKeys("iphone", Keys.ENTER);

		WebElement lnkStar = driver.findElement(
				By.xpath("//span[text()='Internal Memory']//parent::div[@id='p_n_feature_eight_browse-bin-title']"
						+ "//following::ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-medium']"
						+ "//child::li[@id='p_n_feature_eight_browse-bin/8561117031']//child::span[@class='a-size-base a-color-base']"));
		Actions action = new Actions(driver);
		action.moveToElement(lnkStar).perform();
		String text = lnkStar.getText();
		lnkStar.click();
		System.out.println(text);
	}

}
