Feature: Login page
Background:
    Given I am in the login page
    
Scenario: Successful Login
    When I enter the valid credentials
    Then I can see the successful login

Scenario: Invalid login
    When I enter invalid credentials
    Then I see an error message