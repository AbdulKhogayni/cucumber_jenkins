package com.google.step_definitions;

import com.google.pages.GooglePage;
import com.google.utilities.ConfigurationReader;
import com.google.utilities.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class GoogleHomePageStep {
    GooglePage page = new GooglePage();

    @Given("I am in the google home page")
    public void i_am_in_the_google_home_page() {
        DriverManager.getDriver().get(ConfigurationReader.getProperty("google"));
    }

    @Then("verify google home page title")
    public void verify_google_home_page_title() {
        System.out.println("Current title: " + DriverManager.getDriver().getTitle());
    }

    @Then("I verified expected title is {string}")
    public void iVerifiedExpectedTitleIs(String expectedTitle) {
        Assert.assertEquals(expectedTitle, DriverManager.getDriver().getTitle());
    }

    @Then("I send text {string}")
    public void iSendText(String text) {
        page.searchBar.sendKeys(text);
    }

    @Then("I should see the result")
    public void iShouldSeeTheResult() {
        System.out.println("Result count: " + page.searchResult.size());
        for (WebElement element : page.searchResult) {
            System.out.println(element.getText());
        }
    }

    @Then("from the result list click on {string} if available")
    public void fromTheResultListClickOnIfAvailable(String value) {
        page.searchResultList(page.searchResult, value);
    }
}
