package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/feature", // classpath:Features
		glue = "step.definition", // here we provide path to step Def classes
		dryRun = true, // this set to False and it checks if any step in feature has step def 
		tags ="@Retail", // we will run our scenarios using tags on top of each scenario
		monochrome = true, // this set to true so console output is readable
		strict = true, // this set to true so it will make the scenario failed if any steps failed
		plugin = {"pretty","html:target/site/cucumber-pretty","json:target/cucumber.json"},
		publish = true // this set to true so we can have an execution report

)

public class TestRunner {

}