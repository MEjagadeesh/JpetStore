package com.App.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	WebDriver driver;
    WebElement entertheStore;
    public Homepage(WebDriver driver)
    {
    	this.driver = driver;
    }
    public void clickEntertheStore()
    {
    	entertheStore = driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a"));
    	entertheStore.click();
    }
}
