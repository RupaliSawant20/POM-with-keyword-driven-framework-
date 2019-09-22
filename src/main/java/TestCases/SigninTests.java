package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Components.SignIn.LoginOrSignInPage;
import Keywords.Keyword;

public class SigninTests extends Keyword{
	@Test
	public void test_verify_login_with_invalid_credentials(){
	
		LoginOrSignInPage login=PageFactory.initElements(driver, LoginOrSignInPage.class);
		openBrowser("Chrome");
		openURL("https://www.facebook.com");
		login.enterEmailOrPhone("rupali@gmail");
		login.enterPassword("rupali");
		login.clickOnLoginButton();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
