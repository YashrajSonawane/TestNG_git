package TestNG_Fr;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnableFalse {
	
	@Test(enabled = false)
	  public void testcase4() {
	  String actualTitle = "Axis";
	  String expectedTitle = "Manipal";
	  Assert.assertEquals(actualTitle, expectedTitle);
	 }
	
	@Test
	  public void testcase5() {
	  String actualTitle = "Axis";
	  String expectedTitle = "Manipal";
	  Assert.assertEquals(actualTitle, expectedTitle);
	 }

}
