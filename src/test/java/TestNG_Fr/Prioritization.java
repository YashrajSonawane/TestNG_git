package TestNG_Fr;

import org.testng.annotations.Test;

public class Prioritization {

	@Test(priority = 1)
	 public void testcase1() {
		System.out.println("TestCase1 Run");
	 }
	@Test(priority = 2)
	  public void testcase2() {
		System.out.println("TestCase1 Run");
	 }
}
