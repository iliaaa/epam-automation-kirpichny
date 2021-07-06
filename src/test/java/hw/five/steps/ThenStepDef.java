package hw.five.steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Then;

public class ThenStepDef extends AbstractBaseStepDef {

    @Then("{string} page should be opened")
    public void pageShouldBeOpened(String pageName) {
        assertEquals(driver.getTitle(),
                pageName);
    }

    @Then("{int} log row has {string} condition changed to {string} text in log section")
    public void logRowHasConditionChangedToTextInLogSection(int numberOfRow, String textInLog, String shouldContains) {
        userTable.checkLogFirstRow(numberOfRow, textInLog, shouldContains);
    }
}
