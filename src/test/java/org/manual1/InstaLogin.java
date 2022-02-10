package org.manual1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstaLogin extends Base {
	public InstaLogin() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	private WebElement username;

	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//div[text()='Log In']")
	private WebElement submit;

	@FindBy(name="username")
	private WebElement username1;

	@FindBy(name="password")
	private WebElement password1;
	
	@FindBy(xpath="//div[text()='Log In']")
	private WebElement submit1;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getUsername1() {
		return username1;
	}

	public WebElement getPassword1() {
		return password1;
	}

	public WebElement getSubmit1() {
		return submit1;
	}

	

	}