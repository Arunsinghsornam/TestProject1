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

public class Sample {
	//To launch the excel sheet and convert File object into java object
	public static void main(String[] args) throws IOException {
		File excelLocation = new File("C:\\Users\\karth\\eclipse-workspace\\Maven\\Excel\\excel.xlsx");
		FileInputStream stream = new FileInputStream(excelLocation);
		
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet("data");
		int i= sheet.getPhysicalNumberOfRows();
		System.out.println(i);
		Row row = sheet.getRow(0);
		int j = row.getPhysicalNumberOfCells();
		Cell cell = row.getCell(j);
		System.out.println(cell);
		
		
		
	}

}
