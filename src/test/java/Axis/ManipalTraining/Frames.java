package Axis.ManipalTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	private static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
			
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		 
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		driver.switchTo().frame(frame1);
		WebElement content = driver.findElement(By.id("tinymce"));
		content.clear();
		content.sendKeys("hello world");


	}

}

public class WindowHandling {
	 
	public static void main(String[] args) throws InterruptedException {

 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Harsha Patil\\Documents\\Manipal\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
 
		WebDriver driver = new ChromeDriver();
 
		driver.get("https://demoqa.com/browser-windows");
 
		driver.manage().window().maximize();
		// get the parent window handle
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor)driver;

		  // vertical down scroll (x and y coordinates)

		  js.executeScript("window.scrollBy(0 , 400)", "");
		WebElement tab = driver.findElement(By.cssSelector("#tabButton"));
		tab.click();
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		Iterator<String>  itr = allWindows.iterator();
		while(itr.hasNext()) {
			String childwindow = itr.next();
			if (!parentwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
			WebElement text = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
			String txt = text.getText();
			System.out.println(txt);
		}
			driver.switchTo().window(parentwindow);
		}






 
 
	}
 
}

