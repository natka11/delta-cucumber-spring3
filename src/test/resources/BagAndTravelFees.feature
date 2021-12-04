Feature: Baggage Travel Fees Page

Background:
Given I am on the homepage
When I click on Updated Bag & Travel Fees
Then I should land on the Updated Bag & Travel Fees Page

  @smoke
  Scenario Outline: Verify the customer can checked baggage fees options

    When I click on "<OptionAvailable>"
    Then The price for the first standard checked bag should be <Price_1st>
    And The price for the second standard checked bag should be <Price_2nd>

    Examples:
      | OptionAvailable      | Price_1st | Price_2nd |
      | Checked Baggage Fees | 30.00     | 40.00     |
      | Carry - On Baggage   | 30.00     | 40.00     |


  @smoke
  Scenario: Verify the customer cannot enter invalid information on Track Checked Baggage page

  When I click on Track Checked Baggage page
  Then I should be able to search by BTN and enter the BagTagNumber and enter LastName
    | BTN          | BagTagNumber | LastName |
    | BagTagNumber | Sky578475t   | Novak    |
  Then I should have an error message because I entered invalid information

  @smoke
  Scenario: Verify the customer can use option Calculate Baggage Estimate

  When I click on My Trip button
  Then I should land on find my trip page

  @smoke
  Scenario: Verify MORE option list

  Then The MORE option category should include

   | Track Checked Baggage          |
   | Special Items                  |
   | Excess & Overweight Baggage    |
   | Prohibited or Restricted Items |
   | Delayed, Lost, or Damaged Bags |
   | Embargoes & Limitations        |
   | First Checked Bag Free         |
   | 20-Minute Bag Guarantee        |


  @smoke
  Scenario: Verify options list how I want to find my trip

    When I click on My Trip button
    Then I should land on find my trip page
    Then The find my trip options should be the following

      | CONFIRMATION NUMBER      |
      | CREDIT/DEBIT CARD NUMBER |
      | TICKET NUMBER            |