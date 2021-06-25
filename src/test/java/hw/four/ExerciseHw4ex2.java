package hw.four;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import pages.DifferentElementsPage;
import pages.IndexPage;


public class ExerciseHw4ex2 extends AbstractSettingClass {

    @Test (description = "Login and actions on DifferentElementPage")
    public void ex2Test() {
        actionStep.openIndexPage();
        assertEquals(driver.getTitle(),
                "Home Page");
        actionStep.login(property.getProperty("login"),
                property.getProperty("password"));
        actionStep.openDifferentElementsPage();
        actionStep.clickCheckboxWater();
        actionStep.clickCheckboxWind();
        actionStep.clickRadioSelen();
        actionStep.selectColorDropdownYellow();
    }
}
