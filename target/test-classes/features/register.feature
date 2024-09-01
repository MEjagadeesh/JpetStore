Feature: User registration
  Background:
    Given I am in registration page

  Scenario:  registering with details
    When I have to enter details in registration page and click on resister button
    Then I can register successfully

  Scenario:  registering with missing details
    When I miss some details to enter and click on register button
    Then I get an error message