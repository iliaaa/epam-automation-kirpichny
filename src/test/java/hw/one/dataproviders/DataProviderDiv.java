package hw.one.dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviderDiv {
    @DataProvider(name = "data-provider-div")
    public static Object[][] dpMethod() {
        return new Object[][] {{4, 2, 2}, {16, 4, 4}, {30, 6, 5}};
    }
}
