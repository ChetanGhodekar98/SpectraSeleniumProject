package In.Spectra.Groups;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import In.Spectra.Base.BaseClass;
import In.Spectra.Pom.CreateGroupPage;
import In.Spectra.Pom.HomePage;

public class CreateGroup_001_Test extends BaseClass{
	
	@Test
	public void createGroupMethod() throws InterruptedException {
		HomePage homePage=new HomePage(webDriver);
		homePage.getCustomerButton().click();
		 List<WebElement> data = homePage.getAllLinksOfCustomer();
		 for(WebElement webElement:data) {
			 if(webElement.getText().equals(rd.readDataFromPropertiesFile("USERNAME"))) {
				 webElement.click();
				 break;
			 }
		}
		homePage.getGroupLink().click();
		homePage.getCreateGroupButton().click();
		Thread.sleep(2000);
		CreateGroupPage createGroupPage=new CreateGroupPage(webDriver);
		createGroupPage.getGroupNameTextField().sendKeys(rd.readDataFromPropertiesFile("GROUPNAME"));
		createGroupPage.getCreateBuuton().click();
		Thread.sleep(2000);
		boolean result=false;
		try {
		result=createGroupPage.getUserGroupSuccessMessage().isDisplayed();
		}finally {
			if(result) {
				createGroupPage.getSuccessOkButton().click();
			}else {
				Assert.assertTrue(result,"GROUP IS NOT CREATED");
				Thread.sleep(4000);
				webDriver.close();
			}
		}
	}

}
