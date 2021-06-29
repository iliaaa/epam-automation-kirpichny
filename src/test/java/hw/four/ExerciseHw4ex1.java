package hw.four;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ExerciseHw4ex1 extends AbstractSettingClass {

    @Test (description = "Login and check elements on IndexPage")
    public void ex1Test() {
        actionStep.openIndexPage();
        assertEquals(driver.getTitle(),
                "Home Page");
        assertionStep.checkAllHeaderItems();
        assertionStep.checkPageIconsAndText();
        assertionStep.iframeButtonCheck();
        assertionStep.checkAllLeftMenuItems();
    }
}
