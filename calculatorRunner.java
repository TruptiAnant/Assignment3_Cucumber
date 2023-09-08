package RunnerClass;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/FeatureFile/calculator.feature",
        glue = "StepsForFeatureFile"
)


public class calculatorRunner {

}
