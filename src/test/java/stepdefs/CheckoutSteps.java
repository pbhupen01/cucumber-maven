package stepdefs;

import com.practice.Checkout;
import cucumber.api.java.en.*;
import org.junit.Assert;
import java.util.Map;
import java.util.HashMap;

public class CheckoutSteps {

    Map<String, Integer> priceMap = new HashMap<>();
    Checkout checkout = new Checkout(); ;

    @Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
    public void the_price_of_a_is_c(String name, int price) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        priceMap.put(name, price);
    }

    @When("^I checkout (\\d+) \"([^\"]*)\"$")
    public void i_checkout(int itemCount, String itemName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        checkout.add(itemCount, priceMap.get(itemName));
    }

    @Then("^the total price should be (\\d+)c$")
    public void the_total_price_should_be_c(int total) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(total, checkout.total());
    }
}