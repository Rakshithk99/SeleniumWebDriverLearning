package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
	public void onStart(ITestContext context) {
	    // not implemented
		System.out.println("Test Execution Started...");
	  }
	
	public void onTestStart(ITestResult result) {
	    // not implemented
		System.out.println("Test started...");
	  }
	
	public void onTestSuccess(ITestResult result) {
		    // not implemented
		System.out.println("Test Passed...");
		  }
	 
	public void onTestFailure(ITestResult result) {
		    // not implemented
		System.out.println("Test Failed...");
		  }
	 
	public void onTestSkipped(ITestResult result) {
		    // not implemented
		System.out.println("Test Skipped...");
		  }
	 
	public void onFinish(ITestContext context) {
		    // not implemented
		System.out.println("Test Execution Finished...");
		  }
	 
	
}
