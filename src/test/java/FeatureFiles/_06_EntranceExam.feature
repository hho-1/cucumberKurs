Feature: Datatable Functionality
  Background:
    Given Navigate to basqar
    When Enter username and password and click on login button
    Then User should be logged in successfully

    Scenario: Create and delete an exam
      And Click on the element in the left Navigation Menu
        |entranceExamsButton1|
        |entranceExamsSetupButton|
        |entranceExamsButton2|

      And Click on the element in the Dialog
        |addButton|

      And User sends the keys in Dialog Content
        |nameInput|HabExam10|

      And Click on the element in the Form Content
        |academicPeriod|
        |academicPeriod1|
        |gradeLevel|
        |gradeLevel2|
        |saveButton|

      Then Success message should be displayed

      And Click on the element in the left Navigation Menu
        |entranceExamsButton1|
        |entranceExamsSetupButton|
        |entranceExamsButton2|

      When User deletes "HabExam10" from the Form

      Then Success message should be displayed