package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWith_Pages {

    public LoginWith_Pages(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//h2[.='Login to your account']")
    public WebElement loginToYourAccountText;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//i[@class='fa fa-user']")
    public WebElement loggedInAs;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logoutLink;





}
