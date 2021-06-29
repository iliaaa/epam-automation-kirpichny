package pages.components;

import static pages.components.DataElementNames.LEFT_MENU_ELEMENTS_PACKS;
import static pages.components.DataElementNames.MENU_CONTACT_FORM;
import static pages.components.DataElementNames.MENU_HOME;
import static pages.components.DataElementNames.MENU_METALS_AND_COLORS;
import static pages.components.DataElementNames.MENU_SERVICE;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LeftSideMenu {

    @FindBy (css = ".sidebar-menu li")
    private List<WebElement> leftMenuItems;

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

    public LeftSideMenu(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickHeaderMenuItem(final String menuItem) {
        for (WebElement navigationItem : leftMenuItems) {
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
