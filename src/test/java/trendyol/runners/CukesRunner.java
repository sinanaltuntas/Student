package trendyol.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/html_reports",
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue="trendyol/stepdefinitions",
        dryRun = false,
        tags = "@Wip"

)
public class CukesRunner {

}
