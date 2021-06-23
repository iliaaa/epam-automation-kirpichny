package driverutils;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


public class ChromeDriverManager implements Driverinterface {

    public WebDriver setupChromeDriver() {
        WebDriver driver = null;
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            //1 Open BR
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }
}
