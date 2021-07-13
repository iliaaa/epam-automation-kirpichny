package jdi;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import jdi.entities.User;
import jdi.pages.JdiHomePage;
import jdi.pages.JdiMetalsAndColorsPage;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class JdiSite {

    @Url("index.html")
    public static JdiHomePage jdiHomePage;

    @Url("metals-colors.html")
    public static JdiMetalsAndColorsPage jdiMetalsAndColorsPage;

    public static void openHomePage() {
        jdiHomePage.open();
        jdiHomePage.checkOpened();
    }

    public static void login(User user) {
        jdiHomePage.login(user);
    }

    public static void openHeaderMenuItem(String headerMenuItem) {
        jdiHomePage.headerMenu.clickHeaderMenuItem(headerMenuItem.toLowerCase());
    }

}
