package Axis.ManipalTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	private static ChromeDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		
		driver.manage().window().maximize();
		
		WebElement RdoB1 = driver.findElement(By.xpath("//input[@name='optradio'])[1]"));
		
		Thread.sleep(500);
		
		if(RdoB1.isDisplayed())
		{
			RdoB1.click();
		}
		
		
		WebElement RdoB2 = driver.findElement(By.xpath("(//input[@name='optradio'])[2]"));
		
		Thread.sleep(500);
		
		if(RdoB2.isSelected())
		{
			RdoB2.click();
		}
		
		
		
		
	}

}
