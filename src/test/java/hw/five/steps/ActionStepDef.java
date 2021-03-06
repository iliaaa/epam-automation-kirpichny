package hw.five.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ActionStepDef extends AbstractBaseStepDef {

    @When("I click on {string} button in Header")
    public void clickOnButtonInHeader(String menuItem) {
        indexPage.getHeaderMenu().clickHeaderMenuItem(menuItem);
    }

    @And("I select checkbox {string} and check log row")
    public void selectCheckboxAndCheckLogRow(String checkboxItem) {
        differentElementsPage.clickCheckboxItem(checkboxItem);
    }

    @And("I select radio {string} and check log row")
    public void selectRadioAndCheckLogRow(String radioItem) {
        differentElementsPage.clickRadioItem(radioItem);
    }

    @And("I select in dropdown {string} and check log row")
    public void selectInDropdownAndCheckLogRow(String color) {
        differentElementsPage.selectColorDropdown(color);
    }

    @And("I click on {string} button in Service dropdown")
    public void clickOnButtonInServiceDropdown(String menuItem) {
        indexPage.getHeaderMenu().clickHeaderMenuItem(menuItem);
    }

    @When("I select 'vip' checkbox for {string}")
    public void selectVipCheckboxFor(String user) {
        userTable.activateCheckboxForUser(user);
    }
}
