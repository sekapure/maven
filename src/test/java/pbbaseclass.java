

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.classfile.Utility;

public class pbbaseclass 
{
	public WebDriver driver;
public void initializebrowser() throws EncryptedDocumentException, IOException
{
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get(pbutilityclass.getpwduserdata("URL"));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
}
