Feature: Citizenship with Scenario Outline

  Background:
    Given Navigate to basqar
    When Enter username and password and click on login button
    Then User should be logged in successfully
    And Navigate to Citizenship Page

  Scenario Outline: Citizenship create
    When User a Citizenship name as "<CitizenshipName>" short name as "<ShortName>"
    Then Success message should be displayed

    When User a Citizenship name as "<CitizenshipName>" short name as "<ShortName>"
    Then Already exists message should be displayed
    And Click on close button

    When User delete the "<CitizenshipName>"
    Then Success message should be displayed


    Examples:
      | CitizenshipName | ShortName |
      | marsli-26g6     | mrs       |
      | jupiterli-285g1 | jp        |
      | saturnlu-821g5  | st        |
      | venuslu-218g    | vns       |
      | neptunlu-4g8    | npt       |