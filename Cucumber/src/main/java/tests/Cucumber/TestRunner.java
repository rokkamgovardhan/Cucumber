package tests.Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=false,
		tags= {"@Govardhan"},
		glue= {"tests.Cucumber"},
		features= {"src/main/java/"},
		monochrome = true,
		plugin = {"json:cucumber-report.json"})
public class TestRunner {
	

}
