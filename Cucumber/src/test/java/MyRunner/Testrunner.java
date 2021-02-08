package MyRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\151508\\git\\Cucumber\\Cucumber\\src\\test\\resources\\Features", // the path of feature		\\login.feature																																																	// feature																													// files
		glue = { "Stepdefinitions" },
		plugin = { "pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/" }, // to generate different types of reporting
		monochrome = true, // display the console output in a proper readable format
		dryRun = false
		// tags = {"@RegressionTest"}
)
public class Testrunner {
}
