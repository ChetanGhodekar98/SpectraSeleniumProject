package In.Spectra.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import In.Spectra.Pom.SignInPage;
import In.Spectra.Utility.FrameworkConstant;
import In.Spectra.Utility.InitObjects;
import In.Spectra.Utility.ReadTestData;

public class BaseClass extends InitObjects implements FrameworkConstant{
	
	protected static WebDriver webDriver;
	protected ReadTestData rd;
	protected ExtentReports extentReports;
	protected ExtentSparkReporter spark;
	@BeforeClass
	public void launchApplication() {
		rd=getReadTestDataObject();
		webDriver=new FirefoxDriver();
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITE_WAIT));
		webDriver.manage().window().maximize();
		
		webDriver.get(rd.readDataFromPropertiesFile("URL"));
		spark=new ExtentSparkReporter("ExtentReport.html");
		extentReports=new ExtentReports();
		extentReports.attachReporter(spark);
	}
	
	@BeforeMethod
	public void login() {
		SignInPage signInPage=new SignInPage(webDriver);
		signInPage.getEmailTextField().sendKeys(rd.readDataFromPropertiesFile("EMAILID"));
		signInPage.getPasswordTextField().sendKeys(rd.readDataFromPropertiesFile("PASSWORD"));
		signInPage.getLoginBuuton().click();
		
	}
	
	@AfterClass
	public void closeApplication() {
		webDriver.close();
		extentReports.flush();
	}
	

}
