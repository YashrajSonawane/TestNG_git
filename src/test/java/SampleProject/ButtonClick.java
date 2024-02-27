package SampleProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonClick {

	private static ChromeDriver driver;

	public static void main(String[] args){
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, null);
		
		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		
		driver.manage().window().maximize();
		
		String[] buttonIds = {"button1", "button2", "button3"};
		
		for (String buttonId : buttonIds) {
			WebElement button = driver.findElement(By.id(buttonId));
			
			button.click();
			
			WebElement cancelButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='close']")));
            cancelButton.click();
		}
		
		
		
		
	}
}