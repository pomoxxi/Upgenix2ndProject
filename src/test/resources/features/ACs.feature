Feature: Default

  Scenario: AC1-Users can log in with valid credentials (We have 5 types of users but will test only 2 user: PosManager, SalesManager)
    Given User is on the login page
    When User enters Valid "salesmanager15@info.com" address and "salesmanager"
    Then User clicks the Login button or presses Enter

  Scenario Outline: AC1-Users can log in with valid credentials (We have 5 types of users but will test only 2 user: PosManager, SalesManager)
    Given User is on the login page
    When User enters Valid "<E-mail>" address and "<password>"
    Then User clicks the Login button or presses Enter

    Examples:Email-Password
      | E-mail                  | password     |
      | salesmanager15@info.com | salesmanager |
      | salesmanager16@info.com | salesmanager |
      | salesmanager17@info.com | salesmanager |
      | salesmanager18@info.com | salesmanager |
      | salesmanager19@info.com | salesmanager |

  Scenario: AC2- "Wrong login/password" message should be displayed for invalid credentials (valid username-invalid password and invalid username-valid password)
    Given user is on the login page
    And User enters "salesmanager4@info.com" and "salesmanager"
    And User presses login button or presses enter
    Then user sees Wrong login/password message displayed
    And user is on the login page
    And User enters "salesmanager15@info.com" and "mama"
    And User presses login button or presses enter
    Then user sees Wrong login/password message displayed


  Scenario Outline: AC2- "Wrong login/password" message should be displayed for invalid credentials (valid username-invalid password and invalid username-valid password)
    Given user is on the login page
    When User enters "<invalid E-mail>" and "<valid password>"
    And User presses login button or presses enter
    Then user sees Wrong login/password message displayed
    And user is on the login page
    When User enters "<valid E-mail>" and "<invalid password>"
    And User presses login button or presses enter
    Then user sees Wrong login/password message displayed


    Examples:Email-Password
      | invalid E-mail         | valid password | valid E-mail            | invalid password |
      | salesmanager4@info.com | salesmanager   | salesmanager15@info.com | mama             |
      | salesmanager3@info.com | salesmanager   | salesmanager15@info.com | mama             |
      | salesmanager2@info.com | salesmanager   | salesmanager15@info.com | mama             |
      | salesmanager1@info.com | salesmanager   | salesmanager15@info.com | mama             |
      | salesmanager5@info.com | salesmanager   | salesmanager15@info.com | mama             |

  @UPGNX10-224
  Scenario: AC3- "Please fill out this field" message should be displayed if the password or username is empty
    Given user is on the login page
    When User leaves username box empty
    And User presses login button or presses enter
    Then user should see Please fill out this field text on the page
    And user is on the login page
    When User leaves password box empty
    And User presses login button or presses enter
    Then user should see Please fill out this field text on the page



