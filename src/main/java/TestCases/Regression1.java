package TestCases;

import org.testng.annotations.Test;

import Keywords.Keyword1;

public class Regression1 {
	@Test
	public void Test_01() {
		Keyword1.openBrowser("Chrome");
		Keyword1.openURL("https://www.swiggy.com");
		Keyword1.enterText("css","#location", "Pune");
		Keyword1.clickOnButton("css",".r2iyh");
		Keyword1.enterText("css","#mobile" ,"9730219262");
		Keyword1.enterText("css", "#name","Rupali");
		Keyword1.enterText("css", "#email","rupa@gmail.com");
		Keyword1.enterText("css", "#password", "rupali20");
		Keyword1.clickOnButton("css",".a-ayg");
	}

}

