package RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/GiftCard.feature",
glue= {"StepDefinitions"},
dryRun=false)
public class GiftCardRunner {

}
