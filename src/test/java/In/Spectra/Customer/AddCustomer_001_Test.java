package In.Spectra.Customer;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;

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
		Thread.sleep(4000);
		homePage.getCreateCustomerBuutonOnPopUp().click();
		Thread.sleep(3000);
		if(homePage.getCustomerCreatedSuccessFully().isDisplayed()) {
			homePage.getOkButton().click();
		}else {
			ExtentTest	test=extentReports.createTest("CUSTOMER EXIST");
			Thread.sleep(2000);
			Assert.assertTrue(false);
		}
		Thread.sleep(2000);
	}
	
}
