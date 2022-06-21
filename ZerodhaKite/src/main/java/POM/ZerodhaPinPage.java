package POM;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaPinPage {

	@FindBy(xpath="//input[@label='PIN']")private WebElement pin; 
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//a[text()='Forgot 2FA?']")private WebElement forgotPin;
	@FindBy(xpath="(//a[@target='_blank'])[3]")private WebElement signUp;
	
	
	public ZerodhaPinPage(WebDriver obj) {
		PageFactory.initElements(obj, this);
	}
	
	public void enterPin(String pinNum, WebDriver obj) {
		WebDriverWait explicitwait = new WebDriverWait(obj,Duration.ofMillis(2000));
		explicitwait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys(pinNum);
	}
	public void clickOnSubmit() {
		submit.click();
	}
	public void clickForgotPin() {
		forgotPin.click();
	}
	public void clickOnSignUp() {
		signUp.click();
	}
}
//WebDriverWait explicitwait = new WebDriverWait(obj,Duration.ofMillis(2000));
		//obj.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		//explicitwait.until(ExpectedConditions.visibilityOf(pin));
		//pin.sendKeys(pinNum);//500 milisec
//		
//		FluentWait<WebDriver> fluentwait  = new FluentWait<WebDriver>(obj);
//		fluentwait.withTimeout(Duration.ofMillis(2000));
//		fluentwait.pollingEvery(Duration.ofMillis(100));
//		fluentwait.ignoring(Exception.class);
//		fluentwait.until(ExpectedConditions.visibilityOf(pin));
