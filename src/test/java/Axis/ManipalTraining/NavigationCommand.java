package Axis.ManipalTraining;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommand {
	
	private static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		driver.navigate().forward();
		
		Thread.sleep(500);
		
		driver.navigate().back();
		
		Thread.sleep(500);
		
		driver.navigate().refresh();
		
		Thread.sleep(500);
		

	}

}
