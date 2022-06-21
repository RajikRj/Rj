package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import POJO.Driver;

public class KiteTest {

	@Test
	public void LoginwithValidCredentials() {
		WebDriver obj=Driver.openBrowser();
		WebElement username = obj.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("OKP335");
		WebElement password = obj.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("QAZ123456");
		WebElement login =obj.findElement(By.xpath("//button[@type='submit']"));
	    login.click();
	    
	    WebElement pin = obj.findElement(By.xpath("//input[@id='pin']"));
	    pin.sendKeys("456789");
	    WebElement enterpin = obj.findElement(By.xpath("//button[@class='button-orange wide']"));
	    enterpin.click();
	}
	
	
	
	
	
	
	
}
