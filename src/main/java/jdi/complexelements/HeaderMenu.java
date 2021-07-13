package jdi.complexelements;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HeaderMenu {

    @XPath("//nav[@role='navigation']//ul//li")
    private List<UIElement> headerMenu;

    public void clickHeaderMenuItem(final String menuItem) {
        for (WebElement navigationItem : headerMenu) {
            if (menuItem.equalsIgnoreCase(navigationItem.getText())) {
                navigationItem.click();
                break;
            }
        }
    }
}
