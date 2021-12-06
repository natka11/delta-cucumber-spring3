Feature: Verify the "NeedHelp?" features

  @test
  Scenario: Verify the Help Center page functions
    Given I am on home page
    When On home page I click on the NeedHelp? link and on the Help Center link
    Then On the Help Center page I verify content "We want you to get where you're going faster. Review our most popular ways to quickly manage your trip yourself, maintain your SkyMiles® account, explore helpful policy details and, if needed, find out how to contact us."
    Then On the Help Center page I verify visibility of "Prepare for Travel", "Manage Your Trip", "Day of Travel"