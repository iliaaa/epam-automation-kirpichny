package dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviderPracticeTextCheck {
    @DataProvider(name = "data-provider-practice-text-cehck")
    public static Object[][] dpMethod() {
        return new Object[][] {{"To include good practices and ideas from successful EPAM project"}};
    }
}