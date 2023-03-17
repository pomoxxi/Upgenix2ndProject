package com.stepDefinitions;

import com.pages.LoginPage;
import com.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AC1StepDefinition {

    LoginPage loginPage = new LoginPage();

    @When("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(" https://qa.upgenix.net/web/login");
    }
    @When("User enters Valid {string} address and {string}")
    public void user_enters_valid_e_mail_address_and_password(String username, String password) {

        loginPage.usernameBox.sendKeys(username);
        loginPage.passwordBox.sendKeys(password);

    }
    @Then("User clicks the Login button or presses Enter")
    public void user_clicks_the_login_button_or_presses_enter() {
        loginPage.loginButton.click();

    }

}
