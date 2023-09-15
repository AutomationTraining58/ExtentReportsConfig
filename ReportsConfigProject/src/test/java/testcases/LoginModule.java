package testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LoginModule {

	ExtentReports extent;
	
	
	// ExtentReports > it will generate reports
	//ExtentSparkReporter- setting reports path , reports name
	

	
	@Test
	public void testcase1()
	{
	
		
		System.out.println("testcase 1 is executed");
	}
	
	
	@Test
	public void testcase2()
	{
		
		System.out.println("testcase 2 is executed");
	}
	
	
	@Test
	public void testcase3()
	{
	
		System.out.println("testcase 3 is executed");
	}
	
	
	
	
}
