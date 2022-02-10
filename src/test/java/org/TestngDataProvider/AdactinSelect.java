package org.TestngDataProvider;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinSelect extends Base{
	public AdactinSelect() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement select;
	@FindBy(id="continue")
	private WebElement go;
	public WebElement getSelect() {
		return select;
	}
	public WebElement getGo() {
		return go;
	}
	

}
