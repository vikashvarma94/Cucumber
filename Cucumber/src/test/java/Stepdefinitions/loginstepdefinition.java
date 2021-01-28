package Stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class loginstepdefinition {

	 WebDriver driver;
	 
	 @Given("^user is available in login page$")
	 public void user_is_available_in_login_page() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:4949/");	
	}
	
	 @When("^title of login page is jenkins$")
	 public void title_of_login_page_is_jenkins(){
		Assert.assertEquals(driver.getTitle(),"Sign in [Jenkins]");
	}

	 @Then("^user enters \"(.*)\" and \"(.*)\"$")
	 public void user_enters_username_and_password(String username, String password) {
	   driver.findElement(By.id("j_username")).sendKeys(username);
	   driver.findElement(By.name("j_password")).sendKeys(password);
	}

	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() {
		driver.findElement(By.name("Submit")).click();
	}

	@Then("^user is on homepage$")
	public void user_is_on_homepage()  {
		 Assert.assertEquals(driver.getTitle(),"Dashboard [Jenkins]");
	}
	
	@Then("^close the browser$")
	public void close_the_browser() {
		driver.close();
	}
}
