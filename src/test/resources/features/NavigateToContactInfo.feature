Feature: employee contact information

  Background:
    Given user able to enter user name
    Then user able to enter password
    And user able to click login button
    Then user is navigate to dashboard page


  @Navigate
  Scenario: contact information
    Given user able to click PIM tab on dashboard page
    Then user able to chech the box
    Then user able to check one of Emp ID
    And user able to click on contact information
