package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {

	@FindBy(xpath="//input[@type='text']")private WebElement email;
	@FindBy(xpath="//input[@type='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement login;
	@FindBy(xpath="//a[@href='/forgot']")private WebElement forgot;
	@FindBy(xpath="(//a[@target='_blank'])[3]")private WebElement signup;
	@FindBy(xpath="//span[text()='User ID should be minimum 6 characters.']")private WebElement error;
	public ZerodhaLoginPage(WebDriver obj) {
		PageFactory.initElements(obj, this);
	}
	public void enterEmail(String emailID) {
		email.sendKeys(emailID);
	}
	public void enterPass(String pass) {
		password.sendKeys(pass);
	}
	public void clickOnLogin() {
		login.click();
	}
	public void clickOnForgot() {
		forgot.click();
	}
	public void clickOnSignUp() {
		signup.click();
	}
	public String getText() {
		String text =error.getText();
		return text;
	}
}
	

