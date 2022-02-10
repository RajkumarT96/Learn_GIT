package org.TestngDataProvider;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinOrder extends Base {
	public AdactinOrder() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "order_no")
	private WebElement order;

	public WebElement getOrder() {
		return order;
	}

}
