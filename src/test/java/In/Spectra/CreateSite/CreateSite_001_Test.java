package In.Spectra.CreateSite;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import In.Spectra.Base.BaseClass;
import In.Spectra.Pom.HomePage;

public class CreateSite_001_Test extends BaseClass{

	@Test
	public void createSite() throws InterruptedException {
		HomePage homePage=new HomePage(webDriver);
		homePage.getCustomerButton().click();
		Thread.sleep(2000);
		 List<WebElement> data = homePage.getAllLinksOfCustomer();
		 for(WebElement webElement:data) {
			 if(webElement.getText().equals(rd.readDataFromPropertiesFile("USERNAME"))) {
				 webElement.click();
				 break;
			 }
		}
		 
	}
	
	
}
