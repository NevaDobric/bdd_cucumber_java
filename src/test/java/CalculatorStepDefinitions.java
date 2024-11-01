import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorStepDefinitions {

    private Calculator calc;

    @Given("a calculator I just turned on")
    public void a_calculator_i_just_turned_on() {
        calc = new Calculator();;
    }
    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        calc.push(int1);
        calc.push(int2);
        calc.push("+");
        //int result = calc.additionResult(int1,int2);
    }
    @Then("the result is {int}")
    public void the_result_is(double int1) {
    assertEquals(int1,calc.value());
    }
    @When("I subtract {int} from {int}")
    public void i_subtract_from(Integer int1, Integer int2) {
        calc.push(int1);
        calc.push(int2);
        calc.push("-");
    }
}
