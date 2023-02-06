package main;

import pom.HomePage;
import utility.Utility;

import java.io.IOException;
import java.time.Duration;

import io.appium.java_client.MobileElement;
//import touchactions libraries
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import org.openqa.selenium.Dimension;
import org.testng.Assert;

import capabilities.Capabilities;

public class Main extends Capabilities {

	public static void main(String[] args) throws IOException, InterruptedException {
		prepare();
		simpleMethod();
		TearDown();
	}

	public static void prepare() throws IOException {
		// TODO start application with appium
		driver = baseCapabilities("AppName");
		// TODO Declare pom objects
		homePage = new HomePage(driver);
		// TODO take screenshot
		Utility.captureScreenshot(driver, "homepage");
	}

	public static void simpleMethod() throws InterruptedException {
		// TODO Simple Example
//		homePage.loginButton.click();
//		Thread.sleep(6000);
//		homePage.userName.sendKeys("shadyahmed01091997@outlook.com");
//		Thread.sleep(4000);
//		homePage.password.sendKeys("P@ssw0rd#11");
//		Thread.sleep(4000);
//		homePage.continueButton.click();
		Thread.sleep(9000);
		System.out.println("first");
		driver.findElementByXPath("//android.widget.Button[@text='Follow']").click();
//		homePage.element.click();
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(textContains(\"Recommended\"));").click();
//		driver.findElementsByClassName("android.widget.LinearLayout").get(1).click();
//		;
//		Thread.sleep(9000);
//		System.out.println("second");
//		driver.findElementsByClassName("android.widget.Button").get(2).click();
//		;
		Thread.sleep(9000);
		// TODO take screenshot at any phase
//		Utility.captureScreenshot(driver, "HomePage");
		// TODO Simple Example to validate result
//		Assert.assertEquals(false, false);
	}

	public static void TearDown() {
		// TODO close driver and shutdown
		driver.quit();
	}
}
