package Runner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Features",
        glue = "StepDefinitions",
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true
)
public class RunnerTest extends AbstractTestNGCucumberTests {

}
