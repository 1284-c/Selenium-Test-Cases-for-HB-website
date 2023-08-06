package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utilities;

import java.util.List;

public class ProductDetailPage extends Utilities {
    public ProductDetailPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "[class='productListContent-zAP0Y5msy8OHn5z7T_K_']")
    public List<WebElement> ProductsOnResults;
    // @FindBy(xpath="//span[@class ='otherBuyOptions']")

    @FindBy(xpath="//a[contains(text(),'Diğer Satıcılar')]")
    public WebElement OtherSaller;

    @FindBy(css = "[class='add-to-basket button small']")
    public List<WebElement> AddtoBasketButtons;

    //Click the first product on search results, if this product has no other sallers,go to next product.
    //Two products are added from different sallers
    public void ClickandAddProduct() {
        for (int i = 0; i < ProductsOnResults.size(); i++) {
            ProductsOnResults.get(i).click();
            if (OtherSaller.isDisplayed()) {
                System.out.println("saw the sallers");
                for (int j = 0; j <= 1; j++) {
                    AddtoBasketButtons.get(j).click();
                    System.out.println("product" + j + ". is added to basket");
                }
                break;

            }
          //  Assert.fail("not found product as expected");
            return;
        }
    }
}
