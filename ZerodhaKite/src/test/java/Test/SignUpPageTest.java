package Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Driver;
import POM.ZerodhaLoginPage;
import POM.ZerodhaSignUpPage;
import Utility.ScreenShot;

public class SignUpPageTest {

	WebDriver obj;
	
	@BeforeMethod
	public void Browser() {
		obj=Driver.openBrowser();
	}
	@Test
	public void SignUP() throws InterruptedException, IOException{
//		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(obj);
//		ZerodhaSignUpPage zerodhaSignUpPage = new ZerodhaSignUpPage(obj);
//		zerodhaSignUpPage.clickonSign();
//		//Actions action = new Actions(obj);
//		Thread.sleep(2000);
//		
//		Set<String> sign = obj.getWindowHandles();
//		Iterator<String> it = sign.iterator();
//		
//		while (it.hasNext()) {
//			String san = it.next();
//			obj.switchTo().window(san);
//			
//		if(obj.getCurrentUrl().equals("https://zerodha.com/open-account?c=RAINMT&utm_source=kite&utm_medium=web&utm_campaign=account"));
//		{zerodhaSignUpPage.enterMobNUM("9876543210");
//		}
//		}
		//zerodhaSignUpPage.clickOnAbout();
		ZerodhaLoginPage zerodhaLoginpage = new ZerodhaLoginPage(obj);
		zerodhaLoginpage.clickOnSignUp();
		ScreenShot.getScreenShot(obj, "sign");
		ZerodhaSignUpPage zerodhaSignuppage = new ZerodhaSignUpPage(obj);
		Set<String> hii = obj.getWindowHandles();
		Iterator<String> i = hii.iterator();
		Thread.sleep(2000);
	    while(i.hasNext()) {
		String address =  i.next();
		obj.switchTo().window(address);
	
		if(obj.getCurrentUrl().equals("https://zerodha.com/open-account?c=RAINMT&utm_source=kite&utm_medium=web&utm_campaign=account"));  
		{ 
			//String phonee = Parametrization1.getData("Sheet1", 3, 1);
	zerodhaSignuppage.enterMobNUM("987654321");
	//zerodhaSignuppage.clickOnContinue();
	}}}
		
		
		
		
		
		
		
		
//		obj.switchTo().defaultContent();
	
//        	WebElement si = obj.findElement(By.xpath("(//a[text()='Signup'])[1]"));
//			action.moveToElement(si);
//			action.click();
//			action.perform();
		//zerodhaSignUpPage.clickOnSignUp();
		//Thread.sleep(2000);
		//obj.navigate().back();
			//WebElement about = obj.findElement(By.xpath("(//a[@href='https://zerodha.com/about/'])[1]"));
			//about.click();
		
//		zerodhaSignUpPage.clickOnProducts();
//		zerodhaSignUpPage.clickOnPricing();
//		zerodhaSignUpPage.clickOnSupport();
      
      //obj.switchTo().defaultContent();
//		//zerodhaSignUpPage.clickOnSubmit();
	}
	
	
	

