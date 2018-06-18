package com.mercury.demo.utils.Elements;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;


public class Radio implements IRadio {
	
	private WebElement element;

	public Radio(WebElement element) {
		this.element = element;
		if (!isRadioButton())
			throw new RuntimeException("not a button");
	}

	private boolean isRadioButton() {
		List<String> tags = Arrays.asList("input", "button");
		return tags.contains(this.element.getTagName());
	}

	@Override
	public WebElement getSelectedButton() {
		return this.getSelectedButton();
	}

	@Override
	public boolean hasSelectedButton() {
		return this.hasSelectedButton();
	}

	@Override
	public void selectByValue(String value) {
		this.selectByValue(value);
	}

	@Override
	public void selectByIndex(int index) {
		this.selectByIndex(index);
	}

	@Override
	public void selectButton(WebElement radioButton) {
		this.selectButton(radioButton);
	}

}
