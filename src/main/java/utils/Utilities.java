package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.driver.Driver;

public class Utilities extends Driver {
    public void navigate(String url){driver.get(url);}
    public void waitFor(double seconds){
        try{
            Thread.sleep((long) (seconds*1000));
        }
        catch (InterruptedException ignored){}
    }
    public void waitUntilElementIsVisible(WebElement element) {
        WebDriverWait wait =new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
