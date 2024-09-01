package com.App.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Iconspage {
	WebDriver driver;
	WebElement fishIcon;
	WebElement dogIcon;
	WebElement catIcon;
	WebElement reptilesIcon;
	WebElement birdsIcon;
	public Iconspage(WebDriver driver) 
	{
		this.driver = driver;
	}
	public void clickFishIcon()
	{
		fishIcon = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
	    fishIcon.click();
	}
	public void clickDogsIcon()
	{
	     dogIcon = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[2]/img"));
	    dogIcon.click();
	} 
	public void clickCatsIcon()
	{
		catIcon = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[3]/img"));
	    catIcon.click();
	}
	public void clickReptilesIcon()
	{
		reptilesIcon = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[4]/img"));
	    reptilesIcon.click();
	}
	public void clickBirdsIcon()
	{
		birdsIcon = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[5]/img"));
	    birdsIcon.click();
	}
	


}
