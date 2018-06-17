package com.mercury.demo.tests;

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
	RegisterationDetails registerationDetails = new RegisterationDetails(contactInformation, mailingInformation,
			userInformation);

	@Test
	public void registerAUser() {
		HomePage navigating = openMercuryHomePage();
		RegisterPage registerPage = navigating.toRegisterPage();
		registerPage.registerAccount(registerationDetails);
		Assert.assertTrue(registerPage.validateTitle());
	}
}
