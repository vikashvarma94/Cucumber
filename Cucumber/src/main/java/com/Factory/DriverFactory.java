package com.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver() {
		return tldriver.get();
	}
	
	public WebDriver init_driver(String browser) {
		
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			tldriver.set(new ChromeDriver());	
		}else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tldriver.set(new FirefoxDriver());
		}else if (browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			tldriver.set(new EdgeDriver());	
		}else if (browser.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			tldriver.set(new InternetExplorerDriver());
		}else {
			System.out.println("Give me proper driver name");
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();		
	}
}
