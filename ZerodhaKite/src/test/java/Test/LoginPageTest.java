package Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import POJO.Driver;
import POM.ZerodhaLoginPage;
import Utility.ExcelSheet;
import Utility.ScreenShot;


public class LoginPageTest {
WebDriver obj;

   @BeforeMethod
   public void browser() {
	   obj=Driver.openBrowser();
   }
   
   @DataProvider (name = "NameData")
	public Object[][] data(){
		return new Object[][] {{"Rajik","Sheikh"},{"Rj","Empire"}};
	}

	@Test(dataProvider = "NameData")
	public void LoginWithvalidCredentialsTest(String username, String password ) throws EncryptedDocumentException, IOException {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(obj);
//		String username = ExcelSheet.getData(0, 1);
//		String password = ExcelSheet.getData( 1, 1);
		
		
		zerodhaLoginPage.enterEmail(username);
		zerodhaLoginPage.enterPass(password);
		//zerodhaLoginPage.clickOnLogin();
		//ScreenShot.getScreenShot(obj, "Rajik.jpeg");
		
	}
//	@Test(enabled=false)
//	public void forgotPasswordLinkTest() {
//		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(obj);
//		zerodhaLoginPage.clickOnForgot();
//		}
//	
//	@Test(enabled=false)
//	public void signUpLinkTest() {
//		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(obj);
//		zerodhaLoginPage.clickOnSignUp();
//	}
	
	@Test
	public void Assert () {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(obj);
		zerodhaLoginPage.clickOnLogin();
		String text = zerodhaLoginPage.getText();
		String expectedtext= "User ID should be minimum 6 characters.";
		org.testng.Assert.assertEquals(text, expectedtext);
		
		//SoftAssert assertion = new SoftAssert();
		
		
		
	}
	
	
}
