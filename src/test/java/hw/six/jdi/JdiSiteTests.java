package hw.six.jdi;

import com.epam.jdi.light.driver.WebDriverUtils;
import com.epam.jdi.light.elements.init.PageFactory;
import jdi.dataprovider.DataProviderJson;
import jdi.entities.MetalsAndColors;
import jdi.entities.User;
import jdi.JdiSite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import jdi.pages.JdiMetalsAndColorsPage;

import static pages.components.DataElementNames.MENU_METALS_AND_COLORS;


public class JdiSiteTests {

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        PageFactory.initSite(JdiSite.class);
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        WebDriverUtils.killAllSeleniumDrivers();
    }

    @Test(dataProvider = "data-provider-metals-and-colors", dataProviderClass = DataProviderJson.class)
    public void jdiMetalsAndColorsTest(MetalsAndColors metalsAndColors) {
        JdiSite.openHomePage();
        JdiSite.login(User.ROMAN);
//        JdiSite.openHeaderMenuItem(MENU_METALS_AND_COLORS);
//        JdiSite.jdiMetalsAndColorsPage.fill(metalsAndColors);
    }
}
