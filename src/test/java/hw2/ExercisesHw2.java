package hw2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;

public class ExercisesHw2 {

    @Test
    public void exercise1() {
        setProperty("webdriver.chrome.driver",
                "/Users/a1/Downloads/epam-automation-kirpichny/src/main/resources/chromedriver");

        //1 Open BR
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        //2 Navigate
        driver.manage().window().maximize();
        driver.navigate().to("https://jdi-testing.github.io/jdi-light/index.html");

        //3 Assert
        Assert.assertEquals(driver.getTitle(),"Home Page");

        //4 Login
        driver.findElement(By.cssSelector("li.dropdown.uui-profile-menu")).click();
        driver.findElement(By.cssSelector("[id = 'name']")).sendKeys("Roman");
        driver.findElement(By.cssSelector("[id = 'password']")).sendKeys("Jdi1234");
        driver.findElement(By.cssSelector("[id = 'login-button']")).click();

        //5 Get username
        WebElement userName = driver.findElement(By.cssSelector("[id = 'user-name']"));
        Assert.assertEquals(userName.getText(), "ROMAN IOVLEV");

        //6 Get buttons form hover
        Assert.assertEquals(driver.findElement(By.cssSelector("div.uui-header.dark-gray a[href='index.html']")).getText(), "HOME");
        Assert.assertEquals(driver.findElement(By.cssSelector("div.uui-header.dark-gray a[href='contacts.html']")).getText(), "CONTACT FORM");
        Assert.assertEquals(driver.findElement(By.cssSelector("div.uui-header.dark-gray a[class = 'dropdown-toggle']")).getText(), "SERVICE");
        Assert.assertEquals(driver.findElement(By.cssSelector("div.uui-header.dark-gray a[href='metals-colors.html']")).getText(), "METALS & COLORS");

        //7 Checking icons
        driver.findElement(By.cssSelector(".icons-benefit.icon-practise")).isDisplayed();
        driver.findElement(By.cssSelector(".icons-benefit.icon-custom")).isDisplayed();
        driver.findElement(By.cssSelector(".icons-benefit.icon-multi")).isDisplayed();
        driver.findElement(By.cssSelector(".icons-benefit.icon-base")).isDisplayed();

        //8 Checking text under icons
        List<WebElement> texts = driver.findElements(By.cssSelector(".benefit-txt"));
        Assert.assertEquals(texts.get(0).getText(), "To include good practices\n" +
                "and ideas from successful\n" +
                "EPAM project");
        Assert.assertEquals(texts.get(1).getText(), "To be flexible and\n" +
                "customizable");
        Assert.assertEquals(texts.get(2).getText(), "To be multiplatform");
        Assert.assertEquals(texts.get(3).getText(), "Already have good base\n" +
                "(about 20 internal and\n" +
                "some external projects),\n" +
                "wish to get more…");

        //8 Checking text under icons, find by text
//        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='row clerafix benefits']//span[contains(text(), 'To include good practices')]")).getText(), "To include good practices\n" +
//                "and ideas from successful\n" +
//                "EPAM project\n");
//        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='row clerafix benefits']//span[contains(text(), 'customizable')]")).getText(), "To be flexible and\n" +
//                "customizable");
//        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='row clerafix benefits']//span[contains(text(), 'multiplatform')]")).getText(), "To be multiplatform");
//        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='row clerafix benefits']//span[contains(text(), 'about 20 internal and')]")).getText(), "Already have good base\n" +
//                "(about 20 internal and\n" +
//                "some external projects),\n" +
//                "wish to get more…\n");

        //9 Frame button is displayed
        driver.switchTo().frame("frame");
        Assert.assertTrue(driver.findElement(By.cssSelector("#frame-button")).isDisplayed(), "Frame Button is displayed");
        driver.switchTo().defaultContent();

        //10 Checking 5 items in the left section
        Assert.assertEquals(driver.findElement(By.cssSelector("ul.sidebar-menu.left > li:nth-of-type(1)")).getText(), "Home");
        Assert.assertEquals(driver.findElement(By.cssSelector("ul.sidebar-menu.left > li:nth-of-type(2)")).getText(), "Contact form");
        Assert.assertEquals(driver.findElement(By.cssSelector("ul.sidebar-menu.left > li:nth-of-type(3)")).getText(), "Service");
        Assert.assertEquals(driver.findElement(By.cssSelector("ul.sidebar-menu.left > li:nth-of-type(4)")).getText(), "Metals & Colors");
        Assert.assertEquals(driver.findElement(By.cssSelector("ul.sidebar-menu.left > li:nth-of-type(5)")).getText(), "Elements packs");


        //Close driver
        driver.close();
    }

    @Test
    public void exercise2() {

        //1 Open BR
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        //2 Navigate
        driver.manage().window().maximize();
        driver.navigate().to("https://jdi-testing.github.io/jdi-light/index.html");

        //3 Assert
        Assert.assertEquals(driver.getTitle(),"Home Page");

        //4 Login
        driver.findElement(By.cssSelector("li.dropdown.uui-profile-menu")).click();
        driver.findElement(By.cssSelector("[id = 'name']")).sendKeys("Roman");
        driver.findElement(By.cssSelector("[id = 'password']")).sendKeys("Jdi1234");
        driver.findElement(By.cssSelector("[id = 'login-button']")).click();

        //5 Get username
        WebElement userName = driver.findElement(By.cssSelector("[id = 'user-name']"));
        Assert.assertEquals(userName.getText(), "ROMAN IOVLEV");


    }
}
