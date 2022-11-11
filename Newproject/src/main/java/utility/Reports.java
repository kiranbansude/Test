package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	
	public static ExtentReports createExtentReports () {
		ExtentReports reports = new ExtentReports();
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter ("extentReports.html");
		reports.attachReporter(sparkReporter);
		reports.setSystemInfo("CreatedBy", "Kiran");
		reports.setSystemInfo("TestSuite", "Reggression");
		return reports;
		
	}

}



