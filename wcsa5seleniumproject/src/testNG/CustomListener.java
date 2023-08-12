package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
//import org.testng.annotations.Test;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListener extends BaseTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test Started!!",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Execute Successfullly!!!",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//we are taking the screenshot when test case is failed thats why we use this
		String failedMethod = result.getMethod().getMethodName();
		Reporter.log("this is failed method:"+failedMethod,true);
		failedMethod (failedMethod);//present in base test
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test Skippes!!",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("Test Actual Started!!",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Test Finished!!",true);
	}
	
	
	
	
  }
