package Stepdefinitions;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Factory.DriverFactory;
import com.Utils.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Basehooks {
	private WebDriver driver;
	private ConfigReader configReader;
	private DriverFactory driverfactory;
	Properties prop;

	
	@Before(order =0)
		public void getProperty() {
			configReader = new ConfigReader();
			prop = configReader.init_prop();
		}
	@Before(order =1)
		public void launchbrowser() {
			String browsername = prop.getProperty("browser");
			driverfactory = new DriverFactory();
			driver = driverfactory.init_driver(browsername);
	}
	
	@After(order =1)
		public void teardown(Scenario sce) {
			if (sce.isFailed()) {
				String screnshotname = sce.getName().replaceAll(" ", "_");
				byte[] src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				sce.attach(src,"image/png",screnshotname);
			}}
	@After(order =0)
		public void closebrowser() {
			driver.close();
	}
}
