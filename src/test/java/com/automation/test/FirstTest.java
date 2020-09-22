package com.automation.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;
import static junit.framework.TestCase.assertEquals;

public class FirstTest {
    @Test
    public void createTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");
        sleep(300);
        WebElement element = driver.findElement(By.className("main-slider__link"));
        
        driver.quit();
    }
}
