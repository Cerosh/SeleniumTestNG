package com.mercury.demo.tests;

import java.util.HashMap;
import java.util.Map;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.mercury.demo.pages.HomePage;
import com.mercury.demo.pages.RegisterPage;

public class RegistrationTest extends BaseTest {

	ContactInformation contactInformation = new ContactInformation(new FName("Cerosh"), new LName("Jacob"),
			new Phone("12321321"), new Email("cerosh@gmail.com"));
	MailingInformation mailingInformation = new MailingInformation(new Address("Address"), new City("Newcastle"),
			new State("New South Walse"), new PostalCode("2305"), new Country("AUSTRALIA"));
	UserInformation userInformation = new UserInformation(new UserName("Cerosh"), new Password("password"));
	RegisterationDetails withRegisterationDetails = new RegisterationDetails(contactInformation, mailingInformation,
			userInformation);

	@Test
	public void registerAUserwithHashMap() {
		Map<String, String> withHashMap = new HashMap<String, String>();
		withHashMap.put("FName", "Simi");
		withHashMap.put("LName", "Kurup");
		withHashMap.put("Phone", "2231231231");
		withHashMap.put("Email", "simicerosh@gmail.com");
		withHashMap.put("Address", "Address value");
		withHashMap.put("City", "Dubai");
		withHashMap.put("State", "Dubai");
		withHashMap.put("Postal Code", "686");
		withHashMap.put("Country", "UNITED ARAB EMIRATES");
		withHashMap.put("UserName", "Simi");
		withHashMap.put("Password", "password");

		HomePage navigate = mercuryHomePage();
		RegisterPage registerPage = navigate.toRegisterPage();
		registerPage.registerAccountDetails(withHashMap);
		Assert.assertTrue(registerPage.pageTitle());
	}

	@Test
	public void registerAUser() {
		HomePage navigate = mercuryHomePage();
		RegisterPage registerPage = navigate.toRegisterPage();
		registerPage.registerAccount(withRegisterationDetails);
		Assert.assertTrue(registerPage.pageTitle());
	}
}
