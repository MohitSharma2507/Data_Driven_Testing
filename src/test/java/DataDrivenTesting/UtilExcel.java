package DataDrivenTesting;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import java.io.FileInputStream;
import java.io.IOException;

public class UtilExcel {

    public static String SHEET_NAME_PATH = System.getProperty("user.dir")+"/"+"src/test/TestData/TestExcel.xlsx";

    public static Object[][] getTestData(String sheetName,String SHEET_NAME_PATH) throws IOException {

        FileInputStream file = new FileInputStream(SHEET_NAME_PATH);
        XSSFWorkbook book  = new XSSFWorkbook(file);
        XSSFSheet sheet = book.getSheet(sheetName);

        System.out.println("R ->" + sheet.getLastRowNum());
        System.out.println("C ->" + sheet.getRow(0).getLastCellNum());
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        for(int i=0;i< sheet.getLastRowNum();i++){
            for (int j=0;j< sheet.getRow(0).getLastCellNum();j++){
                data[i][j] = sheet.getRow(i+1).getCell(j).toString();
            }
        }
        return data;
    }

    @DataProvider
    public Object[][] getData() throws IOException {
        return getTestData("Sheet1",SHEET_NAME_PATH);
    }

}
