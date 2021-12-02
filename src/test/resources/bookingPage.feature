
Feature: As a customer I should be able to book flight

  Background:
    Given When I am on home page
    When I click on "BOOK" link

# @booking
  Scenario: Search for booking
    Then I should verify that link is correct
    And I should be able to enter my booking information

  @booking
  Scenario: Enter departure city
      Then I should be able to enter valid departure city name
      Then Departure city should appear in departure field.


  Scenario: Do not enter any  departure city
    Then I should be able leave  departure city field empty
    Then The error message should be there
  @booking
  Scenario: Enter destination city
    Then I should be able to enter valid destination city name
    Then Destination city should appear in destination field.

  Scenario: Select trip type
    Then I am able to select trip type.
    Then My selected trip type should appear on booking page.

    Scenario: Select departure date
      Then I am able to select desire departure date
      Then My selected date should appear on calendar

  Scenario: Select return date
    Then I am able to select desire return date
    Then My selected date should appear on calendar

    Scenario: Passengers
      Then I am able to select amount of passengers traveling



