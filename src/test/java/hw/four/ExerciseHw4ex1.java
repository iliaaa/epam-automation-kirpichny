package hw.four;

import static org.testng.Assert.assertEquals;

import hw.four.listeners.AllureListener;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureListener.class})
public class ExerciseHw4ex1 extends AbstractSettingClass {

    @Feature(value = "Homework 4")
    @Story(value = "Exercise 1")
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
