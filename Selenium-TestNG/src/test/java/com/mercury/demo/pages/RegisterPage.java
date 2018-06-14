package com.mercury.demo.pages;

import com.mercury.demo.utils.Driver.BrowserDriver;

public class RegisterPage {
	private BrowserDriver driver;
	private final String URL = "http://newtours.demoaut.com/mercuryregister.php";

	public RegisterPage(BrowserDriver driver) {
		this.driver = driver;
		if (this.driver.urlContains(URL) == false)
			throw new RuntimeException("Registration page is not displayed!");
	}

}
