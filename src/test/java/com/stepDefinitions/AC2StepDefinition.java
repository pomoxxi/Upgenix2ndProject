package com.stepDefinitions;

import com.pages.LoginPage;
import com.utilities.Driver;
import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AC2StepDefinition {
    LoginPage loginPage = new LoginPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(" https://qa.upgenix.net/web/login");

    }

    @When("User enters {string} and {string}")
    public void userEnters_invalid_Email_valid_password(String Email, String password) {
        loginPage.usernameBox.sendKeys(Email);
        loginPage.passwordBox.sendKeys(password);

    }

    @Then("user sees Wrong login\\/password message displayed")
    public void user_sees_wrong_login_password_message_displayed() {
        String expectedResult = "Wrong login/password";
        String actualResult = loginPage.WrongLoginOrPasswordDisplay.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @And("User presses login button or presses enter")
    public void userPressesLoginButtonOrPressesEnter() {
        loginPage.loginButton.click();
    }

    @And("user is back on the login page")
    public void userIsBackOnTheLoginPage() {
        Driver.getDriver().get(" https://qa.upgenix.net/web/login");

    }
}
