package com.google.step_depenitions;

import com.google.utilities.ConfigurationReader;
import com.google.utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import static com.google.utilities.DriverManager.driver;

public class FacebookPageStepDefs {

    @Given("I am in the facebook home page")
    public void i_am_in_the_facebook_home_page() {
        DriverManager.getDriver().get(ConfigurationReader.getProperty("facebook"));
    }

    @When("I enter username {string}")
    public void iEnterUsername(String user_name) {
        WebElement element = driver.findElement(By.id("email"));
        element.sendKeys(user_name);

    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        WebElement element = driver.findElement(By.id("pass"));
        element.sendKeys(password);
    }

    @When("click on the sign in button")
    public void click_on_the_sign_in_button() {
        WebElement element = driver.findElement(By.xpath("//button[@name='login']"));
        element.click();
    }

    @Then("I should see my profile")
    public void i_should_see_my_profile() {
        //driver.close();
    }
}
