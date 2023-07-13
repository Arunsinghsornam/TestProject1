package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample1 {
	//To print the string value
	public static void main(String[] args) throws IOException {
		File excelLocation = new File("C:\\Users\\karth\\eclipse-workspace\\Maven\\Excel\\excel.xlsx");
		FileInputStream stream = new FileInputStream(excelLocation);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet("data");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);
				
			}
			
		}
		
	}

}
