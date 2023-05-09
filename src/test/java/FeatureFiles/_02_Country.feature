Feature: Country functionality
  Background:
    Given Navigate to basqar
    When Enter username and password and click on login button
    Then User should be logged in successfully
    And Navigate to Country Page

  Scenario: Create Country
    When Create a country
    Then Success message should be displayed
