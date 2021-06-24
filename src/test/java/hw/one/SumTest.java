package hw.one;

import hw.one.dataproviders.DataProviderSum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumTest extends AbstractCalcTest {

    @Test (dataProvider = "data-provider-sum", dataProviderClass = DataProviderSum.class)
    public void sum(int a, int b, int res) {
        Assert.assertEquals(calculator.sum(a, b), res);
    }
}
