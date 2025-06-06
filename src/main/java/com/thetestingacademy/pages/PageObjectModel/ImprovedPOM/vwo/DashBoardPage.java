package com.thetestingacademy.pages.PageObjectModel.ImprovedPOM.vwo;

import com.thetestingacademy.base.CommonToAllPages;
import com.thetestingacademy.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage extends CommonToAllPages {
    WebDriver driver;

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
    }

    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");


    // Page Actions
    public String loggedInUserName() {
        WaitHelpers.visibilityOfElement(userNameOnDashboard);
        return getText(userNameOnDashboard);
    }
}
