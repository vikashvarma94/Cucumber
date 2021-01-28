package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\151508\\eclipse-workspace\\Cucumber\\src\\test\\java\\Features\\login.feature", //the path of the feature files
			glue={"Stepdefinitions"},
			format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
			monochrome = true, //display the console output in a proper readable format
			dryRun = false
			)
	public class Testrunner {
}
