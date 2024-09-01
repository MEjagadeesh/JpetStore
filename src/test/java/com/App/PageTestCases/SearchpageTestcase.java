package com.App.PageTestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.Homepage;
import com.App.PageObjects.Searchpage;
import com.App.Utilities.screenshots;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchpageTestcase extends screenshots {
   WebDriver driver;
	@Given("I am in the pet store home page")
	public void I_am_in_the_pet_store_home_page() {
		startTest();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com");
		System.out.println("I am in the HOME page");
	}

	@When("I enter {string} in the search field")
	public void user_enter_in_the_search_field(String Fish) throws InterruptedException, IOException {
		Homepage home = new Homepage(driver);
		home.clickEntertheStore(); 
		Searchpage search = new Searchpage(driver);
		search.enterSearchTerm(Fish);
		Thread.sleep(5000);
		search.clickSearchButton();
		takeScreenShot(driver);
		System.out.println("I enter fish in the search field");
	}

	@Then("I see a list of search results contain fish")
	public void I_see_a_list_of_search_results_contain_fish() throws IOException {
		System.out.println("I see a list of search results");
		takeScreenShot(driver);
		driver.quit();
		endTest();
	}

	@When("I clicks the search button without entering a product name")
	public void the_user_clicks_the_search_button_without_entering_a_product_name() throws InterruptedException, IOException {
		Homepage home = new Homepage(driver);
		home.clickEntertheStore();
		Searchpage search = new Searchpage(driver);
	    search.clickSearchButton();
	    Thread.sleep(5000);
	    takeScreenShot(driver);
	    System.out.println("I clicks the search button without entering a product name");
	}

	@Then("an error message should display")
	public void an_error_message_should_display() throws IOException {
		System.out.println("An error message should display");
		takeScreenShot(driver);
		driver.quit();
		endTest();
	}
}
