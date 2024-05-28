package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = {"utility", "StepDefs"},

        plugin = {
                "pretty",
                "html:target/cucumber.html",
                "json:cucumber.json"
        }
)
public class TestRunner {


}
