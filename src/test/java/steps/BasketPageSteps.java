package steps;

import io.cucumber.java.en.Given;
import pages.BasketPage;

public class BasketPageSteps {
    BasketPage basketPage = new BasketPage();
    @Given("Check products in basket")
    public void checkBasket(){
        basketPage.verifyProductInBasket();
    }
}
