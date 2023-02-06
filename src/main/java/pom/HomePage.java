package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {

	public HomePage(AppiumDriver driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))"
			+ ".scrollIntoView(new UiSelector().textContains(\"part_text\"))")
	public MobileElement element;

	// Home Page Buttons (Singin , Sign up)
	@AndroidFindBy(xpath = "//android.widget.Button[@index='2']")
	public WebElement loginButton;

	@AndroidFindBy(xpath = "(//android.widget.EditText[@index='0'])[1]")
	public WebElement userName;

	@AndroidFindBy(xpath = "(//android.widget.EditText[@index='0'])[2]")
	public WebElement password;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
	public WebElement continueButton;
}
