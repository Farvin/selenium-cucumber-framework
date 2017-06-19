package pages;

import org.openqa.selenium.By;

public class ProductPage extends Page{
	
	By productTitle = By.xpath(".//h1[@class='prodtitle']");
	By addToCartBtn = By.xpath(".//input[@class='wpsc_buy_button']");
	By goToCheckoutLink = By.xpath(".//div/a[@class='go_to_checkout']");
	
	public String getProductTitle(){
		waitForElement(productTitle, 30);
		return driver.findElement(productTitle).getText();
	}
	
	public ProductPage clickAddToCartButton() {
		driver.findElement(addToCartBtn).click();
		return new ProductPage();
	}

	public CartPage clickGoToCheckout() {
		waitForElement(goToCheckoutLink, 60);
		driver.findElement(goToCheckoutLink).click();
		return new CartPage();
	}
	
	public ProductPage goTo(String URL){
		driver.get(URL);
		return new ProductPage();
	}
	

}
