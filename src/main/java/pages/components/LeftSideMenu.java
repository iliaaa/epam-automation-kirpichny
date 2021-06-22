package pages.components;

import static pages.components.DataElementNames.*;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class LeftSideMenu {

    public LeftSideMenu(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = ".sidebar-menu li")
    private List<WebElement> leftMenueItems;

    @FindBy (css = "ul.sidebar-menu.left > li:nth-of-type(1)")
    private WebElement leftMenuHomeTab;

    @FindBy (css = "ul.sidebar-menu.left > li:nth-of-type(2)")
    private WebElement leftMenuContactFormTab;

    @FindBy (css = "ul.sidebar-menu.left > li:nth-of-type(3)")
    private WebElement leftMenuServiceTab;

    @FindBy (css = "ul.sidebar-menu.left > li:nth-of-type(4)")
    private WebElement leftMenuMetalsAndColorsTab;

    @FindBy (css = "ul.sidebar-menu.left > li:nth-of-type(5)")
    private WebElement leftMenuElementPacks;


    public void clickHeaderMenuItem(final String menuItem) {
        for (WebElement navigationItem : leftMenueItems) {
            if (menuItem.equals(navigationItem.getText())) {
                navigationItem.click();
                break;
            }
        }
    }

    public void checkAllLeftMenuItems() {
        Assert.assertEquals(leftMenuHomeTab.getText().toLowerCase(), MENU_HOME);
        Assert.assertEquals(leftMenuContactFormTab.getText().toLowerCase(), MENU_CONTACT_FORM);
        Assert.assertEquals(leftMenuServiceTab.getText().toLowerCase(), MENU_SERVICE);
        Assert.assertEquals(leftMenuMetalsAndColorsTab.getText().toLowerCase(), MENU_METALS_AND_COLORS);
        Assert.assertEquals(leftMenuElementPacks.getText().toLowerCase(), LEFT_MENU_ELEMENTS_PACKS);
    }

}
