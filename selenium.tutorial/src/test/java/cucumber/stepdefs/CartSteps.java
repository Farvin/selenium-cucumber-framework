package cucumber.stepdefs;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartSteps {
	
	BaseSteps stepData;
	
	public CartSteps(BaseSteps stepData){
		this.stepData = stepData;
	}
	
	@Given("^there are \"([^\"]*)\" items in the cart$")
	public void there_are_items_in_the_cart(String numberOfItems) throws Throwable {
	    Assert.assertEquals("There is "+numberOfItems+" item in the cart", numberOfItems, stepData.productPage.getNumberOfItemsInCart());
	   
	}

	@When("^I click on \"([^\"]*)\" link$")
	public void i_click_on_link(String arg1) throws Throwable {
	   stepData.productPage = stepData.productPage.clickAddToCartButton();
	    
	}
	
	@When("^I click on \"([^\"]*)\" button$")
	public void i_click_on_button(String arg1) throws Throwable {
	    stepData.cartPage = stepData.productPage.clickGoToCheckout();
	}

	@Then("^I see \"([^\"]*)\" is added to the cart$")
	public void i_see_is_added_to_the_cart(String productName) throws Throwable {
	    Assert.assertEquals(productName+" is added to cart", productName, stepData.cartPage.getProductTitle());
	   
	}

	@Then("^I see there is \"([^\"]*)\" item in the cart$")
	public void i_see_there_is_item_in_the_cart(String numberOfItems) throws Throwable {
		Assert.assertEquals("There is "+numberOfItems+" item in the cart", numberOfItems, stepData.cartPage.getNumberOfItemsInCart());
	    
	}

}
