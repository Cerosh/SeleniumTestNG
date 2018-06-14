package com.mercury.demo.tests;

import org.testng.annotations.Test;

import com.mercury.demo.pages.HomePage;
import com.mercury.demo.pages.RegisterPage;

public class RegistrationTest extends BaseTest {

	@Test
	public void registerAUser() {
		HomePage navigating = openMercuryHomePage();
		@SuppressWarnings("unused")
		RegisterPage register = navigating.ToRegisterPage();

	}
}
