package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

//ITestListener  > Interface


public class Listener implements  ITestListener {
	
	ExtentReports extent;

	@Override
	public void onTestStart(ITestResult result) {
		
		// it will execute before start of each and every testcase
	if(extent==null)
	{
	extent=	ResuableMethods.setExtentReportsConfiguration();
	}
	
	extent.createTest(result.getMethod().getMethodName());
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		// it will invoke only if testcase fails
		
		// screenshot code
		
	}

	@Override
	public void onStart(ITestContext context) {
		// this will execute at first before all testcases
	}

	@Override
	public void onFinish(ITestContext context) {
		
		// this will execute at last after executing all testcases
		
		extent.flush();
		
	}
	
	
	
	
	
	
	
	
	

}
