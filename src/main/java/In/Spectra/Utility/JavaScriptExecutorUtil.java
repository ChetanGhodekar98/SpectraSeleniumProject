package In.Spectra.Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptExecutorUtil {

	private JavascriptExecutor js;
	
	public JavaScriptExecutorUtil(WebDriver webDriver) {
		js=(JavascriptExecutor) webDriver;
	}
	
	public void javaScriptScrollBy(int x,int y) {
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
}
