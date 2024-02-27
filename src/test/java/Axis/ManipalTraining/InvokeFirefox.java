package Axis.ManipalTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeFirefox {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.selenium.dev/");

	}

}
