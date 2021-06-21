package hw.two;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class ExercisesHw2 extends AbstrSettingClass {

    @Test
    public void exercise1() {

        //3 Assert
        assertEquals(driver.getTitle(),
                "Home Page");

        //4 Login
        driver.findElement(By.cssSelector("li.dropdown.uui-profile-menu")).click();
        driver.findElement(By.cssSelector("[id = 'name']")).sendKeys("Roman");
        driver.findElement(By.cssSelector("[id = 'password']")).sendKeys("Jdi1234");
        driver.findElement(By.cssSelector("[id = 'login-button']")).click();

        //5 Get username
        WebElement userName = driver.findElement(By.cssSelector("[id = 'user-name']"));
        assertEquals(userName.getText(), "ROMAN IOVLEV");

        //6 Get buttons form hover
        assertEquals(driver.findElement(By.cssSelector("div.uui-header.dark-gray a[href='index.html']"))
                .getText(), "HOME");
        assertEquals(driver.findElement(By.cssSelector("div.uui-header.dark-gray a[href='contacts.html']"))
                .getText(), "CONTACT FORM");
        assertEquals(driver.findElement(By.cssSelector("div.uui-header.dark-gray a[class = 'dropdown-toggle']"))
                .getText(), "SERVICE");
        assertEquals(driver.findElement(By.cssSelector("div.uui-header.dark-gray a[href='metals-colors.html']"))
                .getText(), "METALS & COLORS");

        //7 Checking icons
        assertTrue(driver.findElement(By.cssSelector(".icons-benefit.icon-practise")).isDisplayed());
        assertTrue(driver.findElement(By.cssSelector(".icons-benefit.icon-custom")).isDisplayed());
        assertTrue(driver.findElement(By.cssSelector(".icons-benefit.icon-multi")).isDisplayed());
        assertTrue(driver.findElement(By.cssSelector(".icons-benefit.icon-base")).isDisplayed());

        //8 Checking text under icons
        List<WebElement> texts = driver.findElements(By.cssSelector(".benefit-txt"));
        assertEquals(texts.get(0).getText(), "To include good practices\n"
                + "and ideas from successful\n"
                + "EPAM project");
        assertEquals(texts.get(1).getText(), "To be flexible and\n"
                + "customizable");
        assertEquals(texts.get(2).getText(), "To be multiplatform");
        assertEquals(texts.get(3).getText(), "Already have good base\n"
                + "(about 20 internal and\n"
                + "some external projects),\n"
                + "wish to get more…");

        //9 Frame button is displayed
        driver.switchTo().frame("frame");
        assertTrue(driver.findElement(By.cssSelector("#frame-button")).isDisplayed(), "Frame Button is displayed");
        driver.switchTo().defaultContent();

        //10 Checking 5 items in the left section
        assertEquals(driver.findElement(By.cssSelector("ul.sidebar-menu.left > li:nth-of-type(1)"))
                .getText(), "Home");
        assertEquals(driver.findElement(By.cssSelector("ul.sidebar-menu.left > li:nth-of-type(2)"))
                .getText(), "Contact form");
        assertEquals(driver.findElement(By.cssSelector("ul.sidebar-menu.left > li:nth-of-type(3)"))
                .getText(), "Service");
        assertEquals(driver.findElement(By.cssSelector("ul.sidebar-menu.left > li:nth-of-type(4)"))
                .getText(), "Metals & Colors");
        assertEquals(driver.findElement(By.cssSelector("ul.sidebar-menu.left > li:nth-of-type(5)"))
                .getText(), "Elements packs");


    }

    @Test
    public void exercise2() {

        //1 Open BR
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        //2 Navigate
        driver.manage().window().maximize();
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
