@smoke
Feature: As a customer I should be able to check my flight status.

  Background:
    Given I am on home page
    When I click on rent a car link


  Scenario: Check car search page
    Then I should verify that I land on "Car Search" page

  Scenario: Enter a pick-up location
    Then Enter a valid pick-up location
    And pick-up location info should be displayed

  Scenario: Select a valid pick-up date
     Then Select a valid pick-up date on a calendar
     And pick-up date info should be displayed

  Scenario: Select a valid drop-off date
      Then Select a valid drop-off date on a calendar
      And drop-off date info should be displayed

  Scenario: Select a valid pick-up time
      Then Select a valid pick-up time
      And pick-up time info should be displayed

  Scenario: Select a valid drop-off time
      Then Select a valid drop-off time
      And drop-off time info should be displayed

  Scenario: Select a valid age
      Then Select a valid age
      And age info should be displayed

  Scenario: Click on book a car button
      When I click on book a car button
      Then I should verify that I land on "Car Booking" page