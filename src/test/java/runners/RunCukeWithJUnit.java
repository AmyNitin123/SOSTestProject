package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/featurefiles"},plugin={"json:target/cucumber.json"},glue="steps")
	@RunWith(Cucumber.class)
	public class RunCukeWithJUnit{
		
		
		

	}


