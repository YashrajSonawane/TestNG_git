package Axis.ManipalTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeEdge {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		driver = new EdgeDriver();
		
		driver.get("https://www.selenium.dev/");
		
	}

}
