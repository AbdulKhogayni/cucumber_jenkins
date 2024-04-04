package com.google.step_definitions;

import com.google.utilities.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static com.google.utilities.CoreUtils.getDesiredCapabilities;


public class HookClass {
    protected WebDriver driver;

    @Before()
    public void setUpScenario() throws MalformedURLException {
        System.out.println("BEFORE-setUP method is running before the scenario ");
        driver = DriverManager.getDriver();
        //ChromeOptions options = new ChromeOptions();
        //driver = new RemoteWebDriver(new URL("https://localhost:4444"),options);

//        DesiredCapabilities desiredCapabilities = getDesiredCapabilities();
//        driver = new RemoteWebDriver(new URL("http://192.168.0.5:4444"), desiredCapabilities);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().window().maximize();
    }

    @After
    public void tearDownScenario(Scenario scenario) {
        System.out.println("AFTER method is running..");
        if (scenario.isFailed()) {
            byte[] image = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(image, "image/png", scenario.getName());
            System.out.println("AFTER - tearDown method is running after the scenario:" + scenario.getName());
        }
        DriverManager.closeDriver();
        //driver.close();
    }
}
