Feature: Search a product
Background:

		Given I am in the pet store home page

Scenario: I can search for products
When I enter "fish" in the search field
Then I see a list of search results contain fish


Scenario: Search without entering a product
When I clicks the search button without entering a product name
Then an error message should display