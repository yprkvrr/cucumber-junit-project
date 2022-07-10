Feature: User fills out the form
@smartbear
  Scenario:User should be able to place order and order seen in web table
    Given User is logged into SmartBear Tester account and on Order page
    When User selects "FamilyAlbum" from product dropdown
    And enters 4 to quantity
    And enters "John Wick" to costumer name
    And enters "Kinzie Ave" to street
    And enters "Chicago" to city
    And enters "IL" to state
    And enters "60056"
    And selects "Visa" as card type
    And enters "1111222233334444" to card number
    And enters "12/22" to expiration date
    And clicks process button
    Then verifies "John Wick" is in the list


  @smart
  Scenario Template: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "<Product>"
    And user enters quantity <Quantity>
    And user enters customer name "<Name>"
    And user enters street "<Street>"
    And user enters city "<City>"
    And user enters state "<State>"
    And user enters zipcode "<ZipCode>"
    And user selects credit card type "<CreditCardType>"
    And user enters credit card number "<CreditCardNumber>"
    And user enters expiry date "<ExpDate>"
    And user enters process order button
    Then user should see "<Name>" in first row of the web table

    Examples:
      | Product     | Quantity | Name         | Street    | City    | State | ZipCode | CreditCardType | CreditCardNumber | ExpDate |
      | Familybea   | 2        | Rachel Green | State st  | Chicago | IL    | 50505   | Visa           | 1111222233334444 | 12/23   |
      | MoneyCog     | 1        | Ken Adams    | Kinzie St | Chicago | IL    | 60004   | Visa           | 1111562233334444 | 11/10   |
      | Screenable |5         |Ross Geller   |Erie St    |Chicago  |IL     |60009    |Visa            |1311562233334444  |04/05    |





