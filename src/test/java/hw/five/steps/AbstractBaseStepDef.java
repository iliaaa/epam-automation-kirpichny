package hw.five.steps;

import driverutils.PropertiesSingleton;
import driverutils.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import pages.DifferentElementsPage;
import pages.IndexPage;
import pages.UserTable;

public class AbstractBaseStepDef {

    public PropertiesSingleton propertiesSingleton = PropertiesSingleton.getInstance();
    public WebDriver driver;

    IndexPage indexPage;
    DifferentElementsPage differentElementsPage;
    UserTable userTable;

    protected AbstractBaseStepDef() {
        driver = WebDriverSingleton.getInstance().getDriver();
        indexPage = new IndexPage(driver);
        differentElementsPage = new DifferentElementsPage(driver);
        userTable = new UserTable(driver);
    }
}
