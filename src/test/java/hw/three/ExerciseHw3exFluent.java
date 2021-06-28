package hw.three;

import org.testng.annotations.Test;
import pages.IndexPage;

public class ExerciseHw3exFluent extends AbstractSettingClass {

    @Test
    public void exFluentTest() {
        new IndexPage(driver).openIndexPageFluent()
                .loginFluent(property.getProperty("login"), property.getProperty("password"))
                .checkPageIconsAndTextFluent()
                .iframeButtonCheckFluent();
    }
}
