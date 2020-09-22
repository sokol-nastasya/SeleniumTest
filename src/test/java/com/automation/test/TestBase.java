package com.automation.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;
    public WebDriver getDriver(){
        if(driver==null){
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;
    }
    @Test()
    public void test(){
        getDriver().get("https://www.google.com/");
        getDriver().findElement(By.name("q"))
                .sendKeys("templatemonster");}

    @AfterTest()
    public void close(){
        getDriver().close();
    }
}

