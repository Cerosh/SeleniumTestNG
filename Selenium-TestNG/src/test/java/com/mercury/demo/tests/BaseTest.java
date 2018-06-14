package com.mercury.demo.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.mercury.demo.pages.HomePage;
import com.mercury.demo.utils.Driver.BrowserDriver;

public class BaseTest {

	private BrowserDriver driver;
	private final String URL = "http://newtours.demoaut.com/";

	@BeforeMethod
	public void setUp() {
		driver = new BrowserDriver("chrome");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	public HomePage openMercuryHomePage() {
		this.driver.get(URL);
		return new HomePage(this.driver);
	}

}
