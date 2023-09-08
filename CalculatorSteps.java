package StepsForFeatureFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class CalculatorSteps {
    private int result;
    private Calculator calculator = new Calculator();

    @Given("I have entered {int} into the calculator")
    public void i_have_entered_into_the_calculator(int number) {
        calculator.enter(number);
    }

    @When("I press add")
    public void i_press_add() {
        result = calculator.add();
    }

    @Then("the result should be {int} on the screen")
    public void the_result_should_be_on_the_screen(int expected) {
        assertEquals(expected, result);
    }
}
