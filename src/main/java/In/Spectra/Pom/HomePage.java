package In.Spectra.Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import In.Spectra.Base.BasePage;
import lombok.Getter;

@Getter
public class HomePage extends BasePage{
	
	public HomePage(WebDriver webDriver) {
		super(webDriver);
	}
	
	@FindBy(xpath = "(//span[text()='Customers'])[2]")
	private WebElement customerButton;
	
	@FindBy(xpath = "//button[text()='Create Customer']")
	private WebElement CreateCustomerButton;
	
	@FindBy(xpath = "//input[@name='customerName']")
	private WebElement customerNameTextField;
	
	@FindBy(xpath = "//button[text()='create']")
	private WebElement createCustomerBuutonOnPopUp;
	
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement okButton;
	
	@FindBy(xpath = "//*[local-name()='svg' and @class='cursor-pointer me-2']")
	private List<WebElement> updateButton;
	
	@FindBy(xpath = "//div[@class='col-lg-3 col-md-4 mb-4 mb-md-0']//a")
	private List<WebElement> allLinksOfCustomer;
	
	@FindBy(xpath = "//button[text()='save']")
	private WebElement saveButton;
	
	@FindBy(name="customerName")
	private WebElement updateCustomeName;
	
	@FindBy(xpath = "//*[local-name()='svg' and @class='cursor-pointer']")
	private List<WebElement> deleteCustomer;
	
	@FindBy(xpath = "//button[text()='continue']")
	private WebElement deleteConfirmationbutton;
	
	@FindBy(xpath = "//p[text()='customer deleted Successfully']")
	private WebElement deleteCustomerToasterMessage;

}
