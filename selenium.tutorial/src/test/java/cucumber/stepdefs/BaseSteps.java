package cucumber.stepdefs;

import pages.CartPage;
import pages.Page;
import pages.ProductPage;
import pages.SearchResultsPage;

public class BaseSteps {
	
	protected Page currentPage;
	protected SearchResultsPage searchResults;
	protected ProductPage productPage;
	protected CartPage cartPage;
	
	public BaseSteps(){
		this.currentPage = new Page();
		this.productPage = new ProductPage();
	}

}
