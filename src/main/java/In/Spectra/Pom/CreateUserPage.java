package In.Spectra.Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import In.Spectra.Base.BasePage;
import lombok.Getter;

@Getter
public class CreateUserPage extends BasePage{

	public CreateUserPage(WebDriver webDriver) {
		super(webDriver);
	}
	
	@FindBy(id="name")
	private WebElement fullNameTextField;
	
	@FindBy(id="phone")
	private WebElement phoneNumberTextField;

	@FindBy(id="email")
	private WebElement emailTextField;
	
	@FindBy(id="password")
	private WebElement passWordTextField;
	
	@FindBy(id="def_group")
	private WebElement selectGroupDropDown;
	
	@FindBy(xpath = "//select[@id='def_group']/option")
	private List<WebElement> selectGroupDropDownData;
	
	@FindBy(id="role_id")
	private WebElement selectRoleDropDown;
	
	@FindBy(xpath = "//button[text()='Create']")
	private WebElement createUserButton;
	
	@FindBy(xpath = "//p[text()='User created successfully']")
	private WebElement userAddedSuccessMessge;
	
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement successOkButton;
}