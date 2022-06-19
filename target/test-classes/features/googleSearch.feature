Feature: Google search functionality
  Agile story: As a user, when i am on the Google search page
  i should be able to search whatever I want to see relevant information

  Scenario: Search page title verification
    When user is on the Google search page
    Then user should see title is Google


  Scenario: Search functionality result title verification
    Given user is on the Google search page
    When user types apple and clicks enter
    Then user sees apple in the Google title


  Scenario: Search functionality result title verification
    Given user is on the Google search page
    When user types "apple" and clicks enter
    Then user sees "apple" in the Google title