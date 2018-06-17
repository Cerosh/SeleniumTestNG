package com.mercury.demo.utils.Elements;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Button implements IButton {
	private WebElement element;

	public Button(WebElement element) {
		this.element = element;
		if (!isButton())
			throw new RuntimeException("not a button");
	}

	private boolean isButton() {
		List<String> tags = Arrays.asList("input", "button");
		return tags.contains(this.element.getTagName());
	}

	@Override
	public void click() {
		if (!this.isEnabled())
			throw new RuntimeException("button not enabled!");
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

}
