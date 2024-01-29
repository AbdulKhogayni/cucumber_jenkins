package com.google.step_depenitions;

import com.google.utilities.ConfigurationReader;
import com.google.utilities.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static com.google.utilities.DriverManager.driver;

public class GoogleHomePageStep {

    @Given("I am in the google home page")
    public void i_am_in_the_google_home_page() {
        DriverManager.getDriver().get(ConfigurationReader.getProperty("google"));
    }

    @Then("verify google home page title")
    public void verify_google_home_page_title() {
        System.out.println("Current title: " + driver.getTitle());
    }

    @Then("I verified expected title is {string}")
    public void iVerifiedExpectedTitleIs(String expectedTitle) {
        Assert.assertEquals(expectedTitle, driver.getTitle());
    }
}
