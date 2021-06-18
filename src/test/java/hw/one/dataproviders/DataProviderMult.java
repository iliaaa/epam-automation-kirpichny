package hw.one.dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviderMult {
    @DataProvider (name = "data-provider-mult")
    public static Object[][] dpMethod() {
        return new Object[][] {{2, 2, 4}, {4, 4, 16}, {5, 6, 30}};
    }
}
