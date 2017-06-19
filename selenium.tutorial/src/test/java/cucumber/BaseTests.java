package cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.HomePage;
import utils.Links;

public class BaseTests {
	
	protected static WebDriver driver;
	
	public static void launchApplication() {
		System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(Links.HOME_PAGE);
		HomePage.setHomePageTitle(driver.getTitle());
	}

	public static void closeBrowser() {
		driver.quit();
		
	}

	public static WebDriver getWebDriver() {
		return driver;
	}
	
	

}
