
@smoke

Feature: As a customer I should be able to check my flight status.

  Background:
    Given I am on home page
    When I click on Flight Status link


  Scenario: Go to flight status page
    Then I should verify that I lend on Flight Status page





  Scenario: Search by date
      Then I should be able to select valid date on a calendar
      And Selected date should be displayed



  Scenario: Flight Number
    Then I should be able to enter valid flight number
    And Flight number should be displayed


  Scenario: Do not enter any  flight number info
    Then I am able to leave flight number info field empty
    Then  error msg should appear

  Scenario: Enter departure city
    Then Enter valid departure city
    Then Departure city info should be displayed


  Scenario: Enter invalid departure city
    Then Enter invalid departure city
    Then Error msg "Please enter a valid city code or airport name" should appear under input box

  Scenario: Enter  arrival city
    Then Enter valid arrival city
    Then Arrival city info should be displayed


  Scenario: Enter invalid arrival city
    Then Enter invalid arrival city
    Then Error msg "Please enter a valid city code or airport name" should appear under input box




  Scenario: Verify submit button
      Then Click on submit button.
      And I am able to click on submit button.




