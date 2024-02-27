package SampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactUs {
	
	private static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		
		driver.manage().window().maximize();
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		Thread.sleep(5000);
		
		//first Name
		WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));
		
		ExpectedConditions.visibilityOf(firstName).apply(driver);
		
		firstName.sendKeys("Yashraj");
		//Last Name
		WebElement lastName = driver.findElement(By.xpath("//input[@name='last_name']"));
		
		ExpectedConditions.visibilityOf(lastName).apply(driver);
		
		lastName.sendKeys("Sonawane");
		//Email
		WebElement mail = driver.findElement(By.xpath("//input[@name='email']"));
		
		ExpectedConditions.visibilityOf(mail).apply(driver);
		
		mail.sendKeys("yashraj@gmail.com");
		
		//Message
		WebElement message = driver.findElement(By.xpath("//textarea[@name='message']"));
		
		ExpectedConditions.visibilityOf(message).apply(driver);
		
		message.sendKeys("This is a Test Message");
		
		//Reset Button
		WebElement resetButton = driver.findElement(By.xpath("//input[@type='reset']"));
		ExpectedConditions.visibilityOf(resetButton).apply(driver);
		resetButton.click();
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
		Thread.sleep(5000);
		
		//first Name
		WebElement firstName1 = driver.findElement(By.xpath("//input[@name='first_name']"));
				
		ExpectedConditions.visibilityOf(firstName1).apply(driver);
				
		firstName1.sendKeys("Yashraj1");
		//Last Name
		WebElement lastName1 = driver.findElement(By.xpath("//input[@name='last_name']"));
				
		ExpectedConditions.visibilityOf(lastName1).apply(driver);
				
		lastName1.sendKeys("Sonawane1");
		//Email
		WebElement mail1 = driver.findElement(By.xpath("//input[@name='email']"));
				
		ExpectedConditions.visibilityOf(mail1).apply(driver);
				
		mail1.sendKeys("yashraj@gmail1.com");
				
		//Message
		WebElement message1 = driver.findElement(By.xpath("//textarea[@name='message']"));
				
		ExpectedConditions.visibilityOf(message1).apply(driver);
				
		message1.sendKeys("This is a Test Message1");
		
		//Submit button
		WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
		ExpectedConditions.visibilityOf(submitButton).apply(driver);
        submitButton.click();
		
	}

}
