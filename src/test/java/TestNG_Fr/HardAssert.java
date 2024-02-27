package TestNG_Fr;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	 public void testCase1() {
	  System.out.println("Test1 Start");
	  Assert.assertTrue(false);
	  System.out.println("Test1 End");
	 }
	 
	 @Test
	 public void testCase2() {
	  System.out.println("Test2 Start");
	  Assert.assertTrue(true);
	  System.out.println("Test2 End");
	 }
}
