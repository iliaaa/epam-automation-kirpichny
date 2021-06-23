package hw.two;

import driverutils.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class AbstrSettingClass {
    public WebDriver driver;

    @BeforeMethod
    public void setupDriverClass() {
        driver = new ChromeDriverManager().setupChromeDriver();
    }

    @AfterMethod
    public void afterClass() {
        driver.quit();
    }
}
