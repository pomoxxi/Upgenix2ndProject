@whole
Feature: Default

  @UPGNX10-270
  Scenario:AC1- User can log out and ends up in login page.
    When user is on the login page
    And user enters valid email and password
    And User presses login button or presses enter
    And user is on the homepage
    And user clicks on his username top right of the screen
    And user presses Log out
    Then user is on the login page

  @UPGNX10-271
    Scenario: AC2- The user can not go to the home page again by clicking the step back button after successfully logged out.
      When user is on the login page
      And user enters valid email and password
      And User presses login button or presses enter
      Then user is on the homepage
      When user clicks on his username top right of the screen
      And user presses Log out
      Then user presses go back button
      And user is still on the login page

  @UPGNX10-272
  Scenario: AC3- The user must be logged out if the user closes the open tab (all tabs if there are multiple open tabs)
    When user is on the login page
    And user enters valid email and password
    And User presses login button or presses enter
    And user is on the homepage
    And user clicks on his username top right of the screen
    Then user presses Log out
    Then user is on the login page
