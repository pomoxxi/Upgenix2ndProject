package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='o_thread_title']")
    public WebElement isItDisplayed ;
    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement usernameDisplay;
    @FindBy(xpath = "//a[@data-menu='logout']")
    public WebElement logOutButton;



}
