package capabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import main.ClassProperties;

public class Capabilities extends ClassProperties {

	public static AndroidDriver<AndroidElement> baseCapabilities(String appNAme) throws IOException {
		// TODO Access properties file to read general properties
		// to list all installed apps : adb shell pm list packages //to get launch activity 1- adb shell 2- dumpsys package | grep -Eo "^[[:space:]]+[0-9a-f]+[[:space:]]+com.akelnifood.delivery/[^[:space:]]+" | grep -oE "[^[:space:]]+$"
		FileInputStream readProperty = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\properties\\generalProperties.properties");
		Properties prop = new Properties();
		prop.load(readProperty);

		// TODO set capabilities to connect and run apk
		File appDir = new File("src");
		File app = new File(appDir, prop.getProperty(appNAme));

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, prop.getProperty("DeviceName"));

		desiredCapabilities.setCapability("appPackage", "com.linkedin.android");
		
		desiredCapabilities.setCapability("appActivity",".authenticator.LaunchActivity");
		
//		desiredCapabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

		desiredCapabilities.setCapability("noSign", true);
		
//		desiredCapabilities.setCapability("autoGrantPermissions", "true");
		
//		desiredCapabilities.setCapability("autoDismissAlerts", "true");
		
//		desiredCapabilities.setCapability("disable-popup-blocking", "true");
		
		desiredCapabilities.setCapability("noReset", true);
//		desiredCapabilities.setCapability("fullReset", false);

		driver = new AndroidDriver<AndroidElement>(new URL(prop.getProperty("DeviceURL")), desiredCapabilities);

//		driver.resetApp();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

}
