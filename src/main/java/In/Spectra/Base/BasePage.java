package In.Spectra.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends BaseClass{
	
	public BasePage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

}
