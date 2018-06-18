package com.mercury.demo.utils.Elements;

import org.openqa.selenium.WebElement;

public interface IRadio {
	public WebElement getSelectedButton();

	public boolean hasSelectedButton();

	public void selectByValue(String value);

	public void selectByIndex(int index);

	public void selectButton(WebElement button);
}
