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

public class Sample4 {
	public static void main(String[] args) throws IOException {
		File excelLoction = new File("C:\\Users\\karth\\eclipse-workspace\\Maven\\Excel\\excel.xlsx");
		FileInputStream stream = new FileInputStream(excelLoction);
		Workbook w = new XSSFWorkbook(stream);
		
		Sheet sheet = w.createSheet("singh");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("USER NAME");
		
		//Convert java object to file object
		
		FileOutputStream o = new FileOutputStream(excelLoction);
		//save
		w.write(o);
		
		System.out.println("--done--");
		
	}

}
