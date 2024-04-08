package In.Spectra.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import In.Spectra.Base.BasePage;

public class CreateSitePage extends BasePage{

	public CreateSitePage(WebDriver webDriver) {
		super(webDriver);
	}
	
	@FindBy(xpath = "input[name='name']")
	private WebElement siteName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="country")
	private WebElement country;
	
	@FindBy(id="state")
	private WebElement state;

	@FindBy(id="town")
	private WebElement town;
	
	@FindBy(id="site_type")
	private WebElement siteTypeDropDown;
	
	@FindBy(id="gateway_type")
	private WebElement dataSourceType;
	
	@FindBy(id="device_id")
	private WebElement deviceId;
	
	@FindBy(id="product_type")
	private WebElement productTypeDropDown;
	
	@FindBy(id="role")
	private WebElement roleDropDown;
	
	@FindBy(xpath = "//input[@id='search_input']")
	private WebElement selectUser;
	
	@FindBy(id="latitude")
	private WebElement latitudeTextField;
	
	@FindBy(id="longitude")
	private WebElement longitude;
	
	@FindBy(xpath = "//button[text()='Create']")
	private WebElement createButton;
}
