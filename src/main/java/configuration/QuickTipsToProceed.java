package configuration;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Shady Ahmed Mohamed
 *
 */
public class QuickTipsToProceed {

	static String message;

	public static void main(String[] args) {
		message = "Welcome to Quick Guide, Press OK to continue";

		if (showMessage() == JOptionPane.OK_OPTION) {
			message = "Firstly , Please add your apk file below src folder ";

			if (showMessage() == JOptionPane.OK_OPTION) {
				message = "Secondly ,Please add app name and device name in general properties file below properties folder";
				if (showMessage() == JOptionPane.OK_OPTION) {
					message = "Thirdly , add your page object models below pom folder";
					if (showMessage() == JOptionPane.OK_OPTION) {
						message = "Fourthly, define page object in classproperties file below main folder";
						if (showMessage() == JOptionPane.OK_OPTION) {
							message = "Then, declare your defined obects in class properties in Main Class below main folder";
							if (showMessage() == JOptionPane.OK_OPTION) {
								message = "Note , declare your objcts in prepare method in Main Class";
								if (showMessage() == JOptionPane.OK_OPTION) {
									message = "Then, you can add your test cases in test_cases folder with availability to use TestNG";
									if (showMessage() == JOptionPane.OK_OPTION) {
										message = "Finally, add your test class in testng.xml file";
										if (showMessage() == JOptionPane.OK_OPTION) {
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	private static int showMessage() {
		return JOptionPane.showOptionDialog(new JFrame(), message, "Quick Tips to Use Framework", JOptionPane.OK_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, new Object[] { "OK" }, JOptionPane.YES_OPTION);
	}

}
