package hw.one;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SqrtTest extends AbstractCalcTest {

    @Test (dataProvider = "data-provider", dataProviderClass = DataPr.class)
    public void sqrt(int a, int res) {
        Assert.assertEquals(calculator.sqrt(a), res);
    }
}
