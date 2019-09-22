package Components.SignIn;

import org.openqa.selenium.WebElement;

import Keywords.Keyword;

public class LoginOrSignInPage {
	public WebElement logo;
	public WebElement emailOrPhone;
	public WebElement passwd;
	public WebElement loginButton;
	
	public void clickOnLogoButton() {
		logo=Keyword.getWebElement("css",".fb_logo");
		logo.click();
	}
	public void enterEmailOrPhone(String emailOrphone) {
		emailOrPhone=Keyword.getWebElement("css", "#email");
		emailOrPhone.sendKeys(emailOrphone);
	}
	public void enterPassword(String pass) {
		passwd=Keyword.getWebElement("css","#pass");
		passwd.sendKeys(pass);

	}
	public void clickOnLoginButton() {
		loginButton=Keyword.getWebElement("xpath","//*[@value=\"Log In\"]");
		loginButton.click();

	}

}
