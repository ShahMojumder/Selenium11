package javaDemo;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;


public class ReadExcellSheetallValues {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook ("./Data/ReadData1.xlsx");
		XSSFSheet sheet = wb.getSheet("sheet1");
		
		int rowCount = sheet.getLastRowNum();
		System.out.println("rowCount");
		
		short columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		
		//short columCount = sheet.getRow(0).getLastCellNum();
		//System.out.println("columCount");
		
		//For row- loop
		for (int i = 1; i <= rowCount ; i++) {
			//Get row
			XSSFRow row = sheet.getRow(i);
			//For cell/column - loop
			for (int j = 0; j < columnCount ; j++) {
				//Get cell
				XSSFCell cell = row.getCell(j);
				//Action - Read/print particular cellValue
				String CellValue = cell.getStringCellValue();
				System.out.println(CellValue);
			}
		}

		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
