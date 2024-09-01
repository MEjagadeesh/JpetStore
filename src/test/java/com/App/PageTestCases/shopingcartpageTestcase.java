package com.App.PageTestCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.AddProductToCartpage;
import com.App.PageObjects.Iconspage;
import com.App.PageObjects.shopingcartpage;
import com.App.Utilities.screenshots;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class shopingcartpageTestcase extends screenshots {
   WebDriver driver;
   @Given("I am in shopping cart")
   public void i_am_in_shopping_cart() throws InterruptedException, IOException {
	   startTest();
	   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	   Iconspage main = new Iconspage(driver);
	   main.clickDogsIcon();
	   Thread.sleep(5000);
	   driver.findElement(By.linkText("K9-RT-01")).click();
	   AddProductToCartpage addtocart = new AddProductToCartpage(driver);
	      addtocart.clickAddToCartButton();
	   shopingcartpage cart = new shopingcartpage(driver);
	   cart.clickCart();
	   assertTrue(driver.getCurrentUrl().contains("Cart"), "Not in shopping cart");
	   System.out.println("I am in shopping cart");
	   takeScreenShot(driver);
   }

   @When("I am changing the quantity of the product and click on update cart")
   public void i_am_changing_the_quantity_of_the_product_and_click_on_update_cart() throws InterruptedException {
	   driver.findElement(By.name("EST-28")).click();
	   shopingcartpage cart = new shopingcartpage(driver);
	      cart.updateQuantity("EST-28", 3);
	      System.out.println("I am changing the quantity of the product and click on update cart");
   }

   @Then("I can see the updated details in the cart")
   public void i_can_see_the_updated_details_in_the_cart() throws IOException {
	   System.out.println("I can see the updated details in the cart");
	   takeScreenShot(driver);
	   driver.quit();
	   endTest();
   }

   @When("I click on the remove button")
   public void i_click_on_the_remove_button() {
	   driver.findElement(By.name("EST-28"));
	   shopingcartpage cart = new shopingcartpage(driver);
	   cart.removeProduct();
	   System.out.println("I click on the remove button");
   }

   @Then("I am removed product successfully")
   public void i_am_removed_product_successfully() {
	   System.out.println("I removed the product successfully");
	   driver.quit();
	   endTest();
   }

}
