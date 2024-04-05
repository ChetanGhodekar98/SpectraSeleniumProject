package In.Spectra.Customer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import In.Spectra.Base.BaseClass;
import In.Spectra.Pom.HomePage;

public class UpdateCustomer_002_Test extends BaseClass{

	@Test
	public void addCustomer() throws InterruptedException {
		HomePage homePage=new HomePage(webDriver);
		homePage.getCustomerButton().click();
		Thread.sleep(2000);
		 List<WebElement> data = homePage.getAllLinksOfCustomer();
		 int index=0;
		 for(WebElement webElement:data) {
			 System.out.println(webElement.getText());
			 if(webElement.getText().equals(rd.readDataFromPropertiesFile("USERNAME")))
				 break;
			 index++;
		}
		
		 
		 data=homePage.getUpdateButton();
		 data.get(index).click();
				 homePage.getUpdateCustomeName().sendKeys("ANIKET");
				 homePage.getSaveButton().click(); 
	}
}
