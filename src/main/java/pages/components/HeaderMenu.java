package pages.components;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HeaderMenu {

    @FindBy (xpath = "//nav[@role='navigation']//ul//li")
    private List<WebElement> navigationHeader;

    @FindBy (css = "div.uui-header.dark-gray a[href='index.html")
    private WebElement headerHomeTab;

    @FindBy (css = "div.uui-header.dark-gray a[href='contacts.html']")
    private WebElement headerContactFormTab;

    @FindBy (css = "div.uui-header.dark-gray a[class = 'dropdown-toggle']")
    private WebElement headerServiceTab;

    @FindBy (css = "div.uui-header.dark-gray a[href='metals-colors.html']")
    private WebElement headerMetalsAndColorsTab;

    public HeaderMenu(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickHeaderMenuItem(final String menuItem) {
        for (WebElement navigationItem : navigationHeader) {
            if (menuItem.equalsIgnoreCase(navigationItem.getText())) {
                navigationItem.click();
                break;
            }
        }
    }

    public void checkAllHeaderItems() {
        Assert.assertTrue(headerHomeTab.isDisplayed());
        Assert.assertTrue(headerContactFormTab.isDisplayed());
        Assert.assertTrue(headerServiceTab.isDisplayed());
        Assert.assertTrue(headerMetalsAndColorsTab.isDisplayed());
    }
}
