package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
	
	public static WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver obj = new ChromeDriver(op);
		obj.get("https://kite.zerodha.com/?next=%2Fdashboard");
		obj.manage().window().maximize();
		return obj;
		
	}
	
}
