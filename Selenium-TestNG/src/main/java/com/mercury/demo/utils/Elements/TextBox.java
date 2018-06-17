package com.mercury.demo.utils.Elements;

import java.util.Arrays;
import java.util.List;


import org.openqa.selenium.WebElement;

public class TextBox implements ITextBox {

	private WebElement element;

	public TextBox(WebElement element) {
		this.element = element;

		if (!isTextBox())
			throw new RuntimeException("not a textbox");
	}

	private boolean isTextBox() {
		List<String> tags = Arrays.asList("input", "textarea");
		return tags.contains(this.element.getTagName());
	}

	@Override
	public String getText() {
		if (!this.element.getAttribute("value").isEmpty())
			return this.element.getAttribute("value");
		return this.element.getText();
	}

	@Override
	public void clear() {
		if (!isEnabled())
			throw new RuntimeException("textbox not enabled!");
		this.element.clear();

	}

	@Override
	public void click() {
		if (!isEnabled())
			throw new RuntimeException("textbox not enabled!");
		this.element.click();

	}

	@Override
	public boolean isDisplayed() {
		return this.element.isDisplayed();
	}

	@Override
	public boolean isEnabled() {
		return this.element.isEnabled();
	}

	@Override
	public void type(String... keyword) {
		if (!isEnabled())
			throw new RuntimeException("textbox not enabled!");
		this.element.clear();
		this.element.sendKeys(keyword);

	}

}
