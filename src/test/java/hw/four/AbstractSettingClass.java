package hw.four;

import driverutils.ChromeDriverManager;
import driverutils.SingletonForProperties;
import hw.four.steps.ActionStep;
import hw.four.steps.AssertionStep;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class AbstractSettingClass {

    protected SingletonForProperties singletonForProperties = SingletonForProperties.getInstance();
    protected WebDriver driver;

    protected ActionStep actionStep;
    protected AssertionStep assertionStep;

    public void setupClassForChrome() {
        driver = new ChromeDriverManager().setupChromeDriver();
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
