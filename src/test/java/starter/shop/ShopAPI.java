package starter.shop;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ShopAPI {


    private static String SEARCH_BY_ITEM = "https://waarkoop-server.herokuapp.com/api/v1/search/test/{item}";


    @Step("Search item {item} in the shop")
    public void searchItemInTheShop(String item) {
        SerenityRest.given()
                .pathParam("item", item)
                .get(SEARCH_BY_ITEM);
    }
}
