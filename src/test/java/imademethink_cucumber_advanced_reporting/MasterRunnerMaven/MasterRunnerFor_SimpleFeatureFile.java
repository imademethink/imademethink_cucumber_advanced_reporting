package imademethink_cucumber_advanced_reporting.MasterRunnerMaven;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/",
		monochrome = true,
        plugin = {
                       "pretty",
                       "html:target/cucumber",
                       "json:target/cucumber/cucumber.json",
        },
		tags = {"@homePageTest,@homePageTestOther"},
        glue = "imademethink_cucumber_advanced_reporting.StepDefinitions"
)


public class MasterRunnerFor_SimpleFeatureFile {
	
}

