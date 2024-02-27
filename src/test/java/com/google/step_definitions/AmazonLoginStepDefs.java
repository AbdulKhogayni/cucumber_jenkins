package com.google.step_definitions;

import com.google.Credentials;
import com.google.pages.AmazonLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonLoginStepDefs {
    AmazonLoginPage loginPage = new AmazonLoginPage();
    Credentials credentials = new Credentials();

    @When("I hover over mouse on hello, sign in")
    public void i_hover_over_mouse_on_hello_sign_in() {
        loginPage.singInBar(loginPage.singInBar);
    }

    @Then("I click on sign in button")
    public void i_click_on_sign_in_button() {
        loginPage.sigInBtn(loginPage.sigInBtn);
    }

    @Then("I verify amazon logo is displayed in the top of hte page")
    public void iVerifyAmazonLogoIsDisplayedInTheTopOfHtePage() {
        loginPage.amazonLogDisplayed(loginPage.amazonLogo);
    }

    @When("I enter valid user name")
    public void i_Enter_Valid_UserName() {
        loginPage.emailField(loginPage.emailField, credentials.getUserName());
    }

    @Then("I click on continue btn")
    public void i_Click_On_Continue_Btn() {
        loginPage.continueBtn(loginPage.continueBtn);

    }

    @And("I enter valid password")
    public void i_Enter_Valid_Password() {
        loginPage.passwordField(loginPage.passwordField, credentials.getPassword());
    }

    @Then("I click on second sign in button")
    public void iClickOnSecondSignInButton() {
        loginPage.innerSignInBtn(loginPage.innerSignInBtn);
    }
}
