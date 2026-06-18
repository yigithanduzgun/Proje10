package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features =
                "src/test/resources/features",

        glue =
                "stepDefinitions",

        plugin = {
                "pretty",
                "html:target/report.html"//?
        },

        monochrome = true
)
public class TestRunner  extends AbstractTestNGCucumberTests {
}