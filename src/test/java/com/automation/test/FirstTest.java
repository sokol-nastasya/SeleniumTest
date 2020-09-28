package com.automation.test;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;
import static junit.framework.TestCase.assertEquals;

public class FirstTest {
    @Test
    public void createTest() throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");
        sleep(300);
        WebElement element = driver.findElement(By.name("search"));
        element.sendKeys("Apple");
        element.submit();
        System.out.println("Page title is: " + driver.getTitle());
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//       Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File("./desktop/screenshot.png"));
        driver.quit();

        //локальная машина
//        File screenshots = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        String path = "./desktop/rozetka/screen" + screenshots.getName();
//        FileUtils.copyFile(screenshots, new File(path));
        //удал машина
//        WebDriver d = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
//        d.get("https://rozetka.com.ua/");
//        WebDriver augmentedDriver = new Augmenter().augment(driver);
//        File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
//        driver.quit();
    }
}
