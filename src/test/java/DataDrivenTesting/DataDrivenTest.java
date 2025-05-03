package DataDrivenTesting;

import org.testng.annotations.Test;

public class DataDrivenTest
{
//     Read Data from Excel
//    @Test(dataProvider = "getData",dataProviderClass = UtilExcel.class)
//    public void loginTesting1(String username, String password){
//        System.out.println("Login test with credential "+ username +" "+ password);
//    }
//    Read data from object
    @Test(dataProvider = "getData",dataProviderClass = DataWihoutExcel.class)
    public void loginTesting2(String username, String password){

        System.out.println("Login test with credential "+ username +" "+ password);
    }
}