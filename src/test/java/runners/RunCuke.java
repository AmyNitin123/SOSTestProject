package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/featurefiles"},plugin={"json:target/cucumber.json"},glue="steps")
public class RunCuke extends AbstractTestNGCucumberTests {
	
	
	

}
