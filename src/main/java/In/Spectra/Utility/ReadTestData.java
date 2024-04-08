package In.Spectra.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ReadTestData implements FrameworkConstant {
	private static Sheet sheet;
	private static int row;
	private static int column;

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
	
	
	public static  String[][] readDataFromExcelSheet(){
		String[][] registerData;
		File file=new File(EXCELSHEETPATH);
		FileInputStream fin;
		try {
			fin = new FileInputStream(file);
			Workbook workbook=WorkbookFactory.create(fin);
			sheet=workbook.getSheet("Sheet1");
			row=workbook.getSheet("Sheet1").getPhysicalNumberOfRows();
		    column=workbook.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		registerData=new String[row-1][column];
		
		for(int i=1;i<row;i++) {
			for(int j=0;j<column;j++) {
				registerData[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return registerData;
	}
	
}
