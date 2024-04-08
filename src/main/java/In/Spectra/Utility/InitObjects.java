package In.Spectra.Utility;

import org.openqa.selenium.WebDriver;

public class InitObjects {

	public ReadTestData getReadTestDataObject() {
		return new ReadTestData();
	}
	
	public JavaScriptExecutorUtil getJavaScriptExecutorUtil(WebDriver webDriver) {
		return new JavaScriptExecutorUtil(webDriver);
	}
	
	public RetryFailure getRetryFailure() {
		return new RetryFailure();
	}
	
	public ActionsClassUtil getACtionClassUtilObject(WebDriver webDriver) {
		return new ActionsClassUtil(webDriver);
	}
	
	public TakeScreenShotOnFailure getTakeScreenShotOnFailureObject() {
		return new TakeScreenShotOnFailure();
	}
	
	public SelectClassUtil getSelectClassUtilObject() {
		return new SelectClassUtil();
	}
	
}
