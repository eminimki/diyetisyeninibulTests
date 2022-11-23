package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@SmokeTest"
        ,features = "src/test/java"
        ,glue={"StepDefinition"}
)
public class RunnerForSmokeTests {
}
