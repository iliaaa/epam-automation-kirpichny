package hw.one.dataproviders;

import org.testng.annotations.DataProvider;


public class DataProviderSqrt {
    @DataProvider(name = "data-provider-sqrt")
    public static Object[][] dpMethod() {
        return new Object[][] {{25, 5}, {16, 4}, {100, 10}};
    }
}
