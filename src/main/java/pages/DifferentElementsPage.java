package pages;

import static pages.components.DataElementNames.*;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.components.DataElementNames;
import pages.components.HeaderMenu;
import pages.components.LeftSideMenu;
import pages.components.RightSideBar;

public class DifferentElementsPage {

    private HeaderMenu headerMenu;
    private LeftSideMenu leftSideMenu;
    private RightSideBar rightSideBar;

    public DifferentElementsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        headerMenu = new HeaderMenu(driver);
        leftSideMenu = new LeftSideMenu(driver);
        rightSideBar = new RightSideBar(driver);
    }

    public HeaderMenu getHeaderMenu() {
        return headerMenu;
    }

    public LeftSideMenu getLeftSideMenu() {
        return leftSideMenu;
    }

    public RightSideBar getRightSideBar() {
        return rightSideBar;
    }

    @FindBy (xpath = "//div[@class='checkbox-row']//label[@class='label-checkbox']")
    private List<WebElement> labelCheckbox;

    @FindBy (xpath = "//div[@class='checkbox-row']//label[@class='label-radio']")
    private List<WebElement> labelRadio;

    @FindBy (xpath = "//select[@class='uui-form-element']//option")
    private List<WebElement> colorsDropdownList;

    @FindBy (xpath = "//div[@class='colors']")
    private WebElement colorsDropdown;

    public void openDifferentElementsPage() {
        getHeaderMenu().clickHeaderMenuItem(DataElementNames.MENU_SERVICE);
        getHeaderMenu().clickHeaderMenuItem(MENU_DIFFERENT_ELEMENTS);
    }

    public void clickCheckboxItem(final String checkboxItemName) {
        for (WebElement checkboxItem : labelCheckbox) {
            if (checkboxItemName.equalsIgnoreCase(checkboxItem.getText())) {
                checkboxItem.click();
                break;
            }
        }
    }

    public void clickCheckboxWater() {
        for (WebElement checkboxItem : labelCheckbox) {
            if (WATER_CHECKBOX.equalsIgnoreCase(checkboxItem.getText())) {
                checkboxItem.click();
                break;
            }
        }
        getRightSideBar().checkLogWindowText("Water", "true");
    }

    public void clickCheckboxWind() {
        for (WebElement checkboxItem : labelCheckbox) {
            if (WIND_CHECKBOX.equalsIgnoreCase(checkboxItem.getText())) {
                checkboxItem.click();
                break;
            }
        }
        getRightSideBar().checkLogWindowText("Wind", "true");
    }

    public void clickRadioItem(final String radioItemName) {
        for (WebElement radioItem : labelRadio) {
            if (radioItemName.equalsIgnoreCase(radioItem.getText())) {
                radioItem.click();
                break;
            }
        }
    }

    public void clickRadioSelen() {
        for (WebElement radioItem : labelRadio) {
            if (SELEN_RADIO.equalsIgnoreCase(radioItem.getText())) {
                radioItem.click();
                break;
            }
        }
        getRightSideBar().checkLogWindowText("metal", SELEN_RADIO);
    }

    public void selectColorDropdown(final String color) {
        colorsDropdown.click();
        for (WebElement colorItem : colorsDropdownList) {
            if (color.equalsIgnoreCase(colorItem.getText())) {
                colorItem.click();
            }
        }
    }

    public void selectColorDropdownYellow() {
        colorsDropdown.click();
        for (WebElement colorItem : colorsDropdownList) {
            if (DROPDOWN_YELLOW.equalsIgnoreCase(colorItem.getText())) {
                colorItem.click();
            }
        }
        getRightSideBar().checkLogWindowText("Color", DROPDOWN_YELLOW);
    }



}
