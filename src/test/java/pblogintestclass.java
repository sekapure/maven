

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class pblogintestclass extends pbbaseclass
{
	pbsignninpage s;
	pbmobilenopage m;
	pbpasswordpage p;
	pbhomepage h;
	pbprofilepage prof;
	pbcreateaccpage c;
	int TCID;
	@BeforeClass()
	public void openbrowser() throws EncryptedDocumentException, IOException
	{
		initializebrowser();
		 s=new pbsignninpage(driver);
		 m=new pbmobilenopage(driver);
		 p=new pbpasswordpage(driver);
		 h=new pbhomepage(driver);
		 prof=new pbprofilepage(driver);
		 c=new pbcreateaccpage(driver);
	}
	
	
	@BeforeMethod
	public void logintoapp() throws EncryptedDocumentException, IOException, InterruptedException
	{
s.clickonsignin();
m.entermobilenumber(pbutilityclass.getpwduserdata("mobileno"));
m.clickonsigninwithpasssword();
p.enterpasssword(pbutilityclass.getpwduserdata("pwd"));
p.clickonsignin();
Thread.sleep(3000);
	}
	
	@Test
public void verifyfullname() throws InterruptedException, EncryptedDocumentException, IOException
{
		 TCID=101;
		
		h.movetowordsmyaccount();
		Thread.sleep(3000);	
		
		c.clickonmyprofile();
		prof.childwindowhanle();
		String actname=prof.getprofilepagefullname();
		String expname=pbutilityclass.gettestdata(0,1);
		org.testng.Assert.assertEquals(actname, expname,"failed:both results are not equale");
	
}
@AfterMethod
public void capss(ITestResult s1) throws IOException
{
	
	if(s1.getStatus()==ITestResult.FAILURE)
	{
		pbutilityclass.capturess(driver, TCID);
	}
}
@AfterClass
public void closeapp() throws InterruptedException
{
	
	Thread.sleep(3000);
	driver.quit();
}
}
