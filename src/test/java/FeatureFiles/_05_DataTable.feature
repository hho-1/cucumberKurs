Feature: Datatable Functionality
  Background:
    Given Navigate to basqar
    When Enter username and password and click on login button
    Then User should be logged in successfully


  Scenario: Create Country
    And Click on the element in the left Navigation Menu
    |setup|
    |parameters|
    |countries|

    And Click on the element in the Dialog
      |addButton|

    And User sends the keys in Dialog Content
    |nameInput|Mongolistan2353|
    |countryCode|MNG|

    And Click on the element in the Dialog
      |saveButton|

    And Success message should be displayed

    And User deletes item from Dialog
    |Mongolistan2353|

    And Success message should be displayed


  Scenario: Create a Nationality
    And Click on the element in the left Navigation Menu
      |setup|
      |parameters|
      |nationalities|

    And Click on the element in the Dialog
      |addButton|

    And User sends the keys in Dialog Content
      |nameInput|Mongolian332|

    And Click on the element in the Dialog
      |saveButton|

    And Success message should be displayed

    And User deletes item from Dialog
      |Mongolian332|

    And Success message should be displayed

  Scenario: Create and Delete Fee
    And Click on the element in the left Navigation Menu
      |setup|
      |parameters|
      |fees|

    And Click on the element in the Dialog
      |addButton|

    And User sends the keys in Dialog Content
      |nameInput|kursGebuehr|
      |codeInput|4354|
      |integrationCode|4345|
      |priorityCode|2|

    And Click on the element in the Dialog
      |saveButton|                              #Bu kod bende calismadi. saveButton aktif olmuyor bir türlü. bir yolunu bulmak lazim

    And Success message should be displayed

    And User deletes item from Dialog
      |kursGebuehr|

    And Success message should be displayed