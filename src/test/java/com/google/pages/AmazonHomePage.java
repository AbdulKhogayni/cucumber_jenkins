package com.google.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonHomePage extends BaseTest {

    @FindBy(xpath = "//div[@id='nav-logo']")
    public WebElement amazon_Logo;

    ////i[@aria-label='Amazon']
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

    public void getAllDepartmentsNames(WebElement allDepartments) {
        int count = 0;
        Select selectedDepartment = new Select(allDepartments);
        List<WebElement> allDepartment = selectedDepartment.getOptions();
        System.out.println("Count of departments: " + allDepartment.size());
        for (WebElement each : allDepartment) {
            count++;
            System.out.println(count + ": " + each.getText());
        }
    }
}
