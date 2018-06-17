package com.mercury.demo.pages;

import org.openqa.selenium.By;
import com.mercury.demo.utils.Driver.BrowserDriver;
import com.mercury.demo.utils.Elements.Link;

public class HomePage {
	private BrowserDriver driver;
	private final String URL = "http://newtours.demoaut.com/";
	private final By REGISTER_URL = By.xpath("//a[text()='REGISTER']");

	public HomePage(BrowserDriver driver) {
		this.driver = driver;
		if (this.driver.urlIs(URL) == false)
			throw new RuntimeException("home page is not displayed");
	}

	public RegisterPage toRegisterPage() {
		Link registrationLink = new Link(driver.findElement(REGISTER_URL));
		registrationLink.click();
		return new RegisterPage(this.driver);

	}
}
