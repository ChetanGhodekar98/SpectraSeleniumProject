package In.Spectra.Customer;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import In.Spectra.Base.BaseClass;
import In.Spectra.Pom.HomePage;

public class AddCustomer_001_Test extends BaseClass{

	@Test
	public void addCustomer() throws InterruptedException {
		HomePage homePage=new HomePage(webDriver);
		homePage.getCustomerButton().click();
		Thread.sleep(2000);
		getJavaScriptExecutorUtil(webDriver).javaScriptScrollBy(0,300);
		homePage.getCreateCustomerButton().click();
		Thread.sleep(2000);
		homePage.getCustomerNameTextField().sendKeys(rd.readDataFromPropertiesFile("USERNAME"));
		homePage.getCreateCustomerBuutonOnPopUp().click();
		homePage.getOkButton().click();
	}
	
}
