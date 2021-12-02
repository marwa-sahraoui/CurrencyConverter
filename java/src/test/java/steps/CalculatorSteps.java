package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class CalculatorSteps {
    private int firstNumber;
    private int secondNumber;
    private int result;

    @Given("the first number is {int}")
    public void theFirstNumberIs(int arg0) {
        firstNumber = arg0;
    }

    @And("the second number is {int}")
    public void theSecondNumberIs(int arg0) {
        secondNumber = arg0;
    }

    @When("the two numbers are added")
    public void theTwoNumbersAreAdded() {
        result = firstNumber + secondNumber;
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int arg0) {
        Assertions.assertThat(arg0).isEqualTo(result);
    }
}
