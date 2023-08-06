package steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.SearchPage;

public class HomePageSteps {
    HomePage homePage = new HomePage();
    @Given("Verify homepage is displayed")
    public void verifyHomePage(){
        homePage.verifypage();
    }
    @Given("Accept cookies")
    public void acceptCookies(){
        homePage.acceptcookie();
    }
}
