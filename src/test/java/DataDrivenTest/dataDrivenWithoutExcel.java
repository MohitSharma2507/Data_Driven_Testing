package DataDrivenTest;

import org.testng.annotations.DataProvider;

public class dataDrivenWithoutExcel {

    @DataProvider
    public Object[][] getData(){
            return new Object[][]{
                  new Object[]{ "admin1" ,"password"},
                  new Object[]{ "admin2", "password123"}
        };
    }
}
