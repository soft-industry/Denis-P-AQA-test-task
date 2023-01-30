package starter.shop;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class ShopSearchStepDefinitions {

    @Steps
    public ShopAPI shopAPI;

    @When("he searches item {string} in the shop")
    public void heCallsEndpoint(String item) {
        shopAPI.searchItemInTheShop(item);
    }

    @Then("he sees the results displayed for {string}")
    public void heSeesTheResultsDisplayedForItem(String item) {
        restAssuredThat(response -> response.statusCode(200).body("title", everyItem(containsStringIgnoringCase(item))));
    }

    @Then("he does not see the results without crashes")
    public void he_Does_Not_See_The_Results() {
        restAssuredThat(response -> response.statusCode(404).body("detail.error", equalTo(Boolean.TRUE)));
    }
}
