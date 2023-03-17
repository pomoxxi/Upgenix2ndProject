package com.stepDefinitions;

import com.pages.LoginPage;
import com.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class AC5StepDefinition {
    LoginPage loginPage = new LoginPage();

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
