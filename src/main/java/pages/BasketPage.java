package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utilities;

import java.util.List;

public class BasketPage extends Utilities {
    public BasketPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="[class='checkoutui-ProductOnBasketHeader-nOvp_U8bHbLzgKbSUFaz']")
    WebElement addedToBasketText;
    @FindBy(css="[id='onboarding_item_list']")
    List<WebElement> productInBasket;
    public void verifyProductInBasket(){
        if(addedToBasketText.isDisplayed() & productInBasket.size()!=0 ){
            System.out.println("Product is added to basket properly");
        }
        else
        System.out.println("Product cannot be added to basket properly");

    }
}
