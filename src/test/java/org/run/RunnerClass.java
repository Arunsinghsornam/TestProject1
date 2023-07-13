package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.ReportingClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\feature\\2D_with_Header.feature", glue = "org.step", dryRun=false)
public class RunnerClass {

	}
	

