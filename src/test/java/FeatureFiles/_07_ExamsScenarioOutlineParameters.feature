Feature: Scenario Outline Parameters Functionality for Entrance Exams
  Background:
    Given Navigate to basqar
    When Enter username and password and click on login button
    Then User should be logged in successfully

  Scenario Outline: Create and delete some exams
    And Click on the element in the left Navigation Menu
      |entranceExamsButton1|
      |entranceExamsSetupButton|
      |entranceExamsButton2|

    And Click on the element in the Dialog
      |addButton|

    And User sends the keys in Dialog Content
      |nameInput|<ExamName>|

    And Click on the element in the Form Content
      |academicPeriod|
      |<AcademicPeriodOption>|
      |gradeLevel|
      |<GradeLeveloption>|

    And Click on the element in the Dialog
      |saveButton|

    Then Success message should be displayed

    And Click on the element in the left Navigation Menu
      |entranceExamsButton1|
      |entranceExamsSetupButton|
      |entranceExamsButton2|

    When User deletes item from Dialog
      |<ExamName>|


    Then Success message should be displayed


    Examples:
      | ExamName | AcademicPeriodOption | GradeLeveloption |
      | ExMath12 | academicPeriod1 | gradeLevel2 |
      | ExIT23 | academicPeriod1 | gradeLevel2 |
      | ExBiology23 | academicPeriod1 | gradeLevel2 |
      | ExPhysics23 | academicPeriod1 | gradeLevel2 |
