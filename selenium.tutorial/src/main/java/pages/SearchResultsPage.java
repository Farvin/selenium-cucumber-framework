package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends Page{

	By searchMessageDiv = By.xpath("//*[@id='content']/p");
	By productGrid = By.xpath(".//div[contains(@class, 'product_grid_display')]");
	By products = By.xpath(".//div[contains(@class, 'product_grid_item')]");
	By productTitle = By.xpath(".//h2[@class='prodtitle']/a");
	
	public SearchResultsPage() {
		
	}
	
	public boolean isProductListed(String productName) {
						
		waitForElement(productGrid, 30);
		
		List <WebElement> productList = driver.findElement(productGrid).findElements(products);
			
		for(WebElement product : productList){
			
			if(productName.equals(product.findElement(productTitle).getText())){
				return true;
			}
		}
				
		return false;
	}
	
	public boolean isSearchMessageDisplayed(String searchMessage){
		
		waitForElement(searchMessageDiv, 30);
		if(searchMessage.equals(driver.findElement(searchMessageDiv).getText()))
			return true;
		else
			return false;
	}

		

}
