package hw.one.dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviderSub {
    @DataProvider(name = "data-provider-sub")
    public static Object[][] dpMethod() {
        return new Object[][] {{4, 2, 2}, {16, 4, 12}, {30, 6, 24}};
    }
}
