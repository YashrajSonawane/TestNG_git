package Axis.ManipalTraining;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	private static ChromeDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
			
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement doubleclick=driver.findElement(By.xpath("//input[@id='double-click']"));
		
		Actions builder=new Actions(driver);
		
		Thread.sleep(1000);
		builder.doubleClick(doubleclick).perform();
		
        
		
		Alert alt2= driver.switchTo().alert();
		
		alt2.accept();
		
		builder.contextClick(doubleclick).perform();
		
	}

}
