package DataDrivenTesting;

import org.testng.annotations.DataProvider;

public class DataWihoutExcel {

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                new Object[]{"admin", "password"},
                new Object[]{"admin", "password123"}
        };
    }
}
