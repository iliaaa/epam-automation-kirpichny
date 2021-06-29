package hw.four;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ExerciseHw4ex2 extends AbstractSettingClass {

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
