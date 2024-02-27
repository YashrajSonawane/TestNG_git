package Axis.ManipalTraining;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommand {

	private static ChromeDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String current = driver.getCurrentUrl();
		System.out.println(current);
		
		String source = driver.getPageSource();
		System.out.println(source);
		
		driver.close();
		

	}

}
