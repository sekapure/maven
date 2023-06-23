

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pbprofilepage 
{
@FindBy(xpath="//input[@name='personName']") private WebElement fullname;
WebDriver driver1;

public pbprofilepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
driver1=driver;
}
public void childwindowhanle()
{
Set<String> allids=driver1.getWindowHandles();
ArrayList<String> al=new ArrayList<String>(allids);
driver1.switchTo().window(al.get(1));
}
public String getprofilepagefullname()
{
String actname=fullname.getAttribute("value");	
return actname;
}

}
