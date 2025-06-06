package com.thetestingacademy.base;

import com.thetestingacademy.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.thetestingacademy.driver.DriverManager.driver;
import static java.sql.DriverManager.getDriver;

public class CommonToAllPages {
    public CommonToAllPages() {
        // If you want to call something before every Page Object Class call, Put your Code here");
        // Open File, Open Data Base Connection You can write code here
    }

    public void openVWOUrl(){
        driver.get(PropertiesReader.readKey("url"));
    }
    public void openOrangeHRMUrl(){
        driver.get(PropertiesReader.readKey("ohr_url"));
    }

    public void openKatalonUrl(){
        driver.get(PropertiesReader.readKey("katalon_url"));
    }



    public void clickElement(By by) {
        driver.findElement(by).click();
    }

    public void clickElement(WebElement by) {
        by.click();
    }

    public void enterInput(By by, String key) {
        driver.findElement(by).sendKeys(key);
    }

    public void enterInput(WebElement by, String key) {
        by.sendKeys(key);
    }

    public String getText(By by){
        return driver.findElement(by).getText();
    }

    public String getText(WebElement by){
        return by.getText();
    }

}
