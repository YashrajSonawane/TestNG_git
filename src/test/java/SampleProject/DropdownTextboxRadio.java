package SampleProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTextboxRadio {

	private static ChromeDriver driver;

	public static void main(String[] args){
		
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		driver.manage().window().maximize();
		
		//DropDown
		
		WebElement dropdownElement = driver.findElement(By.id("dropdowm-menu-1"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("C#");
        
        //CheckBoxes
        
        WebElement Checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        Checkbox.click();
        
        //RadioButton
        
        WebElement RdoB = driver.findElement(By.id("radio-buttons"));
		
		if(RdoB.isSelected())
		{
			RdoB.click();
		}
        
 
        
        
		
			
	}
}
