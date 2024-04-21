package seleniumDemo;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		
		
		// Open/Enter the workbook
				XSSFWorkbook wb = new XSSFWorkbook("./Data/ReadData1.xlsx");
								
				//Get Sheet
				XSSFSheet sheet = wb.getSheet("Sheet1");
				
				//Get row
				XSSFRow row = sheet.getRow(2);
							
				//Get column
				XSSFCell cell = row.getCell(1);
				
				//Action- Read/print particular CellValue from excelSheet
				//String Svalue = cell.getStringCellValue();
				//System.out.println(Svalue);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
