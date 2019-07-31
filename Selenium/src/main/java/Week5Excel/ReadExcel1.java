package Week5Excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel1 


{

	
	public static String[][] getData(String name) throws IOException {
	
	    XSSFWorkbook wBook=new XSSFWorkbook("./target"+name+".xlsx");
		XSSFSheet sheet=wBook.getSheetAt(0);
		int rowCount=sheet.getLastRowNum();
		System.out.println(rowCount);

		short columnCount=sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);

		String[][] data=new String[rowCount][columnCount];
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j <columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i-1][j]=row.getCell(j).getStringCellValue();
				System.out.println(cell);
			} 
		}
		return data;



	}

}
