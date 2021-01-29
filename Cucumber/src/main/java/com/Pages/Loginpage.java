package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Loginpage {
	public static WebDriver driver;
	
	@FindBy(id ="j_username")
	public static WebElement userid;
	@FindBy(name ="j_password")
	public static WebElement password;
	
	public Loginpage(WebDriver driver) {
		 Loginpage.driver=driver;
		 PageFactory.initElements(driver, this);
	}
}
 