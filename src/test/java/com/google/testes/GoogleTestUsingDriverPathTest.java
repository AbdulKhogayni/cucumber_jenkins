package com.google.testes;

import com.google.utilities.CoreUtils;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static com.google.utilities.CoreUtils.getDesiredCapabilities;

public class GoogleTestUsingDriverPathTest {
    WebDriver driver;
    @Test
    public void googleTest() throws MalformedURLException {
//        String path = "com/google/drivers";
//        System.setProperty("user.dir", path);
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com/");
//        driver.close();

        DesiredCapabilities desiredCapabilities = getDesiredCapabilities();
        driver = new RemoteWebDriver(new URL("http://192.168.0.5:4444"), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        System.out.println("Title: " + driver.getTitle());
        driver.close();
    }


}
