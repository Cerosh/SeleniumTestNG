package com.mercury.demo.pages;

import org.openqa.selenium.By;

import com.mercury.demo.utils.Driver.BrowserDriver;
import com.mercury.demo.utils.Elements.ListBox;
import com.mercury.demo.utils.Elements.Radio;

public class FlightFinderPage {
private BrowserDriver driver;
private final String TITLE = "Find a Flight: Mercury Tours:";
private final By TTYPE = By.name("tripType");
private final By PASSENGERS = By.name("passCount");
private final By DEPARTING = By.name("fromPort");
private final By ARRIVING = By.name("toPort");

	public FlightFinderPage(BrowserDriver driver) {
		this.driver = driver;
		if (this.driver.titleContains(TITLE) == false)
			throw new RuntimeException("Flight Finder page is not displayed");
	}

	public void enterFlightDetails(int type, int passenger,  String departing,  String arriving) {
		Radio tType = new Radio(driver.findElement(TTYPE));
		tType.selectByIndex(type);
		ListBox psngrCount = new ListBox(driver.findElement(PASSENGERS));
		psngrCount.selectByIndex(passenger);
		ListBox departingFrom = new ListBox(driver.findElement(DEPARTING));
		departingFrom.select(departing);
		ListBox arrivingAt = new ListBox(driver.findElement(ARRIVING));
		arrivingAt.selectByVisibleText(arriving);
		
		
		
		
	}

}
