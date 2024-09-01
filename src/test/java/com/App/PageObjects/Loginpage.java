package com.App.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
     WebDriver driver;
     public Loginpage(WebDriver driver) {
    	 this.driver = driver;
    	 }
    	 public void clickLoginButton() {
    	 driver.findElement(By.name("signon")).click();
    	 }
    	 public String getErrorMessage() {
    	 return driver.findElement(By.xpath("//li[contains(text(),'Invalid username or password')]")).getText();
    	 }

}
