package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	
//	Kite  login credentials 
//	User name : OKP335
//	Password:QAZ123456
//	Pin:456789

	@FindBy (xpath = "")private WebElement username;
	@FindBy (xpath= "")private WebElement password;
	@FindBy (xpath ="")private WebElement login;
	@FindBy (xpath= "")private WebElement pin;
	
	public Pom(WebDriver obj) {
		PageFactory.initElements(obj, this);	
	}
	public void enterEmail(String userId) {
		username.sendKeys(userId);
	}
	public void enterPass(String pass) {
		password.sendKeys(pass);
	}
	public void clickOnLogin() {
		login.click();
	}
	public void enterPin(String Pin) {
		pin.sendKeys(Pin);
	}
	
}
