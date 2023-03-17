package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//input[@type='text']")
    public WebElement usernameBox;
    @FindBy (xpath = "//input[@type='password']")
    public WebElement passwordBox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;
    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement WrongLoginOrPasswordDisplay;

}
