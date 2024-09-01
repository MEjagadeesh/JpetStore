package com.App.PageTestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.Homepage;
import com.App.PageObjects.SignInpage;
import com.App.Utilities.screenshots;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninPageTestcase extends screenshots {
  WebDriver driver;
	@Given("I am on the main page")
	public void i_am_on_the_main_page() throws IOException {
		startTest();
		System.setProperty("WebDriver.chrome.driver", "Chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://petstore.octoperf.com");
        Homepage home = new Homepage(driver);
        home.clickEntertheStore();
        takeScreenShot(driver);
	}

	@When("I clicks on the Sign In icon")
	public void i_clicks_on_the_Sign_In_icon() {
		System.out.println("I click on the SignIn icon");
		SignInpage div= new SignInpage(driver);
	      div.clickSignInLink(); 
	}

	@Then("I reaches the Sign In page")
	public void i_reaches_the_Sign_In_page() throws InterruptedException, IOException {
		System.out.println("I reaches the SignIn page");
		Thread.sleep(5000);
		takeScreenShot(driver);
		driver.quit();
		endTest();
		endReport();
	}

}
