package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "StepDefination",
     tags="@Regression",
       
        plugin = {
                "pretty",
                "html:target/htmlreport/report1.html",
                "json:target/jsonreport/report1.json",
                "junit:target/junitreport/report1.xml"
        }
)

public class TestRunner {

}

