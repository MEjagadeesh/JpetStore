package com.App.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInpage {
     WebDriver driver;
     WebElement Signin;
 	public SignInpage(WebDriver driver) 
 	{
 		this.driver = driver;
 	}
 	public void clickSignInLink()
 	{
 		Signin = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
 		Signin.click();
 	}
}
