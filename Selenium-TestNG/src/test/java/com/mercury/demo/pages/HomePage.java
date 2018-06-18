package com.mercury.demo.pages;

import org.openqa.selenium.By;
import com.mercury.demo.utils.Driver.BrowserDriver;
import com.mercury.demo.utils.Elements.Button;
import com.mercury.demo.utils.Elements.Link;
import com.mercury.demo.utils.Elements.TextBox;

public class HomePage {
	private BrowserDriver driver;
	private final String URL = "http://newtours.demoaut.com/";
	private final By REGISTER_URL = By.xpath("//a[text()='REGISTER']");
	private final By USERNAME = By.name("userName");
	private final By PASSWORD = By.name("password");
	private final By SUBMIT = By.name("login");

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

	public FlightFinderPage toMercuryTours(String usrname, String passwd) {
		TextBox userName = new TextBox(driver.findElement(USERNAME));
		userName.type(usrname);
		TextBox password = new TextBox(driver.findElement(PASSWORD));
		password.type(passwd);
		Button submit = new Button(driver.findElement(SUBMIT));
		submit.click();
		return new FlightFinderPage(this.driver);

	}
}
