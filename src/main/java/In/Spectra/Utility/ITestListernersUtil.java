package In.Spectra.Utility;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import In.Spectra.Base.BaseClass;

public class ITestListernersUtil extends BaseClass implements ITestListener{

	private ExtentTest test; 
	
	public void onTestStart(ITestResult result) {
		test=extentReports.createTest("EXECUTION STARTED");
		Reporter.log("STARTED "+result.getName(),true);
		test.log(Status.PASS, "EXECUTION STARTED"+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		test=extentReports.createTest("EXECUTION SUCCESS");
		Reporter.log("SUCCESS "+result.getName(),true);
		test.log(Status.PASS, "EXECUTION SUCCESS"+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		test=extentReports.createTest("EXECUTIO FAILURE");
		test.log(Status.FAIL, "EXECUTION FAILED"+result.getName());
		String path=getTakeScreenShotOnFailureObject().takeScreenShotOn(takesScreenshot);
		test.addScreenCaptureFromPath(path);
	}

	public void onTestSkipped(ITestResult result) {
		test=extentReports.createTest("EXECUTION SKIPPED");
		Reporter.log("SKIPPED "+result.getName(),true);
		test.log(Status.WARNING, "EXECUTION SKIP"+result.getName());
	}
}
