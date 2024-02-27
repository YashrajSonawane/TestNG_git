package SampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	private static ChromeDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		
		driver.manage().window().maximize();
		
		String filePath = "C:\\Users\\Lenovo\\OneDrive\\Documents\\AI Tools.txt";
		
		WebElement uploadButton = driver.findElement(By.id("myFile"));
        uploadButton.sendKeys(filePath);
        
        WebElement uploadSubmitButton = driver.findElement(By.id("submit-button"));
        uploadSubmitButton.click();
	}
}
