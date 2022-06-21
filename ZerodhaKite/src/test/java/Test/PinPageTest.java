package Test;

import java.io.IOException;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POJO.BaseTest;
import POJO.Driver;
import POM.ZerodhaForgotPage;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.ExcelSheet;
import Utility.Report;
@Listeners(Utility.TestListeners.class)

public class PinPageTest extends BaseTest {
	ExtentReports report;
	ExtentTest test;
	@BeforeTest
	public void extentreports() {
		report = Report.createReport();
	}
	@BeforeMethod
	public void browser () {
		obj = Driver.openBrowser();
	}
	
	@Test
	public void EnterPin () throws EncryptedDocumentException, IOException, InterruptedException {
		test = report.createTest("EnterPin");
		
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(obj);
		ZerodhaPinPage zerodhaPinPage = new ZerodhaPinPage (obj);
		
		String username = ExcelSheet.getData(0, 1);
		String password = ExcelSheet.getData( 1, 1);
		zerodhaLoginPage.enterEmail(username);
		zerodhaLoginPage.enterPass(password);
		zerodhaLoginPage.clickOnLogin();
         Thread.sleep(2000);
		
		String enterpin = ExcelSheet.getData(2, 1);
		zerodhaPinPage.enterPin(enterpin, obj);
		zerodhaPinPage.clickOnSubmit();
		
		
		Thread.sleep(2000);
		WebElement search = obj.findElement(By.xpath("//input[@icon='search']"));
		search.sendKeys("TataMotors");
		Thread.sleep(2000);
		WebElement buy = obj.findElement(By.xpath("//li[@class='search-result-item selected isadded']"));
		buy.click();
		Thread.sleep(2000);
		WebElement bse =  obj.findElement(By.xpath("//label[@class='su-radio-label']"));
		bse.click();
		Thread.sleep(2000);
		WebElement qty = obj.findElement(By.xpath("//input[@nativeerror='true']"));
		qty.clear();
		qty.sendKeys("2");
		WebElement market = obj.findElement(By.xpath("WebElement qty = obj.findElement(By.xpath(\"//input[@nativeerror='true']\"));"));
		market.click();
		Thread.sleep(2000);
		WebElement submit = obj.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		}
	
	
	@AfterMethod
	public void closeBrowser(ITestResult result) {
		if(result.getStatus()== ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName());
		}
		else {test.log(Status.SKIP, result.getName());}
	}
	
	
	@Test(dependsOnMethods = {"EnterPin"})
     public void rj() {
		System.out.println("Rajik");
	}
	@AfterTest
	public void flushResult() {
		report.flush();
	}
	
	@Test 
	public void ForgotIdPassword() throws InterruptedException, EncryptedDocumentException, IOException {
		test = report.createTest("ForgotIdPassword");
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
	
	}
	

}


