package com.google.step_definitions;

import com.google.pages.AmazonHomePage;
import com.google.utilities.ConfigurationReader;
import com.google.utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AmazonHomePageStepDefs {
    AmazonHomePage homePage = new AmazonHomePage();

    @Given("I am in amazon home page")
    public void i_am_in_amazon_home_page() {
        DriverManager.getDriver().get(ConfigurationReader.getProperty("amazon"));
    }

    @Then("I verify amazon logo is displayed")
    public void i_verify_amazon_logo_is_displayed() {
        homePage.getLogoText(homePage.amazon_Logo);
    }

    @And("I verify default selected department is {string}")
    public void iVerifyDefaultSelectedDepartmentIs(String defaultDepartment) {
        homePage.getCurrentDepartment(homePage.allDepartments, defaultDepartment);
        homePage.getAllDepartmentNames(homePage.allDepartments);
    }
}
