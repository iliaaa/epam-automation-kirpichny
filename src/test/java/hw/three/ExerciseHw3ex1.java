package hw.three;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import pages.IndexPage;


public class ExerciseHw3ex1 extends AbstractSettingClass {

    IndexPage indexPage;

    @Test
    public void ex1Test() {
        indexPage = new IndexPage(driver);
        indexPage.openIndexPage();
        assertEquals(driver.getTitle(),
                "Home Page");
        indexPage.getHeaderMenu().checkAllHeaderItems();
        indexPage.checkPageIconsAndText();
        indexPage.iframeButtonCheck();
        indexPage.getLeftSideMenu().checkAllLeftMenuItems();
    }
}
