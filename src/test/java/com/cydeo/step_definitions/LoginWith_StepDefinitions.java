package com.cydeo.step_definitions;

import com.cydeo.pages.LoginWith_Pages;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginWith_StepDefinitions {

    LoginWith_Pages loginWith_pages;
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get("https://automationexercise.com");
        String homePageUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(homePageUrl,"https://automationexercise.com/");
    }
    @When("user click on Signup Login button")
    public void user_click_on_signup_login_button() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='/login']")));
        loginWith_pages.signupLoginButton.click();
    }
    @When("user see that Login to your account text visible")
    public void user_see_that_login_to_your_account_text_visible() {
        Assert.assertTrue(loginWith_pages.loginToYourAccountText.isDisplayed());
    }
    @When("user enters correct email address and password")
    public void user_enters_correct_email_address_and_password() {
        loginWith_pages.emailInput.sendKeys("jessicajones@cydeo.com");
        loginWith_pages.passwordInput.sendKeys("123456");
    }
    @When("user click login button")
    public void user_click_login_button() {
        loginWith_pages.loginButton.click();
    }
    @When("user see that Logged in as username is visible")
    public void user_see_that_logged_in_as_username_is_visible() {
        Assert.assertTrue(loginWith_pages.loggedInAs.isDisplayed());
    }
    @When("user click logout button")
    public void user_click_logout_button() {
        loginWith_pages.logoutLink.click();
    }


}
