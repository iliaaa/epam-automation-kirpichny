package hw.three;

import driverutils.ChromeDriverManager;
import driverutils.PropertiesSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class AbstractSettingClass {

    public PropertiesSingleton propertiesSingleton = PropertiesSingleton.getInstance();
    public WebDriver driver;

    public void setupClassForChrome() {
        driver = new ChromeDriverManager().setupChromeDriver();
    }

    @BeforeClass
    public void setupChromeDriverClass() {
        setupClassForChrome();
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
