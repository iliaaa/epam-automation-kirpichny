package hw.four.steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.DifferentElementsPage;
import pages.IndexPage;

public abstract class AbstractStep {

    IndexPage indexPage;
    DifferentElementsPage differentElementsPage;

    protected AbstractStep(WebDriver driver) {
        indexPage = new IndexPage(driver);
        differentElementsPage = new DifferentElementsPage(driver);
    }

    @Step("Open Index page")
    public void openIndexPage() {
        indexPage.openIndexPage();
    }
}
