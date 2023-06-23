

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class pbutilityclass 

{
private static final String Takescreenshot = null;

public  static String gettestdata(int rowindex,int colindx) throws EncryptedDocumentException, IOException
{
FileInputStream file=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\28janevngmavenproject\\testdata\\framework.xlsx");

Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
String value= sh.getRow(rowindex).getCell(colindx).getStringCellValue();
return value;
}

public static void capturess(WebDriver driver, int TCID) throws IOException
{
	
File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\User\\eclipse-workspace\\28janevngmavenproject\\screenshot\\abc"+TCID+".jpg");
FileHandler.copy(scr,dest);

}
public static String getpwduserdata(String key) throws EncryptedDocumentException, IOException
{
	FileInputStream file =new FileInputStream("C:\\Users\\User\\eclipse-workspace\\28janevngmavenproject\\propertyfile.properties");
	
	Properties p=new Properties();
	p.load(file);
String value=p.getProperty(key);
return value;
}
}
