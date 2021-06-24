package hw.two;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ExercisesHw2ex2 extends AbstrSettingClass {

    @Test
    public void exercise2() {

        //2 Navigate
        driver.navigate().to("https://jdi-testing.github.io/jdi-light/index.html");

        //3 Assert
        assertEquals(driver.getTitle(), "Home Page");

        //4 Login
        driver.findElement(By.cssSelector("li.dropdown.uui-profile-menu")).click();
        driver.findElement(By.cssSelector("[id = 'name']")).sendKeys("Roman");
        driver.findElement(By.cssSelector("[id = 'password']")).sendKeys("Jdi1234");
        driver.findElement(By.cssSelector("[id = 'login-button']")).click();

        //5 Get username
        WebElement userName = driver.findElement(By.cssSelector("[id = 'user-name']"));
        assertEquals(userName.getText(), "ROMAN IOVLEV");

        //6 Open Different Elements Page
        driver.findElement(By.cssSelector("div.uui-header.dark-gray a[class = 'dropdown-toggle']")).click();
        driver.findElement(By.cssSelector("ul.dropdown-menu a[href='different-elements.html']")).click();
        assertEquals(driver.getTitle(), "Different Elements");

        //7 Selecting checkboxes Water, Wind
        WebElement waterCheckbox = driver.findElement(By.xpath("//label[@class='label-checkbox']"
                + "[text()[contains(.,'Water')]]"));
        waterCheckbox.click();
        WebElement windCheckbox = driver.findElement(By.xpath("//label[@class='label-checkbox']"
                + "[text()[contains(.,'Wind')]]"));
        windCheckbox.click();

        //8 Selecting radio Selen
        WebElement selenRadio = driver.findElement(By.xpath("//label[@class='label-radio']"
                + "[text()[contains(.,'Selen')]]"));
        selenRadio.click();

        //9 Selecting color Yellow
        WebElement colorsDropdown = driver.findElement(By.xpath("//div[@class='colors']"));
        colorsDropdown.click();
        WebElement yellowDropdown = driver.findElement(By.xpath("//div[@class='colors']"
                + "//option[text()[contains(.,'Yellow')]]"));
        yellowDropdown.click();

        //10 Checking log panel
        assertTrue(driver.findElement(By.xpath("//section[@class='uui-info-panel-horizontal']"
                + "//div[text()[contains(.,'Log')]]")).isDisplayed());
        assertTrue(driver.findElement(By.xpath("//ul[@class='panel-body-list logs']"
                + "//li[contains(text(),'Colors:')]")).getText().contains(yellowDropdown.getText()));
        assertTrue(driver.findElement(By.xpath("//ul[@class='panel-body-list logs']"
                + "//li[contains(text(),'metal:')]")).getText().contains(selenRadio.getText()));
        assertTrue(driver.findElement(By.xpath("//ul[@class='panel-body-list logs']"
                + "//li[contains(text(),'Wind:')]")).getText().contains("true"));
        assertTrue(driver.findElement(By.xpath("//ul[@class='panel-body-list logs']"
                + "//li[contains(text(),'Water:')]")).getText().contains("true"));

    }
}
