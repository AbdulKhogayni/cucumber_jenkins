package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends BaseTest{
    @FindBy(name = "q")
    public WebElement searchBar;
}
