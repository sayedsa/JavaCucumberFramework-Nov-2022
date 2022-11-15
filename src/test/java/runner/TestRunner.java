package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features"}, 
				 glue = {"stepDefinitions"}, 
				 tags = "@DataTable",
				 dryRun = false, 
				 monochrome = true,
				 stepNotifications=true,
				 plugin = {"pretty",
					        "html:target/cucumber-reports/cucumber-pretty",
					        "json:target/cucumber-reports/CucumberTestReport.json",
					        "rerun:target/cucumber-reports/rerun.txt"
					}
					
)
		

public class TestRunner {

}
