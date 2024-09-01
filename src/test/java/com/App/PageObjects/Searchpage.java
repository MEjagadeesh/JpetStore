package com.App.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Searchpage {
	WebDriver driver;

	By searchBox = By.name("keyword");

	By searchButton = By.xpath("//input[@type='submit']");

	By errorMessage = By.xpath("//div[@id='Content']");

	public Searchpage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void enterSearchTerm(String searchTerm)
	{
		driver.findElement(searchBox).sendKeys(searchTerm);
	}
	public void clickSearchButton()
	{
		driver.findElement(searchButton).click();
	}
	public boolean isSearchResultsPageDisplayed()
	{
		return driver.getTitle().contains("SearchResults");
	}
	public boolean isErrorMessageDisplayed()
	{
		return driver.findElement(errorMessage).isDisplayed();
	}
}
