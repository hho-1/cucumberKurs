#Senaryo:
  # Siteyi ac
  # username ve password göndererek login butonuna tiklat
  # login oldugunu dogrula

  #sonra yukardaki senaryoyu gherkin dilinde yazdir

  Feature: Login Functionality
    Scenario: Login with valid username and password
      Given Navigate to basqar
      When Enter username and password and click on login button
      Then User should be logged in successfully
