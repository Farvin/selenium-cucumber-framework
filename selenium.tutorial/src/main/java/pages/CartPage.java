package pages;

import org.openqa.selenium.By;

public class CartPage extends Page{
	
	By productTitle = By.xpath(".//td[contains(@class, 'wpsc_product_name')]/a");

	public String getProductTitle() {
		waitForElement(productTitle, 30);
		return driver.findElement(productTitle).getText();
	}
	
	

}
