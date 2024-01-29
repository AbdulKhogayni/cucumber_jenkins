package com.google.pages;

import com.google.utilities.DriverManager;
import org.openqa.selenium.support.PageFactory;

public class BaseTest {
    public BaseTest() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }
}
