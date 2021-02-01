package Stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Factory.DriverFactory;
import com.Pages.Loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class loginstepdefinition  {
		private WebDriver driver = DriverFactory.getDriver();
		private Loginpage l = new Loginpage(driver);
	 
	 @Given("^user is available in login page$")
	 public void user_is_available_in_login_page() {
		driver.get("http://localhost:4949/");	
	}
	
	 @When("^title of login page is jenkins$")
	 public void title_of_login_page_is_jenkins(){
		Assert.assertEquals(driver.getTitle(),"Sign in [Jenkins]");
	}

	 @Then("^user enters \"(.*)\" and \"(.*)\" and login$")
	 public void user_enters_username_and_password_and_login(String username, String password) {
	   l.login(username, password);
	}

	@Then("^user is on homepage$")
	public void user_is_on_homepage()  {
		 Assert.assertEquals(driver.getTitle(),"Dashboard [Jenkins]");
	}
	
}
