
Feature: Verify the Vacation Deals page content and functions

    Scenario: Verify the Vacation Deals page functions
      Given I am on home page
      When On home page I click on Vacation Deals link
      Then On the Vacation page there is a subtitle and title are displayed


  Scenario: Verify the Join SkyMiles page
    Given I am on home page
    When On the Vacation page click on Join SkyMiles link and verify title
    Then On Join SkyMiles page verify functions of putting data for registration of a new customer


  Scenario: Verify the Shop Deals
    Given I am on the Delta vacation delas page
    When On the Vacation page click on "SMMORE75K" and "11111111" (required fields)
    Then Verify the new page with deals