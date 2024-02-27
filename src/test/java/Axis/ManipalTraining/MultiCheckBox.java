package Axis.ManipalTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiCheckBox {
	
	private static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> allCheck = driver.findElements(By.xpath("(//input[@class='cb1-element'])"));
		
		Thread.sleep(500);
		
		for(WebElement wb : allCheck)
		{
			wb.click();
		}

	}

}
