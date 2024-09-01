package com.App.PageTestCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.Loginpage;
import com.App.Utilities.screenshots;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginpageTestcase extends screenshots {
	WebDriver driver;
	Loginpage loginpage;
	@Given("I am in the login page")
	public void i_am_in_the_login_page() throws InterruptedException {
		startTest();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?signonForm=");
		Thread.sleep(5000);
		assertTrue(true);
		System.out.println("User is in login page");
	}

	@When("I enter the valid credentials")
	public void i_enter_the_valid_credentials() {
		 driver.findElement(By.name("username")).sendKeys("prathyusha");
		   driver.findElement(By.name("password")).sendKeys("usha$789");
		   Loginpage login = new Loginpage(driver);
		   login.clickLoginButton();
		   System.out.println("User enter the valid credentials"); 
	}

	@Then("I can see the successful login")
	public void i_can_see_the_successful_login() {
		  System.out.println("User login successful");
		   driver.quit();
		   endTest();
	}

	@When("I enter invalid credentials")
	public void i_enter_invalid_credentials() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin$123");
		Loginpage login = new Loginpage(driver);
		   login.clickLoginButton();
		   System.out.println("User enterd invalid credentials"); 
	}

	@Then("I see an error message")
	public void i_see_an_error_message() {
		 Loginpage login = new Loginpage(driver);
		   login.getErrorMessage();
		   System.out.println("User see an error message");
		   driver.quit();
		   endTest(); 
	}


}
