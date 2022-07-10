@regression
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts.
  And dashboard should be displayed.
  Accounts are: librarian, student, admin

  Background: For each scenario user is on library login page
  Given user is on the library login page


  @librarian @employee @smoke
  Scenario: Login as librarian
    #Given user is on the library login page
    When user enter librarian username
    And user enter librarian password
    Then  user should see dashboard

  @student @smoke
  Scenario: Login as student
    #Given user is on the library login page
    When user enter student username
    And user enter student password
    Then  user should see dashboard

  Scenario: Login as admin
   # Given user is on the library login page
    When user enter admin username
    And user enter admin password
    Then user should see dashboard
