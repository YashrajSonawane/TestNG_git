package SampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToDo {

	private static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException{
		
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, null);
		
		driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
		
		driver.manage().window().maximize();
		
		WebElement taskInput = driver.findElement(By.cssSelector("input[type='text']"));
        taskInput.sendKeys("New Task");
        driver.findElement(By.cssSelector("input[type='submit']")).click();

  
        WebElement newTask = driver.findElement(By.xpath("//li[contains(text(),'New Task')]"));
        if (newTask.isDisplayed()) {
            System.out.println("Task added successfully!");
        } else {
            System.out.println("Failed to add task.");
            return; // Exit if task addition failed
        }
 
        newTask.click();

        if (!newTask.isDisplayed()) {
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Failed to delete task.");
        }
        
        

	}
}
