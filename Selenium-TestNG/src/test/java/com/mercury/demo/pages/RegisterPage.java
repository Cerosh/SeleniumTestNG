package com.mercury.demo.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;

import com.mercury.demo.tests.RegisterationDetails;
import com.mercury.demo.utils.Driver.BrowserDriver;
import com.mercury.demo.utils.Elements.Button;
import com.mercury.demo.utils.Elements.ListBox;
import com.mercury.demo.utils.Elements.TextBox;

public class RegisterPage {
	private BrowserDriver driver;
	private final String URL = "http://newtours.demoaut.com/mercuryregister.php";
	private final By FIRSTNAME = By.name("firstName");
	private final By LASTNAME = By.name("lastName");
	private final By PHONE = By.name("phone");
	private final By EMAIL = By.id("userName");
	private final By ADDRESS = By.name("address1");
	private final By CITY = By.name("city");
	private final By STATE = By.name("state");
	private final By POSTALCODE = By.name("postalCode");
	private final By COUNTRY = By.name("country");
	private final By USERNAME = By.name("email");
	private final By PASSWORD = By.name("password");
	private final By CONFIRMPASSWORD = By.name("confirmPassword");
	private final By SUBMIT = By.name("register");
	private final String PAGETITLE="Register: Mercury Tours";

	public RegisterPage(BrowserDriver driver) {
		this.driver = driver;
		if (this.driver.urlContains(URL) == false)
			throw new RuntimeException("Registration page is not displayed!");
	}

	public void registerAccount(RegisterationDetails registerationDetails) {
		List<String> contactInformation = Arrays
				.asList(registerationDetails.getContactInformation().toString().split(","));
		List<String> mailingInformation = Arrays
				.asList(registerationDetails.getMailingInformation().toString().split(","));
		List<String> userInformation = Arrays.asList(registerationDetails.getUserInformation().toString().split(","));
		
		TextBox firstName = new TextBox(driver.findElement(FIRSTNAME));
		firstName.type(contactInformation.get(0));
		TextBox lastName = new TextBox(driver.findElement(LASTNAME));
		lastName.type(contactInformation.get(1));
		TextBox phone = new TextBox(driver.findElement(PHONE));
		phone.type(contactInformation.get(2));
		TextBox email = new TextBox(driver.findElement(EMAIL));
		email.type(contactInformation.get(3));
		TextBox address = new TextBox(driver.findElement(ADDRESS));
		address.type(mailingInformation.get(0));
		TextBox city = new TextBox(driver.findElement(CITY));
		city.type(mailingInformation.get(1));
		TextBox state = new TextBox(driver.findElement(STATE));
		state.type(mailingInformation.get(2));
		TextBox postalCode = new TextBox(driver.findElement(POSTALCODE));
		postalCode.type(mailingInformation.get(3));
		ListBox country = new ListBox(driver.findElement(COUNTRY));
		country.selectByVisibleText(mailingInformation.get(4));
		TextBox username = new TextBox(driver.findElement(USERNAME));
		username.type(userInformation.get(0));
		TextBox password = new TextBox(driver.findElement(PASSWORD));
		password.type(userInformation.get(1));
		TextBox confirmPassword = new TextBox(driver.findElement(CONFIRMPASSWORD));
		confirmPassword.type(userInformation.get(1));
		Button submitButton = new Button(driver.findElement(SUBMIT));
		submitButton.click();
	}
	
	public Boolean pageTitle() {
		return driver.getTitle().contains(PAGETITLE);
	}

}
