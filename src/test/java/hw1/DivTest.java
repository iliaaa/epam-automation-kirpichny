package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivTest extends AbstractCalcTest{

    @Test (dataProvider = "data-provider",dataProviderClass = DataPr.class)
    public void div(int a, int b, int res) {
        Assert.assertEquals(calculator.div(a,b), res);
    }
}
