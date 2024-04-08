package In.Spectra.Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;


public class TakeScreenShotOnFailure{
	public String takeScreenShotOn(TakesScreenshot takeScreenShot) {
				try {
					
					File source=takeScreenShot.getScreenshotAs(OutputType.FILE);
					String name=((LocalDateTime.now().toString().replace(":", "-")));
					String path="./ScreenShots/Spectra"+name+".png";
					File target=new File(path);
					FileHandler.copy(source,target);
					return path;
		} catch (IOException e) {
					e.printStackTrace();
		}
				return null;
	}
	
	
}
