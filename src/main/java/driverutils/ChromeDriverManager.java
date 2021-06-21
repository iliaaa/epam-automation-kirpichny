package driverutils;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


public class ChromeDriverManager implements Driverinterface {

    public static WebDriver driver;

    @BeforeClass
    public WebDriver setupChromeDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            //1 Open BR
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();

            //2 Navigate
            driver.navigate().to("https://jdi-testing.github.io/jdi-light/index.html");
        }
        return driver;
    }
}
