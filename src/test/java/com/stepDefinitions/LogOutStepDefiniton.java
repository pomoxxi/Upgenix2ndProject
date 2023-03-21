package com.stepDefinitions;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LogOutStepDefiniton {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    Actions action = new Actions(Driver.getDriver());

    public LogOutStepDefiniton() {
    }

    @When("user enters valid email and password")
    public void user_enters_valid_email_and_password() {
        loginPage.usernameBox.sendKeys("salesmanager15@info.com");
        loginPage.passwordBox.sendKeys("salesmanager");

    }
    @Then("user is on the homepage")
    public void user_is_on_the_homepage() {
        String actualResult = homePage.isItDisplayed.getText();
        Assert.assertEquals(actualResult,"Congratulations, your inbox is empty");

    }
    @Then("user clicks on his username top right of the screen")
    public void user_clicks_on_his_username_top_right_of_the_screen() {
        homePage.usernameDisplay.click();

    }
    @Then("user presses Log out")
    public void user_presses_log_out() {
        homePage.logOutButton.click();

    }
    @Then("user presses go back button")
    public void user_presses_go_back_button() {
       Driver.getDriver().navigate().back();

    }
    @Then("user is still on the login page")
    public void user_is_still_on_the_login_page() {
       String actualTitle = Driver.getDriver().getTitle();
       Assert.assertEquals("Login | Best solution for startups", actualTitle);

    }
}
