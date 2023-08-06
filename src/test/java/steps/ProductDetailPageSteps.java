package steps;

import io.cucumber.java.en.Given;
import pages.ProductDetailPage;

public class ProductDetailPageSteps {
    ProductDetailPage productDetailPage = new ProductDetailPage();

    @Given("Select an item from search results and go to product detail and add two products to basket")
    public void SelectProduct(){
        productDetailPage.ClickandAddProduct();

    }
}
