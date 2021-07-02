package pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.components.*;

import java.util.ArrayList;
import java.util.List;

public class UserTable {

    private List<UserInfo> userInfos = new ArrayList<>();
    private HeaderMenu headerMenu;
    private LeftSideMenu leftSideMenu;
    private RightSideBar rightSideBar;

    @FindBy(css = "table#user-table select")
    private List<WebElement> tableDropdowns;

    @FindBy(css = "table#user-table a")
    private List<WebElement> tableUsernames;

    @FindBy(css = "table#user-table span")
    private List<WebElement> tableDescriptions;

    @FindBy(css = "table#user-table input")
    private List<WebElement> tableCheckbox;

    @FindBy(css = "table#user-table")
    private WebElement userTable;

    @FindBy(css = "table#user-table tr")
    private List<WebElement> rowElements;

    @FindBy(css = "table#user-table tr td")
    private List<WebElement> cellElements;

    @FindBy(css = "div.user-descr span")
    private List<WebElement> cellUserDescrElements;

    @FindBy(css = "table#user-table th")
    private List<WebElement> cellNameElements;

    @FindBy(css = "table#user-table th")
    private List<WebElement> tableHead;

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

    public void verifyUserInfoTable(DataTable dataTable) {
        List<List<String>> dataTableRows = dataTable.asLists(); //outer List<> is rows, inner List<> is cells
        for (List<String> row : dataTableRows) { //loop through every row in the DataTable input
            int rowIdx = dataTableRows.indexOf(row);

            for (String expectedCell : row) { //loop through every cell in the current DataTable row
                int cellIdx = row.indexOf(expectedCell);
                String actualCell = "";
                if (rowIdx == 0 && cellIdx == 0) {
                    actualCell = cellNameElements.get(cellIdx).getText();
                } else if (rowIdx == 0 && cellIdx == 1) {
                    actualCell = cellNameElements.get(cellIdx + 1).getText();
                } else if (rowIdx == 0 && cellIdx == 2) {
                    actualCell = cellNameElements.get(cellIdx + 1).getText();
                } else if (rowIdx >= 1 && cellIdx == 0) {
                    System.out.println(cellIdx);
                    actualCell = cellElements.get(cellIdx).getText();
                } else if (rowIdx >= 1 && cellIdx == 1) {
                    actualCell = cellElements.get(cellIdx + 1).getText();
                } else if (rowIdx >= 1 && cellIdx == 2) {
                    actualCell = cellUserDescrElements.get(rowIdx - 1).getText();
                }

                /*
                System.out.println for demonstration purposes
                 */
                System.out.println("DataTable row " + rowIdx + ", cell " + cellIdx + ": " + expectedCell);
                System.out.println("Actual value on the page: " + actualCell);

                Assert.assertEquals(actualCell, expectedCell);
            }
        }
    }

//    public void checkSixDropdowns(int numberOfDropdowns) {
//        Assert.assertTrue(tableDropdowns.size() == numberOfDropdowns);
//    }
//
//
//    public void checkSixUsername(int numberOfUsernames) {
//        Assert.assertTrue(tableUsernames.size() == numberOfUsernames);
//    }
//
//    public void checkSixDescriptions(int numberOfDescriptions) {
//        Assert.assertTrue(tableDescriptions.size() == numberOfDescriptions);
//    }

}
