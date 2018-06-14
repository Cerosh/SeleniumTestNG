package com.mercury.demo.utils.Driver;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class BrowserDriver implements WebDriver {
	private String browserName;
	private WebDriver driver;

	private int timeout = 10;

	public BrowserDriver(String browserName) {
		this.browserName = browserName.toLowerCase();
		this.driver = getDriver();
	}

	public WebDriver wrappedDriver() {
		return this.driver;
	}

	public JavascriptExecutor jsExecutor() {
		return (JavascriptExecutor) this.driver;
	}

	private WebDriver getDriver() {

		if (browserName().equalsIgnoreCase("chrome")) {
			return new ChromeDriver();
		}
		throw new IllegalArgumentException("unknown browser: " + browserName());

	}

	private String browserName() {
		return this.browserName;
	}

	public void get(String url) {
		this.driver.get(url);

	}

	public String getCurrentUrl() {
		return this.driver.getCurrentUrl();
	}

	public String getTitle() {
		return this.driver.getTitle();
	}

	public List<WebElement> findElements(By by) {
		return this.driver.findElements(by);
	}

	public WebElement findElement(By by) {
		return explicitWait().until(visibilityOfElementLocated(by));
	}

	public WebElement findElementClickable(By by) {
		return explicitWait().until(elementToBeClickable(by));
	}

	public WebElement findElementPresent(By by) {
		return explicitWait().until(presenceOfElementLocated(by));
	}

	private WebDriverWait explicitWait() {
		return new WebDriverWait(driver, timeout);
	}

	public String getPageSource() {
		return this.driver.getPageSource();
	}

	public void close() {
		this.driver.close();

	}

	public void quit() {
		this.driver.quit();

	}

	public Set<String> getWindowHandles() {
		return this.driver.getWindowHandles();
	}

	public String getWindowHandle() {
		return this.driver.getWindowHandle();
	}

	public TargetLocator switchTo() {
		return this.driver.switchTo();
	}

	public Navigation navigate() {
		return this.driver.navigate();
	}

	public Options manage() {
		return this.driver.manage();
	}

	public void goBack() {
		this.driver.navigate().back();
	}

	public void scrollToBottom() {
		jsExecutor().executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void scrollToTop() {
		jsExecutor().executeScript("window.scrollTo(0, 0)");
	}

	public void scrollToTitle(WebElement element) {
		jsExecutor().executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public boolean urlContains(String keyword) {
		return explicitWait().until(ExpectedConditions.urlContains(keyword));
	}

	public boolean urlIs(String url) {
		return explicitWait().until(ExpectedConditions.urlToBe(url));
	}

	public boolean titleContains(String keyword) {
		return explicitWait().until(ExpectedConditions.titleContains(keyword));
	}

	public boolean titleIs(String url) {
		return explicitWait().until(ExpectedConditions.titleIs(url));
	}
}