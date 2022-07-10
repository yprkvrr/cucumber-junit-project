Feature: Title verification


  Background: For each scenario user is on library login page
    Given when user open Etsy page
  @etsy
  Scenario: title

    Then user should see Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone title
@etsy
Scenario: Search Functionality Title Verification
  When user types Wooden Spoon in the search box
  And user clicks search button
  Then user should see Wooden Spoon is in the title


  Scenario: Search Functionality Title Verification
    When user types "jewelry box" in the search box
    And user clicks search button
    Then user should see "Jewelry box - Etsy" is in the title
