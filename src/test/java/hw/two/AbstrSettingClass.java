package hw.two;

import driverutils.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AbstrSettingClass {
    public WebDriver driver;

    @BeforeClass
    public void setupDriverClass() {
        driver = new ChromeDriverManager().setupChromeDriver();
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
