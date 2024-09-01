package com.App.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registerpage {
    WebDriver driver;
    public registerpage(WebDriver driver)
    {
    this.driver = driver;
    }
    public void clickSaveAccountInformation() {
    driver.findElement(By.name("newAccount")).click();
    }
    public String getErrorMessage() {
    return driver.findElement(By.xpath("//h1[contains(text(),'HTTP Status 500')]")).getText();
    }
}
