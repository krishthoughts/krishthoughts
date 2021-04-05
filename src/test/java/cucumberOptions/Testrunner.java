package cucumberOptions;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;





@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefinitions"
		)
public class Testrunner {
	
}

// we are seeing an issue here that is unable to execute with multiple parameters