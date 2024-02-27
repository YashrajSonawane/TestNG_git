package Axis.ManipalTraining;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	private static ChromeDriver driver;
	
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		File f = ( (TakesScreenshot) driver).getScreenshotAs (OutputType. FILE); 
		FileUtils.copyFile(f, new File ("C:\\Users\\Lenovo\\Documents\\screenshot.png"));
		System.out.println ("The screenshot is captured");

	}

}
