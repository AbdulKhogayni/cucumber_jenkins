package com.google.pages;

import com.google.utilities.DriverManager;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class AmazonLoginPage extends BaseTest {

    @FindBy(xpath = "(//a[@data-nav-role ='signin'])[1]")
    public WebElement singInBar;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement sigInBtn;

    @FindBy(xpath = "//div//a//i[@aria-label='Amazon']")
    public WebElement amazonLogo;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailField;

    @FindBy(xpath = "//input[@id='continue']")
    public WebElement continueBtn;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordField;

    @FindBy(id = "signInSubmit")
    public WebElement innerSignInBtn;


    public void singInBar(WebElement element) {
        actions.moveToElement(element).build().perform();
    }

    public void sigInBtn(WebElement element) {
        element.click();
    }

    public void amazonLogDisplayed(WebElement element) {
        System.out.println("Logo displayed: " + element.isDisplayed());
    }

    public void emailField(WebElement element, String vlaue) {
        element.sendKeys(vlaue);
    }

    public void continueBtn(WebElement element) {
        element.click();
    }

    public void passwordField(WebElement element, String value) {
        element.sendKeys(value);
    }

    public void innerSignInBtn(WebElement element) {
        element.click();
    }
}
