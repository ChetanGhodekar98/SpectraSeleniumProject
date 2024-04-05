package In.Spectra.Utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailure implements IRetryAnalyzer{

	private int retryCount=0;
	private static final int max=3;
	
	public boolean retry(ITestResult result) {
		if(!result.isSuccess() && retryCount<max) {
			retryCount++;
			return true;
		}
		return false;
	}

}
