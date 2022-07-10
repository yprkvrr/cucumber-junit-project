@wip5
Feature: Examples for Datatable


  Scenario: Menu options for driver
    Given user is on the login page
    When user enters the "driver" information
    Then user should be able to see following modules
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |


  Scenario: Menu options for sales manager
    Given user is on the login page
    When user enters the "sales manager" information
    Then user should be able to see following modules
      | Fleet              |
      | Customers          |
      | Activities         |
      | System             |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

  Scenario: Login with given information
    Given user is on the login page
    When user enter below credentials
      | username | user10      |
      | password | UserUser123 |
    Then user should be able to see following information
      | firstname | Ara |
      | lastname  | Ondricka  |

@listOfMap
  Scenario: verify each product price
    Given User is on the HomePage
    Then User should be able to see expected prices in following products
      | Category | Product           | expectedPrice |
      | Phones   | Samsung galaxy s6 | 360           |
      | Phones   | Nokia lumia 1520  | 820           |
      | Phones   | Nexus 6           | 650           |
      | Laptops  | Sony vaio i5      | 790           |
      | Laptops  | Sony vaio i7      | 790           |
      | Laptops  | MacBook air       | 700           |
      | Monitors | Apple monitor 24  | 400           |
      | Monitors | ASUS Full HD      | 230           |


  Scenario: verify each product price listOfList
    Given User is on the HomePage
    Then User should be able to see expected prices in following products with listOflist
      | Phones   | Samsung galaxy s6 | 360 |
      | Phones   | Nokia lumia 1520  | 820 |
      | Phones   | Nexus 6           | 650 |
      | Laptops  | Sony vaio i5      | 790 |
      | Laptops  | Sony vaio i7      | 790 |
      | Laptops  | MacBook air       | 700 |
      | Monitors | Apple monitor 24  | 400 |
      | Monitors | ASUS Full HD      | 230 |


    #Map<String,List<String,String>>

  @MapOfList
  Scenario: Verify students name in discord
    Then User should be able to see following names in their groups
      | Group1 | Gulay Turgut | Shina                 | Ziba               |
      | Group2 | Selim        | Demet                 | Ermek Tuleberdiev  |
      | Group3 | Emre         | Idris Semih Karadeniz | Dzerassa Temiraeva |
