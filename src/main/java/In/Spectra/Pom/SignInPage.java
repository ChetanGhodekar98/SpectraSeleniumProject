package In.Spectra.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import In.Spectra.Base.BasePage;
import lombok.Getter;

@Getter
public class SignInPage extends BasePage{

	public SignInPage(WebDriver webDriver) {
		super(webDriver);
	}
	
	@FindBy(name="email")
	private WebElement emailTextField;

	@FindBy(name="password")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//button")
	private WebElement loginBuuton;
}
