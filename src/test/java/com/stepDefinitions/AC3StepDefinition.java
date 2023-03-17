package com.stepDefinitions;

import com.pages.LoginPage;
import com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AC3StepDefinition {
    LoginPage loginPage = new LoginPage();

    @When("User leaves username box empty")
    public void user_leaves_username_box_empty() {
        loginPage.usernameBox.sendKeys("");
        loginPage.passwordBox.sendKeys("salesmanager");

    }

    @Then("user should see Please fill out this field text on the page")
    public void user_should_see_please_fill_out_this_field_text_on_the_page() {

        Boolean required = Boolean.parseBoolean(loginPage.usernameBox.getAttribute("required"));
        Assert.assertEquals(true,required);

    }


    @When("User leaves password box empty")
    public void userLeavesPasswordBoxEmpty() {
        loginPage.usernameBox.sendKeys("salesmanager15@info.com");
        loginPage.passwordBox.sendKeys("");
    }
}
