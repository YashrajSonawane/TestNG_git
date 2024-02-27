package SampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	private static ChromeDriver driver;
	
	public static void main(String[] args){
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Datepicker/index.html");
		
		driver.manage().window().maximize();
		
		WebElement date = driver.findElement(By.id("datepicker"));
		
		date.click();
		
		WebElement newDate = driver.findElement(By.xpath("//div[@id='datepicker']//div[@data-date-format='03-04-2024']"));
		
		newDate.click();
	}
		
}
