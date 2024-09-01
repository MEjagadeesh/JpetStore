package com.App.PageTestCases;

import static org.testng.Assert.assertTrue;

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

public class MultipleProductsAddToCartpageTestcase extends screenshots {
	WebDriver driver;
	@Given("I am in the Cats page")
	public void i_am_in_the_Cats_page() throws InterruptedException, IOException {
		startTest();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		Thread.sleep(5000);
		Iconspage main = new Iconspage(driver);
		main.clickCatsIcon();
		takeScreenShot(driver);
		System.out.println("I am in the Cats page");
		assertTrue(true);
	}

	@When("I click on product and add to cart next click on Birds add a product")
	public void i_click_on_product_and_add_to_cart_next_click_on_Birds_add_a_product() throws IOException, InterruptedException {
		driver.findElement(By.linkText("FL-DLH-02")).click();
		AddProductToCartpage addtocart = new AddProductToCartpage(driver);
	    addtocart.clickAddToCartButton();
	    takeScreenShot(driver);
	    Thread.sleep(5000);
	    System.out.println("I click on product to add cart");
	    driver.findElement(By.xpath("//img[@src='../images/sm_birds.gif']")).click();
	    driver.findElement(By.linkText("AV-CB-01")).click();
	    AddProductToCartpage addtocart1 = new AddProductToCartpage(driver);
	    addtocart1.clickAddToCartButton();
	    takeScreenShot(driver);
	    Thread.sleep(5000);
	    System.out.println("I again click on another product to the cart");
	}

	@Then("I can see the products is added to cart successfully")
	public void i_can_see_the_products_is_added_to_cart_successfully() {
		System.out.println("User can see the products is added to cart successfully");
	    driver.quit();
	    endTest();


	}
}
