package com.App.PageTestCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.App.PageObjects.Homepage;
import com.App.Utilities.screenshots;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageTestcase extends screenshots {
	WebDriver driver;
	@Given("I am on the HOME page")
	public void I_am_on_the_HOME_page() throws InterruptedException, IOException {
		startTest();
		System.setProperty("WebDriver.chrome.driver", "Chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.get("http://petstore.octoperf.com"); 
	      System.out.println("I am on the Home page");
	      Thread.sleep(2000);
	      takeScreenShot(driver);	      
	}

	@When("I clicks on the Enter the Store link")
	public void I_clicks_on_the_Enter_the_Store_link() throws InterruptedException {
		Homepage home = new Homepage(driver);
	      home.clickEntertheStore(); 
	      Thread.sleep(5000);
	}

	@Then("I reaches the main page")
	public void I_reaches_the_main_page() throws InterruptedException, IOException {
		boolean isReachesMainPage = true;
		System.out.println("I reaches the main page");
		Thread.sleep(5000);
		takeScreenShot(driver);
		assertTrue(isReachesMainPage);
	      driver.quit();
	      endTest();
	}
}
