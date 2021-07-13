package jdi.dataprovider;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import jdi.entities.MetalsAndColors;
import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class DataProviderJson {

    @DataProvider(name = "data-provider-metals-and-colors")
    public static Object[][] dpMethod() throws FileNotFoundException {
        Reader reader = new FileReader("src/main/java/jdi/entities/JDI_ex8_metalsColorsDataSet.json");
        Type type = new TypeToken<Map<String, MetalsAndColors>>() {}.getType();
        Map<String, MetalsAndColors> testData = new Gson().fromJson(reader, type);
        Object[][] returnValue = new Object[testData.size()][1];
        int index = 0;
        for (Object[] each : returnValue) {
            each[0] = testData.get(index++);
        }
        return returnValue;
    }
}
