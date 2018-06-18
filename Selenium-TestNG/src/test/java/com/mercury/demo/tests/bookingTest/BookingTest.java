package com.mercury.demo.tests.bookingTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.mercury.demo.pages.FlightFinderPage;
import com.mercury.demo.pages.HomePage;
import com.mercury.demo.tests.BaseTest;

public class BookingTest extends BaseTest{
	private final String UNAME = "cerosh";
	private final String PASSWD = "password";
	
	@DataProvider(name="FlightDetails")
	public static Object[][] dataFlightDetails()
	{
		return new Object[][] {{1,2, "London", "Sydney"}};
	}
	
	@Test (dataProvider = "FlightDetails")
	public void makeABooking(final int TYPE, final int PASSENGERS, final String DEPARTING, final String ARRIVING) {
		HomePage signIn = mercuryHomePage();
		FlightFinderPage flightFinderPage = signIn.toMercuryTours(UNAME,PASSWD);
		flightFinderPage.enterFlightDetails(TYPE, PASSENGERS, DEPARTING, ARRIVING);
	}

}
