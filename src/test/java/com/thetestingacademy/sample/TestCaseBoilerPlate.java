package com.thetestingacademy.sample;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseBoilerPlate {
    public EdgeDriver driver;
    @BeforeTest
    public void OpenBrowser() {
        EdgeOptions edgeoptions = new EdgeOptions();
        edgeoptions.addArguments("--guest");
        driver = new EdgeDriver(edgeoptions);
    }

    @Test
    public void test(){
        driver.get("https://app.vwo.com");
        Assert.assertEquals(driver.getTitle(),"Login - VWO");
    }


        @AfterTest
                public void CloseBrowser() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.quit();
        }

    }


