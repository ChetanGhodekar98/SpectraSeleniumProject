package In.Spectra.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassUtil {

	private Actions actions;
	
	public ActionsClassUtil(WebDriver webDriver) {
		actions=new Actions(webDriver);
	}
	
	public void ClickAndHoldMethod(WebElement webElement) {
		actions.clickAndHold(webElement).perform();
	}

	public void moveToElement(WebElement webElement) {
		actions.moveToElement(webElement, 100, 0).click().perform();
	}
	
	public void moveToTheCenterOfTheElemnt(WebElement webElement) {
		actions.moveToElement(webElement).perform();
	}
	
}
