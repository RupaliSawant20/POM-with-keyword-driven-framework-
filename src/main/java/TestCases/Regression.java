package TestCases;

import org.testng.annotations.Test;
import java.util.Properties;

import org.testng.annotations.Test;

import FileUtility.Locator;
import FileUtility.PropertiesFile;
import Keywords.Keyword;

public class Regression extends Keyword {
	@Test
	public void test_verify_title_of_landing_page() {
		Locator locator = new Locator();
		openBrowser("Chrome");
		openURL("https://www.facebook.com");
		maximizeBrowser();
		// Keyword.clickOnButton("css",locator.login);
		// Assert.assertEquals(Keyword.getTitle(),"Facebook - log in or sign up","this
		// is not matched");
		enterText("css", locator.email, "firstuser");
		enterText("css", locator.passwd, "test@123");
		selectValueFromDropDown("css", locator.day, "2");
		selectValueFromDropDown("css", locator.month, "May");
		selectValueFromDropDown("css", locator.year, "1990");

	}

}
