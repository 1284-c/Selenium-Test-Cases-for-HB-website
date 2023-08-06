package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

import org.openqa.selenium.WebElement;
import utils.Utilities;
public class CommonSteps extends Utilities {


    @Before
    public void startDriver() {
        initialize();

    }
    @After
    public void terminateDriver(){
        terminate();

    }
    @Given("Navigate to {}")
    public void browserNavigate(String url){
        navigate(url);

    }


}
