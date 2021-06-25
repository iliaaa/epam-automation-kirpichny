package hw.four;

import driverutils.ChromeDriverManager;
import hw.four.steps.ActionStep;
import hw.four.steps.AssertionStep;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public abstract class AbstractSettingClass {
    public Properties property;
    public WebDriver driver;

    ActionStep actionStep;
    AssertionStep assertionStep;

    public void setupClassForChrome() {
        driver = new ChromeDriverManager().setupChromeDriver();
        property = new Properties();
        try {
            FileInputStream fis = new FileInputStream("config.properties");
            property.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @BeforeMethod
    public void setupChromeDriverClass(ITestContext testContext) {
        setupClassForChrome();
        actionStep = new ActionStep(driver);
        assertionStep = new AssertionStep(driver);

        testContext.setAttribute("driver", driver);
    }

    @AfterMethod
    public void afterClass() {
        driver.quit();
    }
}
