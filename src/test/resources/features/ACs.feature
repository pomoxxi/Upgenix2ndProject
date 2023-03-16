
Feature: Default

	@UPGNX10-224
	Scenario: AC1-Users can log in with valid credentials (We have 5 types of users but will test only 2 user: PosManager, SalesManager)
		When User is on the login page
		And User enters Valid E-mail address and password
		Then User clicks the Login button or presses Enter
	Scenario: AC2- "Wrong login/password" message should be displayed for invalid credentials (valid username-invalid password and invalid username-valid password)
		When user is on the login page
		And User enters unvalid E-mail valid password or valid E-mail unvalid password or unvalid E-mail and password
		Then user sees Wrong login/password message displayed