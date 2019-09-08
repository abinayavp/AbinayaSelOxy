package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static  Object[][] readData(String fn) throws IOException 
	{
		XSSFWorkbook wbook = new XSSFWorkbook("./Data/"+fn+".xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int RowNum = sheet.getLastRowNum();
		int CellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(RowNum);
		System.out.println(CellNum);
		String[][] data = new String[RowNum][CellNum];
		for(int i=1;i<=RowNum;i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<CellNum;j++)
			{
				XSSFCell cell = row.getCell(j);
				data[i-1][j]=cell.getStringCellValue();					
			}
		}
		wbook.close();
		return data;
	}

}
