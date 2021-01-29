package MyRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\151508\\git\\Cucumber\\Cucumber\\src\\test\\resources\\Features\\login.feature", //the path of the feature files
			glue={"Stepdefinitions"},
			//plugin= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
			monochrome = true, //display the console output in a proper readable format
			dryRun = false
			//tags = {"@RegressionTest"}
			)
	public class Testrunner {
}
