package testRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utility_Demoblazeproject.TeseBase_demoblazeproject;

@CucumberOptions(features = { "src/test/resources/Features_demoblazeproject" }, plugin = {
		"json:target/cucumber.json" }, glue = "stepDeff_demoblazeproject") // ,tags= "@S" )

public class TestRunner_demoblazeproject extends AbstractTestNGCucumberTests {

	@BeforeTest
	public void opentest() {
		TeseBase_demoblazeproject set = new TeseBase_demoblazeproject();
		 set.open2();

	}

	@AfterTest
	public void close() {

		TeseBase_demoblazeproject set = new TeseBase_demoblazeproject();
		set.driver.quit();

	}

}