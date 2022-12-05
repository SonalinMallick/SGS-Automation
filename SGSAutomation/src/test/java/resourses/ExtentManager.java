package resourses;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentManager {
	public static ExtentReports extentReports = new ExtentReports();
    public synchronized static ExtentReports createExtentReports() {
    	String path = System.getProperty("user.dir") + File.separator + "test-output" + File.separator
    			+ "extentReport.html";

    	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
    	reporter.config().setReportName("Web Automation Results");
    	reporter.config().setDocumentTitle("Test Results");

    	extentReports = new ExtentReports();
    	extentReports.attachReporter(reporter);
    	extentReports.setSystemInfo("Tester", "Sonalin");
        return extentReports;
    }
    
    

}
