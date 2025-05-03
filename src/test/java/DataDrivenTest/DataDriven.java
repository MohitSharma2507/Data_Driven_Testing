package DataDrivenTest;

import org.testng.annotations.Test;

public class DataDriven {

//    @Test(dataProvider = "getData",dataProviderClass = UtilExcel.class)
//    public void testLogin1(String username ,String password){
//        System.out.println("username - "+username+"Password - "+password);
//    }
    @Test(dataProvider = "getData",dataProviderClass = dataDrivenWithoutExcel.class)
    public void testLogin2(String username ,String password){
        System.out.println("username - "+username+"Password - "+password);
    }
}
