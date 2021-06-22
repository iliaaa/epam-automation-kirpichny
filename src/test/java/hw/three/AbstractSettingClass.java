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
    public WebDriver driver;
    public Properties property;
    private FileInputStream fis;

    public void setupClassForChrome() {
        property = new Properties();
        try {
            fis = new FileInputStream("config.properties");
            property.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
