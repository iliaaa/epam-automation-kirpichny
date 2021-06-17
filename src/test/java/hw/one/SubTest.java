package hw.one;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubTest extends AbstractCalcTest {

    @Test (dataProvider = "data-provider", dataProviderClass = DataPr.class)
    public void sub(int a, int b, int res) {
        Assert.assertEquals(calculator.sub(a,b), res);
    }
}
