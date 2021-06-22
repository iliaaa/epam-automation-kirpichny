package hw.three;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import pages.DifferentElementsPage;
import pages.IndexPage;


public class ExercisesHw3 extends AbstractSettingClass {

    IndexPage indexPage;
    DifferentElementsPage differentElementsPage;

    @Test
    public void ex1Test() {
        indexPage = new IndexPage(driver);
        assertEquals(driver.getTitle(),
                "Home Page");

        indexPage.getHeaderMenu().checkAllHeaderItems();
        indexPage.checkPageIconsAndText();
        indexPage.iframeButtonCheck();
        indexPage.getLeftSideMenu().checkAllLeftMenuItems();
    }

    @Test
    public void ex2Test() {
        indexPage = new IndexPage(driver);
        assertEquals(driver.getTitle(),
                "Home Page");
        indexPage.login(property.getProperty("login"),
                property.getProperty("password"));

        differentElementsPage = new DifferentElementsPage(driver);
        differentElementsPage.openDifferentElementsPage();
        differentElementsPage.clickCheckboxWater();
        differentElementsPage.clickCheckboxWind();
        differentElementsPage.clickRadioSelen();
        differentElementsPage.selectColorDropdownYellow();
    }

}
