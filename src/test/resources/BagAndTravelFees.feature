Feature: Baggage Travel Fees Page

Background:
Given I am on the homepage
When I click on "Updated Bag & Travel Fees"
Then I should land on the Updated Bag & Travel Fees Page

  Scenario: Verify the customer can checked baggage fees options

    When I click on "Checked Baggage Fees"
    Then The price for the first standard checked bag should be $30 USD
    And The price for the second standard checked bag should be $40 USD
