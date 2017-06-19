Feature: Search for a Product

@skip
Scenario Outline: User can search for items
  Given I am on the homepage
  When I search for "<product>"
  Then I see "<product>" in search results
  
  Examples:
  | product     |
  | iPhone 5    |
  | Magic Mouse |
  
@skip
Scenario: User searches for an item that doesn't exist
  Given I am on the homepage
  When I search for "Samsung"
  Then I see "Sorry, but nothing matched your search criteria. Please try again with some different keywords." message displayed

