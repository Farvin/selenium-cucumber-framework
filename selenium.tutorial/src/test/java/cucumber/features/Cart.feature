Feature: Manage Cart

Scenario: User can add a product to Cart
  Given I am on "iPhone 5" product details page
  And there are "0" items in the cart
  When I click on "Add to cart" link
  And I click on "Go to Checkout" button
  Then I see "iPhone 5" is added to the cart 
  And I see there is "1" item in the cart  