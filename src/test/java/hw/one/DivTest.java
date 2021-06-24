package hw.one;

import hw.one.dataproviders.DataProviderDiv;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivTest extends AbstractCalcTest {

    @Test (dataProvider = "data-provider-div", dataProviderClass = DataProviderDiv.class)
    public void div(int a, int b, int res) {
        Assert.assertEquals(calculator.div(a, b), res);
    }
}
