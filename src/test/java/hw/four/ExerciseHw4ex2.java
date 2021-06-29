package hw.four;

import static org.testng.Assert.assertEquals;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class ExerciseHw4ex2 extends AbstractSettingClass {

    @Feature(value = "Homework 4")
    @Story(value = "Exercise 2")
    @Test (description = "Login and actions on DifferentElementPage")
    public void ex2Test() {
        actionStep.openIndexPage();
        assertEquals(driver.getTitle(),
                "Home Page");
        actionStep.login(singletonForProperties.login, singletonForProperties.password);
        actionStep.openDifferentElementsPage();
        actionStep.clickCheckboxWater();
        actionStep.clickCheckboxWind();
        actionStep.clickRadioSelen();
        actionStep.selectColorDropdownYellow();
    }
}
