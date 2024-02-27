package Axis.ManipalTraining;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	
	private static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
			
		driver.get("https://the-internet.herokuapp.com/tables");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		// implicit wait will wait for all the elements in the script to load before it could throw 
				//element not found exception

				driver.manage().timeouts().implicitlyWait(20 , TimeUnit.MILLISECONDS);

		// explicit wait is used to wait for a part... by Harsha Khande (Unverified)
	
		// explicit wait is used to wait for a particular element based on the expected condition
				// explicit wait - to wait for the compose button to be click-able
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id = 'table1']/tbody/tr[4]/td[3]")));
		
		List<WebElement> rowno = driver.findElements(By.xpath ("//table (lid='table']/tbody/tr")) ;
		int rowcount = rowno. size () ; 
		System.out.println (rowcount); 
		
		// Find the no of columns 
		List<WebElement> colno = driver.findElements(By.xpath ("//table [Bid='tablel ']/tbody/tr [1]/td")) ;
		int colcount = colno.size (); 
		System.out.println(colcount) ;
		
		// fetch the cell data from the particular cell 
		WebElement celldata = driver.findElement (By.xpath ("//table[id = 'tablel']/tbody/tr[4]/td[3]")); 
		String text = celldata.getText (); 
		System.out.println (text) ; 
		String expectedtext = "tconway@earthlink.net"; 
		if (text.equals (expectedtext))
			{
			 System.out.println ("The celldata is correct");
			}
			else { System.out.println ("The cell data is wrong ");
			}
		

	}

}
