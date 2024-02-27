package TestNG_Fr;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
	
	SoftAssert obj= new SoftAssert();


	 @Test
	 public void testCase1() {
	  System.out.println("Test1 Start");
	  obj.assertTrue(true);
	  obj.assertEquals("Hi", "Hi");
	  System.out.println("Test1 End");
	  obj.assertAll();

	 }
}
