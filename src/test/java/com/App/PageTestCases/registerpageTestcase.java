package com.App.PageTestCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.App.PageObjects.registerpage;
import com.App.Utilities.screenshots;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registerpageTestcase extends screenshots {
    WebDriver driver;
    @Given("I am in registration page")
    public void i_am_in_registration_page() throws InterruptedException, IOException {
    	startTest();
    	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
    	Thread.sleep(5000);
    	takeScreenShot(driver);
    	assertTrue(true);
    }

    @When("I have to enter details in registration page and click on resister button")
    public void i_have_to_enter_details_in_registration_page_and_click_on_resister_button() throws InterruptedException, IOException {
    	Thread.sleep(5000);
    	driver.findElement(By.name("username")).sendKeys("Jagadeesh");
    	driver.findElement(By.name("password")).sendKeys("Jaga@123");
    	driver.findElement(By.name("repeatedPassword")).sendKeys("Jaga@123");
    	driver.findElement(By.name("account.firstName")).sendKeys("Jagadeesh");
    	driver.findElement(By.name("account.lastName")).sendKeys("M");
    	driver.findElement(By.name("account.email")).sendKeys("jagadeeshmeesala21@gmail.com");
    	driver.findElement(By.name("account.phone")).sendKeys("6304339069");
    	driver.findElement(By.name("account.address1")).sendKeys("vizag");
    	driver.findElement(By.name("account.address2")).sendKeys("vizag");
    	driver.findElement(By.name("account.city")).sendKeys("vizag");
    	driver.findElement(By.name("account.state")).sendKeys("Andhrapradesh");
    	driver.findElement(By.name("account.zip")).sendKeys("530017");
    	driver.findElement(By.name("account.country")).sendKeys("India");
    	takeScreenShot(driver);
    	registerpage register = new registerpage(driver);
    	register.clickSaveAccountInformation();
    	System.out.println("I entered details");
    }

    @Then("I can register successfully")
    public void i_can_register_successfully() throws IOException {
    	 System.out.println("I can register successfully");
    	 takeScreenShot(driver);
    	   driver.quit();
    	   endTest();
    }

    @When("I miss some details to enter and click on register button")
    public void i_miss_some_details_to_enter_and_click_on_register_button() {
    	driver.findElement(By.name("username")).sendKeys("Jagadeesh");
    	driver.findElement(By.name("password")).sendKeys("Jaga@123");
    	driver.findElement(By.name("repeatedPassword")).sendKeys("Jaga@123");
    	driver.findElement(By.name("account.firstName")).sendKeys("Jagadeesh");
    	driver.findElement(By.name("account.lastName")).sendKeys("M");
    	driver.findElement(By.name("account.address1")).sendKeys("vizag");
    	driver.findElement(By.name("account.city")).sendKeys("vizag");
    	driver.findElement(By.name("account.country")).sendKeys("India");
    	registerpage register = new registerpage(driver);
    	register.clickSaveAccountInformation();
    	System.out.println("User entered details and click on register button");
    }

    @Then("I get an error message")
    public void i_get_an_error_message() throws IOException {
    	 registerpage register = new registerpage(driver);
    	   register.getErrorMessage();
    	   System.out.println("User get an error message");
    	   takeScreenShot(driver);
    	   driver.quit();
    	   endTest();
    }

}
