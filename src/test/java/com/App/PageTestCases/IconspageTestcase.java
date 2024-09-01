package com.App.PageTestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.Homepage;
import com.App.PageObjects.Iconspage;
import com.App.Utilities.screenshots;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IconspageTestcase extends screenshots {
   WebDriver driver;
	@Given("I am on the mainpage")
	public void i_am_on_the_mainpage() throws InterruptedException, IOException {
		startTest(); 
		System.setProperty("WebDriver.chrome.driver", "Chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.get("http://petstore.octoperf.com");
	        Homepage home = new Homepage(driver);
	        home.clickEntertheStore();
	        Thread.sleep(5000);
	        takeScreenShot(driver);
	        System.out.println("I am on the mainpage");
	}

	@When("I click on the fish icon")
	public void i_click_on_the_fish_icon() {
		System.out.println("I click on the fish icon");
	      Iconspage div= new Iconspage(driver);
	      div.clickFishIcon();        
	}

	@Then("I reaches the fish products page.")
	public void i_reaches_the_fish_products_page() throws InterruptedException, IOException {
		System.out.println("I reaches the fish products page");
		Thread.sleep(5000);
		takeScreenShot(driver);
		driver.quit();
		endTest();
	}

	@When("I click on the dogs icon")
	public void i_click_on_the_dog_icon() {
		System.out.println("I click on the dogs icon");
	      Iconspage div= new Iconspage(driver);
	      div.clickDogsIcon();
	}

	@Then("I reaches the dogs products page.")
	public void i_reaches_the_dogs_products_page() throws InterruptedException, IOException {
		System.out.println("I reaches the Dogs products page");
		Thread.sleep(5000);
		takeScreenShot(driver);
		driver.quit();
		endTest();

	}

	@When("I click on the cats icon")
	public void i_click_on_the_cats_icon() {
		System.out.println("I click on the cats icon");
	      Iconspage div= new Iconspage(driver);
	      div.clickCatsIcon();
	}

	@Then("I reaches the cats products page.")
	public void i_reaches_the_cats_products_page() throws InterruptedException, IOException {
		System.out.println("I reaches the cats products page");
		Thread.sleep(5000);
		takeScreenShot(driver);
		driver.quit();
		endTest();
		
	}

	@When("I click on the reptiles icon")
	public void i_click_on_the_reptiles_icon() {
		System.out.println("I click on the reptiles icon");
	      Iconspage div= new Iconspage(driver);
	      div.clickReptilesIcon();
	}

	@Then("I reaches the reptiles products page.")
	public void i_reaches_the_reptiles_products_page() throws InterruptedException, IOException {
		System.out.println("I reaches the reptiles products page");
		Thread.sleep(5000);
		takeScreenShot(driver);
		driver.quit();
		endTest();
	}

	@When("I click on the Birds icon")
	public void i_click_on_the_Birds_icon() {
		System.out.println("I click on the birds icon");
	      Iconspage div= new Iconspage(driver);
	      div.clickBirdsIcon();
	}

	@Then("I reaches the Birds products page.")
	public void i_reaches_the_Birds_products_page() throws InterruptedException, IOException {
		System.out.println("I reaches the birds products page");
		Thread.sleep(5000);
		takeScreenShot(driver);
         driver.quit();
         endTest();
	}

}
