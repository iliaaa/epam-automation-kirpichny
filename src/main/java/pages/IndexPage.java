package pages;

import static org.testng.Assert.assertEquals;
import static pages.components.DataElementNames.BASE_ICON_TEXT;
import static pages.components.DataElementNames.CUSTOM_ICON_TEXT;
import static pages.components.DataElementNames.MULTI_ICON_TEXT;
import static pages.components.DataElementNames.PRACTICE_ICON_TEXT;

import driverutils.PropertiesSingleton;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.components.HeaderMenu;
import pages.components.LeftSideMenu;

public class IndexPage {

    private HeaderMenu headerMenu;
    private LeftSideMenu leftSideMenu;
    private WebDriver driver;
    private PropertiesSingleton propertiesSingleton = PropertiesSingleton.getInstance();

    //Login section
    @FindBy(css = "li.dropdown.uui-profile-menu")
    private WebElement userIcon;

    @FindBy(css = "[id = 'name']")
    private WebElement userName;

    @FindBy(css = "[id = 'password']")
    private WebElement userPassword;

    @FindBy(css = "[id = 'login-button']")
    private WebElement loginButton;

    @FindBy(css = "div.logout")
    private WebElement logoutButton;

    @FindBy (id = "user-name")
    private WebElement fullUserName;

    //Icon section
    @FindBy (css = ".icons-benefit.icon-practise")
    private WebElement iconPractice;

    @FindBy (css = ".icons-benefit.icon-custom")
    private WebElement iconCustom;

    @FindBy (css = ".icons-benefit.icon-multi")
    private WebElement iconMulti;

    @FindBy (css = ".icons-benefit.icon-base")
    private WebElement iconBase;

    @FindBy (css = ".benefit-txt")
    private List<WebElement> textsUnderIcons;

    //iFrame
    @FindBy (id = "frame")
    private WebElement iframe;

    @FindBy (css = "#frame-button")
    private WebElement iframeButton;

    private Properties property;

    public IndexPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        headerMenu = new HeaderMenu(driver);
        leftSideMenu = new LeftSideMenu(driver);
    }

    public HeaderMenu getHeaderMenu() {
        return headerMenu;
    }

    public LeftSideMenu getLeftSideMenu() {
        return leftSideMenu;
    }

    public void openIndexPage() {
        driver.navigate().to(propertiesSingleton.url);
    }

    public IndexPage openIndexPageFluent() {
        driver.navigate().to(propertiesSingleton.url);
        return this;
    }

    public void login(String name, String password) {
        userIcon.click();
        userName.sendKeys(name);
        userPassword.sendKeys(password);
        loginButton.click();
        Assert.assertTrue(logoutButton.isDisplayed(), "Logout button isn't displayed");
    }

    public IndexPage loginFluent(String name, String password) {
        userIcon.click();
        userName.sendKeys(name);
        userPassword.sendKeys(password);
        loginButton.click();
        Assert.assertTrue(logoutButton.isDisplayed(), "Logout button isn't displayed");
        return this;
    }

    public void checkPageIconsAndText() {
        //Icons check
        Assert.assertTrue(iconPractice.isDisplayed());
        Assert.assertTrue(iconCustom.isDisplayed());
        Assert.assertTrue(iconMulti.isDisplayed());
        Assert.assertTrue(iconBase.isDisplayed());

        //Text check
        assertEquals(textsUnderIcons.get(0).getText(), PRACTICE_ICON_TEXT);
        assertEquals(textsUnderIcons.get(1).getText(), CUSTOM_ICON_TEXT);
        assertEquals(textsUnderIcons.get(2).getText(), MULTI_ICON_TEXT);
        assertEquals(textsUnderIcons.get(3).getText(), BASE_ICON_TEXT);
    }

    public IndexPage checkPageIconsAndTextFluent() {
        //Icons check
        Assert.assertTrue(iconPractice.isDisplayed());
        Assert.assertTrue(iconCustom.isDisplayed());
        Assert.assertTrue(iconMulti.isDisplayed());
        Assert.assertTrue(iconBase.isDisplayed());

        //Text check
        assertEquals(textsUnderIcons.get(0).getText(), "To include good practices\n"
                + "and ideas from successful\n"
                + "EPAM project");
        assertEquals(textsUnderIcons.get(1).getText(), "To be flexible and\n"
                + "customizable");
        assertEquals(textsUnderIcons.get(2).getText(), "To be multiplatform");
        assertEquals(textsUnderIcons.get(3).getText(), "Already have good base\n"
                + "(about 20 internal and\n"
                + "some external projects),\n"
                + "wish to get more…");
        return this;
    }

    public void iframeButtonCheck() {
        driver.switchTo().frame(iframe);
        Assert.assertTrue(iframeButton.isDisplayed(), "Frame Button isn't displayed");
        driver.switchTo().defaultContent();
    }

    public IndexPage iframeButtonCheckFluent() {
        driver.switchTo().frame(iframe);
        Assert.assertTrue(iframeButton.isDisplayed(), "Frame Button isn't displayed");
        driver.switchTo().defaultContent();
        return this;
    }

}
