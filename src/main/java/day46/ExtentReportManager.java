package day46;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

	public ExtentSparkReporter sparkReporter;	//UI of the report
	public ExtentReports extent;	//populate common info on the report
	public ExtentTest test;		//creating test case entries in the report and update status of the test methods
	
	public void onStart(ITestContext testContext)
	{
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
		
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional Testing");
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Operating System", System.getProperty("os.name"));
		extent.setSystemInfo("User Name", System.getProperty("user.name"));
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("user", "Rakshith");
		
	}
	public void onTestSuccess(ITestResult result)
	{
		test=extent.createTest(result.getName());
		
		test.log(Status.PASS, "Test case Passed is: "+ result.getName());
		
	
	}
	
	public void onTestFailure(ITestResult result)
	{
		test=extent.createTest(result.getName());
		
		test.log(Status.FAIL, "Test Failed is: "+ result.getName());
		test.log(Status.FAIL, "Test case Failed cause is: " + result.getThrowable().getMessage());
	}
	
	public void onTestSkipped(ITestResult result)
	{
		test=extent.createTest(result.getName());
		
		test.log(Status.SKIP, "Test Skipped is: "+ result.getName());
		
	}
	
	public void onFinish(ITestContext testContext)
	{
		extent.flush();
	}
}
