package cucumber.stepdefs;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import utils.Links;

public class SearchProductSteps{
	
	BaseSteps stepData;
	
	public SearchProductSteps(BaseSteps stepData){
		this.stepData = stepData;
	}
	
	@Given("^I am on the homepage$")
	public void i_am_on_the_homepage() throws Throwable {
		stepData.currentPage = stepData.currentPage.goTo(Links.HOME_PAGE);
		Assert.assertEquals("Online Store Homepage",stepData.currentPage.getPageTitle(), HomePage.getHomePageTitle());
	}
	
	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String productName) throws Throwable {
	    stepData.searchResults = stepData.currentPage.searchProduct(productName);
	}

	@Then("^I see \"([^\"]*)\" in search results$")
	public void i_see_in_search_results(String productName) throws Throwable {
	    Assert.assertTrue(productName+" is listed", stepData.searchResults.isProductListed(productName));
	   
	}
	
	@Then("^I see \"([^\"]*)\" message displayed$")
	public void i_see_message_displayed(String searchMessage) throws Throwable {
	    Assert.assertTrue(searchMessage+" is displayed", stepData.searchResults.isSearchMessageDisplayed(searchMessage));
	    
	}

	@Given("^I am on \"([^\"]*)\" product details page$")
	public void i_am_on_product_details_page(String productName) throws Throwable {
		stepData.productPage = stepData.productPage.goTo(Links.IPHONE5_PRODUCT_PAGE);
		Assert.assertEquals(productName+" Product Page",  productName, stepData.productPage.getProductTitle());
	    
	}

	
		
}
