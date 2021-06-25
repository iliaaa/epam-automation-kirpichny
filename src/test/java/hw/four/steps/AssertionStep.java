package hw.four.steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class AssertionStep extends AbstractStep {

    public AssertionStep(WebDriver driver) {
        super(driver);
    }

    @Step("Check all header items")
    public void checkAllHeaderItems() {
        indexPage.getHeaderMenu().checkAllHeaderItems();
    }

    @Step("Check page icons and text")
    public void checkPageIconsAndText() {
        indexPage.checkPageIconsAndText();
    }

    @Step("Check iframe button")
    public void iframeButtonCheck() {
        indexPage.iframeButtonCheck();
    }

    @Step("Check all left menu items")
    public void checkAllLeftMenuItems() {
        indexPage.getLeftSideMenu().checkAllLeftMenuItems();
    }
}
