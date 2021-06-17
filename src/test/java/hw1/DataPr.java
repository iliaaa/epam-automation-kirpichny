package hw1;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataPr {
    @DataProvider (name = "data-provider")
    public Object[][] dpMethod(Method m){
        switch (m.getName()) {
            case "mult":
                return new Object[][] {{5, 6, 30}};
            case "div":
                return new Object[][] {{30, 5, 6}};
            case "sqrt":
                return new Object[][] {{25, 5}};
            case "sum":
                return new Object[][] {{5, 5, 10}};
            case "sub":
                return new Object[][] {{5, 5, 0}};
        }
        return null;
    }
}
