package Axis.ManipalTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	private static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
			
		driver.get("http://www.dummypoint.com/seleniumtemplate.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		 
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
 
		Select sel = new Select(dropdown);
 
		// select by visible text
 
		sel.selectByVisibleText("Option3");
 
		Thread.sleep(500);
 
		// select by value
 
		sel.selectByValue("OptionFive");
 
		// select by indexing
 
		sel.selectByIndex(1);
 

	}
}
