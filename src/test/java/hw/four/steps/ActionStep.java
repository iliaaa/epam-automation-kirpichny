package hw.four.steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ActionStep extends AbstractStep {

    public ActionStep(WebDriver driver) {
        super(driver);
    }

    @Step("Login with '{0}'")
    public void login(String name, String password) {
        indexPage.login(name, password);
    }

    @Step("Open Different Element page")
    public void openDifferentElementsPage() {
        differentElementsPage.openDifferentElementsPage();
    }

    @Step("Activate Water checkbox")
    public void clickCheckboxWater() {
        differentElementsPage.clickCheckboxWater();
    }

    @Step("Activate Wind checkbox")
    public void clickCheckboxWind() {
        differentElementsPage.clickCheckboxWind();
    }

    @Step("Activate Selen radiobutton")
    public void clickRadioSelen() {
        differentElementsPage.clickRadioSelen();
    }

    @Step("Select Yellow color from dropdown")
    public void selectColorDropdownYellow() {
        differentElementsPage.selectColorDropdownYellow();
    }
}
