package In.Spectra.Groups;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import In.Spectra.Base.BaseClass;
import In.Spectra.Pom.CreateUserPage;
import In.Spectra.Pom.HomePage;

public class AddUsersIntoTheGroup_002_Test extends BaseClass{
	
	@DataProvider(name="testData")
	public String[][] testData() {
		return rd.readDataFromExcelSheet();
	}
	
	@Test(dataProvider = "testData")
	public void addUsers(String[] test) throws InterruptedException {
		HomePage homePage=new HomePage(webDriver);
		homePage.getCustomerButton().click();
		homePage.getUsersLink().click();
		homePage.getCreateUsersButton().click();
		
		CreateUserPage createUserPage=new CreateUserPage(webDriver);
		Thread.sleep(3000);
		createUserPage.getFullNameTextField().sendKeys(test[0]);
		createUserPage.getPhoneNumberTextField().sendKeys(test[1]);
		createUserPage.getEmailTextField().sendKeys(test[2]);
		createUserPage.getPassWordTextField().sendKeys(test[3]);
		
		Actions actions=new Actions(webDriver);
		actions.moveToElement(createUserPage.getSelectGroupDropDown()).click().perform();
		
		List<WebElement> data = createUserPage.getSelectGroupDropDownData();
		int index=0;
		for(WebElement d:data) {
			if(d.getText().equals(test[4])) {
				break;
			}
			index++;
		}
		Select select=new Select(createUserPage.getSelectGroupDropDown());
		select.selectByIndex(index);
		
		select=new Select(createUserPage.getSelectRoleDropDown());
		select.selectByVisibleText(test[5]);
		createUserPage.getCreateUserButton().click();
		createUserPage.getUserAddedSuccessMessge().isDisplayed();
		Thread.sleep(2000);
		createUserPage.getSuccessOkButton().click();
		Thread.sleep(5000);
		
	}

}
