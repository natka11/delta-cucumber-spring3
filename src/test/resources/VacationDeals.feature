
Feature: Verify the Vacation Deals page content and functions

  # executed before each scenario
  Background:
    Given I am on home page



    Scenario: Verify the Vacation Deals page functions
      When On home page I click on Vacation Deals link
      Then On the Vacation page there is a subtitle and title are displayed


  Scenario: Verify the Join SkyMiles page
    When On the Vacation page click on Join SkyMiles link and verify title
    Then On Join SkyMiles page verify functions of putting data for registration of a new customer

  @test
  Scenario: Verify the Shop Deals
    When On the Vacation page click on "SMMORE75K" and "SkyMiles" (required fields)
    Then Verify the new page with deals