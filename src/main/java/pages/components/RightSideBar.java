package pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RightSideBar {

    public RightSideBar(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    private static final String FORMAT_XPATH_VALUE = "//ul[@class='panel-body-list logs']//li[contains(text(),'%s')]";

    @FindBy (xpath = "//section[@class='uui-info-panel-horizontal']"
            + "//div[text()[contains(.,'Log')]]")
    private WebElement logComponent;

    @FindBy (xpath = "//section[@class='uui-info-panel-horizontal']"
            + "//div[text()[contains(.,'Result')]]")
    private WebElement resultComponent;

    @FindBy (xpath = "//ul[@class='panel-body-list logs']"
            + "//li[contains(text(),'%s')]")
    private WebElement logWindowText;

    public void checkLogWindowText(String textInLog, String shouldContains) {
        Assert.assertTrue(logComponent.findElement(By.xpath(String
                .format(FORMAT_XPATH_VALUE, textInLog)))
                .getText()
                .toLowerCase()
                .contains(shouldContains));
    }

}
