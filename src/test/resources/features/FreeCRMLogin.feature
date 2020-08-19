@login
Feature: Free CRM Login Feature
  Scenario Outline: FreeCRM Login Test Scenario
    Given user is already on Login Page
    When user clicks on Login icon
    Then user enters "<email>" and "<password>"
    Then user clicks on login button
   Then user is on home page

    Examples:
    |email             | password|
    |azyme@gmail.com |test@123 |
#    |tom@tom.com       |test%34  |