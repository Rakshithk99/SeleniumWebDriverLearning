package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel file -> Workbook -> Worksheet -> Rows -> Cells



public class ReadingDataFromExcel {
public static void main(String[] args) throws IOException {
	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/TestData/data.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("Sheet1");	//workbook.getSheetAt(0);
	
	int totalRows = sheet.getLastRowNum();
	int totalCells = sheet.getRow(1).getLastCellNum();
	
	System.out.println("Total Rows:"+ totalRows);
	System.out.println("Total cells:"+ totalCells);
	
	for(int i=0; i<=totalRows; i++) {
		for(int j=0;j<totalCells; j++) {
			
			System.out.print(sheet.getRow(i).getCell(j).toString()+"\t");
		}
		System.out.println();
	}
	workbook.close();
	file.close();
}
}
