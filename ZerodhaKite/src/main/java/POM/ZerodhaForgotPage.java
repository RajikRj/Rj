package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotPage {

	@FindBy(xpath= "//a[@class='text-light forgot-link']")private WebElement forgot;
	@FindBy(xpath= "//label[@class='su-radio-label']")private WebElement userId ;
	@FindBy(xpath= "//input[@placeholder='PAN']")private WebElement pan;
	@FindBy(xpath= "(//label[@class='su-radio-label'])[4]")private WebElement sms;
	@FindBy(xpath= "(//input[@autocorrect='off'])[2]")private WebElement mobileNUM;
	
	
	public ZerodhaForgotPage(WebDriver obj) {
		PageFactory.initElements(obj, this);
	}
	public void clickONForgot() {
		forgot.click();
	}
	public void clickOnuserID() {
		userId.click();
	}
	public void enterPan(String PAN) {
		pan.sendKeys(PAN);;
	}
	public void clickONSms() {
		sms.click();
	}
	public void enterMOBILE(String num) {
		mobileNUM.sendKeys(num);;
	}
	
	
	
	
	
}
