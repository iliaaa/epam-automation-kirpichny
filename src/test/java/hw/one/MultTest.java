package hw.one;

import hw.one.dataproviders.DataProviderMult;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MultTest extends AbstractCalcTest {

    @Test (dataProvider = "data-provider-mult", dataProviderClass = DataProviderMult.class)
    public void mult(int a, int b, int res) {
        Assert.assertEquals(calculator.mult(a, b), res);
    }
}
