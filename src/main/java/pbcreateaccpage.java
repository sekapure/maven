

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pbcreateaccpage
{
@FindBy(xpath=" //span[contains(text(),'My profile')] ")private WebElement myprofile;

public pbcreateaccpage(WebDriver driver)
{
PageFactory.initElements(driver,this);	

}
public void clickonmyprofile()
{
myprofile.click();	
}
}
