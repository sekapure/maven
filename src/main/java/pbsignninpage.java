

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import installation.Webelement;

public class pbsignninpage
{
	//class1
	@FindBy(xpath="//a[@class='sign-in']")private WebElement signin;
	
	public pbsignninpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void clickonsignin()
	{

   signin.click();
	}
	}