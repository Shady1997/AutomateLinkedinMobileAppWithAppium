package main;

import pom.HomePage;
import utility.Utility;

import java.io.IOException;

import org.testng.Assert;

import capabilities.Capabilities;

public class Main extends Capabilities {

	public void prepare() throws IOException {
		// TODO start application with appium
		driver = baseCapabilities("AppName");
		// TODO Declare pom objects
		homePage = new HomePage(driver);
		// TODO take screenshot
		Utility.captureScreenshot(driver, "homepage");
	}

	public void simpleMethod() throws InterruptedException {
		// TODO Simple Example
		homePage.loginButton.click();
		Thread.sleep(6000);
		homePage.userName.sendKeys("shadyahmed01091997@outlook.com");
		Thread.sleep(4000);
		homePage.password.sendKeys("P@ssw0rd#11");
		Thread.sleep(4000);
		homePage.continueButton.click();
		Thread.sleep(6000);
		// TODO take screenshot at any phase
//		Utility.captureScreenshot(driver, "HomePage");
		// TODO Simple Example to validate result
		Assert.assertEquals(false, false);
	}

	public void TearDown() {
		// TODO close driver and shutdown
		driver.quit();
	}
}
