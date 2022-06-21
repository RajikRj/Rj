package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver1 {

	
	public static WebDriver openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Automation\\\\chromedriver.exe");
		WebDriver obj = new ChromeDriver ();
		obj.get("https://kite.zerodha.com/dashboard");
		obj.manage().window().maximize();
		 return obj;
		
	}
	
}
