package hw.one.dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviderSum {
    @DataProvider(name = "data-provider-sum")
    public static Object[][] dpMethod() {
        return new Object[][] {{4, 2, 6}, {16, 4, 20}, {30, 6, 36}};
    }
}
