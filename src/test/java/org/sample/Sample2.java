package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample2 {
	//To print  string and both numeric cell value and date format
	static String value;
	public static String main(String[] args) throws IOException {
		File excelLocation = new File("C:\\Users\\karth\\eclipse-workspace\\Maven\\Excel\\excel.xlsx");
		FileInputStream stream = new FileInputStream(excelLocation);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet("data");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int type = cell.getCellType();
				System.out.println(type);
				if(type==1) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}if(type==0) {
					if(DateUtil.isCellDateFormatted(cell)) {
						Date date = cell.getDateCellValue();
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
						String ddFormat = dateFormat.format(date);
						System.out.println(ddFormat);
					}else {
						double d = cell.getNumericCellValue();
						long l=(long)d;
						String value = String.valueOf(l);
					}
					
				}
				
			}
			
		}
		return value;
	}

}
