package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MultTest extends AbstractCalcTest {

    @Test (dataProvider = "data-provider",dataProviderClass = DataPr.class)
    public void mult(int a, int b, int res) {
        Assert.assertEquals(calculator.mult(a, b), res);
    }
}
