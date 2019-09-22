package Keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Keyword {
	public static RemoteWebDriver driver=null;

	/**
	 * It opens specified browser.
	 * @param browserName should only include Chrome, Firefox.
	 * No browser apart from mentioned is allowed
	 */
	public static void openBrowser(String browserName) {
		switch (browserName) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver","D:\\Rupali\\Chrome\\chromedriver.exe" );
			driver=new ChromeDriver();
			break;
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "D:\\Rupali\\Firefox\\geckodriver.exe");
			driver=new FirefoxDriver();
			break;

		default:
			break;
		}
	}
	/**
	 * It opens specified url in web browser recently opened by driver instance
	 * @param url {@code String} url to open
	 * @return void
	 */
	public static void openURL(String url) {
		driver.get(url);
	}
	
	/**
	 * This method get Title of specified web page.
	 * @return {@code String}
	 */
	public static String getTitle() {
		return driver.getTitle();
	}
	
	/**
	 * This method return specified web element from specified browser
	 * @param locatorType should include css,xpath
	 * @param locatorValue 
	 * @return web element
	 */
	public static WebElement getWebElement(String locatorType, String locatorValue) {
		WebElement element=null;
	switch (locatorType) {
	case "css":
		element=driver.findElementByCssSelector(locatorValue);
		break;
	case "xpath":
		element=driver.findElementByXPath(locatorValue);
		break;

	default:
		break;
	
	}
	return element;
	}
	
	public static void enterText(String locatorType, String locatorValue,String textToEnter) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getWebElement(locatorType,locatorValue).sendKeys(textToEnter);
	}
	
	public static void clickOnButton(String locatorType, String locatorValue) {
		getWebElement(locatorType,locatorValue).click();
	}
	public static void selectValueFromDropDown(String locatorType,String locatorValue,String textToSelect) {
		WebElement element=getWebElement(locatorType, locatorValue);
		Select select=new Select(element);
		select.selectByVisibleText(textToSelect);
		
	}
	public static void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	public static void closeBrowser() {
		driver.close();
	}
	public static void closeAllBrowser() {
		driver.quit();

	}
}
