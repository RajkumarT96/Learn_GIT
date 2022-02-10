package org.brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngBroken {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int brokenLinkCount = 0;
		// iterate
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		for (int i = 0; i < links.size(); i++) {
			WebElement link = links.get(i);
			String attribute = link.getAttribute("href");
			// convert a string into link
			URL u = new URL(attribute);

			// to establish connection for link
			URLConnection openConnection = u.openConnection();

			// to get the responseCode
			HttpURLConnection s = (HttpURLConnection) openConnection;
			int responseCode = s.getResponseCode();

			if (responseCode >= 400&& responseCode < 500) {
				System.out.println(responseCode);
				System.out.println(attribute+" brokenlink");
				brokenLinkCount++;
//				System.out.println(u);

			}

		}
		System.out.println("The number of broken links are = " + brokenLinkCount);
		driver.close();
	}

}
