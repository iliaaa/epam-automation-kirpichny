package hw.one;

import hw.one.dataproviders.DataProviderSqrt;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SqrtTest extends AbstractCalcTest {

    @Test (dataProvider = "data-provider-sqrt", dataProviderClass = DataProviderSqrt.class)
    public void sqrt(int a, int res) {
        Assert.assertEquals(calculator.sqrt(a), res);
    }
}
