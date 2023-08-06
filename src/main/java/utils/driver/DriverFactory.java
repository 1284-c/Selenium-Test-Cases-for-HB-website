package utils.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver getDriver(String driverName,WebDriver driver)  {
        Properties properties =new Properties();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        try {
            properties.load(new FileReader("src/main/resources/test.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        switch(driverName.toLowerCase()){
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("disable-notifications");
                System.setProperty("webdriver.chrome.driver", "src/main/resource/drivers/chromedriver");
                driver = new ChromeDriver(chromeOptions);

                break;
            case "safari":
                break;
            default:
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
