package Axis.ManipalTraining;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	
	private static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		Thread.sleep(600);
		
		//informational Alert
		
		WebElement infoalt = driver.findElement(By.xpath("//input[@name='alert']"));
		
		infoalt.click();
		
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
		
		
		
		
		
		

	}

}
