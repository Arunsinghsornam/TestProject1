package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample3 {
	//To update Excel file
	public static void main(String[] args) throws IOException {
		File excelLocation = new File("C:\\Users\\karth\\eclipse-workspace\\Maven\\Excel\\excel.xlsx");
		FileInputStream stream = new FileInputStream(excelLocation);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet("data");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String value = cell.getStringCellValue();
		System.out.println(value);
		if(value.equals("USER NAME")) {
			cell.setCellValue("NAME");
		}
		//To convert  Java object into File object
		FileOutputStream o = new FileOutputStream(excelLocation);
		//save to workbook
		w.write(o);
		System.out.println(value);
	}

}
