package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utilities;

public class HomePage extends Utilities {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css ="[class='sf-OldHeader-FpTYTu4Avgrxt5ZgRSEL']")
    public WebElement hepsiburadaHeader;
    @FindBy(css ="[id='onetrust-accept-btn-handler']")
    public WebElement accept;
    public void verifypage() {
        waitUntilElementIsVisible(hepsiburadaHeader);
        return;
    }
    public void acceptcookie() {
        accept.click();
    }
}
