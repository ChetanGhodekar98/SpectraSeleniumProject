package In.Spectra.Base;

import java.time.Duration;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import In.Spectra.Pom.HomePage;
import In.Spectra.Pom.SignInPage;
import In.Spectra.Utility.FrameworkConstant;
import In.Spectra.Utility.InitObjects;
import In.Spectra.Utility.ReadTestData;

public class BaseClass extends InitObjects implements FrameworkConstant{
	
	protected  WebDriver webDriver;
	protected ReadTestData rd;
	protected static ExtentReports extentReports;
	protected static ExtentSparkReporter spark;
	protected static TakesScreenshot takesScreenshot;
	@BeforeClass
	public void launchApplication() {
		rd=getReadTestDataObject();
		webDriver=new FirefoxDriver();
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITE_WAIT));
		webDriver.manage().window().maximize();
		
		webDriver.get(rd.readDataFromPropertiesFile("URL"));
		extentReports=new ExtentReports();
		
		spark=new ExtentSparkReporter("ExtentReport.html");
		extentReports.attachReporter(spark);
		
		takesScreenshot=(TakesScreenshot)webDriver;
	}
	
	@BeforeMethod(alwaysRun = true)
	public void login() throws InterruptedException {
		SignInPage signInPage=new SignInPage(webDriver);
		signInPage.getEmailTextField().sendKeys(rd.readDataFromPropertiesFile("EMAILID"));
		signInPage.getPasswordTextField().sendKeys(rd.readDataFromPropertiesFile("PASSWORD"));
		Thread.sleep(2000);
		signInPage.getLoginBuuton().click();
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void logout() throws InterruptedException {
		HomePage homePage=new HomePage(webDriver);
		Thread.sleep(2000);
		getACtionClassUtilObject(webDriver).moveToTheCenterOfTheElemnt(homePage.getNikithButton());
		Thread.sleep(2000);
		homePage.getLogoutButton().click();
	}
	
	@AfterClass
	public void closeApplication() {
		webDriver.close();
		extentReports.flush();
	}
	

}
