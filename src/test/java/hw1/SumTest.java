package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumTest extends AbstractCalcTest {

    @Test (dataProvider = "data-provider",dataProviderClass = DataPr.class)
    public void sum(int a, int b, int res) {
        Assert.assertEquals(calculator.sum(a,b), res);
    }
}
