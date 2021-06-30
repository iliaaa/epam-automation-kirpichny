package hw.three;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import pages.DifferentElementsPage;
import pages.IndexPage;

public class ExerciseHw3ex2 extends AbstractSettingClass {

    IndexPage indexPage;
    DifferentElementsPage differentElementsPage;

    @Test
    public void ex2Test() {
        indexPage = new IndexPage(driver);
        indexPage.openIndexPage();
        assertEquals(driver.getTitle(),
                "Home Page");
        indexPage.login(singletonForProperties.login, singletonForProperties.password);

        differentElementsPage = new DifferentElementsPage(driver);
        differentElementsPage.openDifferentElementsPage();
        differentElementsPage.clickCheckboxWater();
        differentElementsPage.clickCheckboxWind();
        differentElementsPage.clickRadioSelen();
        differentElementsPage.selectColorDropdownYellow();
    }
}
