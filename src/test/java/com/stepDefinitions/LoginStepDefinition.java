package com.stepDefinitions;

import com.pages.LoginPage;
import com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginStepDefinition {

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
    @When("User leaves username box empty")
    public void user_leaves_username_box_empty() {
        loginPage.usernameBox.sendKeys("");
        loginPage.passwordBox.sendKeys("salesmanager");

    }

    @Then("user should see Please fill out this field text on the page")
    public void user_should_see_please_fill_out_this_field_text_on_the_page() {

        String validationMessage = loginPage.usernameBox.getAttribute("validationMessage");
        Boolean required = Boolean.parseBoolean(loginPage.usernameBox.getAttribute("required"));
        Boolean isEmpty = loginPage.usernameBox.getText().equals("");
        Assert.assertEquals(isEmpty,true);
        Assert.assertEquals(true,required);
        Assert.assertEquals(validationMessage,"Lütfen bu alanı doldurun.");
    }

    @When("User leaves password box empty")
    public void userLeavesPasswordBoxEmpty() {
        loginPage.usernameBox.sendKeys("salesmanager15@info.com");
        loginPage.passwordBox.sendKeys("");
    }

    @Then("user should see Please fill out this field text on the page\\(password empty)")
    public void user_should_see_please_fill_out_this_field_text_on_the_page_password_empty() {
        String validationMessage = loginPage.passwordBox.getAttribute("validationMessage");
        Boolean required = Boolean.parseBoolean(loginPage.passwordBox.getAttribute("required"));
        Boolean isEmpty = loginPage.passwordBox.getText().equals("");
        Assert.assertEquals(isEmpty,true);
        Assert.assertEquals(true,required);
        Assert.assertEquals(validationMessage,"Lütfen bu alanı doldurun.");

    }
    @When("user enters password")
    public void user_enters_password() {
        loginPage.passwordBox.sendKeys("salesmanager");

    }
    @Then("user should see bullet signs by default")
    public void user_should_see_bullet_signs_by_default() {
        Boolean isBullet = loginPage.passwordBox.getAttribute("type").equals("password");
        Assert.assertEquals(isBullet,true);

    }
    @When("user enters Email and password")
    public void user_enters_and() {
        loginPage.usernameBox.sendKeys("salesmanager15@info.com");
        loginPage.passwordBox.sendKeys("salesmanager");

    }
    @Then("user checks if pressing enter is equivalent to press login")
    public void user_checks_if_pressing_enter_is_equivalent_to_press_login() {
        loginPage.passwordBox.sendKeys(Keys.ENTER);
        String title = Driver.getDriver().getTitle();
        Assert.assertEquals(title,"Odoo" );

    }

}
