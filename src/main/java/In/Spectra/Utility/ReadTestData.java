package In.Spectra.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadTestData implements FrameworkConstant {

	public String readDataFromPropertiesFile(String key) {
		File File=new File(PROPERTIESFILEPATH);
		try {
			FileInputStream finFileInputStream=new FileInputStream(File);
			Properties properties=new Properties();
			properties.load(finFileInputStream);
			return properties.getProperty(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
