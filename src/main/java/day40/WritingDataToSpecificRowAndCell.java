package day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataToSpecificRowAndCell {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\myfile_random.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data");
		
		XSSFRow row = sheet.createRow(3);
		XSSFCell cell = row.createCell(4);
		
		cell.setCellValue("Hi");
		workbook.write(file);
		workbook.close();
		file.close();
	}

}
