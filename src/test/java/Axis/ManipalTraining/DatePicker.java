package Axis.ManipalTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	private static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(600);
		
		WebElement date = driver.findElement(By.xpath("//span[contains(text(),'Departure')]"));
		
		Thread.sleep(500);
		
		date.click();
		
		WebElement newdate = driver.findElement(By.xpath("//div[@aria-label='Tue Feb 27 2024']"));
		
		newdate.click();		

	}

}
