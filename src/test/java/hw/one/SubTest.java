package hw.one;

import hw.one.dataproviders.DataProviderSub;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubTest extends AbstractCalcTest {

    @Test (dataProvider = "data-provider-sub", dataProviderClass = DataProviderSub.class)
    public void sub(int a, int b, int res) {
        Assert.assertEquals(calculator.sub(a, b), res);
    }
}
