package In.Spectra.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import In.Spectra.Base.BasePage;
import lombok.Getter;

@Getter
public class CreateGroupPage extends BasePage{

	public CreateGroupPage(WebDriver webDriver) {
		super(webDriver);
	}
	
	@FindBy(xpath = "//input[@name='groupName']")
	private WebElement groupNameTextField;
	
	@FindBy(xpath = "//button[text()='create']")
	private WebElement createBuuton;
	
	@FindBy(xpath = "//p[text()='User Group Created :)']")
	private WebElement userGroupSuccessMessage;
	
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement successOkButton;

	

}
