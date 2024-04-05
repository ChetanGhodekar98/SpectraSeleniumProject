package In.Spectra.Customer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import In.Spectra.Base.BaseClass;
import In.Spectra.Pom.HomePage;

public class DeleteCustomer_003_Test extends BaseClass{
	@Test
	public void addCustomer() throws InterruptedException {
		HomePage homePage=new HomePage(webDriver);
		homePage.getCustomerButton().click();
		Thread.sleep(2000);
		 List<WebElement> data = homePage.getAllLinksOfCustomer();
		 int index=0;
		 for(WebElement webElement:data) {
			 System.out.println(webElement.getText());
			 if(webElement.getText().contains(rd.readDataFromPropertiesFile("USERNAME")))
				 break;
			 index++;
		}
		 data=homePage.getDeleteCustomer();
		 data.get(index).click();
		 homePage.getDeleteConfirmationbutton().click();
		 homePage.getDeleteCustomerToasterMessage().isDisplayed();

	}

}
