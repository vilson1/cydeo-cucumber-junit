@Regression @Smoke
Feature: Library app login feature
  User Story:
  As a user, i should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.

  Accounts are:  librarian, student, admin

  Background: For the scenarios in the feature file, user is expected to be in login page
    Given user is on the library login page

@librarian
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

  Scenario: Login as Student
    When user enters student username
    And user enters student password
    Then user should see the dashboard

  Scenario: Login as admin
    When use enters admin username
    And  user enters admin password
    Then user should see the dashboard

