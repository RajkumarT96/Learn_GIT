package org.TestngDataProvider;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinBook extends Base {

	public AdactinBook() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private static WebElement firstname;
	@FindBy(id = "last_name")
	private WebElement lastname;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(id = "cc_num")
	private WebElement cardnum;
	@FindBy(id = "cc_type")
	private WebElement cardtype;
	@FindBy(id = "cc_exp_month")
	private WebElement expirymonth;
	@FindBy(id = "cc_exp_year")
	private WebElement expiryyear;
	@FindBy(id = "cc_cvv")
	private WebElement cvvnum;
	@FindBy(id = "book_now")
	private WebElement booknow;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardnum() {
		return cardnum;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getCvvnum() {
		return cvvnum;
	}

	public WebElement getBooknow() {
		return booknow;
	}

}
