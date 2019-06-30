package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(monochrome=false ,features="src/test/resources/features",glue= "src/test/java/steps",plugin = {
		"pretty", "html:target/cucumber"})
public class TestRunner 
{
}
