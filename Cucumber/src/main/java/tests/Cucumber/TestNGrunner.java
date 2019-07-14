package tests.Cucumber;

import org.w3c.dom.views.AbstractView;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		dryRun=false,
		/*tags= {"@Reddy"},*/
		glue= {"tests.Cucumber"},
		features= {"src\\main\\java\\tests\\Cucumber\\Practice.feature"},
		monochrome = true,
		//tags= {"@pract"},
		plugin = {"json:cucumber-report.json"},
		strict = true
		//snippets = SnippetType.CAMELCASE
		
		)
public class TestNGrunner extends AbstractTestNGCucumberTests{

}
