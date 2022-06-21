package Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Driver;
import POM.ZerodhaForgotPage;
import POM.ZerodhaLoginPage;
import Utility.ExcelSheet;

public class ForgotPageTest {

	
	WebDriver obj;
	
	@BeforeMethod
	public void Browser() {
		obj=Driver.openBrowser();	
	}
	
	@Test 
	public void ForgotIdPassword() throws InterruptedException, EncryptedDocumentException, IOException {
		
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(obj);
		ZerodhaForgotPage zerodhaForgotPage = new ZerodhaForgotPage(obj);
		zerodhaForgotPage.clickONForgot();
		Thread.sleep(2000);
		Set<String> get = obj.getWindowHandles();
		Iterator<String> it =get.iterator();
		
		while(it.hasNext()) {
			String value = it.next();
			obj.switchTo().window(value);
			if(obj.getCurrentUrl().equals("https://kite.zerodha.com/forgot")) {
				
				zerodhaForgotPage.clickOnuserID();
				zerodhaForgotPage.enterPan("Rajik");
				zerodhaForgotPage.clickONSms();
				zerodhaForgotPage.enterMOBILE("Sheikh");
				

				
						
			}}
		
}}
