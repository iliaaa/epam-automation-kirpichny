package hw.five.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import pages.components.UserInfo;

import static org.testng.Assert.assertEquals;

public class AndStepDef extends AbstractBaseStepDef {

    @And("I login as user Roman Iovlev and I see button Logout")
    public void iLoginAsUserRomanIovlevAndISeeButton() {
        indexPage.login(propertiesSingleton.login, propertiesSingleton.password);
    }

    @And("Title on page should be {string}")
    public void titleOnPageShouldBeHomePage(String pageName) {
        assertEquals(driver.getTitle(),
                pageName);
    }

//    @And("{int} Number Type Dropdowns should be displayed on Users Table on User Table Page")
//    public void numberTypeDropdownsShouldBeDisplayedOnUsersTableOnUserTablePage(int numberOfDropdowns) {
//        userTable.checkSixDropdowns(numberOfDropdowns);
//    }
//
//    @And("{int} Usernames should be displayed on Users Table on User Table Page")
//    public void usernamesShouldBeDisplayedOnUsersTableOnUserTablePage(int numberOfUsernames) {
//        userTable.checkSixUsername(numberOfUsernames);
//    }
//
//    @And("{int} Description texts under images should be displayed on Users Table on User Table Page")
//    public void descriptionTextsUnderImagesShouldBeDisplayedOnUsersTableOnUserTablePage(int numberOfDescriptions) {
//        userTable.checkSixDescriptions(numberOfDescriptions);
//    }

    @And("{int} {string} should be displayed on Users Table on User Table Page")
    public void shouldBeDisplayedOnUsersTableOnUserTablePage(int numberOfItems, String itemsForCheck) {
        userTable.checkTableItems(numberOfItems, itemsForCheck);
    }

    @And("User table should contain following values:")
    public void userTableShouldContainFollowingValues(DataTable dataTable) {
        userTable.verifyUserInfoTable(dataTable);
    }
}
