package com.stepDefinitions;

import com.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AC4StepDefinition {
    LoginPage loginPage = new LoginPage();
    @When("user enters password")
    public void user_enters_password() {
        loginPage.passwordBox.sendKeys("salesmanager");

    }
    @Then("user should see bullet signs by default")
    public void user_should_see_bullet_signs_by_default() {
       Boolean isBullet = loginPage.passwordBox.getAttribute("type").equals("password");
        Assert.assertEquals(isBullet,true);

    }
}
