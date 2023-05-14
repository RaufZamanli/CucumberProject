package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles"}, // path of feature files
        glue = {"StepDefinitions"} // package where codes have been written
)



public class RunAll extends AbstractTestNGCucumberTests {

}
