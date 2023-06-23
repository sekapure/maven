

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pbhomepage
{
@FindBy(xpath="//a[@class='signed signed-desk']")private WebElement myaccount;
WebDriver driver1;

public pbhomepage(WebDriver driver)
{
PageFactory.initElements(driver,this);	

driver1=driver;
}
public void movetowordsmyaccount()
{
Actions act=new Actions(driver1);
act.moveToElement(myaccount).perform();
}
}
