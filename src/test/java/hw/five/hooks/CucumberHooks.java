package hw.five.hooks;

import driverutils.WebDriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {

    @Before
    public void setUp() {
        WebDriverSingleton.getInstance().getDriver();
    }

    @After
    public void tearDown() {
        WebDriverSingleton.getInstance().getDriver().quit();
    }
}
