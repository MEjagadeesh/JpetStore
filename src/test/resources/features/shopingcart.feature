Feature: Shopping cart

Background:
Given I am in shopping cart

Scenario: Change the quantity of the product
When I am changing the quantity of the product and click on update cart
Then I can see the updated details in the cart

Scenario: Remove the product from shopping cart
When I click on the remove button
Then I am removed product successfully