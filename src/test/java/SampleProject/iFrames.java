package SampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrames {

	private static ChromeDriver driver;
	private static WebDriverWait wait;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
			
		driver.get("https://webdriveruniversity.com/IFrame/index.html");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame");
		
		WebElement iframebtn = driver.findElement(By.xpath("//button[@id='button-find-out-more']"));
		
		iframebtn.click();
		
	}
}
