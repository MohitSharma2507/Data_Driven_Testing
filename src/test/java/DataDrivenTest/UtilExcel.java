package DataDrivenTest;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UtilExcel {

  public static String File_Path = "C:\\Users\\dell\\IdeaProjects\\Data_Driven\\src\\test\\TestData\\TestExcel.xlsx";

    Object[][]getTestData(String sheetName,String File_Path) throws IOException {

        FileInputStream file = new FileInputStream(File_Path);
        XSSFWorkbook book = new XSSFWorkbook(file);
        XSSFSheet sheet = book.getSheet(sheetName);

        Object[][] data =new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for(int i=0;i< sheet.getLastRowNum();i++){
            for(int j=0;j<sheet.getRow(0).getLastCellNum();j++){
                data[i][j] = sheet.getRow(i+0).getCell(j).toString();
            }
        }
        return data;
    }
@DataProvider
  public  Object [][]getData() throws IOException {
        return getTestData("sheet1",File_Path);
    }
}
