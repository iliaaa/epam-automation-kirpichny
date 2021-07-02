package hw.five.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static org.testng.Assert.assertEquals;

public class ThenStepDef extends AbstractBaseStepDef {

    @Then("{string} page should be opened")
    public void pageShouldBeOpened(String pageName) {
        assertEquals(driver.getTitle(),
                pageName);
    }
}
