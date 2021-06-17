package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
import hw1.DataPr;

public class SqrtTest extends AbstractCalcTest {

    @Test (dataProvider = "data-provider",dataProviderClass = DataPr.class)
    public void sqrt(int a, int res) {
        Assert.assertEquals(calculator.sqrt(a), res);
    }
}
