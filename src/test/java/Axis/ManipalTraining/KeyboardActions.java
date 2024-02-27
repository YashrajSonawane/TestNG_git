package Axis.ManipalTraining;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {
	
	private static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
			
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		Actions builder = new Actions(driver);
		// action class to be used when we need to do  series of actions together.
		org.openqa.selenium.interactions.Action seriesofact = builder.moveToElement(email).click().keyDown(email, Keys.SHIFT).sendKeys(email, "Yashraj").build();
		seriesofact.perform();


	}

}
