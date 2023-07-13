package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass {

	public static void genarateJvmReport(String jasonFile) {
		//mention the report location
		
		File reportingDirectory= new File("C:\\Users\\karth\\eclipse-workspace\\Maven\\target");
		
		//Set Configration
		Configuration config = new Configuration(reportingDirectory, jasonFile);
		
		config.addClassifications("platformName","window");
		config.addClassifications("11","window");
		config.addClassifications("buildNo","fb9434");
		List<String> jasonFiles = new ArrayList<String>();
		jasonFiles.add(jasonFile);
		
		ReportBuilder rp = new ReportBuilder(jasonFiles, config);
		rp.generateReports();

	}
}
