package com.App.PageTestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.AddProductToCartpage;
import com.App.PageObjects.Iconspage;
import com.App.Utilities.screenshots;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProductToCartpageTestcase extends screenshots {
	WebDriver driver;

	@Given("User is in Dogs page")
	public void user_is_in_Dogs_page() throws IOException  {
        startReport();
		startTest();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		Iconspage main = new Iconspage(driver);
		main.clickDogsIcon();
		takeScreenShot(driver);
		System.out.println("User is in Dogs page");

	}

	@When("User click on Product id and click on add to cart")
	public void user_click_on_Product_id_and_click_on_add_to_cart() throws InterruptedException, IOException {

	    driver.findElement(By.linkText("K9-RT-01")).click();
	    AddProductToCartpage addtocart = new AddProductToCartpage(driver);
	    addtocart.clickAddToCartButton();
	    takeScreenShot(driver);
	    Thread.sleep(5000);
	    System.out.println("User click on Product id and click on add to cart");

	}
	@Then("User can see a product in cart page")

	public void user_can_see_a_product_in_cart_page() throws IOException {

	    System.out.println("User can see a product in cart page");
	    takeScreenShot(driver);
	    driver.quit();
	    endTest();
	}
}
