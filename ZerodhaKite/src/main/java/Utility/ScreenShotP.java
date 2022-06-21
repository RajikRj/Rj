package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotP {

public static void getScreenShot(WebDriver obj, String name) throws IOException {
		
		File source = ((TakesScreenshot)obj).getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\Automation\\Selenium\\ScreenShots\\"+ name +".jpg");
		FileHandler.copy(source, destination);
	}
	
}
