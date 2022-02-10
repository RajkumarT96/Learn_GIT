package org.TestngParameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	static WebDriver driver;
	static Workbook w;

	public static void browserLaunch(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajkumar\\eclipse-workspace\\Chrome_Browser\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public WebElement locator(String type, String text) {
		if (type.equals("id")) {
			WebElement findElement = driver.findElement(By.id(text));
			return findElement;
		} else if (type.equals("name")) {
			WebElement findElement = driver.findElement(By.name(text));
			return findElement;
		} else {
			WebElement findElement = driver.findElement(By.xpath(text));
			return findElement;
		}
	}

	public static void sendData(WebElement locator, String text) {
		locator.sendKeys(text);
	}

	public static void submit(WebElement locator) {
		locator.click();
	}

	public Select dropDown(WebElement locator) {
		Select select = new Select(locator);
		return select;
	}

	public static void select(String text, Select dropDown, String data) {
		if (text.equals("value")) {
			dropDown.selectByValue(data);
		} else if (text.equals("visibleText")) {
			dropDown.selectByVisibleText(data);
		} else {
			int parseInt = Integer.parseInt(data);
			dropDown.selectByIndex(parseInt);
		}
	}

	public String attributeValue(WebElement locator) {
		String attribute = locator.getAttribute("value");
		return attribute;
	}

	public static String workSheet(String path, String sheetName, int rownum, int cellnum) throws IOException {
		File f = new File(path);
		FileInputStream stream = new FileInputStream(f);
		w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		if (cell.getCellType() == 0) {
			double cellValue = cell.getNumericCellValue();
			long l = (long) cellValue;
			String data = Long.toString(l);
			return data;
		} else if (cell.getCellType() == 1) {
			String data = cell.getStringCellValue();
			return data;
		} else {
			Date date = cell.getDateCellValue();
			SimpleDateFormat type = new SimpleDateFormat("dd/MM/yyyy");
			String format = type.format(date);
			return format;
		}
	}

	public static String write(String path, String sheetName, int row, int cell, String data) throws IOException {
		File file = new File(path);
		Workbook w = new XSSFWorkbook();
		Sheet createSheet2 = w.createSheet(sheetName);
		Row createRow = createSheet2.createRow(row);
		Cell createCell = createRow.createCell(cell);
		createCell.setCellValue(data);
		FileOutputStream str = new FileOutputStream(file);
		w.write(str);
		return data;
		

	}
}