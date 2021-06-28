package hw.three;

import driverutils.ChromeDriverManager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class AbstractSettingClass {
    public Properties property;
    public WebDriver driver;

    public void setupClassForChrome() {
        driver = new ChromeDriverManager().setupChromeDriver();
        property = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
            property.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
