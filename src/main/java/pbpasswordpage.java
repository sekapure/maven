

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pbpasswordpage 
{
@FindBy(xpath="//input[@id='central-login-password']")private WebElement password;
@FindBy(xpath="//a[@id='login-in-with-password']")private WebElement signin;

public pbpasswordpage(WebDriver driver)
{
PageFactory.initElements(driver,this);	

}
public void enterpasssword(String pwd)
{
password.sendKeys(pwd);	
}
public void clickonsignin()
{
signin.click();	
}
}
