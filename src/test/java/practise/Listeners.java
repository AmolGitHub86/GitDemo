package practise;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import ExtendReports.ExetndReportsTestNG;

public class Listeners extends Initialization implements ITestListener{

	ExtentTest test;
	ExtentReports extent= ExetndReportsTestNG.getReportobject();
	ThreadLocal<ExtentTest> extenttest= new ThreadLocal<ExtentTest>();  //Thread safe
	
    public void onFinish(ITestContext context) {                
        System.out.println("Test execution finished for suite:");
        System.out.println("finish");
        extent.flush();
    }   
	


	public void onStart(ITestResult result) {					
		// TODO Auto-generated method stub				

	}		

	@Override		
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {					
		// TODO Auto-generated method stub				

	}		

	@Override		
	public void onTestFailure(ITestResult result) {					
		// TODO Auto-generated method stub	
		//test.fail(result.getThrowable());
		extenttest.get().fail(result.getThrowable());
		try {
			driver= (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
		String filepath = null;
		try {
			filepath = takescreenshot(result.getMethod().getMethodName(),driver);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
		extenttest.get().addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
		
	}		

	@Override		
	public void onTestSkipped(ITestResult result) {					
		// TODO Auto-generated method stub				

	}		

	@Override		
	public void onTestStart(ITestResult result) {	
		
		test=extent.createTest(result.getMethod().getMethodName());
		System.out.println("on start method of NG listener");
		extenttest.set(test); //unique thread id

	}		

	@Override		
	public void onTestSuccess(ITestResult result) {					
		// TODO Auto-generated method stub		
		//test.log(Status.PASS, "Test Passed successfully");
		extenttest.get().log(Status.PASS, "Test Passed successfully");
		System.out.println("pass");

	}


}
