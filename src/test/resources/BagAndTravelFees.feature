@smoke
Feature: Baggage Travel Fees Page
Background:
Given I am on the homepage
When I click on Updated Bag & Travel Fees
Then I should land on the Updated Bag & Travel Fees Page


  Scenario Outline: Verify the customer can checked baggage fees options

    When I click on "<OptionAvailable>"
    Then The price for the first standard checked bag should be <Price_1st>
    And The price for the second standard checked bag should be <Price_2nd>

    Examples:
      | OptionAvailable      | Price_1st | Price_2nd |
      | Checked Baggage Fees | 30.00     | 40.00     |
      | Carry - On Baggage   | 30.00     | 40.00     |


  Scenario: Verify the customer cannot enter invalid information on Track Checked Baggage page

  When I click on Track Checked Baggage page
  Then I should be able to search by BTN and enter the BagTagNumber and enter LastName
    | BTN          | BagTagNumber | LastName |
    | BagTagNumber | Sky578475t   | Novak    |
  Then I should have an error message because I entered invalid information


  Scenario: Verify the customer can choose option Calculate Baggage Estimate

  When I click on My Trip button
  Then I should land on find my trip page


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


  Scenario: Verify options list how I want to find my trip

    When I click on My Trip button
    Then I should land on find my trip page
    Then The find my trip options should be the following

      | CONFIRMATION NUMBER      |
      | CREDIT/DEBIT CARD NUMBER |
      | TICKET NUMBER            |


  Scenario: Verify options for Military Checked Baggage Allowance

    Then I should be able to click on Active Military
    Then I should be able to verify Military Checked Baggage Allowance

      | = 50 lbs. (23kg)  |
      | = 70 lbs. (32kg)  |
      | = 100 lbs. (45kg) |

  Scenario: Verify options for + 1 Free Carry-On Bag and 1 Personal Item

    Then I should be able to click on Free Carry-On Bag and Personal Item
    Then I should be able to verify the following items:

      | 1 Carry-On Bag  |
      | 1 Personal Item |


  Scenario: Verify the customer can choose option Excess and Overweight Baggage

    When I click on Excess and Overweight Baggage
    Then I should land on Excess and Overweight Baggage

