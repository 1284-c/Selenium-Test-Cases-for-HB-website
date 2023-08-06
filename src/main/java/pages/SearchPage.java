package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utilities;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.List;

public class SearchPage extends Utilities {
    public SearchPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@role='combobox']//input[@type ='text']")
    public WebElement searchbar;
    public void Search(String text) {
        searchbar.sendKeys(text);
        return;
    }
    @FindBy(xpath = "//div[text()=\"ARA\"]")
    public WebElement searchbutton;
    public void ClickSearchButton() {
        searchbutton.click();
        return;
    }


}
