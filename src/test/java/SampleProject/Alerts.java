package SampleProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	private static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@id='button1']")).click();
		
		Thread.sleep(500);
		
		driver.switchTo().alert().accept();
		
		System.out.println("Click Done");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//span[@id='button2']")).click();
		
		WebElement btn = driver.findElement(By.xpath("//button[text()='Close']"));
		btn.click();
		
		System.out.println("Click Done");
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//span[@id='button3']")).click();
		Thread.sleep(1000);
		System.out.println("Click Done");
		
		driver.findElement(By.xpath("//span[@id='button4']")).click();
		driver.switchTo().alert().accept();
		System.out.println("Click Done");
		
		
		
		
		
		
		
		
		
	}
}
