package com.google.step_definitions;

import com.google.utilities.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class HookClass {
    protected WebDriver driver;

    @Before()
    public void setUpScenario() {
        System.out.println("BEFORE-setUP method is running before the scenario ");
        driver = DriverManager.getDriver();
    }

    @After
    public void tearDownScenario(Scenario scenario) {
        System.out.println("AFTER method is running..");
        if (scenario.isFailed()){
            byte[] image = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(image, "image/png", scenario.getName());
            System.out.println("AFTER - tearDown method is running after the scenario:" + scenario.getName());
        }
        DriverManager.closeDriver();
    }
}
