package com.google.pages;

import com.google.utilities.DriverManager;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonHomePage extends BaseTest {

    @FindBy(xpath = "//div[@id='nav-logo']")
    public WebElement amazon_Logo;

    @FindBy(id = "searchDropdownBox")
    public WebElement allDepartments;

    public void getLogoText(WebElement element) {
        System.out.println("Logo displayed: " + element.isDisplayed());
    }

    public void getCurrentDepartment(WebElement element, String actualValue) {

        Select selectedDepartment = new Select(element);
        String defaultDepartment = selectedDepartment.getFirstSelectedOption().getText();
        System.out.println("Selected department: " + defaultDepartment);
        if (actualValue.equals(defaultDepartment)) {
            System.out.println("Expected value matched: " + defaultDepartment);
        } else {
            System.out.println("Value not matched.");
        }
        Assert.assertEquals(defaultDepartment, actualValue);
    }
}
