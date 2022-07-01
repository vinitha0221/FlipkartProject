package runnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "FeatureFolder" }, glue = { "businessLogics" }, monochrome = true, dryRun = false, plugin = {
				"pretty", "html:target/cucumber.html", "json:target/output.json" }, tags = "@EndToEnd"

)
public class StepRunner_Filpkart {

}
