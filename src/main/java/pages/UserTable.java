package pages;

import driverutils.WebDriverSingleton;
import io.cucumber.datatable.DataTable;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.components.HeaderMenu;
import pages.components.LeftSideMenu;
import pages.components.RightSideBar;

public class UserTable {

    private static final String USER_CHECKBOX = "//td[a[text() = '%s']]/following-sibling::td//label";
    private static final String USER_DROPDOWN = "//td[a[text() = '%s']]/preceding-sibling::td//select";

    private HeaderMenu headerMenu;
    private LeftSideMenu leftSideMenu;
    private RightSideBar rightSideBar;

    @FindBy(css = "table#user-table select")
    private List<WebElement> tableDropdowns;

    @FindBy(css = "table#user-table a")
    private List<WebElement> tableUsernames;

    @FindBy(css = "table#user-table input")
    private List<WebElement> tableCheckbox;

    @FindBy(xpath = "//td[1]")
    private List<WebElement> tableNumbers;

    @FindBy(css = "td a")
    private List<WebElement> tableNames;

    @FindBy(css = "td span")
    private List<WebElement> tableDescriptions;

    @FindBy(css = "tr > td > select")
    private List<WebElement> tableDropdown;

    @FindBy(id = "ivan")
    private WebElement checkboxForIvan;

    public UserTable(WebDriver driver) {
        PageFactory.initElements(driver, this);
        headerMenu = new HeaderMenu(driver);
        leftSideMenu = new LeftSideMenu(driver);
        rightSideBar = new RightSideBar(driver);
    }

    public void checkTableItems(int numberOfItems, String itemsForCheck) {
        if (itemsForCheck.toLowerCase().contains("dropdowns")) {
            Assert.assertEquals(numberOfItems, tableDropdowns.size());
        } else if (itemsForCheck.toLowerCase().contains("usernames")) {
            Assert.assertEquals(numberOfItems, tableUsernames.size());
        } else if (itemsForCheck.toLowerCase().contains("description")) {
            Assert.assertEquals(numberOfItems, tableDescriptions.size());
        } else if (itemsForCheck.toLowerCase().contains("checkboxes")) {
            Assert.assertEquals(numberOfItems, tableCheckbox.size());
        }
    }

    public void verifyUserInfoTable(DataTable data) {
        List<Map<String, String>> table = data.asMaps(String.class, String.class);
        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < table.size(); i++) {
            softAssert.assertEquals(tableNumbers.get(i).getText(), table.get(i).get("Number").trim());
            softAssert.assertEquals(tableNames.get(i).getText(), table.get(i).get("User").trim());
            softAssert.assertEquals(tableDescriptions.get(i).getText().replaceAll("\\s", " "),
                    table.get(i).get("Description").trim());
        }
        softAssert.assertAll();
    }

    public void checkDropdownForUser(String userName, DataTable data) {
        List<Map<String, String>> table = data.asMaps(String.class, String.class);
        WebElement dropdownUser = WebDriverSingleton
                .getDriver()
                .findElement(By.xpath(String.format(USER_DROPDOWN, userName)));
        System.out.println(dropdownUser.getText());
        for (int i = 0; i < table.size(); i++) {
            Assert.assertEquals(new Select(dropdownUser).getOptions().get(i).getText(),
                    table.get(i).get("Dropdown Values").trim());
        }
    }

    public void activateCheckboxForUser(String userName) {
        WebDriverSingleton.getDriver().findElement(By.xpath(String.format(USER_CHECKBOX, userName))).click();
    }

    public void checkLogFirstRow(int numberOfRow, String textInLog, String shouldContains) {
        rightSideBar.checkLogWindowFirstText(numberOfRow, textInLog, shouldContains);
    }

}
