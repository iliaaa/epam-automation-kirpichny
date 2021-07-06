package hw.five.steps;

import driverutils.PropertiesSingleton;
import driverutils.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import pages.DifferentElementsPage;
import pages.IndexPage;
import pages.UserTable;

public class AbstractBaseStepDef {

    protected PropertiesSingleton propertiesSingleton = PropertiesSingleton.getInstance();
    protected IndexPage indexPage;
    protected DifferentElementsPage differentElementsPage;
    protected UserTable userTable;
    protected WebDriver driver;

    protected AbstractBaseStepDef() {
        driver = WebDriverSingleton.getDriver();
        indexPage = new IndexPage(driver);
        differentElementsPage = new DifferentElementsPage(driver);
        userTable = new UserTable(driver);
    }
}
