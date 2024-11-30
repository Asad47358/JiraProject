Feature: employee all Contact info

  Background:
    Given user able to enter user name
    Then user able to enter password
    And user able to click login button
    Then user is navigate to dashboard page

    Given user able to click PIM tab on dashboard page
    Then user able to chech the box
    Then user able to check one of Emp ID
    And user able to click on contact information


  @allContact
  Scenario: employee able to edit their contacts

    Given user able to click edit button
    Then address one  text box should displyed and emp can enter or update
    Then address two test box should displyed and emp can enter or update
    Then City textbox should displyed emp can enter or update
    Then State textbox should displyed emp can enter or update
    Then Zip Code textbox should displyed emp can enter or update
    Then Country dropdown should displyed emp can enter or update
    Then home phone textbox should displyed emp can enter or update
    Then Mobile phone textbox should displyed emp can enter or update
    Then workphone textbox should displyed emp can enter or update
    Then work email textbox should displyed emp can enter or update
    Then other email textbox should displyed emp can enter or update
    And The contact info should save, chanage and submit successfuly