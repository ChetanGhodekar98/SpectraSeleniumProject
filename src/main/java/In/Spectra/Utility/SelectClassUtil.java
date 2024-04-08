package In.Spectra.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClassUtil {

	private static Select select;
	
	public void selectDropDownByValue(String value,WebElement webElement) {
		select=new Select(webElement);
		select.selectByValue(value);
	}
	
}
