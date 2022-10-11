package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

import java.math.BigDecimal;

import static java.lang.Math.round;

public class ConverterSteps {
    private double firstCurrency;
    private double rate;
    private double result;

    @Given("firstCurrency is {double} EUR")
    public void firstcurrencyIsEUR(double arg0) {
        firstCurrency =arg0;
    }

    @And("rate is {double}")
    public void rateIs(double arg0) {
        rate = arg0;
    }

    @When("firstCurrency is enter")
    public void firstcurrencyIsEnter() {
        result =round(firstCurrency * rate*100.0)/100.0 ;

    }

    @Then("the result should be {double} USD")
    public void theResultShouldBeUSD(double arg0) {
        Assertions.assertThat(result).isEqualTo(arg0);
    }
}

