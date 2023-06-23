

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pbmobilenopage
{
@FindBy(xpath="(//input[@type='number'])[2]")private WebElement mobilenumber;

@FindBy(xpath="(//a[@id='central-loggin-with-pwd'])[2]")private WebElement signinwithpassword;

public pbmobilenopage(WebDriver driver)
{
PageFactory.initElements(driver,this);	

}
public void entermobilenumber(String mobno)
{

	mobilenumber.sendKeys(mobno);
}
public void clickonsigninwithpasssword()
{
signinwithpassword.click();	
}
}
