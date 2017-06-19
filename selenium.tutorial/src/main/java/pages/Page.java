package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.BaseTests;

public class Page {
	
	protected static WebDriver driver = BaseTests.getWebDriver();
	
	By searchField = By.name("s");
	By numberOfItemsInCart = By.xpath(".//em[@class='count']");
	
	public SearchResultsPage searchProduct(String productName) {
		WebElement searchBox = driver.findElement(By.name("s"));
		searchBox.sendKeys(productName);
		searchBox.sendKeys(Keys.ENTER);
		return new SearchResultsPage();
	}
	
	public String getNumberOfItemsInCart() {
		String numberOfItems = driver.findElement(By.xpath(".//em[@class='count']")).getText();
		return numberOfItems.replaceAll("\\s", ""); 
		
	}
	
	public void waitForElement(By webElement, int time){
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.presenceOfElementLocated(webElement));
	}

	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public Page goTo(String URL){
		driver.get(URL);
		return new Page();
	}
}
