package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
			features = {"src/test/java/AppFeatures/Uber.feature"},
			glue = {"stepDefinitions"},
			tags = "@Smoke",			
			plugin = {"pretty"}
		)
public class UberTest {

}
