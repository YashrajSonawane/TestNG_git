package SampleProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	private static ChromeDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html?");
		
		driver.manage().window().maximize();
		
		//UserName
		WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
		
		ExpectedConditions.visibilityOf(userName).apply(driver);
		
		userName.sendKeys("yashraj0403");
		
		//Password
		WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
		
		ExpectedConditions.visibilityOf(passWord).apply(driver);
		
		passWord.sendKeys("Yashraj@123");
		
		//LoginButton
		WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
		ExpectedConditions.visibilityOf(Login).apply(driver);
		Login.click();
		
		//Click Alert
		WebElement alterts = driver.findElement(By.xpath("//script[@type='text/javascript'][1]"));
		
		alterts.click();
		
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
		
	}


}
