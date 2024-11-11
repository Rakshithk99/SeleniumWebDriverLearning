package day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataToExcel {
	//Excel file -> Workbook -> Worksheet -> Rows -> Cells
	
public static void main(String[] args) throws IOException {
	FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\writeData.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook();
	XSSFSheet sheet = workbook.createSheet("Data");
	XSSFRow row1 = sheet.createRow(0);
	row1.createCell(0).setCellValue("Welcome");
	row1.createCell(1).setCellValue(1234);
	row1.createCell(2).setCellValue("Automation");
	
	XSSFRow row2 = sheet.createRow(1);
	row2.createCell(0).setCellValue("wqwqw");
	row2.createCell(1).setCellValue(2323);
	row2.createCell(2).setCellValue("dfdfd");
	
	XSSFRow row3 = sheet.createRow(2);
	row3.createCell(0).setCellValue("rerer");
	row3.createCell(1).setCellValue(5456);
	row3.createCell(2).setCellValue("hjjhjh");
	
	workbook.write(file);
	workbook.close();
	file.close();
	System.out.println("File is created");
	
}
}
