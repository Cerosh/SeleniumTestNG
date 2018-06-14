package com.mercury.demo.utils.Elements;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Link {
	private WebElement element;

	public Link(WebElement element) {
		this.element = element;

		if (!isLink())
			throw new RuntimeException("not a Link");
	}

	private boolean isLink() {
		List<String> tags = Arrays.asList("a", "href");

		return tags.contains(this.element.getTagName());
	}

	public void click() {
		if (!this.isEnabled())
			throw new RuntimeException("Link is not enabled!");

		this.element.click();
	}

	public boolean isDisplayed() {
		return this.element.isDisplayed();
	}

	public boolean isEnabled() {
		return this.element.isEnabled();
	}
}
