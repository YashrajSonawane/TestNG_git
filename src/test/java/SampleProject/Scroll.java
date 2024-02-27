package SampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {
	
	private static ChromeDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Scrolling/index.html");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;

		jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		jsExecutor.executeScript("window.scrollTo(0, 0)");

		 WebElement ele = driver.findElement(By.xpath("//div[contains(text(),Copyright © www.GianniBruno.com)]"));
		 jsExecutor.executeScript("arguments[0].scrollIntoView(true);", ele);

		}
		
		
	
	

}
