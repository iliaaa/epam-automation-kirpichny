package driverutils;

import org.openqa.selenium.WebDriver;

public class WebDriverSingleton {
    private static WebDriver driver;

    private WebDriverSingleton() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = ChromeDriverManager.setupChromeDriver();
        }
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}
