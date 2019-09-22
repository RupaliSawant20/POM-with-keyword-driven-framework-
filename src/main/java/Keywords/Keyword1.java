package Keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Keyword1 {
	private static RemoteWebDriver driver=null;
	public static void openBrowser(String browserName) {
		switch (browserName) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "D:\\Rupali\\Chrome\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "D:\\\\Rupali\\\\Firefox\\\\geckodriver.exe");
			driver=new FirefoxDriver();
		default:
			break;
		}

	}
	public static void openURL(String url) {
		driver.get(url);

	}
	public static WebElement getWebElement(String locatorType,String locatorValue) {
		
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
	public static void enterText(String locatorType,String locatorValue,String enterText) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		getWebElement(locatorType, locatorValue).sendKeys(enterText);
	}
	public static void clickOnButton(String locatorType,String locatorValue) {
		getWebElement(locatorType, locatorValue).click();
	}
	
}
