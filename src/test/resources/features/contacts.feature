@contacts
Feature: Free CRM Login Feature
  Scenario Outline: FreeCRM Login Test Scenario
    Given user is already on Login Page
    When user clicks on Login icon
    Then user enters "<email>" and "<password>"
    Then user clicks on login button
    Then user is on home page
    Then user clicks on contacts tab
    Then user clicks on new icon to create contact
    Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
    Then user clicks on save button

    Examples:
    |email             | password | firstname  | lastname  | position  |
    |aybazym@gmail.com |test@123  | Tom        |Peter      | Manager   |
    |aybazym@gmail.com |test@123  | Roby       |Server     | Director  |

