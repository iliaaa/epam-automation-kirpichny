package hw.two;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AbstrSettingClass {
    WebDriver driver = new ChromeDriver();

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
