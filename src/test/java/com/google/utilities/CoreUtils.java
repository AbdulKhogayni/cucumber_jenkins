package com.google.utilities;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CoreUtils {

    public static DesiredCapabilities getDesiredCapabilities() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName("chrome");
        desiredCapabilities.setPlatform(Platform.WIN11);
        return desiredCapabilities;
    }

    public static void logoDisplayed(WebElement element) {
        System.out.println("Logo displayed: " + element.isDisplayed());
    }

    public static String getWebElementText(WebElement element){
        return element.getText();
    }

    public static void SwitchToFrame(WebElement element) {
        DriverManager.getDriver().switchTo ().frame (element);
    }

}
