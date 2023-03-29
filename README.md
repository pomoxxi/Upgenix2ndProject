# In this project I automated a webside accordingly to a list of requirements

# Test Case 1: Login Functionality

## In this project I also handled "Please fill out this field" message.
> My environement: https://qa.upgenix.net/web/login/
> At the 3rd AC, I reached the javascript part of the browser in order to see the actual "Please fill out this field" message attribute

# Acceptance Criterias
## AC1-Users can log in with valid credentials (We have 5 types of users but will test only 2 user: PosManager, SalesManager)

## AC2- "Wrong login/password" message should be displayed for invalid credentials (valid username-invalid password and invalid username-valid password)

## AC3- "Please fill out this field" message should be displayed if the password or username is empty

## AC4- User should see the password in bullet signs by default while typing (like ****)

## AC5- Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.



# Test Case 1: Log out Functionality
> My environement: https://qa.upgenix.net/web/login/

## AC1- User can log out and ends up in login page.

## AC2- The user can not go to the home page again by clicking the step back button after successfully logged out.

## AC3- The user must be logged out if the user closes the open tab (all tabs if there are multiple open tabs)
