package hw.five.steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class AndStepDef extends AbstractBaseStepDef {

    @And("I login as user Roman Iovlev and I see button Logout")
    public void loginAsUserRomanIovlevAndISeeButton() {
        indexPage.login(propertiesSingleton.login, propertiesSingleton.password);
    }

    @And("Title on page should be {string}")
    public void titleOnPageShouldBeHomePage(String pageName) {
        assertEquals(driver.getTitle(),
                pageName);
    }

    @And("{int} {string} should be displayed on Users Table on User Table Page")
    public void shouldBeDisplayedOnUsersTableOnUserTablePage(int numberOfItems, String itemsForCheck) {
        userTable.checkTableItems(numberOfItems, itemsForCheck);
    }

    @And("User table should contain following values:")
    public void userTableShouldContainFollowingValues(DataTable dataTable) {
        userTable.verifyUserInfoTable(dataTable);
    }

    @And("droplist should contain values in column Type for user Roman")
    public void droplistShouldContainValuesInColumnTypeForUserRoman(DataTable data) {
        userTable.checkDropdownForRoman(data);
    }
}
